package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public class Class488 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public static final int anInt5186 = 1073741824;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	static final int anInt5187 = 1073741823;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public static final int anInt5189 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray5;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "[I")
	static final int[] anIntArray474 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!ew;")
	static Class161 aClass161_55 = new Class161(260);

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Lclient!ew;")
	static Class161 aClass161_56 = new Class161(5);

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	int anInt5188;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
	int[] anIntArray472;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "Z")
	public boolean aBoolean805;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "[Lclient!yo;")
	Class605[] aClass605Array1;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "J")
	long aLong280;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "J")
	long aLong281;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public int anInt5185 = -949654721;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "(I[I[Lclient!yo;[IZII)V", line = 43)
	public void method29194(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class605[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 != this.anInt5188 * -699192439) {
			this.anInt5188 = arg0 * -920339783;
		}
		this.anIntArray472 = arg1;
		this.aClass605Array1 = arg2;
		this.anIntArray473 = arg3;
		this.aBoolean805 = arg4;
		this.anInt5185 = arg5 * 949654721;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I[I[Lclient!yo;[IZI)V", line = 43)
	public void method29203(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class605[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 != this.anInt5188 * -699192439) {
			this.anInt5188 = arg0 * -920339783;
		}
		this.anIntArray472 = arg1;
		this.aClass605Array1 = arg2;
		this.anIntArray473 = arg3;
		this.aBoolean805 = arg4;
		this.anInt5185 = arg5 * 949654721;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "(I[I[Lclient!yo;[IZI)V", line = 43)
	public void method29204(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class605[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 != this.anInt5188 * -699192439) {
			this.anInt5188 = arg0 * -920339783;
		}
		this.anIntArray472 = arg1;
		this.aClass605Array1 = arg2;
		this.anIntArray473 = arg3;
		this.aBoolean805 = arg4;
		this.anInt5185 = arg5 * 949654721;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I[I[Lclient!yo;[IZI)V", line = 43)
	public void method29205(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class605[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg0 != this.anInt5188 * -699192439) {
			this.anInt5188 = arg0 * -920339783;
		}
		this.anIntArray472 = arg1;
		this.aClass605Array1 = arg2;
		this.anIntArray473 = arg3;
		this.aBoolean805 = arg4;
		this.anInt5185 = arg5 * 949654721;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILclient!hp;B)V", line = 55)
	public void method29195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2) {
		@Pc(3) int local3 = anIntArray474[arg0];
		if (arg2.method24506(arg1) != null) {
			this.anIntArray472[local3] = arg1 | Integer.MIN_VALUE;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "(IILclient!hp;)V", line = 55)
	public void method29206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2) {
		@Pc(3) int local3 = anIntArray474[arg0];
		if (arg2.method24506(arg1) != null) {
			this.anIntArray472[local3] = arg1 | Integer.MIN_VALUE;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "(IILclient!hp;)V", line = 55)
	public void method29207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2) {
		@Pc(3) int local3 = anIntArray474[arg0];
		if (arg2.method24506(arg1) != null) {
			this.anIntArray472[local3] = arg1 | Integer.MIN_VALUE;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "(IILclient!hp;)V", line = 55)
	public void method29220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2) {
		@Pc(3) int local3 = anIntArray474[arg0];
		if (arg2.method24506(arg1) != null) {
			this.anIntArray472[local3] = arg1 | Integer.MIN_VALUE;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "(II)V", line = 62)
	public void method29208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray473[arg0] = arg1;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(III)V", line = 62)
	public void method29216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray473[arg0] = arg1;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "(ZI)V", line = 67)
	public void method29197(@OriginalArg(0) boolean arg0) {
		this.aBoolean805 = arg0;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "(Z)V", line = 67)
	public void method29209(@OriginalArg(0) boolean arg0) {
		this.aBoolean805 = arg0;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "(Z)V", line = 67)
	public void method29211(@OriginalArg(0) boolean arg0) {
		this.aBoolean805 = arg0;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "(Z)V", line = 67)
	public void method29227(@OriginalArg(0) boolean arg0) {
		this.aBoolean805 = arg0;
		this.method29210();
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(IILclient!yc;S)V", line = 72)
	public void method29198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class596 arg2) {
		if (arg1 == -1) {
			this.anIntArray472[arg0] = 0;
		} else if (arg2.method33435(arg1) == null) {
			return;
		} else {
			this.anIntArray472[arg0] = arg1 | 0x40000000;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(IILclient!yc;)V", line = 72)
	public void method29212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class596 arg2) {
		if (arg1 == -1) {
			this.anIntArray472[arg0] = 0;
		} else if (arg2.method33435(arg1) == null) {
			return;
		} else {
			this.anIntArray472[arg0] = arg1 | 0x40000000;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "(IILclient!yc;)V", line = 72)
	public void method29213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class596 arg2) {
		if (arg1 == -1) {
			this.anIntArray472[arg0] = 0;
		} else if (arg2.method33435(arg1) == null) {
			return;
		} else {
			this.anIntArray472[arg0] = arg1 | 0x40000000;
			this.method29210();
		}
	}

	@OriginalMember(owner = "client!tq", name = "at", descriptor = "()V", line = 81)
	void method29196() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		this.aLong280 = 6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188 >> 8)) & 0xFFL)]) * -6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188)) & 0xFFL)]) * -6635666163035618137L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray472.length; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 24)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 16)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 8)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray472[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		if (this.aClass605Array1 != null) {
			for (local60 = 0; local60 < this.aClass605Array1.length; local60++) {
				if (this.aClass605Array1[local60] != null) {
					@Pc(203) int[] local203;
					@Pc(209) int[] local209;
					if (this.aBoolean805) {
						local203 = this.aClass605Array1[local60].anIntArray522;
						local209 = this.aClass605Array1[local60].anIntArray524;
					} else {
						local203 = this.aClass605Array1[local60].anIntArray521;
						local209 = this.aClass605Array1[local60].anIntArray523;
					}
					@Pc(226) int local226;
					if (local203 != null) {
						for (local226 = 0; local226 < local203.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local203[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local203[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (local209 != null) {
						for (local226 = 0; local226 < local209.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local209[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local209[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray139 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray139.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray139[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray139[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray140 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray140.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray140[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray140[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray473[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aBoolean805 ? 1 : 0)) & 0xFFL)]) * -6635666163035618137L;
	}

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "(I)V", line = 81)
	void method29210() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		this.aLong280 = 6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188 >> 8)) & 0xFFL)]) * -6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188)) & 0xFFL)]) * -6635666163035618137L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray472.length; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 24)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 16)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 8)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray472[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		if (this.aClass605Array1 != null) {
			for (local60 = 0; local60 < this.aClass605Array1.length; local60++) {
				if (this.aClass605Array1[local60] != null) {
					@Pc(203) int[] local203;
					@Pc(209) int[] local209;
					if (this.aBoolean805) {
						local203 = this.aClass605Array1[local60].anIntArray522;
						local209 = this.aClass605Array1[local60].anIntArray524;
					} else {
						local203 = this.aClass605Array1[local60].anIntArray521;
						local209 = this.aClass605Array1[local60].anIntArray523;
					}
					@Pc(226) int local226;
					if (local203 != null) {
						for (local226 = 0; local226 < local203.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local203[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local203[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (local209 != null) {
						for (local226 = 0; local226 < local209.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local209[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local209[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray139 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray139.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray139[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray139[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray140 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray140.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray140[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray140[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray473[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aBoolean805 ? 1 : 0)) & 0xFFL)]) * -6635666163035618137L;
	}

	@OriginalMember(owner = "client!tq", name = "aa", descriptor = "()V", line = 81)
	void method29215() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		this.aLong280 = 6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188 >> 8)) & 0xFFL)]) * -6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188)) & 0xFFL)]) * -6635666163035618137L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray472.length; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 24)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 16)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 8)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray472[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		if (this.aClass605Array1 != null) {
			for (local60 = 0; local60 < this.aClass605Array1.length; local60++) {
				if (this.aClass605Array1[local60] != null) {
					@Pc(203) int[] local203;
					@Pc(209) int[] local209;
					if (this.aBoolean805) {
						local203 = this.aClass605Array1[local60].anIntArray522;
						local209 = this.aClass605Array1[local60].anIntArray524;
					} else {
						local203 = this.aClass605Array1[local60].anIntArray521;
						local209 = this.aClass605Array1[local60].anIntArray523;
					}
					@Pc(226) int local226;
					if (local203 != null) {
						for (local226 = 0; local226 < local203.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local203[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local203[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (local209 != null) {
						for (local226 = 0; local226 < local209.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local209[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local209[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray139 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray139.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray139[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray139[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray140 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray140.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray140[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray140[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray473[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aBoolean805 ? 1 : 0)) & 0xFFL)]) * -6635666163035618137L;
	}

	@OriginalMember(owner = "client!tq", name = "af", descriptor = "()V", line = 81)
	void method29221() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		this.aLong280 = 6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188 >> 8)) & 0xFFL)]) * -6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188)) & 0xFFL)]) * -6635666163035618137L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray472.length; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 24)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 16)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 8)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray472[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		if (this.aClass605Array1 != null) {
			for (local60 = 0; local60 < this.aClass605Array1.length; local60++) {
				if (this.aClass605Array1[local60] != null) {
					@Pc(203) int[] local203;
					@Pc(209) int[] local209;
					if (this.aBoolean805) {
						local203 = this.aClass605Array1[local60].anIntArray522;
						local209 = this.aClass605Array1[local60].anIntArray524;
					} else {
						local203 = this.aClass605Array1[local60].anIntArray521;
						local209 = this.aClass605Array1[local60].anIntArray523;
					}
					@Pc(226) int local226;
					if (local203 != null) {
						for (local226 = 0; local226 < local203.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local203[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local203[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (local209 != null) {
						for (local226 = 0; local226 < local209.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local209[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local209[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray139 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray139.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray139[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray139[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray140 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray140.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray140[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray140[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray473[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aBoolean805 ? 1 : 0)) & 0xFFL)]) * -6635666163035618137L;
	}

	@OriginalMember(owner = "client!tq", name = "ak", descriptor = "()V", line = 81)
	void method29222() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		this.aLong280 = 6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188 >> 8)) & 0xFFL)]) * -6635666163035618137L;
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (-699192439 * this.anInt5188)) & 0xFFL)]) * -6635666163035618137L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray472.length; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 24)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 16)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.anIntArray472[local60] >> 8)) & 0xFFL)]) * -6635666163035618137L;
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray472[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		if (this.aClass605Array1 != null) {
			for (local60 = 0; local60 < this.aClass605Array1.length; local60++) {
				if (this.aClass605Array1[local60] != null) {
					@Pc(203) int[] local203;
					@Pc(209) int[] local209;
					if (this.aBoolean805) {
						local203 = this.aClass605Array1[local60].anIntArray522;
						local209 = this.aClass605Array1[local60].anIntArray524;
					} else {
						local203 = this.aClass605Array1[local60].anIntArray521;
						local209 = this.aClass605Array1[local60].anIntArray523;
					}
					@Pc(226) int local226;
					if (local203 != null) {
						for (local226 = 0; local226 < local203.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local203[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local203[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (local209 != null) {
						for (local226 = 0; local226 < local209.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (local209[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) local209[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray139 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray139.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray139[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray139[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
					if (this.aClass605Array1[local60].aShortArray140 != null) {
						for (local226 = 0; local226 < this.aClass605Array1[local60].aShortArray140.length; local226++) {
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aClass605Array1[local60].aShortArray140[local226] >> 8)) & 0xFFL)]) * -6635666163035618137L;
							this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.aClass605Array1[local60].aShortArray140[local226]) & 0xFFL)]) * -6635666163035618137L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) this.anIntArray473[local60]) & 0xFFL)]) * -6635666163035618137L;
		}
		this.aLong280 = (this.aLong280 * 5562625858519868183L >>> 8 ^ local1[(int) ((this.aLong280 * 5562625858519868183L ^ (long) (this.aBoolean805 ? 1 : 0)) & 0xFFL)]) * -6635666163035618137L;
	}

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "(Lclient!de;ILclient!re;Lclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;Lclient!wi;[Lclient!wi;[IIZLclient!tr;I)Lclient!dh;", line = 138)
	public Class20 method29200(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class428 arg2, @OriginalArg(3) Class228 arg3, @OriginalArg(4) Class579 arg4, @OriginalArg(5) Class596 arg5, @OriginalArg(6) Interface9 arg6, @OriginalArg(7) Interface8 arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) Class71 arg9, @OriginalArg(10) Class71[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class489 arg14) {
		if (-945292479 * this.anInt5185 != -1) {
			return arg4.method33185(this.anInt5185 * -945292479).method33065(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		@Pc(28) int local28 = arg1;
		@Pc(33) long local33 = this.aLong280 * 5562625858519868183L;
		@Pc(36) int[] local36 = this.anIntArray472;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(66) int local66;
		if (arg8 != null) {
			@Pc(46) Class440 local46 = arg8.method20069();
			if (local46 != null && (local46.anInt4933 * 147119441 >= 0 || local46.anInt4936 * -387598357 >= 0)) {
				local36 = new int[this.anIntArray472.length];
				for (local66 = 0; local66 < local36.length; local66++) {
					local36[local66] = this.anIntArray472[local66];
				}
				if (local46.anInt4933 * 147119441 >= 0 && arg14.anInt5190 * 511041795 != -1) {
					local38 = true;
					if (local46.anInt4933 * 147119441 == 65535) {
						local36[arg14.anInt5190 * 511041795] = 0;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFF00000000L;
					} else {
						local36[arg14.anInt5190 * 511041795] = local46.anInt4933 * 147119441 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= (long) local36[arg14.anInt5190 * 511041795] << 32;
					}
				}
				if (local46.anInt4936 * -387598357 >= 0 && arg14.anInt5194 * -858886195 != -1) {
					local40 = true;
					if (local46.anInt4936 * -387598357 == 65535) {
						local36[arg14.anInt5194 * -858886195] = 0;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFFL;
					} else {
						local36[arg14.anInt5194 * -858886195] = local46.anInt4936 * -387598357 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= local36[arg14.anInt5194 * -858886195];
					}
				}
			}
		}
		@Pc(253) boolean local253 = false;
		local66 = arg10 == null ? 0 : arg10.length;
		for (@Pc(263) int local263 = 0; local263 < local66; local263++) {
			if (arg10[local263] != null) {
				local28 |= arg10[local263].method20035();
				local253 = true;
			}
		}
		if (arg8 != null) {
			local28 |= arg8.method20035();
			local253 = true;
		}
		if (arg9 != null) {
			local28 |= arg9.method20035();
			local253 = true;
		}
		@Pc(306) boolean local306 = false;
		if (arg11 != null) {
			for (@Pc(310) int local310 = 0; local310 < arg11.length; local310++) {
				if (arg11[local310] != -1) {
					local28 |= 0x20;
					local306 = true;
				}
			}
		}
		@Pc(330) Class161 local330 = aClass161_55;
		@Pc(336) Class20 local336;
		synchronized (aClass161_55) {
			local336 = (Class20) aClass161_55.method23219(local33);
		}
		@Pc(346) Class445 local346 = null;
		if (this.anInt5188 * -699192439 != -1) {
			local346 = arg2.method27917(this.anInt5188 * -699192439);
		}
		@Pc(384) int local384;
		@Pc(392) int local392;
		if (local336 == null || arg0.method17117(local336.method5327(), local28) != 0) {
			if (local336 != null) {
				local28 = arg0.method17102(local28, local336.method5327());
			}
			@Pc(382) boolean local382 = false;
			local384 = 0;
			while (true) {
				@Pc(409) int local409;
				if (local384 >= local36.length) {
					if (local382) {
						if (this.aLong281 * -99231580878059187L != -1L) {
							@Pc(520) Class161 local520 = aClass161_55;
							synchronized (aClass161_55) {
								local336 = (Class20) aClass161_55.method23219(this.aLong281 * -99231580878059187L);
							}
						}
						if (local336 != null && arg0.method17117(local336.method5327(), local28) == 0) {
							break;
						}
						return null;
					}
					@Pc(552) Class138[] local552 = new Class138[local36.length];
					@Pc(562) int local562;
					for (local392 = 0; local392 < local36.length; local392++) {
						local562 = local36[local392];
						@Pc(564) Class605 local564 = null;
						@Pc(578) boolean local578 = local392 == 5 && local38 || local392 == 3 && local40;
						@Pc(610) Class138 local610;
						if ((local562 & 0x40000000) != 0) {
							if (!local578 && this.aClass605Array1 != null && this.aClass605Array1[local392] != null) {
								local564 = this.aClass605Array1[local392];
							}
							local610 = arg5.method33435(local562 & 0x3FFFFFFF).method33368(this.aBoolean805, local564);
							if (local610 != null) {
								local552[local392] = local610;
							}
						} else if ((local562 & Integer.MIN_VALUE) != 0) {
							local610 = arg3.method24506(local562 & 0x3FFFFFFF).method24376();
							if (local610 != null) {
								local552[local392] = local610;
							}
						}
					}
					@Pc(662) int local662;
					if (local346 != null && local346.anIntArrayArray55 != null) {
						for (local392 = 0; local392 < local346.anIntArrayArray55.length; local392++) {
							if (local552[local392] != null) {
								local562 = 0;
								local662 = 0;
								local409 = 0;
								@Pc(666) int local666 = 0;
								@Pc(668) int local668 = 0;
								@Pc(670) int local670 = 0;
								if (local346.anIntArrayArray55[local392] != null) {
									local562 = local346.anIntArrayArray55[local392][0];
									local662 = local346.anIntArrayArray55[local392][1];
									local409 = local346.anIntArrayArray55[local392][2];
									local666 = local346.anIntArrayArray55[local392][3] << 3;
									local668 = local346.anIntArrayArray55[local392][4] << 3;
									local670 = local346.anIntArrayArray55[local392][5] << 3;
								}
								if (local666 != 0 || local668 != 0 || local670 != 0) {
									local552[local392].method22972(local666, local668, local670);
								}
								if (local562 != 0 || local662 != 0 || local409 != 0) {
									local552[local392].method22966(local562, local662, local409);
								}
							}
						}
					}
					@Pc(762) Class138 local762 = new Class138(local552, local552.length);
					@Pc(766) int local766 = local28 | 0x4000;
					local336 = arg0.method17100(local762, local766, Class13_Sub14.anInt662 * -479899655, 64, 850);
					for (local562 = 0; local562 < 10; local562++) {
						for (local662 = 0; local662 < Class346.aShortArrayArray4[local562].length; local662++) {
							if (this.anIntArray473[local562] < aShortArrayArrayArray5[local562][local662].length) {
								local336.method5415(Class346.aShortArrayArray4[local562][local662], aShortArrayArrayArray5[local562][local662][this.anIntArray473[local562]]);
							}
						}
					}
					local336.method5359();
					if (arg13) {
						local336.method5326(local28);
						@Pc(831) Class161 local831 = aClass161_55;
						synchronized (aClass161_55) {
							aClass161_55.method23222(local336, local33);
						}
						this.aLong281 = local33 * -6938631024355502203L;
					}
					break;
				}
				local392 = local36[local384];
				@Pc(394) Class605 local394 = null;
				@Pc(396) boolean local396 = false;
				if (local38) {
					if (local384 == arg14.anInt5190 * 511041795) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray476.length; local409++) {
							if (arg14.anIntArray476[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if (local40) {
					if (arg14.anInt5194 * -858886195 == local384) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray477.length; local409++) {
							if (arg14.anIntArray477[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if ((local392 & 0x40000000) != 0) {
					if (!local396 && this.aClass605Array1 != null && this.aClass605Array1[local384] != null) {
						local394 = this.aClass605Array1[local384];
					}
					if (!arg5.method33435(local392 & 0x3FFFFFFF).method33371(this.aBoolean805, local394)) {
						local382 = true;
					}
				} else if ((local392 & Integer.MIN_VALUE) != 0 && !arg3.method24506(local392 & 0x3FFFFFFF).method24367()) {
					local382 = true;
				}
				local384++;
			}
		}
		@Pc(855) Class20 local855 = local336.method5430((byte) 4, local28, true);
		if (!local253 && !local306) {
			return local855;
		}
		@Pc(863) Class332[] local863 = null;
		if (local346 != null) {
			local863 = local346.method28324();
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, true);
				}
			}
		}
		local384 = 0;
		local392 = 1;
		while (local384 < local66) {
			if (arg10[local384] != null) {
				arg10[local384].method20061(local855, 0, local392);
			}
			local384++;
			local392 <<= 0x1;
		}
		if (local306) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (arg11[local384] != -1) {
					local392 = arg11[local384] - arg12;
					local392 &= 0x3FFF;
					@Pc(948) Class332 local948 = new Class332();
					local948.method26204(0.0F, 1.0F, 0.0F, Class317.method25842(local392));
					local855.method5351(local948, 0x1 << local384, false);
				}
			}
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class13_Sub7.method6223(local855, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method20066(local855, 0);
		} else if (arg9 != null) {
			arg9.method20066(local855, 0);
		}
		return local855;
	}

	@OriginalMember(owner = "client!tq", name = "ah", descriptor = "(Lclient!de;ILclient!re;Lclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;Lclient!wi;[Lclient!wi;[IIZLclient!tr;)Lclient!dh;", line = 138)
	public Class20 method29218(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class428 arg2, @OriginalArg(3) Class228 arg3, @OriginalArg(4) Class579 arg4, @OriginalArg(5) Class596 arg5, @OriginalArg(6) Interface9 arg6, @OriginalArg(7) Interface8 arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) Class71 arg9, @OriginalArg(10) Class71[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class489 arg14) {
		if (-945292479 * this.anInt5185 != -1) {
			return arg4.method33185(this.anInt5185 * -945292479).method33065(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		@Pc(28) int local28 = arg1;
		@Pc(33) long local33 = this.aLong280 * 5562625858519868183L;
		@Pc(36) int[] local36 = this.anIntArray472;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(66) int local66;
		if (arg8 != null) {
			@Pc(46) Class440 local46 = arg8.method20069();
			if (local46 != null && (local46.anInt4933 * 147119441 >= 0 || local46.anInt4936 * -387598357 >= 0)) {
				local36 = new int[this.anIntArray472.length];
				for (local66 = 0; local66 < local36.length; local66++) {
					local36[local66] = this.anIntArray472[local66];
				}
				if (local46.anInt4933 * 147119441 >= 0 && arg14.anInt5190 * 511041795 != -1) {
					local38 = true;
					if (local46.anInt4933 * 147119441 == 65535) {
						local36[arg14.anInt5190 * 511041795] = 0;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFF00000000L;
					} else {
						local36[arg14.anInt5190 * 511041795] = local46.anInt4933 * 147119441 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= (long) local36[arg14.anInt5190 * 511041795] << 32;
					}
				}
				if (local46.anInt4936 * -387598357 >= 0 && arg14.anInt5194 * -858886195 != -1) {
					local40 = true;
					if (local46.anInt4936 * -387598357 == 65535) {
						local36[arg14.anInt5194 * -858886195] = 0;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFFL;
					} else {
						local36[arg14.anInt5194 * -858886195] = local46.anInt4936 * -387598357 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= local36[arg14.anInt5194 * -858886195];
					}
				}
			}
		}
		@Pc(253) boolean local253 = false;
		local66 = arg10 == null ? 0 : arg10.length;
		for (@Pc(263) int local263 = 0; local263 < local66; local263++) {
			if (arg10[local263] != null) {
				local28 |= arg10[local263].method20035();
				local253 = true;
			}
		}
		if (arg8 != null) {
			local28 |= arg8.method20035();
			local253 = true;
		}
		if (arg9 != null) {
			local28 |= arg9.method20035();
			local253 = true;
		}
		@Pc(306) boolean local306 = false;
		if (arg11 != null) {
			for (@Pc(310) int local310 = 0; local310 < arg11.length; local310++) {
				if (arg11[local310] != -1) {
					local28 |= 0x20;
					local306 = true;
				}
			}
		}
		@Pc(330) Class161 local330 = aClass161_55;
		@Pc(336) Class20 local336;
		synchronized (aClass161_55) {
			local336 = (Class20) aClass161_55.method23219(local33);
		}
		@Pc(346) Class445 local346 = null;
		if (this.anInt5188 * -699192439 != -1) {
			local346 = arg2.method27917(this.anInt5188 * -699192439);
		}
		@Pc(384) int local384;
		@Pc(392) int local392;
		if (local336 == null || arg0.method17117(local336.method5327(), local28) != 0) {
			if (local336 != null) {
				local28 = arg0.method17102(local28, local336.method5327());
			}
			@Pc(382) boolean local382 = false;
			local384 = 0;
			while (true) {
				@Pc(409) int local409;
				if (local384 >= local36.length) {
					if (local382) {
						if (this.aLong281 * -99231580878059187L != -1L) {
							@Pc(520) Class161 local520 = aClass161_55;
							synchronized (aClass161_55) {
								local336 = (Class20) aClass161_55.method23219(this.aLong281 * -99231580878059187L);
							}
						}
						if (local336 != null && arg0.method17117(local336.method5327(), local28) == 0) {
							break;
						}
						return null;
					}
					@Pc(552) Class138[] local552 = new Class138[local36.length];
					@Pc(562) int local562;
					for (local392 = 0; local392 < local36.length; local392++) {
						local562 = local36[local392];
						@Pc(564) Class605 local564 = null;
						@Pc(578) boolean local578 = local392 == 5 && local38 || local392 == 3 && local40;
						@Pc(610) Class138 local610;
						if ((local562 & 0x40000000) != 0) {
							if (!local578 && this.aClass605Array1 != null && this.aClass605Array1[local392] != null) {
								local564 = this.aClass605Array1[local392];
							}
							local610 = arg5.method33435(local562 & 0x3FFFFFFF).method33368(this.aBoolean805, local564);
							if (local610 != null) {
								local552[local392] = local610;
							}
						} else if ((local562 & Integer.MIN_VALUE) != 0) {
							local610 = arg3.method24506(local562 & 0x3FFFFFFF).method24376();
							if (local610 != null) {
								local552[local392] = local610;
							}
						}
					}
					@Pc(662) int local662;
					if (local346 != null && local346.anIntArrayArray55 != null) {
						for (local392 = 0; local392 < local346.anIntArrayArray55.length; local392++) {
							if (local552[local392] != null) {
								local562 = 0;
								local662 = 0;
								local409 = 0;
								@Pc(666) int local666 = 0;
								@Pc(668) int local668 = 0;
								@Pc(670) int local670 = 0;
								if (local346.anIntArrayArray55[local392] != null) {
									local562 = local346.anIntArrayArray55[local392][0];
									local662 = local346.anIntArrayArray55[local392][1];
									local409 = local346.anIntArrayArray55[local392][2];
									local666 = local346.anIntArrayArray55[local392][3] << 3;
									local668 = local346.anIntArrayArray55[local392][4] << 3;
									local670 = local346.anIntArrayArray55[local392][5] << 3;
								}
								if (local666 != 0 || local668 != 0 || local670 != 0) {
									local552[local392].method22972(local666, local668, local670);
								}
								if (local562 != 0 || local662 != 0 || local409 != 0) {
									local552[local392].method22966(local562, local662, local409);
								}
							}
						}
					}
					@Pc(762) Class138 local762 = new Class138(local552, local552.length);
					@Pc(766) int local766 = local28 | 0x4000;
					local336 = arg0.method17100(local762, local766, Class13_Sub14.anInt662 * -479899655, 64, 850);
					for (local562 = 0; local562 < 10; local562++) {
						for (local662 = 0; local662 < Class346.aShortArrayArray4[local562].length; local662++) {
							if (this.anIntArray473[local562] < aShortArrayArrayArray5[local562][local662].length) {
								local336.method5415(Class346.aShortArrayArray4[local562][local662], aShortArrayArrayArray5[local562][local662][this.anIntArray473[local562]]);
							}
						}
					}
					local336.method5359();
					if (arg13) {
						local336.method5326(local28);
						@Pc(831) Class161 local831 = aClass161_55;
						synchronized (aClass161_55) {
							aClass161_55.method23222(local336, local33);
						}
						this.aLong281 = local33 * -6938631024355502203L;
					}
					break;
				}
				local392 = local36[local384];
				@Pc(394) Class605 local394 = null;
				@Pc(396) boolean local396 = false;
				if (local38) {
					if (local384 == arg14.anInt5190 * 511041795) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray476.length; local409++) {
							if (arg14.anIntArray476[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if (local40) {
					if (arg14.anInt5194 * -858886195 == local384) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray477.length; local409++) {
							if (arg14.anIntArray477[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if ((local392 & 0x40000000) != 0) {
					if (!local396 && this.aClass605Array1 != null && this.aClass605Array1[local384] != null) {
						local394 = this.aClass605Array1[local384];
					}
					if (!arg5.method33435(local392 & 0x3FFFFFFF).method33371(this.aBoolean805, local394)) {
						local382 = true;
					}
				} else if ((local392 & Integer.MIN_VALUE) != 0 && !arg3.method24506(local392 & 0x3FFFFFFF).method24367()) {
					local382 = true;
				}
				local384++;
			}
		}
		@Pc(855) Class20 local855 = local336.method5430((byte) 4, local28, true);
		if (!local253 && !local306) {
			return local855;
		}
		@Pc(863) Class332[] local863 = null;
		if (local346 != null) {
			local863 = local346.method28324();
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, true);
				}
			}
		}
		local384 = 0;
		local392 = 1;
		while (local384 < local66) {
			if (arg10[local384] != null) {
				arg10[local384].method20061(local855, 0, local392);
			}
			local384++;
			local392 <<= 0x1;
		}
		if (local306) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (arg11[local384] != -1) {
					local392 = arg11[local384] - arg12;
					local392 &= 0x3FFF;
					@Pc(948) Class332 local948 = new Class332();
					local948.method26204(0.0F, 1.0F, 0.0F, Class317.method25842(local392));
					local855.method5351(local948, 0x1 << local384, false);
				}
			}
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class13_Sub7.method6223(local855, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method20066(local855, 0);
		} else if (arg9 != null) {
			arg9.method20066(local855, 0);
		}
		return local855;
	}

	@OriginalMember(owner = "client!tq", name = "an", descriptor = "(Lclient!de;ILclient!re;Lclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;Lclient!wi;[Lclient!wi;[IIZLclient!tr;)Lclient!dh;", line = 138)
	public Class20 method29219(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class428 arg2, @OriginalArg(3) Class228 arg3, @OriginalArg(4) Class579 arg4, @OriginalArg(5) Class596 arg5, @OriginalArg(6) Interface9 arg6, @OriginalArg(7) Interface8 arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(9) Class71 arg9, @OriginalArg(10) Class71[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class489 arg14) {
		if (-945292479 * this.anInt5185 != -1) {
			return arg4.method33185(this.anInt5185 * -945292479).method33065(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		@Pc(28) int local28 = arg1;
		@Pc(33) long local33 = this.aLong280 * 5562625858519868183L;
		@Pc(36) int[] local36 = this.anIntArray472;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(66) int local66;
		if (arg8 != null) {
			@Pc(46) Class440 local46 = arg8.method20069();
			if (local46 != null && (local46.anInt4933 * 147119441 >= 0 || local46.anInt4936 * -387598357 >= 0)) {
				local36 = new int[this.anIntArray472.length];
				for (local66 = 0; local66 < local36.length; local66++) {
					local36[local66] = this.anIntArray472[local66];
				}
				if (local46.anInt4933 * 147119441 >= 0 && arg14.anInt5190 * 511041795 != -1) {
					local38 = true;
					if (local46.anInt4933 * 147119441 == 65535) {
						local36[arg14.anInt5190 * 511041795] = 0;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFF00000000L;
					} else {
						local36[arg14.anInt5190 * 511041795] = local46.anInt4933 * 147119441 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray476.length; local66++) {
							local36[arg14.anIntArray476[local66]] = 0;
						}
						local33 ^= (long) local36[arg14.anInt5190 * 511041795] << 32;
					}
				}
				if (local46.anInt4936 * -387598357 >= 0 && arg14.anInt5194 * -858886195 != -1) {
					local40 = true;
					if (local46.anInt4936 * -387598357 == 65535) {
						local36[arg14.anInt5194 * -858886195] = 0;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= 0xFFFFFFFFL;
					} else {
						local36[arg14.anInt5194 * -858886195] = local46.anInt4936 * -387598357 | 0x40000000;
						for (local66 = 0; local66 < arg14.anIntArray477.length; local66++) {
							local36[arg14.anIntArray477[local66]] = 0;
						}
						local33 ^= local36[arg14.anInt5194 * -858886195];
					}
				}
			}
		}
		@Pc(253) boolean local253 = false;
		local66 = arg10 == null ? 0 : arg10.length;
		for (@Pc(263) int local263 = 0; local263 < local66; local263++) {
			if (arg10[local263] != null) {
				local28 |= arg10[local263].method20035();
				local253 = true;
			}
		}
		if (arg8 != null) {
			local28 |= arg8.method20035();
			local253 = true;
		}
		if (arg9 != null) {
			local28 |= arg9.method20035();
			local253 = true;
		}
		@Pc(306) boolean local306 = false;
		if (arg11 != null) {
			for (@Pc(310) int local310 = 0; local310 < arg11.length; local310++) {
				if (arg11[local310] != -1) {
					local28 |= 0x20;
					local306 = true;
				}
			}
		}
		@Pc(330) Class161 local330 = aClass161_55;
		@Pc(336) Class20 local336;
		synchronized (aClass161_55) {
			local336 = (Class20) aClass161_55.method23219(local33);
		}
		@Pc(346) Class445 local346 = null;
		if (this.anInt5188 * -699192439 != -1) {
			local346 = arg2.method27917(this.anInt5188 * -699192439);
		}
		@Pc(384) int local384;
		@Pc(392) int local392;
		if (local336 == null || arg0.method17117(local336.method5327(), local28) != 0) {
			if (local336 != null) {
				local28 = arg0.method17102(local28, local336.method5327());
			}
			@Pc(382) boolean local382 = false;
			local384 = 0;
			while (true) {
				@Pc(409) int local409;
				if (local384 >= local36.length) {
					if (local382) {
						if (this.aLong281 * -99231580878059187L != -1L) {
							@Pc(520) Class161 local520 = aClass161_55;
							synchronized (aClass161_55) {
								local336 = (Class20) aClass161_55.method23219(this.aLong281 * -99231580878059187L);
							}
						}
						if (local336 != null && arg0.method17117(local336.method5327(), local28) == 0) {
							break;
						}
						return null;
					}
					@Pc(552) Class138[] local552 = new Class138[local36.length];
					@Pc(562) int local562;
					for (local392 = 0; local392 < local36.length; local392++) {
						local562 = local36[local392];
						@Pc(564) Class605 local564 = null;
						@Pc(578) boolean local578 = local392 == 5 && local38 || local392 == 3 && local40;
						@Pc(610) Class138 local610;
						if ((local562 & 0x40000000) != 0) {
							if (!local578 && this.aClass605Array1 != null && this.aClass605Array1[local392] != null) {
								local564 = this.aClass605Array1[local392];
							}
							local610 = arg5.method33435(local562 & 0x3FFFFFFF).method33368(this.aBoolean805, local564);
							if (local610 != null) {
								local552[local392] = local610;
							}
						} else if ((local562 & Integer.MIN_VALUE) != 0) {
							local610 = arg3.method24506(local562 & 0x3FFFFFFF).method24376();
							if (local610 != null) {
								local552[local392] = local610;
							}
						}
					}
					@Pc(662) int local662;
					if (local346 != null && local346.anIntArrayArray55 != null) {
						for (local392 = 0; local392 < local346.anIntArrayArray55.length; local392++) {
							if (local552[local392] != null) {
								local562 = 0;
								local662 = 0;
								local409 = 0;
								@Pc(666) int local666 = 0;
								@Pc(668) int local668 = 0;
								@Pc(670) int local670 = 0;
								if (local346.anIntArrayArray55[local392] != null) {
									local562 = local346.anIntArrayArray55[local392][0];
									local662 = local346.anIntArrayArray55[local392][1];
									local409 = local346.anIntArrayArray55[local392][2];
									local666 = local346.anIntArrayArray55[local392][3] << 3;
									local668 = local346.anIntArrayArray55[local392][4] << 3;
									local670 = local346.anIntArrayArray55[local392][5] << 3;
								}
								if (local666 != 0 || local668 != 0 || local670 != 0) {
									local552[local392].method22972(local666, local668, local670);
								}
								if (local562 != 0 || local662 != 0 || local409 != 0) {
									local552[local392].method22966(local562, local662, local409);
								}
							}
						}
					}
					@Pc(762) Class138 local762 = new Class138(local552, local552.length);
					@Pc(766) int local766 = local28 | 0x4000;
					local336 = arg0.method17100(local762, local766, Class13_Sub14.anInt662 * -479899655, 64, 850);
					for (local562 = 0; local562 < 10; local562++) {
						for (local662 = 0; local662 < Class346.aShortArrayArray4[local562].length; local662++) {
							if (this.anIntArray473[local562] < aShortArrayArrayArray5[local562][local662].length) {
								local336.method5415(Class346.aShortArrayArray4[local562][local662], aShortArrayArrayArray5[local562][local662][this.anIntArray473[local562]]);
							}
						}
					}
					local336.method5359();
					if (arg13) {
						local336.method5326(local28);
						@Pc(831) Class161 local831 = aClass161_55;
						synchronized (aClass161_55) {
							aClass161_55.method23222(local336, local33);
						}
						this.aLong281 = local33 * -6938631024355502203L;
					}
					break;
				}
				local392 = local36[local384];
				@Pc(394) Class605 local394 = null;
				@Pc(396) boolean local396 = false;
				if (local38) {
					if (local384 == arg14.anInt5190 * 511041795) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray476.length; local409++) {
							if (arg14.anIntArray476[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if (local40) {
					if (arg14.anInt5194 * -858886195 == local384) {
						local396 = true;
					} else {
						for (local409 = 0; local409 < arg14.anIntArray477.length; local409++) {
							if (arg14.anIntArray477[local409] == local384) {
								local396 = true;
								break;
							}
						}
					}
				}
				if ((local392 & 0x40000000) != 0) {
					if (!local396 && this.aClass605Array1 != null && this.aClass605Array1[local384] != null) {
						local394 = this.aClass605Array1[local384];
					}
					if (!arg5.method33435(local392 & 0x3FFFFFFF).method33371(this.aBoolean805, local394)) {
						local382 = true;
					}
				} else if ((local392 & Integer.MIN_VALUE) != 0 && !arg3.method24506(local392 & 0x3FFFFFFF).method24367()) {
					local382 = true;
				}
				local384++;
			}
		}
		@Pc(855) Class20 local855 = local336.method5430((byte) 4, local28, true);
		if (!local253 && !local306) {
			return local855;
		}
		@Pc(863) Class332[] local863 = null;
		if (local346 != null) {
			local863 = local346.method28324();
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, true);
				}
			}
		}
		local384 = 0;
		local392 = 1;
		while (local384 < local66) {
			if (arg10[local384] != null) {
				arg10[local384].method20061(local855, 0, local392);
			}
			local384++;
			local392 <<= 0x1;
		}
		if (local306) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (arg11[local384] != -1) {
					local392 = arg11[local384] - arg12;
					local392 &= 0x3FFF;
					@Pc(948) Class332 local948 = new Class332();
					local948.method26204(0.0F, 1.0F, 0.0F, Class317.method25842(local392));
					local855.method5351(local948, 0x1 << local384, false);
				}
			}
		}
		if (local306 && local863 != null) {
			for (local384 = 0; local384 < arg11.length; local384++) {
				if (local863[local384] != null) {
					local855.method5351(local863[local384], 0x1 << local384, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class13_Sub7.method6223(local855, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method20066(local855, 0);
		} else if (arg9 != null) {
			arg9.method20066(local855, 0);
		}
		return local855;
	}

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "(Lclient!de;ILclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;I)Lclient!dh;", line = 351)
	public Class20 method29193(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class579 arg3, @OriginalArg(4) Class596 arg4, @OriginalArg(5) Interface9 arg5, @OriginalArg(6) Interface8 arg6, @OriginalArg(7) Class71 arg7) {
		if (this.anInt5185 * -945292479 != -1) {
			return arg3.method33185(this.anInt5185 * -945292479).method33058(arg0, arg1, arg5, arg6, arg7, null);
		}
		@Pc(31) int local31 = arg7 == null ? arg1 : arg1 | arg7.method20035();
		@Pc(34) Class161 local34 = aClass161_56;
		@Pc(43) Class20 local43;
		synchronized (aClass161_56) {
			local43 = (Class20) aClass161_56.method23219(this.aLong280 * 5562625858519868183L);
		}
		if (local43 == null || arg0.method17117(local43.method5327(), local31) != 0) {
			if (local43 != null) {
				local31 = arg0.method17102(local31, local43.method5327());
			}
			@Pc(73) boolean local73 = false;
			@Pc(85) int local85;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray472.length; local75++) {
				local85 = this.anIntArray472[local75];
				@Pc(87) Class605 local87 = null;
				if ((local85 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local75] != null) {
						local87 = this.aClass605Array1[local75];
					}
					if (!arg4.method33435(local85 & 0x3FFFFFFF).method33412(this.aBoolean805, local87)) {
						local73 = true;
					}
				} else if ((local85 & Integer.MIN_VALUE) != 0 && !arg2.method24506(local85 & 0x3FFFFFFF).method24364()) {
					local73 = true;
				}
			}
			if (local73) {
				return null;
			}
			@Pc(147) Class138[] local147 = new Class138[this.anIntArray472.length];
			local85 = 0;
			@Pc(161) int local161;
			for (@Pc(151) int local151 = 0; local151 < this.anIntArray472.length; local151++) {
				local161 = this.anIntArray472[local151];
				@Pc(163) Class605 local163 = null;
				@Pc(192) Class138 local192;
				if ((local161 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local151] != null) {
						local163 = this.aClass605Array1[local151];
					}
					local192 = arg4.method33435(local161 & 0x3FFFFFFF).method33397(this.aBoolean805, local163);
					if (local192 != null) {
						local147[local85++] = local192;
					}
				} else if ((local161 & Integer.MIN_VALUE) != 0) {
					local192 = arg2.method24506(local161 & 0x3FFFFFFF).method24370();
					if (local192 != null) {
						local147[local85++] = local192;
					}
				}
			}
			@Pc(230) Class138 local230 = new Class138(local147, local85);
			@Pc(234) int local234 = local31 | 0x4000;
			local43 = arg0.method17100(local230, local234, Class13_Sub14.anInt662 * -479899655, 64, 768);
			for (local161 = 0; local161 < 10; local161++) {
				for (@Pc(251) int local251 = 0; local251 < Class346.aShortArrayArray4[local161].length; local251++) {
					if (this.anIntArray473[local161] < aShortArrayArrayArray5[local161][local251].length) {
						local43.method5415(Class346.aShortArrayArray4[local161][local251], aShortArrayArrayArray5[local161][local251][this.anIntArray473[local161]]);
					}
				}
			}
			local43.method5326(local31);
			@Pc(295) Class161 local295 = aClass161_56;
			synchronized (aClass161_56) {
				aClass161_56.method23222(local43, this.aLong280 * 5562625858519868183L);
			}
		}
		if (arg7 == null) {
			return local43;
		} else {
			@Pc(321) Class20 local321 = local43.method5430((byte) 4, local31, true);
			arg7.method20066(local321, 0);
			return local321;
		}
	}

	@OriginalMember(owner = "client!tq", name = "as", descriptor = "(Lclient!de;ILclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;)Lclient!dh;", line = 351)
	public Class20 method29199(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class579 arg3, @OriginalArg(4) Class596 arg4, @OriginalArg(5) Interface9 arg5, @OriginalArg(6) Interface8 arg6, @OriginalArg(7) Class71 arg7) {
		if (this.anInt5185 * -945292479 != -1) {
			return arg3.method33185(this.anInt5185 * -945292479).method33058(arg0, arg1, arg5, arg6, arg7, null);
		}
		@Pc(31) int local31 = arg7 == null ? arg1 : arg1 | arg7.method20035();
		@Pc(34) Class161 local34 = aClass161_56;
		@Pc(43) Class20 local43;
		synchronized (aClass161_56) {
			local43 = (Class20) aClass161_56.method23219(this.aLong280 * 5562625858519868183L);
		}
		if (local43 == null || arg0.method17117(local43.method5327(), local31) != 0) {
			if (local43 != null) {
				local31 = arg0.method17102(local31, local43.method5327());
			}
			@Pc(73) boolean local73 = false;
			@Pc(85) int local85;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray472.length; local75++) {
				local85 = this.anIntArray472[local75];
				@Pc(87) Class605 local87 = null;
				if ((local85 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local75] != null) {
						local87 = this.aClass605Array1[local75];
					}
					if (!arg4.method33435(local85 & 0x3FFFFFFF).method33412(this.aBoolean805, local87)) {
						local73 = true;
					}
				} else if ((local85 & Integer.MIN_VALUE) != 0 && !arg2.method24506(local85 & 0x3FFFFFFF).method24364()) {
					local73 = true;
				}
			}
			if (local73) {
				return null;
			}
			@Pc(147) Class138[] local147 = new Class138[this.anIntArray472.length];
			local85 = 0;
			@Pc(161) int local161;
			for (@Pc(151) int local151 = 0; local151 < this.anIntArray472.length; local151++) {
				local161 = this.anIntArray472[local151];
				@Pc(163) Class605 local163 = null;
				@Pc(192) Class138 local192;
				if ((local161 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local151] != null) {
						local163 = this.aClass605Array1[local151];
					}
					local192 = arg4.method33435(local161 & 0x3FFFFFFF).method33397(this.aBoolean805, local163);
					if (local192 != null) {
						local147[local85++] = local192;
					}
				} else if ((local161 & Integer.MIN_VALUE) != 0) {
					local192 = arg2.method24506(local161 & 0x3FFFFFFF).method24370();
					if (local192 != null) {
						local147[local85++] = local192;
					}
				}
			}
			@Pc(230) Class138 local230 = new Class138(local147, local85);
			@Pc(234) int local234 = local31 | 0x4000;
			local43 = arg0.method17100(local230, local234, Class13_Sub14.anInt662 * -479899655, 64, 768);
			for (local161 = 0; local161 < 10; local161++) {
				for (@Pc(251) int local251 = 0; local251 < Class346.aShortArrayArray4[local161].length; local251++) {
					if (this.anIntArray473[local161] < aShortArrayArrayArray5[local161][local251].length) {
						local43.method5415(Class346.aShortArrayArray4[local161][local251], aShortArrayArrayArray5[local161][local251][this.anIntArray473[local161]]);
					}
				}
			}
			local43.method5326(local31);
			@Pc(295) Class161 local295 = aClass161_56;
			synchronized (aClass161_56) {
				aClass161_56.method23222(local43, this.aLong280 * 5562625858519868183L);
			}
		}
		if (arg7 == null) {
			return local43;
		} else {
			@Pc(321) Class20 local321 = local43.method5430((byte) 4, local31, true);
			arg7.method20066(local321, 0);
			return local321;
		}
	}

	@OriginalMember(owner = "client!tq", name = "aj", descriptor = "(Lclient!de;ILclient!hp;Lclient!xl;Lclient!yc;Lclient!cz;Lclient!ct;Lclient!wi;)Lclient!dh;", line = 351)
	public Class20 method29217(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class579 arg3, @OriginalArg(4) Class596 arg4, @OriginalArg(5) Interface9 arg5, @OriginalArg(6) Interface8 arg6, @OriginalArg(7) Class71 arg7) {
		if (this.anInt5185 * -945292479 != -1) {
			return arg3.method33185(this.anInt5185 * -945292479).method33058(arg0, arg1, arg5, arg6, arg7, null);
		}
		@Pc(31) int local31 = arg7 == null ? arg1 : arg1 | arg7.method20035();
		@Pc(34) Class161 local34 = aClass161_56;
		@Pc(43) Class20 local43;
		synchronized (aClass161_56) {
			local43 = (Class20) aClass161_56.method23219(this.aLong280 * 5562625858519868183L);
		}
		if (local43 == null || arg0.method17117(local43.method5327(), local31) != 0) {
			if (local43 != null) {
				local31 = arg0.method17102(local31, local43.method5327());
			}
			@Pc(73) boolean local73 = false;
			@Pc(85) int local85;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray472.length; local75++) {
				local85 = this.anIntArray472[local75];
				@Pc(87) Class605 local87 = null;
				if ((local85 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local75] != null) {
						local87 = this.aClass605Array1[local75];
					}
					if (!arg4.method33435(local85 & 0x3FFFFFFF).method33412(this.aBoolean805, local87)) {
						local73 = true;
					}
				} else if ((local85 & Integer.MIN_VALUE) != 0 && !arg2.method24506(local85 & 0x3FFFFFFF).method24364()) {
					local73 = true;
				}
			}
			if (local73) {
				return null;
			}
			@Pc(147) Class138[] local147 = new Class138[this.anIntArray472.length];
			local85 = 0;
			@Pc(161) int local161;
			for (@Pc(151) int local151 = 0; local151 < this.anIntArray472.length; local151++) {
				local161 = this.anIntArray472[local151];
				@Pc(163) Class605 local163 = null;
				@Pc(192) Class138 local192;
				if ((local161 & 0x40000000) != 0) {
					if (this.aClass605Array1 != null && this.aClass605Array1[local151] != null) {
						local163 = this.aClass605Array1[local151];
					}
					local192 = arg4.method33435(local161 & 0x3FFFFFFF).method33397(this.aBoolean805, local163);
					if (local192 != null) {
						local147[local85++] = local192;
					}
				} else if ((local161 & Integer.MIN_VALUE) != 0) {
					local192 = arg2.method24506(local161 & 0x3FFFFFFF).method24370();
					if (local192 != null) {
						local147[local85++] = local192;
					}
				}
			}
			@Pc(230) Class138 local230 = new Class138(local147, local85);
			@Pc(234) int local234 = local31 | 0x4000;
			local43 = arg0.method17100(local230, local234, Class13_Sub14.anInt662 * -479899655, 64, 768);
			for (local161 = 0; local161 < 10; local161++) {
				for (@Pc(251) int local251 = 0; local251 < Class346.aShortArrayArray4[local161].length; local251++) {
					if (this.anIntArray473[local161] < aShortArrayArrayArray5[local161][local251].length) {
						local43.method5415(Class346.aShortArrayArray4[local161][local251], aShortArrayArrayArray5[local161][local251][this.anIntArray473[local161]]);
					}
				}
			}
			local43.method5326(local31);
			@Pc(295) Class161 local295 = aClass161_56;
			synchronized (aClass161_56) {
				aClass161_56.method23222(local43, this.aLong280 * 5562625858519868183L);
			}
		}
		if (arg7 == null) {
			return local43;
		} else {
			@Pc(321) Class20 local321 = local43.method5430((byte) 4, local31, true);
			arg7.method20066(local321, 0);
			return local321;
		}
	}

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "(Lclient!de;ILclient!hp;Lclient!rn;Lclient!wi;IIIS)Lclient!dh;", line = 410)
	public Class20 method29202(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class436 arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method20035();
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class161 local26 = aClass161_56;
		@Pc(32) Class20 local32;
		synchronized (aClass161_56) {
			local32 = (Class20) aClass161_56.method23219(local23);
		}
		if (local32 == null || arg0.method17117(local32.method5327(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method17102(local10, local32.method5327());
			}
			@Pc(62) Class138[] local62 = new Class138[3];
			@Pc(64) int local64 = 0;
			if (!arg2.method24506(arg5).method24364() || !arg2.method24506(arg6).method24364() || !arg2.method24506(arg7).method24364()) {
				return null;
			}
			@Pc(92) Class138 local92 = arg2.method24506(arg5).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = arg2.method24506(arg6).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = arg2.method24506(arg7).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = new Class138(local62, local64);
			@Pc(138) int local138 = local10 | 0x4000;
			local32 = arg0.method17100(local92, local138, Class13_Sub14.anInt662 * -479899655, 64, 768);
			for (@Pc(150) int local150 = 0; local150 < 10; local150++) {
				for (@Pc(155) int local155 = 0; local155 < Class346.aShortArrayArray4[local150].length; local155++) {
					if (this.anIntArray473[local150] < aShortArrayArrayArray5[local150][local155].length) {
						local32.method5415(Class346.aShortArrayArray4[local150][local155], aShortArrayArrayArray5[local150][local155][this.anIntArray473[local150]]);
					}
				}
			}
			local32.method5326(local10);
			@Pc(199) Class161 local199 = aClass161_56;
			synchronized (aClass161_56) {
				aClass161_56.method23222(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method5430((byte) 4, local10, true);
			arg4.method20066(local32, 0);
			return local32;
		}
	}

	@OriginalMember(owner = "client!tq", name = "ai", descriptor = "(Lclient!de;ILclient!hp;Lclient!rn;Lclient!wi;III)Lclient!dh;", line = 410)
	public Class20 method29214(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class436 arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = arg4 == null ? arg1 : arg1 | arg4.method20035();
		@Pc(23) long local23 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(26) Class161 local26 = aClass161_56;
		@Pc(32) Class20 local32;
		synchronized (aClass161_56) {
			local32 = (Class20) aClass161_56.method23219(local23);
		}
		if (local32 == null || arg0.method17117(local32.method5327(), local10) != 0) {
			if (local32 != null) {
				local10 = arg0.method17102(local10, local32.method5327());
			}
			@Pc(62) Class138[] local62 = new Class138[3];
			@Pc(64) int local64 = 0;
			if (!arg2.method24506(arg5).method24364() || !arg2.method24506(arg6).method24364() || !arg2.method24506(arg7).method24364()) {
				return null;
			}
			@Pc(92) Class138 local92 = arg2.method24506(arg5).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = arg2.method24506(arg6).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = arg2.method24506(arg7).method24370();
			if (local92 != null) {
				local62[local64++] = local92;
			}
			local92 = new Class138(local62, local64);
			@Pc(138) int local138 = local10 | 0x4000;
			local32 = arg0.method17100(local92, local138, Class13_Sub14.anInt662 * -479899655, 64, 768);
			for (@Pc(150) int local150 = 0; local150 < 10; local150++) {
				for (@Pc(155) int local155 = 0; local155 < Class346.aShortArrayArray4[local150].length; local155++) {
					if (this.anIntArray473[local150] < aShortArrayArrayArray5[local150][local155].length) {
						local32.method5415(Class346.aShortArrayArray4[local150][local155], aShortArrayArrayArray5[local150][local155][this.anIntArray473[local150]]);
					}
				}
			}
			local32.method5326(local10);
			@Pc(199) Class161 local199 = aClass161_56;
			synchronized (aClass161_56) {
				aClass161_56.method23222(local32, local23);
			}
		}
		if (arg4 == null) {
			return local32;
		} else {
			local32 = local32.method5430((byte) 4, local10, true);
			arg4.method20066(local32, 0);
			return local32;
		}
	}

	@OriginalMember(owner = "client!tq", name = "aq", descriptor = "()I", line = 450)
	public static int method29223() {
		@Pc(2) Class161 local2 = aClass161_55;
		synchronized (aClass161_55) {
			return aClass161_55.method23254();
		}
	}

	@OriginalMember(owner = "client!tq", name = "av", descriptor = "(I)V", line = 456)
	public static void method29224(@OriginalArg(0) int arg0) {
		Class13_Sub14.anInt662 = arg0 * 820920905;
		@Pc(6) Class161 local6 = aClass161_56;
		synchronized (aClass161_56) {
			aClass161_56.method23224();
		}
		local6 = aClass161_55;
		synchronized (aClass161_55) {
			aClass161_55.method23224();
		}
	}

	@OriginalMember(owner = "client!tq", name = "ax", descriptor = "(I)V", line = 475)
	public static void method29225(@OriginalArg(0) int arg0) {
		@Pc(2) Class161 local2 = aClass161_55;
		synchronized (aClass161_55) {
			aClass161_55.method23240(arg0);
		}
		local2 = aClass161_56;
		synchronized (aClass161_56) {
			aClass161_56.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "az", descriptor = "(I)V", line = 475)
	public static void method29226(@OriginalArg(0) int arg0) {
		@Pc(2) Class161 local2 = aClass161_55;
		synchronized (aClass161_55) {
			aClass161_55.method23240(arg0);
		}
		local2 = aClass161_56;
		synchronized (aClass161_56) {
			aClass161_56.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "al", descriptor = "()V", line = 484)
	public static void method29201() {
		@Pc(2) Class161 local2 = aClass161_55;
		synchronized (aClass161_55) {
			aClass161_55.method23245();
		}
		local2 = aClass161_56;
		synchronized (aClass161_56) {
			aClass161_56.method23245();
		}
	}

	@OriginalMember(owner = "client!tq", name = "ya", descriptor = "(Lclient!vs;B)V", line = 8493)
	static final void method29228(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class461.anInt5067 * -1046353197;
	}
}
