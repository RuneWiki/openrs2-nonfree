package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ams")
public class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ams", name = "b", descriptor = "[[I")
	int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ams", name = "u", descriptor = "[Ljava/lang/String;")
	String[] aStringArray8;

	@OriginalMember(owner = "client!ams", name = "y", descriptor = "[I")
	int[] anIntArray261;

	@OriginalMember(owner = "client!ams", name = "c", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!ams", name = "s", descriptor = "Lclient!xm;")
	Class580 aClass580_1;

	@OriginalMember(owner = "client!ams", name = "z", descriptor = "Z")
	public boolean aBoolean475 = true;

	@OriginalMember(owner = "client!ams", name = "<init>", descriptor = "()V", line = 16)
	Class3_Sub1_Sub13() {
	}

	@OriginalMember(owner = "client!ams", name = "b", descriptor = "(Lclient!ahb;)V", line = 20)
	void method19283(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19275(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ams", name = "c", descriptor = "(Lclient!ahb;)V", line = 20)
	void method19284(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19275(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ams", name = "p", descriptor = "(Lclient!ahb;I)V", line = 20)
	void method19286(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19275(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ams", name = "z", descriptor = "(Lclient!ahb;)V", line = 20)
	void method19290(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method19275(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ams", name = "a", descriptor = "(Lclient!ahb;IB)V", line = 27)
	void method19275(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray8 = Class230.method24546(arg0.method20283(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method20269();
			this.anIntArray262 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray262[local24] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method20269();
			this.anIntArray261 = new int[local18];
			this.anIntArrayArray43 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method20271();
				@Pc(65) Class502 local65 = Class437.method28028(local61);
				if (local65 != null) {
					this.anIntArray261[local24] = local61;
					this.anIntArrayArray43[local24] = new int[local65.anInt5246 * -653598491];
					for (@Pc(83) int local83 = 0; local83 < local65.anInt5246 * -653598491; local83++) {
						this.anIntArrayArray43[local24][local83] = arg0.method20271();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean475 = false;
		}
	}

	@OriginalMember(owner = "client!ams", name = "j", descriptor = "(Lclient!ahb;I)V", line = 27)
	void method19296(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray8 = Class230.method24546(arg0.method20283(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method20269();
			this.anIntArray262 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray262[local24] = arg0.method20271();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method20269();
			this.anIntArray261 = new int[local18];
			this.anIntArrayArray43 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method20271();
				@Pc(65) Class502 local65 = Class437.method28028(local61);
				if (local65 != null) {
					this.anIntArray261[local24] = local61;
					this.anIntArrayArray43[local24] = new int[local65.anInt5246 * -653598491];
					for (@Pc(83) int local83 = 0; local83 < local65.anInt5246 * -653598491; local83++) {
						this.anIntArrayArray43[local24][local83] = arg0.method20271();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean475 = false;
		}
	}

	@OriginalMember(owner = "client!ams", name = "aj", descriptor = "(Lclient!ahb;[I)V", line = 55)
	public void method19274(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray261 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method19280(local6).anInt5247 * 206977401;
			if (local23 > 0) {
				arg0.method20278((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "g", descriptor = "(Lclient!ahb;[IB)V", line = 55)
	public void method19276(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray261 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method19280(local6).anInt5247 * 206977401;
			if (local23 > 0) {
				arg0.method20278((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "i", descriptor = "(Lclient!ahb;[I)V", line = 55)
	public void method19288(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray261 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method19280(local6).anInt5247 * 206977401;
			if (local23 > 0) {
				arg0.method20278((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "f", descriptor = "(Lclient!ahb;[I)V", line = 55)
	public void method19289(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray261 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method19280(local6).anInt5247 * 206977401;
			if (local23 > 0) {
				arg0.method20278((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "n", descriptor = "(Lclient!ahb;[I)V", line = 55)
	public void method19299(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray261 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray261.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method19280(local6).anInt5247 * 206977401;
			if (local23 > 0) {
				arg0.method20278((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "l", descriptor = "(Lclient!ahb;I)Ljava/lang/String;", line = 63)
	public String method19277(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray261 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray261.length; local10++) {
				local4.append(this.aStringArray8[local10]);
				local4.append(this.aClass580_1.method33212(this.method19280(local10), this.anIntArrayArray43[local10], arg0.method20388(Class437.method28028(this.anIntArray261[local10]).anInt5249 * -281988665)));
			}
		}
		local4.append(this.aStringArray8[this.aStringArray8.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "as", descriptor = "(Lclient!ahb;)Ljava/lang/String;", line = 63)
	public String method19291(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray261 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray261.length; local10++) {
				local4.append(this.aStringArray8[local10]);
				local4.append(this.aClass580_1.method33212(this.method19280(local10), this.anIntArrayArray43[local10], arg0.method20388(Class437.method28028(this.anIntArray261[local10]).anInt5249 * -281988665)));
			}
		}
		local4.append(this.aStringArray8[this.aStringArray8.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "ai", descriptor = "(Lclient!ahb;)Ljava/lang/String;", line = 63)
	public String method19295(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray261 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray261.length; local10++) {
				local4.append(this.aStringArray8[local10]);
				local4.append(this.aClass580_1.method33212(this.method19280(local10), this.anIntArrayArray43[local10], arg0.method20388(Class437.method28028(this.anIntArray261[local10]).anInt5249 * -281988665)));
			}
		}
		local4.append(this.aStringArray8[this.aStringArray8.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "h", descriptor = "(I)Ljava/lang/String;", line = 75)
	public String method19278() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray8 == null) {
			return "";
		}
		local4.append(this.aStringArray8[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray8.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray8[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "av", descriptor = "()Ljava/lang/String;", line = 75)
	public String method19287() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray8 == null) {
			return "";
		}
		local4.append(this.aStringArray8[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray8.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray8[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "aq", descriptor = "()Ljava/lang/String;", line = 75)
	public String method19293() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray8 == null) {
			return "";
		}
		local4.append(this.aStringArray8[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray8.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray8[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!ams", name = "x", descriptor = "(I)I", line = 86)
	public int method19279() {
		return this.anIntArray261 == null ? 0 : this.anIntArray261.length;
	}

	@OriginalMember(owner = "client!ams", name = "ax", descriptor = "()I", line = 86)
	public int method19285() {
		return this.anIntArray261 == null ? 0 : this.anIntArray261.length;
	}

	@OriginalMember(owner = "client!ams", name = "s", descriptor = "(II)Lclient!uh;", line = 91)
	public Class502 method19280(@OriginalArg(0) int arg0) {
		return this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length ? null : Class437.method28028(this.anIntArray261[arg0]);
	}

	@OriginalMember(owner = "client!ams", name = "az", descriptor = "(I)Lclient!uh;", line = 91)
	public Class502 method19282(@OriginalArg(0) int arg0) {
		return this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length ? null : Class437.method28028(this.anIntArray261[arg0]);
	}

	@OriginalMember(owner = "client!ams", name = "u", descriptor = "(IIB)I", line = 96)
	public int method19281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ams", name = "ap", descriptor = "(II)I", line = 96)
	public int method19294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ams", name = "al", descriptor = "(II)I", line = 96)
	public int method19297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ams", name = "ao", descriptor = "(II)I", line = 96)
	public int method19298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ams", name = "ab", descriptor = "(II)I", line = 96)
	public int method19300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray261 == null || arg0 < 0 || arg0 > this.anIntArray261.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ams", name = "y", descriptor = "(S)V", line = 102)
	void method19292() {
		if (this.anIntArray262 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray262.length; local4++) {
				this.anIntArray262[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "au", descriptor = "()V", line = 102)
	void method19301() {
		if (this.anIntArray262 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray262.length; local4++) {
				this.anIntArray262[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ams", name = "ay", descriptor = "()V", line = 102)
	void method19302() {
		if (this.anIntArray262 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray262.length; local4++) {
				this.anIntArray262[local4] |= 0x8000;
			}
		}
	}
}
