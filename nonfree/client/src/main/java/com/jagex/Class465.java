package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public class Class465 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!ew;")
	Class161 aClass161_50 = new Class161(20);

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_49 = new Class161(64);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_84;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_83;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 17)
	public Class465(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_84 = arg3;
		this.aClass359_83 = arg2;
		this.aClass359_83.method26682(Class185.aClass185_51.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "(II)Lclient!rv;", line = 25)
	public Class443 method28628(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)Lclient!rv;", line = 25)
	public Class443 method28631(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "(I)Lclient!rv;", line = 25)
	public Class443 method28633(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "(I)Lclient!rv;", line = 25)
	public Class443 method28634(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "(I)Lclient!rv;", line = 25)
	public Class443 method28635(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "(I)Lclient!rv;", line = 25)
	public Class443 method28638(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		@Pc(11) Class443 local11;
		synchronized (this.aClass161_49) {
			local11 = (Class443) this.aClass161_49.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_83) {
			local38 = this.aClass359_83.method26713(Class185.aClass185_51.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class443();
		local11.aClass465_2 = this;
		if (local38 != null) {
			local11.method28255(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "(Lclient!vs;I)V", line = 25)
	static void method28640(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5253 * -483067595;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!de;B)V", line = 28)
	static void method28645(@OriginalArg(0) Class21 arg0) {
		if (Class232.aClass553_49.method32725() == 0) {
			return;
		}
		@Pc(14) Class3_Sub3 local14;
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			for (local14 = (Class3_Sub3) Class232.aClass553_49.method32768(); local14 != null; local14 = (Class3_Sub3) Class232.aClass553_49.method32709()) {
				Class44_Sub3.aClass596_1.method33434(arg0, arg0, local14.anInt1157 * 645746539, local14.anInt1158 * 110971549, local14.anInt1156 * 196976511, local14.anInt1159 * -1553546849, false, false, local14.anInt1160 * -822406223, Class418.aClass14_11, local14.aBoolean253 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null, Class630.aClass493_1);
				local14.method33656();
			}
			Class401.method27608();
			return;
		}
		if (Class232.aClass21_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Class232.aClass21_8 = Class544.method32605(0, local72, Class43_Sub5.aClass134_5, Class325.anInterface11_9, Class127.aClass359_33, 0);
			Class232.aClass14_9 = Class232.aClass21_8.method17096(Class457.method28517(Class475.aClass359_86, Class568.anInt5378 * 1732591297, 0), (Class15_Sub1[]) Class137.method22942(Class294.aClass359_54, Class568.anInt5378 * 1732591297, 0), true);
		}
		for (local14 = (Class3_Sub3) Class232.aClass553_49.method32768(); local14 != null; local14 = (Class3_Sub3) Class232.aClass553_49.method32709()) {
			Class44_Sub3.aClass596_1.method33434(Class232.aClass21_8, arg0, local14.anInt1157 * 645746539, local14.anInt1158 * 110971549, local14.anInt1156 * 196976511, local14.anInt1159 * -1553546849, false, false, local14.anInt1160 * -822406223, Class232.aClass14_9, local14.aBoolean253 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null, Class630.aClass493_1);
			local14.method33656();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 43)
	public void method28632() {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23224();
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23224();
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V", line = 52)
	public void method28627(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23240(arg0);
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "(IB)V", line = 52)
	public void method28629(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23240(arg0);
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "()V", line = 61)
	public void method28630() {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23245();
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23245();
		}
	}

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "()V", line = 61)
	public void method28636() {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23245();
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23245();
		}
	}

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "(B)V", line = 61)
	public void method28637() {
		@Pc(3) Class161 local3 = this.aClass161_49;
		synchronized (this.aClass161_49) {
			this.aClass161_49.method23245();
		}
		local3 = this.aClass161_50;
		synchronized (this.aClass161_50) {
			this.aClass161_50.method23245();
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "([BI)V", line = 614)
	static void method28639(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method20271();
				Class510.aClass183_1.method23592(local19);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "dp", descriptor = "(Lclient!vs;B)V", line = 4600)
	static final void method28641(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class163.method23292(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "xq", descriptor = "(Lclient!vs;I)V", line = 8399)
	static final void method28642(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.aString151 == null || local12 >= Class21_Sub1.anInt288 * 906110417) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class43_Sub2.aClass79Array1[local12].aByte104;
		}
	}

	@OriginalMember(owner = "client!ss", name = "ks", descriptor = "(Lclient!fo;IIB)V", line = 10307)
	static void method28644(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte124 == 0) {
			arg0.anInt3497 = arg0.anInt3494 * -1640730797;
		} else if (arg0.aByte124 == 1) {
			arg0.anInt3497 = ((arg1 - arg0.anInt3498 * -1494060731) / 2 + arg0.anInt3494 * 550980753) * 1951874979;
		} else if (arg0.aByte124 == 2) {
			arg0.anInt3497 = (arg1 - arg0.anInt3498 * -1494060731 - arg0.anInt3494 * 550980753) * 1951874979;
		} else if (arg0.aByte124 == 3) {
			arg0.anInt3497 = (arg1 * 550980753 * arg0.anInt3494 >> 14) * 1951874979;
		} else if (arg0.aByte124 == 4) {
			arg0.anInt3497 = ((arg0.anInt3494 * 550980753 * arg1 >> 14) + (arg1 - arg0.anInt3498 * -1494060731) / 2) * 1951874979;
		} else {
			arg0.anInt3497 = (arg1 - arg0.anInt3498 * -1494060731 - (arg1 * arg0.anInt3494 * 550980753 >> 14)) * 1951874979;
		}
		if (arg0.aByte127 == 0) {
			arg0.anInt3510 = arg0.anInt3543 * -579839101;
		} else if (arg0.aByte127 == 1) {
			arg0.anInt3510 = ((arg2 - arg0.anInt3499 * -751005789) / 2 + arg0.anInt3543 * -987062959) * 1765680787;
		} else if (arg0.aByte127 == 2) {
			arg0.anInt3510 = (arg2 - arg0.anInt3499 * -751005789 - arg0.anInt3543 * -987062959) * 1765680787;
		} else if (arg0.aByte127 == 3) {
			arg0.anInt3510 = (arg0.anInt3543 * -987062959 * arg2 >> 14) * 1765680787;
		} else if (arg0.aByte127 == 4) {
			arg0.anInt3510 = ((arg2 - arg0.anInt3499 * -751005789) / 2 + (arg0.anInt3543 * -987062959 * arg2 >> 14)) * 1765680787;
		} else {
			arg0.anInt3510 = (arg2 - arg0.anInt3499 * -751005789 - (arg2 * -987062959 * arg0.anInt3543 >> 14)) * 1765680787;
		}
		if (!client.aBoolean610 || client.method22372(arg0).anInt1353 * 1263633035 == 0 && arg0.anInt3492 * -107621169 != 0) {
			return;
		}
		if (arg0.anInt3497 * -1988957173 < 0) {
			arg0.anInt3497 = 0;
		} else if (arg0.anInt3497 * -1988957173 + arg0.anInt3498 * -1494060731 > arg1) {
			arg0.anInt3497 = (arg1 - arg0.anInt3498 * -1494060731) * 1951874979;
		}
		if (arg0.anInt3510 * -1926174821 < 0) {
			arg0.anInt3510 = 0;
		} else if (arg0.anInt3510 * -1926174821 + arg0.anInt3499 * -751005789 > arg2) {
			arg0.anInt3510 = (arg2 - arg0.anInt3499 * -751005789) * 1765680787;
		}
	}

	@OriginalMember(owner = "client!ss", name = "aty", descriptor = "(Lclient!vs;B)V", line = 12374)
	static final void method28643(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub29_1.method13916() && Class613.aClass21_13.method17166() ? 1 : 0;
	}
}
