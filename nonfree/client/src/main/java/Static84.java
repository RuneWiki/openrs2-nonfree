import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt1830;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public static int anInt1829 = 2;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
	public static int method1903(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(159) int local159 = (int) (local60 * 256.0D);
		@Pc(164) int local164 = (int) (local67 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(180) int local180 = (int) (local73 * 256.0D);
		if (local180 < 0) {
			local180 = 0;
		} else if (local180 > 255) {
			local180 = 255;
		}
		if (local180 > 243) {
			local164 >>= 0x4;
		} else if (local180 > 217) {
			local164 >>= 0x3;
		} else if (local180 > 192) {
			local164 >>= 0x2;
		} else if (local180 > 179) {
			local164 >>= 0x1;
		}
		return ((local159 >> 2 & 0x3F) << 10) + ((local164 >> 5 << 7) + (local180 >> 1));
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I")
	public static int method1904(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Lclient!r;")
	public static Class2_Sub2 method1905(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub2_Sub36();
		} else if (arg0 == 1) {
			return new Class2_Sub2_Sub7();
		} else if (arg0 == 2) {
			return new Class2_Sub2_Sub23();
		} else if (arg0 == 3) {
			return new Class2_Sub2_Sub24();
		} else if (arg0 == 4) {
			return new Class2_Sub2_Sub1();
		} else if (arg0 == 5) {
			return new Class2_Sub2_Sub20();
		} else if (arg0 == 6) {
			return new Class2_Sub2_Sub2();
		} else if (arg0 == 7) {
			return new Class2_Sub2_Sub13();
		} else if (arg0 == 8) {
			return new Class2_Sub2_Sub35();
		} else if (arg0 == 9) {
			return new Class2_Sub2_Sub5();
		} else if (arg0 == 10) {
			return new Class2_Sub2_Sub16();
		} else if (arg0 == 11) {
			return new Class2_Sub2_Sub14();
		} else if (arg0 == 12) {
			return new Class2_Sub2_Sub38();
		} else if (arg0 == 13) {
			return new Class2_Sub2_Sub10();
		} else if (arg0 == 14) {
			return new Class2_Sub2_Sub19();
		} else if (arg0 == 15) {
			return new Class2_Sub2_Sub29();
		} else if (arg0 == 16) {
			return new Class2_Sub2_Sub21();
		} else if (arg0 == 17) {
			return new Class2_Sub2_Sub9();
		} else if (arg0 == 18) {
			return new Class2_Sub2_Sub33_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub2_Sub6();
		} else if (arg0 == 20) {
			return new Class2_Sub2_Sub37();
		} else if (arg0 == 21) {
			return new Class2_Sub2_Sub25();
		} else if (arg0 == 22) {
			return new Class2_Sub2_Sub18();
		} else if (arg0 == 23) {
			return new Class2_Sub2_Sub34();
		} else if (arg0 == 24) {
			return new Class2_Sub2_Sub26();
		} else if (arg0 == 25) {
			return new Class2_Sub2_Sub27();
		} else if (arg0 == 26) {
			return new Class2_Sub2_Sub17();
		} else if (arg0 == 27) {
			return new Class2_Sub2_Sub31();
		} else if (arg0 == 28) {
			return new Class2_Sub2_Sub12();
		} else if (arg0 == 29) {
			return new Class2_Sub2_Sub3();
		} else if (arg0 == 30) {
			return new Class2_Sub2_Sub22();
		} else if (arg0 == 31) {
			return new Class2_Sub2_Sub11();
		} else if (arg0 == 32) {
			return new Class2_Sub2_Sub4();
		} else if (arg0 == 33) {
			return new Class2_Sub2_Sub32();
		} else if (arg0 == 34) {
			return new Class2_Sub2_Sub28();
		} else if (arg0 == 35) {
			return new Class2_Sub2_Sub8();
		} else if (arg0 == 36) {
			return new Class2_Sub2_Sub30();
		} else if (arg0 == 37) {
			return new Class2_Sub2_Sub15();
		} else if (arg0 == 38) {
			return new Class2_Sub2_Sub39();
		} else if (arg0 == 39) {
			return new Class2_Sub2_Sub33();
		} else {
			return null;
		}
	}
}
