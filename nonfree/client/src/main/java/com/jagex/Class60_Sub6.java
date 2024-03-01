package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahr")
public class Class60_Sub6 extends Class60 {

	@OriginalMember(owner = "client!ahr", name = "x", descriptor = "I")
	public static final int anInt1495 = 1;

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "I")
	public static final int anInt1496 = 0;

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub6(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "(B)V", line = 20)
	public void method12964() {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.anInt2079 * -1373670555 != 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "o", descriptor = "()V", line = 20)
	public void method12967() {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.anInt2079 * -1373670555 != 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!ahr", name = "t", descriptor = "(B)Z", line = 29)
	public boolean method12965() {
		return this.aClass3_Sub45_36.method13002() == Class543.aClass543_4;
	}

	@OriginalMember(owner = "client!ahr", name = "i", descriptor = "()Z", line = 29)
	public boolean method12968() {
		return this.aClass3_Sub45_36.method13002() == Class543.aClass543_4;
	}

	@OriginalMember(owner = "client!ahr", name = "a", descriptor = "(IB)I", line = 34)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() == Class543.aClass543_4) {
			return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "c", descriptor = "(I)I", line = 34)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() == Class543.aClass543_4) {
			return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() == Class543.aClass543_4) {
			return arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "n", descriptor = "(I)V", line = 42)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahr", name = "j", descriptor = "(I)V", line = 42)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "(IB)V", line = 42)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "(B)I", line = 46)
	public int method12966() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahr", name = "j", descriptor = "(Lclient!amj;ILclient!vs;I)V", line = 324)
	static void method12969(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 = 0;
		arg2.anInt5315 = 0;
		arg2.anInt5318 = 836839043;
		arg2.aClass3_Sub1_Sub6_2 = arg0;
		arg2.aClass385Array2 = arg2.aClass3_Sub1_Sub6_2.aClass385Array1;
		arg2.anIntArray497 = arg2.aClass3_Sub1_Sub6_2.anIntArray260;
		@Pc(23) Class385 local23 = null;
		arg2.anInt5317 = 0;
		arg2.aMap15.clear();
		arg2.aMap15.put(Class43.aClass43_68, Class424.aClass165_1.aClass460_1);
		arg2.aMap15.put(Class43.aClass43_60, Class302.aClass10_Sub1_1);
		arg2.aMap15.put(Class43.aClass43_64, Class13_Sub21.aClass10_1);
		if (arg2.aClass245_4 != null) {
			arg2.aMap15.put(Class43.aClass43_59, Class456.method28484(arg2.aClass245_4));
		}
		if (arg2.aClass26_Sub1_Sub1_Sub1_4 instanceof Class26_Sub1_Sub1_Sub1_Sub1) {
			arg2.aMap15.put(Class43.aClass43_62, arg2.aClass26_Sub1_Sub1_Sub1_4.anInterface6_3);
		}
		if (arg2.aClass26_Sub1_Sub1_Sub1_4 instanceof Class26_Sub1_Sub1_Sub1_Sub2) {
			arg2.aMap16.put(Class43.aClass43_68, arg2.aClass26_Sub1_Sub1_Sub1_4.anInterface6_3);
		}
		try {
			Class525.anInt5300 = 0;
			while (true) {
				Class525.anInt5300 += -937232777;
				if (Class525.anInt5300 * -1623735481 > arg1) {
					throw new RuntimeException("");
				}
				local23 = arg2.aClass385Array2[(arg2.anInt5318 += -836839043) * -2140198955];
				if (Class525.aBoolean821 && (Class525.aString233 == null || arg2.aClass3_Sub1_Sub6_2.aString107 != null && arg2.aClass3_Sub1_Sub6_2.aString107.indexOf(Class525.aString233) != -1)) {
					System.out.println(arg2.aClass3_Sub1_Sub6_2.aString107 + ": " + local23);
				}
				if (arg2.anIntArray497[arg2.anInt5318 * -2140198955] == 1) {
					arg2.aBoolean822 = true;
				} else {
					arg2.aBoolean822 = false;
				}
				if (local23 == Class385.aClass385_184 && arg2.anInt5317 * 434769019 == 0) {
					return;
				}
				Class496.method29333(local23, arg2);
			}
		} catch (@Pc(177) Exception local177) {
			@Pc(182) StringBuilder local182 = new StringBuilder(30);
			local182.append("").append(arg2.aClass3_Sub1_Sub6_2.aLong296 * -1930649055099428229L).append(" ");
			for (@Pc(201) int local201 = arg2.anInt5317 * 434769019 - 1; local201 >= 0; local201--) {
				local182.append("").append(arg2.aClass509Array1[local201].aClass3_Sub1_Sub6_1.aLong296 * -1930649055099428229L).append(" ");
			}
			local182.append("").append(local23.anInt4719 * -143903049);
			Class27_Sub1.method7214(local182.toString(), local177);
		} finally {
			Class3_Sub32.method11730();
		}
	}
}
