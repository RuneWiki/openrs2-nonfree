package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rx")
public class Class445 {

	@OriginalMember(owner = "client!rx", name = "aa", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!rx", name = "ah", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!rx", name = "an", descriptor = "[Lclient!mu;")
	Class332[] aClass332Array1;

	@OriginalMember(owner = "client!rx", name = "aj", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!rx", name = "as", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!rx", name = "p", descriptor = "Lclient!re;")
	Class428 aClass428_2;

	@OriginalMember(owner = "client!rx", name = "a", descriptor = "I")
	public int anInt4968 = -740665885;

	@OriginalMember(owner = "client!rx", name = "g", descriptor = "[I")
	public int[] anIntArray453 = null;

	@OriginalMember(owner = "client!rx", name = "l", descriptor = "[I")
	public int[] anIntArray454 = null;

	@OriginalMember(owner = "client!rx", name = "h", descriptor = "I")
	int anInt4978 = 0;

	@OriginalMember(owner = "client!rx", name = "x", descriptor = "I")
	public int anInt4970 = -669941629;

	@OriginalMember(owner = "client!rx", name = "s", descriptor = "I")
	public int anInt4971 = -934541963;

	@OriginalMember(owner = "client!rx", name = "u", descriptor = "I")
	public int anInt4972 = 387913747;

	@OriginalMember(owner = "client!rx", name = "y", descriptor = "I")
	public int anInt4977 = 1946079451;

	@OriginalMember(owner = "client!rx", name = "b", descriptor = "I")
	public int anInt4981 = 1804993489;

	@OriginalMember(owner = "client!rx", name = "c", descriptor = "I")
	public int anInt4975 = -1457377783;

	@OriginalMember(owner = "client!rx", name = "z", descriptor = "I")
	public int anInt4992 = 1149445813;

