package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public class Class367 {

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	static final int anInt4543 = 1;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	static final int anInt4544 = 5;

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
	static final int anInt4545 = 2;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
	static final int anInt4546 = 4;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
	static final int anInt4547 = 3;

	@OriginalMember(owner = "client!kv", name = "gn", descriptor = "Lclient!nd;")
	public static Class415 aClass415_1;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	static int anInt4548;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "J")
	long aLong263;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "J")
	long aLong262 = 1978959866441963323L;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "Lclient!zm;")
	Class695 aClass695_51 = new Class695();

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!akv;)V", line = 17)
	public Class367(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method28143(arg0);
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "(Lclient!akv;)V", line = 22)
	void method28141(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong263 = arg0.method22510() * 1459222115322203709L;
		this.aLong262 = arg0.method22510() * -1978959866441963323L;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(27) Class77_Sub3 local27;
			if (local17 == 1) {
				local27 = new Class77_Sub3_Sub4(this);
			} else if (local17 == 4) {
				local27 = new Class77_Sub3_Sub2(this);
			} else if (local17 == 3) {
				local27 = new Class77_Sub3_Sub3(this);
			} else if (local17 == 2) {
				local27 = new Class77_Sub3_Sub5(this);
			} else if (local17 == 5) {
				local27 = new Class77_Sub3_Sub1(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method21806(arg0);
			this.aClass695_51.method36383(local27);
		}
	}

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "(Lclient!akv;)V", line = 22)
	void method28142(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong263 = arg0.method22510() * 1459222115322203709L;
		this.aLong262 = arg0.method22510() * -1978959866441963323L;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(27) Class77_Sub3 local27;
			if (local17 == 1) {
				local27 = new Class77_Sub3_Sub4(this);
			} else if (local17 == 4) {
				local27 = new Class77_Sub3_Sub2(this);
			} else if (local17 == 3) {
				local27 = new Class77_Sub3_Sub3(this);
			} else if (local17 == 2) {
				local27 = new Class77_Sub3_Sub5(this);
			} else if (local17 == 5) {
				local27 = new Class77_Sub3_Sub1(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method21806(arg0);
			this.aClass695_51.method36383(local27);
		}
	}

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "(Lclient!akv;I)V", line = 22)
	void method28143(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong263 = arg0.method22510() * 1459222115322203709L;
		this.aLong262 = arg0.method22510() * -1978959866441963323L;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(27) Class77_Sub3 local27;
			if (local17 == 1) {
				local27 = new Class77_Sub3_Sub4(this);
			} else if (local17 == 4) {
				local27 = new Class77_Sub3_Sub2(this);
			} else if (local17 == 3) {
				local27 = new Class77_Sub3_Sub3(this);
			} else if (local17 == 2) {
				local27 = new Class77_Sub3_Sub5(this);
			} else if (local17 == 5) {
				local27 = new Class77_Sub3_Sub1(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method21806(arg0);
			this.aClass695_51.method36383(local27);
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(Lclient!ajy;I)V", line = 40)
	public void method28144(@OriginalArg(0) Class77_Sub25 arg0) {
		if (arg0.aLong229 * 8258869577519436579L != this.aLong263 * -2812197886301046507L || arg0.aLong83 * -1463586551359373421L != this.aLong262 * 2592347801994286605L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class77_Sub3 local30 = (Class77_Sub3) this.aClass695_51.method36395(); local30 != null; local30 = (Class77_Sub3) this.aClass695_51.method36406()) {
			local30.method21805(arg0);
		}
		arg0.aLong83 += 2175811687201928859L;
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(Lclient!akv;B)V", line = 124)
	static void method28145(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			switch(local3) {
				case 0:
					Class230.anInt3758 = arg0.method22483() * -118291573;
					Class230.anInt3757 = arg0.method22483() * 156456701;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "(B)V", line = 219)
	static void method28146() {
		Class542.anIntArray484 = Class96_Sub2.method7091(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!kv", name = "et", descriptor = "(Lclient!yf;B)V", line = 5319)
	static final void method28147(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class355.method27963(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "ey", descriptor = "(Lclient!yf;B)V", line = 5365)
	static final void method28148(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class21.method419(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "ib", descriptor = "(Lclient!yf;B)V", line = 5961)
	static final void method28149(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(18) boolean local18 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] == 1;
		@Pc(28) int local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(32) Class277 local32 = Class155.method23628(local28);
		@Pc(38) Class273 local38 = Class35_Sub11.aClass273Array1[local28 >> 16];
		Class294.method27029(local32, local38, arg0, local18 ? Class283.aClass283_2 : Class283.aClass283_3);
	}

	@OriginalMember(owner = "client!kv", name = "lv", descriptor = "(Lclient!yf;I)V", line = 6619)
	static final void method28150(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class659.method33072(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "nj", descriptor = "(II)V", line = 12460)
	public static void method28151(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = client.aList3.indexOf(arg0);
		if (local4 == -1) {
			client.aList3.add(arg0);
		}
	}
}
