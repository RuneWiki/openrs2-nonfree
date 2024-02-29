package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public class Class368 {

	@OriginalMember(owner = "client!kw", name = "ai", descriptor = "B")
	static final byte aByte154 = 126;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
	static final int anInt4555 = 6;

	@OriginalMember(owner = "client!kw", name = "aj", descriptor = "B")
	static final byte aByte155 = 127;

	@OriginalMember(owner = "client!kw", name = "ag", descriptor = "B")
	static final byte aByte156 = 125;

	@OriginalMember(owner = "client!kw", name = "al", descriptor = "B")
	static final byte aByte157 = 0;

	@OriginalMember(owner = "client!kw", name = "ao", descriptor = "B")
	public static final byte aByte158 = -1;

	@OriginalMember(owner = "client!kw", name = "vs", descriptor = "I")
	public static int anInt4556;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "Z")
	boolean aBoolean724;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "Lclient!aak;")
	Class12 aClass12_33;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Z")
	boolean aBoolean725;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "B")
	public byte aByte151;

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "B")
	public byte aByte152;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "B")
	public byte aByte153;

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "[J")
	long[] aLongArray24;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
	public int anInt4552;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "[I")
	int[] anIntArray448;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "J")
	long aLong264;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "Z")
	public boolean aBoolean726;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "[J")
	long[] aLongArray25;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray30;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray31;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "[I")
	int[] anIntArray450;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	int anInt4550 = 0;

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "Ljava/lang/String;")
	public String aString210 = null;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
	int anInt4551 = 0;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public int anInt4549 = -1357486407;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
	public int anInt4553 = 1748210927;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "(I)[Lclient!iq;", line = 15)
	static Class329[] method28152() {
		return new Class329[] { Class329.aClass329_5, Class329.aClass329_2, Class329.aClass329_4, Class329.aClass329_3, Class329.aClass329_6, Class329.aClass329_1 };
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!akv;)V", line = 42)
	public Class368(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method28219(arg0);
	}

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "(II)V", line = 47)
	void method28153(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 47)
	void method28154(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 47)
	void method28155(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)V", line = 47)
	void method28156(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V", line = 47)
	void method28157(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "aj", descriptor = "(I)V", line = 47)
	void method28158(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V", line = 47)
	void method28159(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray24 == null) {
				this.aLongArray24 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray24, 0, this.aLongArray24 = new long[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aBoolean724) {
			if (this.aStringArray30 == null) {
				this.aStringArray30 = new String[arg0];
			} else {
				System.arraycopy(this.aStringArray30, 0, this.aStringArray30 = new String[arg0], 0, this.anInt4552 * 35375019);
			}
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[arg0];
		} else {
			System.arraycopy(this.aByteArray83, 0, this.aByteArray83 = new byte[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray448 == null) {
			this.anIntArray448 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray448, 0, this.anIntArray448 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.anIntArray449 == null) {
			this.anIntArray449 = new int[arg0];
		} else {
			System.arraycopy(this.anIntArray449, 0, this.anIntArray449 = new int[arg0], 0, this.anInt4552 * 35375019);
		}
		if (this.aBooleanArray28 == null) {
			this.aBooleanArray28 = new boolean[arg0];
		} else {
			System.arraycopy(this.aBooleanArray28, 0, this.aBooleanArray28 = new boolean[arg0], 0, this.anInt4552 * 35375019);
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(II)V", line = 66)
	void method28160(@OriginalArg(0) int arg0) {
		if (this.aBoolean725) {
			if (this.aLongArray25 == null) {
				this.aLongArray25 = new long[arg0];
			} else {
				System.arraycopy(this.aLongArray25, 0, this.aLongArray25 = new long[arg0], 0, this.anInt4554 * -1394878511);
			}
		}
		if (!this.aBoolean724) {
			return;
		}
		if (this.aStringArray31 == null) {
			this.aStringArray31 = new String[arg0];
		} else {
			System.arraycopy(this.aStringArray31, 0, this.aStringArray31 = new String[arg0], 0, this.anInt4554 * -1394878511);
		}
	}

	@OriginalMember(owner = "client!kw", name = "ai", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28161(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4552 * 35375019; local9++) {
			if (this.aStringArray30[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kw", name = "ag", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28162(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4552 * 35375019; local9++) {
			if (this.aStringArray30[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kw", name = "al", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28163(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4552 * 35375019; local9++) {
			if (this.aStringArray30[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kw", name = "ao", descriptor = "(Ljava/lang/String;)I", line = 77)
	public int method28164(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4552 * 35375019; local9++) {
			if (this.aStringArray30[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "(Ljava/lang/String;S)I", line = 77)
	public int method28165(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt4552 * 35375019; local9++) {
			if (this.aStringArray30[local9].equals(arg0)) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kw", name = "ak", descriptor = "(III)I", line = 85)
	public int method28166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray448[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(IIII)I", line = 85)
	public int method28167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray448[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kw", name = "au", descriptor = "(III)I", line = 85)
	public int method28168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		return (this.anIntArray448[arg0] & local12) >>> arg1;
	}

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "(IB)Ljava/lang/Integer;", line = 90)
	public Integer method28169(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(11) Class77 local11 = this.aClass12_33.method173((long) arg0);
			return local11 != null && local11 instanceof Class77_Sub40 ? Integer.valueOf(((Class77_Sub40) local11).anInt1786 * -705967177) : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ax", descriptor = "(I)Ljava/lang/Integer;", line = 90)
	public Integer method28170(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(11) Class77 local11 = this.aClass12_33.method173((long) arg0);
			return local11 != null && local11 instanceof Class77_Sub40 ? Integer.valueOf(((Class77_Sub40) local11).anInt1786 * -705967177) : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "(IB)Ljava/lang/Long;", line = 97)
	public Long method28171(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(11) Class77 local11 = this.aClass12_33.method173((long) arg0);
			return local11 != null && local11 instanceof Class77_Sub31 ? Long.valueOf(((Class77_Sub31) local11).aLong90 * -4291396730769792553L) : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ad", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method28172(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(11) Class77 local11 = this.aClass12_33.method173((long) arg0);
			return local11 != null && local11 instanceof Class77_Sub31 ? Long.valueOf(((Class77_Sub31) local11).aLong90 * -4291396730769792553L) : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ar", descriptor = "(I)Ljava/lang/Long;", line = 97)
	public Long method28173(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(11) Class77 local11 = this.aClass12_33.method173((long) arg0);
			return local11 != null && local11 instanceof Class77_Sub31 ? Long.valueOf(((Class77_Sub31) local11).aLong90 * -4291396730769792553L) : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ac", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method28174(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(10) Class77 local10 = this.aClass12_33.method173((long) arg0);
			return local10 != null && local10 instanceof Class77_Sub6 ? (String) ((Class77_Sub6) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "av", descriptor = "(I)Ljava/lang/String;", line = 104)
	public String method28175(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(10) Class77 local10 = this.aClass12_33.method173((long) arg0);
			return local10 != null && local10 instanceof Class77_Sub6 ? (String) ((Class77_Sub6) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(IB)Ljava/lang/String;", line = 104)
	public String method28176(@OriginalArg(0) int arg0) {
		if (this.aClass12_33 == null) {
			return null;
		} else {
			@Pc(10) Class77 local10 = this.aClass12_33.method173((long) arg0);
			return local10 != null && local10 instanceof Class77_Sub6 ? (String) ((Class77_Sub6) local10).anObject5 : null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "(B)[I", line = 111)
	public int[] method28177() {
		if (this.anIntArray450 == null) {
			@Pc(8) String[] local8 = new String[this.anInt4552 * 35375019];
			this.anIntArray450 = new int[this.anInt4552 * 35375019];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt4552 * 35375019) {
				local8[local17] = this.aStringArray30[local17];
				if (local8[local17] != null) {
					local8[local17] = local8[local17].toLowerCase();
				}
				this.anIntArray450[local17] = local17++;
			}
			Class585.method31727(local8, this.anIntArray450);
		}
		return this.anIntArray450;
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "(JLjava/lang/String;II)V", line = 125)
	void method28178(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean724) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4552 * 35375019 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4552 * 35375019 >= this.aStringArray30.length)) {
				this.method28153(this.anInt4552 * 35375019 + 5);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4552 * 35375019] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4552 * 35375019] = arg1;
			}
			if (-1507311497 * this.anInt4549 == -1) {
				this.anInt4549 = this.anInt4552 * 1521259373;
				this.aByteArray83[this.anInt4552 * 35375019] = 126;
			} else {
				this.aByteArray83[this.anInt4552 * 35375019] = 0;
			}
			this.anIntArray448[this.anInt4552 * 35375019] = 0;
			this.anIntArray449[this.anInt4552 * 35375019] = arg2;
			this.aBooleanArray28[this.anInt4552 * 35375019] = false;
			this.anInt4552 += -1363608829;
			this.anIntArray450 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "ae", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method28179(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean724) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4552 * 35375019 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4552 * 35375019 >= this.aStringArray30.length)) {
				this.method28153(this.anInt4552 * 35375019 + 5);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4552 * 35375019] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4552 * 35375019] = arg1;
			}
			if (-1507311497 * this.anInt4549 == -1) {
				this.anInt4549 = this.anInt4552 * 1521259373;
				this.aByteArray83[this.anInt4552 * 35375019] = 126;
			} else {
				this.aByteArray83[this.anInt4552 * 35375019] = 0;
			}
			this.anIntArray448[this.anInt4552 * 35375019] = 0;
			this.anIntArray449[this.anInt4552 * 35375019] = arg2;
			this.aBooleanArray28[this.anInt4552 * 35375019] = false;
			this.anInt4552 += -1363608829;
			this.anIntArray450 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "at", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method28180(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean724) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4552 * 35375019 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4552 * 35375019 >= this.aStringArray30.length)) {
				this.method28153(this.anInt4552 * 35375019 + 5);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4552 * 35375019] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4552 * 35375019] = arg1;
			}
			if (-1507311497 * this.anInt4549 == -1) {
				this.anInt4549 = this.anInt4552 * 1521259373;
				this.aByteArray83[this.anInt4552 * 35375019] = 126;
			} else {
				this.aByteArray83[this.anInt4552 * 35375019] = 0;
			}
			this.anIntArray448[this.anInt4552 * 35375019] = 0;
			this.anIntArray449[this.anInt4552 * 35375019] = arg2;
			this.aBooleanArray28[this.anInt4552 * 35375019] = false;
			this.anInt4552 += -1363608829;
			this.anIntArray450 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "ah", descriptor = "(JLjava/lang/String;I)V", line = 125)
	void method28181(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if ((arg1 != null) == this.aBoolean724) {
			if (arg0 > 0L && (this.aLongArray24 == null || this.anInt4552 * 35375019 >= this.aLongArray24.length) || arg1 != null && (this.aStringArray30 == null || this.anInt4552 * 35375019 >= this.aStringArray30.length)) {
				this.method28153(this.anInt4552 * 35375019 + 5);
			}
			if (this.aLongArray24 != null) {
				this.aLongArray24[this.anInt4552 * 35375019] = arg0;
			}
			if (this.aStringArray30 != null) {
				this.aStringArray30[this.anInt4552 * 35375019] = arg1;
			}
			if (-1507311497 * this.anInt4549 == -1) {
				this.anInt4549 = this.anInt4552 * 1521259373;
				this.aByteArray83[this.anInt4552 * 35375019] = 126;
			} else {
				this.aByteArray83[this.anInt4552 * 35375019] = 0;
			}
			this.anIntArray448[this.anInt4552 * 35375019] = 0;
			this.anIntArray449[this.anInt4552 * 35375019] = arg2;
			this.aBooleanArray28[this.anInt4552 * 35375019] = false;
			this.anInt4552 += -1363608829;
			this.anIntArray450 = null;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(IB)V", line = 146)
	void method28182(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4552 * 35375019) {
			throw new RuntimeException("");
		}
		this.anInt4552 -= -1363608829;
		this.anIntArray450 = null;
		if (this.anInt4552 * 35375019 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray83 = null;
			this.anIntArray448 = null;
			this.anIntArray449 = null;
			this.aBooleanArray28 = null;
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		System.arraycopy(this.aByteArray83, arg0 + 1, this.aByteArray83, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray448, arg0 + 1, this.anIntArray448, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray449, arg0 + 1, this.anIntArray449, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.aBooleanArray28, arg0 + 1, this.aBooleanArray28, arg0, this.anInt4552 * 35375019 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4552 * 35375019 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4552 * 35375019 - arg0);
		}
		this.method28188();
	}

	@OriginalMember(owner = "client!kw", name = "as", descriptor = "(I)V", line = 146)
	void method28183(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4552 * 35375019) {
			throw new RuntimeException("");
		}
		this.anInt4552 -= -1363608829;
		this.anIntArray450 = null;
		if (this.anInt4552 * 35375019 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray83 = null;
			this.anIntArray448 = null;
			this.anIntArray449 = null;
			this.aBooleanArray28 = null;
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		System.arraycopy(this.aByteArray83, arg0 + 1, this.aByteArray83, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray448, arg0 + 1, this.anIntArray448, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray449, arg0 + 1, this.anIntArray449, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.aBooleanArray28, arg0 + 1, this.aBooleanArray28, arg0, this.anInt4552 * 35375019 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4552 * 35375019 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4552 * 35375019 - arg0);
		}
		this.method28188();
	}

	@OriginalMember(owner = "client!kw", name = "aq", descriptor = "(I)V", line = 146)
	void method28184(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anInt4552 * 35375019) {
			throw new RuntimeException("");
		}
		this.anInt4552 -= -1363608829;
		this.anIntArray450 = null;
		if (this.anInt4552 * 35375019 == 0) {
			this.aLongArray24 = null;
			this.aStringArray30 = null;
			this.aByteArray83 = null;
			this.anIntArray448 = null;
			this.anIntArray449 = null;
			this.aBooleanArray28 = null;
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		System.arraycopy(this.aByteArray83, arg0 + 1, this.aByteArray83, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray448, arg0 + 1, this.anIntArray448, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.anIntArray449, arg0 + 1, this.anIntArray449, arg0, this.anInt4552 * 35375019 - arg0);
		System.arraycopy(this.aBooleanArray28, arg0 + 1, this.aBooleanArray28, arg0, this.anInt4552 * 35375019 - arg0);
		if (this.aLongArray24 != null) {
			System.arraycopy(this.aLongArray24, arg0 + 1, this.aLongArray24, arg0, this.anInt4552 * 35375019 - arg0);
		}
		if (this.aStringArray30 != null) {
			System.arraycopy(this.aStringArray30, arg0 + 1, this.aStringArray30, arg0, this.anInt4552 * 35375019 - arg0);
		}
		this.method28188();
	}

	@OriginalMember(owner = "client!kw", name = "am", descriptor = "()V", line = 171)
	void method28185() {
		if (this.anInt4552 * 35375019 == 0) {
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		this.anInt4549 = -1357486407;
		this.anInt4553 = 1748210927;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray83[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4552 * 35375019; local26++) {
			if (this.aByteArray83[local26] > local24) {
				if (local24 == 125) {
					this.anInt4553 = local19 * -1748210927;
				}
				local19 = local26;
				local24 = this.aByteArray83[local26];
			} else if (this.anInt4553 * 104457713 == -1 && this.aByteArray83[local26] == 125) {
				this.anInt4553 = local26 * -1748210927;
			}
		}
		this.anInt4549 = local19 * 1357486407;
		if (this.anInt4549 * -1507311497 != -1) {
			this.aByteArray83[this.anInt4549 * -1507311497] = 126;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ay", descriptor = "()V", line = 171)
	void method28186() {
		if (this.anInt4552 * 35375019 == 0) {
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		this.anInt4549 = -1357486407;
		this.anInt4553 = 1748210927;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray83[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4552 * 35375019; local26++) {
			if (this.aByteArray83[local26] > local24) {
				if (local24 == 125) {
					this.anInt4553 = local19 * -1748210927;
				}
				local19 = local26;
				local24 = this.aByteArray83[local26];
			} else if (this.anInt4553 * 104457713 == -1 && this.aByteArray83[local26] == 125) {
				this.anInt4553 = local26 * -1748210927;
			}
		}
		this.anInt4549 = local19 * 1357486407;
		if (this.anInt4549 * -1507311497 != -1) {
			this.aByteArray83[this.anInt4549 * -1507311497] = 126;
		}
	}

	@OriginalMember(owner = "client!kw", name = "af", descriptor = "()V", line = 171)
	void method28187() {
		if (this.anInt4552 * 35375019 == 0) {
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		this.anInt4549 = -1357486407;
		this.anInt4553 = 1748210927;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray83[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4552 * 35375019; local26++) {
			if (this.aByteArray83[local26] > local24) {
				if (local24 == 125) {
					this.anInt4553 = local19 * -1748210927;
				}
				local19 = local26;
				local24 = this.aByteArray83[local26];
			} else if (this.anInt4553 * 104457713 == -1 && this.aByteArray83[local26] == 125) {
				this.anInt4553 = local26 * -1748210927;
			}
		}
		this.anInt4549 = local19 * 1357486407;
		if (this.anInt4549 * -1507311497 != -1) {
			this.aByteArray83[this.anInt4549 * -1507311497] = 126;
		}
	}

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "(I)V", line = 171)
	void method28188() {
		if (this.anInt4552 * 35375019 == 0) {
			this.anInt4549 = -1357486407;
			this.anInt4553 = 1748210927;
			return;
		}
		this.anInt4549 = -1357486407;
		this.anInt4553 = 1748210927;
		@Pc(19) int local19 = 0;
		@Pc(24) byte local24 = this.aByteArray83[0];
		for (@Pc(26) int local26 = 1; local26 < this.anInt4552 * 35375019; local26++) {
			if (this.aByteArray83[local26] > local24) {
				if (local24 == 125) {
					this.anInt4553 = local19 * -1748210927;
				}
				local19 = local26;
				local24 = this.aByteArray83[local26];
			} else if (this.anInt4553 * 104457713 == -1 && this.aByteArray83[local26] == 125) {
				this.anInt4553 = local26 * -1748210927;
			}
		}
		this.anInt4549 = local19 * 1357486407;
		if (this.anInt4549 * -1507311497 != -1) {
			this.aByteArray83[this.anInt4549 * -1507311497] = 126;
		}
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "(JLjava/lang/String;B)V", line = 195)
	void method28189(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.aBoolean724 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4554 * -1394878511 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray31 == null || this.anInt4554 * -1394878511 >= this.aStringArray31.length)) {
				this.method28160(this.anInt4554 * -1394878511 + 5);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4554 * -1394878511] = arg0;
			}
			if (this.aStringArray31 != null) {
				this.aStringArray31[this.anInt4554 * -1394878511] = arg1;
			}
			this.anInt4554 += -1985093327;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "ab", descriptor = "(JLjava/lang/String;)V", line = 195)
	void method28190(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.aBoolean724 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4554 * -1394878511 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray31 == null || this.anInt4554 * -1394878511 >= this.aStringArray31.length)) {
				this.method28160(this.anInt4554 * -1394878511 + 5);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4554 * -1394878511] = arg0;
			}
			if (this.aStringArray31 != null) {
				this.aStringArray31[this.anInt4554 * -1394878511] = arg1;
			}
			this.anInt4554 += -1985093327;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "an", descriptor = "(JLjava/lang/String;)V", line = 195)
	void method28191(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		if (arg1 != null && arg1.length() == 0) {
			arg1 = null;
		}
		if (this.aBoolean725 != arg0 > 0L) {
			throw new RuntimeException("");
		} else if (this.aBoolean724 == (arg1 != null)) {
			if (arg0 > 0L && (this.aLongArray25 == null || this.anInt4554 * -1394878511 >= this.aLongArray25.length) || arg1 != null && (this.aStringArray31 == null || this.anInt4554 * -1394878511 >= this.aStringArray31.length)) {
				this.method28160(this.anInt4554 * -1394878511 + 5);
			}
			if (this.aLongArray25 != null) {
				this.aLongArray25[this.anInt4554 * -1394878511] = arg0;
			}
			if (this.aStringArray31 != null) {
				this.aStringArray31[this.anInt4554 * -1394878511] = arg1;
			}
			this.anInt4554 += -1985093327;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(II)V", line = 205)
	void method28192(@OriginalArg(0) int arg0) {
		this.anInt4554 -= -1985093327;
		if (this.anInt4554 * -1394878511 == 0) {
			this.aLongArray25 = null;
			this.aStringArray31 = null;
			return;
		}
		if (this.aLongArray25 != null) {
			System.arraycopy(this.aLongArray25, arg0 + 1, this.aLongArray25, arg0, this.anInt4554 * -1394878511 - arg0);
		}
		if (this.aStringArray31 != null) {
			System.arraycopy(this.aStringArray31, arg0 + 1, this.aStringArray31, arg0, this.anInt4554 * -1394878511 - arg0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "aw", descriptor = "(IB)I", line = 217)
	int method28193(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bc", descriptor = "(IB)I", line = 217)
	int method28194(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "(IBI)I", line = 217)
	int method28195(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "aa", descriptor = "(IB)I", line = 217)
	int method28196(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ap", descriptor = "(IB)I", line = 217)
	int method28197(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "az", descriptor = "(IB)I", line = 217)
	int method28198(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 == 126 || arg1 == 127) {
			return -1;
		} else if (arg0 == this.anInt4549 * -1507311497 && (this.anInt4553 * 104457713 == -1 || this.aByteArray83[this.anInt4553 * 104457713] < 125)) {
			return -1;
		} else if (arg1 == this.aByteArray83[arg0]) {
			return -1;
		} else {
			this.aByteArray83[arg0] = arg1;
			this.method28188();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(IZI)I", line = 226)
	int method28199(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray28[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray28[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bv", descriptor = "(IZ)I", line = 226)
	int method28200(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray28[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray28[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bj", descriptor = "(IZ)I", line = 226)
	int method28201(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray28[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray28[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bl", descriptor = "(IZ)I", line = 226)
	int method28202(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray28[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray28[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "ba", descriptor = "(IZ)I", line = 226)
	int method28203(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (this.aBooleanArray28[arg0] == arg1) {
			return -1;
		} else {
			this.aBooleanArray28[arg0] = arg1;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(IIIII)I", line = 232)
	int method28204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray448[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray448[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bb", descriptor = "(IIII)I", line = 232)
	int method28205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray448[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray448[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "bd", descriptor = "(IIII)I", line = 232)
	int method28206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		@Pc(35) int local35 = this.anIntArray448[arg0];
		if (local30 == (local35 & local22)) {
			return -1;
		} else {
			local35 &= ~local22;
			this.anIntArray448[arg0] = local35 | local30;
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(III)Z", line = 245)
	boolean method28207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(8) Class77 local8 = this.aClass12_33.method173((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class77_Sub40) {
					@Pc(16) Class77_Sub40 local16 = (Class77_Sub40) local8;
					if (arg1 == local16.anInt1786 * -705967177) {
						return false;
					}
					local16.anInt1786 = arg1 * 347734535;
					return true;
				}
				local8.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "by", descriptor = "(II)Z", line = 245)
	boolean method28208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(8) Class77 local8 = this.aClass12_33.method173((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class77_Sub40) {
					@Pc(16) Class77_Sub40 local16 = (Class77_Sub40) local8;
					if (arg1 == local16.anInt1786 * -705967177) {
						return false;
					}
					local16.anInt1786 = arg1 * 347734535;
					return true;
				}
				local8.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bx", descriptor = "(II)Z", line = 245)
	boolean method28209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(8) Class77 local8 = this.aClass12_33.method173((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class77_Sub40) {
					@Pc(16) Class77_Sub40 local16 = (Class77_Sub40) local8;
					if (arg1 == local16.anInt1786 * -705967177) {
						return false;
					}
					local16.anInt1786 = arg1 * 347734535;
					return true;
				}
				local8.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bw", descriptor = "(II)Z", line = 245)
	boolean method28210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(8) Class77 local8 = this.aClass12_33.method173((long) arg0);
			if (local8 != null) {
				if (local8 instanceof Class77_Sub40) {
					@Pc(16) Class77_Sub40 local16 = (Class77_Sub40) local8;
					if (arg1 == local16.anInt1786 * -705967177) {
						return false;
					}
					local16.anInt1786 = arg1 * 347734535;
					return true;
				}
				local8.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V", line = 254)
	public static void method28211() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 4);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "(IIIIB)Z", line = 263)
	boolean method28212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(40) Class77 local40 = this.aClass12_33.method173((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class77_Sub40) {
					@Pc(48) Class77_Sub40 local48 = (Class77_Sub40) local40;
					if (local30 == (local48.anInt1786 * -705967177 & local22)) {
						return false;
					}
					local48.anInt1786 = (local48.anInt1786 * -705967177 & ~local22) * 347734535;
					local48.anInt1786 = (local48.anInt1786 * -705967177 | local30) * 347734535;
					return true;
				}
				local40.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bi", descriptor = "(IIII)Z", line = 263)
	boolean method28213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = (0x1 << arg2) - 1;
		@Pc(18) int local18 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
		@Pc(22) int local22 = local18 ^ local5;
		@Pc(26) int local26 = arg1 << arg2;
		@Pc(30) int local30 = local26 & local22;
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(40) Class77 local40 = this.aClass12_33.method173((long) arg0);
			if (local40 != null) {
				if (local40 instanceof Class77_Sub40) {
					@Pc(48) Class77_Sub40 local48 = (Class77_Sub40) local40;
					if (local30 == (local48.anInt1786 * -705967177 & local22)) {
						return false;
					}
					local48.anInt1786 = (local48.anInt1786 * -705967177 & ~local22) * 347734535;
					local48.anInt1786 = (local48.anInt1786 * -705967177 | local30) * 347734535;
					return true;
				}
				local40.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub40(local30), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(IJ)Z", line = 289)
	boolean method28214(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(9) Class77 local9 = this.aClass12_33.method173((long) arg0);
			if (local9 != null) {
				if (local9 instanceof Class77_Sub31) {
					@Pc(18) Class77_Sub31 local18 = (Class77_Sub31) local9;
					if (arg1 == local18.aLong90 * -4291396730769792553L) {
						return false;
					}
					local18.aLong90 = arg1 * 1934962372971061735L;
					return true;
				}
				local9.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub31(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bs", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28215(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(23) Class77 local23 = this.aClass12_33.method173((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class77_Sub6) {
					@Pc(31) Class77_Sub6 local31 = (Class77_Sub6) local23;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method24063();
						this.aClass12_33.method184(new Class77_Sub6(arg1), local31.aLong229 * 8258869577519436579L);
						return true;
					}
				}
				local23.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub6(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(ILjava/lang/String;B)Z", line = 307)
	boolean method28216(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(23) Class77 local23 = this.aClass12_33.method173((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class77_Sub6) {
					@Pc(31) Class77_Sub6 local31 = (Class77_Sub6) local23;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method24063();
						this.aClass12_33.method184(new Class77_Sub6(arg1), local31.aLong229 * 8258869577519436579L);
						return true;
					}
				}
				local23.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub6(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bg", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28217(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(23) Class77 local23 = this.aClass12_33.method173((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class77_Sub6) {
					@Pc(31) Class77_Sub6 local31 = (Class77_Sub6) local23;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method24063();
						this.aClass12_33.method184(new Class77_Sub6(arg1), local31.aLong229 * 8258869577519436579L);
						return true;
					}
				}
				local23.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub6(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "bt", descriptor = "(ILjava/lang/String;)Z", line = 307)
	boolean method28218(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			arg1 = "";
		} else if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}
		if (this.aClass12_33 == null) {
			this.aClass12_33 = new Class12(4);
		} else {
			@Pc(23) Class77 local23 = this.aClass12_33.method173((long) arg0);
			if (local23 != null) {
				if (local23 instanceof Class77_Sub6) {
					@Pc(31) Class77_Sub6 local31 = (Class77_Sub6) local23;
					if (local31.anObject5 instanceof String) {
						if (arg1.equals(local31.anObject5)) {
							return false;
						}
						local31.method24063();
						this.aClass12_33.method184(new Class77_Sub6(arg1), local31.aLong229 * 8258869577519436579L);
						return true;
					}
				}
				local23.method24063();
			}
		}
		this.aClass12_33.method184(new Class77_Sub6(arg1), (long) arg0);
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(Lclient!akv;B)V", line = 330)
	void method28219(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method22478();
		if ((local25 & 0x1) != 0) {
			this.aBoolean725 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean724 = true;
		}
		if (!this.aBoolean725) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean724) {
			this.aStringArray30 = null;
			this.aStringArray31 = null;
		}
		this.anInt4550 = arg0.method22500() * 50360833;
		this.anInt4551 = arg0.method22500() * -1182450631;
		if (local3 <= 3 && this.anInt4551 * 1484517897 != 0) {
			this.anInt4551 += 2109172896;
		}
		this.anInt4552 = arg0.method22483() * -1363608829;
		this.anInt4554 = arg0.method22478() * -1985093327;
		this.aString210 = arg0.method22523();
		if (local3 >= 4) {
			arg0.method22500();
		}
		this.aBoolean726 = arg0.method22478() == 1;
		this.aByte151 = arg0.method22481();
		this.aByte152 = arg0.method22481();
		this.aByte150 = arg0.method22481();
		this.aByte153 = arg0.method22481();
		@Pc(269) int local269;
		if (this.anInt4552 * 35375019 > 0) {
			if (this.aBoolean725 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4552 * 35375019)) {
				this.aLongArray24 = new long[this.anInt4552 * 35375019];
			}
			if (this.aBoolean724 && (this.aStringArray30 == null || this.aStringArray30.length < this.anInt4552 * 35375019)) {
				this.aStringArray30 = new String[this.anInt4552 * 35375019];
			}
			if (this.aByteArray83 == null || this.aByteArray83.length < this.anInt4552 * 35375019) {
				this.aByteArray83 = new byte[this.anInt4552 * 35375019];
			}
			if (this.anIntArray448 == null || this.anIntArray448.length < this.anInt4552 * 35375019) {
				this.anIntArray448 = new int[this.anInt4552 * 35375019];
			}
			if (this.anIntArray449 == null || this.anIntArray449.length < this.anInt4552 * 35375019) {
				this.anIntArray449 = new int[this.anInt4552 * 35375019];
			}
			if (this.aBooleanArray28 == null || this.aBooleanArray28.length < this.anInt4552 * 35375019) {
				this.aBooleanArray28 = new boolean[this.anInt4552 * 35375019];
			}
			for (local269 = 0; local269 < this.anInt4552 * 35375019; local269++) {
				if (this.aBoolean725) {
					this.aLongArray24[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray30[local269] = arg0.method22520();
				}
				this.aByteArray83[local269] = arg0.method22481();
				if (local3 >= 2) {
					this.anIntArray448[local269] = arg0.method22500();
				}
				if (local3 >= 5) {
					this.anIntArray449[local269] = arg0.method22483();
				} else {
					this.anIntArray449[local269] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray28[local269] = arg0.method22478() == 1;
				} else {
					this.aBooleanArray28[local269] = false;
				}
			}
			this.method28188();
		}
		if (this.anInt4554 * -1394878511 > 0) {
			if (this.aBoolean725 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4554 * -1394878511)) {
				this.aLongArray25 = new long[this.anInt4554 * -1394878511];
			}
			if (this.aBoolean724 && (this.aStringArray31 == null || this.aStringArray31.length < this.anInt4554 * -1394878511)) {
				this.aStringArray31 = new String[this.anInt4554 * -1394878511];
			}
			for (local269 = 0; local269 < this.anInt4554 * -1394878511; local269++) {
				if (this.aBoolean725) {
					this.aLongArray25[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray31[local269] = arg0.method22520();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local269 = arg0.method22483();
		if (local269 <= 0) {
			return;
		}
		this.aClass12_33 = new Class12(local269 < 16 ? Class199.method25492(local269) : 16);
		while (local269-- > 0) {
			@Pc(460) int local460 = arg0.method22500();
			@Pc(464) int local464 = local460 & 0x3FFFFFFF;
			@Pc(468) int local468 = local460 >>> 30;
			if (local468 == 0) {
				@Pc(474) int local474 = arg0.method22500();
				this.aClass12_33.method184(new Class77_Sub40(local474), (long) local464);
			} else if (local468 == 1) {
				@Pc(491) long local491 = arg0.method22510();
				this.aClass12_33.method184(new Class77_Sub31(local491), (long) local464);
			} else if (local468 == 2) {
				@Pc(508) String local508 = arg0.method22523();
				this.aClass12_33.method184(new Class77_Sub6(local508), (long) local464);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "bz", descriptor = "(Lclient!akv;)V", line = 330)
	void method28220(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method22478();
		if ((local25 & 0x1) != 0) {
			this.aBoolean725 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean724 = true;
		}
		if (!this.aBoolean725) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean724) {
			this.aStringArray30 = null;
			this.aStringArray31 = null;
		}
		this.anInt4550 = arg0.method22500() * 50360833;
		this.anInt4551 = arg0.method22500() * -1182450631;
		if (local3 <= 3 && this.anInt4551 * 1484517897 != 0) {
			this.anInt4551 += 2109172896;
		}
		this.anInt4552 = arg0.method22483() * -1363608829;
		this.anInt4554 = arg0.method22478() * -1985093327;
		this.aString210 = arg0.method22523();
		if (local3 >= 4) {
			arg0.method22500();
		}
		this.aBoolean726 = arg0.method22478() == 1;
		this.aByte151 = arg0.method22481();
		this.aByte152 = arg0.method22481();
		this.aByte150 = arg0.method22481();
		this.aByte153 = arg0.method22481();
		@Pc(269) int local269;
		if (this.anInt4552 * 35375019 > 0) {
			if (this.aBoolean725 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4552 * 35375019)) {
				this.aLongArray24 = new long[this.anInt4552 * 35375019];
			}
			if (this.aBoolean724 && (this.aStringArray30 == null || this.aStringArray30.length < this.anInt4552 * 35375019)) {
				this.aStringArray30 = new String[this.anInt4552 * 35375019];
			}
			if (this.aByteArray83 == null || this.aByteArray83.length < this.anInt4552 * 35375019) {
				this.aByteArray83 = new byte[this.anInt4552 * 35375019];
			}
			if (this.anIntArray448 == null || this.anIntArray448.length < this.anInt4552 * 35375019) {
				this.anIntArray448 = new int[this.anInt4552 * 35375019];
			}
			if (this.anIntArray449 == null || this.anIntArray449.length < this.anInt4552 * 35375019) {
				this.anIntArray449 = new int[this.anInt4552 * 35375019];
			}
			if (this.aBooleanArray28 == null || this.aBooleanArray28.length < this.anInt4552 * 35375019) {
				this.aBooleanArray28 = new boolean[this.anInt4552 * 35375019];
			}
			for (local269 = 0; local269 < this.anInt4552 * 35375019; local269++) {
				if (this.aBoolean725) {
					this.aLongArray24[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray30[local269] = arg0.method22520();
				}
				this.aByteArray83[local269] = arg0.method22481();
				if (local3 >= 2) {
					this.anIntArray448[local269] = arg0.method22500();
				}
				if (local3 >= 5) {
					this.anIntArray449[local269] = arg0.method22483();
				} else {
					this.anIntArray449[local269] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray28[local269] = arg0.method22478() == 1;
				} else {
					this.aBooleanArray28[local269] = false;
				}
			}
			this.method28188();
		}
		if (this.anInt4554 * -1394878511 > 0) {
			if (this.aBoolean725 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4554 * -1394878511)) {
				this.aLongArray25 = new long[this.anInt4554 * -1394878511];
			}
			if (this.aBoolean724 && (this.aStringArray31 == null || this.aStringArray31.length < this.anInt4554 * -1394878511)) {
				this.aStringArray31 = new String[this.anInt4554 * -1394878511];
			}
			for (local269 = 0; local269 < this.anInt4554 * -1394878511; local269++) {
				if (this.aBoolean725) {
					this.aLongArray25[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray31[local269] = arg0.method22520();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local269 = arg0.method22483();
		if (local269 <= 0) {
			return;
		}
		this.aClass12_33 = new Class12(local269 < 16 ? Class199.method25492(local269) : 16);
		while (local269-- > 0) {
			@Pc(460) int local460 = arg0.method22500();
			@Pc(464) int local464 = local460 & 0x3FFFFFFF;
			@Pc(468) int local468 = local460 >>> 30;
			if (local468 == 0) {
				@Pc(474) int local474 = arg0.method22500();
				this.aClass12_33.method184(new Class77_Sub40(local474), (long) local464);
			} else if (local468 == 1) {
				@Pc(491) long local491 = arg0.method22510();
				this.aClass12_33.method184(new Class77_Sub31(local491), (long) local464);
			} else if (local468 == 2) {
				@Pc(508) String local508 = arg0.method22523();
				this.aClass12_33.method184(new Class77_Sub6(local508), (long) local464);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "bu", descriptor = "(Lclient!akv;)V", line = 330)
	void method28221(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if (local3 < 1 || local3 > 6) {
			throw new RuntimeException("" + local3);
		}
		@Pc(25) int local25 = arg0.method22478();
		if ((local25 & 0x1) != 0) {
			this.aBoolean725 = true;
		}
		if ((local25 & 0x2) != 0) {
			this.aBoolean724 = true;
		}
		if (!this.aBoolean725) {
			this.aLongArray24 = null;
			this.aLongArray25 = null;
		}
		if (!this.aBoolean724) {
			this.aStringArray30 = null;
			this.aStringArray31 = null;
		}
		this.anInt4550 = arg0.method22500() * 50360833;
		this.anInt4551 = arg0.method22500() * -1182450631;
		if (local3 <= 3 && this.anInt4551 * 1484517897 != 0) {
			this.anInt4551 += 2109172896;
		}
		this.anInt4552 = arg0.method22483() * -1363608829;
		this.anInt4554 = arg0.method22478() * -1985093327;
		this.aString210 = arg0.method22523();
		if (local3 >= 4) {
			arg0.method22500();
		}
		this.aBoolean726 = arg0.method22478() == 1;
		this.aByte151 = arg0.method22481();
		this.aByte152 = arg0.method22481();
		this.aByte150 = arg0.method22481();
		this.aByte153 = arg0.method22481();
		@Pc(269) int local269;
		if (this.anInt4552 * 35375019 > 0) {
			if (this.aBoolean725 && (this.aLongArray24 == null || this.aLongArray24.length < this.anInt4552 * 35375019)) {
				this.aLongArray24 = new long[this.anInt4552 * 35375019];
			}
			if (this.aBoolean724 && (this.aStringArray30 == null || this.aStringArray30.length < this.anInt4552 * 35375019)) {
				this.aStringArray30 = new String[this.anInt4552 * 35375019];
			}
			if (this.aByteArray83 == null || this.aByteArray83.length < this.anInt4552 * 35375019) {
				this.aByteArray83 = new byte[this.anInt4552 * 35375019];
			}
			if (this.anIntArray448 == null || this.anIntArray448.length < this.anInt4552 * 35375019) {
				this.anIntArray448 = new int[this.anInt4552 * 35375019];
			}
			if (this.anIntArray449 == null || this.anIntArray449.length < this.anInt4552 * 35375019) {
				this.anIntArray449 = new int[this.anInt4552 * 35375019];
			}
			if (this.aBooleanArray28 == null || this.aBooleanArray28.length < this.anInt4552 * 35375019) {
				this.aBooleanArray28 = new boolean[this.anInt4552 * 35375019];
			}
			for (local269 = 0; local269 < this.anInt4552 * 35375019; local269++) {
				if (this.aBoolean725) {
					this.aLongArray24[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray30[local269] = arg0.method22520();
				}
				this.aByteArray83[local269] = arg0.method22481();
				if (local3 >= 2) {
					this.anIntArray448[local269] = arg0.method22500();
				}
				if (local3 >= 5) {
					this.anIntArray449[local269] = arg0.method22483();
				} else {
					this.anIntArray449[local269] = 0;
				}
				if (local3 >= 6) {
					this.aBooleanArray28[local269] = arg0.method22478() == 1;
				} else {
					this.aBooleanArray28[local269] = false;
				}
			}
			this.method28188();
		}
		if (this.anInt4554 * -1394878511 > 0) {
			if (this.aBoolean725 && (this.aLongArray25 == null || this.aLongArray25.length < this.anInt4554 * -1394878511)) {
				this.aLongArray25 = new long[this.anInt4554 * -1394878511];
			}
			if (this.aBoolean724 && (this.aStringArray31 == null || this.aStringArray31.length < this.anInt4554 * -1394878511)) {
				this.aStringArray31 = new String[this.anInt4554 * -1394878511];
			}
			for (local269 = 0; local269 < this.anInt4554 * -1394878511; local269++) {
				if (this.aBoolean725) {
					this.aLongArray25[local269] = arg0.method22510();
				}
				if (this.aBoolean724) {
					this.aStringArray31[local269] = arg0.method22520();
				}
			}
		}
		if (local3 < 3) {
			return;
		}
		local269 = arg0.method22483();
		if (local269 <= 0) {
			return;
		}
		this.aClass12_33 = new Class12(local269 < 16 ? Class199.method25492(local269) : 16);
		while (local269-- > 0) {
			@Pc(460) int local460 = arg0.method22500();
			@Pc(464) int local464 = local460 & 0x3FFFFFFF;
			@Pc(468) int local468 = local460 >>> 30;
			if (local468 == 0) {
				@Pc(474) int local474 = arg0.method22500();
				this.aClass12_33.method184(new Class77_Sub40(local474), (long) local464);
			} else if (local468 == 1) {
				@Pc(491) long local491 = arg0.method22510();
				this.aClass12_33.method184(new Class77_Sub31(local491), (long) local464);
			} else if (local468 == 2) {
				@Pc(508) String local508 = arg0.method22523();
				this.aClass12_33.method184(new Class77_Sub6(local508), (long) local464);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "in", descriptor = "(I)V", line = 4804)
	static final void method28222() {
		@Pc(3) byte[][][] local3 = client.aClass517_1.method30454();
		@Pc(12) byte local12 = (byte) (client.anInt3447 * 1373322351 - 4 & 0xFF);
		@Pc(20) int local20 = client.anInt3447 * 1373322351 % client.aClass517_1.method30411();
		@Pc(22) int local22;
		for (local22 = 0; local22 < 4; local22++) {
			for (@Pc(27) int local27 = 0; local27 < client.aClass517_1.method30417(); local27++) {
				local3[local22][local20][local27] = local12;
			}
		}
		if (Class669.anInt5790 * -878424575 == 3) {
			return;
		}
		for (local22 = 0; local22 < 2; local22++) {
			client.anIntArray329[local22] = -1000000;
			client.anIntArray324[local22] = 1000000;
			client.anIntArray330[local22] = 0;
			client.anIntArray331[local22] = 1000000;
			client.anIntArray325[local22] = 0;
		}
		@Pc(81) Class447 local81 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
		@Pc(85) Class474 local85 = client.aClass517_1.method30441();
		@Pc(89) Class556 local89 = client.aClass517_1.method30435();
		@Pc(135) int local135;
		if (Class11.anInt36 * -891094135 != 2 && Class11.anInt36 * -891094135 != 3 && Class70.anInt203 * 8737185 == -1) {
			local135 = Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class669.anInt5790 * -878424575);
			if (local135 - Class672.anInt5796 * 1529694271 < 3200 && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][Class96_Sub13.anInt883 * -116109187 >> 9][Class633.anInt5710 * -1098179003 >> 9] & 0x4) != 0) {
				Class540.method30915(local89.aClass567ArrayArrayArray1, 1, Class96_Sub13.anInt883 * -116109187 >> 9, Class633.anInt5710 * -1098179003 >> 9, false);
			}
			return;
		}
		@Pc(108) Class595 local108 = client.aClass517_1.method30409();
		@Pc(146) int local146;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(119) Class447 local119 = Class597.aClass107_Sub1_2.method8873().method23165();
			if (Float.isNaN(local119.aFloat277)) {
				return;
			}
			local135 = (int) local119.aFloat277 - (local108.anInt5504 * -424199969 << 9);
			local146 = (int) local119.aFloat278 - (local108.anInt5506 * -1166289421 << 9);
			if (local135 < 0 || local146 < 0 || local135 >> 9 >= local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length || local146 >> 9 >= local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local135 >> 9].length) {
				return;
			}
		} else if (Class11.anInt36 * -891094135 == 2) {
			local135 = (int) local81.aFloat277;
			local146 = (int) local81.aFloat278;
		} else {
			local135 = Class70.anInt203 * 8737185;
			local146 = Class142.anInt2017 * 133182057;
		}
		if ((local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local135 >> 9][local146 >> 9] & 0x4) != 0) {
			Class540.method30915(local89.aClass567ArrayArrayArray1, 0, local135 >> 9, local146 >> 9, false);
			return;
		}
		@Pc(264) int local264;
		@Pc(253) int local253;
		if (Class11.anInt36 * -891094135 == 3) {
			@Pc(242) Class447 local242 = Class597.aClass107_Sub1_2.method8871().method21213();
			local253 = ((int) local242.aFloat277 >> 9) - local108.anInt5504 * -424199969;
			local264 = ((int) local242.aFloat278 >> 9) - local108.anInt5506 * -1166289421;
			if (local253 < 0 || local264 < 0 || local253 >= local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length || local264 >= local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253].length) {
				return;
			}
		} else {
			local253 = Class96_Sub13.anInt883 * -116109187 >> 9;
			local264 = Class633.anInt5710 * -1098179003 >> 9;
		}
		@Pc(306) int local306 = local135 >> 9;
		@Pc(310) int local310 = local146 >> 9;
		@Pc(326) int local326;
		if (local85.method29660(local253, local264)) {
			local326 = Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, 3);
			if (Class672.anInt5796 * 1529694271 >= local326) {
				Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264, false);
			}
			return;
		}
		if (Class565.anInt5338 * -864938791 >= 2560) {
			return;
		}
		if (local306 > local253) {
			local326 = local306 - local253;
		} else {
			local326 = local253 - local306;
		}
		@Pc(365) int local365;
		if (local310 > local264) {
			local365 = local310 - local264;
		} else {
			local365 = local264 - local310;
		}
		if (local326 == 0 && local365 == 0 || local326 <= -client.aClass517_1.method30411() || local326 >= client.aClass517_1.method30411() || local365 <= -client.aClass517_1.method30417() || local365 >= client.aClass517_1.method30417()) {
			if (Class11.anInt36 * -891094135 != 3) {
				Class293.method27014(local253 + Class184.aString133 + local264 + " " + local306 + Class184.aString133 + local310 + " " + local108.anInt5504 * -424199969 + Class184.aString133 + local108.anInt5506 * -1166289421, new RuntimeException());
			}
			return;
		}
		@Pc(449) int local449;
		@Pc(451) int local451;
		if (local326 <= local365) {
			local449 = local326 * 65536 / local365;
			local451 = 32768;
			while (local310 != local264) {
				if (local264 < local310) {
					local264++;
				} else if (local264 > local310) {
					local264--;
				}
				if ((local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264] & 0x4) != 0) {
					Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264, false);
					break;
				}
				if (local253 + 1 < local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253 + 1][local264] & 0x4) != 0) {
					Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253 + 1, local264, false);
					break;
				}
				if (local253 > 0 && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253 - 1][local264] & 0x4) != 0) {
					Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253 - 1, local264, false);
					break;
				}
				local451 += local449;
				if (local451 >= 65536) {
					local451 -= 65536;
					if (local253 < local306) {
						local253++;
						if (local253 + 1 < local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575].length && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253 + 1][local264] & 0x4) != 0) {
							Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253 + 1, local264, false);
							break;
						}
					} else if (local253 > local306) {
						local253--;
						if (local253 > 0 && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253 - 1][local264] & 0x4) != 0) {
							Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253 - 1, local264, false);
							break;
						}
					}
				}
			}
			return;
		}
		local449 = local365 * 65536 / local326;
		local451 = 32768;
		while (local253 != local306) {
			if (local253 < local306) {
				local253++;
			} else if (local253 > local306) {
				local253--;
			}
			if ((local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264] & 0x4) != 0) {
				Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264, false);
				break;
			}
			if (local264 + 1 < local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253].length && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264 + 1] & 0x4) != 0) {
				Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264 + 1, false);
				break;
			}
			if (local264 > 0 && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264 - 1] & 0x4) != 0) {
				Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264 - 1, false);
				break;
			}
			local451 += local449;
			if (local451 >= 65536) {
				local451 -= 65536;
				if (local264 < local310) {
					local264++;
					if (local264 + 1 < local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253].length && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264 + 1] & 0x4) != 0) {
						Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264 + 1, false);
						break;
					}
				} else if (local264 > local310) {
					local264--;
					if (local264 > 0 && (local85.aByteArrayArrayArray13[Class669.anInt5790 * -878424575][local253][local264 - 1] & 0x4) != 0) {
						Class540.method30915(local89.aClass567ArrayArrayArray1, 1, local253, local264 - 1, false);
						break;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "ws", descriptor = "(Lclient!yf;B)V", line = 8533)
	static final void method28223(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class657.method33052(local12, false);
	}

	@OriginalMember(owner = "client!kw", name = "xd", descriptor = "(Lclient!yf;B)V", line = 8848)
	static final void method28224(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 != 2 || local12 >= client.anInt3529 * -1979292205) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			return;
		}
		@Pc(26) Class162 local26 = client.aClass162Array1[local12];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local26.aString131;
		if (local26.aString129 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local26.aString129;
		}
	}
}
