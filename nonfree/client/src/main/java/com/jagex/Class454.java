package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public class Class454 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static final int anInt5058 = 128;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public static final int anInt5059 = 64;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!dw;")
	public static Class14 aClass14_12;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!ew;")
	Class161 aClass161_43 = new Class161(128);

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "Lclient!ew;")
	Class161 aClass161_44 = new Class161(64);

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_79;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_78;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 19)
	public Class454(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_79 = arg2;
		this.aClass359_78 = arg3;
		this.aClass359_79.method26682(Class185.aClass185_42.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "(I)Lclient!se;", line = 27)
	public Class452 method28442(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		@Pc(11) Class452 local11;
		synchronized (this.aClass161_43) {
			local11 = (Class452) this.aClass161_43.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_79) {
			local38 = this.aClass359_79.method26713(Class185.aClass185_42.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class452();
		local11.anInt5025 = arg0 * 1245019689;
		local11.aClass454_4 = this;
		if (local38 != null) {
			local11.method28396(new Class3_Sub41(local38));
		}
		local11.method28403();
		@Pc(74) Class161 local74 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "(I)Lclient!se;", line = 27)
	public Class452 method28443(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		@Pc(11) Class452 local11;
		synchronized (this.aClass161_43) {
			local11 = (Class452) this.aClass161_43.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_79) {
			local38 = this.aClass359_79.method26713(Class185.aClass185_42.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class452();
		local11.anInt5025 = arg0 * 1245019689;
		local11.aClass454_4 = this;
		if (local38 != null) {
			local11.method28396(new Class3_Sub41(local38));
		}
		local11.method28403();
		@Pc(74) Class161 local74 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "(I)Lclient!se;", line = 27)
	public Class452 method28444(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		@Pc(11) Class452 local11;
		synchronized (this.aClass161_43) {
			local11 = (Class452) this.aClass161_43.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_79) {
			local38 = this.aClass359_79.method26713(Class185.aClass185_42.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class452();
		local11.anInt5025 = arg0 * 1245019689;
		local11.aClass454_4 = this;
		if (local38 != null) {
			local11.method28396(new Class3_Sub41(local38));
		}
		local11.method28403();
		@Pc(74) Class161 local74 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "(II)Lclient!se;", line = 27)
	public Class452 method28448(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		@Pc(11) Class452 local11;
		synchronized (this.aClass161_43) {
			local11 = (Class452) this.aClass161_43.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_79) {
			local38 = this.aClass359_79.method26713(Class185.aClass185_42.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class452();
		local11.anInt5025 = arg0 * 1245019689;
		local11.aClass454_4 = this;
		if (local38 != null) {
			local11.method28396(new Class3_Sub41(local38));
		}
		local11.method28403();
		@Pc(74) Class161 local74 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 47)
	public void method28439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_43 = new Class161(arg0);
		this.aClass161_44 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "(II)V", line = 47)
	public void method28445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_43 = new Class161(arg0);
		this.aClass161_44 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V", line = 47)
	public void method28446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_43 = new Class161(arg0);
		this.aClass161_44 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()V", line = 52)
	public void method28447() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23224();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23224();
		}
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 52)
	public void method28449() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23224();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23224();
		}
	}

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "()V", line = 52)
	public void method28450() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23224();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23224();
		}
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "(II)V", line = 61)
	public void method28441(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23240(arg0);
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "(I)V", line = 61)
	public void method28451(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23240(arg0);
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "()V", line = 70)
	public void method28437() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23245();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23245();
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "()V", line = 70)
	public void method28438() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23245();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23245();
		}
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(B)V", line = 70)
	public void method28440() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23245();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23245();
		}
	}

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "()V", line = 70)
	public void method28452() {
		@Pc(3) Class161 local3 = this.aClass161_43;
		synchronized (this.aClass161_43) {
			this.aClass161_43.method23245();
		}
		local3 = this.aClass161_44;
		synchronized (this.aClass161_44) {
			this.aClass161_44.method23245();
		}
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(IIIIIFZI)[I", line = 203)
	public static int[] method28458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class3_Sub46_Sub1 local6 = new Class3_Sub46_Sub1();
		local6.anInt2786 = arg1 * -1332845647;
		local6.aBoolean490 = arg6;
		local6.anInt2793 = arg2 * 2093581431;
		local6.anInt2787 = arg3 * -2066376489;
		local6.anInt2791 = arg4 * 1146713033;
		local6.anInt2792 = (int) (arg5 * 4096.0F) * -699376425;
		local6.method20161();
		Class602.method33521(arg0, 1);
		local6.method20155(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "(B)V", line = 466)
	public static void method28453() {
		@Pc(2) Class161 local2 = Class488.aClass161_55;
		synchronized (Class488.aClass161_55) {
			Class488.aClass161_55.method23224();
		}
		local2 = Class488.aClass161_56;
		synchronized (Class488.aClass161_56) {
			Class488.aClass161_56.method23224();
		}
	}

	@OriginalMember(owner = "client!sg", name = "de", descriptor = "(II)V", line = 730)
	static void method28457(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		Class58_Sub1.anInt1437 = -481951965;
		Class58_Sub1.anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!sg", name = "ad", descriptor = "(Lclient!vs;I)V", line = 4157)
	static final void method28454(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5316 -= -43584562;
		if (arg0.aLongArray18[arg0.anInt5316 * 196643287 + 1] != arg0.aLongArray18[arg0.anInt5316 * 196643287]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!sg", name = "iz", descriptor = "(Lclient!vs;B)V", line = 5665)
	static final void method28455(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class66.method13206(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "adm", descriptor = "(Lclient!vs;I)V", line = 9421)
	static final void method28456(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (client.anInt3116 * -1336253523 == 0 && (client.aBoolean591 && !client.aBoolean592 || client.aBoolean594)) {
			return;
		}
		@Pc(27) String local27 = local13.toLowerCase();
		@Pc(29) byte local29 = 0;
		if (local27.startsWith(Class601.aClass601_161.method33512(Class530.aClass530_9))) {
			local29 = 0;
			local13 = local13.substring(Class601.aClass601_161.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_24.method33512(Class530.aClass530_9))) {
			local29 = 1;
			local13 = local13.substring(Class601.aClass601_24.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_163.method33512(Class530.aClass530_9))) {
			local29 = 2;
			local13 = local13.substring(Class601.aClass601_163.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_164.method33512(Class530.aClass530_9))) {
			local29 = 3;
			local13 = local13.substring(Class601.aClass601_164.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_11.method33512(Class530.aClass530_9))) {
			local29 = 4;
			local13 = local13.substring(Class601.aClass601_11.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_166.method33512(Class530.aClass530_9))) {
			local29 = 5;
			local13 = local13.substring(Class601.aClass601_166.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_30.method33512(Class530.aClass530_9))) {
			local29 = 6;
			local13 = local13.substring(Class601.aClass601_30.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_168.method33512(Class530.aClass530_9))) {
			local29 = 7;
			local13 = local13.substring(Class601.aClass601_168.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_169.method33512(Class530.aClass530_9))) {
			local29 = 8;
			local13 = local13.substring(Class601.aClass601_169.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_140.method33512(Class530.aClass530_9))) {
			local29 = 9;
			local13 = local13.substring(Class601.aClass601_140.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_171.method33512(Class530.aClass530_9))) {
			local29 = 10;
			local13 = local13.substring(Class601.aClass601_171.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_133.method33512(Class530.aClass530_9))) {
			local29 = 11;
			local13 = local13.substring(Class601.aClass601_133.method33512(Class530.aClass530_9).length());
		} else if (Class530.aClass530_9 != Class469.aClass530_2) {
			if (local27.startsWith(Class601.aClass601_161.method33512(Class469.aClass530_2))) {
				local29 = 0;
				local13 = local13.substring(Class601.aClass601_161.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_24.method33512(Class469.aClass530_2))) {
				local29 = 1;
				local13 = local13.substring(Class601.aClass601_24.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_163.method33512(Class469.aClass530_2))) {
				local29 = 2;
				local13 = local13.substring(Class601.aClass601_163.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_164.method33512(Class469.aClass530_2))) {
				local29 = 3;
				local13 = local13.substring(Class601.aClass601_164.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_11.method33512(Class469.aClass530_2))) {
				local29 = 4;
				local13 = local13.substring(Class601.aClass601_11.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_166.method33512(Class469.aClass530_2))) {
				local29 = 5;
				local13 = local13.substring(Class601.aClass601_166.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_30.method33512(Class469.aClass530_2))) {
				local29 = 6;
				local13 = local13.substring(Class601.aClass601_30.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_168.method33512(Class469.aClass530_2))) {
				local29 = 7;
				local13 = local13.substring(Class601.aClass601_168.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_169.method33512(Class469.aClass530_2))) {
				local29 = 8;
				local13 = local13.substring(Class601.aClass601_169.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_140.method33512(Class469.aClass530_2))) {
				local29 = 9;
				local13 = local13.substring(Class601.aClass601_140.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_171.method33512(Class469.aClass530_2))) {
				local29 = 10;
				local13 = local13.substring(Class601.aClass601_171.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_133.method33512(Class469.aClass530_2))) {
				local29 = 11;
				local13 = local13.substring(Class601.aClass601_133.method33512(Class469.aClass530_2).length());
			}
		}
		local27 = local13.toLowerCase();
		@Pc(468) byte local468 = 0;
		if (local27.startsWith(Class601.aClass601_173.method33512(Class530.aClass530_9))) {
			local468 = 1;
			local13 = local13.substring(Class601.aClass601_173.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_147.method33512(Class530.aClass530_9))) {
			local468 = 2;
			local13 = local13.substring(Class601.aClass601_147.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_175.method33512(Class530.aClass530_9))) {
			local468 = 3;
			local13 = local13.substring(Class601.aClass601_175.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_176.method33512(Class530.aClass530_9))) {
			local468 = 4;
			local13 = local13.substring(Class601.aClass601_176.method33512(Class530.aClass530_9).length());
		} else if (local27.startsWith(Class601.aClass601_177.method33512(Class530.aClass530_9))) {
			local468 = 5;
			local13 = local13.substring(Class601.aClass601_177.method33512(Class530.aClass530_9).length());
		} else if (Class469.aClass530_2 != Class530.aClass530_9) {
			if (local27.startsWith(Class601.aClass601_173.method33512(Class469.aClass530_2))) {
				local468 = 1;
				local13 = local13.substring(Class601.aClass601_173.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_147.method33512(Class469.aClass530_2))) {
				local468 = 2;
				local13 = local13.substring(Class601.aClass601_147.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_175.method33512(Class469.aClass530_2))) {
				local468 = 3;
				local13 = local13.substring(Class601.aClass601_175.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_176.method33512(Class469.aClass530_2))) {
				local468 = 4;
				local13 = local13.substring(Class601.aClass601_176.method33512(Class469.aClass530_2).length());
			} else if (local27.startsWith(Class601.aClass601_177.method33512(Class469.aClass530_2))) {
				local468 = 5;
				local13 = local13.substring(Class601.aClass601_177.method33512(Class469.aClass530_2).length());
			}
		}
		@Pc(653) Class82 local653 = Class406.method27657();
		@Pc(659) Class3_Sub23 local659 = Class269.method25284(Class311.aClass311_119, local653.aClass577_2);
		local659.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(670) int local670 = local659.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local659.aClass3_Sub41_Sub1_1.method20250(local29);
		local659.aClass3_Sub41_Sub1_1.method20250(local468);
		Class608.method33566(local659.aClass3_Sub41_Sub1_1, local13);
		local659.aClass3_Sub41_Sub1_1.method20266(local659.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local670);
		local653.method21601(local659);
	}
}
