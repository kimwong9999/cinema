package com.qa.cinema.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.cinema.domain.Actor;
import com.qa.cinema.service.ActorService;

@RunWith(MockitoJUnitRunner.class)
public class ActorTest 
{
	@BeforeAll
	static void testStart() {
		System.out.println("Starting test suite!");
	}

	@Test
	public void test01() 
	{
	    Actor mockedActor = mock(Actor.class);
	    when(mockedActor.getId()).thenReturn(1);
	    assertEquals(mockedActor.getId(), 1);
	}
	
	@Test
	public void test02(ActorService service) 
	{
		assertEquals(service.list(), 22);
	}
	
	@Test
	public void test03(ActorService service) 
	{
		Optional<Actor> actor = service.view(1);
		assertEquals(actor.get().getSname(), "Wayne");
	}
	
	@AfterAll
	static void testEnd() {
		System.out.println("All done!");
	}
}
