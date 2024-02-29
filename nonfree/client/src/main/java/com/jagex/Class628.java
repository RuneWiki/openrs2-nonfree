package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public class Class628 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public static final int anInt5655 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static final int anInt5656 = 1073741824;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	static final int anInt5657 = 1073741823;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	public static final int anInt5658 = 4;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
	public static final int anInt5661 = 4;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	public static final int anInt5662 = 10;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public static final int anInt5663 = 10;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!wr", name = "fu", descriptor = "Lclient!pw;")
	public static Class478 aClass478_135;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "[I")
	static final int[] anIntArray525 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!er;")
	static Class232 aClass232_90 = new Class232(260);

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!er;")
	static Class232 aClass232_91 = new Class232(5);

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "[I")
	int[] anIntArray522;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Z")
	public boolean aBoolean845;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	int anInt5659;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "J")
	long aLong301;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[Lclient!aau;")
	Class20[] aClass20Array1;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
	public int[] anIntArray524;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "J")
	long aLong302;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
	public int anInt5660 = -2005653935;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "(I[I[Lclient!aau;[I[IZIS)V", line = 50)
	public void method32541(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (this.anInt5659 * 1957003231 != arg0) {
			this.anInt5659 = arg0 * 1957362719;
		}
		this.anIntArray522 = arg1;
		this.aClass20Array1 = arg2;
		this.anIntArray523 = arg3;
		this.anIntArray524 = arg4;
		this.aBoolean845 = arg5;
		this.anInt5660 = arg6 * 2005653935;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(I[I[Lclient!aau;[I[IZI)V", line = 50)
	public void method32542(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (this.anInt5659 * 1957003231 != arg0) {
			this.anInt5659 = arg0 * 1957362719;
		}
		this.anIntArray522 = arg1;
		this.aClass20Array1 = arg2;
		this.anIntArray523 = arg3;
		this.anIntArray524 = arg4;
		this.aBoolean845 = arg5;
		this.anInt5660 = arg6 * 2005653935;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "(I[I[Lclient!aau;[I[IZI)V", line = 50)
	public void method32543(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		if (this.anInt5659 * 1957003231 != arg0) {
			this.anInt5659 = arg0 * 1957362719;
		}
		this.anIntArray522 = arg1;
		this.aClass20Array1 = arg2;
		this.anIntArray523 = arg3;
		this.anIntArray524 = arg4;
		this.aBoolean845 = arg5;
		this.anInt5660 = arg6 * 2005653935;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "(IILclient!anw;)V", line = 63)
	public void method32544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2) {
		@Pc(3) int local3 = anIntArray525[arg0];
		if (arg2.method18319(arg1) != null) {
			this.anIntArray522[local3] = arg1 | Integer.MIN_VALUE;
			this.method32561();
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(IILclient!anw;I)V", line = 63)
	public void method32545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2) {
		@Pc(3) int local3 = anIntArray525[arg0];
		if (arg2.method18319(arg1) != null) {
			this.anIntArray522[local3] = arg1 | Integer.MIN_VALUE;
			this.method32561();
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(CLclient!yi;I)C", line = 69)
	static char method32546(@OriginalArg(0) char arg0, @OriginalArg(1) Class667 arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != Class667.aClass667_8) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != Class667.aClass667_8) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "(III)V", line = 70)
	public void method32547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray523[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "(II)V", line = 70)
	public void method32548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray523[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(II)V", line = 70)
	public void method32549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray523[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(II)V", line = 70)
	public void method32550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray523[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "(IIB)V", line = 75)
	public void method32551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray524[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V", line = 75)
	public void method32552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray524[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "(II)V", line = 75)
	public void method32553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray524[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V", line = 75)
	public void method32554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray524[arg0] = arg1;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "(Z)V", line = 80)
	public void method32555(@OriginalArg(0) boolean arg0) {
		this.aBoolean845 = arg0;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "(ZI)V", line = 80)
	public void method32556(@OriginalArg(0) boolean arg0) {
		this.aBoolean845 = arg0;
		this.method32561();
	}

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "(IILclient!ann;I)V", line = 85)
	public void method32557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub7 arg2) {
		if (arg1 == -1) {
			this.anIntArray522[arg0] = 0;
		} else if (arg2.method18319(arg1) == null) {
			return;
		} else {
			this.anIntArray522[arg0] = arg1 | 0x40000000;
			this.method32561();
		}
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(IILclient!ann;)V", line = 85)
	public void method32558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub7 arg2) {
		if (arg1 == -1) {
			this.anIntArray522[arg0] = 0;
		} else if (arg2.method18319(arg1) == null) {
			return;
		} else {
			this.anIntArray522[arg0] = arg1 | 0x40000000;
			this.method32561();
		}
	}

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "(J)I", line = 92)
	public static int method32559(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!wr", name = "aj", descriptor = "()V", line = 94)
	void method32560() {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		this.aLong302 = 8746091183093017783L;
		this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anInt5659 * 1957003231 >> 8)) & 0xFFL)]) * -8746091183093017783L;
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anInt5659 * 1957003231)) & 0xFFL)]) * -8746091183093017783L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray522.length; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anIntArray522[local60] >> 24)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 16)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 8)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray522[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		if (this.aClass20Array1 != null) {
			for (local60 = 0; local60 < this.aClass20Array1.length; local60++) {
				if (this.aClass20Array1[local60] != null) {
					@Pc(202) int[] local202;
					@Pc(208) int[] local208;
					if (this.aBoolean845) {
						local202 = this.aClass20Array1[local60].anIntArray8;
						local208 = this.aClass20Array1[local60].anIntArray11;
					} else {
						local202 = this.aClass20Array1[local60].anIntArray10;
						local208 = this.aClass20Array1[local60].anIntArray9;
					}
					@Pc(226) int local226;
					if (local202 != null) {
						for (local226 = 0; local226 < local202.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local202[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) local202[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (local208 != null) {
						for (local226 = 0; local226 < local208.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local208[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) local208[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray7 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray7.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.aClass20Array1[local60].aShortArray7[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.aClass20Array1[local60].aShortArray7[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray6 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray6.length; local226++) {
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aClass20Array1[local60].aShortArray6[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.aClass20Array1[local60].aShortArray6[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray523[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.anIntArray524[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aBoolean845 ? 1 : 0)) & 0xFFL)]) * -8746091183093017783L;
	}

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "(B)V", line = 94)
	void method32561() {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		this.aLong302 = 8746091183093017783L;
		this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anInt5659 * 1957003231 >> 8)) & 0xFFL)]) * -8746091183093017783L;
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anInt5659 * 1957003231)) & 0xFFL)]) * -8746091183093017783L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray522.length; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anIntArray522[local60] >> 24)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 16)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 8)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray522[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		if (this.aClass20Array1 != null) {
			for (local60 = 0; local60 < this.aClass20Array1.length; local60++) {
				if (this.aClass20Array1[local60] != null) {
					@Pc(202) int[] local202;
					@Pc(208) int[] local208;
					if (this.aBoolean845) {
						local202 = this.aClass20Array1[local60].anIntArray8;
						local208 = this.aClass20Array1[local60].anIntArray11;
					} else {
						local202 = this.aClass20Array1[local60].anIntArray10;
						local208 = this.aClass20Array1[local60].anIntArray9;
					}
					@Pc(226) int local226;
					if (local202 != null) {
						for (local226 = 0; local226 < local202.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local202[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) local202[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (local208 != null) {
						for (local226 = 0; local226 < local208.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local208[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) local208[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray7 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray7.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.aClass20Array1[local60].aShortArray7[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.aClass20Array1[local60].aShortArray7[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray6 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray6.length; local226++) {
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aClass20Array1[local60].aShortArray6[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.aClass20Array1[local60].aShortArray6[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray523[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.anIntArray524[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aBoolean845 ? 1 : 0)) & 0xFFL)]) * -8746091183093017783L;
	}

	@OriginalMember(owner = "client!wr", name = "ai", descriptor = "()V", line = 94)
	void method32562() {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		this.aLong302 = 8746091183093017783L;
		this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anInt5659 * 1957003231 >> 8)) & 0xFFL)]) * -8746091183093017783L;
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anInt5659 * 1957003231)) & 0xFFL)]) * -8746091183093017783L;
		@Pc(60) int local60;
		for (local60 = 0; local60 < this.anIntArray522.length; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.anIntArray522[local60] >> 24)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 16)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.anIntArray522[local60] >> 8)) & 0xFFL)]) * -8746091183093017783L;
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray522[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		if (this.aClass20Array1 != null) {
			for (local60 = 0; local60 < this.aClass20Array1.length; local60++) {
				if (this.aClass20Array1[local60] != null) {
					@Pc(202) int[] local202;
					@Pc(208) int[] local208;
					if (this.aBoolean845) {
						local202 = this.aClass20Array1[local60].anIntArray8;
						local208 = this.aClass20Array1[local60].anIntArray11;
					} else {
						local202 = this.aClass20Array1[local60].anIntArray10;
						local208 = this.aClass20Array1[local60].anIntArray9;
					}
					@Pc(226) int local226;
					if (local202 != null) {
						for (local226 = 0; local226 < local202.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local202[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) local202[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (local208 != null) {
						for (local226 = 0; local226 < local208.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (local208[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) local208[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray7 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray7.length; local226++) {
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) (this.aClass20Array1[local60].aShortArray7[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.aClass20Array1[local60].aShortArray7[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
					if (this.aClass20Array1[local60].aShortArray6 != null) {
						for (local226 = 0; local226 < this.aClass20Array1[local60].aShortArray6.length; local226++) {
							this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aClass20Array1[local60].aShortArray6[local226] >> 8)) & 0xFFL)]) * -8746091183093017783L;
							this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.aClass20Array1[local60].aShortArray6[local226]) & 0xFFL)]) * -8746091183093017783L;
						}
					}
				}
			}
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) this.anIntArray523[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		for (local60 = 0; local60 < 10; local60++) {
			this.aLong302 = (this.aLong302 * -5136918868954132743L >>> 8 ^ local1[(int) ((-5136918868954132743L * this.aLong302 ^ (long) this.anIntArray524[local60]) & 0xFFL)]) * -8746091183093017783L;
		}
		this.aLong302 = (-5136918868954132743L * this.aLong302 >>> 8 ^ local1[(int) ((this.aLong302 * -5136918868954132743L ^ (long) (this.aBoolean845 ? 1 : 0)) & 0xFFL)]) * -8746091183093017783L;
	}

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "(Lclient!dx;ILclient!anx;Lclient!anw;Lclient!anc;Lclient!ann;Lclient!cn;Lclient!cu;Lclient!zx;Lclient!zx;[Lclient!zx;[IIZLclient!wq;I)Lclient!dv;", line = 154)
	public Class84 method32563(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub15 arg2, @OriginalArg(3) Class35_Sub14 arg3, @OriginalArg(4) Class35_Sub3 arg4, @OriginalArg(5) Class35_Sub7 arg5, @OriginalArg(6) Interface17 arg6, @OriginalArg(7) Interface19 arg7, @OriginalArg(8) Class151 arg8, @OriginalArg(9) Class151 arg9, @OriginalArg(10) Class151[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class627 arg14) {
		if (this.anInt5660 * 1568742735 != -1) {
			return ((Class333) arg4.method18319(this.anInt5660 * 1568742735)).method27623(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		@Pc(29) int local29 = arg1;
		@Pc(34) long local34 = this.aLong302 * -5136918868954132743L;
		@Pc(37) int[] local37 = this.anIntArray522;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(68) int local68;
		if (arg8 != null) {
			@Pc(48) Class234 local48 = arg8.method23398();
			if (local48 != null && (local48.anInt3770 * 1456424793 >= 0 || local48.anInt3775 * -2133808015 >= 0)) {
				local37 = new int[this.anIntArray522.length];
				for (local68 = 0; local68 < local37.length; local68++) {
					local37[local68] = this.anIntArray522[local68];
				}
				if (local48.anInt3770 * 1456424793 >= 0 && arg14.anInt5649 * 133098641 != -1) {
					local39 = true;
					if (local48.anInt3770 * 1456424793 == 65535) {
						local37[arg14.anInt5649 * 133098641] = 0;
						for (local68 = 0; local68 < arg14.anIntArray520.length; local68++) {
							local37[arg14.anIntArray520[local68]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg14.anInt5649 * 133098641] = local48.anInt3770 * 1456424793 | 0x40000000;
						for (local68 = 0; local68 < arg14.anIntArray520.length; local68++) {
							local37[arg14.anIntArray520[local68]] = 0;
						}
						local34 ^= (long) local37[arg14.anInt5649 * 133098641] << 32;
					}
				}
				if (local48.anInt3775 * -2133808015 >= 0 && arg14.anInt5650 * 1980974041 != -1) {
					local41 = true;
					if (local48.anInt3775 * -2133808015 == 65535) {
						local37[arg14.anInt5650 * 1980974041] = 0;
						for (local68 = 0; local68 < arg14.anIntArray521.length; local68++) {
							local37[arg14.anIntArray521[local68]] = 0;
						}
						local34 ^= 0xFFFFFFFFL;
					} else {
						local37[arg14.anInt5650 * 1980974041] = local48.anInt3775 * -2133808015 | 0x40000000;
						for (local68 = 0; local68 < arg14.anIntArray521.length; local68++) {
							local37[arg14.anIntArray521[local68]] = 0;
						}
						local34 ^= local37[arg14.anInt5650 * 1980974041];
					}
				}
			}
		}
		@Pc(255) boolean local255 = false;
		local68 = arg10 == null ? 0 : arg10.length;
		for (@Pc(265) int local265 = 0; local265 < local68; local265++) {
			if (arg10[local265] != null) {
				local29 |= arg10[local265].method23432();
				local255 = true;
			}
		}
		if (arg8 != null) {
			local29 |= arg8.method23432();
			local255 = true;
		}
		if (arg9 != null) {
			local29 |= arg9.method23432();
			local255 = true;
		}
		@Pc(309) boolean local309 = false;
		if (arg11 != null) {
			for (@Pc(313) int local313 = 0; local313 < arg11.length; local313++) {
				if (arg11[local313] != -1) {
					local29 |= 0x20;
					local309 = true;
				}
			}
		}
		@Pc(333) Class232 local333 = aClass232_90;
		@Pc(339) Class84 local339;
		synchronized (aClass232_90) {
			local339 = (Class84) aClass232_90.method25835(local34);
		}
		@Pc(349) Class570 local349 = null;
		if (this.anInt5659 * 1957003231 != -1) {
			local349 = (Class570) arg2.method18319(this.anInt5659 * 1957003231);
		}
		@Pc(386) int local386;
		@Pc(394) int local394;
		if (local339 == null || arg0.method20116(local339.method6875(), local29) != 0) {
			if (local339 != null) {
				local29 = arg0.method20117(local29, local339.method6875());
			}
			@Pc(384) boolean local384 = false;
			local386 = 0;
			while (true) {
				@Pc(411) int local411;
				if (local386 >= local37.length) {
					if (local384) {
						if (this.aLong301 * -1838289588078258487L != -1L) {
							@Pc(524) Class232 local524 = aClass232_90;
							synchronized (aClass232_90) {
								local339 = (Class84) aClass232_90.method25835(this.aLong301 * -1838289588078258487L);
							}
						}
						if (local339 == null || arg0.method20116(local339.method6875(), local29) != 0) {
							return null;
						}
					} else {
						@Pc(556) Class216[] local556 = new Class216[local37.length];
						@Pc(566) int local566;
						for (local394 = 0; local394 < local37.length; local394++) {
							local566 = local37[local394];
							@Pc(568) Class20 local568 = null;
							@Pc(582) boolean local582 = local394 == 5 && local39 || local394 == 3 && local41;
							@Pc(616) Class216 local616;
							if ((local566 & 0x40000000) != 0) {
								if (!local582 && this.aClass20Array1 != null && this.aClass20Array1[local394] != null) {
									local568 = this.aClass20Array1[local394];
								}
								local616 = ((Class18) arg5.method18319(local566 & 0x3FFFFFFF)).method370(this.aBoolean845, local568);
								if (local616 != null) {
									local556[local394] = local616;
								}
							} else if ((local566 & Integer.MIN_VALUE) != 0) {
								local616 = ((Class351) arg3.method18319(local566 & 0x3FFFFFFF)).method27898();
								if (local616 != null) {
									local556[local394] = local616;
								}
							}
						}
						@Pc(670) int local670;
						if (local349 != null && local349.anIntArrayArray60 != null) {
							for (local394 = 0; local394 < local349.anIntArrayArray60.length; local394++) {
								if (local556[local394] != null) {
									local566 = 0;
									local670 = 0;
									local411 = 0;
									@Pc(674) int local674 = 0;
									@Pc(676) int local676 = 0;
									@Pc(678) int local678 = 0;
									if (local349.anIntArrayArray60[local394] != null) {
										local566 = local349.anIntArrayArray60[local394][0];
										local670 = local349.anIntArrayArray60[local394][1];
										local411 = local349.anIntArrayArray60[local394][2];
										local674 = local349.anIntArrayArray60[local394][3] << 3;
										local676 = local349.anIntArrayArray60[local394][4] << 3;
										local678 = local349.anIntArrayArray60[local394][5] << 3;
									}
									if (local674 != 0 || local676 != 0 || local678 != 0) {
										local556[local394].method25691(local674, local676, local678);
									}
									if (local566 != 0 || local670 != 0 || local411 != 0) {
										local556[local394].method25689(local566, local670, local411);
									}
								}
							}
						}
						@Pc(770) Class216 local770 = new Class216(local556, local556.length);
						@Pc(774) int local774 = local29 | 0x4000;
						local339 = arg0.method20115(local770, local774, Class595.anInt5507 * -18281241, 64, 850);
						for (local566 = 0; local566 < 10; local566++) {
							for (local670 = 0; local670 < aShortArrayArray5[local566].length; local670++) {
								if (this.anIntArray523[local566] < Class101.aShortArrayArrayArray9[local566][local670].length) {
									local339.method6835(aShortArrayArray5[local566][local670], Class101.aShortArrayArrayArray9[local566][local670][this.anIntArray523[local566]]);
								}
							}
						}
						for (local566 = 0; local566 < 10; local566++) {
							for (local670 = 0; local670 < Class580.aShortArrayArray4[local566].length; local670++) {
								if (this.anIntArray524[local566] < Class479.aShortArrayArrayArray10[local566][local670].length) {
									local339.method6890(Class580.aShortArrayArray4[local566][local670], Class479.aShortArrayArrayArray10[local566][local670][this.anIntArray524[local566]]);
								}
							}
						}
						local339.method6829();
						if (arg13) {
							local339.method6795(local29);
							@Pc(884) Class232 local884 = aClass232_90;
							synchronized (aClass232_90) {
								aClass232_90.method25844(local339, local34);
							}
							this.aLong301 = local34 * 4695899949764322169L;
						}
					}
					break;
				}
				local394 = local37[local386];
				@Pc(396) Class20 local396 = null;
				@Pc(398) boolean local398 = false;
				if (local39) {
					if (arg14.anInt5649 * 133098641 == local386) {
						local398 = true;
					} else {
						for (local411 = 0; local411 < arg14.anIntArray520.length; local411++) {
							if (local386 == arg14.anIntArray520[local411]) {
								local398 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (local386 == arg14.anInt5650 * 1980974041) {
						local398 = true;
					} else {
						for (local411 = 0; local411 < arg14.anIntArray521.length; local411++) {
							if (local386 == arg14.anIntArray521[local411]) {
								local398 = true;
								break;
							}
						}
					}
				}
				if ((local394 & 0x40000000) != 0) {
					if (!local398 && this.aClass20Array1 != null && this.aClass20Array1[local386] != null) {
						local396 = this.aClass20Array1[local386];
					}
					if (!((Class18) arg5.method18319(local394 & 0x3FFFFFFF)).method369(this.aBoolean845, local396)) {
						local384 = true;
					}
				} else if ((local394 & Integer.MIN_VALUE) != 0 && !((Class351) arg3.method18319(local394 & 0x3FFFFFFF)).method27894()) {
					local384 = true;
				}
				local386++;
			}
		}
		@Pc(908) Class84 local908 = local339.method6794((byte) 4, local29, true);
		if (!local255 && !local309) {
			return local908;
		}
		@Pc(916) Class455[] local916 = null;
		if (local349 != null) {
			local916 = local349.method31451();
		}
		if (local309 && local916 != null) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (local916[local386] != null) {
					local908.method6816(local916[local386], 0x1 << local386, true);
				}
			}
		}
		local386 = 0;
		local394 = 1;
		while (local386 < local68) {
			if (arg10[local386] != null) {
				arg10[local386].method23439(local908, 0, local394);
			}
			local386++;
			local394 <<= 0x1;
		}
		if (local309) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (arg11[local386] != -1) {
					local394 = arg11[local386] - arg12;
					local394 &= 0x3FFF;
					@Pc(1004) Class455 local1004 = new Class455();
					local1004.method29411(0.0F, 1.0F, 0.0F, Class436.method28911(local394));
					local908.method6816(local1004, 0x1 << local386, false);
				}
			}
		}
		if (local309 && local916 != null) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (local916[local386] != null) {
					local908.method6816(local916[local386], 0x1 << local386, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class608.method32138(local908, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method23438(local908, 0);
		} else if (arg9 != null) {
			arg9.method23438(local908, 0);
		}
		return local908;
	}

	@OriginalMember(owner = "client!wr", name = "ag", descriptor = "(Lclient!dx;ILclient!anx;Lclient!anw;Lclient!anc;Lclient!ann;Lclient!cn;Lclient!cu;Lclient!zx;Lclient!zx;[Lclient!zx;[IIZLclient!wq;)Lclient!dv;", line = 154)
	public Class84 method32564(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub15 arg2, @OriginalArg(3) Class35_Sub14 arg3, @OriginalArg(4) Class35_Sub3 arg4, @OriginalArg(5) Class35_Sub7 arg5, @OriginalArg(6) Interface17 arg6, @OriginalArg(7) Interface19 arg7, @OriginalArg(8) Class151 arg8, @OriginalArg(9) Class151 arg9, @OriginalArg(10) Class151[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) Class627 arg14) {
		if (this.anInt5660 * 1568742735 != -1) {
			return ((Class333) arg4.method18319(this.anInt5660 * 1568742735)).method27623(arg0, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, null);
		}
		@Pc(29) int local29 = arg1;
		@Pc(34) long local34 = this.aLong302 * -5136918868954132743L;
		@Pc(37) int[] local37 = this.anIntArray522;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(68) int local68;
		if (arg8 != null) {
			@Pc(48) Class234 local48 = arg8.method23398();
			if (local48 != null && (local48.anInt3770 * 1456424793 >= 0 || local48.anInt3775 * -2133808015 >= 0)) {
				local37 = new int[this.anIntArray522.length];
				for (local68 = 0; local68 < local37.length; local68++) {
					local37[local68] = this.anIntArray522[local68];
				}
				if (local48.anInt3770 * 1456424793 >= 0 && arg14.anInt5649 * 133098641 != -1) {
					local39 = true;
					if (local48.anInt3770 * 1456424793 == 65535) {
						local37[arg14.anInt5649 * 133098641] = 0;
						for (local68 = 0; local68 < arg14.anIntArray520.length; local68++) {
							local37[arg14.anIntArray520[local68]] = 0;
						}
						local34 ^= 0xFFFFFFFF00000000L;
					} else {
						local37[arg14.anInt5649 * 133098641] = local48.anInt3770 * 1456424793 | 0x40000000;
						for (local68 = 0; local68 < arg14.anIntArray520.length; local68++) {
							local37[arg14.anIntArray520[local68]] = 0;
						}
						local34 ^= (long) local37[arg14.anInt5649 * 133098641] << 32;
					}
				}
				if (local48.anInt3775 * -2133808015 >= 0 && arg14.anInt5650 * 1980974041 != -1) {
					local41 = true;
					if (local48.anInt3775 * -2133808015 == 65535) {
						local37[arg14.anInt5650 * 1980974041] = 0;
						for (local68 = 0; local68 < arg14.anIntArray521.length; local68++) {
							local37[arg14.anIntArray521[local68]] = 0;
						}
						local34 ^= 0xFFFFFFFFL;
					} else {
						local37[arg14.anInt5650 * 1980974041] = local48.anInt3775 * -2133808015 | 0x40000000;
						for (local68 = 0; local68 < arg14.anIntArray521.length; local68++) {
							local37[arg14.anIntArray521[local68]] = 0;
						}
						local34 ^= local37[arg14.anInt5650 * 1980974041];
					}
				}
			}
		}
		@Pc(255) boolean local255 = false;
		local68 = arg10 == null ? 0 : arg10.length;
		for (@Pc(265) int local265 = 0; local265 < local68; local265++) {
			if (arg10[local265] != null) {
				local29 |= arg10[local265].method23432();
				local255 = true;
			}
		}
		if (arg8 != null) {
			local29 |= arg8.method23432();
			local255 = true;
		}
		if (arg9 != null) {
			local29 |= arg9.method23432();
			local255 = true;
		}
		@Pc(309) boolean local309 = false;
		if (arg11 != null) {
			for (@Pc(313) int local313 = 0; local313 < arg11.length; local313++) {
				if (arg11[local313] != -1) {
					local29 |= 0x20;
					local309 = true;
				}
			}
		}
		@Pc(333) Class232 local333 = aClass232_90;
		@Pc(339) Class84 local339;
		synchronized (aClass232_90) {
			local339 = (Class84) aClass232_90.method25835(local34);
		}
		@Pc(349) Class570 local349 = null;
		if (this.anInt5659 * 1957003231 != -1) {
			local349 = (Class570) arg2.method18319(this.anInt5659 * 1957003231);
		}
		@Pc(386) int local386;
		@Pc(394) int local394;
		if (local339 == null || arg0.method20116(local339.method6875(), local29) != 0) {
			if (local339 != null) {
				local29 = arg0.method20117(local29, local339.method6875());
			}
			@Pc(384) boolean local384 = false;
			local386 = 0;
			while (true) {
				@Pc(411) int local411;
				if (local386 >= local37.length) {
					if (local384) {
						if (this.aLong301 * -1838289588078258487L != -1L) {
							@Pc(524) Class232 local524 = aClass232_90;
							synchronized (aClass232_90) {
								local339 = (Class84) aClass232_90.method25835(this.aLong301 * -1838289588078258487L);
							}
						}
						if (local339 == null || arg0.method20116(local339.method6875(), local29) != 0) {
							return null;
						}
					} else {
						@Pc(556) Class216[] local556 = new Class216[local37.length];
						@Pc(566) int local566;
						for (local394 = 0; local394 < local37.length; local394++) {
							local566 = local37[local394];
							@Pc(568) Class20 local568 = null;
							@Pc(582) boolean local582 = local394 == 5 && local39 || local394 == 3 && local41;
							@Pc(616) Class216 local616;
							if ((local566 & 0x40000000) != 0) {
								if (!local582 && this.aClass20Array1 != null && this.aClass20Array1[local394] != null) {
									local568 = this.aClass20Array1[local394];
								}
								local616 = ((Class18) arg5.method18319(local566 & 0x3FFFFFFF)).method370(this.aBoolean845, local568);
								if (local616 != null) {
									local556[local394] = local616;
								}
							} else if ((local566 & Integer.MIN_VALUE) != 0) {
								local616 = ((Class351) arg3.method18319(local566 & 0x3FFFFFFF)).method27898();
								if (local616 != null) {
									local556[local394] = local616;
								}
							}
						}
						@Pc(670) int local670;
						if (local349 != null && local349.anIntArrayArray60 != null) {
							for (local394 = 0; local394 < local349.anIntArrayArray60.length; local394++) {
								if (local556[local394] != null) {
									local566 = 0;
									local670 = 0;
									local411 = 0;
									@Pc(674) int local674 = 0;
									@Pc(676) int local676 = 0;
									@Pc(678) int local678 = 0;
									if (local349.anIntArrayArray60[local394] != null) {
										local566 = local349.anIntArrayArray60[local394][0];
										local670 = local349.anIntArrayArray60[local394][1];
										local411 = local349.anIntArrayArray60[local394][2];
										local674 = local349.anIntArrayArray60[local394][3] << 3;
										local676 = local349.anIntArrayArray60[local394][4] << 3;
										local678 = local349.anIntArrayArray60[local394][5] << 3;
									}
									if (local674 != 0 || local676 != 0 || local678 != 0) {
										local556[local394].method25691(local674, local676, local678);
									}
									if (local566 != 0 || local670 != 0 || local411 != 0) {
										local556[local394].method25689(local566, local670, local411);
									}
								}
							}
						}
						@Pc(770) Class216 local770 = new Class216(local556, local556.length);
						@Pc(774) int local774 = local29 | 0x4000;
						local339 = arg0.method20115(local770, local774, Class595.anInt5507 * -18281241, 64, 850);
						for (local566 = 0; local566 < 10; local566++) {
							for (local670 = 0; local670 < aShortArrayArray5[local566].length; local670++) {
								if (this.anIntArray523[local566] < Class101.aShortArrayArrayArray9[local566][local670].length) {
									local339.method6835(aShortArrayArray5[local566][local670], Class101.aShortArrayArrayArray9[local566][local670][this.anIntArray523[local566]]);
								}
							}
						}
						for (local566 = 0; local566 < 10; local566++) {
							for (local670 = 0; local670 < Class580.aShortArrayArray4[local566].length; local670++) {
								if (this.anIntArray524[local566] < Class479.aShortArrayArrayArray10[local566][local670].length) {
									local339.method6890(Class580.aShortArrayArray4[local566][local670], Class479.aShortArrayArrayArray10[local566][local670][this.anIntArray524[local566]]);
								}
							}
						}
						local339.method6829();
						if (arg13) {
							local339.method6795(local29);
							@Pc(884) Class232 local884 = aClass232_90;
							synchronized (aClass232_90) {
								aClass232_90.method25844(local339, local34);
							}
							this.aLong301 = local34 * 4695899949764322169L;
						}
					}
					break;
				}
				local394 = local37[local386];
				@Pc(396) Class20 local396 = null;
				@Pc(398) boolean local398 = false;
				if (local39) {
					if (arg14.anInt5649 * 133098641 == local386) {
						local398 = true;
					} else {
						for (local411 = 0; local411 < arg14.anIntArray520.length; local411++) {
							if (local386 == arg14.anIntArray520[local411]) {
								local398 = true;
								break;
							}
						}
					}
				}
				if (local41) {
					if (local386 == arg14.anInt5650 * 1980974041) {
						local398 = true;
					} else {
						for (local411 = 0; local411 < arg14.anIntArray521.length; local411++) {
							if (local386 == arg14.anIntArray521[local411]) {
								local398 = true;
								break;
							}
						}
					}
				}
				if ((local394 & 0x40000000) != 0) {
					if (!local398 && this.aClass20Array1 != null && this.aClass20Array1[local386] != null) {
						local396 = this.aClass20Array1[local386];
					}
					if (!((Class18) arg5.method18319(local394 & 0x3FFFFFFF)).method369(this.aBoolean845, local396)) {
						local384 = true;
					}
				} else if ((local394 & Integer.MIN_VALUE) != 0 && !((Class351) arg3.method18319(local394 & 0x3FFFFFFF)).method27894()) {
					local384 = true;
				}
				local386++;
			}
		}
		@Pc(908) Class84 local908 = local339.method6794((byte) 4, local29, true);
		if (!local255 && !local309) {
			return local908;
		}
		@Pc(916) Class455[] local916 = null;
		if (local349 != null) {
			local916 = local349.method31451();
		}
		if (local309 && local916 != null) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (local916[local386] != null) {
					local908.method6816(local916[local386], 0x1 << local386, true);
				}
			}
		}
		local386 = 0;
		local394 = 1;
		while (local386 < local68) {
			if (arg10[local386] != null) {
				arg10[local386].method23439(local908, 0, local394);
			}
			local386++;
			local394 <<= 0x1;
		}
		if (local309) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (arg11[local386] != -1) {
					local394 = arg11[local386] - arg12;
					local394 &= 0x3FFF;
					@Pc(1004) Class455 local1004 = new Class455();
					local1004.method29411(0.0F, 1.0F, 0.0F, Class436.method28911(local394));
					local908.method6816(local1004, 0x1 << local386, false);
				}
			}
		}
		if (local309 && local916 != null) {
			for (local386 = 0; local386 < arg11.length; local386++) {
				if (local916[local386] != null) {
					local908.method6816(local916[local386], 0x1 << local386, false);
				}
			}
		}
		if (arg8 != null && arg9 != null) {
			Class608.method32138(local908, arg8, arg9);
		} else if (arg8 != null) {
			arg8.method23438(local908, 0);
		} else if (arg9 != null) {
			arg9.method23438(local908, 0);
		}
		return local908;
	}

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "(Lclient!dx;ILclient!anw;Lclient!anc;Lclient!ann;Lclient!cn;Lclient!cu;Lclient!zx;I)Lclient!dv;", line = 372)
	public Class84 method32565(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2, @OriginalArg(3) Class35_Sub3 arg3, @OriginalArg(4) Class35_Sub7 arg4, @OriginalArg(5) Interface17 arg5, @OriginalArg(6) Interface19 arg6, @OriginalArg(7) Class151 arg7) {
		if (this.anInt5660 * 1568742735 != -1) {
			return ((Class333) arg3.method18319(this.anInt5660 * 1568742735)).method27631(arg0, arg1, arg5, arg6, arg7, null);
		}
		@Pc(33) int local33 = arg7 == null ? arg1 : arg1 | arg7.method23432();
		@Pc(36) Class232 local36 = aClass232_91;
		@Pc(45) Class84 local45;
		synchronized (aClass232_91) {
			local45 = (Class84) aClass232_91.method25835(this.aLong302 * -5136918868954132743L);
		}
		if (local45 == null || arg0.method20116(local45.method6875(), local33) != 0) {
			if (local45 != null) {
				local33 = arg0.method20117(local33, local45.method6875());
			}
			@Pc(74) boolean local74 = false;
			@Pc(86) int local86;
			for (@Pc(76) int local76 = 0; local76 < this.anIntArray522.length; local76++) {
				local86 = this.anIntArray522[local76];
				@Pc(88) Class20 local88 = null;
				if ((local86 & 0x40000000) != 0) {
					if (this.aClass20Array1 != null && this.aClass20Array1[local76] != null) {
						local88 = this.aClass20Array1[local76];
					}
					if (!((Class18) arg4.method18319(local86 & 0x3FFFFFFF)).method371(this.aBoolean845, local88)) {
						local74 = true;
					}
				} else if ((local86 & Integer.MIN_VALUE) != 0 && !((Class351) arg2.method18319(local86 & 0x3FFFFFFF)).method27903()) {
					local74 = true;
				}
			}
			if (local74) {
				return null;
			}
			@Pc(149) Class216[] local149 = new Class216[this.anIntArray522.length];
			local86 = 0;
			@Pc(163) int local163;
			for (@Pc(153) int local153 = 0; local153 < this.anIntArray522.length; local153++) {
				local163 = this.anIntArray522[local153];
				@Pc(165) Class20 local165 = null;
				@Pc(196) Class216 local196;
				if ((local163 & 0x40000000) != 0) {
					if (this.aClass20Array1 != null && this.aClass20Array1[local153] != null) {
						local165 = this.aClass20Array1[local153];
					}
					local196 = ((Class18) arg4.method18319(local163 & 0x3FFFFFFF)).method376(this.aBoolean845, local165);
					if (local196 != null) {
						local149[local86++] = local196;
					}
				} else if ((local163 & Integer.MIN_VALUE) != 0) {
					local196 = ((Class351) arg2.method18319(local163 & 0x3FFFFFFF)).method27904();
					if (local196 != null) {
						local149[local86++] = local196;
					}
				}
			}
			@Pc(235) Class216 local235 = new Class216(local149, local86);
			@Pc(239) int local239 = local33 | 0x4000;
			local45 = arg0.method20115(local235, local239, Class595.anInt5507 * -18281241, 64, 768);
			@Pc(256) int local256;
			for (local163 = 0; local163 < 10; local163++) {
				for (local256 = 0; local256 < aShortArrayArray5[local163].length; local256++) {
					if (this.anIntArray523[local163] < Class101.aShortArrayArrayArray9[local163][local256].length) {
						local45.method6835(aShortArrayArray5[local163][local256], Class101.aShortArrayArrayArray9[local163][local256][this.anIntArray523[local163]]);
					}
				}
			}
			for (local163 = 0; local163 < 10; local163++) {
				for (local256 = 0; local256 < Class580.aShortArrayArray4[local163].length; local256++) {
					if (this.anIntArray524[local163] < Class479.aShortArrayArrayArray10[local163][local256].length) {
						local45.method6890(Class580.aShortArrayArray4[local163][local256], Class479.aShortArrayArrayArray10[local163][local256][this.anIntArray524[local163]]);
					}
				}
			}
			local45.method6795(local33);
			@Pc(345) Class232 local345 = aClass232_91;
			synchronized (aClass232_91) {
				aClass232_91.method25844(local45, this.aLong302 * -5136918868954132743L);
			}
		}
		if (arg7 == null) {
			return local45;
		} else {
			@Pc(372) Class84 local372 = local45.method6794((byte) 4, local33, true);
			arg7.method23438(local372, 0);
			return local372;
		}
	}

	@OriginalMember(owner = "client!wr", name = "al", descriptor = "(Lclient!dx;ILclient!anw;Lclient!anc;Lclient!ann;Lclient!cn;Lclient!cu;Lclient!zx;)Lclient!dv;", line = 372)
	public Class84 method32566(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2, @OriginalArg(3) Class35_Sub3 arg3, @OriginalArg(4) Class35_Sub7 arg4, @OriginalArg(5) Interface17 arg5, @OriginalArg(6) Interface19 arg6, @OriginalArg(7) Class151 arg7) {
		if (this.anInt5660 * 1568742735 != -1) {
			return ((Class333) arg3.method18319(this.anInt5660 * 1568742735)).method27631(arg0, arg1, arg5, arg6, arg7, null);
		}
		@Pc(33) int local33 = arg7 == null ? arg1 : arg1 | arg7.method23432();
		@Pc(36) Class232 local36 = aClass232_91;
		@Pc(45) Class84 local45;
		synchronized (aClass232_91) {
			local45 = (Class84) aClass232_91.method25835(this.aLong302 * -5136918868954132743L);
		}
		if (local45 == null || arg0.method20116(local45.method6875(), local33) != 0) {
			if (local45 != null) {
				local33 = arg0.method20117(local33, local45.method6875());
			}
			@Pc(74) boolean local74 = false;
			@Pc(86) int local86;
			for (@Pc(76) int local76 = 0; local76 < this.anIntArray522.length; local76++) {
				local86 = this.anIntArray522[local76];
				@Pc(88) Class20 local88 = null;
				if ((local86 & 0x40000000) != 0) {
					if (this.aClass20Array1 != null && this.aClass20Array1[local76] != null) {
						local88 = this.aClass20Array1[local76];
					}
					if (!((Class18) arg4.method18319(local86 & 0x3FFFFFFF)).method371(this.aBoolean845, local88)) {
						local74 = true;
					}
				} else if ((local86 & Integer.MIN_VALUE) != 0 && !((Class351) arg2.method18319(local86 & 0x3FFFFFFF)).method27903()) {
					local74 = true;
				}
			}
			if (local74) {
				return null;
			}
			@Pc(149) Class216[] local149 = new Class216[this.anIntArray522.length];
			local86 = 0;
			@Pc(163) int local163;
			for (@Pc(153) int local153 = 0; local153 < this.anIntArray522.length; local153++) {
				local163 = this.anIntArray522[local153];
				@Pc(165) Class20 local165 = null;
				@Pc(196) Class216 local196;
				if ((local163 & 0x40000000) != 0) {
					if (this.aClass20Array1 != null && this.aClass20Array1[local153] != null) {
						local165 = this.aClass20Array1[local153];
					}
					local196 = ((Class18) arg4.method18319(local163 & 0x3FFFFFFF)).method376(this.aBoolean845, local165);
					if (local196 != null) {
						local149[local86++] = local196;
					}
				} else if ((local163 & Integer.MIN_VALUE) != 0) {
					local196 = ((Class351) arg2.method18319(local163 & 0x3FFFFFFF)).method27904();
					if (local196 != null) {
						local149[local86++] = local196;
					}
				}
			}
			@Pc(235) Class216 local235 = new Class216(local149, local86);
			@Pc(239) int local239 = local33 | 0x4000;
			local45 = arg0.method20115(local235, local239, Class595.anInt5507 * -18281241, 64, 768);
			@Pc(256) int local256;
			for (local163 = 0; local163 < 10; local163++) {
				for (local256 = 0; local256 < aShortArrayArray5[local163].length; local256++) {
					if (this.anIntArray523[local163] < Class101.aShortArrayArrayArray9[local163][local256].length) {
						local45.method6835(aShortArrayArray5[local163][local256], Class101.aShortArrayArrayArray9[local163][local256][this.anIntArray523[local163]]);
					}
				}
			}
			for (local163 = 0; local163 < 10; local163++) {
				for (local256 = 0; local256 < Class580.aShortArrayArray4[local163].length; local256++) {
					if (this.anIntArray524[local163] < Class479.aShortArrayArrayArray10[local163][local256].length) {
						local45.method6890(Class580.aShortArrayArray4[local163][local256], Class479.aShortArrayArrayArray10[local163][local256][this.anIntArray524[local163]]);
					}
				}
			}
			local45.method6795(local33);
			@Pc(345) Class232 local345 = aClass232_91;
			synchronized (aClass232_91) {
				aClass232_91.method25844(local45, this.aLong302 * -5136918868954132743L);
			}
		}
		if (arg7 == null) {
			return local45;
		} else {
			@Pc(372) Class84 local372 = local45.method6794((byte) 4, local33, true);
			arg7.method23438(local372, 0);
			return local372;
		}
	}

	@OriginalMember(owner = "client!wr", name = "ao", descriptor = "(Lclient!dx;ILclient!anw;Lclient!anb;Lclient!zx;III)Lclient!dv;", line = 436)
	public Class84 method32567(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2, @OriginalArg(3) Class35_Sub2 arg3, @OriginalArg(4) Class151 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(9) int local9 = arg4 == null ? arg1 : arg1 | arg4.method23432();
		@Pc(22) long local22 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(25) Class232 local25 = aClass232_91;
		@Pc(31) Class84 local31;
		synchronized (aClass232_91) {
			local31 = (Class84) aClass232_91.method25835(local22);
		}
		if (local31 == null || arg0.method20116(local31.method6875(), local9) != 0) {
			if (local31 != null) {
				local9 = arg0.method20117(local9, local31.method6875());
			}
			@Pc(61) Class216[] local61 = new Class216[3];
			@Pc(63) int local63 = 0;
			if (!((Class351) arg2.method18319(arg5)).method27903() || !((Class351) arg2.method18319(arg6)).method27903() || !((Class351) arg2.method18319(arg7)).method27903()) {
				return null;
			}
			@Pc(95) Class216 local95 = ((Class351) arg2.method18319(arg5)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = ((Class351) arg2.method18319(arg6)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = ((Class351) arg2.method18319(arg7)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = new Class216(local61, local63);
			@Pc(143) int local143 = local9 | 0x4000;
			local31 = arg0.method20115(local95, local143, Class595.anInt5507 * -18281241, 64, 768);
			@Pc(155) int local155;
			@Pc(160) int local160;
			for (local155 = 0; local155 < 10; local155++) {
				for (local160 = 0; local160 < aShortArrayArray5[local155].length; local160++) {
					if (this.anIntArray523[local155] < Class101.aShortArrayArrayArray9[local155][local160].length) {
						local31.method6835(aShortArrayArray5[local155][local160], Class101.aShortArrayArrayArray9[local155][local160][this.anIntArray523[local155]]);
					}
				}
			}
			for (local155 = 0; local155 < 10; local155++) {
				for (local160 = 0; local160 < Class580.aShortArrayArray4[local155].length; local160++) {
					if (this.anIntArray524[local155] < Class479.aShortArrayArrayArray10[local155][local160].length) {
						local31.method6890(Class580.aShortArrayArray4[local155][local160], Class479.aShortArrayArrayArray10[local155][local160][this.anIntArray524[local155]]);
					}
				}
			}
			local31.method6795(local9);
			@Pc(249) Class232 local249 = aClass232_91;
			synchronized (aClass232_91) {
				aClass232_91.method25844(local31, local22);
			}
		}
		if (arg4 == null) {
			return local31;
		} else {
			local31 = local31.method6794((byte) 4, local9, true);
			arg4.method23438(local31, 0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(Lclient!dx;ILclient!anw;Lclient!anb;Lclient!zx;IIII)Lclient!dv;", line = 436)
	public Class84 method32568(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub14 arg2, @OriginalArg(3) Class35_Sub2 arg3, @OriginalArg(4) Class151 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(9) int local9 = arg4 == null ? arg1 : arg1 | arg4.method23432();
		@Pc(22) long local22 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
		@Pc(25) Class232 local25 = aClass232_91;
		@Pc(31) Class84 local31;
		synchronized (aClass232_91) {
			local31 = (Class84) aClass232_91.method25835(local22);
		}
		if (local31 == null || arg0.method20116(local31.method6875(), local9) != 0) {
			if (local31 != null) {
				local9 = arg0.method20117(local9, local31.method6875());
			}
			@Pc(61) Class216[] local61 = new Class216[3];
			@Pc(63) int local63 = 0;
			if (!((Class351) arg2.method18319(arg5)).method27903() || !((Class351) arg2.method18319(arg6)).method27903() || !((Class351) arg2.method18319(arg7)).method27903()) {
				return null;
			}
			@Pc(95) Class216 local95 = ((Class351) arg2.method18319(arg5)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = ((Class351) arg2.method18319(arg6)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = ((Class351) arg2.method18319(arg7)).method27904();
			if (local95 != null) {
				local61[local63++] = local95;
			}
			local95 = new Class216(local61, local63);
			@Pc(143) int local143 = local9 | 0x4000;
			local31 = arg0.method20115(local95, local143, Class595.anInt5507 * -18281241, 64, 768);
			@Pc(155) int local155;
			@Pc(160) int local160;
			for (local155 = 0; local155 < 10; local155++) {
				for (local160 = 0; local160 < aShortArrayArray5[local155].length; local160++) {
					if (this.anIntArray523[local155] < Class101.aShortArrayArrayArray9[local155][local160].length) {
						local31.method6835(aShortArrayArray5[local155][local160], Class101.aShortArrayArrayArray9[local155][local160][this.anIntArray523[local155]]);
					}
				}
			}
			for (local155 = 0; local155 < 10; local155++) {
				for (local160 = 0; local160 < Class580.aShortArrayArray4[local155].length; local160++) {
					if (this.anIntArray524[local155] < Class479.aShortArrayArrayArray10[local155][local160].length) {
						local31.method6890(Class580.aShortArrayArray4[local155][local160], Class479.aShortArrayArrayArray10[local155][local160][this.anIntArray524[local155]]);
					}
				}
			}
			local31.method6795(local9);
			@Pc(249) Class232 local249 = aClass232_91;
			synchronized (aClass232_91) {
				aClass232_91.method25844(local31, local22);
			}
		}
		if (arg4 == null) {
			return local31;
		} else {
			local31 = local31.method6794((byte) 4, local9, true);
			arg4.method23438(local31, 0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!wr", name = "ak", descriptor = "()I", line = 481)
	public static int method32569() {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			return aClass232_90.method25855();
		}
	}

	@OriginalMember(owner = "client!wr", name = "au", descriptor = "()V", line = 497)
	public static void method32570() {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25850();
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25850();
		}
	}

	@OriginalMember(owner = "client!wr", name = "ax", descriptor = "(I)V", line = 506)
	public static void method32571(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25847(arg0);
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "ar", descriptor = "(I)V", line = 506)
	public static void method32572(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25847(arg0);
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "ad", descriptor = "(I)V", line = 506)
	public static void method32573(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25847(arg0);
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "ac", descriptor = "(I)V", line = 506)
	public static void method32574(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25847(arg0);
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "av", descriptor = "()V", line = 515)
	public static void method32575() {
		@Pc(2) Class232 local2 = aClass232_90;
		synchronized (aClass232_90) {
			aClass232_90.method25857();
		}
		local2 = aClass232_91;
		synchronized (aClass232_91) {
			aClass232_91.method25857();
		}
	}

	@OriginalMember(owner = "client!wr", name = "ci", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 4960)
	static final void method32576(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean663 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}
}
