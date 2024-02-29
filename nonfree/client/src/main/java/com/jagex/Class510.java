package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public class Class510 {

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	static final int anInt5101 = 512;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
	boolean aBoolean776;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
	int anInt5093;

	@OriginalMember(owner = "client!ri", name = "aj", descriptor = "I")
	int anInt5094;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	int anInt5096;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "Lclient!cy;")
	Class83 aClass83_31;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	int anInt5100;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Lclient!dv;")
	Class84 aClass84_5;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "[B")
	byte[] aByteArray89;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	int anInt5103;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!ri;")
	Class510 aClass510_1;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	int anInt5104;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	int anInt5105;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	int anInt5095 = -1387230763;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Z")
	boolean aBoolean777 = true;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	final int anInt5099;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	final int anInt5097;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	final int anInt5098;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	final int anInt5092;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "[Lclient!rv;")
	Class521[] aClass521Array2;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!ub;")
	Class571 aClass571_1;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "[Lclient!rv;")
	Class521[] aClass521Array1;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!rv;")
	Class521 aClass521_1;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	int anInt5102;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "(Lclient!pw;Lclient!dp;Lclient!eo;)V", line = 52)
	public static void method30288(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2) {
		Class466.aClass478_124 = arg0;
		Class192.aClass209_10 = arg1;
		Class108.anInterface24_11 = arg2;
	}

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "()V", line = 58)
	public static void method30289() {
		Class521.method30579();
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I[Lclient!rv;IIIILclient!ub;I)V", line = 61)
	public Class510(@OriginalArg(0) int arg0, @OriginalArg(1) Class521[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class571 arg6, @OriginalArg(7) int arg7) {
		this.anInt5099 = arg3 * 1465472219;
		this.anInt5097 = arg4 * -1314354199;
		this.anInt5098 = arg5 * -1811066385;
		this.anInt5092 = arg0 * 262053529;
		this.aClass521Array2 = arg1;
		this.aClass571_1 = arg6;
		if (arg1 == null) {
			this.aClass521Array1 = null;
			this.aClass521_1 = null;
		} else {
			this.aClass521Array1 = new Class521[arg1.length];
			this.aClass521_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt5102 = arg7 * 1650652597;
	}

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "(III)V", line = 80)
	public void method30290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean776) {
		}
		this.anInt5104 = (this.anInt5094 * 7518119 + (arg1 - this.anInt5094 * 7518119) * arg0 / 255) * -960679713;
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(Lclient!ri;I)V", line = 85)
	public void method30291(@OriginalArg(0) Class510 arg0) {
		if (this.aBoolean776) {
			this.anInt5094 = this.anInt5104 * -1251475511;
		} else if (arg0 != null && arg0.aBoolean776) {
			this.anInt5094 = 529372905 - arg0.anInt5104 * -1251475511;
		} else {
			this.anInt5094 = 0;
		}
		this.aBoolean776 = true;
		this.aClass510_1 = arg0;
		this.anInt5104 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(I)V", line = 85)
	public static void method30292() {
		Class156.anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "(I)V", line = 100)
	public void method30293() {
		this.aBoolean776 = false;
		this.aClass510_1 = null;
		this.anInt5104 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "()V", line = 100)
	public void method30294() {
		this.aBoolean776 = false;
		this.aClass510_1 = null;
		this.anInt5104 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "(I)Z", line = 106)
	public boolean method30295() {
		return this.aBoolean776;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()Z", line = 106)
	public boolean method30296() {
		return this.aBoolean776;
	}

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "()Z", line = 106)
	public boolean method30297() {
		return this.aBoolean776;
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "()Z", line = 106)
	public boolean method30298() {
		return this.aBoolean776;
	}

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "(I)Lclient!ri;", line = 110)
	public Class510 method30299() {
		return this.aClass510_1;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()Lclient!ri;", line = 110)
	public Class510 method30300() {
		return this.aClass510_1;
	}

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "()Lclient!ri;", line = 110)
	public Class510 method30301() {
		return this.aClass510_1;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "()Lclient!ri;", line = 110)
	public Class510 method30302() {
		return this.aClass510_1;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!dx;II)Z", line = 114)
	public boolean method30303(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5095 * 1151834243) {
			this.anInt5095 = arg1 * 1387230763;
			@Pc(14) int local14 = Class462.method29538(arg1);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5096 * 1510190127) {
				this.anInt5096 = local14 * 1734679247;
				this.aClass83_31 = null;
			}
			if (this.aClass521Array2 != null) {
				this.anInt5105 = 0;
				@Pc(49) int[] local49 = new int[this.aClass521Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass521Array2.length; local51++) {
					@Pc(61) Class521 local61 = this.aClass521Array2[local51];
					if (local61.method30584(this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, this.anInt5095 * 1151834243)) {
						local49[this.anInt5105 * -446272903] = local61.anInt5140;
						this.aClass521Array1[(this.anInt5105 += 886038473) * -446272903 - 1] = local61;
					}
				}
				Class197.method25472(local49, this.aClass521Array1, 0, this.anInt5105 * -446272903 - 1);
			}
			this.aBoolean777 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean777) {
			this.aBoolean777 = false;
			for (@Pc(135) int local135 = this.anInt5105 * -446272903 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass521Array1[local135].method30585(arg0, this.aClass521_1);
				this.aBoolean777 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20178()) {
			this.aClass84_5 = null;
		} else if (this.aClass84_5 == null && this.anInt5102 * 178524317 >= 0) {
			this.method30307(arg0);
		}
		if (this.aClass510_1 != null && this.aClass510_1 != this) {
			this.aClass510_1.method30293();
			local122 |= this.aClass510_1.method30306(arg0, arg1, arg2);
		}
		return local122;
	}

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "(Lclient!dx;II)Z", line = 114)
	public boolean method30304(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5095 * 1151834243) {
			this.anInt5095 = arg1 * 1387230763;
			@Pc(14) int local14 = Class462.method29538(arg1);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5096 * 1510190127) {
				this.anInt5096 = local14 * 1734679247;
				this.aClass83_31 = null;
			}
			if (this.aClass521Array2 != null) {
				this.anInt5105 = 0;
				@Pc(49) int[] local49 = new int[this.aClass521Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass521Array2.length; local51++) {
					@Pc(61) Class521 local61 = this.aClass521Array2[local51];
					if (local61.method30584(this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, this.anInt5095 * 1151834243)) {
						local49[this.anInt5105 * -446272903] = local61.anInt5140;
						this.aClass521Array1[(this.anInt5105 += 886038473) * -446272903 - 1] = local61;
					}
				}
				Class197.method25472(local49, this.aClass521Array1, 0, this.anInt5105 * -446272903 - 1);
			}
			this.aBoolean777 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean777) {
			this.aBoolean777 = false;
			for (@Pc(135) int local135 = this.anInt5105 * -446272903 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass521Array1[local135].method30585(arg0, this.aClass521_1);
				this.aBoolean777 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20178()) {
			this.aClass84_5 = null;
		} else if (this.aClass84_5 == null && this.anInt5102 * 178524317 >= 0) {
			this.method30307(arg0);
		}
		if (this.aClass510_1 != null && this.aClass510_1 != this) {
			this.aClass510_1.method30293();
			local122 |= this.aClass510_1.method30306(arg0, arg1, arg2);
		}
		return local122;
	}

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "(Lclient!dx;II)Z", line = 114)
	public boolean method30305(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5095 * 1151834243) {
			this.anInt5095 = arg1 * 1387230763;
			@Pc(14) int local14 = Class462.method29538(arg1);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5096 * 1510190127) {
				this.anInt5096 = local14 * 1734679247;
				this.aClass83_31 = null;
			}
			if (this.aClass521Array2 != null) {
				this.anInt5105 = 0;
				@Pc(49) int[] local49 = new int[this.aClass521Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass521Array2.length; local51++) {
					@Pc(61) Class521 local61 = this.aClass521Array2[local51];
					if (local61.method30584(this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, this.anInt5095 * 1151834243)) {
						local49[this.anInt5105 * -446272903] = local61.anInt5140;
						this.aClass521Array1[(this.anInt5105 += 886038473) * -446272903 - 1] = local61;
					}
				}
				Class197.method25472(local49, this.aClass521Array1, 0, this.anInt5105 * -446272903 - 1);
			}
			this.aBoolean777 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean777) {
			this.aBoolean777 = false;
			for (@Pc(135) int local135 = this.anInt5105 * -446272903 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass521Array1[local135].method30585(arg0, this.aClass521_1);
				this.aBoolean777 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20178()) {
			this.aClass84_5 = null;
		} else if (this.aClass84_5 == null && this.anInt5102 * 178524317 >= 0) {
			this.method30307(arg0);
		}
		if (this.aClass510_1 != null && this.aClass510_1 != this) {
			this.aClass510_1.method30293();
			local122 |= this.aClass510_1.method30306(arg0, arg1, arg2);
		}
		return local122;
	}

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "(Lclient!dx;III)Z", line = 114)
	public boolean method30306(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5095 * 1151834243) {
			this.anInt5095 = arg1 * 1387230763;
			@Pc(14) int local14 = Class462.method29538(arg1);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5096 * 1510190127) {
				this.anInt5096 = local14 * 1734679247;
				this.aClass83_31 = null;
			}
			if (this.aClass521Array2 != null) {
				this.anInt5105 = 0;
				@Pc(49) int[] local49 = new int[this.aClass521Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass521Array2.length; local51++) {
					@Pc(61) Class521 local61 = this.aClass521Array2[local51];
					if (local61.method30584(this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, this.anInt5095 * 1151834243)) {
						local49[this.anInt5105 * -446272903] = local61.anInt5140;
						this.aClass521Array1[(this.anInt5105 += 886038473) * -446272903 - 1] = local61;
					}
				}
				Class197.method25472(local49, this.aClass521Array1, 0, this.anInt5105 * -446272903 - 1);
			}
			this.aBoolean777 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean777) {
			this.aBoolean777 = false;
			for (@Pc(135) int local135 = this.anInt5105 * -446272903 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass521Array1[local135].method30585(arg0, this.aClass521_1);
				this.aBoolean777 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20178()) {
			this.aClass84_5 = null;
		} else if (this.aClass84_5 == null && this.anInt5102 * 178524317 >= 0) {
			this.method30307(arg0);
		}
		if (this.aClass510_1 != null && this.aClass510_1 != this) {
			this.aClass510_1.method30293();
			local122 |= this.aClass510_1.method30306(arg0, arg1, arg2);
		}
		return local122;
	}

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "(Lclient!dx;I)V", line = 161)
	void method30307(@OriginalArg(0) Class86 arg0) {
		try {
			@Pc(7) boolean local7 = Class466.aClass478_124.method29733(this.anInt5102 * 178524317);
			if (local7) {
				arg0.method20126(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class216 local25 = Class216.method25655(Class466.aClass478_124, this.anInt5102 * 178524317, 0);
				this.aClass84_5 = arg0.method20115(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass84_5.method6834();
				if (local38 == null) {
					this.aByteArray89 = null;
				} else {
					this.aByteArray89 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray89, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(Lclient!dx;IIIIIIIIII)V", line = 184)
	public void method30308(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		this.method30312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg8, true, false);
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 184)
	public void method30309(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		this.method30312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg8, true, false);
	}

	@OriginalMember(owner = "client!ri", name = "aj", descriptor = "(Lclient!dx;IIIIIIIII)V", line = 184)
	public void method30310(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		this.method30312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg8, true, false);
	}

	@OriginalMember(owner = "client!ri", name = "ai", descriptor = "(Lclient!dx;IIIIIIIIIZZ)V", line = 188)
	public void method30311(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean776) {
			local1 = this.anInt5104 * -1775072481;
		}
		if (this.aClass510_1 == null) {
			if (this.anInt5092 * 1098175913 == -1) {
				arg0.method20088(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1);
			return;
		}
		@Pc(15) Class510 local15 = this;
		@Pc(18) Class510 local18 = this.aClass510_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass510_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1);
		local18.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1);
	}

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "(Lclient!dx;IIIIIIIIIZZI)V", line = 188)
	public void method30312(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean776) {
			local1 = this.anInt5104 * -1775072481;
		}
		if (this.aClass510_1 == null) {
			if (this.anInt5092 * 1098175913 == -1) {
				arg0.method20088(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1);
			return;
		}
		@Pc(15) Class510 local15 = this;
		@Pc(18) Class510 local18 = this.aClass510_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass510_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1);
		local18.method30313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1);
	}

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "(Lclient!dx;IIIIIIIIIZZIB)V", line = 210)
	void method30313(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20012();
		arg0.method20014();
		if (this.aClass84_5 == null) {
			arg0.method20125(2, 0);
			arg7 = arg7 + arg1 & 0x3FFF;
			if (this.anInt5092 * 1098175913 == -1 || this.anInt5096 * 1510190127 == 0) {
				arg0.method20088(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class215 local40 = Class192.aClass209_10.method25584(this.anInt5092 * 1098175913);
				if (this.aClass83_31 == null && Class108.anInterface24_11.method4231(Class596.aClass596_2, local40.anInt3713 * 1604666399, local40.aClass597_2 == Class597.aClass597_5 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127)) {
					@Pc(111) int[] local111 = Class597.aClass597_5 == local40.aClass597_2 ? Class108.anInterface24_11.method4225(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127) : Class108.anInterface24_11.method4224(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127);
					this.anInt5093 = local111[0] * -1276147587;
					this.anInt5100 = local111[local111.length - 1] * -148946821;
					this.aClass83_31 = arg0.method20010(local111, 0, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495);
				}
				@Pc(160) int local160 = local3 == 255 ? (Class597.aClass597_5 == local40.aClass597_2 ? 1 : 0) : 1;
				if (local160 == 1 && arg10) {
					arg0.method20088(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass83_31 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = (arg4 - arg5) / 2 + arg5 * arg7 / 4096; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass571_1 == Class571.aClass571_2) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass83_31.method18129(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
						}
						if ((this.anInt5093 * 927740117 & 0xFF000000) != 0) {
							arg0.method19986(0, 0, arg4, local183 + 1 + arg3, this.anInt5093 * 927740117);
						}
						if ((this.anInt5100 * 468623027 & 0xFF000000) != 0) {
							arg0.method19986(0, arg5 + local183 + arg3, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5100 * 468623027);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass83_31.method18129(local218 + arg2, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class442 local375 = arg0.method20124();
			@Pc(378) Class442 local378 = arg0.method20124();
			local375.aFloatArray109[2] = local375.aFloatArray109[3];
			local375.aFloatArray109[6] = local375.aFloatArray109[7];
			local375.aFloatArray109[10] = local375.aFloatArray109[11];
			local375.aFloatArray109[14] = local375.aFloatArray109[15];
			arg0.method20123(local375);
			this.method30316(arg0, arg6, arg7, arg8, arg12);
			arg0.method20123(local378);
		} else {
			if (arg10) {
				arg0.method20125(3, arg9);
			}
			this.method30316(arg0, arg6, arg7, arg8, arg12);
		}
		for (@Pc(446) int local446 = this.anInt5105 * -446272903 - 1; local446 >= 0; local446--) {
			this.aClass521Array1[local446].method30589(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, local3);
		}
		arg0.method20125(2, 0);
		arg0.method20017();
	}

	@OriginalMember(owner = "client!ri", name = "ag", descriptor = "(Lclient!dx;IIIIIIIIIZZI)V", line = 210)
	void method30314(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20012();
		arg0.method20014();
		if (this.aClass84_5 == null) {
			arg0.method20125(2, 0);
			arg7 = arg7 + arg1 & 0x3FFF;
			if (this.anInt5092 * 1098175913 == -1 || this.anInt5096 * 1510190127 == 0) {
				arg0.method20088(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class215 local40 = Class192.aClass209_10.method25584(this.anInt5092 * 1098175913);
				if (this.aClass83_31 == null && Class108.anInterface24_11.method4231(Class596.aClass596_2, local40.anInt3713 * 1604666399, local40.aClass597_2 == Class597.aClass597_5 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127)) {
					@Pc(111) int[] local111 = Class597.aClass597_5 == local40.aClass597_2 ? Class108.anInterface24_11.method4225(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127) : Class108.anInterface24_11.method4224(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127);
					this.anInt5093 = local111[0] * -1276147587;
					this.anInt5100 = local111[local111.length - 1] * -148946821;
					this.aClass83_31 = arg0.method20010(local111, 0, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495);
				}
				@Pc(160) int local160 = local3 == 255 ? (Class597.aClass597_5 == local40.aClass597_2 ? 1 : 0) : 1;
				if (local160 == 1 && arg10) {
					arg0.method20088(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass83_31 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = (arg4 - arg5) / 2 + arg5 * arg7 / 4096; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass571_1 == Class571.aClass571_2) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass83_31.method18129(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
						}
						if ((this.anInt5093 * 927740117 & 0xFF000000) != 0) {
							arg0.method19986(0, 0, arg4, local183 + 1 + arg3, this.anInt5093 * 927740117);
						}
						if ((this.anInt5100 * 468623027 & 0xFF000000) != 0) {
							arg0.method19986(0, arg5 + local183 + arg3, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5100 * 468623027);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass83_31.method18129(local218 + arg2, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class442 local375 = arg0.method20124();
			@Pc(378) Class442 local378 = arg0.method20124();
			local375.aFloatArray109[2] = local375.aFloatArray109[3];
			local375.aFloatArray109[6] = local375.aFloatArray109[7];
			local375.aFloatArray109[10] = local375.aFloatArray109[11];
			local375.aFloatArray109[14] = local375.aFloatArray109[15];
			arg0.method20123(local375);
			this.method30316(arg0, arg6, arg7, arg8, arg12);
			arg0.method20123(local378);
		} else {
			if (arg10) {
				arg0.method20125(3, arg9);
			}
			this.method30316(arg0, arg6, arg7, arg8, arg12);
		}
		for (@Pc(446) int local446 = this.anInt5105 * -446272903 - 1; local446 >= 0; local446--) {
			this.aClass521Array1[local446].method30589(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, local3);
		}
		arg0.method20125(2, 0);
		arg0.method20017();
	}

	@OriginalMember(owner = "client!ri", name = "al", descriptor = "(Lclient!dx;IIIIIIIIIZZI)V", line = 210)
	void method30315(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20012();
		arg0.method20014();
		if (this.aClass84_5 == null) {
			arg0.method20125(2, 0);
			arg7 = arg7 + arg1 & 0x3FFF;
			if (this.anInt5092 * 1098175913 == -1 || this.anInt5096 * 1510190127 == 0) {
				arg0.method20088(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class215 local40 = Class192.aClass209_10.method25584(this.anInt5092 * 1098175913);
				if (this.aClass83_31 == null && Class108.anInterface24_11.method4231(Class596.aClass596_2, local40.anInt3713 * 1604666399, local40.aClass597_2 == Class597.aClass597_5 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127)) {
					@Pc(111) int[] local111 = Class597.aClass597_5 == local40.aClass597_2 ? Class108.anInterface24_11.method4225(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127) : Class108.anInterface24_11.method4224(Class596.aClass596_2, local40.anInt3713 * 1604666399, 0.7F, this.anInt5096 * 1510190127, this.anInt5096 * 1510190127);
					this.anInt5093 = local111[0] * -1276147587;
					this.anInt5100 = local111[local111.length - 1] * -148946821;
					this.aClass83_31 = arg0.method20010(local111, 0, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495, local40.anInt3714 * 1264459495);
				}
				@Pc(160) int local160 = local3 == 255 ? (Class597.aClass597_5 == local40.aClass597_2 ? 1 : 0) : 1;
				if (local160 == 1 && arg10) {
					arg0.method20088(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass83_31 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = (arg4 - arg5) / 2 + arg5 * arg7 / 4096; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass571_1 == Class571.aClass571_2) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass83_31.method18129(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
						}
						if ((this.anInt5093 * 927740117 & 0xFF000000) != 0) {
							arg0.method19986(0, 0, arg4, local183 + 1 + arg3, this.anInt5093 * 927740117);
						}
						if ((this.anInt5100 * 468623027 & 0xFF000000) != 0) {
							arg0.method19986(0, arg5 + local183 + arg3, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5100 * 468623027);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass83_31.method18129(local218 + arg2, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local160);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class442 local375 = arg0.method20124();
			@Pc(378) Class442 local378 = arg0.method20124();
			local375.aFloatArray109[2] = local375.aFloatArray109[3];
			local375.aFloatArray109[6] = local375.aFloatArray109[7];
			local375.aFloatArray109[10] = local375.aFloatArray109[11];
			local375.aFloatArray109[14] = local375.aFloatArray109[15];
			arg0.method20123(local375);
			this.method30316(arg0, arg6, arg7, arg8, arg12);
			arg0.method20123(local378);
		} else {
			if (arg10) {
				arg0.method20125(3, arg9);
			}
			this.method30316(arg0, arg6, arg7, arg8, arg12);
		}
		for (@Pc(446) int local446 = this.anInt5105 * -446272903 - 1; local446 >= 0; local446--) {
			this.aClass521Array1[local446].method30589(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5099 * 1946060627, this.anInt5097 * 108985433, this.anInt5098 * -1380844273, local3);
		}
		arg0.method20125(2, 0);
		arg0.method20017();
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(Lclient!dx;IIIIB)V", line = 282)
	void method30316(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class455 local2 = arg0.method20294();
		@Pc(6) Class455 local6 = new Class455();
		local6.method29428(0.0F, 0.0F, 0.0F);
		local6.method29420(0.0F, -1.0F, 0.0F, Class436.method28911(-arg2 & 0x3FFF));
		local6.method29420(-1.0F, 0.0F, 0.0F, Class436.method28911(-arg1 & 0x3FFF));
		local6.method29420(0.0F, 0.0F, -1.0F, Class436.method28911(-arg3 & 0x3FFF));
		arg0.method20121(local6);
		@Pc(48) Class455 local48 = new Class455();
		if (arg4 != this.anInt5103 * -120566155) {
			this.aClass84_5.method6865((byte) arg4, this.aByteArray89);
			this.anInt5103 = arg4 * -1723035171;
		}
		this.aClass84_5.method6813(local48, null, 0);
		arg0.method20121(local2);
	}

	@OriginalMember(owner = "client!ri", name = "ao", descriptor = "(Lclient!dx;IIII)V", line = 282)
	void method30317(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class455 local2 = arg0.method20294();
		@Pc(6) Class455 local6 = new Class455();
		local6.method29428(0.0F, 0.0F, 0.0F);
		local6.method29420(0.0F, -1.0F, 0.0F, Class436.method28911(-arg2 & 0x3FFF));
		local6.method29420(-1.0F, 0.0F, 0.0F, Class436.method28911(-arg1 & 0x3FFF));
		local6.method29420(0.0F, 0.0F, -1.0F, Class436.method28911(-arg3 & 0x3FFF));
		arg0.method20121(local6);
		@Pc(48) Class455 local48 = new Class455();
		if (arg4 != this.anInt5103 * -120566155) {
			this.aClass84_5.method6865((byte) arg4, this.aByteArray89);
			this.anInt5103 = arg4 * -1723035171;
		}
		this.aClass84_5.method6813(local48, null, 0);
		arg0.method20121(local2);
	}

	@OriginalMember(owner = "client!ri", name = "ae", descriptor = "(Lclient!aqm;B)I", line = 1087)
	public static int method30318(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (Class683.aBoolean861) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			@Pc(12) int local12 = arg0.anInt2987 * -1986934021;
			if (Class588.method31743(local12)) {
				return 1;
			} else if (Class693.method36369(local12)) {
				return 2;
			} else if (Class429.method28810(local12)) {
				return 3;
			} else if (Class77_Sub4.method13217(local12)) {
				return 4;
			} else if (Class82.method2023(local12)) {
				return 7;
			} else if (local12 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}
}
