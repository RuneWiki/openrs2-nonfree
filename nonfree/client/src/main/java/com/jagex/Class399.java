package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class Class399 {

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	static final int anInt4674 = 16;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_9 = new Class399(4, 0, 3, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_2 = new Class399(11, 1, 3, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_10 = new Class399(2, 2, 4, Class226.aClass226_22);

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_3 = new Class399(7, 3, 1, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_1 = new Class399(5, 4, 2, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_4 = new Class399(3, 5, 3, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!lj;")
	public static final Class399 aClass399_5 = new Class399(9, 6, 4, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "Lclient!lj;")
	static final Class399 aClass399_6 = new Class399(10, 7, 4, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "Lclient!lj;")
	static final Class399 aClass399_7 = new Class399(1, 8, 4, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "Lclient!lj;")
	static final Class399 aClass399_8 = new Class399(0, 9, 4, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!lj;")
	static final Class399 aClass399_11 = new Class399(8, 10, 3, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!lj;")
	static final Class399 aClass399_12 = new Class399(6, 11, 3, Class226.aClass226_19);

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	static final int anInt4673 = Class548.method31014(16);

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	public final int anInt4675;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
	final int anInt4677;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	final int anInt4678;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "Lclient!dg;")
	final Class226 aClass226_28;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public final int anInt4676;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIILclient!dg;)V", line = 28)
	Class399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class226 arg3) {
		this.anInt4675 = arg0;
		this.anInt4677 = arg1;
		this.anInt4678 = arg2;
		this.aClass226_28 = arg3;
		this.anInt4676 = this.anInt4678 * this.aClass226_28.anInt3646 * -1066472467;
		if (this.anInt4677 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Lclient!lj;", line = 38)
	static Class399 method28494(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass399_9;
			case 1:
				return aClass399_2;
			case 2:
				return aClass399_10;
			case 3:
				return aClass399_3;
			case 4:
				return aClass399_1;
			case 5:
				return aClass399_4;
			case 6:
				return aClass399_5;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)Lclient!lj;", line = 38)
	static Class399 method28495(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass399_9;
			case 1:
				return aClass399_2;
			case 2:
				return aClass399_10;
			case 3:
				return aClass399_3;
			case 4:
				return aClass399_1;
			case 5:
				return aClass399_4;
			case 6:
				return aClass399_5;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)Lclient!lj;", line = 38)
	static Class399 method28496(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass399_9;
			case 1:
				return aClass399_2;
			case 2:
				return aClass399_10;
			case 3:
				return aClass399_3;
			case 4:
				return aClass399_1;
			case 5:
				return aClass399_4;
			case 6:
				return aClass399_5;
			default:
				return null;
		}
	}
}
