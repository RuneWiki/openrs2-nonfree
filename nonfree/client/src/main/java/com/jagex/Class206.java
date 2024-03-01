package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class206 {

	@OriginalMember(owner = "client!gq", name = "sq", descriptor = "B")
	public static byte aByte128;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!xn;")
	Class581 aClass581_28;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "[Lclient!agd;")
	Class3_Sub19[] aClass3_Sub19Array1;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Lclient!gz;")
	final Interface16 anInterface16_4;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILclient!gz;)V", line = 11)
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		@Pc(3) int local3;
		for (local3 = 1; local3 < arg0; local3 += local3) {
		}
		this.aClass581_28 = new Class581(local3);
		this.aClass3_Sub19Array1 = new Class3_Sub19[local3];
		this.anInterface16_4 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "(I)Lclient!agd;", line = 20)
	public Class3_Sub19 method24198(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass3_Sub19Array1.length ? null : this.aClass3_Sub19Array1[arg0];
	}

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "(I)Lclient!agd;", line = 20)
	public Class3_Sub19 method24200(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass3_Sub19Array1.length ? null : this.aClass3_Sub19Array1[arg0];
	}

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "(I)Lclient!agd;", line = 20)
	public Class3_Sub19 method24201(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass3_Sub19Array1.length ? null : this.aClass3_Sub19Array1[arg0];
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(IB)Lclient!agd;", line = 20)
	public Class3_Sub19 method24202(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass3_Sub19Array1.length ? null : this.aClass3_Sub19Array1[arg0];
	}

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "(I)Lclient!agd;", line = 20)
	public Class3_Sub19 method24206(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass3_Sub19Array1.length ? null : this.aClass3_Sub19Array1[arg0];
	}

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "(Ljava/lang/String;)Lclient!agd;", line = 25)
	public Class3_Sub19 method24194(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface16_4.method23406(arg0);
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass581_28.method33217(local5); local11 != null; local11 = (Class3_Sub19) this.aClass581_28.method33218()) {
			if (local11.aString126.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!agd;", line = 25)
	public Class3_Sub19 method24195(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface16_4.method23406(arg0);
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass581_28.method33217(local5); local11 != null; local11 = (Class3_Sub19) this.aClass581_28.method33218()) {
			if (local11.aString126.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(Ljava/lang/String;)Lclient!agd;", line = 25)
	public Class3_Sub19 method24203(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface16_4.method23406(arg0);
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass581_28.method33217(local5); local11 != null; local11 = (Class3_Sub19) this.aClass581_28.method33218()) {
			if (local11.aString126.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Ljava/lang/String;)Lclient!agd;", line = 25)
	public Class3_Sub19 method24208(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface16_4.method23406(arg0);
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass581_28.method33217(local5); local11 != null; local11 = (Class3_Sub19) this.aClass581_28.method33218()) {
			if (local11.aString126.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(II)V", line = 35)
	void method24196(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "(I)V", line = 35)
	void method24197(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "(I)V", line = 35)
	void method24199(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "(I)V", line = 35)
	void method24204(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "(I)V", line = 35)
	void method24205(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V", line = 35)
	void method24207(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub19 local4 = this.method24202(arg0);
		if (local4 != null) {
			local4.method33656();
			this.aClass3_Sub19Array1[local4.anInt2839 * -1725493677] = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "(ILjava/lang/String;Lclient!agd;I)V", line = 43)
	public void method24193(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class3_Sub19 arg2) {
		@Pc(4) Class3_Sub19 local4 = this.method24195(arg1);
		if (local4 != null && arg0 != local4.anInt2839 * -1725493677) {
			throw new IllegalArgumentException(arg1);
		}
		this.method24196(arg0);
		if (arg0 >= this.aClass3_Sub19Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass3_Sub19Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass581_28 = new Class581(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass3_Sub19Array1.length; local46++) {
				@Pc(56) Class3_Sub19 local56 = this.aClass3_Sub19Array1[local46];
				if (local56 != null) {
					this.aClass581_28.method33241(local56, local56.aLong296 * -1930649055099428229L);
				}
			}
			@Pc(72) Class3_Sub19[] local72 = new Class3_Sub19[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass3_Sub19Array1.length; local74++) {
				local72[local74] = this.aClass3_Sub19Array1[local74];
			}
			this.aClass3_Sub19Array1 = local72;
		}
		arg2.anInt2839 = arg0 * 1666213339;
		arg2.aString126 = arg1;
		this.aClass581_28.method33241(arg2, this.anInterface16_4.method23406(arg1));
		this.aClass3_Sub19Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(ILjava/lang/String;Lclient!agd;)V", line = 43)
	public void method24209(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class3_Sub19 arg2) {
		@Pc(4) Class3_Sub19 local4 = this.method24195(arg1);
		if (local4 != null && arg0 != local4.anInt2839 * -1725493677) {
			throw new IllegalArgumentException(arg1);
		}
		this.method24196(arg0);
		if (arg0 >= this.aClass3_Sub19Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass3_Sub19Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass581_28 = new Class581(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass3_Sub19Array1.length; local46++) {
				@Pc(56) Class3_Sub19 local56 = this.aClass3_Sub19Array1[local46];
				if (local56 != null) {
					this.aClass581_28.method33241(local56, local56.aLong296 * -1930649055099428229L);
				}
			}
			@Pc(72) Class3_Sub19[] local72 = new Class3_Sub19[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass3_Sub19Array1.length; local74++) {
				local72[local74] = this.aClass3_Sub19Array1[local74];
			}
			this.aClass3_Sub19Array1 = local72;
		}
		arg2.anInt2839 = arg0 * 1666213339;
		arg2.aString126 = arg1;
		this.aClass581_28.method33241(arg2, this.anInterface16_4.method23406(arg1));
		this.aClass3_Sub19Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "(ILjava/lang/String;Lclient!agd;)V", line = 43)
	public void method24210(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class3_Sub19 arg2) {
		@Pc(4) Class3_Sub19 local4 = this.method24195(arg1);
		if (local4 != null && arg0 != local4.anInt2839 * -1725493677) {
			throw new IllegalArgumentException(arg1);
		}
		this.method24196(arg0);
		if (arg0 >= this.aClass3_Sub19Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass3_Sub19Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass581_28 = new Class581(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass3_Sub19Array1.length; local46++) {
				@Pc(56) Class3_Sub19 local56 = this.aClass3_Sub19Array1[local46];
				if (local56 != null) {
					this.aClass581_28.method33241(local56, local56.aLong296 * -1930649055099428229L);
				}
			}
			@Pc(72) Class3_Sub19[] local72 = new Class3_Sub19[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass3_Sub19Array1.length; local74++) {
				local72[local74] = this.aClass3_Sub19Array1[local74];
			}
			this.aClass3_Sub19Array1 = local72;
		}
		arg2.anInt2839 = arg0 * 1666213339;
		arg2.aString126 = arg1;
		this.aClass581_28.method33241(arg2, this.anInterface16_4.method23406(arg1));
		this.aClass3_Sub19Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "(ILjava/lang/String;Lclient!agd;)V", line = 43)
	public void method24211(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class3_Sub19 arg2) {
		@Pc(4) Class3_Sub19 local4 = this.method24195(arg1);
		if (local4 != null && arg0 != local4.anInt2839 * -1725493677) {
			throw new IllegalArgumentException(arg1);
		}
		this.method24196(arg0);
		if (arg0 >= this.aClass3_Sub19Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass3_Sub19Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass581_28 = new Class581(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass3_Sub19Array1.length; local46++) {
				@Pc(56) Class3_Sub19 local56 = this.aClass3_Sub19Array1[local46];
				if (local56 != null) {
					this.aClass581_28.method33241(local56, local56.aLong296 * -1930649055099428229L);
				}
			}
			@Pc(72) Class3_Sub19[] local72 = new Class3_Sub19[local30];
			for (@Pc(74) int local74 = 0; local74 < this.aClass3_Sub19Array1.length; local74++) {
				local72[local74] = this.aClass3_Sub19Array1[local74];
			}
			this.aClass3_Sub19Array1 = local72;
		}
		arg2.anInt2839 = arg0 * 1666213339;
		arg2.aString126 = arg1;
		this.aClass581_28.method33241(arg2, this.anInterface16_4.method23406(arg1));
		this.aClass3_Sub19Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I", line = 71)
	public static int method24216(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub18 local5 = (Class3_Sub1_Sub18) Class196.aClass581_27.method33217((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass3_Sub1_67 == Class196.aClass546_14.aClass3_Sub1_62) {
			return -1;
		} else {
			return ((Class3_Sub1_Sub18) local5.aClass3_Sub1_67).anInt2704 * 178210753;
		}
	}

	@OriginalMember(owner = "client!gq", name = "jv", descriptor = "(Lclient!vs;I)V", line = 5812)
	static final void method24212(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class431.method27962(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gq", name = "vh", descriptor = "(Lclient!vs;B)V", line = 7925)
	static final void method24213(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3116 * -1336253523 >= 2) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3116 * -1336253523;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "xa", descriptor = "(Lclient!vs;B)V", line = 8382)
	static final void method24215(@OriginalArg(0) Class536 arg0) {
		if (client.aString151 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class21_Sub1.anInt288 * 906110417;
		}
	}

	@OriginalMember(owner = "client!gq", name = "adh", descriptor = "(Lclient!vs;I)V", line = 9331)
	static final void method24214(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		arg0.anInt5319 -= 624249098;
		@Pc(39) int local39 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(49) int local49 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local25 == null) {
			local25 = "";
		}
		if (local25.length() > 80) {
			local25 = local25.substring(0, 80);
		}
		@Pc(65) Class82 local65 = Class406.method27657();
		@Pc(71) Class3_Sub23 local71 = Class269.method25284(Class311.aClass311_11, local65.aClass577_2);
		local71.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local14) + 2 + Class43_Sub2.method8763(local25));
		local71.aClass3_Sub41_Sub1_1.method20260(local14);
		local71.aClass3_Sub41_Sub1_1.method20250(local39 - 1);
		local71.aClass3_Sub41_Sub1_1.method20250(local49);
		local71.aClass3_Sub41_Sub1_1.method20260(local25);
		local65.method21601(local71);
	}
}
