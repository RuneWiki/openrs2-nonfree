import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!de", name = "Ag", descriptor = "[I")
	private static final int[] anIntArray175 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!de", name = "Og", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!de", name = "Rg", descriptor = "[I")
	public static final int[] anIntArray177 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!dg;Z)I")
	public static int method1927(@OriginalArg(0) Class63 arg0) {
		if (arg0 == Static24.aClass63_4) {
			return 2;
		} else if (Static44.aClass63_2 == arg0) {
			return 0;
		} else if (arg0 == Static233.aClass63_5) {
			return 1;
		} else if (Static429.aClass63_6 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!pca;)I")
	public static int method1928(@OriginalArg(1) Class228 arg0) {
		if (arg0 == Static357.aClass228_6) {
			return 2;
		} else if (Static41.aClass228_3 == arg0) {
			return 3;
		} else if (Static482.aClass228_8 == arg0) {
			return 1;
		} else if (Static403.aClass228_7 == arg0) {
			return 4;
		} else if (arg0 == Static147.aClass228_4) {
			return 6;
		} else if (arg0 == Static206.aClass228_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!fd;B)I")
	public static int method1930(@OriginalArg(0) Class98 arg0) {
		if (arg0 == Static148.aClass98_1) {
			return 2;
		} else if (Static165.aClass98_2 == arg0) {
			return 4;
		} else if (Static395.aClass98_5 == arg0) {
			return 26;
		} else if (arg0 == Static344.aClass98_4) {
			return 7;
		} else if (Static283.aClass98_3 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!em;)I")
	public static int method1932(@OriginalArg(1) Class86 arg0) {
		if (Static354.aClass86_9 == arg0) {
			return 2;
		} else if (arg0 == Static269.aClass86_10) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!kl;ILclient!vt;)I")
	public static int method1934(@OriginalArg(0) Class174 arg0, @OriginalArg(2) Class306 arg1) {
		if (Static523.aClass306_15 == arg1) {
			if (Static296.aClass174_9 == arg0) {
				return 22;
			}
			if (Static189.aClass174_6 == arg0) {
				return 21;
			}
			if (Static301.aClass174_10 == arg0) {
				return 28;
			}
			if (Static517.aClass174_16 == arg0) {
				return 50;
			}
			if (Static167.aClass174_5 == arg0) {
				return 51;
			}
			if (Static475.aClass174_15 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		try {
			@Pc(22) D3DDISPLAYMODE local22 = arg3.b(arg2);
			label74: while (arg0 >= 0) {
				if (arg0 != 1) {
					local18 = arg0;
					for (@Pc(38) int local38 = 0; local38 < anIntArray177.length; local38++) {
						if (arg3.CheckDeviceType(arg2, arg1, local22.Format, anIntArray177[local38], true) == 0 && arg3.CheckDeviceFormat(arg2, arg1, local22.Format, 1, 1, anIntArray177[local38]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg1, anIntArray177[local38], true, local18) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray175.length; local91++) {
								if (arg3.CheckDeviceFormat(arg2, arg1, local22.Format, 2, 1, anIntArray175[local91]) == 0 && arg3.CheckDepthStencilMatch(arg2, arg1, local22.Format, anIntArray177[local38], anIntArray175[local91]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg1, anIntArray175[local38], true, local18) == 0)) {
									local16 = anIntArray177[local38];
									local1 = anIntArray175[local91];
									break label74;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local16 == 0 || local1 == 0) {
				return false;
			}
			arg4.MultiSampleType = local18;
			arg4.MultiSampleQuality = 0;
			arg4.BackBufferFormat = local16;
			arg4.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(189) Throwable local189) {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!sq;I)I")
	public static int method1937(@OriginalArg(0) Class273 arg0) {
		if (arg0 == Static212.aClass273_3) {
			return 1;
		} else if (Static272.aClass273_4 == arg0) {
			return 2;
		} else if (arg0 == Static274.aClass273_5) {
			return 3;
		} else if (arg0 == Static203.aClass273_2) {
			return 4;
		} else if (arg0 == Static166.aClass273_1) {
			return 256;
		} else {
			return 0;
		}
	}
}
