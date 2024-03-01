package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public class Class370 {

	@OriginalMember(owner = "client!om", name = "gt", descriptor = "Lclient!qs;")
	public static Class417 aClass417_1;

	@OriginalMember(owner = "client!om", name = "ta", descriptor = "I")
	static int anInt4674;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!qy;")
	Class421 aClass421_3;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "Lclient!ox;")
	Class380 aClass380_1;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "Lclient!ga;")
	Class191 aClass191_6;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "Lclient!aeu;")
	Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!sj;")
	Class457 aClass457_8;

	@OriginalMember(owner = "client!om", name = "ap", descriptor = "J")
	public long aLong267;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	int anInt4663;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	int anInt4664;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!rp;")
	Class438 aClass438_24;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!tg;")
	Class479 aClass479_2;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	int anInt4665;

	@OriginalMember(owner = "client!om", name = "az", descriptor = "[[B")
	byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	int anInt4666;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!amh;")
	Class3_Sub1_Sub4 aClass3_Sub1_Sub4_4;

	@OriginalMember(owner = "client!om", name = "as", descriptor = "[I")
	int[] anIntArray424;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "F")
	float aFloat293;

	@OriginalMember(owner = "client!om", name = "ax", descriptor = "[[B")
	byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "[[I")
	int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "[[I")
	int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "Lclient!ob;")
	Class363 aClass363_5;

	@OriginalMember(owner = "client!om", name = "av", descriptor = "[[B")
	byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!om", name = "ah", descriptor = "I")
	int anInt4670;

	@OriginalMember(owner = "client!om", name = "aj", descriptor = "[I")
	int[] anIntArray425;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "Lclient!ox;")
	Class380 aClass380_2;

	@OriginalMember(owner = "client!om", name = "ai", descriptor = "[[B")
	byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	int anInt4672;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "Lclient!aeu;")
	Class50_Sub1 aClass50_Sub1_2;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	int anInt4673;

	@OriginalMember(owner = "client!om", name = "al", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!ni;")
	Class346 aClass346_3;

	@OriginalMember(owner = "client!om", name = "aq", descriptor = "[[B")
	byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Lclient!sr;")
	Class464 aClass464_2 = new Class464();

	@OriginalMember(owner = "client!om", name = "u", descriptor = "Lclient!sr;")
	Class464 aClass464_1 = new Class464();

	@OriginalMember(owner = "client!om", name = "v", descriptor = "Lclient!ok;")
	Class368 aClass368_1 = new Class368(0, 0, 0, 0);

	@OriginalMember(owner = "client!om", name = "at", descriptor = "I")
	int anInt4668 = 0;

	@OriginalMember(owner = "client!om", name = "af", descriptor = "I")
	int anInt4667 = 1114529007;

	@OriginalMember(owner = "client!om", name = "ak", descriptor = "I")
	int anInt4662 = 0;

	@OriginalMember(owner = "client!om", name = "aa", descriptor = "I")
	int anInt4669 = 102467757;

	@OriginalMember(owner = "client!om", name = "an", descriptor = "I")
	int anInt4671 = 0;

	@OriginalMember(owner = "client!om", name = "ao", descriptor = "Z")
	public boolean aBoolean728 = false;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Z")
	boolean aBoolean729;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 22)
	public static File method27082(@OriginalArg(0) String arg0) {
		if (!Class392.aBoolean750) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) Class392.aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(Class392.aFile3, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			Class392.aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Z)V", line = 100)
	public Class370(@OriginalArg(0) boolean arg0) {
		this.aBoolean729 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "ad", descriptor = "()Lclient!ox;", line = 105)
	public Class380 method26937() {
		return this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "aw", descriptor = "()Lclient!ox;", line = 105)
	public Class380 method26987() {
		return this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "p", descriptor = "(I)Lclient!ox;", line = 105)
	public Class380 method27018() {
		return this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!ob;", line = 109)
	public Class363 method26939() {
		return this.aClass363_5;
	}

	@OriginalMember(owner = "client!om", name = "bw", descriptor = "()Lclient!ob;", line = 109)
	public Class363 method26989() {
		return this.aClass363_5;
	}

	@OriginalMember(owner = "client!om", name = "ac", descriptor = "()Lclient!ob;", line = 109)
	public Class363 method27051() {
		return this.aClass363_5;
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)I", line = 113)
	public int method26940() {
		return 100 - this.anInt4668 * 1844546428 / (this.anInt4667 * 578572815);
	}

	@OriginalMember(owner = "client!om", name = "bp", descriptor = "()I", line = 113)
	public int method27035() {
		return 100 - this.anInt4668 * 1844546428 / (this.anInt4667 * 578572815);
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "(B)I", line = 117)
	public int method26941() {
		return 100 - this.anInt4662 * -1854060796 / (this.anInt4669 * 1030167333);
	}

	@OriginalMember(owner = "client!om", name = "bd", descriptor = "()I", line = 117)
	public int method26991() {
		return 100 - this.anInt4662 * -1854060796 / (this.anInt4669 * 1030167333);
	}

	@OriginalMember(owner = "client!om", name = "bs", descriptor = "()I", line = 117)
	public int method26992() {
		return 100 - this.anInt4662 * -1854060796 / (this.anInt4669 * 1030167333);
	}

	@OriginalMember(owner = "client!om", name = "bm", descriptor = "()I", line = 117)
	public int method27071() {
		return 100 - this.anInt4662 * -1854060796 / (this.anInt4669 * 1030167333);
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)Lclient!sr;", line = 121)
	public Class464 method26942() {
		return this.aClass464_2;
	}

	@OriginalMember(owner = "client!om", name = "bf", descriptor = "()Lclient!sr;", line = 121)
	public Class464 method26994() {
		return this.aClass464_2;
	}

	@OriginalMember(owner = "client!om", name = "x", descriptor = "(B)I", line = 125)
	public int method26943() {
		return this.anInt4663 * -2081755637;
	}

	@OriginalMember(owner = "client!om", name = "bk", descriptor = "()I", line = 125)
	public int method26996() {
		return this.anInt4663 * -2081755637;
	}

	@OriginalMember(owner = "client!om", name = "bt", descriptor = "()I", line = 125)
	public int method27031() {
		return this.anInt4663 * -2081755637;
	}

	@OriginalMember(owner = "client!om", name = "br", descriptor = "()I", line = 129)
	public int method26995() {
		return this.anInt4664 * 500879103;
	}

	@OriginalMember(owner = "client!om", name = "bg", descriptor = "()I", line = 129)
	public int method26997() {
		return this.anInt4664 * 500879103;
	}

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "()I", line = 129)
	public int method26999() {
		return this.anInt4664 * 500879103;
	}

	@OriginalMember(owner = "client!om", name = "s", descriptor = "(I)I", line = 129)
	public int method27062() {
		return this.anInt4664 * 500879103;
	}

	@OriginalMember(owner = "client!om", name = "u", descriptor = "(I)Lclient!qy;", line = 133)
	public Class421 method26945() {
		return this.aClass421_3;
	}

	@OriginalMember(owner = "client!om", name = "bl", descriptor = "()Lclient!qy;", line = 133)
	public Class421 method26964() {
		return this.aClass421_3;
	}

	@OriginalMember(owner = "client!om", name = "by", descriptor = "()Lclient!qy;", line = 133)
	public Class421 method27000() {
		return this.aClass421_3;
	}

	@OriginalMember(owner = "client!om", name = "bi", descriptor = "()Lclient!qy;", line = 133)
	public Class421 method27002() {
		return this.aClass421_3;
	}

	@OriginalMember(owner = "client!om", name = "bu", descriptor = "()Lclient!ok;", line = 137)
	public Class368 method27003() {
		return this.aClass368_1;
	}

	@OriginalMember(owner = "client!om", name = "ba", descriptor = "()Lclient!ok;", line = 137)
	public Class368 method27004() {
		return this.aClass368_1;
	}

	@OriginalMember(owner = "client!om", name = "bo", descriptor = "()Lclient!ok;", line = 137)
	public Class368 method27005() {
		return this.aClass368_1;
	}

	@OriginalMember(owner = "client!om", name = "y", descriptor = "(I)Lclient!ok;", line = 137)
	public Class368 method27042() {
		return this.aClass368_1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)F", line = 141)
	public float method26947() {
		return this.aFloat293;
	}

	@OriginalMember(owner = "client!om", name = "bc", descriptor = "()F", line = 141)
	public float method27006() {
		return this.aFloat293;
	}

	@OriginalMember(owner = "client!om", name = "bn", descriptor = "()I", line = 145)
	public int method27007() {
		return this.anInt4665 * -640167137;
	}

	@OriginalMember(owner = "client!om", name = "be", descriptor = "()I", line = 145)
	public int method27008() {
		return this.anInt4665 * -640167137;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I", line = 145)
	public int method27009() {
		return this.anInt4665 * -640167137;
	}

	@OriginalMember(owner = "client!om", name = "bx", descriptor = "()I", line = 145)
	public int method27039() {
		return this.anInt4665 * -640167137;
	}

	@OriginalMember(owner = "client!om", name = "z", descriptor = "(I)I", line = 149)
	public int method26948() {
		return this.anInt4666 * 1357682529;
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "(I)Lclient!rp;", line = 153)
	public Class438 method26950() {
		return this.aClass438_24;
	}

	@OriginalMember(owner = "client!om", name = "bh", descriptor = "()Lclient!rp;", line = 153)
	public Class438 method27010() {
		return this.aClass438_24;
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "(II)[[B", line = 157)
	public byte[][] method26951(@OriginalArg(0) int arg0) {
		return this.aClass50_Sub1_2 == null || this.aClass50_Sub1_2.aByteArrayArrayArray7 == null || this.aClass50_Sub1_2.aByteArrayArrayArray7[arg0] == null ? (byte[][]) null : this.aClass50_Sub1_2.aByteArrayArrayArray7[arg0];
	}

	@OriginalMember(owner = "client!om", name = "bj", descriptor = "(I)[[B", line = 157)
	public byte[][] method27011(@OriginalArg(0) int arg0) {
		return this.aClass50_Sub1_2 == null || this.aClass50_Sub1_2.aByteArrayArrayArray7 == null || this.aClass50_Sub1_2.aByteArrayArrayArray7[arg0] == null ? (byte[][]) null : this.aClass50_Sub1_2.aByteArrayArrayArray7[arg0];
	}

	@OriginalMember(owner = "client!om", name = "bv", descriptor = "()Lclient!ni;", line = 162)
	public Class346 method26980() {
		return this.aClass346_3;
	}

	@OriginalMember(owner = "client!om", name = "bq", descriptor = "()Lclient!ni;", line = 162)
	public Class346 method27069() {
		return this.aClass346_3;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Lclient!ni;", line = 162)
	public Class346 method27075() {
		return this.aClass346_3;
	}

	@OriginalMember(owner = "client!om", name = "r", descriptor = "(I)Lclient!tg;", line = 166)
	public Class479 method26953() {
		return this.aClass479_2;
	}

	@OriginalMember(owner = "client!om", name = "bz", descriptor = "()Lclient!tg;", line = 166)
	public Class479 method27014() {
		return this.aClass479_2;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)Lclient!sj;", line = 170)
	public Class457 method26954() {
		return this.aClass457_8;
	}

	@OriginalMember(owner = "client!om", name = "cm", descriptor = "()Lclient!sj;", line = 170)
	public Class457 method27012() {
		return this.aClass457_8;
	}

	@OriginalMember(owner = "client!om", name = "ck", descriptor = "()Lclient!sj;", line = 170)
	public Class457 method27015() {
		return this.aClass457_8;
	}

	@OriginalMember(owner = "client!om", name = "q", descriptor = "(I)[[I", line = 174)
	public int[][] method26966() {
		return this.anIntArrayArray50;
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "(I)[[I", line = 178)
	public int[][] method26944() {
		return this.anIntArrayArray51;
	}

	@OriginalMember(owner = "client!om", name = "cu", descriptor = "()[[I", line = 178)
	public int[][] method26982() {
		return this.anIntArrayArray51;
	}

	@OriginalMember(owner = "client!om", name = "cj", descriptor = "()[[I", line = 178)
	public int[][] method27017() {
		return this.anIntArrayArray51;
	}

	@OriginalMember(owner = "client!om", name = "cv", descriptor = "()[[I", line = 178)
	public int[][] method27019() {
		return this.anIntArrayArray51;
	}

	@OriginalMember(owner = "client!om", name = "v", descriptor = "(S)[[[B", line = 182)
	public byte[][][] method26957() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!om", name = "cq", descriptor = "()[[[B", line = 182)
	public byte[][][] method26974() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!om", name = "cl", descriptor = "()[[[B", line = 182)
	public byte[][][] method27020() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!om", name = "cg", descriptor = "()[[[B", line = 182)
	public byte[][][] method27022() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!om", name = "cp", descriptor = "()[[[B", line = 182)
	public byte[][][] method27023() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!om", name = "t", descriptor = "([[[BI)V", line = 186)
	public void method26958(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "cc", descriptor = "([[[B)V", line = 186)
	public void method27024(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "cs", descriptor = "([[[B)V", line = 186)
	public void method27025(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "w", descriptor = "(I)Lclient!aeu;", line = 190)
	public Class50_Sub1 method26959() {
		return this.aClass50_Sub1_2;
	}

	@OriginalMember(owner = "client!om", name = "ct", descriptor = "()Lclient!aeu;", line = 190)
	public Class50_Sub1 method27016() {
		return this.aClass50_Sub1_2;
	}

	@OriginalMember(owner = "client!om", name = "cx", descriptor = "(Lclient!sj;)V", line = 194)
	public void method27027(@OriginalArg(0) Class457 arg0) {
		this.aClass457_8 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "cy", descriptor = "(Lclient!sj;)V", line = 194)
	public void method27028(@OriginalArg(0) Class457 arg0) {
		this.aClass457_8 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "o", descriptor = "(Lclient!sj;B)V", line = 194)
	public void method27036(@OriginalArg(0) Class457 arg0) {
		this.aClass457_8 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(I)V", line = 198)
	public void method26981() {
		this.aClass464_2 = new Class464();
		this.anInt4673 = 0;
		this.anInt4672 = 0;
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V", line = 204)
	public void method26962() {
		if (this.aClass438_24 != null) {
			Class3_Sub40.method19105();
			this.aClass438_24.aClass410_1.method27670();
			this.aClass438_24 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "(I)V", line = 212)
	public void method26963() {
		this.aClass363_5 = Class363.aClass363_1;
		this.anInt4668 = 0;
		this.anInt4667 = 1114529007;
		this.anInt4662 = 0;
		this.anInt4669 = 102467757;
		this.anInt4670 = 0;
	}

	@OriginalMember(owner = "client!om", name = "cn", descriptor = "()V", line = 212)
	public void method26998() {
		this.aClass363_5 = Class363.aClass363_1;
		this.anInt4668 = 0;
		this.anInt4667 = 1114529007;
		this.anInt4662 = 0;
		this.anInt4669 = 102467757;
		this.anInt4670 = 0;
	}

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "()V", line = 212)
	public void method27029() {
		this.aClass363_5 = Class363.aClass363_1;
		this.anInt4668 = 0;
		this.anInt4667 = 1114529007;
		this.anInt4662 = 0;
		this.anInt4669 = 102467757;
		this.anInt4670 = 0;
	}

	@OriginalMember(owner = "client!om", name = "cz", descriptor = "()V", line = 212)
	public void method27030() {
		this.aClass363_5 = Class363.aClass363_1;
		this.anInt4668 = 0;
		this.anInt4667 = 1114529007;
		this.anInt4662 = 0;
		this.anInt4669 = 102467757;
		this.anInt4670 = 0;
	}

	@OriginalMember(owner = "client!om", name = "at", descriptor = "(I)V", line = 221)
	public void method26938() {
		this.aClass479_2 = new Class479(Class613.aClass21_13, Class294.aClass359_54, this.anInt4663 * -2081755637 >> 3, this.anInt4664 * 500879103 >> 3);
	}

	@OriginalMember(owner = "client!om", name = "co", descriptor = "()V", line = 221)
	public void method27032() {
		this.aClass479_2 = new Class479(Class613.aClass21_13, Class294.aClass359_54, this.anInt4663 * -2081755637 >> 3, this.anInt4664 * 500879103 >> 3);
	}

	@OriginalMember(owner = "client!om", name = "af", descriptor = "(I)V", line = 225)
	public void method26965() {
		this.aClass479_2.method28869(this, null, 0);
	}

	@OriginalMember(owner = "client!om", name = "cd", descriptor = "()V", line = 225)
	public void method27033() {
		this.aClass479_2.method28869(this, null, 0);
	}

	@OriginalMember(owner = "client!om", name = "ch", descriptor = "()V", line = 225)
	public void method27034() {
		this.aClass479_2.method28869(this, null, 0);
	}

	@OriginalMember(owner = "client!om", name = "ak", descriptor = "(I)V", line = 229)
	public void method26976() {
		this.anInt4665 = 941485624;
		if (this.anInt4663 * -2081755637 == 0) {
			this.anInt4666 = -642206098;
		} else {
			this.anInt4666 = (int) ((double) (this.anInt4663 * -2081755637) * 34.46D) * -121353055;
		}
		this.anInt4666 = (this.anInt4666 * 1357682529 << 2) * -121353055;
		if (Class613.aClass21_13.method17033()) {
			this.anInt4666 += -2003222016;
		}
	}

	@OriginalMember(owner = "client!om", name = "ca", descriptor = "()V", line = 229)
	public void method27021() {
		this.anInt4665 = 941485624;
		if (this.anInt4663 * -2081755637 == 0) {
			this.anInt4666 = -642206098;
		} else {
			this.anInt4666 = (int) ((double) (this.anInt4663 * -2081755637) * 34.46D) * -121353055;
		}
		this.anInt4666 = (this.anInt4666 * 1357682529 << 2) * -121353055;
		if (Class613.aClass21_13.method17033()) {
			this.anInt4666 += -2003222016;
		}
	}

	@OriginalMember(owner = "client!om", name = "cr", descriptor = "()V", line = 229)
	public void method27037() {
		this.anInt4665 = 941485624;
		if (this.anInt4663 * -2081755637 == 0) {
			this.anInt4666 = -642206098;
		} else {
			this.anInt4666 = (int) ((double) (this.anInt4663 * -2081755637) * 34.46D) * -121353055;
		}
		this.anInt4666 = (this.anInt4666 * 1357682529 << 2) * -121353055;
		if (Class613.aClass21_13.method17033()) {
			this.anInt4666 += -2003222016;
		}
	}

	@OriginalMember(owner = "client!om", name = "ci", descriptor = "()V", line = 229)
	public void method27061() {
		this.anInt4665 = 941485624;
		if (this.anInt4663 * -2081755637 == 0) {
			this.anInt4666 = -642206098;
		} else {
			this.anInt4666 = (int) ((double) (this.anInt4663 * -2081755637) * 34.46D) * -121353055;
		}
		this.anInt4666 = (this.anInt4666 * 1357682529 << 2) * -121353055;
		if (Class613.aClass21_13.method17033()) {
			this.anInt4666 += -2003222016;
		}
	}

	@OriginalMember(owner = "client!om", name = "cw", descriptor = "(Lclient!om;)V", line = 237)
	void method26960(@OriginalArg(0) Class370 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean729;
		arg0.aBoolean729 = this.aBoolean729;
		this.aBoolean729 = local2;
		@Pc(12) Class380 local12 = arg0.aClass380_1;
		arg0.aClass380_1 = this.aClass380_1;
		this.aClass380_1 = local12;
		arg0.aClass464_1 = this.aClass464_2;
		this.aClass464_1 = arg0.aClass464_2;
		this.aClass479_2.method28884(arg0.method26953());
	}

	@OriginalMember(owner = "client!om", name = "ce", descriptor = "(Lclient!om;)V", line = 237)
	void method27038(@OriginalArg(0) Class370 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean729;
		arg0.aBoolean729 = this.aBoolean729;
		this.aBoolean729 = local2;
		@Pc(12) Class380 local12 = arg0.aClass380_1;
		arg0.aClass380_1 = this.aClass380_1;
		this.aClass380_1 = local12;
		arg0.aClass464_1 = this.aClass464_2;
		this.aClass464_1 = arg0.aClass464_2;
		this.aClass479_2.method28884(arg0.method26953());
	}

	@OriginalMember(owner = "client!om", name = "cf", descriptor = "(Lclient!om;)V", line = 237)
	void method27040(@OriginalArg(0) Class370 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean729;
		arg0.aBoolean729 = this.aBoolean729;
		this.aBoolean729 = local2;
		@Pc(12) Class380 local12 = arg0.aClass380_1;
		arg0.aClass380_1 = this.aClass380_1;
		this.aClass380_1 = local12;
		arg0.aClass464_1 = this.aClass464_2;
		this.aClass464_1 = arg0.aClass464_2;
		this.aClass479_2.method28884(arg0.method26953());
	}

	@OriginalMember(owner = "client!om", name = "aa", descriptor = "(Lclient!om;I)V", line = 237)
	void method27060(@OriginalArg(0) Class370 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean729;
		arg0.aBoolean729 = this.aBoolean729;
		this.aBoolean729 = local2;
		@Pc(12) Class380 local12 = arg0.aClass380_1;
		arg0.aClass380_1 = this.aClass380_1;
		this.aClass380_1 = local12;
		arg0.aClass464_1 = this.aClass464_2;
		this.aClass464_1 = arg0.aClass464_2;
		this.aClass479_2.method28884(arg0.method26953());
	}

	@OriginalMember(owner = "client!om", name = "df", descriptor = "()V", line = 249)
	public void method26949() {
		if (this.aBoolean729) {
			this.method26963();
			@Pc(7) Class370 local7 = client.aClass370_1;
			this.anInt4671 = local7.anInt4671;
			this.anIntArray425 = local7.anIntArray425;
			this.anIntArray424 = local7.anIntArray424;
			this.aByteArrayArray19 = local7.aByteArrayArray19;
			this.aByteArrayArray20 = local7.aByteArrayArray20;
			this.aByteArrayArray18 = local7.aByteArrayArray18;
			this.aByteArrayArray17 = local7.aByteArrayArray17;
			this.aByteArrayArray16 = local7.aByteArrayArray16;
			this.aClass346_3 = local7.aClass346_3;
			this.aClass479_2 = local7.aClass479_2;
			this.anIntArrayArrayArray16 = local7.anIntArrayArrayArray16;
			this.anInt4665 = local7.anInt4665;
			this.anInt4666 = local7.anInt4666;
			this.aClass3_Sub1_Sub4_4 = local7.aClass3_Sub1_Sub4_4;
			this.aClass421_3 = local7.aClass421_3;
			this.anIntArrayArray50 = local7.anIntArrayArray50;
			this.anIntArrayArray51 = local7.anIntArrayArray51;
			this.aByteArrayArrayArray13 = local7.aByteArrayArrayArray13;
			this.aClass380_2 = local7.aClass380_2;
			this.aClass191_6 = local7.aClass191_6;
			this.aClass464_2 = local7.aClass464_2;
			this.aClass464_1 = local7.aClass464_1;
			this.anInt4672 = local7.anInt4672;
			this.anInt4673 = local7.anInt4673;
			this.anInt4663 = local7.anInt4663;
			this.anInt4664 = local7.anInt4664;
		} else if (client.anInt3039 * 1115111877 == 2) {
			Class166.method23342(6);
		} else if (client.anInt3039 * 1115111877 == 18) {
			Class166.method23342(11);
		} else if (client.anInt3039 * 1115111877 == 3) {
			Class166.method23342(12);
		} else if (client.anInt3039 * 1115111877 == 5) {
			Class166.method23342(7);
		} else if (client.anInt3039 * 1115111877 == 16) {
			Class166.method23342(1);
		}
	}

	@OriginalMember(owner = "client!om", name = "dv", descriptor = "()V", line = 249)
	public void method26956() {
		if (this.aBoolean729) {
			this.method26963();
			@Pc(7) Class370 local7 = client.aClass370_1;
			this.anInt4671 = local7.anInt4671;
			this.anIntArray425 = local7.anIntArray425;
			this.anIntArray424 = local7.anIntArray424;
			this.aByteArrayArray19 = local7.aByteArrayArray19;
			this.aByteArrayArray20 = local7.aByteArrayArray20;
			this.aByteArrayArray18 = local7.aByteArrayArray18;
			this.aByteArrayArray17 = local7.aByteArrayArray17;
			this.aByteArrayArray16 = local7.aByteArrayArray16;
			this.aClass346_3 = local7.aClass346_3;
			this.aClass479_2 = local7.aClass479_2;
			this.anIntArrayArrayArray16 = local7.anIntArrayArrayArray16;
			this.anInt4665 = local7.anInt4665;
			this.anInt4666 = local7.anInt4666;
			this.aClass3_Sub1_Sub4_4 = local7.aClass3_Sub1_Sub4_4;
			this.aClass421_3 = local7.aClass421_3;
			this.anIntArrayArray50 = local7.anIntArrayArray50;
			this.anIntArrayArray51 = local7.anIntArrayArray51;
			this.aByteArrayArrayArray13 = local7.aByteArrayArrayArray13;
			this.aClass380_2 = local7.aClass380_2;
			this.aClass191_6 = local7.aClass191_6;
			this.aClass464_2 = local7.aClass464_2;
			this.aClass464_1 = local7.aClass464_1;
			this.anInt4672 = local7.anInt4672;
			this.anInt4673 = local7.anInt4673;
			this.anInt4663 = local7.anInt4663;
			this.anInt4664 = local7.anInt4664;
		} else if (client.anInt3039 * 1115111877 == 2) {
			Class166.method23342(6);
		} else if (client.anInt3039 * 1115111877 == 18) {
			Class166.method23342(11);
		} else if (client.anInt3039 * 1115111877 == 3) {
			Class166.method23342(12);
		} else if (client.anInt3039 * 1115111877 == 5) {
			Class166.method23342(7);
		} else if (client.anInt3039 * 1115111877 == 16) {
			Class166.method23342(1);
		}
	}

	@OriginalMember(owner = "client!om", name = "ah", descriptor = "(S)V", line = 249)
	public void method26968() {
		if (this.aBoolean729) {
			this.method26963();
			@Pc(7) Class370 local7 = client.aClass370_1;
			this.anInt4671 = local7.anInt4671;
			this.anIntArray425 = local7.anIntArray425;
			this.anIntArray424 = local7.anIntArray424;
			this.aByteArrayArray19 = local7.aByteArrayArray19;
			this.aByteArrayArray20 = local7.aByteArrayArray20;
			this.aByteArrayArray18 = local7.aByteArrayArray18;
			this.aByteArrayArray17 = local7.aByteArrayArray17;
			this.aByteArrayArray16 = local7.aByteArrayArray16;
			this.aClass346_3 = local7.aClass346_3;
			this.aClass479_2 = local7.aClass479_2;
			this.anIntArrayArrayArray16 = local7.anIntArrayArrayArray16;
			this.anInt4665 = local7.anInt4665;
			this.anInt4666 = local7.anInt4666;
			this.aClass3_Sub1_Sub4_4 = local7.aClass3_Sub1_Sub4_4;
			this.aClass421_3 = local7.aClass421_3;
			this.anIntArrayArray50 = local7.anIntArrayArray50;
			this.anIntArrayArray51 = local7.anIntArrayArray51;
			this.aByteArrayArrayArray13 = local7.aByteArrayArrayArray13;
			this.aClass380_2 = local7.aClass380_2;
			this.aClass191_6 = local7.aClass191_6;
			this.aClass464_2 = local7.aClass464_2;
			this.aClass464_1 = local7.aClass464_1;
			this.anInt4672 = local7.anInt4672;
			this.anInt4673 = local7.anInt4673;
			this.anInt4663 = local7.anInt4663;
			this.anInt4664 = local7.anInt4664;
		} else if (client.anInt3039 * 1115111877 == 2) {
			Class166.method23342(6);
		} else if (client.anInt3039 * 1115111877 == 18) {
			Class166.method23342(11);
		} else if (client.anInt3039 * 1115111877 == 3) {
			Class166.method23342(12);
		} else if (client.anInt3039 * 1115111877 == 5) {
			Class166.method23342(7);
		} else if (client.anInt3039 * 1115111877 == 16) {
			Class166.method23342(1);
		}
	}

	@OriginalMember(owner = "client!om", name = "dh", descriptor = "()V", line = 249)
	public void method27043() {
		if (this.aBoolean729) {
			this.method26963();
			@Pc(7) Class370 local7 = client.aClass370_1;
			this.anInt4671 = local7.anInt4671;
			this.anIntArray425 = local7.anIntArray425;
			this.anIntArray424 = local7.anIntArray424;
			this.aByteArrayArray19 = local7.aByteArrayArray19;
			this.aByteArrayArray20 = local7.aByteArrayArray20;
			this.aByteArrayArray18 = local7.aByteArrayArray18;
			this.aByteArrayArray17 = local7.aByteArrayArray17;
			this.aByteArrayArray16 = local7.aByteArrayArray16;
			this.aClass346_3 = local7.aClass346_3;
			this.aClass479_2 = local7.aClass479_2;
			this.anIntArrayArrayArray16 = local7.anIntArrayArrayArray16;
			this.anInt4665 = local7.anInt4665;
			this.anInt4666 = local7.anInt4666;
			this.aClass3_Sub1_Sub4_4 = local7.aClass3_Sub1_Sub4_4;
			this.aClass421_3 = local7.aClass421_3;
			this.anIntArrayArray50 = local7.anIntArrayArray50;
			this.anIntArrayArray51 = local7.anIntArrayArray51;
			this.aByteArrayArrayArray13 = local7.aByteArrayArrayArray13;
			this.aClass380_2 = local7.aClass380_2;
			this.aClass191_6 = local7.aClass191_6;
			this.aClass464_2 = local7.aClass464_2;
			this.aClass464_1 = local7.aClass464_1;
			this.anInt4672 = local7.anInt4672;
			this.anInt4673 = local7.anInt4673;
			this.anInt4663 = local7.anInt4663;
			this.anInt4664 = local7.anInt4664;
		} else if (client.anInt3039 * 1115111877 == 2) {
			Class166.method23342(6);
		} else if (client.anInt3039 * 1115111877 == 18) {
			Class166.method23342(11);
		} else if (client.anInt3039 * 1115111877 == 3) {
			Class166.method23342(12);
		} else if (client.anInt3039 * 1115111877 == 5) {
			Class166.method23342(7);
		} else if (client.anInt3039 * 1115111877 == 16) {
			Class166.method23342(1);
		}
	}

	@OriginalMember(owner = "client!om", name = "an", descriptor = "(Lclient!oq;B)V", line = 289)
	public void method26969(@OriginalArg(0) Class374 arg0) {
		this.aClass380_2 = arg0.aClass380_3;
		if (this.aClass380_2 == Class380.aClass380_11) {
			this.method26970();
		} else if (Class380.aClass380_5 == this.aClass380_2) {
			this.method26971(arg0.aClass3_Sub41_Sub1_3);
		} else if (Class380.aClass380_4 == this.aClass380_2) {
			this.method27026();
		} else if (this.aClass380_2.method27279()) {
			this.method27057(arg0.aClass3_Sub41_Sub1_3);
		}
	}

	@OriginalMember(owner = "client!om", name = "db", descriptor = "(Lclient!oq;)V", line = 289)
	public void method27044(@OriginalArg(0) Class374 arg0) {
		this.aClass380_2 = arg0.aClass380_3;
		if (this.aClass380_2 == Class380.aClass380_11) {
			this.method26970();
		} else if (Class380.aClass380_5 == this.aClass380_2) {
			this.method26971(arg0.aClass3_Sub41_Sub1_3);
		} else if (Class380.aClass380_4 == this.aClass380_2) {
			this.method27026();
		} else if (this.aClass380_2.method27279()) {
			this.method27057(arg0.aClass3_Sub41_Sub1_3);
		}
	}

	@OriginalMember(owner = "client!om", name = "dp", descriptor = "(Lclient!oq;)V", line = 289)
	public void method27045(@OriginalArg(0) Class374 arg0) {
		this.aClass380_2 = arg0.aClass380_3;
		if (this.aClass380_2 == Class380.aClass380_11) {
			this.method26970();
		} else if (Class380.aClass380_5 == this.aClass380_2) {
			this.method26971(arg0.aClass3_Sub41_Sub1_3);
		} else if (Class380.aClass380_4 == this.aClass380_2) {
			this.method27026();
		} else if (this.aClass380_2.method27279()) {
			this.method27057(arg0.aClass3_Sub41_Sub1_3);
		}
	}

	@OriginalMember(owner = "client!om", name = "dk", descriptor = "(Lclient!oq;)V", line = 289)
	public void method27046(@OriginalArg(0) Class374 arg0) {
		this.aClass380_2 = arg0.aClass380_3;
		if (this.aClass380_2 == Class380.aClass380_11) {
			this.method26970();
		} else if (Class380.aClass380_5 == this.aClass380_2) {
			this.method26971(arg0.aClass3_Sub41_Sub1_3);
		} else if (Class380.aClass380_4 == this.aClass380_2) {
			this.method27026();
		} else if (this.aClass380_2.method27279()) {
			this.method27057(arg0.aClass3_Sub41_Sub1_3);
		}
	}

	@OriginalMember(owner = "client!om", name = "aj", descriptor = "(B)V", line = 297)
	void method26970() {
		this.method26973(Class140.method23020(Class510.aClass3_Sub45_37.aClass60_Sub17_1.method13577()));
		@Pc(14) int local14 = this.aClass464_2.anInt5071 * -1567811631;
		@Pc(20) int local20 = this.aClass464_2.anInt5073 * 1360175441;
		@Pc(30) int local30 = (Class586.anInt5460 * -1129330577 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class149.anInt3434 * -324079631 >> 12);
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 = 0;
		Class141.anInt3427 = 0;
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16738(8, 8);
		@Pc(52) byte local52 = 18;
		this.anIntArray425 = new int[local52];
		this.anIntArray424 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray16 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt4663 * -2081755637 >> 4)) / 8; local93 <= ((this.anInt4663 * -2081755637 >> 4) + local30) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt4664 * 500879103 >> 4)) / 8; local116 <= (local40 + (this.anInt4664 * 500879103 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class430.aClass359_74.method26669(this.method26978(local93, local116), Class340.aClass340_4.anInt4602 * -1178780153)) {
					this.anIntArray425[local82] = local134;
					this.anIntArray424[local82] = this.method26978(local93, local116);
					local82++;
				}
			}
		}
		this.anInt4671 = local82 * -1947388099;
		@Pc(178) byte local178;
		if (client.anInt3039 * 1115111877 == 2) {
			local178 = 6;
		} else if (client.anInt3039 * 1115111877 == 3) {
			local178 = 12;
		} else if (client.anInt3039 * 1115111877 == 18) {
			local178 = 11;
		} else if (client.anInt3039 * 1115111877 == 16) {
			local178 = 1;
		} else {
			throw new RuntimeException("" + client.anInt3039 * 1115111877);
		}
		this.method27013(local30, local40, local178, false);
	}

	@OriginalMember(owner = "client!om", name = "as", descriptor = "(Lclient!and;I)V", line = 335)
	void method26971(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(3) int local3 = arg0.method20314();
		@Pc(7) int local7 = arg0.method20314();
		@Pc(11) int local11 = arg0.method20304();
		@Pc(20) boolean local20 = arg0.method20310() == 1;
		@Pc(24) int local24 = arg0.method20269();
		if (!this.aBoolean729) {
			this.method26975();
		}
		this.method26973(Class140.method23020(local11));
		this.anIntArray425 = new int[local24];
		this.anIntArray424 = new int[local24];
		this.aByteArrayArray19 = new byte[local24][];
		this.aByteArrayArray20 = new byte[local24][];
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = new byte[local24][];
		this.aByteArrayArray16 = new byte[local24][];
		local24 = 0;
		for (@Pc(77) int local77 = (local7 - (this.anInt4663 * -2081755637 >> 4)) / 8; local77 <= ((this.anInt4663 * -2081755637 >> 4) + local7) / 8; local77++) {
			for (@Pc(100) int local100 = (local3 - (this.anInt4664 * 500879103 >> 4)) / 8; local100 <= ((this.anInt4664 * 500879103 >> 4) + local3) / 8; local100++) {
				if (Class430.aClass359_74.method26669(this.method26978(local77, local100), Class340.aClass340_4.anInt4602 * -1178780153)) {
					this.anIntArray425[local24] = local100 + (local77 << 8);
					this.anIntArray424[local24] = this.method26978(local77, local100);
					local24++;
				}
			}
		}
		this.anInt4671 = local24 * -1947388099;
		this.method27013(local7, local3, 7, local20);
	}

	@OriginalMember(owner = "client!om", name = "ai", descriptor = "(Lclient!and;B)V", line = 364)
	void method27057(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(3) int local3 = arg0.method20313();
		@Pc(7) int local7 = arg0.method20317();
		if (local7 == 1) {
			this.aClass380_2 = Class380.aClass380_6;
		} else if (local7 == 2) {
			this.aClass380_2 = Class380.aClass380_7;
		} else if (local7 == 3) {
			this.aClass380_2 = Class380.aClass380_10;
		} else if (local7 == 4) {
			this.aClass380_2 = Class380.aClass380_8;
		}
		@Pc(38) int local38 = arg0.method20314();
		@Pc(42) int local42 = arg0.method20310();
		@Pc(46) int local46 = arg0.method20269();
		@Pc(54) boolean local54 = (local46 & 0x1) != 0;
		if (!this.aBoolean729) {
			this.method26975();
		}
		this.method26973(Class140.method23020(local42));
		arg0.method19824();
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(86) int local86;
		@Pc(99) int local99;
		for (local71 = 0; local71 < 4; local71++) {
			for (local76 = 0; local76 < this.anInt4663 * -2081755637 >> 3; local76++) {
				for (local86 = 0; local86 < this.anInt4664 * 500879103 >> 3; local86++) {
					local99 = arg0.method19825(1);
					if (local99 == 1) {
						this.anIntArrayArrayArray16[local71][local76][local86] = arg0.method19825(26);
					} else {
						this.anIntArrayArrayArray16[local71][local76][local86] = -1;
					}
				}
			}
		}
		arg0.method19826();
		local71 = arg0.method20269();
		this.anIntArray425 = new int[local71];
		this.anIntArray424 = new int[local71];
		this.aByteArrayArray19 = new byte[local71][];
		this.aByteArrayArray20 = new byte[local71][];
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = new byte[local71][];
		this.aByteArrayArray16 = new byte[local71][];
		local71 = 0;
		for (local76 = 0; local76 < 4; local76++) {
			for (local86 = 0; local86 < this.anInt4663 * -2081755637 >> 3; local86++) {
				for (local99 = 0; local99 < this.anInt4664 * 500879103 >> 3; local99++) {
					@Pc(201) int local201 = this.anIntArrayArrayArray16[local76][local86][local99];
					if (local201 != -1) {
						@Pc(210) int local210 = local201 >> 14 & 0x3FF;
						@Pc(216) int local216 = local201 >> 3 & 0x7FF;
						@Pc(226) int local226 = local216 / 8 + (local210 / 8 << 8);
						@Pc(228) int local228;
						for (local228 = 0; local228 < local71; local228++) {
							if (this.anIntArray425[local228] == local226) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							local228 = local226 >> 8 & 0xFF;
							@Pc(255) int local255 = local226 & 0xFF;
							if (Class430.aClass359_74.method26669(this.method26978(local228, local255), Class340.aClass340_4.anInt4602 * -1178780153)) {
								this.anIntArray425[local71] = local226;
								this.anIntArray424[local71] = this.method26978(local228, local255);
								local71++;
							}
						}
					}
				}
			}
		}
		this.anInt4671 = local71 * -1947388099;
		this.method27013(local38, local3, 7, local54);
	}

	@OriginalMember(owner = "client!om", name = "dy", descriptor = "()V", line = 426)
	void method26988() {
		this.aClass380_1 = this.aClass380_2;
		this.method26973(Class191.aClass191_2);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt4663 * -2081755637 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt4664 * 500879103 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class3_Sub6 local52 = (Class3_Sub6) Class131.aClass553_48.method32768(); local52 != null; local52 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local14 = local52.anInt1175 * 149642325;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1181 * -243008511 >> 3;
			local83 = local52.anInt1173 * -1199797045 >> 3;
			local88 = local52.anInt1177 * 1620409495;
			local93 = local52.anInt1178 * -847153051;
			local98 = local52.anInt1174 * -276313195;
			local103 = local52.anInt1176 * -314220323;
			local108 = local52.anInt1179 * 1206187041;
			@Pc(113) int local113 = local52.anInt1180 * 633010695;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local83 + local113) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local76 + local108) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local88 + local115][local167 + local93] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local98 << 24) + (local169 << 14);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3068 * -708111013;
		this.anIntArray425 = new int[local9];
		this.anIntArray424 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = new byte[local9][];
		this.aByteArrayArray16 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class3_Sub6 local288 = (Class3_Sub6) Class131.aClass553_48.method32768(); local288 != null; local288 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local24 = local288.anInt1181 * -243008511 >>> 3;
			local76 = local288.anInt1173 * -1199797045 >>> 3;
			local83 = local288.anInt1179 * 1206187041 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local288.anInt1180 * 633010695 + local76;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray425[local108] == local103) {
							continue label84;
						}
					}
					if (Class430.aClass359_74.method26669(this.method26978(local93, local98), Class340.aClass340_4.anInt4602 * -1178780153)) {
						this.anIntArray425[local9] = local103;
						this.anIntArray424[local9] = this.method26978(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt4671 = local9 * -1947388099;
		this.method27013(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4, 7, false);
	}

	@OriginalMember(owner = "client!om", name = "aq", descriptor = "(B)V", line = 426)
	void method27026() {
		this.aClass380_1 = this.aClass380_2;
		this.method26973(Class191.aClass191_2);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt4663 * -2081755637 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt4664 * 500879103 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class3_Sub6 local52 = (Class3_Sub6) Class131.aClass553_48.method32768(); local52 != null; local52 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local14 = local52.anInt1175 * 149642325;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1181 * -243008511 >> 3;
			local83 = local52.anInt1173 * -1199797045 >> 3;
			local88 = local52.anInt1177 * 1620409495;
			local93 = local52.anInt1178 * -847153051;
			local98 = local52.anInt1174 * -276313195;
			local103 = local52.anInt1176 * -314220323;
			local108 = local52.anInt1179 * 1206187041;
			@Pc(113) int local113 = local52.anInt1180 * 633010695;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local83 + local113) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local76 + local108) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local88 + local115][local167 + local93] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local98 << 24) + (local169 << 14);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3068 * -708111013;
		this.anIntArray425 = new int[local9];
		this.anIntArray424 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = new byte[local9][];
		this.aByteArrayArray16 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class3_Sub6 local288 = (Class3_Sub6) Class131.aClass553_48.method32768(); local288 != null; local288 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local24 = local288.anInt1181 * -243008511 >>> 3;
			local76 = local288.anInt1173 * -1199797045 >>> 3;
			local83 = local288.anInt1179 * 1206187041 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local288.anInt1180 * 633010695 + local76;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray425[local108] == local103) {
							continue label84;
						}
					}
					if (Class430.aClass359_74.method26669(this.method26978(local93, local98), Class340.aClass340_4.anInt4602 * -1178780153)) {
						this.anIntArray425[local9] = local103;
						this.anIntArray424[local9] = this.method26978(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt4671 = local9 * -1947388099;
		this.method27013(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4, 7, false);
	}

	@OriginalMember(owner = "client!om", name = "dg", descriptor = "()V", line = 426)
	void method27048() {
		this.aClass380_1 = this.aClass380_2;
		this.method26973(Class191.aClass191_2);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt4663 * -2081755637 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt4664 * 500879103 >> 3; local24++) {
					this.anIntArrayArrayArray16[local9][local14][local24] = -1;
				}
			}
		}
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(103) int local103;
		@Pc(108) int local108;
		for (@Pc(52) Class3_Sub6 local52 = (Class3_Sub6) Class131.aClass553_48.method32768(); local52 != null; local52 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local14 = local52.anInt1175 * 149642325;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1181 * -243008511 >> 3;
			local83 = local52.anInt1173 * -1199797045 >> 3;
			local88 = local52.anInt1177 * 1620409495;
			local93 = local52.anInt1178 * -847153051;
			local98 = local52.anInt1174 * -276313195;
			local103 = local52.anInt1176 * -314220323;
			local108 = local52.anInt1179 * 1206187041;
			@Pc(113) int local113 = local52.anInt1180 * 633010695;
			@Pc(115) int local115 = 0;
			@Pc(117) int local117 = 0;
			@Pc(119) byte local119 = 1;
			@Pc(121) byte local121 = 1;
			if (local14 == 1) {
				local117 = local108 - 1;
				local119 = -1;
			} else if (local14 == 2) {
				local117 = local108 - 1;
				local115 = local113 - 1;
				local119 = -1;
				local121 = -1;
			} else if (local14 == 3) {
				local115 = local113 - 1;
				local119 = 1;
				local121 = -1;
			}
			@Pc(160) int local160 = local83;
			while (local160 < local83 + local113) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local76 + local108) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local88 + local115][local167 + local93] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local98 << 24) + (local169 << 14);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3068 * -708111013;
		this.anIntArray425 = new int[local9];
		this.anIntArray424 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray18 = null;
		this.aByteArrayArray17 = new byte[local9][];
		this.aByteArrayArray16 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class3_Sub6 local288 = (Class3_Sub6) Class131.aClass553_48.method32768(); local288 != null; local288 = (Class3_Sub6) Class131.aClass553_48.method32709()) {
			local24 = local288.anInt1181 * -243008511 >>> 3;
			local76 = local288.anInt1173 * -1199797045 >>> 3;
			local83 = local288.anInt1179 * 1206187041 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local288.anInt1180 * 633010695 + local76;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray425[local108] == local103) {
							continue label84;
						}
					}
					if (Class430.aClass359_74.method26669(this.method26978(local93, local98), Class340.aClass340_4.anInt4602 * -1178780153)) {
						this.anIntArray425[local9] = local103;
						this.anIntArray424[local9] = this.method26978(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt4671 = local9 * -1947388099;
		this.method27013(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4, 7, false);
	}

	@OriginalMember(owner = "client!om", name = "av", descriptor = "(IIB)I", line = 511)
	int method26978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!om", name = "ds", descriptor = "(II)I", line = 511)
	int method27047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!om", name = "dq", descriptor = "(II)I", line = 511)
	int method27049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!om", name = "ax", descriptor = "(Lclient!ga;I)V", line = 515)
	void method26973(@OriginalArg(0) Class191 arg0) {
		if (this.aClass191_6 == arg0) {
			return;
		}
		this.anInt4663 = (this.anInt4664 = -2017266955 * arg0.anInt3680) * -1402134691;
		this.anIntArrayArrayArray16 = new int[4][this.anInt4663 * -2081755637 >> 3][this.anInt4664 * 500879103 >> 3];
		this.anIntArrayArray50 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.anIntArrayArray51 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aClass346_3 = new Class346(4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103);
		this.method26938();
		Class3_Sub35_Sub1.method18870();
		this.aClass191_6 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "dc", descriptor = "(Lclient!ga;)V", line = 515)
	void method27052(@OriginalArg(0) Class191 arg0) {
		if (this.aClass191_6 == arg0) {
			return;
		}
		this.anInt4663 = (this.anInt4664 = -2017266955 * arg0.anInt3680) * -1402134691;
		this.anIntArrayArrayArray16 = new int[4][this.anInt4663 * -2081755637 >> 3][this.anInt4664 * 500879103 >> 3];
		this.anIntArrayArray50 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.anIntArrayArray51 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aClass346_3 = new Class346(4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103);
		this.method26938();
		Class3_Sub35_Sub1.method18870();
		this.aClass191_6 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "dt", descriptor = "(Lclient!ga;)V", line = 515)
	void method27053(@OriginalArg(0) Class191 arg0) {
		if (this.aClass191_6 == arg0) {
			return;
		}
		this.anInt4663 = (this.anInt4664 = -2017266955 * arg0.anInt3680) * -1402134691;
		this.anIntArrayArrayArray16 = new int[4][this.anInt4663 * -2081755637 >> 3][this.anInt4664 * 500879103 >> 3];
		this.anIntArrayArray50 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.anIntArrayArray51 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aClass346_3 = new Class346(4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103);
		this.method26938();
		Class3_Sub35_Sub1.method18870();
		this.aClass191_6 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "dr", descriptor = "(Lclient!ga;)V", line = 515)
	void method27076(@OriginalArg(0) Class191 arg0) {
		if (this.aClass191_6 == arg0) {
			return;
		}
		this.anInt4663 = (this.anInt4664 = -2017266955 * arg0.anInt3680) * -1402134691;
		this.anIntArrayArrayArray16 = new int[4][this.anInt4663 * -2081755637 >> 3][this.anInt4664 * 500879103 >> 3];
		this.anIntArrayArray50 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.anIntArrayArray51 = new int[this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt4663 * -2081755637][this.anInt4664 * 500879103];
		this.aClass346_3 = new Class346(4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103);
		this.method26938();
		Class3_Sub35_Sub1.method18870();
		this.aClass191_6 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "az", descriptor = "(B)V", line = 528)
	void method26975() {
		if (this.aClass380_2 == Class380.aClass380_4 || Class380.aClass380_4 == this.aClass380_1) {
			return;
		}
		if (Class380.aClass380_6 == this.aClass380_2 || Class380.aClass380_10 == this.aClass380_2 || this.aClass380_2 != this.aClass380_1 && (Class380.aClass380_5 == this.aClass380_2 || Class380.aClass380_5 == this.aClass380_1)) {
			@Pc(32) Iterator local32 = client.aClass581_21.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) local32.next();
				Class316.method25840((Class26_Sub1_Sub1_Sub1_Sub1) local39.anObject2);
			}
			client.anInt3163 = 0;
			client.anInt3054 = 0;
			client.aClass581_21.method33222();
		}
		this.aClass380_1 = this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "da", descriptor = "()V", line = 528)
	void method26986() {
		if (this.aClass380_2 == Class380.aClass380_4 || Class380.aClass380_4 == this.aClass380_1) {
			return;
		}
		if (Class380.aClass380_6 == this.aClass380_2 || Class380.aClass380_10 == this.aClass380_2 || this.aClass380_2 != this.aClass380_1 && (Class380.aClass380_5 == this.aClass380_2 || Class380.aClass380_5 == this.aClass380_1)) {
			@Pc(32) Iterator local32 = client.aClass581_21.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) local32.next();
				Class316.method25840((Class26_Sub1_Sub1_Sub1_Sub1) local39.anObject2);
			}
			client.anInt3163 = 0;
			client.anInt3054 = 0;
			client.aClass581_21.method33222();
		}
		this.aClass380_1 = this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "dd", descriptor = "()V", line = 528)
	void method27054() {
		if (this.aClass380_2 == Class380.aClass380_4 || Class380.aClass380_4 == this.aClass380_1) {
			return;
		}
		if (Class380.aClass380_6 == this.aClass380_2 || Class380.aClass380_10 == this.aClass380_2 || this.aClass380_2 != this.aClass380_1 && (Class380.aClass380_5 == this.aClass380_2 || Class380.aClass380_5 == this.aClass380_1)) {
			@Pc(32) Iterator local32 = client.aClass581_21.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) local32.next();
				Class316.method25840((Class26_Sub1_Sub1_Sub1_Sub1) local39.anObject2);
			}
			client.anInt3163 = 0;
			client.anInt3054 = 0;
			client.aClass581_21.method33222();
		}
		this.aClass380_1 = this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "dz", descriptor = "()V", line = 528)
	void method27056() {
		if (this.aClass380_2 == Class380.aClass380_4 || Class380.aClass380_4 == this.aClass380_1) {
			return;
		}
		if (Class380.aClass380_6 == this.aClass380_2 || Class380.aClass380_10 == this.aClass380_2 || this.aClass380_2 != this.aClass380_1 && (Class380.aClass380_5 == this.aClass380_2 || Class380.aClass380_5 == this.aClass380_1)) {
			@Pc(32) Iterator local32 = client.aClass581_21.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) local32.next();
				Class316.method25840((Class26_Sub1_Sub1_Sub1_Sub1) local39.anObject2);
			}
			client.anInt3163 = 0;
			client.anInt3054 = 0;
			client.aClass581_21.method33222();
		}
		this.aClass380_1 = this.aClass380_2;
	}

	@OriginalMember(owner = "client!om", name = "de", descriptor = "(IIIZ)V", line = 542)
	void method26955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3065 * -1773414811 == 3) {
			if (this.aBoolean729) {
				throw new IllegalStateException();
			}
			client.anInt3065 = 1500491188;
			client.anInt3064 = -741970315;
		}
		if (!arg3 && arg0 == this.anInt4672 * 774829635 && arg1 == this.anInt4673 * -1940676495) {
			return;
		}
		this.anInt4672 = arg0 * 556303979;
		this.anInt4673 = arg1 * -472637295;
		if (!this.aBoolean729) {
			Class166.method23342(arg2);
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2), true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		if (this.aClass464_2 == null) {
			this.aClass464_1 = new Class464(0, 0, 0);
		} else {
			this.aClass464_1 = this.aClass464_2;
		}
		this.aClass464_2 = new Class464(0, (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) * 8, (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) * 8);
		this.aClass3_Sub1_Sub4_4 = Class58.method12460(this.anInt4663 * -2081755637 / 2 + this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441 + this.anInt4663 * -2081755637 / 2);
		this.aClass421_3 = null;
		if (!this.aBoolean729) {
			this.method26977(arg2);
		}
	}

	@OriginalMember(owner = "client!om", name = "al", descriptor = "(IIIZB)V", line = 542)
	void method27013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3065 * -1773414811 == 3) {
			if (this.aBoolean729) {
				throw new IllegalStateException();
			}
			client.anInt3065 = 1500491188;
			client.anInt3064 = -741970315;
		}
		if (!arg3 && arg0 == this.anInt4672 * 774829635 && arg1 == this.anInt4673 * -1940676495) {
			return;
		}
		this.anInt4672 = arg0 * 556303979;
		this.anInt4673 = arg1 * -472637295;
		if (!this.aBoolean729) {
			Class166.method23342(arg2);
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2), true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		if (this.aClass464_2 == null) {
			this.aClass464_1 = new Class464(0, 0, 0);
		} else {
			this.aClass464_1 = this.aClass464_2;
		}
		this.aClass464_2 = new Class464(0, (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) * 8, (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) * 8);
		this.aClass3_Sub1_Sub4_4 = Class58.method12460(this.anInt4663 * -2081755637 / 2 + this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441 + this.anInt4663 * -2081755637 / 2);
		this.aClass421_3 = null;
		if (!this.aBoolean729) {
			this.method26977(arg2);
		}
	}

	@OriginalMember(owner = "client!om", name = "dl", descriptor = "(IIIZ)V", line = 542)
	void method27058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3065 * -1773414811 == 3) {
			if (this.aBoolean729) {
				throw new IllegalStateException();
			}
			client.anInt3065 = 1500491188;
			client.anInt3064 = -741970315;
		}
		if (!arg3 && arg0 == this.anInt4672 * 774829635 && arg1 == this.anInt4673 * -1940676495) {
			return;
		}
		this.anInt4672 = arg0 * 556303979;
		this.anInt4673 = arg1 * -472637295;
		if (!this.aBoolean729) {
			Class166.method23342(arg2);
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2), true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		if (this.aClass464_2 == null) {
			this.aClass464_1 = new Class464(0, 0, 0);
		} else {
			this.aClass464_1 = this.aClass464_2;
		}
		this.aClass464_2 = new Class464(0, (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) * 8, (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) * 8);
		this.aClass3_Sub1_Sub4_4 = Class58.method12460(this.anInt4663 * -2081755637 / 2 + this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441 + this.anInt4663 * -2081755637 / 2);
		this.aClass421_3 = null;
		if (!this.aBoolean729) {
			this.method26977(arg2);
		}
	}

	@OriginalMember(owner = "client!om", name = "ao", descriptor = "(II)V", line = 565)
	void method26977(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass464_2.anInt5071 * -1567811631 - this.aClass464_1.anInt5071 * -1567811631;
		@Pc(23) int local23 = this.aClass464_2.anInt5073 * 1360175441 - this.aClass464_1.anInt5073 * 1360175441;
		@Pc(28) int local28;
		@Pc(46) int local46;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (arg0 == 7) {
			for (local28 = 0; local28 < client.anInt3054 * -453205259; local28++) {
				@Pc(37) Class3_Sub29 local37 = client.aClass3_Sub29Array1[local28];
				if (local37 != null) {
					@Pc(44) Class26_Sub1_Sub1_Sub1_Sub1 local44 = (Class26_Sub1_Sub1_Sub1_Sub1) local37.anObject2;
					for (local46 = 0; local46 < local44.anIntArray241.length; local46++) {
						local44.anIntArray241[local46] -= local11;
						local44.anIntArray239[local46] -= local23;
					}
					@Pc(74) Class320 local74 = Class320.method25906(local44.method21431().aClass320_61);
					local74.aFloat259 -= local11 * 512;
					local74.aFloat261 -= local23 * 512;
					local44.method21436(local74);
					local74.method25874();
				}
			}
		} else {
			@Pc(102) boolean local102 = false;
			client.anInt3163 = 0;
			local111 = this.anInt4663 * -706996736 - 512;
			local118 = this.anInt4664 * -1247937024 - 512;
			for (local46 = 0; local46 < client.anInt3054 * -453205259; local46++) {
				@Pc(129) Class3_Sub29 local129 = client.aClass3_Sub29Array1[local46];
				if (local129 != null) {
					@Pc(136) Class26_Sub1_Sub1_Sub1_Sub1 local136 = (Class26_Sub1_Sub1_Sub1_Sub1) local129.anObject2;
					@Pc(141) Class320 local141 = Class320.method25906(local136.method21431().aClass320_61);
					local141.aFloat259 -= local11 * 512;
					local141.aFloat261 -= local23 * 512;
					local136.method21436(local141);
					if ((int) local141.aFloat259 >= 0 && (int) local141.aFloat259 <= local111 && (int) local141.aFloat261 >= 0 && (int) local141.aFloat261 <= local118) {
						@Pc(192) boolean local192 = true;
						for (@Pc(194) int local194 = 0; local194 < local136.anIntArray241.length; local194++) {
							local136.anIntArray241[local194] -= local11;
							local136.anIntArray239[local194] -= local23;
							if (local136.anIntArray241[local194] < 0 || local136.anIntArray241[local194] >= this.anInt4663 * -2081755637 || local136.anIntArray239[local194] < 0 || local136.anIntArray239[local194] >= this.anInt4664 * 500879103) {
								local192 = false;
							}
						}
						if (local192) {
							client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local136.anInt2355 * 144783765;
						} else {
							local136.method15495(null);
							local129.method33656();
							local102 = true;
						}
					} else {
						local136.method15495(null);
						local129.method33656();
						local102 = true;
					}
					local141.method25874();
				}
			}
			if (local102) {
				client.anInt3054 = client.aClass581_21.method33220() * -1735952035;
				local46 = 0;
				@Pc(291) Iterator local291 = client.aClass581_21.iterator();
				while (local291.hasNext()) {
					@Pc(298) Class3_Sub29 local298 = (Class3_Sub29) local291.next();
					client.aClass3_Sub29Array1[local46++] = local298;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(313) Class26_Sub1_Sub1_Sub1_Sub2 local313 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local313 != null) {
				for (local118 = 0; local118 < local313.anIntArray241.length; local118++) {
					local313.anIntArray241[local118] -= local11;
					local313.anIntArray239[local118] -= local23;
				}
				@Pc(346) Class320 local346 = Class320.method25906(local313.method21431().aClass320_61);
				local346.aFloat259 -= local11 * 512;
				local346.aFloat261 -= local23 * 512;
				local313.method21436(local346);
				local346.method25874();
			}
		}
		@Pc(373) Class68[] local373 = client.aClass68Array1;
		for (local111 = 0; local111 < local373.length; local111++) {
			@Pc(383) Class68 local383 = local373[local111];
			if (local383 != null) {
				local383.anInt2009 -= local11 * -1525038592;
				local383.anInt2011 -= local23 * 495362560;
			}
		}
		@Pc(408) Class3_Sub7 local408;
		@Pc(435) Class467 local435;
		for (local408 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32768(); local408 != null; local408 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32709()) {
			local408.anInt1187 -= local11 * 665189903;
			local408.anInt1184 -= local23 * 449344921;
			local435 = this.aClass457_8.method28510(local408.anInt1182 * -1534639185);
			if ((local408.anInt1188 * 2046717403 & 0x1) == 0) {
				local118 = local435.anInt5080 * -1872348475;
				local46 = local435.anInt5113 * 1824726069;
			} else {
				local118 = local435.anInt5113 * 1824726069;
				local46 = local435.anInt5080 * -1872348475;
			}
			if (this.aClass380_2 != Class380.aClass380_8 && (local118 + local408.anInt1187 * -1303695121 <= 0 || local408.anInt1184 * -2103701847 + local46 <= 0 || local408.anInt1187 * -1303695121 >= this.anInt4663 * -2081755637 || local408.anInt1184 * -2103701847 >= this.anInt4664 * 500879103)) {
				local408.method33656();
			}
		}
		for (local408 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32768(); local408 != null; local408 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32709()) {
			local408.anInt1187 -= local11 * 665189903;
			local408.anInt1184 -= local23 * 449344921;
			local435 = this.aClass457_8.method28510(local408.anInt1182 * -1534639185);
			if ((local408.anInt1188 * 2046717403 & 0x1) == 0) {
				local118 = local435.anInt5080 * -1872348475;
				local46 = local435.anInt5113 * 1824726069;
			} else {
				local118 = local435.anInt5113 * 1824726069;
				local46 = local435.anInt5080 * -1872348475;
			}
			if (this.aClass380_2 != Class380.aClass380_8 && (local118 + local408.anInt1187 * -1303695121 <= 0 || local408.anInt1184 * -2103701847 + local46 <= 0 || local408.anInt1187 * -1303695121 >= this.anInt4663 * -2081755637 || local408.anInt1184 * -2103701847 >= this.anInt4664 * 500879103)) {
				local408.method33656();
			}
		}
		for (@Pc(620) Class3_Sub13 local620 = (Class3_Sub13) client.aClass581_19.method33221(); local620 != null; local620 = (Class3_Sub13) client.aClass581_19.method33231()) {
			local118 = (int) (local620.aLong296 * -1930649055099428229L >> 28 & 0x3L);
			local46 = (int) (local620.aLong296 * -1930649055099428229L & 0x3FFFL);
			@Pc(648) int local648 = local46 - this.aClass464_2.anInt5071 * -1567811631;
			@Pc(658) int local658 = (int) (local620.aLong296 * -1930649055099428229L >> 14 & 0x3FFFL);
			@Pc(666) int local666 = local658 - this.aClass464_2.anInt5073 * 1360175441;
			if (this.aClass438_24 != null) {
				if (local648 >= 0 && local666 >= 0 && local648 < this.anInt4663 * -2081755637 && local666 < this.anInt4664 * 500879103 && local648 < this.aClass438_24.anInt4901 * 406964363 && local666 < this.aClass438_24.anInt4902 * 2009656297) {
					if (this.aClass438_24.aClass432ArrayArrayArray3 != null) {
						this.aClass438_24.method28082(local118, local648, local666);
					}
				} else if (Class380.aClass380_8 != this.aClass380_2) {
					local620.method33656();
				}
			}
		}
		if (Class2.anInt5 * 1749463705 != 0) {
			Class2.anInt5 -= local11 * 2115862953;
			Class2.anInt2 -= local23 * 383922831;
		}
		Class606.method33538(false);
		if (arg0 == 7) {
			client.anInt3085 -= local11 * -1944958464;
			client.anInt3086 -= local23 * -487660032;
			Class403.anInt4808 -= local11 * -1586658816;
			Class48.anInt1088 -= local23 * -1324525056;
			if (Class72.anInt2086 * 81180077 != 4 && Class72.anInt2086 * 81180077 != 3) {
				Class375.method27232(Class205.method24189());
			}
		} else {
			Class272.anInt4297 -= local11 * 613578303;
			Class177.anInt3473 -= local23 * 1422814567;
			Class346.anInt4621 -= local11 * -1684442801;
			Class309.anInt4525 -= local23 * -1799856885;
			Class586.anInt5460 -= local11 * 86842880;
			Class149.anInt3434 -= local23 * 1749164544;
			if (Math.abs(local11) > this.anInt4663 * -2081755637 || Math.abs(local23) > this.anInt4664 * 500879103) {
				this.aClass479_2.method28901();
			}
		}
		Class564.method32904();
		Class157.method23191();
		client.aClass581_18.method33222();
		client.aClass553_44.method32701();
		client.aClass559_7.method32818();
		Class494.method29314();
	}

	@OriginalMember(owner = "client!om", name = "dx", descriptor = "()V", line = 733)
	void method26993() {
		this.aClass50_Sub1_1 = null;
		this.aClass50_Sub1_2 = null;
		if (this.aClass346_3 != null) {
			this.aClass346_3.method26502();
		}
		if (this.aClass479_2 != null) {
			this.aClass479_2.method28876();
		}
		if (this.aClass438_24 != null) {
			this.aClass438_24.aClass410_1.method27670();
			this.aClass438_24 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "ap", descriptor = "(B)V", line = 733)
	void method27050() {
		this.aClass50_Sub1_1 = null;
		this.aClass50_Sub1_2 = null;
		if (this.aClass346_3 != null) {
			this.aClass346_3.method26502();
		}
		if (this.aClass479_2 != null) {
			this.aClass479_2.method28876();
		}
		if (this.aClass438_24 != null) {
			this.aClass438_24.aClass410_1.method27670();
			this.aClass438_24 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "dj", descriptor = "()V", line = 733)
	void method27059() {
		this.aClass50_Sub1_1 = null;
		this.aClass50_Sub1_2 = null;
		if (this.aClass346_3 != null) {
			this.aClass346_3.method26502();
		}
		if (this.aClass479_2 != null) {
			this.aClass479_2.method28876();
		}
		if (this.aClass438_24 != null) {
			this.aClass438_24.aClass410_1.method27670();
			this.aClass438_24 = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "dm", descriptor = "()Z", line = 744)
	public boolean method26952() {
		if (!this.aBoolean729) {
			Class110.method22005(false);
		}
		this.anInt4668 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (!Class430.aClass359_74.method26675(this.anIntArray424[local10])) {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.aClass421_3 == null) {
			if (this.aClass3_Sub1_Sub4_4 == null || !Class579.aClass359_102.method26681(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = new Class421(0);
			} else if (Class579.aClass359_102.method26694(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = Class191.method24060(Class579.aClass359_102, this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements", client.aBoolean590);
			} else {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.anInt4668 * 1392834999 > 0) {
			if (this.anInt4667 * 578572815 < this.anInt4668 * 1392834999) {
				this.anInt4667 = this.anInt4668 * -972757543;
			}
			this.aClass363_5 = Class363.aClass363_2;
			return false;
		}
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (this.aByteArrayArray19[local10] == null) {
				this.aByteArrayArray19[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_4.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray20[local10] == null) {
				this.aByteArrayArray20[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_7.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray17[local10] == null) {
				this.aByteArrayArray17[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_6.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray16[local10] == null) {
				this.aByteArrayArray16[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_2.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray18 != null && this.aByteArrayArray18[local10] == null) {
				this.aByteArrayArray18[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_3.anInt4602 * -1178780153);
			}
		}
		local10 = this.anInt4662 * -2123074583;
		@Pc(247) Class510 local247 = new Class510(-1);
		@Pc(252) Class510 local252 = new Class510(-1);
		this.anInt4662 = 0;
		@Pc(257) int local257;
		@Pc(300) int local300;
		@Pc(327) int local327;
		for (local257 = 0; local257 < this.anInt4671 * 1906038805; local257++) {
			@Pc(268) byte[] local268 = this.aByteArrayArray20[local257];
			@Pc(285) int local285;
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
			local268 = this.aByteArrayArray16[local257];
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
		}
		if (this.anInt4662 * -2123074583 > 0) {
			if (this.anInt4662 * -2123074583 != local10) {
				this.anInt4670 = client.anInt3034 * 1020923555;
			} else if (this.anInt4670 * 2142901515 != 0 && client.anInt3034 - this.anInt4670 * 2142901515 == 1000) {
				Class107.method21921(local252.anInt5258 * -6824133, local247.anInt5258 * -6824133, this.anInt4662 * -2123074583);
				Class18.method17008();
			}
			if (this.anInt4669 * 1030167333 < this.anInt4662 * -2123074583) {
				this.anInt4669 = this.anInt4662 * 148446325;
			}
			this.aClass363_5 = Class363.aClass363_3;
			return false;
		}
		if (!this.aBoolean729 && Class363.aClass363_1 != this.aClass363_5) {
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2) + Class1.aString3 + "(100%)", true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		this.aClass363_5 = Class363.aClass363_4;
		if (!this.aBoolean729 && Class510.aClass183_1 != null) {
			Class510.aClass183_1.method23624();
		}
		if (!this.aBoolean729) {
			for (local257 = 0; local257 < 2048; local257++) {
				@Pc(530) Class26_Sub1_Sub1_Sub1_Sub2 local530 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local257];
				if (local530 != null) {
					local530.aClass438_23 = null;
				}
			}
			for (local257 = 0; local257 < client.aClass3_Sub29Array1.length; local257++) {
				@Pc(547) Class3_Sub29 local547 = client.aClass3_Sub29Array1[local257];
				if (local547 != null) {
					((Class26_Sub1) local547.anObject2).aClass438_23 = null;
				}
			}
		}
		if (!this.aBoolean729) {
			Class604.method33534(true);
		}
		if (!this.aBoolean729) {
			Class512.method29595();
		}
		@Pc(570) boolean local570 = false;
		@Pc(578) int local578;
		if (Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2) {
			for (local578 = 0; local578 < this.anInt4671 * 1906038805; local578++) {
				if (this.aByteArrayArray16[local578] != null || this.aByteArrayArray17[local578] != null) {
					local570 = true;
					break;
				}
			}
		}
		local578 = Class60_Sub35.method14625(Class510.aClass3_Sub45_37.aClass60_Sub18_1.method13605()).anInt3697 * -1571722264;
		if (Class613.aClass21_13.method17033()) {
			local578++;
		}
		this.method26976();
		this.method27050();
		this.aClass438_24 = new Class438(Class613.aClass21_13, 9, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local578, local570, Class613.aClass21_13.method17023() > 0);
		this.aClass438_24.method28172(false);
		this.aClass438_24.method28034(client.anInt3044 * -352553545);
		if (client.anInt3044 * -352553545 == 0) {
			this.aClass438_24.method28035(null);
		} else {
			this.aClass438_24.method28035(Class418.aClass14_11);
		}
		this.aClass368_1 = new Class368();
		this.aFloat293 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass50_Sub1_2 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, false, this.aClass346_3, this.aClass479_2);
		this.aClass50_Sub1_2.method9379();
		this.aClass50_Sub1_2.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
		this.aClass50_Sub1_2.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
		this.aClass50_Sub1_2.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
		this.aClass50_Sub1_2.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
		this.aClass50_Sub1_2.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
		if (this.aClass380_2.method27279()) {
			this.method26967(this.aClass50_Sub1_2, this.aByteArrayArray19);
		} else {
			this.method26979(this.aClass50_Sub1_2, this.aByteArrayArray19);
		}
		if (this.aBoolean729) {
			this.method26946(50);
		}
		this.aClass479_2.method28867(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4);
		this.aClass479_2.method28896(this);
		if (local570) {
			this.aClass438_24.method28172(true);
			this.aClass50_Sub1_1 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 1, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, true, this.aClass346_3, this.aClass479_2);
			this.aClass50_Sub1_1.method9379();
			this.aClass50_Sub1_1.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
			this.aClass50_Sub1_1.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
			this.aClass50_Sub1_1.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
			this.aClass50_Sub1_1.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
			this.aClass50_Sub1_1.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
			if (this.aClass380_2.method27279()) {
				this.method26967(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			} else {
				this.method26979(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			}
			this.aClass50_Sub1_1.method9422(0, this.aClass50_Sub1_2.anIntArrayArrayArray14[0]);
			this.aClass50_Sub1_1.method9417(Class613.aClass21_13, null);
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9417(Class613.aClass21_13, local570 ? this.aClass50_Sub1_1.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass380_2.method27279()) {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26984(this.aClass50_Sub1_2, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26983(this.aClass50_Sub1_2, this.aByteArrayArray20);
			if (this.aByteArrayArray18 != null) {
				this.method26985();
			}
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		this.aClass50_Sub1_2.method9388(Class613.aClass21_13, local570 ? this.aClass438_24.aClass17Array2[0] : null, null);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		this.aClass50_Sub1_2.method9458(Class613.aClass21_13, false);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		if (local570) {
			this.aClass438_24.method28172(true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			if (this.aClass380_2.method27279()) {
				this.method26984(this.aClass50_Sub1_1, this.aByteArrayArray16);
			} else {
				this.method26983(this.aClass50_Sub1_1, this.aByteArrayArray16);
			}
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass50_Sub1_1.method9388(Class613.aClass21_13, null, this.aClass438_24.aClass17Array1[0]);
			this.aClass50_Sub1_1.method9458(Class613.aClass21_13, true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9380();
		if (this.aClass50_Sub1_1 != null) {
			this.aClass50_Sub1_1.method9380();
		}
		this.aClass438_24.method28037();
		if (this.aBoolean729) {
			Class176.method23413();
			while (!Class613.aClass21_13.method17104()) {
				this.method26946(1);
			}
		}
		@Pc(1174) boolean local1174 = false;
		if (this.aBoolean729) {
			@Pc(1179) Class370 local1179 = client.aClass370_1;
			this.method27060(local1179);
			Class30_Sub1.aClass379_1.method27255(local1179);
			local1174 = true;
			Class176.method23413();
			@Pc(1195) Object local1195 = client.anObject12;
			synchronized (client.anObject12) {
				client.aBoolean580 = true;
				try {
					client.anObject12.wait();
				} catch (@Pc(1202) InterruptedException local1202) {
				}
			}
			client.aClass370_1 = this;
			local1179.method27050();
			this.method26977(7);
			this.method26975();
		} else {
			Class510.aClass183_1.method23624();
			this.aClass479_2.method28905();
			Class148.method23113();
		}
		@Pc(1247) int local1247;
		for (local300 = 0; local300 < 4; local300++) {
			for (local327 = 0; local327 < this.anInt4663 * -2081755637; local327++) {
				for (local1247 = 0; local1247 < this.anInt4664 * 500879103; local1247++) {
					Class356.method26653(local300, local327, local1247);
				}
			}
		}
		for (local300 = 0; local300 < client.aClass398Array1.length; local300++) {
			if (client.aClass398Array1[local300] != null) {
				client.aClass398Array1[local300].method27530();
			}
		}
		Class43_Sub5.method9508();
		Class276.method25388();
		@Pc(1305) Class3_Sub23 local1305;
		if (Class527.method32424() == Class389.aClass389_3 && client.aClass82_2.method21621() != null && client.anInt3039 * 1115111877 == 7) {
			local1305 = Class269.method25284(Class311.aClass311_10, client.aClass82_2.aClass577_2);
			local1305.aClass3_Sub41_Sub1_1.method20254(1057001181);
			client.aClass82_2.method21601(local1305);
		}
		if (!this.aClass380_2.method27279()) {
			local300 = (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) / 8;
			local327 = ((this.anInt4663 * -2081755637 >> 4) + this.anInt4672 * 774829635) / 8;
			local1247 = (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) / 8;
			@Pc(1375) int local1375 = ((this.anInt4664 * 500879103 >> 4) + this.anInt4673 * -1940676495) / 8;
			for (@Pc(1379) int local1379 = local300 - 1; local1379 <= local327 + 1; local1379++) {
				for (@Pc(1388) int local1388 = local1247 - 1; local1388 <= local1375 + 1; local1388++) {
					if (local1379 < local300 || local1379 > local327 || local1388 < local1247 || local1388 > local1375) {
						Class430.aClass359_74.method26671(this.method26978(local1379, local1388));
					}
				}
			}
		}
		if (client.anInt3039 * 1115111877 == 6) {
			Class166.method23342(2);
		} else if (client.anInt3039 * 1115111877 == 11) {
			Class166.method23342(18);
		} else if (client.anInt3039 * 1115111877 == 12) {
			Class166.method23342(3);
		} else if (client.anInt3039 * 1115111877 == 1) {
			Class166.method23342(16);
		} else {
			Class166.method23342(5);
			if (client.aClass82_2.method21621() != null) {
				local1305 = Class269.method25284(Class311.aClass311_79, client.aClass82_2.aClass577_2);
				client.aClass82_2.method21601(local1305);
			}
		}
		if (this.aBoolean728) {
			Class215.method24289(Long.toString(Class176.method23413() - this.aLong267 * 944198643184077391L));
			this.aBoolean728 = false;
		}
		if (local1174) {
			@Pc(1492) Object local1492 = client.anObject11;
			synchronized (client.anObject11) {
				client.anObject11.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "dw", descriptor = "()Z", line = 744)
	public boolean method26990() {
		if (!this.aBoolean729) {
			Class110.method22005(false);
		}
		this.anInt4668 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (!Class430.aClass359_74.method26675(this.anIntArray424[local10])) {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.aClass421_3 == null) {
			if (this.aClass3_Sub1_Sub4_4 == null || !Class579.aClass359_102.method26681(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = new Class421(0);
			} else if (Class579.aClass359_102.method26694(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = Class191.method24060(Class579.aClass359_102, this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements", client.aBoolean590);
			} else {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.anInt4668 * 1392834999 > 0) {
			if (this.anInt4667 * 578572815 < this.anInt4668 * 1392834999) {
				this.anInt4667 = this.anInt4668 * -972757543;
			}
			this.aClass363_5 = Class363.aClass363_2;
			return false;
		}
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (this.aByteArrayArray19[local10] == null) {
				this.aByteArrayArray19[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_4.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray20[local10] == null) {
				this.aByteArrayArray20[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_7.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray17[local10] == null) {
				this.aByteArrayArray17[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_6.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray16[local10] == null) {
				this.aByteArrayArray16[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_2.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray18 != null && this.aByteArrayArray18[local10] == null) {
				this.aByteArrayArray18[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_3.anInt4602 * -1178780153);
			}
		}
		local10 = this.anInt4662 * -2123074583;
		@Pc(247) Class510 local247 = new Class510(-1);
		@Pc(252) Class510 local252 = new Class510(-1);
		this.anInt4662 = 0;
		@Pc(257) int local257;
		@Pc(300) int local300;
		@Pc(327) int local327;
		for (local257 = 0; local257 < this.anInt4671 * 1906038805; local257++) {
			@Pc(268) byte[] local268 = this.aByteArrayArray20[local257];
			@Pc(285) int local285;
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
			local268 = this.aByteArrayArray16[local257];
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
		}
		if (this.anInt4662 * -2123074583 > 0) {
			if (this.anInt4662 * -2123074583 != local10) {
				this.anInt4670 = client.anInt3034 * 1020923555;
			} else if (this.anInt4670 * 2142901515 != 0 && client.anInt3034 - this.anInt4670 * 2142901515 == 1000) {
				Class107.method21921(local252.anInt5258 * -6824133, local247.anInt5258 * -6824133, this.anInt4662 * -2123074583);
				Class18.method17008();
			}
			if (this.anInt4669 * 1030167333 < this.anInt4662 * -2123074583) {
				this.anInt4669 = this.anInt4662 * 148446325;
			}
			this.aClass363_5 = Class363.aClass363_3;
			return false;
		}
		if (!this.aBoolean729 && Class363.aClass363_1 != this.aClass363_5) {
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2) + Class1.aString3 + "(100%)", true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		this.aClass363_5 = Class363.aClass363_4;
		if (!this.aBoolean729 && Class510.aClass183_1 != null) {
			Class510.aClass183_1.method23624();
		}
		if (!this.aBoolean729) {
			for (local257 = 0; local257 < 2048; local257++) {
				@Pc(530) Class26_Sub1_Sub1_Sub1_Sub2 local530 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local257];
				if (local530 != null) {
					local530.aClass438_23 = null;
				}
			}
			for (local257 = 0; local257 < client.aClass3_Sub29Array1.length; local257++) {
				@Pc(547) Class3_Sub29 local547 = client.aClass3_Sub29Array1[local257];
				if (local547 != null) {
					((Class26_Sub1) local547.anObject2).aClass438_23 = null;
				}
			}
		}
		if (!this.aBoolean729) {
			Class604.method33534(true);
		}
		if (!this.aBoolean729) {
			Class512.method29595();
		}
		@Pc(570) boolean local570 = false;
		@Pc(578) int local578;
		if (Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2) {
			for (local578 = 0; local578 < this.anInt4671 * 1906038805; local578++) {
				if (this.aByteArrayArray16[local578] != null || this.aByteArrayArray17[local578] != null) {
					local570 = true;
					break;
				}
			}
		}
		local578 = Class60_Sub35.method14625(Class510.aClass3_Sub45_37.aClass60_Sub18_1.method13605()).anInt3697 * -1571722264;
		if (Class613.aClass21_13.method17033()) {
			local578++;
		}
		this.method26976();
		this.method27050();
		this.aClass438_24 = new Class438(Class613.aClass21_13, 9, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local578, local570, Class613.aClass21_13.method17023() > 0);
		this.aClass438_24.method28172(false);
		this.aClass438_24.method28034(client.anInt3044 * -352553545);
		if (client.anInt3044 * -352553545 == 0) {
			this.aClass438_24.method28035(null);
		} else {
			this.aClass438_24.method28035(Class418.aClass14_11);
		}
		this.aClass368_1 = new Class368();
		this.aFloat293 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass50_Sub1_2 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, false, this.aClass346_3, this.aClass479_2);
		this.aClass50_Sub1_2.method9379();
		this.aClass50_Sub1_2.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
		this.aClass50_Sub1_2.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
		this.aClass50_Sub1_2.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
		this.aClass50_Sub1_2.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
		this.aClass50_Sub1_2.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
		if (this.aClass380_2.method27279()) {
			this.method26967(this.aClass50_Sub1_2, this.aByteArrayArray19);
		} else {
			this.method26979(this.aClass50_Sub1_2, this.aByteArrayArray19);
		}
		if (this.aBoolean729) {
			this.method26946(50);
		}
		this.aClass479_2.method28867(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4);
		this.aClass479_2.method28896(this);
		if (local570) {
			this.aClass438_24.method28172(true);
			this.aClass50_Sub1_1 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 1, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, true, this.aClass346_3, this.aClass479_2);
			this.aClass50_Sub1_1.method9379();
			this.aClass50_Sub1_1.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
			this.aClass50_Sub1_1.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
			this.aClass50_Sub1_1.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
			this.aClass50_Sub1_1.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
			this.aClass50_Sub1_1.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
			if (this.aClass380_2.method27279()) {
				this.method26967(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			} else {
				this.method26979(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			}
			this.aClass50_Sub1_1.method9422(0, this.aClass50_Sub1_2.anIntArrayArrayArray14[0]);
			this.aClass50_Sub1_1.method9417(Class613.aClass21_13, null);
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9417(Class613.aClass21_13, local570 ? this.aClass50_Sub1_1.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass380_2.method27279()) {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26984(this.aClass50_Sub1_2, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26983(this.aClass50_Sub1_2, this.aByteArrayArray20);
			if (this.aByteArrayArray18 != null) {
				this.method26985();
			}
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		this.aClass50_Sub1_2.method9388(Class613.aClass21_13, local570 ? this.aClass438_24.aClass17Array2[0] : null, null);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		this.aClass50_Sub1_2.method9458(Class613.aClass21_13, false);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		if (local570) {
			this.aClass438_24.method28172(true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			if (this.aClass380_2.method27279()) {
				this.method26984(this.aClass50_Sub1_1, this.aByteArrayArray16);
			} else {
				this.method26983(this.aClass50_Sub1_1, this.aByteArrayArray16);
			}
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass50_Sub1_1.method9388(Class613.aClass21_13, null, this.aClass438_24.aClass17Array1[0]);
			this.aClass50_Sub1_1.method9458(Class613.aClass21_13, true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9380();
		if (this.aClass50_Sub1_1 != null) {
			this.aClass50_Sub1_1.method9380();
		}
		this.aClass438_24.method28037();
		if (this.aBoolean729) {
			Class176.method23413();
			while (!Class613.aClass21_13.method17104()) {
				this.method26946(1);
			}
		}
		@Pc(1174) boolean local1174 = false;
		if (this.aBoolean729) {
			@Pc(1179) Class370 local1179 = client.aClass370_1;
			this.method27060(local1179);
			Class30_Sub1.aClass379_1.method27255(local1179);
			local1174 = true;
			Class176.method23413();
			@Pc(1195) Object local1195 = client.anObject12;
			synchronized (client.anObject12) {
				client.aBoolean580 = true;
				try {
					client.anObject12.wait();
				} catch (@Pc(1202) InterruptedException local1202) {
				}
			}
			client.aClass370_1 = this;
			local1179.method27050();
			this.method26977(7);
			this.method26975();
		} else {
			Class510.aClass183_1.method23624();
			this.aClass479_2.method28905();
			Class148.method23113();
		}
		@Pc(1247) int local1247;
		for (local300 = 0; local300 < 4; local300++) {
			for (local327 = 0; local327 < this.anInt4663 * -2081755637; local327++) {
				for (local1247 = 0; local1247 < this.anInt4664 * 500879103; local1247++) {
					Class356.method26653(local300, local327, local1247);
				}
			}
		}
		for (local300 = 0; local300 < client.aClass398Array1.length; local300++) {
			if (client.aClass398Array1[local300] != null) {
				client.aClass398Array1[local300].method27530();
			}
		}
		Class43_Sub5.method9508();
		Class276.method25388();
		@Pc(1305) Class3_Sub23 local1305;
		if (Class527.method32424() == Class389.aClass389_3 && client.aClass82_2.method21621() != null && client.anInt3039 * 1115111877 == 7) {
			local1305 = Class269.method25284(Class311.aClass311_10, client.aClass82_2.aClass577_2);
			local1305.aClass3_Sub41_Sub1_1.method20254(1057001181);
			client.aClass82_2.method21601(local1305);
		}
		if (!this.aClass380_2.method27279()) {
			local300 = (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) / 8;
			local327 = ((this.anInt4663 * -2081755637 >> 4) + this.anInt4672 * 774829635) / 8;
			local1247 = (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) / 8;
			@Pc(1375) int local1375 = ((this.anInt4664 * 500879103 >> 4) + this.anInt4673 * -1940676495) / 8;
			for (@Pc(1379) int local1379 = local300 - 1; local1379 <= local327 + 1; local1379++) {
				for (@Pc(1388) int local1388 = local1247 - 1; local1388 <= local1375 + 1; local1388++) {
					if (local1379 < local300 || local1379 > local327 || local1388 < local1247 || local1388 > local1375) {
						Class430.aClass359_74.method26671(this.method26978(local1379, local1388));
					}
				}
			}
		}
		if (client.anInt3039 * 1115111877 == 6) {
			Class166.method23342(2);
		} else if (client.anInt3039 * 1115111877 == 11) {
			Class166.method23342(18);
		} else if (client.anInt3039 * 1115111877 == 12) {
			Class166.method23342(3);
		} else if (client.anInt3039 * 1115111877 == 1) {
			Class166.method23342(16);
		} else {
			Class166.method23342(5);
			if (client.aClass82_2.method21621() != null) {
				local1305 = Class269.method25284(Class311.aClass311_79, client.aClass82_2.aClass577_2);
				client.aClass82_2.method21601(local1305);
			}
		}
		if (this.aBoolean728) {
			Class215.method24289(Long.toString(Class176.method23413() - this.aLong267 * 944198643184077391L));
			this.aBoolean728 = false;
		}
		if (local1174) {
			@Pc(1492) Object local1492 = client.anObject11;
			synchronized (client.anObject11) {
				client.anObject11.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "(I)Z", line = 744)
	public boolean method27055() {
		if (!this.aBoolean729) {
			Class110.method22005(false);
		}
		this.anInt4668 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (!Class430.aClass359_74.method26675(this.anIntArray424[local10])) {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.aClass421_3 == null) {
			if (this.aClass3_Sub1_Sub4_4 == null || !Class579.aClass359_102.method26681(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = new Class421(0);
			} else if (Class579.aClass359_102.method26694(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = Class191.method24060(Class579.aClass359_102, this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements", client.aBoolean590);
			} else {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.anInt4668 * 1392834999 > 0) {
			if (this.anInt4667 * 578572815 < this.anInt4668 * 1392834999) {
				this.anInt4667 = this.anInt4668 * -972757543;
			}
			this.aClass363_5 = Class363.aClass363_2;
			return false;
		}
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (this.aByteArrayArray19[local10] == null) {
				this.aByteArrayArray19[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_4.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray20[local10] == null) {
				this.aByteArrayArray20[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_7.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray17[local10] == null) {
				this.aByteArrayArray17[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_6.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray16[local10] == null) {
				this.aByteArrayArray16[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_2.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray18 != null && this.aByteArrayArray18[local10] == null) {
				this.aByteArrayArray18[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_3.anInt4602 * -1178780153);
			}
		}
		local10 = this.anInt4662 * -2123074583;
		@Pc(247) Class510 local247 = new Class510(-1);
		@Pc(252) Class510 local252 = new Class510(-1);
		this.anInt4662 = 0;
		@Pc(257) int local257;
		@Pc(300) int local300;
		@Pc(327) int local327;
		for (local257 = 0; local257 < this.anInt4671 * 1906038805; local257++) {
			@Pc(268) byte[] local268 = this.aByteArrayArray20[local257];
			@Pc(285) int local285;
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
			local268 = this.aByteArrayArray16[local257];
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
		}
		if (this.anInt4662 * -2123074583 > 0) {
			if (this.anInt4662 * -2123074583 != local10) {
				this.anInt4670 = client.anInt3034 * 1020923555;
			} else if (this.anInt4670 * 2142901515 != 0 && client.anInt3034 - this.anInt4670 * 2142901515 == 1000) {
				Class107.method21921(local252.anInt5258 * -6824133, local247.anInt5258 * -6824133, this.anInt4662 * -2123074583);
				Class18.method17008();
			}
			if (this.anInt4669 * 1030167333 < this.anInt4662 * -2123074583) {
				this.anInt4669 = this.anInt4662 * 148446325;
			}
			this.aClass363_5 = Class363.aClass363_3;
			return false;
		}
		if (!this.aBoolean729 && Class363.aClass363_1 != this.aClass363_5) {
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2) + Class1.aString3 + "(100%)", true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		this.aClass363_5 = Class363.aClass363_4;
		if (!this.aBoolean729 && Class510.aClass183_1 != null) {
			Class510.aClass183_1.method23624();
		}
		if (!this.aBoolean729) {
			for (local257 = 0; local257 < 2048; local257++) {
				@Pc(530) Class26_Sub1_Sub1_Sub1_Sub2 local530 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local257];
				if (local530 != null) {
					local530.aClass438_23 = null;
				}
			}
			for (local257 = 0; local257 < client.aClass3_Sub29Array1.length; local257++) {
				@Pc(547) Class3_Sub29 local547 = client.aClass3_Sub29Array1[local257];
				if (local547 != null) {
					((Class26_Sub1) local547.anObject2).aClass438_23 = null;
				}
			}
		}
		if (!this.aBoolean729) {
			Class604.method33534(true);
		}
		if (!this.aBoolean729) {
			Class512.method29595();
		}
		@Pc(570) boolean local570 = false;
		@Pc(578) int local578;
		if (Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2) {
			for (local578 = 0; local578 < this.anInt4671 * 1906038805; local578++) {
				if (this.aByteArrayArray16[local578] != null || this.aByteArrayArray17[local578] != null) {
					local570 = true;
					break;
				}
			}
		}
		local578 = Class60_Sub35.method14625(Class510.aClass3_Sub45_37.aClass60_Sub18_1.method13605()).anInt3697 * -1571722264;
		if (Class613.aClass21_13.method17033()) {
			local578++;
		}
		this.method26976();
		this.method27050();
		this.aClass438_24 = new Class438(Class613.aClass21_13, 9, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local578, local570, Class613.aClass21_13.method17023() > 0);
		this.aClass438_24.method28172(false);
		this.aClass438_24.method28034(client.anInt3044 * -352553545);
		if (client.anInt3044 * -352553545 == 0) {
			this.aClass438_24.method28035(null);
		} else {
			this.aClass438_24.method28035(Class418.aClass14_11);
		}
		this.aClass368_1 = new Class368();
		this.aFloat293 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass50_Sub1_2 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, false, this.aClass346_3, this.aClass479_2);
		this.aClass50_Sub1_2.method9379();
		this.aClass50_Sub1_2.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
		this.aClass50_Sub1_2.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
		this.aClass50_Sub1_2.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
		this.aClass50_Sub1_2.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
		this.aClass50_Sub1_2.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
		if (this.aClass380_2.method27279()) {
			this.method26967(this.aClass50_Sub1_2, this.aByteArrayArray19);
		} else {
			this.method26979(this.aClass50_Sub1_2, this.aByteArrayArray19);
		}
		if (this.aBoolean729) {
			this.method26946(50);
		}
		this.aClass479_2.method28867(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4);
		this.aClass479_2.method28896(this);
		if (local570) {
			this.aClass438_24.method28172(true);
			this.aClass50_Sub1_1 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 1, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, true, this.aClass346_3, this.aClass479_2);
			this.aClass50_Sub1_1.method9379();
			this.aClass50_Sub1_1.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
			this.aClass50_Sub1_1.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
			this.aClass50_Sub1_1.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
			this.aClass50_Sub1_1.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
			this.aClass50_Sub1_1.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
			if (this.aClass380_2.method27279()) {
				this.method26967(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			} else {
				this.method26979(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			}
			this.aClass50_Sub1_1.method9422(0, this.aClass50_Sub1_2.anIntArrayArrayArray14[0]);
			this.aClass50_Sub1_1.method9417(Class613.aClass21_13, null);
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9417(Class613.aClass21_13, local570 ? this.aClass50_Sub1_1.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass380_2.method27279()) {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26984(this.aClass50_Sub1_2, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26983(this.aClass50_Sub1_2, this.aByteArrayArray20);
			if (this.aByteArrayArray18 != null) {
				this.method26985();
			}
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		this.aClass50_Sub1_2.method9388(Class613.aClass21_13, local570 ? this.aClass438_24.aClass17Array2[0] : null, null);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		this.aClass50_Sub1_2.method9458(Class613.aClass21_13, false);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		if (local570) {
			this.aClass438_24.method28172(true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			if (this.aClass380_2.method27279()) {
				this.method26984(this.aClass50_Sub1_1, this.aByteArrayArray16);
			} else {
				this.method26983(this.aClass50_Sub1_1, this.aByteArrayArray16);
			}
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass50_Sub1_1.method9388(Class613.aClass21_13, null, this.aClass438_24.aClass17Array1[0]);
			this.aClass50_Sub1_1.method9458(Class613.aClass21_13, true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9380();
		if (this.aClass50_Sub1_1 != null) {
			this.aClass50_Sub1_1.method9380();
		}
		this.aClass438_24.method28037();
		if (this.aBoolean729) {
			Class176.method23413();
			while (!Class613.aClass21_13.method17104()) {
				this.method26946(1);
			}
		}
		@Pc(1174) boolean local1174 = false;
		if (this.aBoolean729) {
			@Pc(1179) Class370 local1179 = client.aClass370_1;
			this.method27060(local1179);
			Class30_Sub1.aClass379_1.method27255(local1179);
			local1174 = true;
			Class176.method23413();
			@Pc(1195) Object local1195 = client.anObject12;
			synchronized (client.anObject12) {
				client.aBoolean580 = true;
				try {
					client.anObject12.wait();
				} catch (@Pc(1202) InterruptedException local1202) {
				}
			}
			client.aClass370_1 = this;
			local1179.method27050();
			this.method26977(7);
			this.method26975();
		} else {
			Class510.aClass183_1.method23624();
			this.aClass479_2.method28905();
			Class148.method23113();
		}
		@Pc(1247) int local1247;
		for (local300 = 0; local300 < 4; local300++) {
			for (local327 = 0; local327 < this.anInt4663 * -2081755637; local327++) {
				for (local1247 = 0; local1247 < this.anInt4664 * 500879103; local1247++) {
					Class356.method26653(local300, local327, local1247);
				}
			}
		}
		for (local300 = 0; local300 < client.aClass398Array1.length; local300++) {
			if (client.aClass398Array1[local300] != null) {
				client.aClass398Array1[local300].method27530();
			}
		}
		Class43_Sub5.method9508();
		Class276.method25388();
		@Pc(1305) Class3_Sub23 local1305;
		if (Class527.method32424() == Class389.aClass389_3 && client.aClass82_2.method21621() != null && client.anInt3039 * 1115111877 == 7) {
			local1305 = Class269.method25284(Class311.aClass311_10, client.aClass82_2.aClass577_2);
			local1305.aClass3_Sub41_Sub1_1.method20254(1057001181);
			client.aClass82_2.method21601(local1305);
		}
		if (!this.aClass380_2.method27279()) {
			local300 = (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) / 8;
			local327 = ((this.anInt4663 * -2081755637 >> 4) + this.anInt4672 * 774829635) / 8;
			local1247 = (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) / 8;
			@Pc(1375) int local1375 = ((this.anInt4664 * 500879103 >> 4) + this.anInt4673 * -1940676495) / 8;
			for (@Pc(1379) int local1379 = local300 - 1; local1379 <= local327 + 1; local1379++) {
				for (@Pc(1388) int local1388 = local1247 - 1; local1388 <= local1375 + 1; local1388++) {
					if (local1379 < local300 || local1379 > local327 || local1388 < local1247 || local1388 > local1375) {
						Class430.aClass359_74.method26671(this.method26978(local1379, local1388));
					}
				}
			}
		}
		if (client.anInt3039 * 1115111877 == 6) {
			Class166.method23342(2);
		} else if (client.anInt3039 * 1115111877 == 11) {
			Class166.method23342(18);
		} else if (client.anInt3039 * 1115111877 == 12) {
			Class166.method23342(3);
		} else if (client.anInt3039 * 1115111877 == 1) {
			Class166.method23342(16);
		} else {
			Class166.method23342(5);
			if (client.aClass82_2.method21621() != null) {
				local1305 = Class269.method25284(Class311.aClass311_79, client.aClass82_2.aClass577_2);
				client.aClass82_2.method21601(local1305);
			}
		}
		if (this.aBoolean728) {
			Class215.method24289(Long.toString(Class176.method23413() - this.aLong267 * 944198643184077391L));
			this.aBoolean728 = false;
		}
		if (local1174) {
			@Pc(1492) Object local1492 = client.anObject11;
			synchronized (client.anObject11) {
				client.anObject11.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "du", descriptor = "()Z", line = 744)
	public boolean method27063() {
		if (!this.aBoolean729) {
			Class110.method22005(false);
		}
		this.anInt4668 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (!Class430.aClass359_74.method26675(this.anIntArray424[local10])) {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.aClass421_3 == null) {
			if (this.aClass3_Sub1_Sub4_4 == null || !Class579.aClass359_102.method26681(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = new Class421(0);
			} else if (Class579.aClass359_102.method26694(this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements")) {
				this.aClass421_3 = Class191.method24060(Class579.aClass359_102, this.aClass3_Sub1_Sub4_4.aString106 + "_staticelements", client.aBoolean590);
			} else {
				this.anInt4668 += 1492923399;
			}
		}
		if (this.anInt4668 * 1392834999 > 0) {
			if (this.anInt4667 * 578572815 < this.anInt4668 * 1392834999) {
				this.anInt4667 = this.anInt4668 * -972757543;
			}
			this.aClass363_5 = Class363.aClass363_2;
			return false;
		}
		for (local10 = 0; local10 < this.anInt4671 * 1906038805; local10++) {
			if (this.aByteArrayArray19[local10] == null) {
				this.aByteArrayArray19[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_4.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray20[local10] == null) {
				this.aByteArrayArray20[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_7.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray17[local10] == null) {
				this.aByteArrayArray17[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_6.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray16[local10] == null) {
				this.aByteArrayArray16[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_2.anInt4602 * -1178780153);
			}
			if (this.aByteArrayArray18 != null && this.aByteArrayArray18[local10] == null) {
				this.aByteArrayArray18[local10] = Class430.aClass359_74.method26713(this.anIntArray424[local10], Class340.aClass340_3.anInt4602 * -1178780153);
			}
		}
		local10 = this.anInt4662 * -2123074583;
		@Pc(247) Class510 local247 = new Class510(-1);
		@Pc(252) Class510 local252 = new Class510(-1);
		this.anInt4662 = 0;
		@Pc(257) int local257;
		@Pc(300) int local300;
		@Pc(327) int local327;
		for (local257 = 0; local257 < this.anInt4671 * 1906038805; local257++) {
			@Pc(268) byte[] local268 = this.aByteArrayArray20[local257];
			@Pc(285) int local285;
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
			local268 = this.aByteArrayArray16[local257];
			if (local268 != null) {
				local285 = (this.anIntArray425[local257] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				local300 = (this.anIntArray425[local257] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (this.aClass380_2.method27279()) {
					local285 = 10;
					local300 = 10;
				}
				local327 = Class133.method22904(this.aClass457_8, local268, local285, local300, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local252, local247);
				if (local327 > 0) {
					this.anInt4662 += local327 * 869897305;
				}
			}
		}
		if (this.anInt4662 * -2123074583 > 0) {
			if (this.anInt4662 * -2123074583 != local10) {
				this.anInt4670 = client.anInt3034 * 1020923555;
			} else if (this.anInt4670 * 2142901515 != 0 && client.anInt3034 - this.anInt4670 * 2142901515 == 1000) {
				Class107.method21921(local252.anInt5258 * -6824133, local247.anInt5258 * -6824133, this.anInt4662 * -2123074583);
				Class18.method17008();
			}
			if (this.anInt4669 * 1030167333 < this.anInt4662 * -2123074583) {
				this.anInt4669 = this.anInt4662 * 148446325;
			}
			this.aClass363_5 = Class363.aClass363_3;
			return false;
		}
		if (!this.aBoolean729 && Class363.aClass363_1 != this.aClass363_5) {
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2) + Class1.aString3 + "(100%)", true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		this.aClass363_5 = Class363.aClass363_4;
		if (!this.aBoolean729 && Class510.aClass183_1 != null) {
			Class510.aClass183_1.method23624();
		}
		if (!this.aBoolean729) {
			for (local257 = 0; local257 < 2048; local257++) {
				@Pc(530) Class26_Sub1_Sub1_Sub1_Sub2 local530 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local257];
				if (local530 != null) {
					local530.aClass438_23 = null;
				}
			}
			for (local257 = 0; local257 < client.aClass3_Sub29Array1.length; local257++) {
				@Pc(547) Class3_Sub29 local547 = client.aClass3_Sub29Array1[local257];
				if (local547 != null) {
					((Class26_Sub1) local547.anObject2).aClass438_23 = null;
				}
			}
		}
		if (!this.aBoolean729) {
			Class604.method33534(true);
		}
		if (!this.aBoolean729) {
			Class512.method29595();
		}
		@Pc(570) boolean local570 = false;
		@Pc(578) int local578;
		if (Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2) {
			for (local578 = 0; local578 < this.anInt4671 * 1906038805; local578++) {
				if (this.aByteArrayArray16[local578] != null || this.aByteArrayArray17[local578] != null) {
					local570 = true;
					break;
				}
			}
		}
		local578 = Class60_Sub35.method14625(Class510.aClass3_Sub45_37.aClass60_Sub18_1.method13605()).anInt3697 * -1571722264;
		if (Class613.aClass21_13.method17033()) {
			local578++;
		}
		this.method26976();
		this.method27050();
		this.aClass438_24 = new Class438(Class613.aClass21_13, 9, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, local578, local570, Class613.aClass21_13.method17023() > 0);
		this.aClass438_24.method28172(false);
		this.aClass438_24.method28034(client.anInt3044 * -352553545);
		if (client.anInt3044 * -352553545 == 0) {
			this.aClass438_24.method28035(null);
		} else {
			this.aClass438_24.method28035(Class418.aClass14_11);
		}
		this.aClass368_1 = new Class368();
		this.aFloat293 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass50_Sub1_2 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 4, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, false, this.aClass346_3, this.aClass479_2);
		this.aClass50_Sub1_2.method9379();
		this.aClass50_Sub1_2.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
		this.aClass50_Sub1_2.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
		this.aClass50_Sub1_2.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
		this.aClass50_Sub1_2.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
		this.aClass50_Sub1_2.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
		if (this.aClass380_2.method27279()) {
			this.method26967(this.aClass50_Sub1_2, this.aByteArrayArray19);
		} else {
			this.method26979(this.aClass50_Sub1_2, this.aByteArrayArray19);
		}
		if (this.aBoolean729) {
			this.method26946(50);
		}
		this.aClass479_2.method28867(this.anInt4663 * -2081755637 >> 4, this.anInt4664 * 500879103 >> 4);
		this.aClass479_2.method28896(this);
		if (local570) {
			this.aClass438_24.method28172(true);
			this.aClass50_Sub1_1 = new Class50_Sub1(this.aClass438_24, this.aClass457_8, 1, this.anInt4663 * -2081755637, this.anInt4664 * 500879103, true, this.aClass346_3, this.aClass479_2);
			this.aClass50_Sub1_1.method9379();
			this.aClass50_Sub1_1.anInt1068 = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() * -790993319;
			this.aClass50_Sub1_1.aBoolean218 = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2;
			this.aClass50_Sub1_1.aBoolean223 = Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1;
			this.aClass50_Sub1_1.aBoolean217 = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1;
			this.aClass50_Sub1_1.aBoolean219 = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1;
			if (this.aClass380_2.method27279()) {
				this.method26967(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			} else {
				this.method26979(this.aClass50_Sub1_1, this.aByteArrayArray17);
				if (!this.aBoolean729) {
					Class110.method22005(true);
				}
			}
			this.aClass50_Sub1_1.method9422(0, this.aClass50_Sub1_2.anIntArrayArrayArray14[0]);
			this.aClass50_Sub1_1.method9417(Class613.aClass21_13, null);
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9417(Class613.aClass21_13, local570 ? this.aClass50_Sub1_1.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass380_2.method27279()) {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26984(this.aClass50_Sub1_2, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.method26983(this.aClass50_Sub1_2, this.aByteArrayArray20);
			if (this.aByteArrayArray18 != null) {
				this.method26985();
			}
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		this.aClass50_Sub1_2.method9388(Class613.aClass21_13, local570 ? this.aClass438_24.aClass17Array2[0] : null, null);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		this.aClass50_Sub1_2.method9458(Class613.aClass21_13, false);
		if (this.aBoolean729) {
			this.method26946(75);
		}
		if (!this.aBoolean729) {
			Class110.method22005(true);
		}
		if (local570) {
			this.aClass438_24.method28172(true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			if (this.aClass380_2.method27279()) {
				this.method26984(this.aClass50_Sub1_1, this.aByteArrayArray16);
			} else {
				this.method26983(this.aClass50_Sub1_1, this.aByteArrayArray16);
			}
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass50_Sub1_1.method9388(Class613.aClass21_13, null, this.aClass438_24.aClass17Array1[0]);
			this.aClass50_Sub1_1.method9458(Class613.aClass21_13, true);
			if (!this.aBoolean729) {
				Class110.method22005(true);
			}
			this.aClass438_24.method28172(false);
			if (this.aBoolean729) {
				this.method26946(50);
			}
		}
		this.aClass50_Sub1_2.method9380();
		if (this.aClass50_Sub1_1 != null) {
			this.aClass50_Sub1_1.method9380();
		}
		this.aClass438_24.method28037();
		if (this.aBoolean729) {
			Class176.method23413();
			while (!Class613.aClass21_13.method17104()) {
				this.method26946(1);
			}
		}
		@Pc(1174) boolean local1174 = false;
		if (this.aBoolean729) {
			@Pc(1179) Class370 local1179 = client.aClass370_1;
			this.method27060(local1179);
			Class30_Sub1.aClass379_1.method27255(local1179);
			local1174 = true;
			Class176.method23413();
			@Pc(1195) Object local1195 = client.anObject12;
			synchronized (client.anObject12) {
				client.aBoolean580 = true;
				try {
					client.anObject12.wait();
				} catch (@Pc(1202) InterruptedException local1202) {
				}
			}
			client.aClass370_1 = this;
			local1179.method27050();
			this.method26977(7);
			this.method26975();
		} else {
			Class510.aClass183_1.method23624();
			this.aClass479_2.method28905();
			Class148.method23113();
		}
		@Pc(1247) int local1247;
		for (local300 = 0; local300 < 4; local300++) {
			for (local327 = 0; local327 < this.anInt4663 * -2081755637; local327++) {
				for (local1247 = 0; local1247 < this.anInt4664 * 500879103; local1247++) {
					Class356.method26653(local300, local327, local1247);
				}
			}
		}
		for (local300 = 0; local300 < client.aClass398Array1.length; local300++) {
			if (client.aClass398Array1[local300] != null) {
				client.aClass398Array1[local300].method27530();
			}
		}
		Class43_Sub5.method9508();
		Class276.method25388();
		@Pc(1305) Class3_Sub23 local1305;
		if (Class527.method32424() == Class389.aClass389_3 && client.aClass82_2.method21621() != null && client.anInt3039 * 1115111877 == 7) {
			local1305 = Class269.method25284(Class311.aClass311_10, client.aClass82_2.aClass577_2);
			local1305.aClass3_Sub41_Sub1_1.method20254(1057001181);
			client.aClass82_2.method21601(local1305);
		}
		if (!this.aClass380_2.method27279()) {
			local300 = (this.anInt4672 * 774829635 - (this.anInt4663 * -2081755637 >> 4)) / 8;
			local327 = ((this.anInt4663 * -2081755637 >> 4) + this.anInt4672 * 774829635) / 8;
			local1247 = (this.anInt4673 * -1940676495 - (this.anInt4664 * 500879103 >> 4)) / 8;
			@Pc(1375) int local1375 = ((this.anInt4664 * 500879103 >> 4) + this.anInt4673 * -1940676495) / 8;
			for (@Pc(1379) int local1379 = local300 - 1; local1379 <= local327 + 1; local1379++) {
				for (@Pc(1388) int local1388 = local1247 - 1; local1388 <= local1375 + 1; local1388++) {
					if (local1379 < local300 || local1379 > local327 || local1388 < local1247 || local1388 > local1375) {
						Class430.aClass359_74.method26671(this.method26978(local1379, local1388));
					}
				}
			}
		}
		if (client.anInt3039 * 1115111877 == 6) {
			Class166.method23342(2);
		} else if (client.anInt3039 * 1115111877 == 11) {
			Class166.method23342(18);
		} else if (client.anInt3039 * 1115111877 == 12) {
			Class166.method23342(3);
		} else if (client.anInt3039 * 1115111877 == 1) {
			Class166.method23342(16);
		} else {
			Class166.method23342(5);
			if (client.aClass82_2.method21621() != null) {
				local1305 = Class269.method25284(Class311.aClass311_79, client.aClass82_2.aClass577_2);
				client.aClass82_2.method21601(local1305);
			}
		}
		if (this.aBoolean728) {
			Class215.method24289(Long.toString(Class176.method23413() - this.aLong267 * 944198643184077391L));
			this.aBoolean728 = false;
		}
		if (local1174) {
			@Pc(1492) Object local1492 = client.anObject11;
			synchronized (client.anObject11) {
				client.anObject11.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "au", descriptor = "(II)V", line = 1004)
	void method26946(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!om", name = "do", descriptor = "(I)V", line = 1004)
	void method27064(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!om", name = "ay", descriptor = "(Lclient!aeu;[[BI)V", line = 1010)
	void method26979(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class3_Sub41 local18 = new Class3_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray425[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray425[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(52) int local52 = local32 * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9383(local18, local42, local52, this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441);
				arg0.method9449(Class613.aClass21_13, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray425[local4] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
			@Pc(121) int local121 = (this.anIntArray425[local4] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt4673 * -1940676495 < 800) {
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9385(local106, local121, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "di", descriptor = "(Lclient!aeu;[[B)V", line = 1010)
	void method27065(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class3_Sub41 local18 = new Class3_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray425[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray425[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(52) int local52 = local32 * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9383(local18, local42, local52, this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441);
				arg0.method9449(Class613.aClass21_13, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray425[local4] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
			@Pc(121) int local121 = (this.anIntArray425[local4] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt4673 * -1940676495 < 800) {
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9385(local106, local121, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "dn", descriptor = "(Lclient!aeu;[[B)V", line = 1010)
	void method27066(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class3_Sub41 local18 = new Class3_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray425[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray425[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(52) int local52 = local32 * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9383(local18, local42, local52, this.aClass464_2.anInt5071 * -1567811631, this.aClass464_2.anInt5073 * 1360175441);
				arg0.method9449(Class613.aClass21_13, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(106) int local106 = (this.anIntArray425[local4] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
			@Pc(121) int local121 = (this.anIntArray425[local4] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
			@Pc(125) byte[] local125 = arg1[local4];
			if (local125 == null && this.anInt4673 * -1940676495 < 800) {
				if (!this.aBoolean729 && Class510.aClass183_1 != null) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9385(local106, local121, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ag", descriptor = "(Lclient!aeu;[[BB)V", line = 1036)
	void method26967(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean220 || local51 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < this.anIntArray425.length; local87++) {
								if (local85 == this.anIntArray425[local87] && arg1[local87] != null) {
									@Pc(109) Class3_Sub41 local109 = new Class3_Sub41(arg1[local87]);
									arg0.method9384(local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									arg0.method9450(Class613.aClass21_13, local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method9381(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ee", descriptor = "(Lclient!aeu;[[B)V", line = 1036)
	void method27067(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean220 || local51 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < this.anIntArray425.length; local87++) {
								if (local85 == this.anIntArray425[local87] && arg1[local87] != null) {
									@Pc(109) Class3_Sub41 local109 = new Class3_Sub41(arg1[local87]);
									arg0.method9384(local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									arg0.method9450(Class613.aClass21_13, local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method9381(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ex", descriptor = "(Lclient!aeu;[[B)V", line = 1036)
	void method27068(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean220 || local51 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < this.anIntArray425.length; local87++) {
								if (local85 == this.anIntArray425[local87] && arg1[local87] != null) {
									@Pc(109) Class3_Sub41 local109 = new Class3_Sub41(arg1[local87]);
									arg0.method9384(local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									arg0.method9450(Class613.aClass21_13, local109, local1, local15 * 8, local25 * 8, local51, local69, local75, local63);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method9381(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ey", descriptor = "(Lclient!aeu;[[B)V", line = 1075)
	void method26961(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "am", descriptor = "(Lclient!aeu;[[BI)V", line = 1075)
	void method26983(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "(Lclient!aeu;[[B)V", line = 1075)
	void method27001(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ef", descriptor = "(Lclient!aeu;[[B)V", line = 1075)
	void method27070(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "er", descriptor = "(Lclient!aeu;[[B)V", line = 1075)
	void method27072(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ej", descriptor = "(Lclient!aeu;[[B)V", line = 1075)
	void method27073(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4671 * 1906038805; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(28) int local28 = (this.anIntArray425[local1] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631;
				@Pc(43) int local43 = (this.anIntArray425[local1] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441;
				if (!this.aBoolean729) {
					Class510.aClass183_1.method23624();
				}
				arg0.method9451(Class613.aClass21_13, local11, local28, local43);
				if (this.aBoolean729) {
					this.method26946(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ar", descriptor = "(Lclient!aeu;[[BS)V", line = 1088)
	void method26984(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean220 || local51 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = (local69 / 8 << 8) + local75 / 8;
							for (@Pc(87) int local87 = 0; local87 < this.anIntArray425.length; local87++) {
								if (local85 == this.anIntArray425[local87] && arg1[local87] != null) {
									arg0.method9452(Class613.aClass21_13, arg1[local87], local1, local15 * 8, local25 * 8, local51, (local69 & 0x7) * 8, (local75 & 0x7) * 8, local63);
									break;
								}
							}
						}
					}
					if (this.aBoolean729) {
						this.method26946(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "en", descriptor = "(Lclient!aeu;[[B)V", line = 1088)
	void method27074(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1074 * 1789717465; local1++) {
			if (!this.aBoolean729) {
				Class510.aClass183_1.method23624();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt4663 * -2081755637 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt4664 * 500879103 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean220 || local51 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = (local69 / 8 << 8) + local75 / 8;
							for (@Pc(87) int local87 = 0; local87 < this.anIntArray425.length; local87++) {
								if (local85 == this.anIntArray425[local87] && arg1[local87] != null) {
									arg0.method9452(Class613.aClass21_13, arg1[local87], local1, local15 * 8, local25 * 8, local51, (local69 & 0x7) * 8, (local75 & 0x7) * 8, local63);
									break;
								}
							}
						}
					}
					if (this.aBoolean729) {
						this.method26946(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ew", descriptor = "()V", line = 1115)
	void method26972() {
		@Pc(3) int local3 = this.aByteArrayArray18.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray18[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3048 * -1744690683; local19++) {
					if (this.anIntArray425[local5] == client.anIntArray308[local19]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray308[client.anInt3048 * -1744690683] = this.anIntArray425[local5];
					local17 = (client.anInt3048 += 1947294413) * -1744690683 - 1;
				}
				@Pc(67) Class3_Sub41 local67 = new Class3_Sub41(this.aByteArrayArray18[local5]);
				@Pc(69) int local69 = 0;
				while (local67.anInt2803 * 62066237 < this.aByteArrayArray18[local5].length && local69 < 511 && client.anInt3163 * 1758488217 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.method20271();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray425[local5] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631 + local109;
					@Pc(147) int local147 = (this.anIntArray425[local5] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441 + local113;
					@Pc(154) Class571 local154 = Class498.aClass579_1.method33185(local67.method20271());
					@Pc(160) Class3_Sub29 local160 = (Class3_Sub29) client.aClass581_21.method33217((long) local95);
					if (local160 == null && (local154.aByte179 & 0x1) > 0 && local130 >= 0 && local154.anInt5389 * 2130228951 + local130 < this.anInt4663 * -2081755637 && local147 >= 0 && local154.anInt5389 * 2130228951 + local147 < this.anInt4664 * 500879103) {
						@Pc(200) Class26_Sub1_Sub1_Sub1_Sub1 local200 = new Class26_Sub1_Sub1_Sub1_Sub1(this.aClass438_24);
						local200.anInt2355 = local95 * -400995907;
						@Pc(210) Class3_Sub29 local210 = new Class3_Sub29(local200);
						client.aClass581_21.method33241(local210, (long) local95);
						client.aClass3_Sub29Array1[(client.anInt3054 += -1735952035) * -453205259 - 1] = local210;
						client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local95;
						local200.anInt2378 = client.anInt3034 * -427149901;
						local200.method15495(local154);
						local200.method16644(local200.aClass571_1.anInt5389 * 2130228951);
						local200.anInt2358 = (local200.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
						local200.method16634(local200.aClass571_1.aClass532_9.method32498().method33765() << 11 & 0x3FFF, true);
						local200.method15509(local103, local130, local147, true, local200.method16630());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "ae", descriptor = "(I)V", line = 1115)
	void method26985() {
		@Pc(3) int local3 = this.aByteArrayArray18.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray18[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3048 * -1744690683; local19++) {
					if (this.anIntArray425[local5] == client.anIntArray308[local19]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray308[client.anInt3048 * -1744690683] = this.anIntArray425[local5];
					local17 = (client.anInt3048 += 1947294413) * -1744690683 - 1;
				}
				@Pc(67) Class3_Sub41 local67 = new Class3_Sub41(this.aByteArrayArray18[local5]);
				@Pc(69) int local69 = 0;
				while (local67.anInt2803 * 62066237 < this.aByteArrayArray18[local5].length && local69 < 511 && client.anInt3163 * 1758488217 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.method20271();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray425[local5] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631 + local109;
					@Pc(147) int local147 = (this.anIntArray425[local5] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441 + local113;
					@Pc(154) Class571 local154 = Class498.aClass579_1.method33185(local67.method20271());
					@Pc(160) Class3_Sub29 local160 = (Class3_Sub29) client.aClass581_21.method33217((long) local95);
					if (local160 == null && (local154.aByte179 & 0x1) > 0 && local130 >= 0 && local154.anInt5389 * 2130228951 + local130 < this.anInt4663 * -2081755637 && local147 >= 0 && local154.anInt5389 * 2130228951 + local147 < this.anInt4664 * 500879103) {
						@Pc(200) Class26_Sub1_Sub1_Sub1_Sub1 local200 = new Class26_Sub1_Sub1_Sub1_Sub1(this.aClass438_24);
						local200.anInt2355 = local95 * -400995907;
						@Pc(210) Class3_Sub29 local210 = new Class3_Sub29(local200);
						client.aClass581_21.method33241(local210, (long) local95);
						client.aClass3_Sub29Array1[(client.anInt3054 += -1735952035) * -453205259 - 1] = local210;
						client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local95;
						local200.anInt2378 = client.anInt3034 * -427149901;
						local200.method15495(local154);
						local200.method16644(local200.aClass571_1.anInt5389 * 2130228951);
						local200.anInt2358 = (local200.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
						local200.method16634(local200.aClass571_1.aClass532_9.method32498().method33765() << 11 & 0x3FFF, true);
						local200.method15509(local103, local130, local147, true, local200.method16630());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "em", descriptor = "()V", line = 1115)
	void method27041() {
		@Pc(3) int local3 = this.aByteArrayArray18.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray18[local5] != null) {
				@Pc(17) int local17 = -1;
				for (@Pc(19) int local19 = 0; local19 < client.anInt3048 * -1744690683; local19++) {
					if (this.anIntArray425[local5] == client.anIntArray308[local19]) {
						local17 = local19;
						break;
					}
				}
				if (local17 == -1) {
					client.anIntArray308[client.anInt3048 * -1744690683] = this.anIntArray425[local5];
					local17 = (client.anInt3048 += 1947294413) * -1744690683 - 1;
				}
				@Pc(67) Class3_Sub41 local67 = new Class3_Sub41(this.aByteArrayArray18[local5]);
				@Pc(69) int local69 = 0;
				while (local67.anInt2803 * 62066237 < this.aByteArrayArray18[local5].length && local69 < 511 && client.anInt3163 * 1758488217 < 1023) {
					@Pc(95) int local95 = local17 | local69++ << 6;
					@Pc(99) int local99 = local67.method20271();
					@Pc(103) int local103 = local99 >> 14;
					@Pc(109) int local109 = local99 >> 7 & 0x3F;
					@Pc(113) int local113 = local99 & 0x3F;
					@Pc(130) int local130 = (this.anIntArray425[local5] >> 8) * 64 - this.aClass464_2.anInt5071 * -1567811631 + local109;
					@Pc(147) int local147 = (this.anIntArray425[local5] & 0xFF) * 64 - this.aClass464_2.anInt5073 * 1360175441 + local113;
					@Pc(154) Class571 local154 = Class498.aClass579_1.method33185(local67.method20271());
					@Pc(160) Class3_Sub29 local160 = (Class3_Sub29) client.aClass581_21.method33217((long) local95);
					if (local160 == null && (local154.aByte179 & 0x1) > 0 && local130 >= 0 && local154.anInt5389 * 2130228951 + local130 < this.anInt4663 * -2081755637 && local147 >= 0 && local154.anInt5389 * 2130228951 + local147 < this.anInt4664 * 500879103) {
						@Pc(200) Class26_Sub1_Sub1_Sub1_Sub1 local200 = new Class26_Sub1_Sub1_Sub1_Sub1(this.aClass438_24);
						local200.anInt2355 = local95 * -400995907;
						@Pc(210) Class3_Sub29 local210 = new Class3_Sub29(local200);
						client.aClass581_21.method33241(local210, (long) local95);
						client.aClass3_Sub29Array1[(client.anInt3054 += -1735952035) * -453205259 - 1] = local210;
						client.anIntArray303[(client.anInt3163 += -914715223) * 1758488217 - 1] = local95;
						local200.anInt2378 = client.anInt3034 * -427149901;
						local200.method15495(local154);
						local200.method16644(local200.aClass571_1.anInt5389 * 2130228951);
						local200.anInt2358 = (local200.aClass571_1.anInt5393 * 361716413 << 3) * -493317635;
						local200.method16634(local200.aClass571_1.aClass532_9.method32498().method33765() << 11 & 0x3FFF, true);
						local200.method15509(local103, local130, local147, true, local200.method16630());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "dg", descriptor = "(Lclient!vs;I)V", line = 4621)
	static final void method27077(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class381.method27303(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!om", name = "kw", descriptor = "(Lclient!fo;I[B[BLclient!vs;I)V", line = 5883)
	static final void method27078(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class536 arg4) {
		if (arg0.aByteArrayArray12 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.aByteArrayArray12 = new byte[11][];
			arg0.aByteArrayArray13 = new byte[11][];
			arg0.anIntArray364 = new int[11];
			arg0.anIntArray361 = new int[11];
			arg0.anIntArray362 = new int[11];
		}
		arg0.aByteArrayArray12[arg1] = arg2;
		if (arg2 == null) {
			arg0.aBoolean639 = false;
			for (@Pc(45) int local45 = 0; local45 < arg0.aByteArrayArray12.length; local45++) {
				if (arg0.aByteArrayArray12[local45] != null || arg0.anIntArray362[local45] > 0) {
					arg0.aBoolean639 = true;
					break;
				}
			}
		} else {
			arg0.aBoolean639 = true;
		}
		arg0.aByteArrayArray13[arg1] = arg3;
	}

	@OriginalMember(owner = "client!om", name = "ke", descriptor = "(Lclient!vs;I)V", line = 5987)
	static final void method27079(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class419.method27838(local16, arg0);
	}

	@OriginalMember(owner = "client!om", name = "aof", descriptor = "(Lclient!vs;B)V", line = 11555)
	static final void method27080(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub5_1.method12923() == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!om", name = "apm", descriptor = "(Lclient!vs;I)V", line = 11659)
	static final void method27081(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub18_1.method13605();
	}
}
