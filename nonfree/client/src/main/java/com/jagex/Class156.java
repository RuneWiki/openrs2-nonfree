package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uy")
public abstract class Class156 {

	@OriginalMember(owner = "client!uy", name = "ut", descriptor = "I")
	static int anInt1664;

	@OriginalMember(owner = "client!uy", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_23 = new Class240(20);

	@OriginalMember(owner = "client!uy", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_47;

	@OriginalMember(owner = "client!uy", name = "<init>", descriptor = "(Lclient!py;)V", line = 93)
	Class156(@OriginalArg(0) Class497 arg0) {
		this.aClass497_47 = arg0;
	}

	@OriginalMember(owner = "client!uy", name = "e", descriptor = "(I)V", line = 98)
	void method14189() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25833();
		}
	}

	@OriginalMember(owner = "client!uy", name = "f", descriptor = "()V", line = 98)
	void method14190() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25833();
		}
	}

	@OriginalMember(owner = "client!uy", name = "k", descriptor = "()V", line = 98)
	void method14192() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25833();
		}
	}

	@OriginalMember(owner = "client!uy", name = "l", descriptor = "(I)V", line = 104)
	void method14188(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!uy", name = "u", descriptor = "(I)V", line = 104)
	void method14193(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!uy", name = "w", descriptor = "(I)V", line = 104)
	void method14194(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!uy", name = "n", descriptor = "(II)V", line = 104)
	void method14195(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!uy", name = "m", descriptor = "(I)V", line = 110)
	void method14191() {
		@Pc(3) Class240 local3 = this.aClass240_23;
		synchronized (this.aClass240_23) {
			this.aClass240_23.method25837();
		}
	}

	@OriginalMember(owner = "client!uy", name = "ey", descriptor = "(I)V", line = 1683)
	public static final void method14198() {
		@Pc(7) String local7 = Class712.aString243 == null ? Class508.method30234() : Class712.aString243;
		Class338.method27468(local7, false, client.aBoolean596);
	}

	@OriginalMember(owner = "client!uy", name = "hz", descriptor = "(Lclient!yf;I)V", line = 6450)
	static final void method14196(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		@Pc(32) boolean local32 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class453.method28965(local11, local14, arg0, local32 ? Class310.aClass310_4 : Class310.aClass310_3);
	}

	@OriginalMember(owner = "client!uy", name = "aet", descriptor = "(Lclient!yf;I)V", line = 10267)
	static final void method14197(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 | 0x1 << local23;
	}
}
