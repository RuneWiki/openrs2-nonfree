package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public class Class512 {

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Lclient!em;")
	static Class153 aClass153_1 = new Class153(128);

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 13)
	Class512() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "()V", line = 18)
	public static void method29588() {
		aClass153_1.method23148();
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "(I)Lclient!amj;", line = 22)
	static Class3_Sub1_Sub6 method29589(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub6 local5 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class474.aClass359_85.method26713(arg0, 0);
		if (local15 == null || local15.length <= 1) {
			return null;
		}
		try {
			local5 = Class403.method27630(local15);
		} catch (@Pc(29) Exception local29) {
			throw new RuntimeException(local29.getMessage() + " " + arg0);
		}
		aClass153_1.method23147(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!us", name = "s", descriptor = "(Lclient!zz;II)Lclient!amj;", line = 37)
	static Class3_Sub1_Sub6 method29587(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt5592 * 88370061 | arg1 << 10;
		@Pc(16) Class3_Sub1_Sub6 local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
		if (local28 == null) {
			local8 = arg0.anInt5592 * 88370061 | arg2 + 65536 << 10;
			local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
			if (local28 == null) {
				local8 = arg0.anInt5592 * 88370061 | 0x3FFFC00;
				local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class403.method27630(local28);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass634_1 = arg0;
					aClass153_1.method23147(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class403.method27630(local28);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass634_1 = arg0;
				aClass153_1.method23147(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class403.method27630(local28);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass634_1 = arg0;
			aClass153_1.method23147(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "(Lclient!zz;II)Lclient!amj;", line = 37)
	static Class3_Sub1_Sub6 method29590(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt5592 * 88370061 | arg1 << 10;
		@Pc(16) Class3_Sub1_Sub6 local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
		if (local28 == null) {
			local8 = arg0.anInt5592 * 88370061 | arg2 + 65536 << 10;
			local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
			if (local28 == null) {
				local8 = arg0.anInt5592 * 88370061 | 0x3FFFC00;
				local16 = (Class3_Sub1_Sub6) aClass153_1.method23146((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class474.aClass359_85.method26705(Class474.aClass359_85.method26718(local8));
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class403.method27630(local28);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass634_1 = arg0;
					aClass153_1.method23147(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class403.method27630(local28);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass634_1 = arg0;
				aClass153_1.method23147(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class403.method27630(local28);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass634_1 = arg0;
			aClass153_1.method23147(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "([B)Lclient!amj;", line = 89)
	static Class3_Sub1_Sub6 method29591(@OriginalArg(0) byte[] arg0) {
		return new Class3_Sub1_Sub6(new Class3_Sub41(arg0), Class548.anInterface9_4);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "([B)Lclient!amj;", line = 89)
	static Class3_Sub1_Sub6 method29592(@OriginalArg(0) byte[] arg0) {
		return new Class3_Sub1_Sub6(new Class3_Sub41(arg0), Class548.anInterface9_4);
	}

	@OriginalMember(owner = "client!us", name = "z", descriptor = "([B)Lclient!amj;", line = 89)
	static Class3_Sub1_Sub6 method29593(@OriginalArg(0) byte[] arg0) {
		return new Class3_Sub1_Sub6(new Class3_Sub41(arg0), Class548.anInterface9_4);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "([B)Lclient!amj;", line = 89)
	static Class3_Sub1_Sub6 method29594(@OriginalArg(0) byte[] arg0) {
		return new Class3_Sub1_Sub6(new Class3_Sub41(arg0), Class548.anInterface9_4);
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "(I)V", line = 133)
	public static void method29595() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) Class528.aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) Class528.aClass581_39.method33231()) {
			Class10.method717(local4.anInt1497 * -352602287);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Lclient!akp;I)I", line = 301)
	static int method29596(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2398 * 2130384603;
		@Pc(8) Class445 local8 = arg0.method16690();
		@Pc(13) int local13 = arg0.aClass71_Sub1_3.method20103();
		if (local13 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local4 = arg0.anInt2396 * 1181218839;
		} else if (local8.anInt4992 * -1713051549 == local13 || local8.anInt4997 * 1647125495 == local13 || local13 == local8.anInt4979 * -1610219699 || local8.anInt4974 * -1291917697 == local13) {
			local4 = arg0.anInt2399 * -1444661245;
		} else if (local8.anInt4967 * 1572273339 == local13 || local13 == local8.anInt4987 * -1259453855 || local13 == local8.anInt4983 * 1145375145 || local13 == local8.anInt4982 * -1520360879) {
			local4 = arg0.anInt2397 * -836187453;
		}
		return local4;
	}
}
