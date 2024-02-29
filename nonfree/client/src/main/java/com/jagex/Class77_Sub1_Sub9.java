package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arb")
public class Class77_Sub1_Sub9 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arb", name = "k", descriptor = "I")
	public int anInt3011;

	@OriginalMember(owner = "client!arb", name = "t", descriptor = "Lclient!uq;")
	public Class135 aClass135_45;

	@OriginalMember(owner = "client!arb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!arb", name = "d", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!arb", name = "s", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray5;

	@OriginalMember(owner = "client!arb", name = "r", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!arb", name = "g", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!arb", name = "j", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!arb", name = "z", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!arb", name = "i", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!arb", name = "u", descriptor = "[Lclient!aak;")
	public Class12[] aClass12Array1;

	@OriginalMember(owner = "client!arb", name = "x", descriptor = "[Lclient!rt;")
	public Class520[] aClass520Array1;

	@OriginalMember(owner = "client!arb", name = "e", descriptor = "Lclient!cn;")
	final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!arb", name = "<init>", descriptor = "(Lclient!akv;Lclient!cn;)V", line = 30)
	public Class77_Sub1_Sub9(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Interface17 arg1) {
		this.anInterface17_3 = arg1;
		@Pc(9) int local9 = this.method21891(arg0);
		@Pc(11) int local11 = 0;
		@Pc(14) Class520[] local14 = Class337.method27691();
		while (arg0.anInt3089 * 31645619 < local9) {
			@Pc(26) Class520 local26 = this.method21889(arg0, local14);
			this.method21893(arg0, local11, local26);
			local11++;
		}
	}

	@OriginalMember(owner = "client!arb", name = "l", descriptor = "(Lclient!akv;[Lclient!rt;)Lclient!rt;", line = 43)
	Class520 method21888(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class520[] arg1) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!arb", name = "p", descriptor = "(Lclient!akv;[Lclient!rt;S)Lclient!rt;", line = 43)
	Class520 method21889(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class520[] arg1) {
		@Pc(3) int local3 = arg0.method22483();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!arb", name = "y", descriptor = "(Lclient!akv;)I", line = 52)
	int method21890(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = (arg0.aByteArray53.length - 2) * -1387468933;
		@Pc(12) int local12 = arg0.method22483();
		@Pc(22) int local22 = arg0.aByteArray53.length - 2 - local12 - 16;
		arg0.anInt3089 = local22 * -1387468933;
		@Pc(31) int local31 = arg0.method22500();
		this.anInt3012 = arg0.method22483() * 1732062005;
		this.anInt3013 = arg0.method22483() * -796098427;
		this.anInt3015 = arg0.method22483() * 1635198705;
		this.anInt3014 = arg0.method22483() * -771796907;
		this.anInt3016 = arg0.method22483() * -1000336465;
		this.anInt3011 = arg0.method22483() * -666423281;
		@Pc(77) int local77 = arg0.method22478();
		if (local77 > 0) {
			this.aClass12Array1 = new Class12[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22483();
				@Pc(99) Class12 local99 = new Class12(Class199.method25492(local92));
				this.aClass12Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method22500();
					@Pc(115) int local115 = arg0.method22500();
					local99.method184(new Class77_Sub40(local115), (long) local111);
				}
			}
		}
		arg0.anInt3089 = 0;
		this.aString106 = arg0.method22520();
		this.aClass520Array1 = new Class520[local31];
		return local22;
	}

	@OriginalMember(owner = "client!arb", name = "c", descriptor = "(Lclient!akv;I)I", line = 52)
	int method21891(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = (arg0.aByteArray53.length - 2) * -1387468933;
		@Pc(12) int local12 = arg0.method22483();
		@Pc(22) int local22 = arg0.aByteArray53.length - 2 - local12 - 16;
		arg0.anInt3089 = local22 * -1387468933;
		@Pc(31) int local31 = arg0.method22500();
		this.anInt3012 = arg0.method22483() * 1732062005;
		this.anInt3013 = arg0.method22483() * -796098427;
		this.anInt3015 = arg0.method22483() * 1635198705;
		this.anInt3014 = arg0.method22483() * -771796907;
		this.anInt3016 = arg0.method22483() * -1000336465;
		this.anInt3011 = arg0.method22483() * -666423281;
		@Pc(77) int local77 = arg0.method22478();
		if (local77 > 0) {
			this.aClass12Array1 = new Class12[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22483();
				@Pc(99) Class12 local99 = new Class12(Class199.method25492(local92));
				this.aClass12Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method22500();
					@Pc(115) int local115 = arg0.method22500();
					local99.method184(new Class77_Sub40(local115), (long) local111);
				}
			}
		}
		arg0.anInt3089 = 0;
		this.aString106 = arg0.method22520();
		this.aClass520Array1 = new Class520[local31];
		return local22;
	}

	@OriginalMember(owner = "client!arb", name = "w", descriptor = "(Lclient!akv;)I", line = 52)
	int method21892(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = (arg0.aByteArray53.length - 2) * -1387468933;
		@Pc(12) int local12 = arg0.method22483();
		@Pc(22) int local22 = arg0.aByteArray53.length - 2 - local12 - 16;
		arg0.anInt3089 = local22 * -1387468933;
		@Pc(31) int local31 = arg0.method22500();
		this.anInt3012 = arg0.method22483() * 1732062005;
		this.anInt3013 = arg0.method22483() * -796098427;
		this.anInt3015 = arg0.method22483() * 1635198705;
		this.anInt3014 = arg0.method22483() * -771796907;
		this.anInt3016 = arg0.method22483() * -1000336465;
		this.anInt3011 = arg0.method22483() * -666423281;
		@Pc(77) int local77 = arg0.method22478();
		if (local77 > 0) {
			this.aClass12Array1 = new Class12[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22483();
				@Pc(99) Class12 local99 = new Class12(Class199.method25492(local92));
				this.aClass12Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method22500();
					@Pc(115) int local115 = arg0.method22500();
					local99.method184(new Class77_Sub40(local115), (long) local111);
				}
			}
		}
		arg0.anInt3089 = 0;
		this.aString106 = arg0.method22520();
		this.aClass520Array1 = new Class520[local31];
		return local22;
	}

	@OriginalMember(owner = "client!arb", name = "v", descriptor = "(Lclient!akv;ILclient!rt;I)V", line = 84)
	void method21893(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class520 arg2) {
		@Pc(3) int local3 = this.aClass520Array1.length;
		if (arg2 == Class520.aClass520_2 || arg2 == Class520.aClass520_1132) {
			@Pc(18) Class127 local18 = (Class127) Class457.method29479(Class127.method13144(), arg0.method22478());
			@Pc(22) int local22 = arg0.method22483();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface17_3.method27607(local18, local22);
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			this.anIntArray281[arg1] = arg0.method22478();
		} else if (arg2 == Class520.aClass520_6) {
			@Pc(66) Class489 local66 = (Class489) Class457.method29479(Class489.method30004(), arg0.method22478());
			switch(local66.anInt5048 * 973874463) {
				case 0:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22523().intern();
					break;
				case 1:
				case 2:
				default:
					throw new RuntimeException();
				case 3:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class520.aClass520_26;
					this.anObjectArray5[arg1] = arg0.method22510();
					break;
				case 4:
					if (this.anIntArray281 == null) {
						this.anIntArray281 = new int[local3];
					}
					arg2 = Class520.aClass520_1094;
					this.anIntArray281[arg1] = arg0.method22500();
			}
		} else if (Class520.aClass520_4 == arg2 || arg2 == Class520.aClass520_5) {
			@Pc(139) int local139 = arg0.method22483();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface17_3.method27606(local139);
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			this.anIntArray281[arg1] = arg0.method22478();
		} else {
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean781) {
				this.anIntArray281[arg1] = arg0.method22500();
			} else {
				this.anIntArray281[arg1] = arg0.method22478();
			}
		}
		this.aClass520Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!arb", name = "t", descriptor = "(Lclient!akv;ILclient!rt;)V", line = 84)
	void method21894(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class520 arg2) {
		@Pc(3) int local3 = this.aClass520Array1.length;
		if (arg2 == Class520.aClass520_2 || arg2 == Class520.aClass520_1132) {
			@Pc(18) Class127 local18 = (Class127) Class457.method29479(Class127.method13144(), arg0.method22478());
			@Pc(22) int local22 = arg0.method22483();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface17_3.method27607(local18, local22);
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			this.anIntArray281[arg1] = arg0.method22478();
		} else if (arg2 == Class520.aClass520_6) {
			@Pc(66) Class489 local66 = (Class489) Class457.method29479(Class489.method30004(), arg0.method22478());
			switch(local66.anInt5048 * 973874463) {
				case 0:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22523().intern();
					break;
				case 1:
				case 2:
				default:
					throw new RuntimeException();
				case 3:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class520.aClass520_26;
					this.anObjectArray5[arg1] = arg0.method22510();
					break;
				case 4:
					if (this.anIntArray281 == null) {
						this.anIntArray281 = new int[local3];
					}
					arg2 = Class520.aClass520_1094;
					this.anIntArray281[arg1] = arg0.method22500();
			}
		} else if (Class520.aClass520_4 == arg2 || arg2 == Class520.aClass520_5) {
			@Pc(139) int local139 = arg0.method22483();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface17_3.method27606(local139);
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			this.anIntArray281[arg1] = arg0.method22478();
		} else {
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean781) {
				this.anIntArray281[arg1] = arg0.method22500();
			} else {
				this.anIntArray281[arg1] = arg0.method22478();
			}
		}
		this.aClass520Array1[arg1] = arg2;
	}
}
