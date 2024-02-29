package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arh")
public class Class77_Sub1_Sub13 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arh", name = "q", descriptor = "[Ljava/lang/String;")
	String[] aStringArray22;

	@OriginalMember(owner = "client!arh", name = "t", descriptor = "Lclient!abq;")
	Class41 aClass41_1;

	@OriginalMember(owner = "client!arh", name = "x", descriptor = "[I")
	int[] anIntArray284;

	@OriginalMember(owner = "client!arh", name = "s", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!arh", name = "d", descriptor = "[[I")
	int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!arh", name = "r", descriptor = "Z")
	public boolean aBoolean498 = true;

	@OriginalMember(owner = "client!arh", name = "<init>", descriptor = "()V", line = 16)
	Class77_Sub1_Sub13() {
	}

	@OriginalMember(owner = "client!arh", name = "p", descriptor = "(Lclient!akv;I)V", line = 20)
	void method22299(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method22303(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!arh", name = "d", descriptor = "(Lclient!akv;)V", line = 20)
	void method22300(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method22303(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!arh", name = "s", descriptor = "(Lclient!akv;I)V", line = 27)
	void method22301(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray22 = Class398.method28452(arg0.method22523(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22478();
			this.anIntArray285 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray285[local24] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22478();
			this.anIntArray284 = new int[local18];
			this.anIntArrayArray43 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22483();
				@Pc(65) Class638 local65 = Class82.method1998(local61);
				if (local65 != null) {
					this.anIntArray284[local24] = local61;
					this.anIntArrayArray43[local24] = new int[local65.anInt5717 * 1087638781];
					for (@Pc(83) int local83 = 0; local83 < local65.anInt5717 * 1087638781; local83++) {
						this.anIntArrayArray43[local24][local83] = arg0.method22483();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean498 = false;
		}
	}

	@OriginalMember(owner = "client!arh", name = "r", descriptor = "(Lclient!akv;I)V", line = 27)
	void method22302(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray22 = Class398.method28452(arg0.method22523(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22478();
			this.anIntArray285 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray285[local24] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22478();
			this.anIntArray284 = new int[local18];
			this.anIntArrayArray43 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22483();
				@Pc(65) Class638 local65 = Class82.method1998(local61);
				if (local65 != null) {
					this.anIntArray284[local24] = local61;
					this.anIntArrayArray43[local24] = new int[local65.anInt5717 * 1087638781];
					for (@Pc(83) int local83 = 0; local83 < local65.anInt5717 * 1087638781; local83++) {
						this.anIntArrayArray43[local24][local83] = arg0.method22483();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean498 = false;
		}
	}

	@OriginalMember(owner = "client!arh", name = "c", descriptor = "(Lclient!akv;IS)V", line = 27)
	void method22303(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray22 = Class398.method28452(arg0.method22523(), '<');
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22478();
			this.anIntArray285 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray285[local24] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22478();
			this.anIntArray284 = new int[local18];
			this.anIntArrayArray43 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22483();
				@Pc(65) Class638 local65 = Class82.method1998(local61);
				if (local65 != null) {
					this.anIntArray284[local24] = local61;
					this.anIntArrayArray43[local24] = new int[local65.anInt5717 * 1087638781];
					for (@Pc(83) int local83 = 0; local83 < local65.anInt5717 * 1087638781; local83++) {
						this.anIntArrayArray43[local24][local83] = arg0.method22483();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean498 = false;
		}
	}

	@OriginalMember(owner = "client!arh", name = "v", descriptor = "(Lclient!akv;[II)V", line = 55)
	public void method22304(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray284 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray284.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method22318(local6).anInt5715 * 1319261785;
			if (local23 > 0) {
				arg0.method22432((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "z", descriptor = "(Lclient!akv;[I)V", line = 55)
	public void method22305(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray284 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray284.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method22318(local6).anInt5715 * 1319261785;
			if (local23 > 0) {
				arg0.method22432((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "j", descriptor = "(Lclient!akv;[I)V", line = 55)
	public void method22306(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray284 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray284.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method22318(local6).anInt5715 * 1319261785;
			if (local23 > 0) {
				arg0.method22432((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "g", descriptor = "(Lclient!akv;[I)V", line = 55)
	public void method22307(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray284 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray284.length && local6 < arg1.length; local6++) {
			@Pc(23) int local23 = this.method22318(local6).anInt5715 * 1319261785;
			if (local23 > 0) {
				arg0.method22432((long) arg1[local6], local23);
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "n", descriptor = "(Lclient!akv;)Ljava/lang/String;", line = 63)
	public String method22308(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray284 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray284.length; local10++) {
				local4.append(this.aStringArray22[local10]);
				local4.append(this.aClass41_1.method693(this.method22318(local10), this.anIntArrayArray43[local10], arg0.method22515(Class82.method1998(this.anIntArray284[local10]).anInt5716 * 1576396751)));
			}
		}
		local4.append(this.aStringArray22[this.aStringArray22.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "l", descriptor = "(Lclient!akv;I)Ljava/lang/String;", line = 63)
	public String method22309(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray284 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray284.length; local10++) {
				local4.append(this.aStringArray22[local10]);
				local4.append(this.aClass41_1.method693(this.method22318(local10), this.anIntArrayArray43[local10], arg0.method22515(Class82.method1998(this.anIntArray284[local10]).anInt5716 * 1576396751)));
			}
		}
		local4.append(this.aStringArray22[this.aStringArray22.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "b", descriptor = "(Lclient!akv;)Ljava/lang/String;", line = 63)
	public String method22310(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray284 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray284.length; local10++) {
				local4.append(this.aStringArray22[local10]);
				local4.append(this.aClass41_1.method693(this.method22318(local10), this.anIntArrayArray43[local10], arg0.method22515(Class82.method1998(this.anIntArray284[local10]).anInt5716 * 1576396751)));
			}
		}
		local4.append(this.aStringArray22[this.aStringArray22.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "y", descriptor = "(S)Ljava/lang/String;", line = 75)
	public String method22311() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray22 == null) {
			return "";
		}
		local4.append(this.aStringArray22[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray22.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray22[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "m", descriptor = "()Ljava/lang/String;", line = 75)
	public String method22312() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray22 == null) {
			return "";
		}
		local4.append(this.aStringArray22[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray22.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray22[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "a", descriptor = "()Ljava/lang/String;", line = 75)
	public String method22313() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray22 == null) {
			return "";
		}
		local4.append(this.aStringArray22[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray22.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray22[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!arh", name = "w", descriptor = "(B)I", line = 86)
	public int method22314() {
		return this.anIntArray284 == null ? 0 : this.anIntArray284.length;
	}

	@OriginalMember(owner = "client!arh", name = "ai", descriptor = "()I", line = 86)
	public int method22315() {
		return this.anIntArray284 == null ? 0 : this.anIntArray284.length;
	}

	@OriginalMember(owner = "client!arh", name = "ag", descriptor = "()I", line = 86)
	public int method22316() {
		return this.anIntArray284 == null ? 0 : this.anIntArray284.length;
	}

	@OriginalMember(owner = "client!arh", name = "al", descriptor = "()I", line = 86)
	public int method22317() {
		return this.anIntArray284 == null ? 0 : this.anIntArray284.length;
	}

	@OriginalMember(owner = "client!arh", name = "t", descriptor = "(II)Lclient!xb;", line = 91)
	public Class638 method22318(@OriginalArg(0) int arg0) {
		return this.anIntArray284 == null || arg0 < 0 || arg0 > this.anIntArray284.length ? null : Class82.method1998(this.anIntArray284[arg0]);
	}

	@OriginalMember(owner = "client!arh", name = "ao", descriptor = "(I)Lclient!xb;", line = 91)
	public Class638 method22319(@OriginalArg(0) int arg0) {
		return this.anIntArray284 == null || arg0 < 0 || arg0 > this.anIntArray284.length ? null : Class82.method1998(this.anIntArray284[arg0]);
	}

	@OriginalMember(owner = "client!arh", name = "au", descriptor = "(II)I", line = 96)
	public int method22320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray284 == null || arg0 < 0 || arg0 > this.anIntArray284.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!arh", name = "q", descriptor = "(III)I", line = 96)
	public int method22321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray284 == null || arg0 < 0 || arg0 > this.anIntArray284.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!arh", name = "ak", descriptor = "(II)I", line = 96)
	public int method22322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray284 == null || arg0 < 0 || arg0 > this.anIntArray284.length) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray43[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!arh", name = "x", descriptor = "(B)V", line = 102)
	void method22323() {
		if (this.anIntArray285 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray285.length; local5++) {
				this.anIntArray285[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "ax", descriptor = "()V", line = 102)
	void method22324() {
		if (this.anIntArray285 != null) {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray285.length; local5++) {
				this.anIntArray285[local5] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!arh", name = "lz", descriptor = "(Lclient!yf;B)V", line = 6538)
	static final void method22325(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class575.method31601(local16, local22, arg0);
	}
}