	@OriginalMember(owner = "client!rx", name = "j", descriptor = "I")
	public int anInt4997 = 1539928633;

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "I")
	public int anInt4974 = 1932076673;

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "I")
	public int anInt4979 = 335064699;

	@OriginalMember(owner = "client!rx", name = "r", descriptor = "I")
	public int anInt4967 = 1298536333;

	@OriginalMember(owner = "client!rx", name = "d", descriptor = "I")
	public int anInt4987 = -561111457;

	@OriginalMember(owner = "client!rx", name = "q", descriptor = "I")
	public int anInt4982 = 205822287;

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "I")
	public int anInt4983 = -429632153;

	@OriginalMember(owner = "client!rx", name = "v", descriptor = "I")
	public int anInt4999 = -381243475;

	@OriginalMember(owner = "client!rx", name = "t", descriptor = "I")
	public int anInt4985 = 1359107885;

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "I")
	public int anInt4986 = -2079234813;

	@OriginalMember(owner = "client!rx", name = "o", descriptor = "I")
	public int anInt4984 = -623540653;

	@OriginalMember(owner = "client!rx", name = "i", descriptor = "I")
	public int anInt4976 = -1039859469;

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "I")
	public int anInt4989 = 2068059695;

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "I")
	public int anInt4988 = 0;

	@OriginalMember(owner = "client!rx", name = "at", descriptor = "I")
	public int anInt4991 = 0;

	@OriginalMember(owner = "client!rx", name = "af", descriptor = "I")
	public int anInt4973 = 0;

	@OriginalMember(owner = "client!rx", name = "ak", descriptor = "I")
	public int anInt4993 = 0;

	@OriginalMember(owner = "client!rx", name = "ai", descriptor = "I")
	public int anInt4995 = 0;

	@OriginalMember(owner = "client!rx", name = "aq", descriptor = "I")
	public int anInt4980 = 0;

	@OriginalMember(owner = "client!rx", name = "av", descriptor = "I")
	public int anInt4996 = 0;

	@OriginalMember(owner = "client!rx", name = "ax", descriptor = "I")
	public int anInt4990 = 0;

	@OriginalMember(owner = "client!rx", name = "az", descriptor = "I")
	public int anInt4994 = 0;

	@OriginalMember(owner = "client!rx", name = "al", descriptor = "I")
	public int anInt4998 = 0;

	@OriginalMember(owner = "client!rx", name = "ao", descriptor = "I")
	public int anInt4969 = 0;

	@OriginalMember(owner = "client!rx", name = "ap", descriptor = "I")
	public int anInt5000 = 0;

	@OriginalMember(owner = "client!rx", name = "ab", descriptor = "I")
	public int anInt5001 = -642074115;

	@OriginalMember(owner = "client!rx", name = "au", descriptor = "I")
	public int anInt5002 = -2055936827;

	@OriginalMember(owner = "client!rx", name = "ay", descriptor = "Z")
	public boolean aBoolean772 = true;

	@OriginalMember(owner = "client!rx", name = "p", descriptor = "(I)V", line = 34)
	public static void method28339() {
		if (Class522.method29819()) {
			Class394.method27447(new Class498());
		}
	}

	@OriginalMember(owner = "client!rx", name = "g", descriptor = "(Ljava/lang/Object;IIB)[B", line = 43)
	public static byte[] method28338(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(10) byte[] local10 = (byte[]) arg0;
			return Arrays.copyOfRange(local10, arg1, arg2 + arg1);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(23) ByteBuffer local23 = (ByteBuffer) arg0;
			@Pc(26) byte[] local26 = new byte[arg2];
			local23.position(arg1);
			local23.get(local26, 0, arg2);
			return local26;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rx", name = "<init>", descriptor = "()V", line = 56)
	Class445() {
	}

	@OriginalMember(owner = "client!rx", name = "gj", descriptor = "(IIILclient!dh;B)Lclient!rc;", line = 59)
	static Class426 method28337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3) {
		return arg3 == null ? null : new Class426(arg0, arg1, arg2, arg3.method5355(), arg3.method5363(), arg3.method5358(), arg3.method5466(), arg3.method5486(), arg3.method5450(), arg3.method5362());
	}

	@OriginalMember(owner = "client!rx", name = "p", descriptor = "(Lclient!ahb;I)V", line = 60)
	void method28321(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28331(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rx", name = "u", descriptor = "(Lclient!ahb;)V", line = 60)
	void method28326(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28331(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rx", name = "y", descriptor = "(Lclient!ahb;)V", line = 60)
	void method28327(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method28331(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rx", name = "b", descriptor = "(Lclient!ahb;I)V", line = 67)
	void method28328(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4968 = arg0.method20375() * 740665885;
			this.anInt4972 = arg0.method20375() * -387913747;
		} else if (arg1 == 2) {
			this.anInt4967 = arg0.method20375() * -1298536333;
		} else if (arg1 == 3) {
			this.anInt4987 = arg0.method20375() * 561111457;
		} else if (arg1 == 4) {
			this.anInt4982 = arg0.method20375() * -205822287;
		} else if (arg1 == 5) {
			this.anInt4983 = arg0.method20375() * 429632153;
		} else if (arg1 == 6) {
			this.anInt4992 = arg0.method20375() * -1149445813;
		} else if (arg1 == 7) {
			this.anInt4997 = arg0.method20375() * -1539928633;
		} else if (arg1 == 8) {
			this.anInt4974 = arg0.method20375() * -1932076673;
		} else if (arg1 == 9) {
			this.anInt4979 = arg0.method20375() * -335064699;
		} else if (arg1 == 26) {
			this.anInt4988 = (short) (arg0.method20269() * 4) * -1656643567;
			this.anInt4991 = (short) (arg0.method20269() * 4) * 1616549071;
		} else {
			@Pc(148) int local148;
			@Pc(156) int local156;
			if (arg1 == 27) {
				if (this.anIntArrayArray55 == null) {
					this.anIntArrayArray55 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray55[local148] = new int[6];
				for (local156 = 0; local156 < 6; local156++) {
					this.anIntArrayArray55[local148][local156] = arg0.method20272();
				}
			} else if (arg1 == 28) {
				local148 = arg0.method20269();
				this.anIntArray456 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray456[local156] = arg0.method20269();
					if (this.anIntArray456[local156] == 255) {
						this.anIntArray456[local156] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4995 = arg0.method20269() * -270521203;
			} else if (arg1 == 30) {
				this.anInt4980 = arg0.method20271() * 1459104287;
			} else if (arg1 == 31) {
				this.anInt4996 = arg0.method20269() * -1447008095;
			} else if (arg1 == 32) {
				this.anInt4990 = arg0.method20271() * -2058013785;
			} else if (arg1 == 33) {
				this.anInt4994 = arg0.method20272() * 1618062981;
			} else if (arg1 == 34) {
				this.anInt4998 = arg0.method20269() * 1815621205;
			} else if (arg1 == 35) {
				this.anInt4969 = arg0.method20271() * 1792005699;
			} else if (arg1 == 36) {
				this.anInt5000 = arg0.method20272() * -957321847;
			} else if (arg1 == 37) {
				this.anInt5001 = arg0.method20269() * 642074115;
			} else if (arg1 == 38) {
				this.anInt4970 = arg0.method20375() * 669941629;
			} else if (arg1 == 39) {
				this.anInt4971 = arg0.method20375() * 934541963;
			} else if (arg1 == 40) {
				this.anInt4977 = arg0.method20375() * -1946079451;
			} else if (arg1 == 41) {
				this.anInt4981 = arg0.method20375() * -1804993489;
			} else if (arg1 == 42) {
				this.anInt4975 = arg0.method20375() * 1457377783;
			} else if (arg1 == 43) {
				arg0.method20271();
			} else if (arg1 == 44) {
				arg0.method20271();
			} else if (arg1 == 45) {
				this.anInt5002 = arg0.method20271() * 2055936827;
			} else if (arg1 == 46) {
				this.anInt4999 = arg0.method20375() * 381243475;
			} else if (arg1 == 47) {
				this.anInt4985 = arg0.method20375() * -1359107885;
			} else if (arg1 == 48) {
				this.anInt4986 = arg0.method20375() * 2079234813;
			} else if (arg1 == 49) {
				this.anInt4984 = arg0.method20375() * 623540653;
			} else if (arg1 == 50) {
				this.anInt4976 = arg0.method20375() * 1039859469;
			} else if (arg1 == 51) {
				this.anInt4989 = arg0.method20375() * -2068059695;
			} else if (arg1 == 52) {
				local148 = arg0.method20269();
				this.anIntArray453 = new int[local148];
				this.anIntArray454 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray453[local156] = arg0.method20375();
					@Pc(486) int local486 = arg0.method20269();
					this.anIntArray454[local156] = local486;
					this.anInt4978 += local486 * -2040272525;
				}
			} else if (arg1 == 53) {
				this.aBoolean772 = false;
			} else if (arg1 == 54) {
				this.anInt4973 = (arg0.method20269() << 6) * 63260793;
				this.anInt4993 = (arg0.method20269() << 6) * -135829019;
			} else if (arg1 == 55) {
				if (this.anIntArray455 == null) {
					this.anIntArray455 = new int[this.aClass428_2.aClass489_1.anIntArray475.length];
				}
				local148 = arg0.method20269();
				this.anIntArray455[local148] = arg0.method20271();
			} else if (arg1 == 56) {
				if (this.anIntArrayArray56 == null) {
					this.anIntArrayArray56 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray56[local148] = new int[3];
				for (local156 = 0; local156 < 3; local156++) {
					this.anIntArrayArray56[local148][local156] = arg0.method20272();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rx", name = "c", descriptor = "(Lclient!ahb;I)V", line = 67)
	void method28329(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4968 = arg0.method20375() * 740665885;
			this.anInt4972 = arg0.method20375() * -387913747;
		} else if (arg1 == 2) {
			this.anInt4967 = arg0.method20375() * -1298536333;
		} else if (arg1 == 3) {
			this.anInt4987 = arg0.method20375() * 561111457;
		} else if (arg1 == 4) {
			this.anInt4982 = arg0.method20375() * -205822287;
		} else if (arg1 == 5) {
			this.anInt4983 = arg0.method20375() * 429632153;
		} else if (arg1 == 6) {
			this.anInt4992 = arg0.method20375() * -1149445813;
		} else if (arg1 == 7) {
			this.anInt4997 = arg0.method20375() * -1539928633;
		} else if (arg1 == 8) {
			this.anInt4974 = arg0.method20375() * -1932076673;
		} else if (arg1 == 9) {
			this.anInt4979 = arg0.method20375() * -335064699;
		} else if (arg1 == 26) {
			this.anInt4988 = (short) (arg0.method20269() * 4) * -1656643567;
			this.anInt4991 = (short) (arg0.method20269() * 4) * 1616549071;
		} else {
			@Pc(148) int local148;
			@Pc(156) int local156;
			if (arg1 == 27) {
				if (this.anIntArrayArray55 == null) {
					this.anIntArrayArray55 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray55[local148] = new int[6];
				for (local156 = 0; local156 < 6; local156++) {
					this.anIntArrayArray55[local148][local156] = arg0.method20272();
				}
			} else if (arg1 == 28) {
				local148 = arg0.method20269();
				this.anIntArray456 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray456[local156] = arg0.method20269();
					if (this.anIntArray456[local156] == 255) {
						this.anIntArray456[local156] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4995 = arg0.method20269() * -270521203;
			} else if (arg1 == 30) {
				this.anInt4980 = arg0.method20271() * 1459104287;
			} else if (arg1 == 31) {
				this.anInt4996 = arg0.method20269() * -1447008095;
			} else if (arg1 == 32) {
				this.anInt4990 = arg0.method20271() * -2058013785;
			} else if (arg1 == 33) {
				this.anInt4994 = arg0.method20272() * 1618062981;
			} else if (arg1 == 34) {
				this.anInt4998 = arg0.method20269() * 1815621205;
			} else if (arg1 == 35) {
				this.anInt4969 = arg0.method20271() * 1792005699;
			} else if (arg1 == 36) {
				this.anInt5000 = arg0.method20272() * -957321847;
			} else if (arg1 == 37) {
				this.anInt5001 = arg0.method20269() * 642074115;
			} else if (arg1 == 38) {
				this.anInt4970 = arg0.method20375() * 669941629;
			} else if (arg1 == 39) {
				this.anInt4971 = arg0.method20375() * 934541963;
			} else if (arg1 == 40) {
				this.anInt4977 = arg0.method20375() * -1946079451;
			} else if (arg1 == 41) {
				this.anInt4981 = arg0.method20375() * -1804993489;
			} else if (arg1 == 42) {
				this.anInt4975 = arg0.method20375() * 1457377783;
			} else if (arg1 == 43) {
				arg0.method20271();
			} else if (arg1 == 44) {
				arg0.method20271();
			} else if (arg1 == 45) {
				this.anInt5002 = arg0.method20271() * 2055936827;
			} else if (arg1 == 46) {
				this.anInt4999 = arg0.method20375() * 381243475;
			} else if (arg1 == 47) {
				this.anInt4985 = arg0.method20375() * -1359107885;
			} else if (arg1 == 48) {
				this.anInt4986 = arg0.method20375() * 2079234813;
			} else if (arg1 == 49) {
				this.anInt4984 = arg0.method20375() * 623540653;
			} else if (arg1 == 50) {
				this.anInt4976 = arg0.method20375() * 1039859469;
			} else if (arg1 == 51) {
				this.anInt4989 = arg0.method20375() * -2068059695;
			} else if (arg1 == 52) {
				local148 = arg0.method20269();
				this.anIntArray453 = new int[local148];
				this.anIntArray454 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray453[local156] = arg0.method20375();
					@Pc(486) int local486 = arg0.method20269();
					this.anIntArray454[local156] = local486;
					this.anInt4978 += local486 * -2040272525;
				}
			} else if (arg1 == 53) {
				this.aBoolean772 = false;
			} else if (arg1 == 54) {
				this.anInt4973 = (arg0.method20269() << 6) * 63260793;
				this.anInt4993 = (arg0.method20269() << 6) * -135829019;
			} else if (arg1 == 55) {
				if (this.anIntArray455 == null) {
					this.anIntArray455 = new int[this.aClass428_2.aClass489_1.anIntArray475.length];
				}
				local148 = arg0.method20269();
				this.anIntArray455[local148] = arg0.method20271();
			} else if (arg1 == 56) {
				if (this.anIntArrayArray56 == null) {
					this.anIntArrayArray56 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray56[local148] = new int[3];
				for (local156 = 0; local156 < 3; local156++) {
					this.anIntArrayArray56[local148][local156] = arg0.method20272();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rx", name = "a", descriptor = "(Lclient!ahb;II)V", line = 67)
	void method28331(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4968 = arg0.method20375() * 740665885;
			this.anInt4972 = arg0.method20375() * -387913747;
		} else if (arg1 == 2) {
			this.anInt4967 = arg0.method20375() * -1298536333;
		} else if (arg1 == 3) {
			this.anInt4987 = arg0.method20375() * 561111457;
		} else if (arg1 == 4) {
			this.anInt4982 = arg0.method20375() * -205822287;
		} else if (arg1 == 5) {
			this.anInt4983 = arg0.method20375() * 429632153;
		} else if (arg1 == 6) {
			this.anInt4992 = arg0.method20375() * -1149445813;
		} else if (arg1 == 7) {
			this.anInt4997 = arg0.method20375() * -1539928633;
		} else if (arg1 == 8) {
			this.anInt4974 = arg0.method20375() * -1932076673;
		} else if (arg1 == 9) {
			this.anInt4979 = arg0.method20375() * -335064699;
		} else if (arg1 == 26) {
			this.anInt4988 = (short) (arg0.method20269() * 4) * -1656643567;
			this.anInt4991 = (short) (arg0.method20269() * 4) * 1616549071;
		} else {
			@Pc(148) int local148;
			@Pc(156) int local156;
			if (arg1 == 27) {
				if (this.anIntArrayArray55 == null) {
					this.anIntArrayArray55 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray55[local148] = new int[6];
				for (local156 = 0; local156 < 6; local156++) {
					this.anIntArrayArray55[local148][local156] = arg0.method20272();
				}
			} else if (arg1 == 28) {
				local148 = arg0.method20269();
				this.anIntArray456 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray456[local156] = arg0.method20269();
					if (this.anIntArray456[local156] == 255) {
						this.anIntArray456[local156] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4995 = arg0.method20269() * -270521203;
			} else if (arg1 == 30) {
				this.anInt4980 = arg0.method20271() * 1459104287;
			} else if (arg1 == 31) {
				this.anInt4996 = arg0.method20269() * -1447008095;
			} else if (arg1 == 32) {
				this.anInt4990 = arg0.method20271() * -2058013785;
			} else if (arg1 == 33) {
				this.anInt4994 = arg0.method20272() * 1618062981;
			} else if (arg1 == 34) {
				this.anInt4998 = arg0.method20269() * 1815621205;
			} else if (arg1 == 35) {
				this.anInt4969 = arg0.method20271() * 1792005699;
			} else if (arg1 == 36) {
				this.anInt5000 = arg0.method20272() * -957321847;
			} else if (arg1 == 37) {
				this.anInt5001 = arg0.method20269() * 642074115;
			} else if (arg1 == 38) {
				this.anInt4970 = arg0.method20375() * 669941629;
			} else if (arg1 == 39) {
				this.anInt4971 = arg0.method20375() * 934541963;
			} else if (arg1 == 40) {
				this.anInt4977 = arg0.method20375() * -1946079451;
			} else if (arg1 == 41) {
				this.anInt4981 = arg0.method20375() * -1804993489;
			} else if (arg1 == 42) {
				this.anInt4975 = arg0.method20375() * 1457377783;
			} else if (arg1 == 43) {
				arg0.method20271();
			} else if (arg1 == 44) {
				arg0.method20271();
			} else if (arg1 == 45) {
				this.anInt5002 = arg0.method20271() * 2055936827;
			} else if (arg1 == 46) {
				this.anInt4999 = arg0.method20375() * 381243475;
			} else if (arg1 == 47) {
				this.anInt4985 = arg0.method20375() * -1359107885;
			} else if (arg1 == 48) {
				this.anInt4986 = arg0.method20375() * 2079234813;
			} else if (arg1 == 49) {
				this.anInt4984 = arg0.method20375() * 623540653;
			} else if (arg1 == 50) {
				this.anInt4976 = arg0.method20375() * 1039859469;
			} else if (arg1 == 51) {
				this.anInt4989 = arg0.method20375() * -2068059695;
			} else if (arg1 == 52) {
				local148 = arg0.method20269();
				this.anIntArray453 = new int[local148];
				this.anIntArray454 = new int[local148];
				for (local156 = 0; local156 < local148; local156++) {
					this.anIntArray453[local156] = arg0.method20375();
					@Pc(486) int local486 = arg0.method20269();
					this.anIntArray454[local156] = local486;
					this.anInt4978 += local486 * -2040272525;
				}
			} else if (arg1 == 53) {
				this.aBoolean772 = false;
			} else if (arg1 == 54) {
				this.anInt4973 = (arg0.method20269() << 6) * 63260793;
				this.anInt4993 = (arg0.method20269() << 6) * -135829019;
			} else if (arg1 == 55) {
				if (this.anIntArray455 == null) {
					this.anIntArray455 = new int[this.aClass428_2.aClass489_1.anIntArray475.length];
				}
				local148 = arg0.method20269();
				this.anIntArray455[local148] = arg0.method20271();
			} else if (arg1 == 56) {
				if (this.anIntArrayArray56 == null) {
					this.anIntArrayArray56 = new int[this.aClass428_2.aClass489_1.anIntArray475.length][];
				}
				local148 = arg0.method20269();
				this.anIntArrayArray56[local148] = new int[3];
				for (local156 = 0; local156 < 3; local156++) {
					this.anIntArrayArray56[local148][local156] = arg0.method20272();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rx", name = "g", descriptor = "(B)I", line = 155)
	public int method28322() {
		if (this.anInt4968 * 1610115125 != -1) {
			return this.anInt4968 * 1610115125;
		} else if (this.anIntArray453 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) (this.anInt4978 * 1812947899));
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray454[local24]; local24++) {
				local22 -= this.anIntArray454[local24];
			}
			return this.anIntArray453[local24];
		}
	}

	@OriginalMember(owner = "client!rx", name = "l", descriptor = "(II)Z", line = 169)
	public boolean method28320(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4968 * 1610115125) {
			return true;
		} else {
			if (this.anIntArray453 != null) {
				for (@Pc(18) int local18 = 0; local18 < this.anIntArray453.length; local18++) {
					if (arg0 == this.anIntArray453[local18]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!rx", name = "h", descriptor = "(I)[Lclient!mu;", line = 180)
	public Class332[] method28324() {
		if (this.aClass332Array1 != null) {
			return this.aClass332Array1;
		} else if (this.anIntArrayArray55 == null) {
			return null;
		} else {
			this.aClass332Array1 = new Class332[this.anIntArrayArray55.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArrayArray55.length; local18++) {
				@Pc(25) int local25 = 0;
				@Pc(27) int local27 = 0;
				@Pc(29) int local29 = 0;
				@Pc(31) int local31 = 0;
				@Pc(33) int local33 = 0;
				@Pc(35) int local35 = 0;
				if (this.anIntArrayArray55[local18] != null) {
					local25 = this.anIntArrayArray55[local18][0];
					local27 = this.anIntArrayArray55[local18][1];
					local29 = this.anIntArrayArray55[local18][2];
					local31 = this.anIntArrayArray55[local18][3] << 3;
					local33 = this.anIntArrayArray55[local18][4] << 3;
					local35 = this.anIntArrayArray55[local18][5] << 3;
				}
				if (local25 != 0 || local27 != 0 || local29 != 0 || local31 != 0 || local33 != 0 || local35 != 0) {
					@Pc(113) Class332 local113 = this.aClass332Array1[local18] = new Class332();
					if (local35 != 0) {
						local113.method26198(0.0F, 0.0F, 1.0F, Class317.method25842(local35));
					}
					if (local31 != 0) {
						local113.method26198(1.0F, 0.0F, 0.0F, Class317.method25842(local31));
					}
					if (local33 != 0) {
						local113.method26198(0.0F, 1.0F, 0.0F, Class317.method25842(local33));
					}
					local113.method26203((float) local25, (float) local27, (float) local29);
				}
			}
			return this.aClass332Array1;
		}
	}

	@OriginalMember(owner = "client!rx", name = "x", descriptor = "(I)[I", line = 209)
	public int[] method28325() {
		@Pc(4) Class581 local4 = new Class581(16);
		Class43_Sub1.method8381(this.anInt4968 * 1610115125, local4);
		@Pc(18) int[] local18;
		@Pc(20) int local20;
		if (this.anIntArray453 != null) {
			local18 = this.anIntArray453;
			for (local20 = 0; local20 < local18.length; local20++) {
				@Pc(28) int local28 = local18[local20];
				Class43_Sub1.method8381(local28, local4);
			}
		}
		Class43_Sub1.method8381(this.anInt4970 * -1692585515, local4);
		Class43_Sub1.method8381(this.anInt4971 * 879303971, local4);
		Class43_Sub1.method8381(this.anInt4972 * -1291874843, local4);
		Class43_Sub1.method8381(this.anInt4977 * 761222317, local4);
		Class43_Sub1.method8381(this.anInt4981 * -1817130289, local4);
		Class43_Sub1.method8381(this.anInt4975 * -87408697, local4);
		Class43_Sub1.method8381(this.anInt4992 * -1713051549, local4);
		Class43_Sub1.method8381(this.anInt4997 * 1647125495, local4);
		Class43_Sub1.method8381(this.anInt4974 * -1291917697, local4);
		Class43_Sub1.method8381(this.anInt4979 * -1610219699, local4);
		Class43_Sub1.method8381(this.anInt4967 * 1572273339, local4);
		Class43_Sub1.method8381(this.anInt4987 * -1259453855, local4);
		Class43_Sub1.method8381(this.anInt4982 * -1520360879, local4);
		Class43_Sub1.method8381(this.anInt4983 * 1145375145, local4);
		Class43_Sub1.method8381(this.anInt4999 * 1035039707, local4);
		Class43_Sub1.method8381(this.anInt4985 * -1796673701, local4);
		Class43_Sub1.method8381(this.anInt4986 * -501231019, local4);
		Class43_Sub1.method8381(this.anInt4984 * -1882238427, local4);
		Class43_Sub1.method8381(this.anInt4976 * -1287002171, local4);
		Class43_Sub1.method8381(this.anInt4989 * -1874522319, local4);
		local18 = new int[local4.method33220()];
		local20 = 0;
		@Pc(184) Iterator local184 = local4.iterator();
		while (local184.hasNext()) {
			@Pc(191) Class3 local191 = (Class3) local184.next();
			local18[local20++] = (int) (local191.aLong296 * -1930649055099428229L);
		}
		return local18;
	}

	@OriginalMember(owner = "client!rx", name = "z", descriptor = "()[I", line = 209)
	public int[] method28330() {
		@Pc(4) Class581 local4 = new Class581(16);
		Class43_Sub1.method8381(this.anInt4968 * 1610115125, local4);
		@Pc(18) int[] local18;
		@Pc(20) int local20;
		if (this.anIntArray453 != null) {
			local18 = this.anIntArray453;
			for (local20 = 0; local20 < local18.length; local20++) {
				@Pc(28) int local28 = local18[local20];
				Class43_Sub1.method8381(local28, local4);
			}
		}
		Class43_Sub1.method8381(this.anInt4970 * -1692585515, local4);
		Class43_Sub1.method8381(this.anInt4971 * 879303971, local4);
		Class43_Sub1.method8381(this.anInt4972 * -1291874843, local4);
		Class43_Sub1.method8381(this.anInt4977 * 761222317, local4);
		Class43_Sub1.method8381(this.anInt4981 * -1817130289, local4);
		Class43_Sub1.method8381(this.anInt4975 * -87408697, local4);
		Class43_Sub1.method8381(this.anInt4992 * -1713051549, local4);
		Class43_Sub1.method8381(this.anInt4997 * 1647125495, local4);
		Class43_Sub1.method8381(this.anInt4974 * -1291917697, local4);
		Class43_Sub1.method8381(this.anInt4979 * -1610219699, local4);
		Class43_Sub1.method8381(this.anInt4967 * 1572273339, local4);
		Class43_Sub1.method8381(this.anInt4987 * -1259453855, local4);
		Class43_Sub1.method8381(this.anInt4982 * -1520360879, local4);
		Class43_Sub1.method8381(this.anInt4983 * 1145375145, local4);
		Class43_Sub1.method8381(this.anInt4999 * 1035039707, local4);
		Class43_Sub1.method8381(this.anInt4985 * -1796673701, local4);
		Class43_Sub1.method8381(this.anInt4986 * -501231019, local4);
		Class43_Sub1.method8381(this.anInt4984 * -1882238427, local4);
		Class43_Sub1.method8381(this.anInt4976 * -1287002171, local4);
		Class43_Sub1.method8381(this.anInt4989 * -1874522319, local4);
		local18 = new int[local4.method33220()];
		local20 = 0;
		@Pc(184) Iterator local184 = local4.iterator();
		while (local184.hasNext()) {
			@Pc(191) Class3 local191 = (Class3) local184.next();
			local18[local20++] = (int) (local191.aLong296 * -1930649055099428229L);
		}
		return local18;
	}

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "(ILclient!xn;)V", line = 248)
	static final void method28323(@OriginalArg(0) int arg0, @OriginalArg(1) Class581 arg1) {
		if (arg0 != -1 && arg1.method33217((long) arg0) == null) {
			arg1.method33241(new Class3(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!rx", name = "j", descriptor = "(ILclient!xn;)V", line = 248)
	static final void method28332(@OriginalArg(0) int arg0, @OriginalArg(1) Class581 arg1) {
		if (arg0 != -1 && arg1.method33217((long) arg0) == null) {
			arg1.method33241(new Class3(), (long) arg0);
		}
	}

	@OriginalMember(owner = "client!rx", name = "ay", descriptor = "(Lclient!de;I)V", line = 1130)
	static void method28336(@OriginalArg(0) Class21 arg0) {
		if (Class250.aBoolean689) {
			Class342.method26470(arg0);
		} else {
			Class3_Sub31.method11665(arg0);
		}
	}

	@OriginalMember(owner = "client!rx", name = "bu", descriptor = "(Lclient!fo;II)Ljava/lang/String;", line = 1598)
	static String method28333(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		if (!client.method22372(arg0).method11807(arg1) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray11 == null || arg0.aStringArray11.length <= arg1 || arg0.aStringArray11[arg1] == null || arg0.aStringArray11[arg1].trim().length() == 0) {
			return client.aBoolean610 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray11[arg1];
		}
	}

	@OriginalMember(owner = "client!rx", name = "ks", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 6028)
	static final void method28340(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		arg1.anInt5319 -= 312124549;
		@Pc(15) int local15 = arg1.anIntArray496[arg1.anInt5319 * 960738381] - 1;
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class461.method28596(arg0, local15, arg1);
	}

	@OriginalMember(owner = "client!rx", name = "nj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6490)
	static final void method28334(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray14 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!rx", name = "pp", descriptor = "(Lclient!vs;I)V", line = 6874)
	static final void method28335(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3506 * 225266731;
	}
}
