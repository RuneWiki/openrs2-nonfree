package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public class Class387 implements Interface75 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!ks;")
	static final Class387 aClass387_12 = new Class387(14, 1);

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "Lclient!ks;")
	static final Class387 aClass387_5 = new Class387(7, 2);

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!ks;")
	static final Class387 aClass387_15 = new Class387(3, 3);

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "Lclient!ks;")
	static final Class387 aClass387_3 = new Class387(8, 4);

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!ks;")
	static final Class387 aClass387_2 = new Class387(11, 5);

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "Lclient!ks;")
	static final Class387 aClass387_9 = new Class387(1, 6);

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!ks;")
	static final Class387 aClass387_6 = new Class387(5, 7);

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "Lclient!ks;")
	static final Class387 aClass387_7 = new Class387(13, 8);

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!ks;")
	static final Class387 aClass387_8 = new Class387(2, 9);

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "Lclient!ks;")
	static final Class387 aClass387_1 = new Class387(4, 10);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!ks;")
	static final Class387 aClass387_13 = new Class387(12, 11);

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!ks;")
	static final Class387 aClass387_11 = new Class387(6, 12);

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Lclient!ks;")
	static final Class387 aClass387_10 = new Class387(9, 13);

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Lclient!ks;")
	static final Class387 aClass387_4 = new Class387(10, 14);

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!ks;")
	static final Class387 aClass387_14 = new Class387(0, 15);

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	final int anInt4650;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	final int anInt4649;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(II)V", line = 30)
	Class387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4650 = arg0 * -800606999;
		this.anInt4649 = arg1 * -738597137;
	}

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "()I", line = 36)
	@Override
	public int method36920() {
		return this.anInt4649 * -1390671857;
	}

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "()I", line = 36)
	@Override
	public int method36919() {
		return this.anInt4649 * -1390671857;
	}

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "(Lclient!ep;Lclient!ao;B)I", line = 259)
	static int method28244(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface11 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18262(); local3++) {
			@Pc(14) Class347 local14 = (Class347) arg1.method18261(local3);
			if (local14.method27584(arg0)) {
				local1 += local14.anInt4194 * 1554294991;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ks", name = "ad", descriptor = "(S)V", line = 486)
	static void method28242() {
		Class625.aTwitchWebcamDeviceArray1 = Class166_Sub13.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!ks", name = "ij", descriptor = "(I)V", line = 5535)
	static final void method28245() {
		for (@Pc(4) Class93_Sub1_Sub6 local4 = (Class93_Sub1_Sub6) client.aClass22_46.method445(); local4 != null; local4 = (Class93_Sub1_Sub6) client.aClass22_46.method415()) {
			@Pc(10) Class132_Sub1_Sub1_Sub4 local10 = local4.aClass132_Sub1_Sub1_Sub4_1;
			if (client.anInt3485 > local10.anInt3260 * -887925359) {
				local4.method23969();
				local10.method23916();
			} else if (client.anInt3485 >= local10.anInt3259 * 1157227495) {
				local10.method23917();
				@Pc(131) Class472 local131;
				if (local10.anInt3263 * -1986528751 > 0) {
					if (client.anInt3463 * 1819062465 == 0) {
						@Pc(52) Class132_Sub1_Sub1_Sub1 local52 = Class249.aClass239Array1[local10.anInt3263 * -1986528751 - 1].method25807();
						if (local52 != null) {
							@Pc(58) Class472 local58 = local52.method24229().aClass472_61;
							if ((int) local58.aFloat317 >= 0 && (int) local58.aFloat317 < client.aClass532_1.method30444() * 512 && (int) local58.aFloat319 >= 0 && (int) local58.aFloat319 < client.aClass532_1.method30474() * 512) {
								local10.method23913((int) local58.aFloat317, (int) local58.aFloat319, Class305.method26801((int) local58.aFloat317, (int) local58.aFloat319, local52.aByte100) - local10.anInt3258 * 1286439089, client.anInt3485);
							}
						}
					} else {
						@Pc(121) Class93_Sub15 local121 = (Class93_Sub15) client.aClass16_18.method215((long) (local10.anInt3263 * -1986528751 - 1));
						if (local121 != null) {
							@Pc(127) Class132_Sub1_Sub1_Sub1_Sub1 local127 = (Class132_Sub1_Sub1_Sub1_Sub1) local121.anObject5;
							local131 = local127.method24229().aClass472_61;
							if ((int) local131.aFloat317 >= 0 && (int) local131.aFloat317 < client.aClass532_1.method30444() * 512 && (int) local131.aFloat319 >= 0 && (int) local131.aFloat319 < client.aClass532_1.method30474() * 512) {
								local10.method23913((int) local131.aFloat317, (int) local131.aFloat319, Class305.method26801((int) local131.aFloat317, (int) local131.aFloat319, local10.aByte100) - local10.anInt3258 * 1286439089, client.anInt3485);
							}
						}
					}
				}
				if (local10.anInt3263 * -1986528751 < 0) {
					@Pc(195) int local195 = -(local10.anInt3263 * -1986528751) - 1;
					@Pc(202) Class132_Sub1_Sub1_Sub1_Sub2 local202;
					if (local195 == client.anInt3513 * -859840571) {
						local202 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local202 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local195];
					}
					if (local202 != null) {
						local131 = local202.method24229().aClass472_61;
						if ((int) local131.aFloat317 >= 0 && (int) local131.aFloat317 < client.aClass532_1.method30444() * 512 && (int) local131.aFloat319 >= 0 && (int) local131.aFloat319 < client.aClass532_1.method30474() * 512) {
							local10.method23913((int) local131.aFloat317, (int) local131.aFloat319, Class305.method26801((int) local131.aFloat317, (int) local131.aFloat319, local10.aByte100) - local10.anInt3258 * 1286439089, client.anInt3485);
						}
					}
				}
				local10.method23920(client.anInt3480 * 1820654295);
				client.aClass532_1.method30459().method31497(local10, true);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "awr", descriptor = "(Lclient!yf;B)V", line = 13608)
	static final void method28243(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (Class41.method815(local12) / 60000L);
	}
}
