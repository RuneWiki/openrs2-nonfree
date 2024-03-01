package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xh")
public class Class575 {

	@OriginalMember(owner = "client!xh", name = "n", descriptor = "I")
	public static int anInt5428;

	@OriginalMember(owner = "client!xh", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_62 = new Class161(128);

	@OriginalMember(owner = "client!xh", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_99;

	@OriginalMember(owner = "client!xh", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class575(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_99 = arg2;
		this.aClass359_99.method26682(Class185.aClass185_17.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!xh", name = "p", descriptor = "(II)Lclient!xp;", line = 21)
	public Class583 method33136(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		@Pc(11) Class583 local11;
		synchronized (this.aClass161_62) {
			local11 = (Class583) this.aClass161_62.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_99;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_99) {
			local39 = this.aClass359_99.method26713(Class185.aClass185_17.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class583();
		if (local39 != null) {
			local11.method33259(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xh", name = "h", descriptor = "(I)Lclient!xp;", line = 21)
	public Class583 method33140(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		@Pc(11) Class583 local11;
		synchronized (this.aClass161_62) {
			local11 = (Class583) this.aClass161_62.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_99;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_99) {
			local39 = this.aClass359_99.method26713(Class185.aClass185_17.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class583();
		if (local39 != null) {
			local11.method33259(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xh", name = "x", descriptor = "(I)Lclient!xp;", line = 21)
	public Class583 method33141(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		@Pc(11) Class583 local11;
		synchronized (this.aClass161_62) {
			local11 = (Class583) this.aClass161_62.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_99;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_99) {
			local39 = this.aClass359_99.method26713(Class185.aClass185_17.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class583();
		if (local39 != null) {
			local11.method33259(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xh", name = "s", descriptor = "(I)Lclient!xp;", line = 21)
	public Class583 method33142(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		@Pc(11) Class583 local11;
		synchronized (this.aClass161_62) {
			local11 = (Class583) this.aClass161_62.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_99;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_99) {
			local39 = this.aClass359_99.method26713(Class185.aClass185_17.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class583();
		if (local39 != null) {
			local11.method33259(new Class3_Sub41(local39));
		}
		@Pc(65) Class161 local65 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xh", name = "s", descriptor = "(Lclient!vs;S)V", line = 37)
	static void method33151(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray483 == null ? 0 : local15.anIntArray483.length;
	}

	@OriginalMember(owner = "client!xh", name = "u", descriptor = "()V", line = 38)
	public void method33137() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23224();
		}
	}

	@OriginalMember(owner = "client!xh", name = "a", descriptor = "(I)V", line = 38)
	public void method33138() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23224();
		}
	}

	@OriginalMember(owner = "client!xh", name = "y", descriptor = "()V", line = 38)
	public void method33143() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23224();
		}
	}

	@OriginalMember(owner = "client!xh", name = "b", descriptor = "(I)V", line = 44)
	public void method33144(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!xh", name = "g", descriptor = "(IB)V", line = 44)
	public void method33147(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!xh", name = "j", descriptor = "()V", line = 50)
	public void method33135() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23245();
		}
	}

	@OriginalMember(owner = "client!xh", name = "l", descriptor = "(I)V", line = 50)
	public void method33139() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23245();
		}
	}

	@OriginalMember(owner = "client!xh", name = "c", descriptor = "()V", line = 50)
	public void method33145() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23245();
		}
	}

	@OriginalMember(owner = "client!xh", name = "z", descriptor = "()V", line = 50)
	public void method33146() {
		@Pc(3) Class161 local3 = this.aClass161_62;
		synchronized (this.aClass161_62) {
			this.aClass161_62.method23245();
		}
	}

	@OriginalMember(owner = "client!xh", name = "y", descriptor = "(IIFB)I", line = 180)
	public static int method33150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class222.method24431(arg0, arg1, (int) arg2);
	}

	@OriginalMember(owner = "client!xh", name = "y", descriptor = "(Lclient!akj;I)I", line = 286)
	static int method33149(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class571 local2 = arg0.aClass571_1;
		if (local2.anIntArray508 != null) {
			local2 = local2.method33044(Class424.aClass165_1, Class424.aClass165_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local2.anInt5407 * -346579751;
		@Pc(25) Class445 local25 = arg0.method16690();
		@Pc(30) int local30 = arg0.aClass71_Sub1_3.method20103();
		if (local30 == -1 || arg0.aClass71_Sub1_3.aBoolean351) {
			local21 = local2.anInt5390 * -1049731571;
		} else if (local30 == local25.anInt4992 * -1713051549 || local25.anInt4997 * 1647125495 == local30 || local25.anInt4979 * -1610219699 == local30 || local30 == local25.anInt4974 * -1291917697) {
			local21 = local2.anInt5392 * 1837682201;
		} else if (local25.anInt4967 * 1572273339 == local30 || local30 == local25.anInt4987 * -1259453855 || local25.anInt4983 * 1145375145 == local30 || local25.anInt4982 * -1520360879 == local30) {
			local21 = local2.anInt5397 * -1305326865;
		}
		return local21;
	}

	@OriginalMember(owner = "client!xh", name = "aor", descriptor = "(Lclient!vs;B)V", line = 11595)
	static final void method33148(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub34_1.method14467() == 1 ? 1 : 0;
	}
}
