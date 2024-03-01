package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public class Class415 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!wd;")
	static Class547 aClass547_1;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_38 = new Class161(64);

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!ew;")
	Class161 aClass161_37 = new Class161(20);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_68;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_69;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 17)
	public Class415(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_68 = arg3;
		this.aClass359_69 = arg2;
		this.aClass359_69.method26682(Class185.aClass185_31.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "(II)Lclient!qp;", line = 25)
	public Class414 method27754(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		@Pc(11) Class414 local11;
		synchronized (this.aClass161_38) {
			local11 = (Class414) this.aClass161_38.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_69;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_69) {
			local38 = this.aClass359_69.method26713(Class185.aClass185_31.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class414();
		local11.aClass415_1 = this;
		if (local38 != null) {
			local11.method27738(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "(I)Lclient!qp;", line = 25)
	public Class414 method27758(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		@Pc(11) Class414 local11;
		synchronized (this.aClass161_38) {
			local11 = (Class414) this.aClass161_38.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_69;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_69) {
			local38 = this.aClass359_69.method26713(Class185.aClass185_31.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class414();
		local11.aClass415_1 = this;
		if (local38 != null) {
			local11.method27738(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)Lclient!qp;", line = 25)
	public Class414 method27761(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		@Pc(11) Class414 local11;
		synchronized (this.aClass161_38) {
			local11 = (Class414) this.aClass161_38.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_69;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_69) {
			local38 = this.aClass359_69.method26713(Class185.aClass185_31.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class414();
		local11.aClass415_1 = this;
		if (local38 != null) {
			local11.method27738(new Class3_Sub41(local38));
		}
		@Pc(67) Class161 local67 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "()V", line = 43)
	public void method27753() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23224();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23224();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 43)
	public void method27755() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23224();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23224();
		}
	}

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "()V", line = 43)
	public void method27759() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23224();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23224();
		}
	}

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "()V", line = 43)
	public void method27760() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23224();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23224();
		}
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(IB)V", line = 52)
	public void method27756(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23240(arg0);
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 52)
	public void method27762(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23240(arg0);
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 52)
	public void method27765(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23240(arg0);
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "(I)V", line = 61)
	public void method27757() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23245();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23245();
		}
	}

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "()V", line = 61)
	public void method27763() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23245();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23245();
		}
	}

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "()V", line = 61)
	public void method27764() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23245();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23245();
		}
	}

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "()V", line = 61)
	public void method27766() {
		@Pc(3) Class161 local3 = this.aClass161_38;
		synchronized (this.aClass161_38) {
			this.aClass161_38.method23245();
		}
		local3 = this.aClass161_37;
		synchronized (this.aClass161_37) {
			this.aClass161_37.method23245();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Ljava/lang/CharSequence;I)I", line = 140)
	public static int method27769(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class525.method32378(arg0.charAt(local6));
		}
		return local4;
	}

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "(Lclient!aml;I)V", line = 838)
	static void method27771(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (Class250.aBoolean688) {
			return;
		}
		arg0.method33656();
		Class250.anInt3811 -= 831615277;
		if (!arg0.aBoolean468) {
			@Pc(17) long local17 = arg0.aLong155 * 4089614541957148765L;
			@Pc(22) Class3_Sub1_Sub9 local22;
			for (local22 = (Class3_Sub1_Sub9) Class250.aClass581_30.method33217(local17); local22 != null && !local22.aString112.equals(arg0.aString109); local22 = (Class3_Sub1_Sub9) Class250.aClass581_30.method33218()) {
			}
			if (local22 != null && local22.method19053(arg0)) {
				Class159.method23207(local22);
			}
			return;
		}
		for (@Pc(53) Class3_Sub1_Sub9 local53 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local53 != null; local53 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
			if (local53.aString112.equals(arg0.aString109)) {
				@Pc(64) boolean local64 = false;
				for (@Pc(70) Class3_Sub1_Sub7 local70 = (Class3_Sub1_Sub7) local53.aClass546_9.method32623(); local70 != null; local70 = (Class3_Sub1_Sub7) local53.aClass546_9.method32645()) {
					if (arg0 == local70) {
						if (local53.method19053(arg0)) {
							Class159.method23207(local53);
						}
						local64 = true;
						break;
					}
				}
				if (local64) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "dc", descriptor = "(Lclient!vs;B)V", line = 4657)
	static final void method27767(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class427.method27908(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!qq", name = "ahd", descriptor = "(Lclient!vs;B)V", line = 10309)
	static final void method27768(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403();
	}

	@OriginalMember(owner = "client!qq", name = "le", descriptor = "(Lclient!fo;I)V", line = 11215)
	static final void method27770(@OriginalArg(0) Class178 arg0) {
		if (arg0.anInt3540 * 2108263643 != Class178.anInt3542 * 702847481) {
			return;
		}
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75 == null) {
			arg0.anInt3514 = 0;
			arg0.anInt3493 = 0;
			return;
		}
		arg0.anInt3518 = 589440670;
		arg0.anInt3519 = ((int) (Math.sin((double) client.anInt3034 / 40.0D) * 256.0D) & 0x7FF) * 1353287483;
		arg0.anInt3513 = -1505688221;
		arg0.anInt3514 = client.anInt3115 * -1892412517;
		arg0.anInt3493 = Class481.method29081(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75) * -1649738339;
		@Pc(54) Class71_Sub1 local54 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass71_Sub1_3;
		if (local54 == null) {
			arg0.aClass71_6 = null;
			return;
		}
		if (arg0.aClass71_6 == null) {
			arg0.aClass71_6 = new Class71_Sub2();
		}
		arg0.anInt3572 = local54.method20103() * 225643071;
		arg0.aClass71_6.method20022(local54);
	}
}
