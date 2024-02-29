package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public abstract class Class146 {

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
	int anInt2100;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!er;")
	final Class232 aClass232_34 = new Class232(500);

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_35 = new Class232(30);

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Lclient!er;")
	final Class232 aClass232_36 = new Class232(50);

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "[Lclient!dz;")
	Class216[] aClass216Array2 = new Class216[4];

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "Lclient!aai;")
	Class10 aClass10_2 = new Class10(null, null);

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
	boolean aBoolean356;

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray19;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(ZLclient!yi;Lclient!ym;)V", line = 728)
	Class146(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class670 arg2) {
		this.aBoolean356 = arg0;
		if (arg2 == Class670.aClass670_5) {
			this.aStringArray19 = new String[] { null, null, null, null, null, Class44.aClass44_129.method713(arg1) };
		} else {
			this.aStringArray19 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "(ZB)V", line = 735)
	void method15252(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean356 != arg0) {
			this.aBoolean356 = arg0;
			this.method15260();
		}
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(Z)V", line = 735)
	void method15253(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean356 != arg0) {
			this.aBoolean356 = arg0;
			this.method15260();
		}
	}

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "(Z)V", line = 735)
	void method15254(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean356 != arg0) {
			this.aBoolean356 = arg0;
			this.method15260();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 741)
	void method15255(@OriginalArg(0) int arg0) {
		this.anInt2100 = arg0 * -1042593501;
		@Pc(8) Class232 local8 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local8 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local8 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V", line = 741)
	void method15256(@OriginalArg(0) int arg0) {
		this.anInt2100 = arg0 * -1042593501;
		@Pc(8) Class232 local8 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local8 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local8 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
	}

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "(I)V", line = 741)
	void method15257(@OriginalArg(0) int arg0) {
		this.anInt2100 = arg0 * -1042593501;
		@Pc(8) Class232 local8 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local8 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local8 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
	}

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "()V", line = 754)
	void method15258() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
		this.aClass216Array2 = new Class216[4];
		this.aClass10_2 = new Class10(null, null);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "()V", line = 754)
	void method15259() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
		this.aClass216Array2 = new Class216[4];
		this.aClass10_2 = new Class10(null, null);
	}

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "(B)V", line = 754)
	void method15260() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25850();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25850();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25850();
		}
		this.aClass216Array2 = new Class216[4];
		this.aClass10_2 = new Class10(null, null);
	}

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "(IB)V", line = 768)
	void method15261(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25847(arg0);
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25847(arg0);
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)V", line = 768)
	void method15262(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25847(arg0);
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25847(arg0);
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "aj", descriptor = "(I)V", line = 768)
	void method15263(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25847(arg0);
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25847(arg0);
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "(I)V", line = 780)
	void method15264() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "ai", descriptor = "()V", line = 780)
	void method15265() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "ag", descriptor = "()V", line = 780)
	void method15266() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "al", descriptor = "()V", line = 780)
	void method15267() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "ao", descriptor = "()V", line = 780)
	void method15268() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "ak", descriptor = "()V", line = 780)
	void method15269() {
		@Pc(3) Class232 local3 = this.aClass232_34;
		synchronized (this.aClass232_34) {
			this.aClass232_34.method25857();
		}
		local3 = this.aClass232_35;
		synchronized (this.aClass232_35) {
			this.aClass232_35.method25857();
		}
		local3 = this.aClass232_36;
		synchronized (this.aClass232_36) {
			this.aClass232_36.method25857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "gk", descriptor = "(I)V", line = 2852)
	static final void method15270() {
		if (client.anInt3481 * 828996383 > 1) {
			client.anInt3481 -= 1961509087;
			client.anInt3506 = client.anInt3413 * 1022906699;
		}
		if (client.aClass82_2.aBoolean52) {
			client.aClass82_2.aBoolean52 = false;
			Class520.method30572();
			return;
		}
		if (!Class683.aBoolean861) {
			Class704.method36562();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Class101.method20887(client.aClass82_2); local27++) {
		}
		if (client.anInt3390 * -1850530127 != 16) {
			return;
		}
		@Pc(63) int local63;
		@Pc(52) Class77_Sub20 local52;
		while (Class253.method26188()) {
			local52 = Class365.method28132(Class414.aClass414_24, client.aClass82_2.aClass16_1);
			local52.aClass77_Sub39_Sub1_2.method22403(0);
			local63 = local52.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			Class162.method24337(local52.aClass77_Sub39_Sub1_2);
			local52.aClass77_Sub39_Sub1_2.method22463(local52.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local63);
			client.aClass82_2.method2004(local52);
		}
		@Pc(130) int local130;
		if (Class39.aClass639_3 == null) {
			if (Class280.method26667() >= Class265.aLong250 * 4786918271021927519L) {
				Class39.aClass639_3 = client.aClass646_1.method32830(Class680.aClass25_8.aString5);
			}
		} else if (Class39.aClass639_3.anInt5718 * -685874327 != -1) {
			local52 = Class365.method28132(Class414.aClass414_92, client.aClass82_2.aClass16_1);
			if (Class250.aGarbageCollectorMXBean1 == null || !Class250.aGarbageCollectorMXBean1.isValid()) {
				try {
					@Pc(106) Iterator local106 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (local106.hasNext()) {
						@Pc(113) GarbageCollectorMXBean local113 = (GarbageCollectorMXBean) local106.next();
						if (local113.isValid()) {
							Class250.aGarbageCollectorMXBean1 = local113;
							client.aLong243 = 6107917562769597983L;
							client.aLong241 = -3354138972766353955L;
						}
					}
				} catch (@Pc(125) Throwable local125) {
				}
			}
			@Pc(128) long local128 = Class280.method26667();
			local130 = -1;
			if (Class250.aGarbageCollectorMXBean1 != null) {
				@Pc(136) long local136 = Class250.aGarbageCollectorMXBean1.getCollectionTime();
				if (client.aLong241 * 4770708281855264139L != -1L) {
					@Pc(148) long local148 = local136 - client.aLong241 * 4770708281855264139L;
					@Pc(154) long local154 = local128 - client.aLong243 * 6944980406262721057L;
					if (local154 != 0L) {
						local130 = (int) (local148 * 100L / local154);
					}
				}
				client.aLong241 = local136 * 3354138972766353955L;
				client.aLong243 = local128 * -6107917562769597983L;
			}
			local52.aClass77_Sub39_Sub1_2.method22408(Class39.aClass639_3.anInt5718 * -685874327);
			local52.aClass77_Sub39_Sub1_2.method22403(client.anInt3362 * 1720947399);
			local52.aClass77_Sub39_Sub1_2.method22587(local130);
			client.aClass82_2.method2004(local52);
			Class39.aClass639_3 = null;
			Class265.aLong250 = (local128 + 30000L) * -5729686803417231457L;
		}
		Class115.method21202();
		Class128.method11789();
		@Pc(228) Class77_Sub42 local228 = (Class77_Sub42) client.aClass695_44.method36395();
		if (client.aClass517_1.method30435() != null) {
			if (Class11.anInt36 * -891094135 == 4) {
				Class493.method30045();
			} else if (Class11.anInt36 * -891094135 == 1) {
				Class61.method902();
			}
		}
		if (client.aBoolean611) {
			client.aBoolean611 = false;
		} else {
			client.aFloat250 /= 2.0F;
		}
		if (client.aBoolean609) {
			client.aBoolean609 = false;
		} else {
			client.aFloat248 /= 2.0F;
		}
		@Pc(287) int local287;
		if (Class272.method26527()) {
			Class322.method27466();
		} else if (Class11.anInt36 * -891094135 == 3) {
			@Pc(280) Class595 local280 = client.aClass517_1.method30409();
			local287 = local280.anInt5504 * -424199969 << 9;
			local130 = local280.anInt5506 * -1166289421 << 9;
			if (Class3.aLong1 * -6411718903421479171L <= 0L) {
				Class3.aLong1 = Class280.method26667() * 3164301961959929429L;
			}
			@Pc(313) float local313 = (float) (Class280.method26667() - Class3.aLong1 * -6411718903421479171L);
			@Pc(318) int local318 = 1000 / Class475.method29690();
			@Pc(324) int local324 = (int) ((double) local318 * 1.25D);
			while (local313 > 0.0F) {
				@Pc(333) float local333 = Math.min(local313, (float) local324);
				Class597.aClass107_Sub1_2.method8778(local333 / 1000.0F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local287, local130);
				local313 -= local324;
			}
			Class3.aLong1 = Class280.method26667() * 3164301961959929429L;
		}
		Class95.method7037();
		if (client.anInt3390 * -1850530127 != 16) {
			return;
		}
		client.aClass517_1.method30443().method32244(client.aClass517_1);
		Class492.method30037();
		if (client.anInt3398 * -26534341 > 10) {
			client.aClass82_2.anInt323 += -1366296397;
		}
		if (client.aClass82_2.anInt323 * -645171589 > 2250) {
			Class520.method30572();
			return;
		}
		if (client.anInt3443 * -1468443459 == 1) {
			Class570.method31462();
			Class529.method30719();
		} else if (Class96_Sub16.aClass625_1.anInterface64_1.method32034(local228, client.anInterface62Array2, client.anInt3468 * -2064179505, Class662.aClass141_1)) {
			Class161.method24332(false);
		} else {
			if (client.anInt3443 * -1468443459 == 2 && Class236.method25911(client.anInt3381 * -1450626137)) {
				client.aClass517_1.method30488(new Class516(Class505.aClass505_1, null));
				client.anInt3443 = 0;
			}
			if (client.anInt3443 * -1468443459 == 0 && client.anInt3390 * -1850530127 != 3) {
				Class230.aClass12_24.method188();
				client.anInt3443 = -431303745;
				client.anInt3417 = client.anInt3414 * -1319341991;
				client.anInt3455 = 0;
				client.aBoolean607 = false;
				Class337.method27689();
			}
			if (client.anInt3443 * -1468443459 == 3) {
				local63 = client.anInt3414 - client.anInt3417 * -331622423;
				if (client.anInt3455 * -84392281 < Class695.aClass96Array1.length) {
					do {
						@Pc(489) Class96 local489 = Class695.aClass96Array1[client.anInt3455 * -84392281];
						if (local489.anInt2766 * -514943895 > local63) {
							break;
						}
						local489.method19911();
					} while (client.anInt3443 * -1468443459 == 3 && (client.anInt3455 += -2120417001) * -84392281 < Class695.aClass96Array1.length);
				}
				if (client.anInt3443 * -1468443459 == 3) {
					for (local287 = 0; local287 < Class589.aClass222Array1.length; local287++) {
						@Pc(531) Class222 local531 = Class589.aClass222Array1[local287];
						if (local531.aBoolean643) {
							@Pc(539) Class104_Sub1_Sub1_Sub1 local539 = local531.method25755();
							Class314.method27366(local539, true);
						}
					}
				}
			}
		}
		Class55.method832();
		Class570.method31463();
		Class662.method33099();
		Class50.method755(false);
		Class326.method27532(Class284.aClass86_9, Class147.aClass209_7);
		client.anInt3418 += -1605310983;
		if (client.anInt3500 * -1370432497 != 0) {
			client.anInt3461 += -1641068;
			if (client.anInt3461 * 2143149601 >= 400) {
				client.anInt3500 = 0;
			}
		}
		if (Class266.aClass277_9 != null) {
			client.anInt3408 += 1850677971;
			if (client.anInt3408 * 602951003 >= 15) {
				Class461.method29531(Class266.aClass277_9);
				Class266.aClass277_9 = null;
			}
		}
		client.aClass277_7 = null;
		client.aBoolean623 = false;
		client.aBoolean604 = false;
		Class267.aClass277_10 = null;
		Class242.method26020(null, -1, -1);
		if (!client.aBoolean619) {
			client.anInt3472 = 411567433;
		}
		Class57.method863();
		client.anInt3413 += 1608039949;
		@Pc(625) Class77_Sub20 local625;
		if (client.aBoolean625) {
			local625 = Class365.method28132(Class414.aClass414_67, client.aClass82_2.aClass16_1);
			local625.aClass77_Sub39_Sub1_2.method22638(Class665.anInt5787 * -68858417 << 28 | Class514.anInt5109 * -1653134817 << 14 | Class593.anInt5503 * -63531439);
			client.aClass82_2.method2004(local625);
			client.aBoolean625 = false;
		}
		while (true) {
			@Pc(655) Class77_Sub41 local655;
			@Pc(661) Class277 local661;
			@Pc(673) Class277 local673;
			do {
				local655 = (Class77_Sub41) client.aClass695_46.method36388();
				if (local655 == null) {
					while (true) {
						do {
							local655 = (Class77_Sub41) client.aClass695_47.method36388();
							if (local655 == null) {
								while (true) {
									do {
										local655 = (Class77_Sub41) client.aClass695_48.method36388();
										if (local655 == null) {
											if (Class267.aClass277_10 == null) {
												client.anInt3493 = 0;
											}
											if (client.aClass277_4 != null) {
												Class160.method24328();
											}
											Class186.method24628();
											if (client.anInt3466 * 365872613 > 0 && Class662.aClass141_1.method14784(82) && Class662.aClass141_1.method14784(81) && client.anInt3465 * -1756158727 != 0) {
												local63 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 - client.anInt3465 * -1756158727;
												if (local63 < 0) {
													local63 = 0;
												} else if (local63 > 3) {
													local63 = 3;
												}
												@Pc(857) Class595 local857 = client.aClass517_1.method30409();
												Class77_Sub1_Sub2.method1498(local63, local857.anInt5504 * -424199969 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0], local857.anInt5506 * -1166289421 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0]);
											}
											for (local63 = 0; local63 < 5; local63++) {
												@Pc(887) int local887 = client.anIntArray319[local63]++;
											}
											if (Class56.aClass93_Sub1_1.aBoolean149 && Class56.aClass93_Sub1_1.aLong26 * 6499740373556870249L < Class280.method26667() - 60000L) {
												Class567.method31382();
											}
											Class56.aClass93_Sub1_1.method6437();
											for (@Pc(915) Class131_Sub3 local915 = (Class131_Sub3) client.aClass703_8.method36536(); local915 != null; local915 = (Class131_Sub3) client.aClass703_8.method36537()) {
												if ((long) (local915.anInt1435 * 110810603) < Class280.method26667() / 1000L - 5L) {
													if (local915.aShort100 > 0) {
														Class302.method27128(5, 0, "", "", "", local915.aString45 + Class44.aClass44_125.method713(Class128.aClass667_3), null);
													}
													if (local915.aShort100 == 0) {
														Class302.method27128(5, 0, "", "", "", local915.aString45 + Class44.aClass44_126.method713(Class128.aClass667_3), null);
													}
													local915.method23056();
												}
											}
											client.anInt3428 += 4693499;
											if (client.anInt3428 * -1172380365 > 504) {
												client.anInt3428 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3391 += client.anInt3423 * -756382189;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3424 += client.anInt3517 * 1549362745;
												}
												if ((local63 & 0x4) == 4) {
													client.anInt3426 += client.anInt3427 * 1571117379;
												}
											}
											if (client.anInt3391 * 268721155 < -50) {
												client.anInt3423 = 1636519954;
											}
											if (client.anInt3391 * 268721155 > 56) {
												client.anInt3423 = -1636519954;
											}
											if (client.anInt3424 * 674672233 < -60) {
												client.anInt3517 = -2061995710;
											}
											if (client.anInt3424 * 674672233 > 55) {
												client.anInt3517 = 2061995710;
											}
											if (client.anInt3426 * -61292849 < -41) {
												client.anInt3427 = 705495205;
											}
											if (client.anInt3426 * -61292849 > 41) {
												client.anInt3427 = -705495205;
											}
											client.anInt3431 += 1326257767;
											if (client.anInt3431 * -1881430697 > 500) {
												client.anInt3431 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3462 += client.anInt3520 * -1997571067;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3380 += client.anInt3430 * 511380917;
												}
											}
											if (client.anInt3462 * -2045337339 < -65) {
												client.anInt3520 = 1694266962;
											}
											if (client.anInt3462 * -2045337339 > 68) {
												client.anInt3520 = -1694266962;
											}
											if (client.anInt3380 * -2002513841 < -22) {
												client.anInt3430 = 1517969747;
											}
											if (client.anInt3380 * -2002513841 > 12) {
												client.anInt3430 = -1517969747;
											}
											client.aClass82_2.anInt322 += -286235183;
											if (client.aClass82_2.anInt322 * -351399119 > 50) {
												local625 = Class365.method28132(Class414.aClass414_124, client.aClass82_2.aClass16_1);
												client.aClass82_2.method2004(local625);
											}
											if (client.aBoolean603) {
												Class627.method32540();
												client.aBoolean603 = false;
											}
											try {
												client.aClass82_2.method2000();
											} catch (@Pc(1176) IOException local1176) {
												Class520.method30572();
											}
											return;
										}
										local661 = local655.aClass277_2;
										if (local661.anInt3927 * 1365669833 < 0) {
											break;
										}
										local673 = Class155.method23628(local661.anInt3876 * -742015869);
									} while (local673 == null || local673.aClass277Array3 == null || local661.anInt3927 * 1365669833 >= local673.aClass277Array3.length || local661 != local673.aClass277Array3[local661.anInt3927 * 1365669833]);
									Class72.method1019(local655);
								}
							}
							local661 = local655.aClass277_2;
							if (local661.anInt3927 * 1365669833 < 0) {
								break;
							}
							local673 = Class155.method23628(local661.anInt3876 * -742015869);
						} while (local673 == null || local673.aClass277Array3 == null || local661.anInt3927 * 1365669833 >= local673.aClass277Array3.length || local673.aClass277Array3[local661.anInt3927 * 1365669833] != local661);
						Class72.method1019(local655);
					}
				}
				local661 = local655.aClass277_2;
				if (local661.anInt3927 * 1365669833 < 0) {
					break;
				}
				local673 = Class155.method23628(local661.anInt3876 * -742015869);
			} while (local673 == null || local673.aClass277Array3 == null || local661.anInt3927 * 1365669833 >= local673.aClass277Array3.length || local673.aClass277Array3[local661.anInt3927 * 1365669833] != local661);
			Class72.method1019(local655);
		}
	}

	@OriginalMember(owner = "client!vl", name = "kb", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6509)
	static final void method15271(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3878 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 1984743031;
	}

	@OriginalMember(owner = "client!vl", name = "apg", descriptor = "(Lclient!yf;I)V", line = 12248)
	static final void method15272(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		Class667.method33150();
		Class632.method32649();
		Class209.method25586();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "(I)[B")
	abstract byte[] method15273(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "(II)[B")
	abstract byte[] method15274(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "(II)Z")
	abstract boolean method15275(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "(I)[B")
	abstract byte[] method15276(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "(I)Z")
	abstract boolean method15277(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)Z")
	abstract boolean method15278(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "(I)[B")
	abstract byte[] method15279(@OriginalArg(0) int arg0);
}
