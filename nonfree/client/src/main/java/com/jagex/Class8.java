package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aag")
public class Class8 {

	@OriginalMember(owner = "client!aag", name = "c", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!aag", name = "w", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!aag", name = "d", descriptor = "J")
	public static long aLong2;

	@OriginalMember(owner = "client!aag", name = "t", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!aag", name = "p", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_4;

	@OriginalMember(owner = "client!aag", name = "v", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!aag", name = "x", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aag", name = "r", descriptor = "[Lclient!alh;")
	static Class145_Sub1[] aClass145_Sub1Array1 = new Class145_Sub1[0];

	@OriginalMember(owner = "client!aag", name = "g", descriptor = "I")
	static int anInt29 = 2084950114;

	@OriginalMember(owner = "client!aag", name = "z", descriptor = "I")
	static int anInt28 = 0;

	@OriginalMember(owner = "client!aag", name = "j", descriptor = "Lclient!xc;")
	static Class639 aClass639_1 = null;

	@OriginalMember(owner = "client!aag", name = "i", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aag", name = "<init>", descriptor = "()V", line = 31)
	Class8() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aag", name = "g", descriptor = "()V", line = 36)
	public static void method69() {
		if (!aBoolean4) {
			return;
		}
		if (anInt28 * 2045011039 < Class616.anInt5593 * 206492647) {
			anInt28 = Class616.anInt5593 * 1816624505;
		}
		while (true) {
			while (anInt28 * 2045011039 < Class616.anInt5594 * -1664594981) {
				@Pc(27) Class145_Sub1 local27 = Class527.method30680(anInt28 * 2045011039);
				if (local27 != null && local27.anInt2066 * -663639827 == -1) {
					if (aClass639_1 == null) {
						aClass639_1 = client.aClass646_1.method32830(local27.aString60);
					}
					@Pc(55) int local55 = aClass639_1.anInt5718 * -685874327;
					if (local55 == -1) {
						return;
					}
					local27.anInt2066 = local55 * 307950821;
					anInt28 += 1148385183;
					aClass639_1 = null;
				} else {
					anInt28 += 1148385183;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aag", name = "z", descriptor = "()V", line = 36)
	public static void method70() {
		if (!aBoolean4) {
			return;
		}
		if (anInt28 * 2045011039 < Class616.anInt5593 * 206492647) {
			anInt28 = Class616.anInt5593 * 1816624505;
		}
		while (true) {
			while (anInt28 * 2045011039 < Class616.anInt5594 * -1664594981) {
				@Pc(27) Class145_Sub1 local27 = Class527.method30680(anInt28 * 2045011039);
				if (local27 != null && local27.anInt2066 * -663639827 == -1) {
					if (aClass639_1 == null) {
						aClass639_1 = client.aClass646_1.method32830(local27.aString60);
					}
					@Pc(55) int local55 = aClass639_1.anInt5718 * -685874327;
					if (local55 == -1) {
						return;
					}
					local27.anInt2066 = local55 * 307950821;
					anInt28 += 1148385183;
					aClass639_1 = null;
				} else {
					anInt28 += 1148385183;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aag", name = "i", descriptor = "(ILjava/lang/String;II)Z", line = 55)
	public static boolean method71(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class680.aClass25_8 = new Class25();
		Class680.aClass25_8.anInt122 = arg0 * 1619197921;
		Class680.aClass25_8.aString5 = arg1;
		Class680.aClass25_8.anInt120 = arg2 * 1852523987;
		Class680.aClass25_8.anInt121 = arg3 * -102059163;
		return true;
	}

	@OriginalMember(owner = "client!aag", name = "j", descriptor = "(ILjava/lang/String;II)Z", line = 55)
	public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class680.aClass25_8 = new Class25();
		Class680.aClass25_8.anInt122 = arg0 * 1619197921;
		Class680.aClass25_8.aString5 = arg1;
		Class680.aClass25_8.anInt120 = arg2 * 1852523987;
		Class680.aClass25_8.anInt121 = arg3 * -102059163;
		return true;
	}

	@OriginalMember(owner = "client!aag", name = "k", descriptor = "(Ljava/lang/String;I)V", line = 64)
	public static void method73(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass25_4 == null) {
			aClass25_4 = new Class25();
		}
		aClass25_4.aString5 = arg0;
		aClass25_4.anInt122 = (arg1 + 1099) * 1619197921;
		aClass25_4.anInt120 = Class13.method205(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * 1852523987;
		aClass25_4.anInt121 = Class493.method30043(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * -102059163;
	}

	@OriginalMember(owner = "client!aag", name = "u", descriptor = "(Ljava/lang/String;I)V", line = 64)
	public static void method74(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass25_4 == null) {
			aClass25_4 = new Class25();
		}
		aClass25_4.aString5 = arg0;
		aClass25_4.anInt122 = (arg1 + 1099) * 1619197921;
		aClass25_4.anInt120 = Class13.method205(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * 1852523987;
		aClass25_4.anInt121 = Class493.method30043(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * -102059163;
	}

	@OriginalMember(owner = "client!aag", name = "e", descriptor = "(Ljava/lang/String;I)V", line = 64)
	public static void method75(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (aClass25_4 == null) {
			aClass25_4 = new Class25();
		}
		aClass25_4.aString5 = arg0;
		aClass25_4.anInt122 = (arg1 + 1099) * 1619197921;
		aClass25_4.anInt120 = Class13.method205(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * 1852523987;
		aClass25_4.anInt121 = Class493.method30043(client.aClass661_1, Class664.aClass664_2, aClass25_4.anInt122 * -1664252895) * -102059163;
	}

	@OriginalMember(owner = "client!aag", name = "b", descriptor = "()V", line = 72)
	public static void method76() {
		if (aClass25_2.anInt122 * -1664252895 != -1) {
			Class101_Sub1_Sub1.method20899(aClass25_2.anInt122 * -1664252895, aClass25_2.aString5, aClass25_2.anInt120 * 606493275, aClass25_2.anInt121 * 1001670253);
		}
	}

	@OriginalMember(owner = "client!aag", name = "o", descriptor = "()V", line = 72)
	public static void method77() {
		if (aClass25_2.anInt122 * -1664252895 != -1) {
			Class101_Sub1_Sub1.method20899(aClass25_2.anInt122 * -1664252895, aClass25_2.aString5, aClass25_2.anInt120 * 606493275, aClass25_2.anInt121 * 1001670253);
		}
	}

	@OriginalMember(owner = "client!aag", name = "f", descriptor = "()V", line = 72)
	public static void method78() {
		if (aClass25_2.anInt122 * -1664252895 != -1) {
			Class101_Sub1_Sub1.method20899(aClass25_2.anInt122 * -1664252895, aClass25_2.aString5, aClass25_2.anInt120 * 606493275, aClass25_2.anInt121 * 1001670253);
		}
	}

	@OriginalMember(owner = "client!aag", name = "n", descriptor = "(Z[B)V", line = 76)
	public static void method79(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class77_Sub8.aClass77_Sub39_9 == null) {
			Class77_Sub8.aClass77_Sub39_9 = new Class77_Sub39(20000);
		}
		Class77_Sub8.aClass77_Sub39_9.method22452(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class7.method66(Class77_Sub8.aClass77_Sub39_9.aByteArray53);
		aClass145_Sub1Array1 = new Class145_Sub1[Class544.anInt5212 * 1699576543];
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = Class616.anInt5593 * 206492647; local31 <= Class616.anInt5594 * -1664594981; local31++) {
			@Pc(40) Class145_Sub1 local40 = Class527.method30680(local31);
			if (local40 != null) {
				aClass145_Sub1Array1[local27++] = local40;
			}
		}
		aBoolean3 = false;
		aLong2 = Class280.method26667() * -7774518681047063557L;
		Class77_Sub8.aClass77_Sub39_9 = null;
	}

	@OriginalMember(owner = "client!aag", name = "m", descriptor = "(Z[B)V", line = 76)
	public static void method80(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class77_Sub8.aClass77_Sub39_9 == null) {
			Class77_Sub8.aClass77_Sub39_9 = new Class77_Sub39(20000);
		}
		Class77_Sub8.aClass77_Sub39_9.method22452(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class7.method66(Class77_Sub8.aClass77_Sub39_9.aByteArray53);
		aClass145_Sub1Array1 = new Class145_Sub1[Class544.anInt5212 * 1699576543];
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = Class616.anInt5593 * 206492647; local31 <= Class616.anInt5594 * -1664594981; local31++) {
			@Pc(40) Class145_Sub1 local40 = Class527.method30680(local31);
			if (local40 != null) {
				aClass145_Sub1Array1[local27++] = local40;
			}
		}
		aBoolean3 = false;
		aLong2 = Class280.method26667() * -7774518681047063557L;
		Class77_Sub8.aClass77_Sub39_9 = null;
	}

	@OriginalMember(owner = "client!aag", name = "h", descriptor = "(Z[B)V", line = 76)
	public static void method81(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class77_Sub8.aClass77_Sub39_9 == null) {
			Class77_Sub8.aClass77_Sub39_9 = new Class77_Sub39(20000);
		}
		Class77_Sub8.aClass77_Sub39_9.method22452(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class7.method66(Class77_Sub8.aClass77_Sub39_9.aByteArray53);
		aClass145_Sub1Array1 = new Class145_Sub1[Class544.anInt5212 * 1699576543];
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = Class616.anInt5593 * 206492647; local31 <= Class616.anInt5594 * -1664594981; local31++) {
			@Pc(40) Class145_Sub1 local40 = Class527.method30680(local31);
			if (local40 != null) {
				aClass145_Sub1Array1[local27++] = local40;
			}
		}
		aBoolean3 = false;
		aLong2 = Class280.method26667() * -7774518681047063557L;
		Class77_Sub8.aClass77_Sub39_9 = null;
	}

	@OriginalMember(owner = "client!aag", name = "a", descriptor = "(Z[B)V", line = 76)
	public static void method82(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class77_Sub8.aClass77_Sub39_9 == null) {
			Class77_Sub8.aClass77_Sub39_9 = new Class77_Sub39(20000);
		}
		Class77_Sub8.aClass77_Sub39_9.method22452(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class7.method66(Class77_Sub8.aClass77_Sub39_9.aByteArray53);
		aClass145_Sub1Array1 = new Class145_Sub1[Class544.anInt5212 * 1699576543];
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = Class616.anInt5593 * 206492647; local31 <= Class616.anInt5594 * -1664594981; local31++) {
			@Pc(40) Class145_Sub1 local40 = Class527.method30680(local31);
			if (local40 != null) {
				aClass145_Sub1Array1[local27++] = local40;
			}
		}
		aBoolean3 = false;
		aLong2 = Class280.method26667() * -7774518681047063557L;
		Class77_Sub8.aClass77_Sub39_9 = null;
	}

	@OriginalMember(owner = "client!aag", name = "aj", descriptor = "()Lclient!alh;", line = 95)
	public static Class145_Sub1 method83() {
		anInt29 = 0;
		return Class504.method24848();
	}

	@OriginalMember(owner = "client!aag", name = "ai", descriptor = "()Lclient!alh;", line = 95)
	public static Class145_Sub1 method84() {
		anInt29 = 0;
		return Class504.method24848();
	}

	@OriginalMember(owner = "client!aag", name = "ag", descriptor = "()Lclient!alh;", line = 100)
	public static Class145_Sub1 method85() {
		return anInt29 * -120407133 < aClass145_Sub1Array1.length ? aClass145_Sub1Array1[(anInt29 += -1352314869) * -120407133 - 1] : null;
	}

	@OriginalMember(owner = "client!aag", name = "al", descriptor = "()Lclient!alh;", line = 100)
	public static Class145_Sub1 method86() {
		return anInt29 * -120407133 < aClass145_Sub1Array1.length ? aClass145_Sub1Array1[(anInt29 += -1352314869) * -120407133 - 1] : null;
	}

	@OriginalMember(owner = "client!aag", name = "ak", descriptor = "()Lclient!alh;", line = 100)
	public static Class145_Sub1 method87() {
		return anInt29 * -120407133 < aClass145_Sub1Array1.length ? aClass145_Sub1Array1[(anInt29 += -1352314869) * -120407133 - 1] : null;
	}

	@OriginalMember(owner = "client!aag", name = "ao", descriptor = "()Lclient!alh;", line = 100)
	public static Class145_Sub1 method88() {
		return anInt29 * -120407133 < aClass145_Sub1Array1.length ? aClass145_Sub1Array1[(anInt29 += -1352314869) * -120407133 - 1] : null;
	}

	@OriginalMember(owner = "client!aag", name = "au", descriptor = "()Lclient!alh;", line = 105)
	public static Class145_Sub1 method89() {
		return Class527.method30680(Class680.aClass25_8.anInt122 * -1664252895);
	}

	@OriginalMember(owner = "client!aag", name = "ax", descriptor = "(IZIZ)V", line = 109)
	public static void method90(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class12.method196(0, aClass145_Sub1Array1.length - 1, arg0, arg1, arg2, arg3);
		anInt28 = 0;
		aClass639_1 = null;
	}

	@OriginalMember(owner = "client!aag", name = "ad", descriptor = "(IIIZIZ)V", line = 115)
	static void method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg0) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class145_Sub1 local14 = aClass145_Sub1Array1[local8];
		aClass145_Sub1Array1[local8] = aClass145_Sub1Array1[arg1];
		aClass145_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class14.method17031(aClass145_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5) <= 0) {
				@Pc(44) Class145_Sub1 local44 = aClass145_Sub1Array1[local26];
				aClass145_Sub1Array1[local26] = aClass145_Sub1Array1[local10];
				aClass145_Sub1Array1[local10++] = local44;
			}
		}
		aClass145_Sub1Array1[arg1] = aClass145_Sub1Array1[local10];
		aClass145_Sub1Array1[local10] = local14;
		Class12.method196(arg0, local10 - 1, arg2, arg3, arg4, arg5);
		Class12.method196(local10 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aag", name = "ar", descriptor = "(IIIZIZ)V", line = 115)
	static void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg0) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) Class145_Sub1 local14 = aClass145_Sub1Array1[local8];
		aClass145_Sub1Array1[local8] = aClass145_Sub1Array1[arg1];
		aClass145_Sub1Array1[arg1] = local14;
		for (@Pc(26) int local26 = arg0; local26 < arg1; local26++) {
			if (Class14.method17031(aClass145_Sub1Array1[local26], local14, arg2, arg3, arg4, arg5) <= 0) {
				@Pc(44) Class145_Sub1 local44 = aClass145_Sub1Array1[local26];
				aClass145_Sub1Array1[local26] = aClass145_Sub1Array1[local10];
				aClass145_Sub1Array1[local10++] = local44;
			}
		}
		aClass145_Sub1Array1[arg1] = aClass145_Sub1Array1[local10];
		aClass145_Sub1Array1[local10] = local14;
		Class12.method196(arg0, local10 - 1, arg2, arg3, arg4, arg5);
		Class12.method196(local10 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aag", name = "ac", descriptor = "(Lclient!alh;Lclient!alh;IZ)I", line = 149)
	static int method93(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class145_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt2059 * 2098404975;
			local12 = arg1.anInt2059 * 2098404975;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class336.method27673(arg0.method15087(), arg1.method15087(), Class128.aClass667_3);
		} else if (arg2 == 3) {
			if (arg0.aString61.equals("-")) {
				if (arg1.aString61.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString61.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class336.method27673(arg0.aString61, arg1.aString61, Class128.aClass667_3);
			}
		} else if (arg2 == 4) {
			return arg0.method15074() ? (arg1.method15074() ? 0 : 1) : (arg1.method15074() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method15070() ? (arg1.method15070() ? 0 : 1) : (arg1.method15070() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method15072() ? (arg1.method15072() ? 0 : 1) : (arg1.method15072() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method15067() ? (arg1.method15067() ? 0 : 1) : (arg1.method15067() ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt2066 * -663639827;
			local12 = arg1.anInt2066 * -663639827;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt2068 * 539448607 - arg1.anInt2068 * 539448607;
		}
	}

	@OriginalMember(owner = "client!aag", name = "av", descriptor = "(Lclient!alh;Lclient!alh;IZ)I", line = 149)
	static int method94(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class145_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt2059 * 2098404975;
			local12 = arg1.anInt2059 * 2098404975;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class336.method27673(arg0.method15087(), arg1.method15087(), Class128.aClass667_3);
		} else if (arg2 == 3) {
			if (arg0.aString61.equals("-")) {
				if (arg1.aString61.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString61.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class336.method27673(arg0.aString61, arg1.aString61, Class128.aClass667_3);
			}
		} else if (arg2 == 4) {
			return arg0.method15074() ? (arg1.method15074() ? 0 : 1) : (arg1.method15074() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method15070() ? (arg1.method15070() ? 0 : 1) : (arg1.method15070() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method15072() ? (arg1.method15072() ? 0 : 1) : (arg1.method15072() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method15067() ? (arg1.method15067() ? 0 : 1) : (arg1.method15067() ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt2066 * -663639827;
			local12 = arg1.anInt2066 * -663639827;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt2068 * 539448607 - arg1.anInt2068 * 539448607;
		}
	}

	@OriginalMember(owner = "client!aag", name = "w", descriptor = "(B)V", line = 165)
	static void method95() {
		Class548.aClass77_Sub1_Sub7_6 = new Class77_Sub1_Sub7(Class44.aClass44_94.method713(Class128.aClass667_3), "", client.anInt3472 * 846725895, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!aag", name = "akh", descriptor = "(Lclient!yf;B)V", line = 11250)
	static final void method96(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
