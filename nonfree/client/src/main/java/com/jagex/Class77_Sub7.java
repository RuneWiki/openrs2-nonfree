package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajf")
public class Class77_Sub7 extends Class77 {

	@OriginalMember(owner = "client!ajf", name = "w", descriptor = "I")
	static int anInt1466;

	@OriginalMember(owner = "client!ajf", name = "l", descriptor = "Lclient!aak;")
	static final Class12 aClass12_10 = new Class12(32);

	@OriginalMember(owner = "client!ajf", name = "y", descriptor = "Lclient!er;")
	static final Class232 aClass232_18 = new Class232(10);

	@OriginalMember(owner = "client!ajf", name = "t", descriptor = "[I")
	int[] anIntArray192 = new int[] { -1 };

	@OriginalMember(owner = "client!ajf", name = "q", descriptor = "[I")
	int[] anIntArray193 = new int[] { 0 };

	@OriginalMember(owner = "client!ajf", name = "x", descriptor = "[Lclient!aah;")
	Class9[] aClass9Array1 = null;

	@OriginalMember(owner = "client!ajf", name = "<init>", descriptor = "()V", line = 27)
	Class77_Sub7() {
	}

	@OriginalMember(owner = "client!ajf", name = "a", descriptor = "(IIZ)I", line = 30)
	public static int method13251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray192.length) {
			return local4.anIntArray192[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "m", descriptor = "(IIZ)I", line = 30)
	public static int method13252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray192.length) {
			return local4.anIntArray192[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "n", descriptor = "(IIZ)I", line = 30)
	public static int method13253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray192.length) {
			return local4.anIntArray192[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "h", descriptor = "(IIZ)I", line = 37)
	public static int method13254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray193.length) {
			return local4.anIntArray193[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "aj", descriptor = "(IIZ)I", line = 37)
	public static int method13255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray193.length) {
			return local4.anIntArray193[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ai", descriptor = "(IIIZ)I", line = 44)
	public static int method13256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class343 local5 = (Class343) Class61.aClass35_Sub11_1.method18319(arg2);
		@Pc(8) Class75 local8 = local5.aClass75_1;
		@Pc(13) Class77_Sub7 local13 = Class112.method9473(arg0, arg3);
		@Pc(38) int local38;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray193.length || local13.aClass9Array1 == null || local13.aClass9Array1[arg1] == null) {
			local38 = (Integer) local8.method1144();
		} else {
			local38 = local13.aClass9Array1[arg1].method131(local8.anInt223 * -1270946121);
		}
		return local5.method27799(local38);
	}

	@OriginalMember(owner = "client!ajf", name = "ag", descriptor = "(IIIZ)I", line = 44)
	public static int method13257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class343 local5 = (Class343) Class61.aClass35_Sub11_1.method18319(arg2);
		@Pc(8) Class75 local8 = local5.aClass75_1;
		@Pc(13) Class77_Sub7 local13 = Class112.method9473(arg0, arg3);
		@Pc(38) int local38;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray193.length || local13.aClass9Array1 == null || local13.aClass9Array1[arg1] == null) {
			local38 = (Integer) local8.method1144();
		} else {
			local38 = local13.aClass9Array1[arg1].method131(local8.anInt223 * -1270946121);
		}
		return local5.method27799(local38);
	}

	@OriginalMember(owner = "client!ajf", name = "al", descriptor = "(IIZ)I", line = 58)
	public static int method13258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray193.length; local17++) {
				if (arg1 == local4.anIntArray192[local17]) {
					local15 += local4.anIntArray193[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ao", descriptor = "(IIZ)I", line = 58)
	public static int method13259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray193.length; local17++) {
				if (arg1 == local4.anIntArray192[local17]) {
					local15 += local4.anIntArray193[local17];
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ak", descriptor = "(IIZ)I", line = 69)
	public static int method13260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class77_Sub7 local6 = Class112.method9473(arg0, arg2);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray192.length; local12++) {
			if (local6.anIntArray192[local12] >= 0 && ((Class18) Class537.aClass35_Sub7_1.method18319(local6.anIntArray192[local12])).anInt58 * 1160623023 == arg1) {
				local1 += Class22.method421(arg0, local12, arg2);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ajf", name = "au", descriptor = "(IZ)I", line = 94)
	public static int method13261(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!ajf", name = "ax", descriptor = "(IZ)I", line = 94)
	public static int method13262(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!ajf", name = "ar", descriptor = "(IZ)Lclient!ajf;", line = 106)
	static Class77_Sub7 method13263(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class77_Sub7) aClass12_10.method173(local8);
	}

	@OriginalMember(owner = "client!ajf", name = "ad", descriptor = "(IZ)Lclient!ajf;", line = 106)
	static Class77_Sub7 method13264(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class77_Sub7) aClass12_10.method173(local8);
	}

	@OriginalMember(owner = "client!ajf", name = "ac", descriptor = "(IIIILclient!aah;Z)V", line = 111)
	static void method13265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class77_Sub7 local13 = (Class77_Sub7) aClass12_10.method173(local8);
		if (local13 == null) {
			local13 = new Class77_Sub7();
			aClass12_10.method184(local13, local8);
		}
		if (local13.anIntArray192.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class9[] local40 = null;
			if (local13.aClass9Array1 != null) {
				local40 = new Class9[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray192.length; local51++) {
				local33[local51] = local13.anIntArray192[local51];
				local38[local51] = local13.anIntArray193[local51];
				if (local13.aClass9Array1 != null) {
					local40[local51] = local13.aClass9Array1[local51];
				}
			}
			for (local51 = local13.anIntArray192.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray192 = local33;
			local13.anIntArray193 = local38;
			local13.aClass9Array1 = local40;
		}
		local13.anIntArray192[arg1] = arg2;
		local13.anIntArray193[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass9Array1 == null) {
				local13.aClass9Array1 = new Class9[local13.anIntArray192.length];
			}
			local13.aClass9Array1[arg1] = arg4;
		} else if (local13.aClass9Array1 != null) {
			local13.aClass9Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "av", descriptor = "(IIIILclient!aah;Z)V", line = 111)
	static void method13266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class77_Sub7 local13 = (Class77_Sub7) aClass12_10.method173(local8);
		if (local13 == null) {
			local13 = new Class77_Sub7();
			aClass12_10.method184(local13, local8);
		}
		if (local13.anIntArray192.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class9[] local40 = null;
			if (local13.aClass9Array1 != null) {
				local40 = new Class9[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray192.length; local51++) {
				local33[local51] = local13.anIntArray192[local51];
				local38[local51] = local13.anIntArray193[local51];
				if (local13.aClass9Array1 != null) {
					local40[local51] = local13.aClass9Array1[local51];
				}
			}
			for (local51 = local13.anIntArray192.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray192 = local33;
			local13.anIntArray193 = local38;
			local13.aClass9Array1 = local40;
		}
		local13.anIntArray192[arg1] = arg2;
		local13.anIntArray193[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass9Array1 == null) {
				local13.aClass9Array1 = new Class9[local13.anIntArray192.length];
			}
			local13.aClass9Array1[arg1] = arg4;
		} else if (local13.aClass9Array1 != null) {
			local13.aClass9Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "at", descriptor = "(IIIILclient!aah;Z)V", line = 111)
	static void method13267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class77_Sub7 local13 = (Class77_Sub7) aClass12_10.method173(local8);
		if (local13 == null) {
			local13 = new Class77_Sub7();
			aClass12_10.method184(local13, local8);
		}
		if (local13.anIntArray192.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class9[] local40 = null;
			if (local13.aClass9Array1 != null) {
				local40 = new Class9[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray192.length; local51++) {
				local33[local51] = local13.anIntArray192[local51];
				local38[local51] = local13.anIntArray193[local51];
				if (local13.aClass9Array1 != null) {
					local40[local51] = local13.aClass9Array1[local51];
				}
			}
			for (local51 = local13.anIntArray192.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray192 = local33;
			local13.anIntArray193 = local38;
			local13.aClass9Array1 = local40;
		}
		local13.anIntArray192[arg1] = arg2;
		local13.anIntArray193[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass9Array1 == null) {
				local13.aClass9Array1 = new Class9[local13.anIntArray192.length];
			}
			local13.aClass9Array1[arg1] = arg4;
		} else if (local13.aClass9Array1 != null) {
			local13.aClass9Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ah", descriptor = "(IZ)V", line = 145)
	static void method13268(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg1);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray192.length; local10++) {
			local4.anIntArray192[local10] = -1;
			local4.anIntArray193[local10] = 0;
		}
		local4.aClass9Array1 = null;
	}

	@OriginalMember(owner = "client!ajf", name = "ae", descriptor = "(IZ)V", line = 145)
	static void method13269(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg1);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray192.length; local10++) {
			local4.anIntArray192[local10] = -1;
			local4.anIntArray193[local10] = 0;
		}
		local4.aClass9Array1 = null;
	}

	@OriginalMember(owner = "client!ajf", name = "as", descriptor = "()V", line = 161)
	static void method13270() {
		aClass12_10.method188();
	}

	@OriginalMember(owner = "client!ajf", name = "g", descriptor = "([II[IZB)J", line = 165)
	long method13271(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ajf", name = "z", descriptor = "(Lclient!dx;ILclient!zx;IZLclient!wr;I)Lclient!dv;", line = 185)
	final Class84 method13272(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class628 arg5) {
		@Pc(1) Class84 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class570 local5 = null;
		if (arg3 != -1) {
			local5 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(arg3);
		}
		@Pc(17) int[] local17 = this.anIntArray192;
		if (local5 != null && local5.anIntArray500 != null) {
			local17 = new int[local5.anIntArray500.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray500.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray500[local30];
				if (local40 >= 0 && local40 < this.anIntArray192.length) {
					local17[local30] = this.anIntArray192[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23432();
		}
		@Pc(84) long local84 = this.method13271(local17, arg3, arg5 == null ? null : arg5.anIntArray523, arg4);
		if (aClass232_18 != null) {
			local1 = (Class84) aClass232_18.method25835(local84);
		}
		if (local1 == null || arg0.method20116(local1.method6875(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20117(local3, local1.method6875());
			}
			@Pc(112) int local112 = local3;
			@Pc(114) boolean local114 = false;
			for (@Pc(116) int local116 = 0; local116 < local17.length; local116++) {
				if (local17[local116] != -1 && !((Class18) Class537.aClass35_Sub7_1.method18319(local17[local116])).method369(arg4, null)) {
					local114 = true;
				}
			}
			if (local114) {
				return null;
			}
			@Pc(150) Class216[] local150 = new Class216[local17.length];
			@Pc(152) int local152;
			for (local152 = 0; local152 < local17.length; local152++) {
				if (local17[local152] != -1) {
					local150[local152] = ((Class18) Class537.aClass35_Sub7_1.method18319(local17[local152])).method370(arg4, null);
				}
			}
			@Pc(209) int local209;
			@Pc(216) int local216;
			if (local5 != null && local5.anIntArrayArray60 != null) {
				for (local152 = 0; local152 < local5.anIntArrayArray60.length; local152++) {
					if (local5.anIntArrayArray60[local152] != null && local150[local152] != null) {
						local209 = local5.anIntArrayArray60[local152][0];
						local216 = local5.anIntArrayArray60[local152][1];
						@Pc(223) int local223 = local5.anIntArrayArray60[local152][2];
						@Pc(230) int local230 = local5.anIntArrayArray60[local152][3];
						@Pc(237) int local237 = local5.anIntArrayArray60[local152][4];
						@Pc(244) int local244 = local5.anIntArrayArray60[local152][5];
						if (local230 != 0 || local237 != 0 || local244 != 0) {
							local150[local152].method25691(local230, local237, local244);
						}
						if (local209 != 0 || local216 != 0 || local223 != 0) {
							local150[local152].method25689(local209, local216, local223);
						}
					}
				}
			}
			@Pc(282) Class216 local282 = new Class216(local150, local150.length);
			if (arg5 != null) {
				local112 = local3 | 0x4000;
			}
			local1 = arg0.method20115(local282, local112, anInt1466 * -1962800471, 66, 855);
			if (arg5 != null) {
				local209 = 0;
				label123: while (true) {
					if (local209 >= 10) {
						local209 = 0;
						while (true) {
							if (local209 >= 10) {
								break label123;
							}
							for (local216 = 0; local216 < Class580.aShortArrayArray4[local209].length; local216++) {
								if (arg5.anIntArray524[local209] < Class479.aShortArrayArrayArray10[local209][local216].length) {
									local1.method6890(Class580.aShortArrayArray4[local209][local216], Class479.aShortArrayArrayArray10[local209][local216][arg5.anIntArray524[local209]]);
								}
							}
							local209++;
						}
					}
					for (local216 = 0; local216 < Class628.aShortArrayArray5[local209].length; local216++) {
						if (arg5.anIntArray523[local209] < Class101.aShortArrayArrayArray9[local209][local216].length) {
							local1.method6835(Class628.aShortArrayArray5[local209][local216], Class101.aShortArrayArrayArray9[local209][local216][arg5.anIntArray523[local209]]);
						}
					}
					local209++;
				}
			}
			if (aClass232_18 != null) {
				local1.method6795(local3);
				aClass232_18.method25844(local1, local84);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(411) Class84 local411 = local1.method6794((byte) 1, local3, true);
			arg2.method23438(local411, 0);
			return local411;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "aq", descriptor = "(Lclient!dx;ILclient!zx;IZLclient!wr;)Lclient!dv;", line = 185)
	final Class84 method13273(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class628 arg5) {
		@Pc(1) Class84 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class570 local5 = null;
		if (arg3 != -1) {
			local5 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(arg3);
		}
		@Pc(17) int[] local17 = this.anIntArray192;
		if (local5 != null && local5.anIntArray500 != null) {
			local17 = new int[local5.anIntArray500.length];
			for (@Pc(30) int local30 = 0; local30 < local5.anIntArray500.length; local30++) {
				@Pc(40) int local40 = local5.anIntArray500[local30];
				if (local40 >= 0 && local40 < this.anIntArray192.length) {
					local17[local30] = this.anIntArray192[local40];
				} else {
					local17[local30] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method23432();
		}
		@Pc(84) long local84 = this.method13271(local17, arg3, arg5 == null ? null : arg5.anIntArray523, arg4);
		if (aClass232_18 != null) {
			local1 = (Class84) aClass232_18.method25835(local84);
		}
		if (local1 == null || arg0.method20116(local1.method6875(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method20117(local3, local1.method6875());
			}
			@Pc(112) int local112 = local3;
			@Pc(114) boolean local114 = false;
			for (@Pc(116) int local116 = 0; local116 < local17.length; local116++) {
				if (local17[local116] != -1 && !((Class18) Class537.aClass35_Sub7_1.method18319(local17[local116])).method369(arg4, null)) {
					local114 = true;
				}
			}
			if (local114) {
				return null;
			}
			@Pc(150) Class216[] local150 = new Class216[local17.length];
			@Pc(152) int local152;
			for (local152 = 0; local152 < local17.length; local152++) {
				if (local17[local152] != -1) {
					local150[local152] = ((Class18) Class537.aClass35_Sub7_1.method18319(local17[local152])).method370(arg4, null);
				}
			}
			@Pc(209) int local209;
			@Pc(216) int local216;
			if (local5 != null && local5.anIntArrayArray60 != null) {
				for (local152 = 0; local152 < local5.anIntArrayArray60.length; local152++) {
					if (local5.anIntArrayArray60[local152] != null && local150[local152] != null) {
						local209 = local5.anIntArrayArray60[local152][0];
						local216 = local5.anIntArrayArray60[local152][1];
						@Pc(223) int local223 = local5.anIntArrayArray60[local152][2];
						@Pc(230) int local230 = local5.anIntArrayArray60[local152][3];
						@Pc(237) int local237 = local5.anIntArrayArray60[local152][4];
						@Pc(244) int local244 = local5.anIntArrayArray60[local152][5];
						if (local230 != 0 || local237 != 0 || local244 != 0) {
							local150[local152].method25691(local230, local237, local244);
						}
						if (local209 != 0 || local216 != 0 || local223 != 0) {
							local150[local152].method25689(local209, local216, local223);
						}
					}
				}
			}
			@Pc(282) Class216 local282 = new Class216(local150, local150.length);
			if (arg5 != null) {
				local112 = local3 | 0x4000;
			}
			local1 = arg0.method20115(local282, local112, anInt1466 * -1962800471, 66, 855);
			if (arg5 != null) {
				local209 = 0;
				label123: while (true) {
					if (local209 >= 10) {
						local209 = 0;
						while (true) {
							if (local209 >= 10) {
								break label123;
							}
							for (local216 = 0; local216 < Class580.aShortArrayArray4[local209].length; local216++) {
								if (arg5.anIntArray524[local209] < Class479.aShortArrayArrayArray10[local209][local216].length) {
									local1.method6890(Class580.aShortArrayArray4[local209][local216], Class479.aShortArrayArrayArray10[local209][local216][arg5.anIntArray524[local209]]);
								}
							}
							local209++;
						}
					}
					for (local216 = 0; local216 < Class628.aShortArrayArray5[local209].length; local216++) {
						if (arg5.anIntArray523[local209] < Class101.aShortArrayArrayArray9[local209][local216].length) {
							local1.method6835(Class628.aShortArrayArray5[local209][local216], Class101.aShortArrayArrayArray9[local209][local216][arg5.anIntArray523[local209]]);
						}
					}
					local209++;
				}
			}
			if (aClass232_18 != null) {
				local1.method6795(local3);
				aClass232_18.method25844(local1, local84);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(411) Class84 local411 = local1.method6794((byte) 1, local3, true);
			arg2.method23438(local411, 0);
			return local411;
		}
	}

	@OriginalMember(owner = "client!ajf", name = "am", descriptor = "(I)V", line = 255)
	static void method13274(@OriginalArg(0) int arg0) {
		anInt1466 = arg0 * -2060961383;
		aClass232_18.method25850();
	}

	@OriginalMember(owner = "client!ajf", name = "ay", descriptor = "()V", line = 260)
	static void method13275() {
		aClass232_18.method25850();
	}

	@OriginalMember(owner = "client!ajf", name = "af", descriptor = "()V", line = 260)
	static void method13276() {
		aClass232_18.method25850();
	}

	@OriginalMember(owner = "client!ajf", name = "zn", descriptor = "(Lclient!yf;I)V", line = 9162)
	static final void method13277(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(38) boolean local38 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] == 1;
		@Pc(46) Class623 local46 = client.aClass243_1.method26054(local13).method25994(local23);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local38 ? local46.method32452() : local46.method32439();
	}
}
