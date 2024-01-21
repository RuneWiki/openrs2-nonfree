import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "J")
	public static long aLong69;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!we;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1397 = Static15.method178("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1395 = aClass23_1397;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt2480 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1396 = Static15.method178("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public static int anInt2486 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1398 = Static15.method178("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public static int anInt2487 = 0;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1399 = Static15.method178("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1400 = Static15.method178("@gr1@");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nd;IBLclient!w;)V")
	public static void method1606(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class55_Sub1 arg2) {
		@Pc(13) byte[] local13 = null;
		@Pc(15) Class45 local15 = Static48.aClass45_4;
		synchronized (Static48.aClass45_4) {
			for (@Pc(22) Class1_Sub7 local22 = (Class1_Sub7) Static48.aClass45_4.method1299(); local22 != null; local22 = (Class1_Sub7) Static48.aClass45_4.method1288()) {
				if (local22.aLong85 == (long) arg1 && arg0 == local22.aClass41_1 && local22.anInt1483 == 0) {
					local13 = local22.aByteArray8;
					break;
				}
			}
		}
		if (local13 == null) {
			@Pc(75) byte[] local75 = arg0.method1257(arg1);
			arg2.method1897(local75, arg0, arg1, true);
		} else {
			arg2.method1897(local13, arg0, arg1, true);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)I")
	public static int method1607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static5.method70(arg1 + 45365, arg0 + 91923, 4) + (Static5.method70(arg1 + 10294, arg0 - -37821, 2) + -128 >> 1) + (Static5.method70(arg1, arg0, 1) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1608() {
		aClass23_1396 = null;
		aClass23_1395 = null;
		aClass23_1398 = null;
		aClass23_1400 = null;
		aClass23_1399 = null;
		aClass68_4 = null;
		aCRC32_1 = null;
		aClass23_1397 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!ee;)V")
	public static void method1609(@OriginalArg(1) Class1_Sub1_Sub7 arg0) {
		@Pc(8) int local8 = arg0.anInt839;
		@Pc(82) int local82;
		if (local8 >= 1 && local8 <= 100 || local8 >= 701 && local8 <= 800) {
			if (local8 == 1 && Static115.anInt2954 == 0) {
				arg0.anInt799 = 0;
				arg0.aClass23_461 = Static8.aClass23_152;
			} else if (local8 == 1 && Static115.anInt2954 == 1) {
				arg0.aClass23_461 = Static45.aClass23_817;
				arg0.anInt799 = 0;
			} else if (local8 == 2 && Static115.anInt2954 != 2) {
				arg0.anInt799 = 0;
				arg0.aClass23_461 = Static56.aClass23_935;
			} else {
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				local82 = Static8.anInt186;
				if (Static115.anInt2954 != 2) {
					local82 = 0;
				}
				if (local8 >= local82) {
					arg0.anInt799 = 0;
					arg0.aClass23_461 = Static104.aClass23_1523;
				} else {
					arg0.aClass23_461 = Static8.aClass23Array4[local8];
					arg0.anInt799 = 1;
				}
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			local82 = Static8.anInt186;
			if (Static115.anInt2954 != 2) {
				local82 = 0;
			}
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			if (local82 <= local8) {
				arg0.aClass23_461 = Static104.aClass23_1523;
				arg0.anInt799 = 0;
			} else {
				if (Static63.anIntArray223[local8] == 0) {
					arg0.aClass23_461 = Static17.method233(new Class23[] { Static21.aClass23_388, Static89.aClass23_1342 });
				} else if (Static63.anIntArray223[local8] >= 5000) {
					if (Static63.anIntArray223[local8] == Static1.anInt68) {
						arg0.aClass23_461 = Static17.method233(new Class23[] { Static55.aClass23_928, Static77.aClass23_1221, Static19.method274(Static63.anIntArray223[local8] - 5000) });
					} else {
						arg0.aClass23_461 = Static17.method233(new Class23[] { Static19.aClass23_311, Static77.aClass23_1221, Static19.method274(Static63.anIntArray223[local8] - 5000) });
					}
				} else if (Static1.anInt68 == Static63.anIntArray223[local8]) {
					arg0.aClass23_461 = Static17.method233(new Class23[] { Static55.aClass23_928, Static58.aClass23_1682, Static19.method274(Static63.anIntArray223[local8]) });
				} else {
					arg0.aClass23_461 = Static17.method233(new Class23[] { Static19.aClass23_311, Static58.aClass23_1682, Static19.method274(Static63.anIntArray223[local8]) });
				}
				arg0.anInt799 = 1;
			}
		} else if (local8 == 203) {
			local82 = Static8.anInt186;
			if (Static115.anInt2954 != 2) {
				local82 = 0;
			}
			arg0.anInt807 = local82 * 15 + 20;
			if (arg0.anInt807 <= arg0.anInt817) {
				arg0.anInt807 = arg0.anInt817 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static115.anInt2954 == 0) {
				arg0.aClass23_461 = Static12.aClass23_1370;
				arg0.anInt799 = 0;
			} else if (local8 == 1 && Static115.anInt2954 == 0) {
				arg0.anInt799 = 0;
				arg0.aClass23_461 = Static56.aClass23_935;
			} else {
				local82 = Static35.anInt1118;
				if (Static115.anInt2954 == 0) {
					local82 = 0;
				}
				if (local82 <= local8) {
					arg0.aClass23_461 = Static104.aClass23_1523;
					arg0.anInt799 = 0;
				} else {
					arg0.aClass23_461 = Static54.method1049(Static58.aLongArray37[local8]).method514();
					arg0.anInt799 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt807 = Static35.anInt1118 * 15 + 20;
			if (arg0.anInt807 <= arg0.anInt817) {
				arg0.anInt807 = arg0.anInt817 + 1;
			}
		} else if (local8 == 324) {
			if (Static61.anInt1888 == -1) {
				Static61.anInt1888 = arg0.anInt812;
				Static35.anInt1105 = arg0.anInt808;
			}
			if (Static26.aClass58_1.aBoolean119) {
				arg0.anInt812 = Static61.anInt1888;
			} else {
				arg0.anInt812 = Static35.anInt1105;
			}
		} else if (local8 == 325) {
			if (Static61.anInt1888 == -1) {
				Static35.anInt1105 = arg0.anInt808;
				Static61.anInt1888 = arg0.anInt812;
			}
			if (Static26.aClass58_1.aBoolean119) {
				arg0.anInt812 = Static35.anInt1105;
			} else {
				arg0.anInt812 = Static61.anInt1888;
			}
		} else if (local8 == 327) {
			arg0.anInt801 = 150;
			arg0.anInt792 = (int) (Math.sin((double) Static7.anInt176 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt824 = 0;
			arg0.anInt793 = 5;
		} else if (local8 == 328) {
			arg0.anInt801 = 150;
			arg0.anInt792 = (int) (Math.sin((double) Static7.anInt176 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt793 = 5;
			arg0.anInt824 = 1;
		} else if (local8 == 600) {
			arg0.aClass23_461 = Static17.method233(new Class23[] { Static104.aClass23_1520, Static106.aClass23_1550 });
		} else if (local8 == 620) {
			if (Static90.anInt2422 < 1) {
				arg0.aClass23_461 = Static104.aClass23_1523;
			} else if (Static32.aBoolean58) {
				arg0.aClass23_461 = Static20.aClass23_378;
				arg0.anInt798 = 16711680;
			} else {
				arg0.aClass23_461 = Static104.aClass23_1532;
				arg0.anInt798 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBIII)V")
	public static void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static77.method1346(arg1)) {
			Static18.method254(Static105.aClass1_Sub1_Sub7ArrayArray1[arg1], 0, -1, arg4, arg5, 0, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method1611(@OriginalArg(1) boolean arg0) {
		if (Static13.aClass68_1 == null) {
			return;
		}
		try {
			@Pc(15) Class1_Sub5 local15 = new Class1_Sub5(4);
			local15.method674(arg0 ? 2 : 3);
			local15.method680(0);
			Static13.aClass68_1.method1942(local15.aByteArray6, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				Static13.aClass68_1.method1935();
			} catch (@Pc(43) Exception local43) {
			}
			Static13.aClass68_1 = null;
			Static95.anInt2504++;
		}
	}
}
