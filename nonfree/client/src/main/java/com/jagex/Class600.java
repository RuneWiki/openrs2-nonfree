package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class600 implements Interface64 {

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "[I")
	final int[] anIntArray514;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([I)V", line = 11)
	Class600(@OriginalArg(0) int[] arg0) {
		this.anIntArray514 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;)Z", line = 17)
	@Override
	public boolean method32035(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		@Pc(2) int[] local2 = this.anIntArray514;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method14784(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;I)Z", line = 17)
	@Override
	public boolean method32034(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		@Pc(2) int[] local2 = this.anIntArray514;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method14784(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "(Lclient!akv;)Lclient!vn;", line = 27)
	public static Class600 method32036(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method22478();
		}
		return new Class600(local6);
	}

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "(Lclient!dx;Lclient!pw;I)V", line = 98)
	public static void method32037(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class478 arg1) {
		@Pc(6) Class89[] local6 = Class210.method25596(arg1, Class231.anInt3762 * 149327611, 0);
		Class515.aClass83Array8 = new Class83[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class515.aClass83Array8[local12] = arg0.method20076(local6[local12], true);
		}
		local6 = Class210.method25596(arg1, Class611.anInt5572 * -1795683815, 0);
		Class536.aClass83Array9 = new Class83[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class536.aClass83Array9[local12] = arg0.method20076(local6[local12], true);
		}
		local6 = Class210.method25596(arg1, Class49.anInt178 * 1750510521, 0);
		Class22.aClass83Array1 = new Class83[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method6698(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class22.aClass83Array1[local70] = arg0.method20076(local6[local70], true);
		}
		local6 = Class210.method25596(arg1, Class529.anInt5171 * 1069313081, 0);
		Class58.aClass83Array2 = new Class83[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class58.aClass83Array2[local70] = arg0.method20076(local6[local70], true);
		}
		local6 = Class210.method25596(arg1, Class245.anInt3798 * -1687969609, 0);
		Class611.aClass83Array10 = new Class83[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method6698(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class611.aClass83Array10[local70] = arg0.method20076(local6[local70], true);
		}
		local6 = Class210.method25596(arg1, Class611.anInt5573 * 140074605, 0);
		Class148.aClass83Array6 = new Class83[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method6698(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class148.aClass83Array6[local70] = arg0.method20076(local6[local70], true);
		}
		Class134_Sub1.aClass83_15 = arg0.method20076(Class210.method25593(arg1, Class244.anInt3797 * 2006108777, 0), true);
		Class653.aClass83_39 = arg0.method20076(Class210.method25593(arg1, Class606.anInt5564 * 2116470397, 0), true);
		local6 = Class210.method25596(arg1, Class415.anInt4719 * 1474934323, 0);
		Class336.aClass83Array7 = new Class83[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class336.aClass83Array7[local70] = arg0.method20076(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!vn", name = "hw", descriptor = "(IIIIII)V", line = 3714)
	public static final void method32038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class650.anInt5741 = arg0 * 1442265799;
		Class605.anInt5562 = arg1 * -1322167097;
		Class111.anInt1096 = arg2 * -1723648975;
		Class56.anInt190 = arg3 * -1354061297;
		Class250.anInt3805 = arg4 * 845815569;
		if (Class11.anInt36 * -891094135 == 3) {
			Class58.method865();
		}
		if (Class250.anInt3805 * 1556001265 >= 100) {
			@Pc(37) int local37 = Class650.anInt5741 * 986574336 + 256;
			@Pc(43) int local43 = Class605.anInt5562 * 106556928 + 256;
			@Pc(55) int local55 = Class277.method26658(local37, local43, Class669.anInt5790 * -878424575) - Class111.anInt1096 * -1339841327;
			@Pc(61) int local61 = local37 - Class96_Sub13.anInt883 * -116109187;
			@Pc(67) int local67 = local55 - Class672.anInt5796 * 1529694271;
			@Pc(73) int local73 = local43 - Class633.anInt5710 * -1098179003;
			@Pc(84) int local84 = (int) Math.sqrt((double) (local73 * local73 + local61 * local61));
			Class565.anInt5338 = ((int) (Math.atan2((double) local67, (double) local84) * 2607.5945876176133D) & 0x3FFF) * -1539495063;
			Class639.anInt5720 = ((int) (Math.atan2((double) local61, (double) local73) * -2607.5945876176133D) & 0x3FFF) * 486346273;
			Class4.anInt17 = 0;
			if (Class565.anInt5338 * -864938791 < 1024) {
				Class565.anInt5338 = -189946880;
			}
			if (Class565.anInt5338 * -864938791 > 3072) {
				Class565.anInt5338 = -569840640;
			}
		}
		Class11.anInt36 = 1301785316;
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
	}

	@OriginalMember(owner = "client!vn", name = "eu", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5333)
	static final void method32039(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean679 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class481.method29824(arg0.anInt3863 * -1278450723);
		}
	}
}
