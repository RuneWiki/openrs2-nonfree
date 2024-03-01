package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public class Class245 {

	@OriginalMember(owner = "client!iu", name = "ah", descriptor = "B")
	public static final byte aByte132 = -1;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
	static final int anInt3790 = 6;

	@OriginalMember(owner = "client!iu", name = "aa", descriptor = "B")
	static final byte aByte134 = 0;

	@OriginalMember(owner = "client!iu", name = "at", descriptor = "B")
	static final byte aByte136 = 127;

	@OriginalMember(owner = "client!iu", name = "af", descriptor = "B")
	static final byte aByte137 = 126;

	@OriginalMember(owner = "client!iu", name = "ak", descriptor = "B")
	static final byte aByte138 = 125;

	@OriginalMember(owner = "client!iu", name = "nl", descriptor = "Lclient!akp;")
	public static Class26_Sub1_Sub1_Sub1_Sub2 aClass26_Sub1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Z")
	boolean aBoolean684;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Z")
	boolean aBoolean685;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "J")
	long aLong252;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
	public int anInt3788;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "B")
	public byte aByte130;

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "B")
	public byte aByte131;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "B")
	public byte aByte133;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "[I")
	int[] anIntArray397;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "[I")
	int[] anIntArray398;

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "[I")
	public int[] anIntArray399;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "[Z")
	public boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "B")
	public byte aByte135;

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "[J")
	long[] aLongArray14;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray14;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray15;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!xn;")
	Class581 aClass581_29;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "[J")
	long[] aLongArray15;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	int anInt3786 = 0;

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "Ljava/lang/String;")
	public String aString193 = null;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
	int anInt3787 = 0;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
	public int anInt3789 = 1883802041;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
	public int anInt3785 = -1814525141;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 42)
	public Class245(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method24823(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "(II)V", line = 47)
	void method24809(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aBoolean685) {
			if (this.aStringArray14 == null) {
				this.aStringArray14 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray14, 0, this.aStringArray14 = new String[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aByteArray75 == null) {
			this.aByteArray75 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray75, 0, this.aByteArray75 = new byte[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray398 == null) {
			this.anIntArray398 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray398, 0, this.anIntArray398 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray399 == null) {
			this.anIntArray399 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray399, 0, this.anIntArray399 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.aBooleanArray29 == null) {
			this.aBooleanArray29 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray29, 0, this.aBooleanArray29 = new boolean[arg0], 0, this.anInt3788 * 1047229597);
		}
	}

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "(I)V", line = 47)
	void method24818(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aBoolean685) {
			if (this.aStringArray14 == null) {
				this.aStringArray14 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray14, 0, this.aStringArray14 = new String[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aByteArray75 == null) {
			this.aByteArray75 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray75, 0, this.aByteArray75 = new byte[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray398 == null) {
			this.anIntArray398 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray398, 0, this.anIntArray398 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray399 == null) {
			this.anIntArray399 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray399, 0, this.anIntArray399 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.aBooleanArray29 == null) {
			this.aBooleanArray29 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray29, 0, this.aBooleanArray29 = new boolean[arg0], 0, this.anInt3788 * 1047229597);
		}
	}

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "(I)V", line = 47)
	void method24824(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray15 == null) {
				this.aLongArray15 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray15, 0, this.aLongArray15 = new long[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aBoolean685) {
			if (this.aStringArray14 == null) {
				this.aStringArray14 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray14, 0, this.aStringArray14 = new String[arg0], 0, this.anInt3788 * 1047229597);
			}
		}
		if (this.aByteArray75 == null) {
			this.aByteArray75 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray75, 0, this.aByteArray75 = new byte[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray398 == null) {
			this.anIntArray398 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray398, 0, this.anIntArray398 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.anIntArray399 == null) {
			this.anIntArray399 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray399, 0, this.anIntArray399 = new int[arg0], 0, this.anInt3788 * 1047229597);
		}
		if (this.aBooleanArray29 == null) {
			this.aBooleanArray29 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray29, 0, this.aBooleanArray29 = new boolean[arg0], 0, this.anInt3788 * 1047229597);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V", line = 66)
	void method24803(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt3791 * -1161929397);
			}
		}
		if (!this.aBoolean685) {
			return;
		}
		if (this.aStringArray15 == null) {
			this.aStringArray15 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray15, 0, this.aStringArray15 = new String[arg0], 0, this.anInt3791 * -1161929397);
		}
	}

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "(I)V", line = 66)
	void method24820(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt3791 * -1161929397);
			}
		}
		if (!this.aBoolean685) {
			return;
		}
		if (this.aStringArray15 == null) {
			this.aStringArray15 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray15, 0, this.aStringArray15 = new String[arg0], 0, this.anInt3791 * -1161929397);
		}
	}

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "(I)V", line = 66)
	void method24825(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt3791 * -1161929397);
			}
		}
		if (!this.aBoolean685) {
			return;
		}
		if (this.aStringArray15 == null) {
			this.aStringArray15 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray15, 0, this.aStringArray15 = new String[arg0], 0, this.anInt3791 * -1161929397);
		}
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V", line = 66)
	void method24848(@OriginalArg(0) int arg0) {
		if (this.aBoolean684) {
			if (this.aLongArray14 == null) {
				this.aLongArray14 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray14, 0, this.aLongArray14 = new long[arg0], 0, this.anInt3791 * -1161929397);
			}
		}
		if (!this.aBoolean685) {
			return;
		}
		if (this.aStringArray15 == null) {
			this.aStringArray15 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray15, 0, this.aStringArray15 = new String[arg0], 0, this.anInt3791 * -1161929397);
		}
	}

	@OriginalMember(owner = "client!iu", name = "at", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method24802(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt3788 * 1047229597; local9++) {
			if (this.aStringArray14[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "(Ljava/lang/String;S)I", line = 77)
	public int method24804(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt3788 * 1047229597; local9++) {
			if (this.aStringArray14[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iu", name = "af", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method24829(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt3788 * 1047229597; local9++) {
			if (this.aStringArray14[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "(IIII)I", line = 85)
	public int method24805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray398[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!iu", name = "ak", descriptor = "(III)I", line = 85)
	public int method24831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray398[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!iu", name = "aa", descriptor = "(III)I", line = 85)
	public int method24845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray398[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "(IB)Ljava/lang/Integer;", line = 90)
	public Integer method24827(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub21 ? Integer.valueOf(((Class3_Sub21) local10).anInt1285 * 1585682181) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ah", descriptor = "(I)Ljava/lang/Integer;", line = 90)
	public Integer method24830(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub21 ? Integer.valueOf(((Class3_Sub21) local10).anInt1285 * 1585682181) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "an", descriptor = "(I)Ljava/lang/Integer;", line = 90)
	public Integer method24832(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub21 ? Integer.valueOf(((Class3_Sub21) local10).anInt1285 * 1585682181) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "(II)Ljava/lang/Long;", line = 97)
	public Long method24807(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "as", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method24834(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "aj", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method24835(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "aq", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method24836(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "av", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method24837(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ai", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method24854(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(10) Class3 local10 = this.aClass581_29.method33217((long) arg0);
			return local10 != null && local10 instanceof Class3_Sub36 ? Long.valueOf(((Class3_Sub36) local10).aLong79 * 5522342608882961519L) : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ax", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method24801(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(11) Class3 local11 = this.aClass581_29.method33217((long) arg0);
			return local11 != null && local11 instanceof Class3_Sub29 ? (String) ((Class3_Sub29) local11).anObject2 : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "(IB)Ljava/lang/String;", line = 104)
	public String method24808(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(11) Class3 local11 = this.aClass581_29.method33217((long) arg0);
			return local11 != null && local11 instanceof Class3_Sub29 ? (String) ((Class3_Sub29) local11).anObject2 : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "az", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method24839(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(11) Class3 local11 = this.aClass581_29.method33217((long) arg0);
			return local11 != null && local11 instanceof Class3_Sub29 ? (String) ((Class3_Sub29) local11).anObject2 : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "al", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method24840(@OriginalArg(0) int arg0) {
		if (this.aClass581_29 == null) {
			return null;
		} else {
			@Pc(11) Class3 local11 = this.aClass581_29.method33217((long) arg0);
			return local11 != null && local11 instanceof Class3_Sub29 ? (String) ((Class3_Sub29) local11).anObject2 : null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ap", descriptor = "()[I", line = 111)
	public int[] method24822() {
		if (this.anIntArray397 == null) {
			@Pc(9) String[] local9 = new String[this.anInt3788 * 1047229597];
			this.anIntArray397 = new int[this.anInt3788 * 1047229597];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt3788 * 1047229597) {
				local9[local18] = this.aStringArray14[local18];
				if (local9[local18] != null) {
					local9[local18] = local9[local18].toLowerCase();
				}
				this.anIntArray397[local18] = local18++;
			}
			Class107.method21922(local9, this.anIntArray397);
		}
		return this.anIntArray397;
	}

	@OriginalMember(owner = "client!iu", name = "ao", descriptor = "()[I", line = 111)
	public int[] method24841() {
		if (this.anIntArray397 == null) {
			@Pc(9) String[] local9 = new String[this.anInt3788 * 1047229597];
			this.anIntArray397 = new int[this.anInt3788 * 1047229597];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt3788 * 1047229597) {
				local9[local18] = this.aStringArray14[local18];
				if (local9[local18] != null) {
					local9[local18] = local9[local18].toLowerCase();
				}
				this.anIntArray397[local18] = local18++;
			}
			Class107.method21922(local9, this.anIntArray397);
		}
		return this.anIntArray397;
	}

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "(I)[I", line = 111)
	public int[] method24851() {
		if (this.anIntArray397 == null) {
			@Pc(9) String[] local9 = new String[this.anInt3788 * 1047229597];
			this.anIntArray397 = new int[this.anInt3788 * 1047229597];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt3788 * 1047229597) {
				local9[local18] = this.aStringArray14[local18];
				if (local9[local18] != null) {
					local9[local18] = local9[local18].toLowerCase();
				}
				this.anIntArray397[local18] = local18++;
			}
			Class107.method21922(local9, this.anIntArray397);
		}
		return this.anIntArray397;
	}

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "(JLjava/lang/String;II)V", line = 125)
	void method24810(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean684 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean685) {
			if (arg0 > 0L && (this.aLongArray15 == null || this.anInt3788 * 1047229597 >= this.aLongArray15.length) || arg1 != null && (this.aStringArray14 == null || this.anInt3788 * 1047229597 >= this.aStringArray14.length)) {
				this.method24809(this.anInt3788 * 1047229597 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt3788 * 1047229597] = arg0;
			}
			if (this.aStringArray14 != null) {
				this.aStringArray14[this.anInt3788 * 1047229597] = arg1;
			}
			if (this.anInt3789 * -1826008201 == -1) {
				this.anInt3789 = this.anInt3788 * -423053941;
				this.aByteArray75[this.anInt3788 * 1047229597] = 126;
			} else {
				this.aByteArray75[this.anInt3788 * 1047229597] = 0;
			}
			this.anIntArray398[this.anInt3788 * 1047229597] = 0;
			this.anIntArray399[this.anInt3788 * 1047229597] = arg2;
			this.aBooleanArray29[this.anInt3788 * 1047229597] = false;
			this.anInt3788 += 136229301;
			this.anIntArray397 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "ay", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method24816(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean684 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean685) {
			if (arg0 > 0L && (this.aLongArray15 == null || this.anInt3788 * 1047229597 >= this.aLongArray15.length) || arg1 != null && (this.aStringArray14 == null || this.anInt3788 * 1047229597 >= this.aStringArray14.length)) {
				this.method24809(this.anInt3788 * 1047229597 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt3788 * 1047229597] = arg0;
			}
			if (this.aStringArray14 != null) {
				this.aStringArray14[this.anInt3788 * 1047229597] = arg1;
			}
			if (this.anInt3789 * -1826008201 == -1) {
				this.anInt3789 = this.anInt3788 * -423053941;
				this.aByteArray75[this.anInt3788 * 1047229597] = 126;
			} else {
				this.aByteArray75[this.anInt3788 * 1047229597] = 0;
			}
			this.anIntArray398[this.anInt3788 * 1047229597] = 0;
			this.anIntArray399[this.anInt3788 * 1047229597] = arg2;
			this.aBooleanArray29[this.anInt3788 * 1047229597] = false;
			this.anInt3788 += 136229301;
			this.anIntArray397 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "ab", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method24843(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean684 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean685) {
			if (arg0 > 0L && (this.aLongArray15 == null || this.anInt3788 * 1047229597 >= this.aLongArray15.length) || arg1 != null && (this.aStringArray14 == null || this.anInt3788 * 1047229597 >= this.aStringArray14.length)) {
				this.method24809(this.anInt3788 * 1047229597 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt3788 * 1047229597] = arg0;
			}
			if (this.aStringArray14 != null) {
				this.aStringArray14[this.anInt3788 * 1047229597] = arg1;
			}
			if (this.anInt3789 * -1826008201 == -1) {
				this.anInt3789 = this.anInt3788 * -423053941;
				this.aByteArray75[this.anInt3788 * 1047229597] = 126;
			} else {
				this.aByteArray75[this.anInt3788 * 1047229597] = 0;
			}
			this.anIntArray398[this.anInt3788 * 1047229597] = 0;
			this.anIntArray399[this.anInt3788 * 1047229597] = arg2;
			this.aBooleanArray29[this.anInt3788 * 1047229597] = false;
			this.anInt3788 += 136229301;
			this.anIntArray397 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "au", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method24844(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean684 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean685) {
			if (arg0 > 0L && (this.aLongArray15 == null || this.anInt3788 * 1047229597 >= this.aLongArray15.length) || arg1 != null && (this.aStringArray14 == null || this.anInt3788 * 1047229597 >= this.aStringArray14.length)) {
				this.method24809(this.anInt3788 * 1047229597 + 5);
			}
			if (this.aLongArray15 != null) {
				this.aLongArray15[this.anInt3788 * 1047229597] = arg0;
			}
			if (this.aStringArray14 != null) {
				this.aStringArray14[this.anInt3788 * 1047229597] = arg1;
			}
			if (this.anInt3789 * -1826008201 == -1) {
				this.anInt3789 = this.anInt3788 * -423053941;
				this.aByteArray75[this.anInt3788 * 1047229597] = 126;
			} else {
				this.aByteArray75[this.anInt3788 * 1047229597] = 0;
			}
			this.anIntArray398[this.anInt3788 * 1047229597] = 0;
			this.anIntArray399[this.anInt3788 * 1047229597] = arg2;
			this.aBooleanArray29[this.anInt3788 * 1047229597] = false;
			this.anInt3788 += 136229301;
			this.anIntArray397 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V", line = 146)
	void method24811(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt3788 * 1047229597) {
			throw new RuntimeException("");
		}
		this.anInt3788 -= 136229301;
		this.anIntArray397 = null;
		if (this.anInt3788 * 1047229597 == 0) {
			this.aLongArray15 = null;
			this.aStringArray14 = null;
			this.aByteArray75 = null;
			this.anIntArray398 = null;
			this.anIntArray399 = null;
			this.aBooleanArray29 = null;
			this.anInt3789 = 1883802041;
			this.anInt3785 = -1814525141;
			return;
		}
		System.arraycopy(this.aByteArray75, arg0 + 1, this.aByteArray75, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.anIntArray398, arg0 + 1, this.anIntArray398, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.anIntArray399, arg0 + 1, this.anIntArray399, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.aBooleanArray29, arg0 + 1, this.aBooleanArray29, arg0, this.anInt3788 * 1047229597 - arg0);
		if (this.aLongArray15 != null) {
			System.arraycopy(this.aLongArray15, arg0 + 1, this.aLongArray15, arg0, this.anInt3788 * 1047229597 - arg0);
		}
		if (this.aStringArray14 != null) {
			System.arraycopy(this.aStringArray14, arg0 + 1, this.aStringArray14, arg0, this.anInt3788 * 1047229597 - arg0);
		}
		this.method24812();
	}

	@OriginalMember(owner = "client!iu", name = "ag", descriptor = "(I)V", line = 146)
	void method24846(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt3788 * 1047229597) {
			throw new RuntimeException("");
		}
		this.anInt3788 -= 136229301;
		this.anIntArray397 = null;
		if (this.anInt3788 * 1047229597 == 0) {
			this.aLongArray15 = null;
			this.aStringArray14 = null;
			this.aByteArray75 = null;
			this.anIntArray398 = null;
			this.anIntArray399 = null;
			this.aBooleanArray29 = null;
			this.anInt3789 = 1883802041;
			this.anInt3785 = -1814525141;
			return;
		}
		System.arraycopy(this.aByteArray75, arg0 + 1, this.aByteArray75, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.anIntArray398, arg0 + 1, this.anIntArray398, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.anIntArray399, arg0 + 1, this.anIntArray399, arg0, this.anInt3788 * 1047229597 - arg0);
		System.arraycopy(this.aBooleanArray29, arg0 + 1, this.aBooleanArray29, arg0, this.anInt3788 * 1047229597 - arg0);
		if (this.aLongArray15 != null) {
			System.arraycopy(this.aLongArray15, arg0 + 1, this.aLongArray15, arg0, this.anInt3788 * 1047229597 - arg0);
		}
		if (this.aStringArray14 != null) {
			System.arraycopy(this.aStringArray14, arg0 + 1, this.aStringArray14, arg0, this.anInt3788 * 1047229597 - arg0);
		}
		this.method24812();
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(B)V", line = 171)
	void method24812() {
		if (this.anInt3788 * 1047229597 == 0) {
			this.anInt3789 = 1883802041;
			this.anInt3785 = -1814525141;
			return;
		}
		this.anInt3789 = 1883802041;
		this.anInt3785 = -1814525141;
		@Pc(20) int local20 = 0;
		@Pc(25) byte local25 = this.aByteArray75[0];
		for (@Pc(27) int local27 = 1; local27 < this.anInt3788 * 1047229597; local27++) {
			if (this.aByteArray75[local27] > local25) {
				if (local25 == 125) {
					this.anInt3785 = local20 * 1814525141;
				}
				local20 = local27;
				local25 = this.aByteArray75[local27];
			} else if (this.anInt3785 * 840311933 == -1 && this.aByteArray75[local27] == 125) {
				this.anInt3785 = local27 * 1814525141;
			}
		}
		this.anInt3789 = local20 * -1883802041;
		if (this.anInt3789 * -1826008201 != -1) {
			this.aByteArray75[this.anInt3789 * -1826008201] = 126;
		}
	}

	@OriginalMember(owner = "client!iu", name = "am", descriptor = "()V", line = 171)
	void method24847() {
		if (this.anInt3788 * 1047229597 == 0) {
			this.anInt3789 = 1883802041;
			this.anInt3785 = -1814525141;
			return;
		}
		this.anInt3789 = 1883802041;
		this.anInt3785 = -1814525141;
		@Pc(20) int local20 = 0;
		@Pc(25) byte local25 = this.aByteArray75[0];
		for (@Pc(27) int local27 = 1; local27 < this.anInt3788 * 1047229597; local27++) {
			if (this.aByteArray75[local27] > local25) {
				if (local25 == 125) {
					this.anInt3785 = local20 * 1814525141;
				}
				local20 = local27;
				local25 = this.aByteArray75[local27];
			} else if (this.anInt3785 * 840311933 == -1 && this.aByteArray75[local27] == 125) {
				this.anInt3785 = local27 * 1814525141;
			}
		}
		this.anInt3789 = local20 * -1883802041;
		if (this.anInt3789 * -1826008201 != -1) {
			this.aByteArray75[this.anInt3789 * -1826008201] = 126;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ah", descriptor = "(IIIJIB)Lclient!ama;", line = 188)
	static Class3_Sub22_Sub1 method24871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class3_Sub22_Sub1[] local2 = Class3_Sub22_Sub1.aClass3_Sub22_Sub1Array1;
		synchronized (Class3_Sub22_Sub1.aClass3_Sub22_Sub1Array1) {
			@Pc(12) Class3_Sub22_Sub1 local12;
			if (Class3_Sub22_Sub1.anInt2632 * -1771933737 == 0) {
				local12 = new Class3_Sub22_Sub1();
			} else {
				local12 = Class3_Sub22_Sub1.aClass3_Sub22_Sub1Array1[(Class3_Sub22_Sub1.anInt2632 -= 983364583) * -1771933737];
			}
			local12.anInt2633 = arg0 * -725828027;
			local12.anInt2634 = arg1 * 164664527;
			local12.anInt2635 = arg2 * -2134540119;
			local12.aLong136 = arg3 * 2578075271522973873L;
			local12.anInt2636 = arg4 * -1589676499;
			return local12;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ar", descriptor = "(JLjava/lang/String;)V", line = 195)
	void method24842(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 > 0L != this.aBoolean684) {
			throw new RuntimeException("");
		} else if (this.aBoolean685 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray14 == null || this.anInt3791 * -1161929397 >= this.aLongArray14.length) || arg1 != null && (this.aStringArray15 == null || this.anInt3791 * -1161929397 >= this.aStringArray15.length)) {
				this.method24803(this.anInt3791 * -1161929397 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt3791 * -1161929397] = arg0;
			}
			if (this.aStringArray15 != null) {
				this.aStringArray15[this.anInt3791 * -1161929397] = arg1;
			}
			this.anInt3791 += 1754154083;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "(JLjava/lang/String;B)V", line = 195)
	void method24855(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (arg0 > 0L != this.aBoolean684) {
			throw new RuntimeException("");
		} else if (this.aBoolean685 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray14 == null || this.anInt3791 * -1161929397 >= this.aLongArray14.length) || arg1 != null && (this.aStringArray15 == null || this.anInt3791 * -1161929397 >= this.aStringArray15.length)) {
				this.method24803(this.anInt3791 * -1161929397 + 5);
			}
			if (this.aLongArray14 != null) {
				this.aLongArray14[this.anInt3791 * -1161929397] = arg0;
			}
			if (this.aStringArray15 != null) {
				this.aStringArray15[this.anInt3791 * -1161929397] = arg1;
			}
			this.anInt3791 += 1754154083;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iu", name = "ad", descriptor = "(I)V", line = 205)
	void method24813(@OriginalArg(0) int arg0) {
		this.anInt3791 -= 1754154083;
		if (this.anInt3791 * -1161929397 == 0) {
			this.aLongArray14 = null;
			this.aStringArray15 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			System.arraycopy(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt3791 * -1161929397 - arg0);
		}
		if (this.aStringArray15 != null) {
			System.arraycopy(this.aStringArray15, arg0 + 1, this.aStringArray15, arg0, this.anInt3791 * -1161929397 - arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "(IB)V", line = 205)
	void method24814(@OriginalArg(0) int arg0) {
		this.anInt3791 -= 1754154083;
		if (this.anInt3791 * -1161929397 == 0) {
			this.aLongArray14 = null;
			this.aStringArray15 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			System.arraycopy(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt3791 * -1161929397 - arg0);
		}
		if (this.aStringArray15 != null) {
			System.arraycopy(this.aStringArray15, arg0 + 1, this.aStringArray15, arg0, this.anInt3791 * -1161929397 - arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "ae", descriptor = "(I)V", line = 205)
	void method24849(@OriginalArg(0) int arg0) {
		this.anInt3791 -= 1754154083;
		if (this.anInt3791 * -1161929397 == 0) {
			this.aLongArray14 = null;
			this.aStringArray15 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			System.arraycopy(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt3791 * -1161929397 - arg0);
		}
		if (this.aStringArray15 != null) {
			System.arraycopy(this.aStringArray15, arg0 + 1, this.aStringArray15, arg0, this.anInt3791 * -1161929397 - arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "aw", descriptor = "(I)V", line = 205)
	void method24853(@OriginalArg(0) int arg0) {
		this.anInt3791 -= 1754154083;
		if (this.anInt3791 * -1161929397 == 0) {
			this.aLongArray14 = null;
			this.aStringArray15 = null;
			return;
		}
		if (this.aLongArray14 != null) {
			System.arraycopy(this.aLongArray14, arg0 + 1, this.aLongArray14, arg0, this.anInt3791 * -1161929397 - arg0);
		}
		if (this.aStringArray15 != null) {
			System.arraycopy(this.aStringArray15, arg0 + 1, this.aStringArray15, arg0, this.anInt3791 * -1161929397 - arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "(IBI)I", line = 217)
	int method24815(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt3789 * -1826008201 && (this.anInt3785 * 840311933 == -1 || this.aByteArray75[this.anInt3785 * 840311933] < 125)) {
			return -1;
		} else if (this.aByteArray75[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray75[arg0] = arg1;
			this.method24812();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "ac", descriptor = "(IB)I", line = 217)
	int method24852(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt3789 * -1826008201 && (this.anInt3785 * 840311933 == -1 || this.aByteArray75[this.anInt3785 * 840311933] < 125)) {
			return -1;
		} else if (this.aByteArray75[arg0] == arg1) {
			return -1;
		} else {
			this.aByteArray75[arg0] = arg1;
			this.method24812();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "bw", descriptor = "(IZ)I", line = 226)
	int method24828(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray29[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray29[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(IZB)I", line = 226)
	int method24838(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray29[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray29[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "(IIIII)I", line = 232)
	int method24817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray398[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray398[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "bp", descriptor = "(IIII)I", line = 232)
	int method24850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray398[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray398[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "bd", descriptor = "(IIII)I", line = 232)
	int method24860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray398[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray398[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "bs", descriptor = "(II)Z", line = 245)
	boolean method24856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(9) Class3 local9 = this.aClass581_29.method33217((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class3_Sub21) {
					@Pc(17) Class3_Sub21 local17 = (Class3_Sub21) local9;
					if (arg1 == local17.anInt1285 * 1585682181) {
						return false;
					}
					local17.anInt1285 = arg1 * -191193651;
					return true;
				}
				local9.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub21(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(III)Z", line = 245)
	boolean method24858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(9) Class3 local9 = this.aClass581_29.method33217((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class3_Sub21) {
					@Pc(17) Class3_Sub21 local17 = (Class3_Sub21) local9;
					if (arg1 == local17.anInt1285 * 1585682181) {
						return false;
					}
					local17.anInt1285 = arg1 * -191193651;
					return true;
				}
				local9.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub21(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "(IIIII)Z", line = 263)
	boolean method24819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(39) Class3 local39 = this.aClass581_29.method33217((long) arg0);
			if (local39 != null) {
				if (local39 instanceof Class3_Sub21) {
					@Pc(48) Class3_Sub21 local48 = (Class3_Sub21) local39;
					if ((local48.anInt1285 * 1585682181 & local22) == local30) {
						return false;
					}
					local48.anInt1285 = (local48.anInt1285 * 1585682181 & ~local22) * -191193651;
					local48.anInt1285 = (local48.anInt1285 * 1585682181 | local30) * -191193651;
					return true;
				}
				local39.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub21(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "bf", descriptor = "(IIII)Z", line = 263)
	boolean method24833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(39) Class3 local39 = this.aClass581_29.method33217((long) arg0);
			if (local39 != null) {
				if (local39 instanceof Class3_Sub21) {
					@Pc(48) Class3_Sub21 local48 = (Class3_Sub21) local39;
					if ((local48.anInt1285 * 1585682181 & local22) == local30) {
						return false;
					}
					local48.anInt1285 = (local48.anInt1285 * 1585682181 & ~local22) * -191193651;
					local48.anInt1285 = (local48.anInt1285 * 1585682181 | local30) * -191193651;
					return true;
				}
				local39.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub21(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "bm", descriptor = "(IIII)Z", line = 263)
	boolean method24857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(39) Class3 local39 = this.aClass581_29.method33217((long) arg0);
			if (local39 != null) {
				if (local39 instanceof Class3_Sub21) {
					@Pc(48) Class3_Sub21 local48 = (Class3_Sub21) local39;
					if ((local48.anInt1285 * 1585682181 & local22) == local30) {
						return false;
					}
					local48.anInt1285 = (local48.anInt1285 * 1585682181 & ~local22) * -191193651;
					local48.anInt1285 = (local48.anInt1285 * 1585682181 | local30) * -191193651;
					return true;
				}
				local39.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub21(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "(IJ)Z", line = 289)
	boolean method24826(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(8) Class3 local8 = this.aClass581_29.method33217((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class3_Sub36) {
					@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) local8;
					if (local16.aLong79 * 5522342608882961519L == arg1) {
						return false;
					}
					local16.aLong79 = arg1 * 5570757074813571727L;
					return true;
				}
				local8.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub36(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "bt", descriptor = "(IJ)Z", line = 289)
	boolean method24859(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(8) Class3 local8 = this.aClass581_29.method33217((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class3_Sub36) {
					@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) local8;
					if (local16.aLong79 * 5522342608882961519L == arg1) {
						return false;
					}
					local16.aLong79 = arg1 * 5570757074813571727L;
					return true;
				}
				local8.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub36(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "bk", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method24806(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(23) Class3 local23 = this.aClass581_29.method33217((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class3_Sub29) {
					@Pc(32) Class3_Sub29 local32 = (Class3_Sub29) local23;
					if (local32.anObject2 instanceof String) {
						if (arg1.equals(local32.anObject2)) {
							return false;
						}
						local32.method33656();
						this.aClass581_29.method33241(new Class3_Sub29(arg1), local32.aLong296 * -1930649055099428229L);
						return true;
					}
				}
				local23.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub29(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "(ILjava/lang/String;I)Z", line = 307)
	boolean method24821(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(23) Class3 local23 = this.aClass581_29.method33217((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class3_Sub29) {
					@Pc(32) Class3_Sub29 local32 = (Class3_Sub29) local23;
					if (local32.anObject2 instanceof String) {
						if (arg1.equals(local32.anObject2)) {
							return false;
						}
						local32.method33656();
						this.aClass581_29.method33241(new Class3_Sub29(arg1), local32.aLong296 * -1930649055099428229L);
						return true;
					}
				}
				local23.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub29(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "bg", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method24861(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass581_29 == null) {
			this.aClass581_29 = new Class581(4);
		} else {
			@Pc(23) Class3 local23 = this.aClass581_29.method33217((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class3_Sub29) {
					@Pc(32) Class3_Sub29 local32 = (Class3_Sub29) local23;
					if (local32.anObject2 instanceof String) {
						if (arg1.equals(local32.anObject2)) {
							return false;
						}
						local32.method33656();
						this.aClass581_29.method33241(new Class3_Sub29(arg1), local32.aLong296 * -1930649055099428229L);
						return true;
					}
				}
				local23.method33656();
			}
		}
		this.aClass581_29.method33241(new Class3_Sub29(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "(Lclient!ahb;I)V", line = 330)
	void method24823(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method20269();
		if ((local25 & 0x1) != 0) {
			this.aBoolean684 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean685 = true;
		}
		if (!this.aBoolean684) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean685) {
			this.aStringArray14 = null;
			this.aStringArray15 = null;
		}
		this.anInt3786 = arg0.method20275() * -321147769;
		this.anInt3787 = arg0.method20275() * 1288717153;
		if (local3 <= 3 && this.anInt3787 * 2022285473 != 0) {
			this.anInt3787 += -1100640864;
		}
		this.anInt3788 = arg0.method20271() * 136229301;
		this.anInt3791 = arg0.method20269() * 1754154083;
		this.aString193 = arg0.method20283();
		if (local3 >= 4) {
			arg0.method20275();
		}
		this.aBoolean686 = arg0.method20269() == 1;
		this.aByte135 = arg0.method20390();
		this.aByte130 = arg0.method20390();
		this.aByte133 = arg0.method20390();
		this.aByte131 = arg0.method20390();
		@Pc(266) int local266;
		if (this.anInt3788 * 1047229597 > 0) {
			if (this.aBoolean684 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt3788 * 1047229597)) {
				this.aLongArray15 = new long[this.anInt3788 * 1047229597];
			}
			if (this.aBoolean685 && (this.aStringArray14 == null || this.aStringArray14.length < this.anInt3788 * 1047229597)) {
				this.aStringArray14 = new String[this.anInt3788 * 1047229597];
			}
			if (this.aByteArray75 == null || this.aByteArray75.length < this.anInt3788 * 1047229597) {
				this.aByteArray75 = new byte[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray398 == null || this.anIntArray398.length < this.anInt3788 * 1047229597) {
				this.anIntArray398 = new int[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray399 == null || this.anIntArray399.length < this.anInt3788 * 1047229597) {
				this.anIntArray399 = new int[this.anInt3788 * 1047229597];
			}
			if (this.aBooleanArray29 == null || this.aBooleanArray29.length < this.anInt3788 * 1047229597) {
				this.aBooleanArray29 = new boolean[this.anInt3788 * 1047229597];
			}
			for (local266 = 0; local266 < this.anInt3788 * 1047229597; local266++) {
				if (this.aBoolean684) {
					this.aLongArray15[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray14[local266] = arg0.method20282();
				}
				this.aByteArray75[local266] = arg0.method20390();
				if (local3 >= 2) {
					this.anIntArray398[local266] = arg0.method20275();
				}
				if (local3 >= 5) {
					this.anIntArray399[local266] = arg0.method20271();
				} else {
					this.anIntArray399[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray29[local266] = arg0.method20269() == 1;
				} else {
					this.aBooleanArray29[local266] = false;
				}
			}
			this.method24812();
		}
		if (this.anInt3791 * -1161929397 > 0) {
			if (this.aBoolean684 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt3791 * -1161929397)) {
				this.aLongArray14 = new long[this.anInt3791 * -1161929397];
			}
			if (this.aBoolean685 && (this.aStringArray15 == null || this.aStringArray15.length < this.anInt3791 * -1161929397)) {
				this.aStringArray15 = new String[this.anInt3791 * -1161929397];
			}
			for (local266 = 0; local266 < this.anInt3791 * -1161929397; local266++) {
				if (this.aBoolean684) {
					this.aLongArray14[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray15[local266] = arg0.method20282();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.method20271();
		if (local266 <= 0) {
			return;
		}
		this.aClass581_29 = new Class581(local266 < 16 ? Class302.method25670(local266) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.method20275();
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.method20275();
				this.aClass581_29.method33241(new Class3_Sub21(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.method20371();
				this.aClass581_29.method33241(new Class3_Sub36(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.method20283();
				this.aClass581_29.method33241(new Class3_Sub29(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "br", descriptor = "(Lclient!ahb;)V", line = 330)
	void method24862(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method20269();
		if ((local25 & 0x1) != 0) {
			this.aBoolean684 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean685 = true;
		}
		if (!this.aBoolean684) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean685) {
			this.aStringArray14 = null;
			this.aStringArray15 = null;
		}
		this.anInt3786 = arg0.method20275() * -321147769;
		this.anInt3787 = arg0.method20275() * 1288717153;
		if (local3 <= 3 && this.anInt3787 * 2022285473 != 0) {
			this.anInt3787 += -1100640864;
		}
		this.anInt3788 = arg0.method20271() * 136229301;
		this.anInt3791 = arg0.method20269() * 1754154083;
		this.aString193 = arg0.method20283();
		if (local3 >= 4) {
			arg0.method20275();
		}
		this.aBoolean686 = arg0.method20269() == 1;
		this.aByte135 = arg0.method20390();
		this.aByte130 = arg0.method20390();
		this.aByte133 = arg0.method20390();
		this.aByte131 = arg0.method20390();
		@Pc(266) int local266;
		if (this.anInt3788 * 1047229597 > 0) {
			if (this.aBoolean684 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt3788 * 1047229597)) {
				this.aLongArray15 = new long[this.anInt3788 * 1047229597];
			}
			if (this.aBoolean685 && (this.aStringArray14 == null || this.aStringArray14.length < this.anInt3788 * 1047229597)) {
				this.aStringArray14 = new String[this.anInt3788 * 1047229597];
			}
			if (this.aByteArray75 == null || this.aByteArray75.length < this.anInt3788 * 1047229597) {
				this.aByteArray75 = new byte[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray398 == null || this.anIntArray398.length < this.anInt3788 * 1047229597) {
				this.anIntArray398 = new int[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray399 == null || this.anIntArray399.length < this.anInt3788 * 1047229597) {
				this.anIntArray399 = new int[this.anInt3788 * 1047229597];
			}
			if (this.aBooleanArray29 == null || this.aBooleanArray29.length < this.anInt3788 * 1047229597) {
				this.aBooleanArray29 = new boolean[this.anInt3788 * 1047229597];
			}
			for (local266 = 0; local266 < this.anInt3788 * 1047229597; local266++) {
				if (this.aBoolean684) {
					this.aLongArray15[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray14[local266] = arg0.method20282();
				}
				this.aByteArray75[local266] = arg0.method20390();
				if (local3 >= 2) {
					this.anIntArray398[local266] = arg0.method20275();
				}
				if (local3 >= 5) {
					this.anIntArray399[local266] = arg0.method20271();
				} else {
					this.anIntArray399[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray29[local266] = arg0.method20269() == 1;
				} else {
					this.aBooleanArray29[local266] = false;
				}
			}
			this.method24812();
		}
		if (this.anInt3791 * -1161929397 > 0) {
			if (this.aBoolean684 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt3791 * -1161929397)) {
				this.aLongArray14 = new long[this.anInt3791 * -1161929397];
			}
			if (this.aBoolean685 && (this.aStringArray15 == null || this.aStringArray15.length < this.anInt3791 * -1161929397)) {
				this.aStringArray15 = new String[this.anInt3791 * -1161929397];
			}
			for (local266 = 0; local266 < this.anInt3791 * -1161929397; local266++) {
				if (this.aBoolean684) {
					this.aLongArray14[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray15[local266] = arg0.method20282();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.method20271();
		if (local266 <= 0) {
			return;
		}
		this.aClass581_29 = new Class581(local266 < 16 ? Class302.method25670(local266) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.method20275();
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.method20275();
				this.aClass581_29.method33241(new Class3_Sub21(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.method20371();
				this.aClass581_29.method33241(new Class3_Sub36(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.method20283();
				this.aClass581_29.method33241(new Class3_Sub29(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "bb", descriptor = "(Lclient!ahb;)V", line = 330)
	void method24863(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method20269();
		if ((local25 & 0x1) != 0) {
			this.aBoolean684 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean685 = true;
		}
		if (!this.aBoolean684) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean685) {
			this.aStringArray14 = null;
			this.aStringArray15 = null;
		}
		this.anInt3786 = arg0.method20275() * -321147769;
		this.anInt3787 = arg0.method20275() * 1288717153;
		if (local3 <= 3 && this.anInt3787 * 2022285473 != 0) {
			this.anInt3787 += -1100640864;
		}
		this.anInt3788 = arg0.method20271() * 136229301;
		this.anInt3791 = arg0.method20269() * 1754154083;
		this.aString193 = arg0.method20283();
		if (local3 >= 4) {
			arg0.method20275();
		}
		this.aBoolean686 = arg0.method20269() == 1;
		this.aByte135 = arg0.method20390();
		this.aByte130 = arg0.method20390();
		this.aByte133 = arg0.method20390();
		this.aByte131 = arg0.method20390();
		@Pc(266) int local266;
		if (this.anInt3788 * 1047229597 > 0) {
			if (this.aBoolean684 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt3788 * 1047229597)) {
				this.aLongArray15 = new long[this.anInt3788 * 1047229597];
			}
			if (this.aBoolean685 && (this.aStringArray14 == null || this.aStringArray14.length < this.anInt3788 * 1047229597)) {
				this.aStringArray14 = new String[this.anInt3788 * 1047229597];
			}
			if (this.aByteArray75 == null || this.aByteArray75.length < this.anInt3788 * 1047229597) {
				this.aByteArray75 = new byte[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray398 == null || this.anIntArray398.length < this.anInt3788 * 1047229597) {
				this.anIntArray398 = new int[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray399 == null || this.anIntArray399.length < this.anInt3788 * 1047229597) {
				this.anIntArray399 = new int[this.anInt3788 * 1047229597];
			}
			if (this.aBooleanArray29 == null || this.aBooleanArray29.length < this.anInt3788 * 1047229597) {
				this.aBooleanArray29 = new boolean[this.anInt3788 * 1047229597];
			}
			for (local266 = 0; local266 < this.anInt3788 * 1047229597; local266++) {
				if (this.aBoolean684) {
					this.aLongArray15[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray14[local266] = arg0.method20282();
				}
				this.aByteArray75[local266] = arg0.method20390();
				if (local3 >= 2) {
					this.anIntArray398[local266] = arg0.method20275();
				}
				if (local3 >= 5) {
					this.anIntArray399[local266] = arg0.method20271();
				} else {
					this.anIntArray399[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray29[local266] = arg0.method20269() == 1;
				} else {
					this.aBooleanArray29[local266] = false;
				}
			}
			this.method24812();
		}
		if (this.anInt3791 * -1161929397 > 0) {
			if (this.aBoolean684 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt3791 * -1161929397)) {
				this.aLongArray14 = new long[this.anInt3791 * -1161929397];
			}
			if (this.aBoolean685 && (this.aStringArray15 == null || this.aStringArray15.length < this.anInt3791 * -1161929397)) {
				this.aStringArray15 = new String[this.anInt3791 * -1161929397];
			}
			for (local266 = 0; local266 < this.anInt3791 * -1161929397; local266++) {
				if (this.aBoolean684) {
					this.aLongArray14[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray15[local266] = arg0.method20282();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.method20271();
		if (local266 <= 0) {
			return;
		}
		this.aClass581_29 = new Class581(local266 < 16 ? Class302.method25670(local266) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.method20275();
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.method20275();
				this.aClass581_29.method33241(new Class3_Sub21(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.method20371();
				this.aClass581_29.method33241(new Class3_Sub36(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.method20283();
				this.aClass581_29.method33241(new Class3_Sub29(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "by", descriptor = "(Lclient!ahb;)V", line = 330)
	void method24864(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method20269();
		if ((local25 & 0x1) != 0) {
			this.aBoolean684 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean685 = true;
		}
		if (!this.aBoolean684) {
			this.aLongArray15 = null;
			this.aLongArray14 = null;
		}
		if (!this.aBoolean685) {
			this.aStringArray14 = null;
			this.aStringArray15 = null;
		}
		this.anInt3786 = arg0.method20275() * -321147769;
		this.anInt3787 = arg0.method20275() * 1288717153;
		if (local3 <= 3 && this.anInt3787 * 2022285473 != 0) {
			this.anInt3787 += -1100640864;
		}
		this.anInt3788 = arg0.method20271() * 136229301;
		this.anInt3791 = arg0.method20269() * 1754154083;
		this.aString193 = arg0.method20283();
		if (local3 >= 4) {
			arg0.method20275();
		}
		this.aBoolean686 = arg0.method20269() == 1;
		this.aByte135 = arg0.method20390();
		this.aByte130 = arg0.method20390();
		this.aByte133 = arg0.method20390();
		this.aByte131 = arg0.method20390();
		@Pc(266) int local266;
		if (this.anInt3788 * 1047229597 > 0) {
			if (this.aBoolean684 && (this.aLongArray15 == null || this.aLongArray15.length < this.anInt3788 * 1047229597)) {
				this.aLongArray15 = new long[this.anInt3788 * 1047229597];
			}
			if (this.aBoolean685 && (this.aStringArray14 == null || this.aStringArray14.length < this.anInt3788 * 1047229597)) {
				this.aStringArray14 = new String[this.anInt3788 * 1047229597];
			}
			if (this.aByteArray75 == null || this.aByteArray75.length < this.anInt3788 * 1047229597) {
				this.aByteArray75 = new byte[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray398 == null || this.anIntArray398.length < this.anInt3788 * 1047229597) {
				this.anIntArray398 = new int[this.anInt3788 * 1047229597];
			}
			if (this.anIntArray399 == null || this.anIntArray399.length < this.anInt3788 * 1047229597) {
				this.anIntArray399 = new int[this.anInt3788 * 1047229597];
			}
			if (this.aBooleanArray29 == null || this.aBooleanArray29.length < this.anInt3788 * 1047229597) {
				this.aBooleanArray29 = new boolean[this.anInt3788 * 1047229597];
			}
			for (local266 = 0; local266 < this.anInt3788 * 1047229597; local266++) {
				if (this.aBoolean684) {
					this.aLongArray15[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray14[local266] = arg0.method20282();
				}
				this.aByteArray75[local266] = arg0.method20390();
				if (local3 >= 2) {
					this.anIntArray398[local266] = arg0.method20275();
				}
				if (local3 >= 5) {
					this.anIntArray399[local266] = arg0.method20271();
				} else {
					this.anIntArray399[local266] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray29[local266] = arg0.method20269() == 1;
				} else {
					this.aBooleanArray29[local266] = false;
				}
			}
			this.method24812();
		}
		if (this.anInt3791 * -1161929397 > 0) {
			if (this.aBoolean684 && (this.aLongArray14 == null || this.aLongArray14.length < this.anInt3791 * -1161929397)) {
				this.aLongArray14 = new long[this.anInt3791 * -1161929397];
			}
			if (this.aBoolean685 && (this.aStringArray15 == null || this.aStringArray15.length < this.anInt3791 * -1161929397)) {
				this.aStringArray15 = new String[this.anInt3791 * -1161929397];
			}
			for (local266 = 0; local266 < this.anInt3791 * -1161929397; local266++) {
				if (this.aBoolean684) {
					this.aLongArray14[local266] = arg0.method20371();
				}
				if (this.aBoolean685) {
					this.aStringArray15[local266] = arg0.method20282();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local266 = arg0.method20271();
		if (local266 <= 0) {
			return;
		}
		this.aClass581_29 = new Class581(local266 < 16 ? Class302.method25670(local266) : 16);
		while (local266-- > 0) {
			@Pc(459) int local459 = arg0.method20275();
			@Pc(463) int local463 = local459 & 0x3FFFFFFF;
			@Pc(467) int local467 = local459 >>> 30;
			if (local467 == 0) {
				@Pc(473) int local473 = arg0.method20275();
				this.aClass581_29.method33241(new Class3_Sub21(local473), (long) local463);
			} else if (local467 == 1) {
				@Pc(490) long local490 = arg0.method20371();
				this.aClass581_29.method33241(new Class3_Sub36(local490), (long) local463);
			} else if (local467 == 2) {
				@Pc(507) String local507 = arg0.method20283();
				this.aClass581_29.method33241(new Class3_Sub29(local507), (long) local463);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "bc", descriptor = "(IIII)Lclient!agh;", line = 1894)
	static Class3_Sub23 method24869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Class3_Sub23 local1 = null;
		if (arg2 == 0) {
			local1 = Class269.method25284(Class311.aClass311_95, client.aClass82_2.aClass577_2);
		}
		if (arg2 == 1) {
			local1 = Class269.method25284(Class311.aClass311_65, client.aClass82_2.aClass577_2);
		}
		@Pc(23) Class464 local23 = client.aClass370_1.method26942();
		local1.aClass3_Sub41_Sub1_1.method20302(Class402.method27617() ? 1 : 0);
		local1.aClass3_Sub41_Sub1_1.method20251(arg1 + local23.anInt5073 * 1360175441);
		local1.aClass3_Sub41_Sub1_1.method20312(arg0 + local23.anInt5071 * -1567811631);
		Class2.anInt5 = arg0 * 2115862953;
		Class2.anInt2 = arg1 * 383922831;
		Class2.aBoolean4 = false;
		Class410.method27677();
		return local1;
	}

	@OriginalMember(owner = "client!iu", name = "bz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4384)
	static final void method24865(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(17) boolean local17 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		if (arg0.aBoolean628 != local17) {
			arg0.aBoolean628 = local17;
			Class223.method24442(arg0);
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class73.method14938(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!iu", name = "ep", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4868)
	static final void method24866(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean646 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class3_Sub26.method11537(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!iu", name = "io", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5672)
	static final void method24870(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3515 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -482261947;
	}

	@OriginalMember(owner = "client!iu", name = "kc", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6066)
	static final void method24868(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3503 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 782165037;
	}

	@OriginalMember(owner = "client!iu", name = "abp", descriptor = "(Lclient!vs;B)V", line = 8967)
	static final void method24867(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anInt5319 -= 624249098;
		@Pc(27) int local27 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(37) int local37 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(43) Class611 local43 = Class457.method28517(Class475.aClass359_86, local37, 0);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local43.method33610(local13, local27, Class19_Sub1.aClass6Array10);
	}
}
