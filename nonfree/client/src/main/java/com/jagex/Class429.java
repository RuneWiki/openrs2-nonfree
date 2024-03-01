package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public class Class429 {

	@OriginalMember(owner = "client!rf", name = "hr", descriptor = "Lclient!ajd;")
	public static Class70_Sub1_Sub1 aClass70_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_40 = new Class161(64);

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_73;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class429(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_73 = arg2;
		if (this.aClass359_73 != null) {
			this.aClass359_73.method26682(Class185.aClass185_75.anInt3631 * -1739932335);
		}
	}

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "(III)I", line = 14)
	public static int method27932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (arg1 > arg0) {
			local4 = arg0;
			arg0 = arg1;
			arg1 = local4;
		}
		while (arg1 != 0) {
			local4 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local4;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "(I)Lclient!rd;", line = 24)
	Class427 method27926(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_40;
		@Pc(11) Class427 local11;
		synchronized (this.aClass161_40) {
			local11 = (Class427) this.aClass161_40.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_73;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_73) {
			local39 = this.aClass359_73.method26713(Class185.aClass185_75.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class427();
		if (local39 != null) {
			local11.method27904(new Class3_Sub41(local39));
		}
		@Pc(64) Class161 local64 = this.aClass161_40;
		synchronized (this.aClass161_40) {
			this.aClass161_40.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!rd;", line = 24)
	Class427 method27927(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_40;
		@Pc(11) Class427 local11;
		synchronized (this.aClass161_40) {
			local11 = (Class427) this.aClass161_40.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_73;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_73) {
			local39 = this.aClass359_73.method26713(Class185.aClass185_75.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class427();
		if (local39 != null) {
			local11.method27904(new Class3_Sub41(local39));
		}
		@Pc(64) Class161 local64 = this.aClass161_40;
		synchronized (this.aClass161_40) {
			this.aClass161_40.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "(IS)Lclient!rd;", line = 24)
	Class427 method27928(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_40;
		@Pc(11) Class427 local11;
		synchronized (this.aClass161_40) {
			local11 = (Class427) this.aClass161_40.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_73;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_73) {
			local39 = this.aClass359_73.method26713(Class185.aClass185_75.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class427();
		if (local39 != null) {
			local11.method27904(new Class3_Sub41(local39));
		}
		@Pc(64) Class161 local64 = this.aClass161_40;
		synchronized (this.aClass161_40) {
			this.aClass161_40.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Lclient!rd;", line = 24)
	Class427 method27929(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_40;
		@Pc(11) Class427 local11;
		synchronized (this.aClass161_40) {
			local11 = (Class427) this.aClass161_40.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_73;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_73) {
			local39 = this.aClass359_73.method26713(Class185.aClass185_75.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class427();
		if (local39 != null) {
			local11.method27904(new Class3_Sub41(local39));
		}
		@Pc(64) Class161 local64 = this.aClass161_40;
		synchronized (this.aClass161_40) {
			this.aClass161_40.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V", line = 247)
	public static void method27931() {
		if (Class231.aClass218Array1 == null) {
			Class231.aClass218Array1 = Class218.method24356();
			Class602.aClass218_20 = Class231.aClass218Array1[0];
			Class231.aLong248 = Class176.method23413() * -7062202854273115071L;
		}
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		@Pc(21) Class218 local21 = Class602.aClass218_20;
		@Pc(24) int local24 = Class164.method23306();
		if (local21 == Class602.aClass218_20) {
			Class34_Sub3.aString41 = Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2);
			Class231.aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean673) {
				Class329.anInt4587 = (Class602.aClass218_20.anInt3727 * 266184707 + local24 * (Class602.aClass218_20.anInt3726 * 1152921423 - Class602.aClass218_20.anInt3727 * 266184707) / 100) * 970308245;
			}
			if (Class602.aClass218_20.aBoolean672) {
				Class231.aString190 = Class231.aString190 + " - " + Class329.anInt4587 * 1347436733 + "%";
			}
		} else if (Class602.aClass218_20 == Class218.aClass218_18) {
			Class5.aClass221_4 = null;
			Class166.method23342(2);
			if (Class231.aBoolean678) {
				Class231.aBoolean678 = false;
				Class3_Sub29.method11606(Class34_Sub2.aString40, Class60_Sub16.aString66);
			}
		} else {
			Class34_Sub3.aString41 = local21.aClass601_2.method33512(Class469.aClass530_2);
			Class231.aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean672) {
				Class231.aString190 = Class231.aString190 + local21.anInt3726 * 1152921423 + "%";
			}
			Class329.anInt4587 = local21.anInt3726 * -984748293;
			if (Class602.aClass218_20.aBoolean673 || local21.aBoolean673) {
				Class231.aLong248 = Class176.method23413() * -7062202854273115071L;
			}
		}
		if (Class5.aClass221_4 == null) {
			return;
		}
		Class5.aClass221_4.method24389(Class231.aLong248 * -666017818301631551L, Class34_Sub3.aString41, Class231.aString190, Class329.anInt4587 * 1347436733, Class602.aClass218_20);
		if (Class231.anInterface18Array1 == null) {
			return;
		}
		for (@Pc(160) int local160 = Class231.anInt3739 * -755471699 + 1; local160 < Class231.anInterface18Array1.length; local160++) {
			if (Class231.anInterface18Array1[local160].method24490() >= 100 && Class231.anInt3739 * -755471699 == local160 - 1 && client.anInt3039 * 1115111877 != 0 && Class5.aClass221_4.method24388()) {
				try {
					Class231.anInterface18Array1[local160].method24483();
				} catch (@Pc(194) Exception local194) {
					Class231.anInterface18Array1 = null;
					break;
				}
				Class5.aClass221_4.method24406(Class231.anInterface18Array1[local160]);
				Class231.anInt3739 += 122325285;
				if (Class231.anInt3739 * -755471699 >= Class231.anInterface18Array1.length - 1 && Class231.anInterface18Array1.length > 1) {
					Class231.anInt3739 = (Class231.aClass624_1.method33776() ? 0 : -1) * 122325285;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "ed", descriptor = "(II)Z", line = 1674)
	static boolean method27933(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 13 || arg0 == 8;
	}

	@OriginalMember(owner = "client!rf", name = "ace", descriptor = "(Lclient!vs;I)V", line = 9154)
	static final void method27930(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		if (local17.anInt5493 * 1485423555 == -1 && local17.anInt5498 * 1166723267 >= 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5498 * 1166723267;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!rf", name = "ari", descriptor = "(Lclient!vs;I)V", line = 12077)
	static final void method27934(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class452 local17 = Class107.aClass454_3.method28448(local12);
		if (local17.aString224 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString224;
		}
	}
}
