import java.awt.Canvas;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt1922;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_69 = new Class217(68, 28);

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	public static final int[] anIntArray147 = new int[2500];

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!mq;")
	public static Class141 aClass141_1 = new Class141(8);

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public static int anInt1924 = 0;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_70 = new Class217(51, 2);

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	public static int anInt1925 = 0;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public static int anInt1926 = -50;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!ue;")
	public static Class94 method1813(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(10) Class local10 = Class.forName("Class94_Sub2");
			@Pc(14) Class94 local14 = (Class94) local10.getDeclaredConstructor().newInstance();
			local14.method4039(arg0);
			return local14;
		} catch (@Pc(21) Throwable local21) {
			@Pc(25) Class94_Sub1 local25 = new Class94_Sub1();
			local25.method4039(arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!va;Z)V")
	public static void method1814(@OriginalArg(0) Class11_Sub2_Sub6 arg0) {
		arg0.aBoolean501 = false;
		@Pc(18) Class199 local18;
		if (arg0.anInt6733 != -1) {
			local18 = Static161.method3066(arg0.anInt6733);
			if (local18 == null || local18.anIntArray467 == null) {
				arg0.anInt6733 = -1;
				arg0.aBoolean499 = false;
			} else {
				label297: {
					arg0.anInt6768++;
					if (arg0.anInt6747 < local18.anIntArray467.length && arg0.anInt6768 > local18.anIntArray466[arg0.anInt6747]) {
						arg0.anInt6747++;
						arg0.anInt6788++;
						arg0.anInt6768 = 1;
						Static96.method2060(local18, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, arg0.anInt6747, arg0.anInt6729, arg0.anInt6726);
					}
					if (local18.anIntArray467.length <= arg0.anInt6747) {
						arg0.anInt6768 = 0;
						arg0.anInt6747 = 0;
						if (arg0.aBoolean499) {
							arg0.anInt6733 = arg0.method5898().method2068();
							if (arg0.anInt6733 == -1) {
								arg0.aBoolean499 = false;
								break label297;
							}
							local18 = Static161.method3066(arg0.anInt6733);
						}
						Static96.method2060(local18, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, arg0.anInt6747, arg0.anInt6729, arg0.anInt6726);
					}
					arg0.anInt6788 = arg0.anInt6747 + 1;
					if (local18.anIntArray467.length <= arg0.anInt6788) {
						arg0.anInt6788 = 0;
					}
				}
			}
		}
		@Pc(194) Class199 local194;
		if (arg0.anInt6795 != -1 && Static51.anInt1301 >= arg0.anInt6774) {
			@Pc(184) Class109 local184 = Static345.method5752(arg0.anInt6795);
			@Pc(187) int local187 = local184.anInt3267;
			if (local187 == -1) {
				arg0.anInt6795 = -1;
			} else {
				label299: {
					local194 = Static161.method3066(local187);
					if (local184.aBoolean221) {
						if (local194.anInt6017 == 3) {
							if (arg0.anInt6796 > 0 && Static51.anInt1301 >= arg0.anInt6779 && Static51.anInt1301 > arg0.lb) {
								arg0.anInt6795 = -1;
								break label299;
							}
						} else if (local194.anInt6017 == 1 && arg0.anInt6796 > 0 && Static51.anInt1301 >= arg0.anInt6779 && Static51.anInt1301 > arg0.lb) {
							arg0.anInt6774 = Static51.anInt1301 + 1;
							break label299;
						}
					}
					if (local194 == null || local194.anIntArray467 == null) {
						arg0.anInt6795 = -1;
					} else {
						if (arg0.anInt6778 < 0) {
							arg0.anInt6778 = 0;
							Static96.method2060(local194, Static191.aClass11_Sub2_Sub6_Sub1_4 == arg0, arg0.aByte79, 0, arg0.anInt6729, arg0.anInt6726);
						}
						arg0.anInt6748++;
						if (local194.anIntArray467.length > arg0.anInt6778 && arg0.anInt6748 > local194.anIntArray466[arg0.anInt6778]) {
							arg0.anInt6748 = 1;
							arg0.anInt6778++;
							Static96.method2060(local194, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, arg0.anInt6778, arg0.anInt6729, arg0.anInt6726);
						}
						if (local194.anIntArray467.length <= arg0.anInt6778) {
							if (local184.aBoolean221) {
								arg0.anInt6778 -= local194.anInt6009;
								arg0.anInt6783++;
								if (local194.anInt6011 <= arg0.anInt6783) {
									arg0.anInt6795 = -1;
								} else if (arg0.anInt6778 >= 0 && local194.anIntArray467.length > arg0.anInt6778) {
									Static96.method2060(local194, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, arg0.anInt6778, arg0.anInt6729, arg0.anInt6726);
								} else {
									arg0.anInt6795 = -1;
								}
							} else {
								arg0.anInt6795 = -1;
							}
						}
						arg0.anInt6782 = arg0.anInt6778 + 1;
						if (arg0.anInt6782 >= local194.anIntArray467.length) {
							if (local184.aBoolean221) {
								arg0.anInt6782 -= local194.anInt6009;
								if (arg0.anInt6783 + 1 >= local194.anInt6011) {
									arg0.anInt6782 = -1;
								} else if (arg0.anInt6782 < 0 || arg0.anInt6782 >= local194.anIntArray467.length) {
									arg0.anInt6782 = -1;
								}
							} else {
								arg0.anInt6782 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6772 != -1 && arg0.anInt6761 <= 1) {
			local18 = Static161.method3066(arg0.anInt6772);
			if (local18.anInt6017 == 3) {
				if (arg0.anInt6796 > 0 && arg0.anInt6779 <= Static51.anInt1301 && arg0.lb < Static51.anInt1301) {
					arg0.anInt6772 = -1;
				}
			} else if (local18.anInt6017 == 1 && arg0.anInt6796 > 0 && arg0.anInt6779 <= Static51.anInt1301 && arg0.lb < Static51.anInt1301) {
				arg0.anInt6761 = 2;
			}
		}
		if (arg0.anInt6772 != -1 && arg0.anInt6761 == 0) {
			local18 = Static161.method3066(arg0.anInt6772);
			if (local18 == null || local18.anIntArray467 == null) {
				arg0.anInt6772 = -1;
			} else {
				arg0.anInt6776++;
				if (local18.anIntArray467.length > arg0.anInt6743 && local18.anIntArray466[arg0.anInt6743] < arg0.anInt6776) {
					arg0.anInt6776 = 1;
					arg0.anInt6743++;
					Static96.method2060(local18, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, arg0.anInt6743, arg0.anInt6729, arg0.anInt6726);
				}
				if (arg0.anInt6743 >= local18.anIntArray467.length) {
					arg0.anInt6781++;
					arg0.anInt6743 -= local18.anInt6009;
					if (local18.anInt6011 <= arg0.anInt6781) {
						arg0.anInt6772 = -1;
					} else if (arg0.anInt6743 >= 0 && local18.anIntArray467.length > arg0.anInt6743) {
						Static96.method2060(local18, Static191.aClass11_Sub2_Sub6_Sub1_4 == arg0, arg0.aByte79, arg0.anInt6743, arg0.anInt6729, arg0.anInt6726);
					} else {
						arg0.anInt6772 = -1;
					}
				}
				arg0.anInt6794 = arg0.anInt6743 + 1;
				if (arg0.anInt6794 >= local18.anIntArray467.length) {
					arg0.anInt6794 -= local18.anInt6009;
					if (arg0.anInt6781 + 1 >= local18.anInt6011) {
						arg0.anInt6794 = -1;
					} else if (arg0.anInt6794 < 0 || arg0.anInt6794 >= local18.anIntArray467.length) {
						arg0.anInt6794 = -1;
					}
				}
				arg0.aBoolean501 = local18.aBoolean449;
			}
		}
		if (arg0.anInt6761 > 0) {
			arg0.anInt6761--;
		}
		for (@Pc(750) int local750 = 0; local750 < arg0.aClass163Array3.length; local750++) {
			@Pc(757) Class163 local757 = arg0.aClass163Array3[local750];
			if (local757 != null) {
				if (local757.anInt5051 > 0) {
					local757.anInt5051--;
				} else {
					local194 = Static161.method3066(local757.anInt5050);
					if (local194 == null || local194.anIntArray467 == null) {
						arg0.aClass163Array3[local750] = null;
					} else {
						local757.anInt5053++;
						if (local194.anIntArray467.length > local757.anInt5055 && local194.anIntArray466[local757.anInt5055] < local757.anInt5053) {
							local757.anInt5055++;
							local757.anInt5053 = 1;
							Static96.method2060(local194, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, local757.anInt5055, arg0.anInt6729, arg0.anInt6726);
						}
						if (local757.anInt5055 >= local194.anIntArray467.length) {
							local757.anInt5048++;
							local757.anInt5055 -= local194.anInt6009;
							if (local757.anInt5048 >= local194.anInt6011) {
								arg0.aClass163Array3[local750] = null;
							} else if (local757.anInt5055 >= 0 && local757.anInt5055 < local194.anIntArray467.length) {
								Static96.method2060(local194, arg0 == Static191.aClass11_Sub2_Sub6_Sub1_4, arg0.aByte79, local757.anInt5055, arg0.anInt6729, arg0.anInt6726);
							} else {
								arg0.aClass163Array3[local750] = null;
							}
						}
						local757.anInt5052 = local757.anInt5055 + 1;
						if (local194.anIntArray467.length <= local757.anInt5052) {
							local757.anInt5052 -= local194.anInt6009;
							if (local757.anInt5048 + 1 >= local194.anInt6011) {
								local757.anInt5052 = -1;
							} else if (local757.anInt5052 < 0 || local194.anIntArray467.length <= local757.anInt5052) {
								local757.anInt5052 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1815(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = local8.method2132();
		@Pc(20) int local20 = local8.method2140();
		if (local20 < 0 || Static29.anInt678 != 0 && Static29.anInt678 < local20) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(81) byte[] local81 = new byte[local20];
			local8.method2104(local20, local81);
			return local81;
		} else {
			@Pc(43) int local43 = local8.method2140();
			if (local43 < 0 || Static29.anInt678 != 0 && local43 > Static29.anInt678) {
				throw new RuntimeException();
			}
			@Pc(57) byte[] local57 = new byte[local43];
			if (local12 == 1) {
				Static115.method2426(local57, local43, arg0, local20);
			} else {
				Static187.aClass157_1.method4295(local8, local57);
			}
			return local57;
		}
	}
}
