package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public class Class605 implements Interface75 {

	@OriginalMember(owner = "client!vu", name = "tl", descriptor = "I")
	public static int anInt5562;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!vu;")
	static final Class605 aClass605_1 = new Class605(0);

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!vu;")
	static final Class605 aClass605_3 = new Class605(1);

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "Lclient!vu;")
	static final Class605 aClass605_2 = new Class605(2);

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
	final int anInt5561;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V", line = 17)
	Class605(@OriginalArg(0) int arg0) {
		this.anInt5561 = arg0 * -231322099;
	}

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt5561 * 981577925;
	}

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt5561 * 981577925;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt5561 * 981577925;
	}

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "(I)Lclient!ako;", line = 80)
	static Class39_Sub1 method32076() {
		@Pc(3) Class39_Sub1 local3 = new Class39_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class293.aString184.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (Class155.aBoolean513) {
			local3.method14297(16);
			local5 = false;
		}
		if (Class155.aBoolean514) {
			local3.method14297(32);
			local7 = false;
		}
		if (Class155.aBoolean515) {
			local3.method14297(16384);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class131_Sub4.method13110(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 3);
				Class667.method33150();
				local61 = Class38.method667(3, 1000);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 3) {
					local3.method14297(4);
					@Pc(91) Class208 local91 = Class284.aClass86_9.method20046();
					@Pc(98) long local98 = local91.aLong244 * -1920893184504226295L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3588 * 1866206313) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method14297(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method14297(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method14297(4096);
			}
		}
		if (local9) {
			try {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 5);
				Class667.method33150();
				local63 = Class38.method667(5, 1000);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 5) {
					local3.method14297(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method14297(32768);
			}
		}
		if (local5) {
			try {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 4);
				Class667.method33150();
				local59 = Class38.method667(1, 1000);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 1) {
					local3.method14297(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method14297(2048);
			}
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class131_Sub4.method13110(local3);
			return local3;
		}
		local3.method14303(3, local61);
		local3.method14303(1, local59);
		local3.method14303(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class275.method26562(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class275.method26562(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!vu", name = "mv", descriptor = "(I)Z", line = 12282)
	static boolean method32077() {
		client.anInt3435 += -1982766353;
		client.aBoolean603 = true;
		return true;
	}
}
