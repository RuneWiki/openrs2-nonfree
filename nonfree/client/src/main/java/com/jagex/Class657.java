package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xy")
public class Class657 {

	@OriginalMember(owner = "client!xy", name = "c", descriptor = "Lclient!dj;")
	static Class94 aClass94_13;

	@OriginalMember(owner = "client!xy", name = "cb", descriptor = "I")
	static int anInt5768;

	@OriginalMember(owner = "client!xy", name = "p", descriptor = "Lclient!em;")
	static Class229 aClass229_1 = new Class229(128);

	@OriginalMember(owner = "client!xy", name = "<init>", descriptor = "()V", line = 13)
	Class657() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xy", name = "y", descriptor = "(I)Lclient!arb;", line = 22)
	static Class77_Sub1_Sub9 method33041(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub9 local5 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class322.aClass478_95.method29725(arg0, 0);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class305.method27240(local16);
		} catch (@Pc(31) Exception local31) {
			throw new RuntimeException(local31.getMessage() + " " + arg0);
		}
		aClass229_1.method25815(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "(I)Lclient!arb;", line = 22)
	static Class77_Sub1_Sub9 method33042(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub9 local5 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class322.aClass478_95.method29725(arg0, 0);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class305.method27240(local16);
		} catch (@Pc(31) Exception local31) {
			throw new RuntimeException(local31.getMessage() + " " + arg0);
		}
		aClass229_1.method25815(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(I)Lclient!arb;", line = 22)
	static Class77_Sub1_Sub9 method33043(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub9 local5 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class322.aClass478_95.method29725(arg0, 0);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class305.method27240(local16);
		} catch (@Pc(31) Exception local31) {
			throw new RuntimeException(local31.getMessage() + " " + arg0);
		}
		aClass229_1.method25815(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!xy", name = "x", descriptor = "(Lclient!uq;II)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method33044(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!xy", name = "d", descriptor = "(Lclient!uq;II)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method33045(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!xy", name = "s", descriptor = "(Lclient!uq;II)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method33046(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!xy", name = "r", descriptor = "(Lclient!uq;II)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method33047(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!xy", name = "q", descriptor = "(Lclient!uq;II)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method33048(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!xy", name = "w", descriptor = "(IB)Lclient!mh;", line = 53)
	public static Class399 method33049(@OriginalArg(0) int arg0) {
		return Class637.aClass117_6 == null ? null : Class637.aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xy", name = "g", descriptor = "([B)Lclient!arb;", line = 89)
	static Class77_Sub1_Sub9 method33050(@OriginalArg(0) byte[] arg0) {
		return new Class77_Sub1_Sub9(new Class77_Sub39(arg0), Class310.anInterface17_4);
	}

	@OriginalMember(owner = "client!xy", name = "z", descriptor = "([B)Lclient!arb;", line = 89)
	static Class77_Sub1_Sub9 method33051(@OriginalArg(0) byte[] arg0) {
		return new Class77_Sub1_Sub9(new Class77_Sub39(arg0), Class310.anInterface17_4);
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(IZB)I", line = 94)
	public static int method33052(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class77_Sub7 local8 = Class112.method9473(arg0, arg1);
		if (local8 == null) {
			return ((Class77_Sub1_Sub2) Class248.aClass35_Sub19_1.method18319(arg0)).anInt267 * 1857484701;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local8.anIntArray192.length; local24++) {
			if (local8.anIntArray192[local24] == -1) {
				local22++;
			}
		}
		return local22 + (((Class77_Sub1_Sub2) Class248.aClass35_Sub19_1.method18319(arg0)).anInt267 * 1857484701 - local8.anIntArray192.length);
	}

	@OriginalMember(owner = "client!xy", name = "ar", descriptor = "(III)Z", line = 1039)
	public static boolean method33053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Class683.aBoolean861) {
			return false;
		}
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Class35_Sub11.aClass273Array1[local7] == null || Class35_Sub11.aClass273Array1[local7].aClass277Array2[local11] == null) {
			return false;
		}
		@Pc(33) Class277 local33 = Class35_Sub11.aClass273Array1[local7].aClass277Array2[local11];
		@Pc(47) Class77_Sub1_Sub7 local47;
		if (arg1 == -1 && local33.anInt3857 * -1960530827 == 0) {
			for (local47 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local47 != null; local47 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				if (local47.anInt2987 * -1986934021 == 58 || local47.anInt2987 * -1986934021 == 1007 || local47.anInt2987 * -1986934021 == 25 || local47.anInt2987 * -1986934021 == 57 || local47.anInt2987 * -1986934021 == 30) {
					for (@Pc(148) Class277 local148 = Class155.method23628(local47.anInt2986 * -1180225371); local148 != null; local148 = Class578.method31654(Class35_Sub11.aClass273Array1[local148.anInt3863 * -1278450723 >> 16], local148)) {
						if (local33.anInt3863 * -1278450723 == local148.anInt3863 * -1278450723) {
							return true;
						}
					}
				}
			}
		} else {
			for (local47 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local47 != null; local47 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				if (arg1 == local47.anInt2985 * 980750511 && local47.anInt2986 * -1180225371 == local33.anInt3863 * -1278450723 && (local47.anInt2987 * -1986934021 == 58 || local47.anInt2987 * -1986934021 == 1007 || local47.anInt2987 * -1986934021 == 25 || local47.anInt2987 * -1986934021 == 57 || local47.anInt2987 * -1986934021 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!xy", name = "oe", descriptor = "(Lclient!yf;I)V", line = 7107)
	static final void method33054(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class110_Sub1.method9165(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xy", name = "td", descriptor = "(Lclient!yf;I)V", line = 8013)
	static final void method33055(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.method25376(local16).method13649();
	}

	@OriginalMember(owner = "client!xy", name = "tm", descriptor = "(Lclient!yf;B)V", line = 8028)
	static final void method33056(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		if (local16.aString179 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.aString179;
		}
	}

	@OriginalMember(owner = "client!xy", name = "kz", descriptor = "([Lclient!gm;Lclient!gm;ZI)V", line = 10853)
	static void method33057(@OriginalArg(0) Class277[] arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) int local14 = arg1.anInt3881 * 1500908359 == 0 ? arg1.anInt3874 * -881188269 : arg1.anInt3881 * 1500908359;
		@Pc(29) int local29 = arg1.anInt3882 * -166726847 == 0 ? arg1.anInt3875 * -1279656873 : arg1.anInt3882 * -166726847;
		Class54_Sub1.method17801(arg0, arg1.anInt3863 * -1278450723, local14, local29, arg2);
		if (arg1.aClass277Array4 != null) {
			Class54_Sub1.method17801(arg1.aClass277Array4, arg1.anInt3863 * -1278450723, local14, local29, arg2);
		}
		@Pc(63) Class77_Sub38 local63 = (Class77_Sub38) client.aClass12_20.method173((long) (arg1.anInt3863 * -1278450723));
		if (local63 != null) {
			Class520.method30574(local63.anInt3113 * 1225863589, local14, local29, arg2);
		}
		if (client.aClass277_6 != arg1) {
			return;
		}
		@Pc(81) int local81 = Class152.anInt2399 * -1843550713;
		@Pc(83) int[] local83 = Class152.anIntArray221;
		@Pc(85) int local85;
		for (local85 = 0; local85 < local81; local85++) {
			@Pc(94) Class104_Sub1_Sub1_Sub1_Sub2 local94 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local83[local85]];
			if (local94 != null) {
				local94.method21129(local14, local29, arg2);
			}
		}
		for (local85 = 0; local85 < client.anInt3527 * -1125820437; local85++) {
			@Pc(115) int local115 = client.anIntArray317[local85];
			@Pc(121) Class77_Sub6 local121 = (Class77_Sub6) client.aClass12_22.method173((long) local115);
			if (local121 != null) {
				((Class104_Sub1_Sub1_Sub1) local121.anObject5).method21129(local14, local29, arg2);
			}
		}
	}
}
