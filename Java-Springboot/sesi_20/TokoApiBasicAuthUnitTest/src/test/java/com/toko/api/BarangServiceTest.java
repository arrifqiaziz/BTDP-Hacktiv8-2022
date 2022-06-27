package com.toko.api;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.toko.api.model.Barang;
import com.toko.api.repository.BarangRepository;
import com.toko.api.service.BarangService;
import com.toko.api.service.impl.BarangServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import static org.mockito.Mockito.times;


@RunWith(SpringRunner.class)
public class BarangServiceTest {

	@InjectMocks
	private BarangService barangService = new BarangServiceImpl();

	@Mock
	private BarangRepository barangRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(barangService, "barangRepository", barangRepository);
	}

	@Test
	public void testFindAll() {

		final List<Barang> datas = TestObjectFactory.createBarangList(10);
		Mockito.when(barangRepository.findAll()).thenReturn(datas);

		final List<Barang> actual = barangService.findAllBarang();
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));
	}

	@Test
	public void testBarangById() throws Exception {

		final int id = new Random().nextInt();
		final Barang barang = TestObjectFactory.createBarang();
		Mockito.when(barangRepository.findById(id)).thenReturn(Optional.of(barang));

		final Barang actual = barangService.findByIdBarang(id);
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(barang.getId()));
		MatcherAssert.assertThat(actual.getNamaBarang(), Matchers.equalTo(barang.getNamaBarang()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(barang.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(barang.getHargaJual()));
	}

	@Test
	public void testProductByIdWithNullDataFromDB() throws Exception {
		final int id = new Random().nextInt();

		Mockito.when(barangRepository.findById(id)).thenReturn(Optional.empty());
		final Barang actual = barangService.findByIdBarang(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateProduct() {
		final Barang barang = TestObjectFactory.createBarang();
		Mockito.when(barangRepository.save(barang)).thenReturn(barang);

		final Barang actual = barangService.saveBarang(barang);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteProduct() {
		final int id = new Random().nextInt();
		Barang barang = TestObjectFactory.createBarang();

		Mockito.when(barangRepository.findById(id)).thenReturn(Optional.of(barang));
		Mockito.doNothing().when(barangRepository).delete(barang);
		barangService.deleteBarang(id);

		Mockito.verify(barangRepository, times(1)).delete(barang);
	}
}