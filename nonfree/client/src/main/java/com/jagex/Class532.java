package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public class Class532 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!rc;")
	Class526 aClass526_9;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "Lclient!rc;")
	Class526 aClass526_10;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!ib;")
	Class332 aClass332_7;

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
	int anInt5237;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "Lclient!aih;")
	Class142_Sub1 aClass142_Sub1_1;

	@OriginalMember(owner = "client!rl", name = "am", descriptor = "[[B")
	byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Lclient!rg;")
	Class529 aClass529_5;

	@OriginalMember(owner = "client!rl", name = "aj", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	int anInt5239;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "Lclient!tx;")
	Class585 aClass585_24;

	@OriginalMember(owner = "client!rl", name = "ar", descriptor = "[[B")
	byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Lclient!qx;")
	Class520 aClass520_3;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Lclient!aih;")
	Class142_Sub1 aClass142_Sub1_2;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
	int anInt5240;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!asy;")
	Class93_Sub1_Sub20 aClass93_Sub1_Sub20_3;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "F")
	float aFloat323;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_9;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "[[I")
	int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[[I")
	int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
	int anInt5241;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	int anInt5242;

	@OriginalMember(owner = "client!rl", name = "ac", descriptor = "I")
	int anInt5247;

	@OriginalMember(owner = "client!rl", name = "as", descriptor = "[I")
	int[] anIntArray462;

	@OriginalMember(owner = "client!rl", name = "at", descriptor = "[[B")
	byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rl", name = "ad", descriptor = "[[B")
	byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rl", name = "aw", descriptor = "[I")
	int[] anIntArray463;

	@OriginalMember(owner = "client!rl", name = "au", descriptor = "[[B")
	byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!rl", name = "ax", descriptor = "J")
	public long aLong286;

	@OriginalMember(owner = "client!rl", name = "ap", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Lclient!tw;")
	Class584 aClass584_3;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	int anInt5249;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Lclient!xu;")
	Class671 aClass671_2;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ve;")
	Class611 aClass611_1 = new Class611();

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "Lclient!ve;")
	Class611 aClass611_2 = new Class611();

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!re;")
	Class528 aClass528_1 = new Class528(0, 0, 0, 0);

	@OriginalMember(owner = "client!rl", name = "ae", descriptor = "I")
	int anInt5243 = 0;

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
	int anInt5244 = 361014157;

	@OriginalMember(owner = "client!rl", name = "ah", descriptor = "I")
	int anInt5245 = 0;

	@OriginalMember(owner = "client!rl", name = "al", descriptor = "I")
	int anInt5246 = -2002956361;

	@OriginalMember(owner = "client!rl", name = "ai", descriptor = "I")
	int anInt5248 = 0;

	@OriginalMember(owner = "client!rl", name = "aq", descriptor = "Z")
	public boolean aBoolean790 = false;

	@OriginalMember(owner = "client!rl", name = "av", descriptor = "J")
	public long aLong287 = -1529257764138147785L;

	@OriginalMember(owner = "client!rl", name = "ao", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap10 = new HashMap();

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Z")
	boolean aBoolean789;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(Lclient!yf;I)V", line = 96)
	static void method30596(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) TwitchWebcamDevice local16 = Class108_Sub1.method5224(local12);
		if (local16 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.m * -1015277237;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.e;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local16.n;
		}
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Z)V", line = 107)
	public Class532(@OriginalArg(0) boolean arg0) {
		this.aBoolean789 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "bf", descriptor = "()Lclient!rc;", line = 112)
	public Class526 method30490() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ak", descriptor = "()Lclient!rc;", line = 112)
	public Class526 method30496() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "af", descriptor = "()Lclient!rc;", line = 112)
	public Class526 method30498() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "an", descriptor = "()Lclient!rc;", line = 112)
	public Class526 method30525() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Lclient!rc;", line = 112)
	public Class526 method30544() {
		return this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)Lclient!rg;", line = 116)
	public Class529 method30440() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "bl", descriptor = "()Lclient!rg;", line = 116)
	public Class529 method30467() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "bk", descriptor = "()Lclient!rg;", line = 116)
	public Class529 method30488() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "bh", descriptor = "()Lclient!rg;", line = 116)
	public Class529 method30493() {
		return this.aClass529_5;
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)I", line = 120)
	public int method30441() {
		return 100 - this.anInt5243 * 2095779732 / (this.anInt5244 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "bx", descriptor = "()I", line = 120)
	public int method30494() {
		return 100 - this.anInt5243 * 2095779732 / (this.anInt5244 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "bd", descriptor = "()I", line = 120)
	public int method30495() {
		return 100 - this.anInt5243 * 2095779732 / (this.anInt5244 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "bc", descriptor = "()I", line = 120)
	public int method30531() {
		return 100 - this.anInt5243 * 2095779732 / (this.anInt5244 * -1508419771);
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)I", line = 124)
	public int method30442() {
		return 100 - this.anInt5245 * 1283548468 / (this.anInt5246 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "bi", descriptor = "()I", line = 124)
	public int method30497() {
		return 100 - this.anInt5245 * 1283548468 / (this.anInt5246 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "bn", descriptor = "()I", line = 124)
	public int method30594() {
		return 100 - this.anInt5245 * 1283548468 / (this.anInt5246 * 1069530631);
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)Lclient!ve;", line = 128)
	public Class611 method30443() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bt", descriptor = "()Lclient!ve;", line = 128)
	public Class611 method30499() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bq", descriptor = "()Lclient!ve;", line = 128)
	public Class611 method30500() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "bm", descriptor = "()Lclient!ve;", line = 128)
	public Class611 method30501() {
		return this.aClass611_1;
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)I", line = 132)
	public int method30444() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "()I", line = 132)
	public int method30502() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "be", descriptor = "()I", line = 132)
	public int method30503() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "by", descriptor = "()I", line = 132)
	public int method30504() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bu", descriptor = "()I", line = 132)
	public int method30505() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bw", descriptor = "()I", line = 132)
	public int method30506() {
		return this.anInt5239 * -1096901053;
	}

	@OriginalMember(owner = "client!rl", name = "bo", descriptor = "()I", line = 136)
	public int method30464() {
		return this.anInt5242 * -2134504113;
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(S)I", line = 136)
	public int method30474() {
		return this.anInt5242 * -2134504113;
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)Lclient!tw;", line = 140)
	public Class584 method30587() {
		return this.aClass584_3;
	}

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "(B)Lclient!re;", line = 144)
	public Class528 method30438() {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "bz", descriptor = "()Lclient!re;", line = 144)
	public Class528 method30508() {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "bv", descriptor = "()Lclient!re;", line = 144)
	public Class528 method30541() {
		return this.aClass528_1;
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)F", line = 148)
	public float method30448() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!rl", name = "bg", descriptor = "()F", line = 148)
	public float method30471() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!rl", name = "br", descriptor = "()F", line = 148)
	public float method30480() {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I", line = 152)
	public int method30476() {
		return this.anInt5241 * -1297647513;
	}

	@OriginalMember(owner = "client!rl", name = "ba", descriptor = "()I", line = 152)
	public int method30512() {
		return this.anInt5241 * -1297647513;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I", line = 156)
	public int method30450() {
		return this.anInt5240 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "bp", descriptor = "()I", line = 156)
	public int method30513() {
		return this.anInt5240 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "bj", descriptor = "()I", line = 156)
	public int method30514() {
		return this.anInt5240 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "bs", descriptor = "()I", line = 156)
	public int method30515() {
		return this.anInt5240 * 1583050319;
	}

	@OriginalMember(owner = "client!rl", name = "cg", descriptor = "()Lclient!tx;", line = 160)
	public Class585 method30457() {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)Lclient!tx;", line = 160)
	public Class585 method30459() {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "cl", descriptor = "()Lclient!tx;", line = 160)
	public Class585 method30516() {
		return this.aClass585_24;
	}

	@OriginalMember(owner = "client!rl", name = "cu", descriptor = "(I)[[B", line = 164)
	public byte[][] method30451(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "(II)[[B", line = 164)
	public byte[][] method30452(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "ci", descriptor = "(I)[[B", line = 164)
	public byte[][] method30517(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "ce", descriptor = "(I)[[B", line = 164)
	public byte[][] method30518(@OriginalArg(0) int arg0) {
		return this.aClass142_Sub1_1 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5 == null || this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0] == null ? (byte[][]) null : this.aClass142_Sub1_1.aByteArrayArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)Lclient!qx;", line = 169)
	public Class520 method30509() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "cn", descriptor = "()Lclient!qx;", line = 169)
	public Class520 method30521() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "ca", descriptor = "()Lclient!qx;", line = 169)
	public Class520 method30524() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "cv", descriptor = "()Lclient!qx;", line = 169)
	public Class520 method30573() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "cp", descriptor = "()Lclient!qx;", line = 169)
	public Class520 method30591() {
		return this.aClass520_3;
	}

	@OriginalMember(owner = "client!rl", name = "ct", descriptor = "()Lclient!xu;", line = 173)
	public Class671 method30523() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "cw", descriptor = "()Lclient!xu;", line = 173)
	public Class671 method30526() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "(B)Lclient!xu;", line = 173)
	public Class671 method30532() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "cx", descriptor = "()Lclient!xu;", line = 173)
	public Class671 method30576() {
		return this.aClass671_2;
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)Lclient!aop;", line = 177)
	public Class32_Sub14 method30466() {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "cf", descriptor = "()Lclient!aop;", line = 177)
	public Class32_Sub14 method30528() {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "co", descriptor = "()Lclient!aop;", line = 177)
	public Class32_Sub14 method30529() {
		return this.aClass32_Sub14_9;
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)[[I", line = 181)
	public int[][] method30456() {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rl", name = "cr", descriptor = "()[[I", line = 181)
	public int[][] method30530() {
		return this.anIntArrayArray60;
	}

	@OriginalMember(owner = "client!rl", name = "cq", descriptor = "()[[I", line = 185)
	public int[][] method30477() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(B)[[I", line = 185)
	public int[][] method30574() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rl", name = "cm", descriptor = "()[[I", line = 185)
	public int[][] method30595() {
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)[[[B", line = 189)
	public byte[][][] method30458() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "ch", descriptor = "()[[[B", line = 189)
	public byte[][][] method30533() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "cs", descriptor = "()[[[B", line = 189)
	public byte[][][] method30535() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "()[[[B", line = 189)
	public byte[][][] method30578() {
		return this.aByteArrayArrayArray13;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "([[[BI)V", line = 193)
	public void method30491(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "cc", descriptor = "([[[B)V", line = 193)
	public void method30537(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "cy", descriptor = "([[[B)V", line = 193)
	public void method30542(@OriginalArg(0) byte[][][] arg0) {
		this.aByteArrayArrayArray13 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lclient!aih;", line = 197)
	public Class142_Sub1 method30460() {
		return this.aClass142_Sub1_1;
	}

	@OriginalMember(owner = "client!rl", name = "cz", descriptor = "()Lclient!aih;", line = 197)
	public Class142_Sub1 method30538() {
		return this.aClass142_Sub1_1;
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(Lclient!aop;I)V", line = 201)
	public void method30449(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "ck", descriptor = "(Lclient!aop;)V", line = 201)
	public void method30455(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "cj", descriptor = "(Lclient!aop;)V", line = 201)
	public void method30510(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass32_Sub14_9 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V", line = 205)
	public void method30462() {
		this.aClass611_1 = new Class611();
		this.anInt5249 = 0;
		this.anInt5237 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "cd", descriptor = "()V", line = 205)
	public void method30539() {
		this.aClass611_1 = new Class611();
		this.anInt5249 = 0;
		this.anInt5237 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)V", line = 211)
	public void method30463() {
		if (this.aClass585_24 != null) {
			Class54.method14857();
			this.aHashMap10 = this.aClass585_24.method31462();
			this.aClass585_24.aClass569_2.method31300();
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "dd", descriptor = "()V", line = 211)
	public void method30519() {
		if (this.aClass585_24 != null) {
			Class54.method14857();
			this.aHashMap10 = this.aClass585_24.method31462();
			this.aClass585_24.aClass569_2.method31300();
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V", line = 220)
	public void method30445() {
		this.aClass529_5 = Class529.aClass529_3;
		this.anInt5243 = 0;
		this.anInt5244 = 361014157;
		this.anInt5245 = 0;
		this.anInt5246 = -2002956361;
		this.anInt5247 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "dr", descriptor = "()V", line = 220)
	public void method30543() {
		this.aClass529_5 = Class529.aClass529_3;
		this.anInt5243 = 0;
		this.anInt5244 = 361014157;
		this.anInt5245 = 0;
		this.anInt5246 = -2002956361;
		this.anInt5247 = 0;
	}

	@OriginalMember(owner = "client!rl", name = "ae", descriptor = "(ZI)V", line = 229)
	public void method30453(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class684 local1 = null;
		if (this.aClass671_2 != null && arg0) {
			local1 = this.aClass671_2.method32965();
		}
		this.aClass671_2 = new Class671(Class694.aClass104_14, Class110_Sub7.aClass497_22, this.anInt5239 * -1096901053 >> 3, this.anInt5242 * -2134504113 >> 3);
		if (local1 != null) {
			this.aClass671_2.method32964(this, local1, 0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "da", descriptor = "(Z)V", line = 229)
	public void method30522(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class684 local1 = null;
		if (this.aClass671_2 != null && arg0) {
			local1 = this.aClass671_2.method32965();
		}
		this.aClass671_2 = new Class671(Class694.aClass104_14, Class110_Sub7.aClass497_22, this.anInt5239 * -1096901053 >> 3, this.anInt5242 * -2134504113 >> 3);
		if (local1 != null) {
			this.aClass671_2.method32964(this, local1, 0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "(I)V", line = 236)
	public void method30446() {
		this.aClass671_2.method32964(this, null, 0);
	}

	@OriginalMember(owner = "client!rl", name = "dt", descriptor = "()V", line = 240)
	public void method30470() {
		this.anInt5241 = 1662753784;
		if (this.anInt5239 * -1096901053 == 0) {
			this.anInt5240 = -1072245262;
		} else {
			this.anInt5240 = (int) ((double) (this.anInt5239 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5240 = (this.anInt5240 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20429()) {
			this.anInt5240 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "ah", descriptor = "(B)V", line = 240)
	public void method30536() {
		this.anInt5241 = 1662753784;
		if (this.anInt5239 * -1096901053 == 0) {
			this.anInt5240 = -1072245262;
		} else {
			this.anInt5240 = (int) ((double) (this.anInt5239 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5240 = (this.anInt5240 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20429()) {
			this.anInt5240 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "do", descriptor = "()V", line = 240)
	public void method30546() {
		this.anInt5241 = 1662753784;
		if (this.anInt5239 * -1096901053 == 0) {
			this.anInt5240 = -1072245262;
		} else {
			this.anInt5240 = (int) ((double) (this.anInt5239 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5240 = (this.anInt5240 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20429()) {
			this.anInt5240 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "dz", descriptor = "()V", line = 240)
	public void method30547() {
		this.anInt5241 = 1662753784;
		if (this.anInt5239 * -1096901053 == 0) {
			this.anInt5240 = -1072245262;
		} else {
			this.anInt5240 = (int) ((double) (this.anInt5239 * -1096901053) * 34.46D) * 167307439;
		}
		this.anInt5240 = (this.anInt5240 * 1583050319 << 2) * 167307439;
		if (Class694.aClass104_14.method20429()) {
			this.anInt5240 += -237937152;
		}
	}

	@OriginalMember(owner = "client!rl", name = "al", descriptor = "(Lclient!rl;I)V", line = 248)
	void method30468(@OriginalArg(0) Class532 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean789;
		arg0.aBoolean789 = this.aBoolean789;
		this.aBoolean789 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method32976(arg0.method30532());
	}

	@OriginalMember(owner = "client!rl", name = "dv", descriptor = "(Lclient!rl;)V", line = 248)
	void method30548(@OriginalArg(0) Class532 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean789;
		arg0.aBoolean789 = this.aBoolean789;
		this.aBoolean789 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method32976(arg0.method30532());
	}

	@OriginalMember(owner = "client!rl", name = "dm", descriptor = "(Lclient!rl;)V", line = 248)
	void method30549(@OriginalArg(0) Class532 arg0) {
		@Pc(2) boolean local2 = arg0.aBoolean789;
		arg0.aBoolean789 = this.aBoolean789;
		this.aBoolean789 = local2;
		@Pc(12) Class526 local12 = arg0.aClass526_10;
		arg0.aClass526_10 = this.aClass526_10;
		this.aClass526_10 = local12;
		arg0.aClass611_2 = this.aClass611_1;
		this.aClass611_2 = arg0.aClass611_1;
		this.aClass671_2.method32976(arg0.method30532());
	}

	@OriginalMember(owner = "client!rl", name = "dn", descriptor = "()V", line = 260)
	public void method30447() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ac", descriptor = "(B)V", line = 260)
	public void method30469() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "di", descriptor = "()V", line = 260)
	public void method30473() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dq", descriptor = "()V", line = 260)
	public void method30550() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dc", descriptor = "()V", line = 260)
	public void method30551() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dk", descriptor = "()V", line = 260)
	public void method30553() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "df", descriptor = "()V", line = 260)
	public void method30555() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "dw", descriptor = "()V", line = 260)
	public void method30556() {
		if (this.aBoolean789) {
			this.method30445();
			this.aLong287 = -1529257764138147785L;
			@Pc(10) Class532 local10 = client.aClass532_1;
			this.anInt5248 = local10.anInt5248;
			this.anIntArray463 = local10.anIntArray463;
			this.anIntArray462 = local10.anIntArray462;
			this.aByteArrayArray19 = local10.aByteArrayArray19;
			this.aByteArrayArray20 = local10.aByteArrayArray20;
			this.aByteArrayArray17 = local10.aByteArrayArray17;
			this.aByteArrayArray21 = local10.aByteArrayArray21;
			this.aByteArrayArray18 = local10.aByteArrayArray18;
			this.aClass520_3 = local10.aClass520_3;
			this.aClass671_2 = local10.aClass671_2;
			this.anIntArrayArrayArray16 = local10.anIntArrayArrayArray16;
			this.anInt5241 = local10.anInt5241;
			this.anInt5240 = local10.anInt5240;
			this.aClass93_Sub1_Sub20_3 = local10.aClass93_Sub1_Sub20_3;
			this.aClass584_3 = local10.aClass584_3;
			this.anIntArrayArray60 = local10.anIntArrayArray60;
			this.anIntArrayArray61 = local10.anIntArrayArray61;
			this.aByteArrayArrayArray13 = local10.aByteArrayArrayArray13;
			this.aClass526_9 = local10.aClass526_9;
			this.aClass332_7 = local10.aClass332_7;
			this.aClass611_1 = local10.aClass611_1;
			this.aClass611_2 = local10.aClass611_2;
			this.anInt5237 = local10.anInt5237;
			this.anInt5249 = local10.anInt5249;
			this.anInt5239 = local10.anInt5239;
			this.anInt5242 = local10.anInt5242;
		} else if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ai", descriptor = "(Lclient!rt;I)V", line = 301)
	public void method30465(@OriginalArg(0) Class537 arg0) {
		this.aClass526_9 = arg0.aClass526_11;
		if (this.aClass526_9 == Class526.aClass526_1) {
			this.method30489();
		} else if (this.aClass526_9 == Class526.aClass526_8) {
			this.method30472(arg0.aClass93_Sub41_Sub2_3);
		} else if (this.aClass526_9 == Class526.aClass526_2) {
			this.method30540();
		} else if (this.aClass526_9.method30381()) {
			this.method30492(arg0.aClass93_Sub41_Sub2_3);
		}
	}

	@OriginalMember(owner = "client!rl", name = "aw", descriptor = "(B)V", line = 309)
	void method30489() {
		this.method30507(Class260.method26158(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15611()));
		@Pc(14) int local14 = this.aClass611_1.anInt5623 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5624 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3884 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5209 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20055(8, 8);
		@Pc(52) byte local52 = 18;
		this.anIntArray463 = new int[local52];
		this.anIntArray462 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5239 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5239 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5242 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5242 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local116), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local82] = local134;
					this.anIntArray462[local82] = this.method30511(local93, local116);
					local82++;
				}
			}
		}
		this.anInt5248 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30545(local30, local40, local178, false);
	}

	@OriginalMember(owner = "client!rl", name = "ds", descriptor = "()V", line = 309)
	void method30557() {
		this.method30507(Class260.method26158(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15611()));
		@Pc(14) int local14 = this.aClass611_1.anInt5623 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5624 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3884 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5209 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20055(8, 8);
		@Pc(52) byte local52 = 18;
		this.anIntArray463 = new int[local52];
		this.anIntArray462 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5239 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5239 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5242 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5242 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local116), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local82] = local134;
					this.anIntArray462[local82] = this.method30511(local93, local116);
					local82++;
				}
			}
		}
		this.anInt5248 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30545(local30, local40, local178, false);
	}

	@OriginalMember(owner = "client!rl", name = "du", descriptor = "()V", line = 309)
	void method30558() {
		this.method30507(Class260.method26158(Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15611()));
		@Pc(14) int local14 = this.aClass611_1.anInt5623 * 270611681;
		@Pc(20) int local20 = this.aClass611_1.anInt5624 * -1994307635;
		@Pc(30) int local30 = (Class163.anInt2002 * -1331168249 >> 12) + (local14 >> 3);
		@Pc(40) int local40 = (local20 >> 3) + (Class270.anInt3884 * 466086187 >> 12);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 = 0;
		Class512.anInt5209 = 0;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20055(8, 8);
		@Pc(52) byte local52 = 18;
		this.anIntArray463 = new int[local52];
		this.anIntArray462 = new int[local52];
		this.aByteArrayArray19 = new byte[local52][];
		this.aByteArrayArray20 = new byte[local52][];
		this.aByteArrayArray17 = new byte[local52][];
		this.aByteArrayArray21 = new byte[local52][];
		this.aByteArrayArray18 = new byte[local52][];
		@Pc(82) int local82 = 0;
		for (@Pc(93) int local93 = (local30 - (this.anInt5239 * -1096901053 >> 4)) / 8; local93 <= (local30 + (this.anInt5239 * -1096901053 >> 4)) / 8; local93++) {
			for (@Pc(116) int local116 = (local40 - (this.anInt5242 * -2134504113 >> 4)) / 8; local116 <= (local40 + (this.anInt5242 * -2134504113 >> 4)) / 8; local116++) {
				@Pc(134) int local134 = (local93 << 8) + local116;
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local116), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local82] = local134;
					this.anIntArray462[local82] = this.method30511(local93, local116);
					local82++;
				}
			}
		}
		this.anInt5248 = local82 * -1132609489;
		@Pc(178) byte local178;
		if (client.anInt3435 * -849002901 == 4) {
			local178 = 10;
		} else if (client.anInt3435 * -849002901 == 15) {
			local178 = 16;
		} else if (client.anInt3435 * -849002901 == 13) {
			local178 = 6;
		} else if (client.anInt3435 * -849002901 == 0) {
			local178 = 8;
		} else {
			throw new RuntimeException("" + client.anInt3435 * -849002901);
		}
		this.method30545(local30, local40, local178, false);
	}

	@OriginalMember(owner = "client!rl", name = "as", descriptor = "(Lclient!ase;I)V", line = 347)
	void method30472(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22443();
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(14) int local14 = arg0.method22499();
		@Pc(18) int local18 = arg0.method22413();
		@Pc(22) int local22 = arg0.method22443();
		@Pc(31) boolean local31 = arg0.method22499() == 1;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local18));
		this.anIntArray463 = new int[local14];
		this.anIntArray462 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5239 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5239 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5242 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5242 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local84, local107), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local14] = (local84 << 8) + local107;
					this.anIntArray462[local14] = this.method30511(local84, local107);
					local14++;
				}
			}
		}
		this.anInt5248 = local14 * -1132609489;
		this.method30545(local3, local22, 3, local31);
	}

	@OriginalMember(owner = "client!rl", name = "dl", descriptor = "(Lclient!ase;)V", line = 347)
	void method30559(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22443();
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(14) int local14 = arg0.method22499();
		@Pc(18) int local18 = arg0.method22413();
		@Pc(22) int local22 = arg0.method22443();
		@Pc(31) boolean local31 = arg0.method22499() == 1;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local18));
		this.anIntArray463 = new int[local14];
		this.anIntArray462 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5239 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5239 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5242 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5242 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local84, local107), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local14] = (local84 << 8) + local107;
					this.anIntArray462[local14] = this.method30511(local84, local107);
					local14++;
				}
			}
		}
		this.anInt5248 = local14 * -1132609489;
		this.method30545(local3, local22, 3, local31);
	}

	@OriginalMember(owner = "client!rl", name = "dp", descriptor = "(Lclient!ase;)V", line = 347)
	void method30560(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22443();
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(14) int local14 = arg0.method22499();
		@Pc(18) int local18 = arg0.method22413();
		@Pc(22) int local22 = arg0.method22443();
		@Pc(31) boolean local31 = arg0.method22499() == 1;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local18));
		this.anIntArray463 = new int[local14];
		this.anIntArray462 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5239 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5239 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5242 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5242 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local84, local107), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local14] = (local84 << 8) + local107;
					this.anIntArray462[local14] = this.method30511(local84, local107);
					local14++;
				}
			}
		}
		this.anInt5248 = local14 * -1132609489;
		this.method30545(local3, local22, 3, local31);
	}

	@OriginalMember(owner = "client!rl", name = "dy", descriptor = "(Lclient!ase;)V", line = 347)
	void method30561(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22443();
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(14) int local14 = arg0.method22499();
		@Pc(18) int local18 = arg0.method22413();
		@Pc(22) int local22 = arg0.method22443();
		@Pc(31) boolean local31 = arg0.method22499() == 1;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local18));
		this.anIntArray463 = new int[local14];
		this.anIntArray462 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5239 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5239 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5242 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5242 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local84, local107), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local14] = (local84 << 8) + local107;
					this.anIntArray462[local14] = this.method30511(local84, local107);
					local14++;
				}
			}
		}
		this.anInt5248 = local14 * -1132609489;
		this.method30545(local3, local22, 3, local31);
	}

	@OriginalMember(owner = "client!rl", name = "db", descriptor = "(Lclient!ase;)V", line = 347)
	void method30562(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(3) int local3 = arg0.method22443();
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(14) int local14 = arg0.method22499();
		@Pc(18) int local18 = arg0.method22413();
		@Pc(22) int local22 = arg0.method22443();
		@Pc(31) boolean local31 = arg0.method22499() == 1;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local18));
		this.anIntArray463 = new int[local14];
		this.anIntArray462 = new int[local14];
		this.aByteArrayArray19 = new byte[local14][];
		this.aByteArrayArray20 = new byte[local14][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local14][];
		this.aByteArrayArray18 = new byte[local14][];
		local14 = 0;
		for (@Pc(84) int local84 = (local3 - (this.anInt5239 * -1096901053 >> 4)) / 8; local84 <= (local3 + (this.anInt5239 * -1096901053 >> 4)) / 8; local84++) {
			for (@Pc(107) int local107 = (local22 - (this.anInt5242 * -2134504113 >> 4)) / 8; local107 <= (local22 + (this.anInt5242 * -2134504113 >> 4)) / 8; local107++) {
				if (Class166_Sub15.aClass497_59.method30048(this.method30511(local84, local107), Class522.aClass522_1.anInt5222 * -1655076145)) {
					this.anIntArray463[local14] = (local84 << 8) + local107;
					this.anIntArray462[local14] = this.method30511(local84, local107);
					local14++;
				}
			}
		}
		this.anInt5248 = local14 * -1132609489;
		this.method30545(local3, local22, 3, local31);
	}

	@OriginalMember(owner = "client!rl", name = "at", descriptor = "(Lclient!ase;I)V", line = 377)
	void method30492(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(10) int local10 = arg0.method22413();
		@Pc(14) int local14 = arg0.method22413();
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22415();
		@Pc(49) int local49 = arg0.method22457();
		@Pc(53) int local53 = arg0.method22449();
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local10));
		arg0.method22668();
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5239 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5242 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22689(1);
					if (local111 == 1) {
						local119 = arg0.method22689(26);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22670();
		local83 = local81.size();
		this.anIntArray463 = new int[local83];
		this.anIntArray462 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5239 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5242 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray463[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30048(this.method30511(local268, local295), Class522.aClass522_1.anInt5222 * -1655076145)) {
								this.anIntArray463[local83] = local150;
								this.anIntArray462[local83] = this.method30511(local268, local295);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5248 = local83 * -1132609489;
		this.method30545(local45, local49, 3, local62);
	}

	@OriginalMember(owner = "client!rl", name = "dh", descriptor = "(Lclient!ase;)V", line = 377)
	void method30563(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(10) int local10 = arg0.method22413();
		@Pc(14) int local14 = arg0.method22413();
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22415();
		@Pc(49) int local49 = arg0.method22457();
		@Pc(53) int local53 = arg0.method22449();
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local10));
		arg0.method22668();
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5239 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5242 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22689(1);
					if (local111 == 1) {
						local119 = arg0.method22689(26);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22670();
		local83 = local81.size();
		this.anIntArray463 = new int[local83];
		this.anIntArray462 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5239 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5242 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray463[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30048(this.method30511(local268, local295), Class522.aClass522_1.anInt5222 * -1655076145)) {
								this.anIntArray463[local83] = local150;
								this.anIntArray462[local83] = this.method30511(local268, local295);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5248 = local83 * -1132609489;
		this.method30545(local45, local49, 3, local62);
	}

	@OriginalMember(owner = "client!rl", name = "dx", descriptor = "(Lclient!ase;)V", line = 377)
	void method30588(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		this.anInt5238 = arg0.method22413() * -823652121;
		@Pc(10) int local10 = arg0.method22413();
		@Pc(14) int local14 = arg0.method22413();
		if (local14 == 1) {
			this.aClass526_9 = Class526.aClass526_3;
		} else if (local14 == 2) {
			this.aClass526_9 = Class526.aClass526_4;
		} else if (local14 == 3) {
			this.aClass526_9 = Class526.aClass526_5;
		} else if (local14 == 4) {
			this.aClass526_9 = Class526.aClass526_6;
		}
		@Pc(45) int local45 = arg0.method22415();
		@Pc(49) int local49 = arg0.method22457();
		@Pc(53) int local53 = arg0.method22449();
		@Pc(62) boolean local62 = (local53 & 0x1) != 0;
		if (!this.aBoolean789) {
			this.method30570();
		}
		this.method30507(Class260.method26158(local10));
		arg0.method22668();
		@Pc(81) HashSet local81 = new HashSet();
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(150) int local150;
		for (local83 = 0; local83 < 4; local83++) {
			for (local88 = 0; local88 < this.anInt5239 * -1096901053 >> 3; local88++) {
				for (local98 = 0; local98 < this.anInt5242 * -2134504113 >> 3; local98++) {
					local111 = arg0.method22689(1);
					if (local111 == 1) {
						local119 = arg0.method22689(26);
						this.anIntArrayArrayArray16[local83][local88][local98] = local119;
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local134 >> 3 << 8 | local140 >> 3;
						local81.add(local150);
					} else {
						this.anIntArrayArrayArray16[local83][local88][local98] = -1;
					}
				}
			}
		}
		arg0.method22670();
		local83 = local81.size();
		this.anIntArray463 = new int[local83];
		this.anIntArray462 = new int[local83];
		this.aByteArrayArray19 = new byte[local83][];
		this.aByteArrayArray20 = new byte[local83][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local83][];
		this.aByteArrayArray18 = new byte[local83][];
		local83 = 0;
		for (local88 = 0; local88 < 4; local88++) {
			for (local98 = 0; local98 < this.anInt5239 * -1096901053 >> 3; local98++) {
				for (local111 = 0; local111 < this.anInt5242 * -2134504113 >> 3; local111++) {
					local119 = this.anIntArrayArrayArray16[local88][local98][local111];
					if (local119 != -1) {
						local134 = local119 >> 14 & 0x3FF;
						local140 = local119 >> 3 & 0x7FF;
						local150 = local140 / 8 + (local134 / 8 << 8);
						@Pc(268) int local268;
						for (local268 = 0; local268 < local83; local268++) {
							if (local150 == this.anIntArray463[local268]) {
								local150 = -1;
								break;
							}
						}
						if (local150 != -1) {
							local268 = local150 >> 8 & 0xFF;
							@Pc(295) int local295 = local150 & 0xFF;
							if (Class166_Sub15.aClass497_59.method30048(this.method30511(local268, local295), Class522.aClass522_1.anInt5222 * -1655076145)) {
								this.anIntArray463[local83] = local150;
								this.anIntArray462[local83] = this.method30511(local268, local295);
								local83++;
							}
						}
					}
				}
			}
		}
		this.anInt5248 = local83 * -1132609489;
		this.method30545(local45, local49, 3, local62);
	}

	@OriginalMember(owner = "client!rl", name = "ad", descriptor = "(I)V", line = 448)
	void method30540() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "dg", descriptor = "()V", line = 448)
	void method30565() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "de", descriptor = "()V", line = 448)
	void method30566() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "dj", descriptor = "()V", line = 448)
	void method30567() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "eo", descriptor = "()V", line = 448)
	void method30568() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "ey", descriptor = "()V", line = 448)
	void method30569() {
		this.aClass526_10 = this.aClass526_9;
		this.method30507(Class332.aClass332_6);
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(24) int local24;
		for (local9 = 0; local9 < 4; local9++) {
			for (local14 = 0; local14 < this.anInt5239 * -1096901053 >> 3; local14++) {
				for (local24 = 0; local24 < this.anInt5242 * -2134504113 >> 3; local24++) {
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
		for (@Pc(52) Class93_Sub27 local52 = (Class93_Sub27) Class249.aClass22_51.method445(); local52 != null; local52 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local14 = local52.anInt1599 * 1276808977;
			@Pc(69) boolean local69 = (local14 & 0x1) == 1;
			local76 = local52.anInt1594 * 45119299 >> 3;
			local83 = local52.anInt1595 * -1314896799 >> 3;
			local88 = local52.anInt1593 * 966360979;
			local93 = local52.anInt1598 * 1021284871;
			local98 = local52.anInt1601 * 1642880537;
			local103 = local52.anInt1596 * -254606571;
			local108 = local52.anInt1597 * -64637751;
			@Pc(113) int local113 = local52.anInt1600 * 716322747;
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
			while (local160 < local113 + local83) {
				@Pc(167) int local167 = local117;
				@Pc(169) int local169 = local76;
				while (local169 < local108 + local76) {
					if (local69) {
						this.anIntArrayArrayArray16[local103][local115 + local88][local167 + local93] = (local14 << 1) + (local169 << 14) + (local98 << 24) + (local160 << 3);
					} else {
						this.anIntArrayArrayArray16[local103][local88 + local167][local93 + local115] = (local14 << 1) + (local160 << 3) + (local169 << 14) + (local98 << 24);
					}
					local169++;
					local167 += local119;
				}
				local160++;
				local115 += local121;
			}
		}
		local9 = client.anInt3425 * -1165651439;
		this.anIntArray463 = new int[local9];
		this.anIntArray462 = new int[local9];
		this.aByteArrayArray19 = new byte[local9][];
		this.aByteArrayArray20 = new byte[local9][];
		this.aByteArrayArray17 = null;
		this.aByteArrayArray21 = new byte[local9][];
		this.aByteArrayArray18 = new byte[local9][];
		local9 = 0;
		for (@Pc(288) Class93_Sub27 local288 = (Class93_Sub27) Class249.aClass22_51.method445(); local288 != null; local288 = (Class93_Sub27) Class249.aClass22_51.method415()) {
			local24 = local288.anInt1594 * 45119299 >>> 3;
			local76 = local288.anInt1595 * -1314896799 >>> 3;
			local83 = local288.anInt1597 * -64637751 + local24;
			if ((local83 & 0x7) == 0) {
				local83--;
			}
			local83 >>>= 0x3;
			local88 = local76 + local288.anInt1600 * 716322747;
			if ((local88 & 0x7) == 0) {
				local88--;
			}
			local88 >>>= 0x3;
			for (local93 = local24 >>> 3; local93 <= local83; local93++) {
				label84: for (local98 = local76 >>> 3; local98 <= local88; local98++) {
					local103 = local93 << 8 | local98;
					for (local108 = 0; local108 < local9; local108++) {
						if (this.anIntArray463[local108] == local103) {
							continue label84;
						}
					}
					if (Class166_Sub15.aClass497_59.method30048(this.method30511(local93, local98), Class522.aClass522_1.anInt5222 * -1655076145)) {
						this.anIntArray463[local9] = local103;
						this.anIntArray462[local9] = this.method30511(local93, local98);
						local9++;
					}
				}
			}
		}
		this.anInt5248 = local9 * -1132609489;
		this.method30545(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4, 3, false);
	}

	@OriginalMember(owner = "client!rl", name = "eu", descriptor = "(II)I", line = 533)
	int method30487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!rl", name = "am", descriptor = "(III)I", line = 533)
	int method30511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1 << 7;
	}

	@OriginalMember(owner = "client!rl", name = "au", descriptor = "(Lclient!ib;I)V", line = 537)
	void method30507(@OriginalArg(0) Class332 arg0) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5239 = (this.anInt5242 = -1148791279 * arg0.anInt4148) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5239 * -1096901053 >> 3][this.anInt5242 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113);
		this.method30453(false);
		Class165.method15319();
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "ed", descriptor = "(Lclient!ib;)V", line = 537)
	void method30571(@OriginalArg(0) Class332 arg0) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5239 = (this.anInt5242 = -1148791279 * arg0.anInt4148) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5239 * -1096901053 >> 3][this.anInt5242 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113);
		this.method30453(false);
		Class165.method15319();
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "ee", descriptor = "(Lclient!ib;)V", line = 537)
	void method30572(@OriginalArg(0) Class332 arg0) {
		if (this.aClass332_7 == arg0) {
			return;
		}
		this.anInt5239 = (this.anInt5242 = -1148791279 * arg0.anInt4148) * -1977691643;
		this.anIntArrayArrayArray16 = new int[4][this.anInt5239 * -1096901053 >> 3][this.anInt5242 * -2134504113 >> 3];
		this.anIntArrayArray60 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.anIntArrayArray61 = new int[this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aByteArrayArrayArray13 = new byte[4][this.anInt5239 * -1096901053][this.anInt5242 * -2134504113];
		this.aClass520_3 = new Class520(4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113);
		this.method30453(false);
		Class165.method15319();
		this.aClass332_7 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "es", descriptor = "()V", line = 550)
	void method30454() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method32895((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219();
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ei", descriptor = "()V", line = 550)
	void method30461() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method32895((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219();
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ej", descriptor = "()V", line = 550)
	void method30564() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method32895((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219();
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ar", descriptor = "(I)V", line = 550)
	void method30570() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method32895((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219();
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "el", descriptor = "()V", line = 550)
	void method30575() {
		if (Class526.aClass526_2 == this.aClass526_9 || this.aClass526_10 == Class526.aClass526_2) {
			return;
		}
		if (Class526.aClass526_3 == this.aClass526_9 || this.aClass526_9 == Class526.aClass526_5 || this.aClass526_9 != this.aClass526_10 && (this.aClass526_9 == Class526.aClass526_8 || this.aClass526_10 == Class526.aClass526_8)) {
			@Pc(32) Iterator local32 = client.aClass16_18.iterator();
			while (local32.hasNext()) {
				@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) local32.next();
				Class665.method32895((Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5);
			}
			client.anInt3540 = 0;
			client.anInt3488 = 0;
			client.aClass16_18.method219();
		}
		this.aClass526_10 = this.aClass526_9;
	}

	@OriginalMember(owner = "client!rl", name = "ap", descriptor = "(IIIZB)V", line = 564)
	void method30545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3463 * 1819062465 == 4) {
			if (this.aBoolean789) {
				throw new IllegalStateException();
			}
			client.anInt3463 = 1167039939;
			client.anInt3462 = -654237073;
		}
		if (!arg3 && arg0 == this.anInt5237 * 562190567 && this.anInt5249 * 1028227575 == arg1) {
			return;
		}
		this.anInt5237 = arg0 * 1982151383;
		this.anInt5249 = arg1 * -1256878137;
		if (!this.aBoolean789) {
			Class481.method29756(arg2);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8), true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		if (this.aClass611_1 == null) {
			this.aClass611_2 = new Class611(0, 0, 0);
		} else {
			this.aClass611_2 = this.aClass611_1;
		}
		this.aClass611_1 = new Class611(0, (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) * 8, (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) * 8);
		this.aClass93_Sub1_Sub20_3 = Class159.method14508(this.anInt5239 * -1096901053 / 2 + this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635 + this.anInt5239 * -1096901053 / 2);
		this.aClass584_3 = null;
		this.aLong287 = -1529257764138147785L;
		if (!this.aBoolean789) {
			this.method30478(arg2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "ep", descriptor = "(IIIZ)V", line = 564)
	void method30577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (client.anInt3463 * 1819062465 == 4) {
			if (this.aBoolean789) {
				throw new IllegalStateException();
			}
			client.anInt3463 = 1167039939;
			client.anInt3462 = -654237073;
		}
		if (!arg3 && arg0 == this.anInt5237 * 562190567 && this.anInt5249 * 1028227575 == arg1) {
			return;
		}
		this.anInt5237 = arg0 * 1982151383;
		this.anInt5249 = arg1 * -1256878137;
		if (!this.aBoolean789) {
			Class481.method29756(arg2);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8), true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		if (this.aClass611_1 == null) {
			this.aClass611_2 = new Class611(0, 0, 0);
		} else {
			this.aClass611_2 = this.aClass611_1;
		}
		this.aClass611_1 = new Class611(0, (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) * 8, (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) * 8);
		this.aClass93_Sub1_Sub20_3 = Class159.method14508(this.anInt5239 * -1096901053 / 2 + this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635 + this.anInt5239 * -1096901053 / 2);
		this.aClass584_3 = null;
		this.aLong287 = -1529257764138147785L;
		if (!this.aBoolean789) {
			this.method30478(arg2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "aq", descriptor = "(II)V", line = 588)
	void method30478(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5623 * 270611681 - this.aClass611_2.anInt5623 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5624 * -1994307635 - this.aClass611_2.anInt5624 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29530(local43.method24229().aClass472_61);
					local73.aFloat317 -= local11 * 512;
					local73.aFloat319 -= local23 * 512;
					local43.method24224(local73);
					local73.method29532();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5239 * 1027376640 - 512;
			local117 = this.anInt5242 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29530(local134.method24229().aClass472_61);
					local139.aFloat317 -= local11 * 512;
					local139.aFloat319 -= local23 * 512;
					local134.method24224(local139);
					if ((int) local139.aFloat317 >= 0 && (int) local139.aFloat317 <= local110 && (int) local139.aFloat319 >= 0 && (int) local139.aFloat319 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5239 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5242 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18589(null);
							local128.method23969();
							local101 = true;
						}
					} else {
						local134.method18589(null);
						local128.method23969();
						local101 = true;
					}
					local139.method29532();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218() * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29530(local311.method24229().aClass472_61);
				local344.aFloat317 -= local11 * 512;
				local344.aFloat319 -= local23 * 512;
				local311.method24224(local344);
				local344.method29532();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220(); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222()) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5624 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5239 * -1096901053 && local668 < this.anInt5242 * -2134504113 && local650 < this.aClass585_24.anInt5443 * -200159665 && local668 < this.aClass585_24.anInt5444 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31471(local117, local650, local668);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23969();
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36752(false);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt4886 -= local23 * 183720448;
			if (Class429.anInt4781 * -1453926679 != 4 && Class429.anInt4781 * -1453926679 != 3) {
				Class322.method27274(Class20.method376());
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5289 -= local11 * 175543751;
			Class349.anInt4201 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3884 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5239 * -1096901053 || Math.abs(local23) > this.anInt5242 * -2134504113) {
				this.aClass671_2.method33003();
			}
		}
		Class380.method28120();
		Class360.method27801();
		client.aClass16_21.method219();
		client.aClass22_46.method406();
		client.aClass21_6.method378();
		Class286.method26525();
	}

	@OriginalMember(owner = "client!rl", name = "em", descriptor = "(I)V", line = 588)
	void method30520(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5623 * 270611681 - this.aClass611_2.anInt5623 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5624 * -1994307635 - this.aClass611_2.anInt5624 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29530(local43.method24229().aClass472_61);
					local73.aFloat317 -= local11 * 512;
					local73.aFloat319 -= local23 * 512;
					local43.method24224(local73);
					local73.method29532();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5239 * 1027376640 - 512;
			local117 = this.anInt5242 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29530(local134.method24229().aClass472_61);
					local139.aFloat317 -= local11 * 512;
					local139.aFloat319 -= local23 * 512;
					local134.method24224(local139);
					if ((int) local139.aFloat317 >= 0 && (int) local139.aFloat317 <= local110 && (int) local139.aFloat319 >= 0 && (int) local139.aFloat319 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5239 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5242 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18589(null);
							local128.method23969();
							local101 = true;
						}
					} else {
						local134.method18589(null);
						local128.method23969();
						local101 = true;
					}
					local139.method29532();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218() * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29530(local311.method24229().aClass472_61);
				local344.aFloat317 -= local11 * 512;
				local344.aFloat319 -= local23 * 512;
				local311.method24224(local344);
				local344.method29532();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220(); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222()) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5624 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5239 * -1096901053 && local668 < this.anInt5242 * -2134504113 && local650 < this.aClass585_24.anInt5443 * -200159665 && local668 < this.aClass585_24.anInt5444 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31471(local117, local650, local668);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23969();
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36752(false);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt4886 -= local23 * 183720448;
			if (Class429.anInt4781 * -1453926679 != 4 && Class429.anInt4781 * -1453926679 != 3) {
				Class322.method27274(Class20.method376());
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5289 -= local11 * 175543751;
			Class349.anInt4201 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3884 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5239 * -1096901053 || Math.abs(local23) > this.anInt5242 * -2134504113) {
				this.aClass671_2.method33003();
			}
		}
		Class380.method28120();
		Class360.method27801();
		client.aClass16_21.method219();
		client.aClass22_46.method406();
		client.aClass21_6.method378();
		Class286.method26525();
	}

	@OriginalMember(owner = "client!rl", name = "ev", descriptor = "(I)V", line = 588)
	void method30552(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5623 * 270611681 - this.aClass611_2.anInt5623 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5624 * -1994307635 - this.aClass611_2.anInt5624 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29530(local43.method24229().aClass472_61);
					local73.aFloat317 -= local11 * 512;
					local73.aFloat319 -= local23 * 512;
					local43.method24224(local73);
					local73.method29532();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5239 * 1027376640 - 512;
			local117 = this.anInt5242 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29530(local134.method24229().aClass472_61);
					local139.aFloat317 -= local11 * 512;
					local139.aFloat319 -= local23 * 512;
					local134.method24224(local139);
					if ((int) local139.aFloat317 >= 0 && (int) local139.aFloat317 <= local110 && (int) local139.aFloat319 >= 0 && (int) local139.aFloat319 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5239 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5242 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18589(null);
							local128.method23969();
							local101 = true;
						}
					} else {
						local134.method18589(null);
						local128.method23969();
						local101 = true;
					}
					local139.method29532();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218() * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29530(local311.method24229().aClass472_61);
				local344.aFloat317 -= local11 * 512;
				local344.aFloat319 -= local23 * 512;
				local311.method24224(local344);
				local344.method29532();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220(); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222()) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5624 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5239 * -1096901053 && local668 < this.anInt5242 * -2134504113 && local650 < this.aClass585_24.anInt5443 * -200159665 && local668 < this.aClass585_24.anInt5444 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31471(local117, local650, local668);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23969();
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36752(false);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt4886 -= local23 * 183720448;
			if (Class429.anInt4781 * -1453926679 != 4 && Class429.anInt4781 * -1453926679 != 3) {
				Class322.method27274(Class20.method376());
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5289 -= local11 * 175543751;
			Class349.anInt4201 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3884 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5239 * -1096901053 || Math.abs(local23) > this.anInt5242 * -2134504113) {
				this.aClass671_2.method33003();
			}
		}
		Class380.method28120();
		Class360.method27801();
		client.aClass16_21.method219();
		client.aClass22_46.method406();
		client.aClass21_6.method378();
		Class286.method26525();
	}

	@OriginalMember(owner = "client!rl", name = "ec", descriptor = "(I)V", line = 588)
	void method30579(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5623 * 270611681 - this.aClass611_2.anInt5623 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5624 * -1994307635 - this.aClass611_2.anInt5624 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29530(local43.method24229().aClass472_61);
					local73.aFloat317 -= local11 * 512;
					local73.aFloat319 -= local23 * 512;
					local43.method24224(local73);
					local73.method29532();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5239 * 1027376640 - 512;
			local117 = this.anInt5242 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29530(local134.method24229().aClass472_61);
					local139.aFloat317 -= local11 * 512;
					local139.aFloat319 -= local23 * 512;
					local134.method24224(local139);
					if ((int) local139.aFloat317 >= 0 && (int) local139.aFloat317 <= local110 && (int) local139.aFloat319 >= 0 && (int) local139.aFloat319 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5239 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5242 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18589(null);
							local128.method23969();
							local101 = true;
						}
					} else {
						local134.method18589(null);
						local128.method23969();
						local101 = true;
					}
					local139.method29532();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218() * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29530(local311.method24229().aClass472_61);
				local344.aFloat317 -= local11 * 512;
				local344.aFloat319 -= local23 * 512;
				local311.method24224(local344);
				local344.method29532();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220(); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222()) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5624 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5239 * -1096901053 && local668 < this.anInt5242 * -2134504113 && local650 < this.aClass585_24.anInt5443 * -200159665 && local668 < this.aClass585_24.anInt5444 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31471(local117, local650, local668);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23969();
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36752(false);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt4886 -= local23 * 183720448;
			if (Class429.anInt4781 * -1453926679 != 4 && Class429.anInt4781 * -1453926679 != 3) {
				Class322.method27274(Class20.method376());
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5289 -= local11 * 175543751;
			Class349.anInt4201 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3884 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5239 * -1096901053 || Math.abs(local23) > this.anInt5242 * -2134504113) {
				this.aClass671_2.method33003();
			}
		}
		Class380.method28120();
		Class360.method27801();
		client.aClass16_21.method219();
		client.aClass22_46.method406();
		client.aClass21_6.method378();
		Class286.method26525();
	}

	@OriginalMember(owner = "client!rl", name = "ek", descriptor = "(I)V", line = 588)
	void method30580(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aClass611_1.anInt5623 * 270611681 - this.aClass611_2.anInt5623 * 270611681;
		@Pc(23) int local23 = this.aClass611_1.anInt5624 * -1994307635 - this.aClass611_2.anInt5624 * -1994307635;
		@Pc(28) int local28;
		@Pc(45) int local45;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (arg0 == 3) {
			for (local28 = 0; local28 < client.anInt3488 * -1814159537; local28++) {
				@Pc(37) Class93_Sub15 local37 = client.aClass93_Sub15Array1[local28];
				if (local37 != null) {
					@Pc(43) Class132_Sub1_Sub1_Sub1_Sub1 local43 = (Class132_Sub1_Sub1_Sub1_Sub1) local37.anObject5;
					for (local45 = 0; local45 < local43.anIntArray240.length; local45++) {
						local43.anIntArray240[local45] -= local11;
						local43.anIntArray239[local45] -= local23;
					}
					@Pc(73) Class472 local73 = Class472.method29530(local43.method24229().aClass472_61);
					local73.aFloat317 -= local11 * 512;
					local73.aFloat319 -= local23 * 512;
					local43.method24224(local73);
					local73.method29532();
				}
			}
		} else {
			@Pc(101) boolean local101 = false;
			client.anInt3540 = 0;
			local110 = this.anInt5239 * 1027376640 - 512;
			local117 = this.anInt5242 * -1944412672 - 512;
			for (local45 = 0; local45 < client.anInt3488 * -1814159537; local45++) {
				@Pc(128) Class93_Sub15 local128 = client.aClass93_Sub15Array1[local45];
				if (local128 != null) {
					@Pc(134) Class132_Sub1_Sub1_Sub1_Sub1 local134 = (Class132_Sub1_Sub1_Sub1_Sub1) local128.anObject5;
					@Pc(139) Class472 local139 = Class472.method29530(local134.method24229().aClass472_61);
					local139.aFloat317 -= local11 * 512;
					local139.aFloat319 -= local23 * 512;
					local134.method24224(local139);
					if ((int) local139.aFloat317 >= 0 && (int) local139.aFloat317 <= local110 && (int) local139.aFloat319 >= 0 && (int) local139.aFloat319 <= local117) {
						@Pc(190) boolean local190 = true;
						for (@Pc(192) int local192 = 0; local192 < local134.anIntArray240.length; local192++) {
							local134.anIntArray240[local192] -= local11;
							local134.anIntArray239[local192] -= local23;
							if (local134.anIntArray240[local192] < 0 || local134.anIntArray240[local192] >= this.anInt5239 * -1096901053 || local134.anIntArray239[local192] < 0 || local134.anIntArray239[local192] >= this.anInt5242 * -2134504113) {
								local190 = false;
							}
						}
						if (local190) {
							client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local134.anInt2768 * -1688488127;
						} else {
							local134.method18589(null);
							local128.method23969();
							local101 = true;
						}
					} else {
						local134.method18589(null);
						local128.method23969();
						local101 = true;
					}
					local139.method29532();
				}
			}
			if (local101) {
				client.anInt3488 = client.aClass16_18.method218() * 436180911;
				local45 = 0;
				@Pc(289) Iterator local289 = client.aClass16_18.iterator();
				while (local289.hasNext()) {
					@Pc(296) Class93_Sub15 local296 = (Class93_Sub15) local289.next();
					client.aClass93_Sub15Array1[local45++] = local296;
				}
			}
		}
		for (local28 = 0; local28 < 2048; local28++) {
			@Pc(311) Class132_Sub1_Sub1_Sub1_Sub2 local311 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local311 != null) {
				for (local117 = 0; local117 < local311.anIntArray240.length; local117++) {
					local311.anIntArray240[local117] -= local11;
					local311.anIntArray239[local117] -= local23;
				}
				@Pc(344) Class472 local344 = Class472.method29530(local311.method24229().aClass472_61);
				local344.aFloat317 -= local11 * 512;
				local344.aFloat319 -= local23 * 512;
				local311.method24224(local344);
				local344.method29532();
			}
		}
		@Pc(371) Class173[] local371 = client.aClass173Array1;
		for (local110 = 0; local110 < local371.length; local110++) {
			@Pc(381) Class173 local381 = local371[local110];
			if (local381 != null) {
				local381.anInt3248 -= local11 * -1253715456;
				local381.anInt3249 -= local23 * -1772297728;
			}
		}
		@Pc(407) Class93_Sub8 local407;
		@Pc(435) Class610 local435;
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_18.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (this.aClass526_9 != Class526.aClass526_6 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method445(); local407 != null; local407 = (Class93_Sub8) Class93_Sub8.aClass22_19.method415()) {
			local407.anInt1462 -= local11 * -1126729883;
			local407.anInt1464 -= local23 * -89446595;
			local435 = (Class610) this.aClass32_Sub14_9.method18261(local407.anInt1468 * -1430483277);
			if ((local407.anInt1469 * 1312747191 & 0x1) == 0) {
				local117 = local435.anInt5608 * 427800467;
				local45 = local435.anInt5603 * -774442965;
			} else {
				local117 = local435.anInt5603 * -774442965;
				local45 = local435.anInt5608 * 427800467;
			}
			if (Class526.aClass526_6 != this.aClass526_9 && (local407.anInt1462 * -1824529811 + local117 <= 0 || local407.anInt1464 * 275343381 + local45 <= 0 || local407.anInt1462 * -1824529811 >= this.anInt5239 * -1096901053 || local407.anInt1464 * 275343381 >= this.anInt5242 * -2134504113)) {
				local407.method23969();
			}
		}
		for (@Pc(621) Class93_Sub5 local621 = (Class93_Sub5) client.aClass16_20.method220(); local621 != null; local621 = (Class93_Sub5) client.aClass16_20.method222()) {
			local117 = (int) (local621.aLong232 * -3750704643647536275L >> 28 & 0x3L);
			local45 = (int) (local621.aLong232 * -3750704643647536275L & 0x3FFFL);
			@Pc(650) int local650 = local45 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(660) int local660 = (int) (local621.aLong232 * -3750704643647536275L >> 14 & 0x3FFFL);
			@Pc(668) int local668 = local660 - this.aClass611_1.anInt5624 * -1994307635;
			if (this.aClass585_24 != null) {
				if (local650 >= 0 && local668 >= 0 && local650 < this.anInt5239 * -1096901053 && local668 < this.anInt5242 * -2134504113 && local650 < this.aClass585_24.anInt5443 * -200159665 && local668 < this.aClass585_24.anInt5444 * -1943751559) {
					if (this.aClass585_24.aClass572ArrayArrayArray3 != null) {
						this.aClass585_24.method31471(local117, local650, local668);
					}
				} else if (Class526.aClass526_6 != this.aClass526_9) {
					local621.method23969();
				}
			}
		}
		if (Class172.anInt3179 * -820036969 != 0) {
			Class172.anInt3179 -= local11 * 2004084007;
			Class172.anInt3174 -= local23 * -246739717;
		}
		Class707.method36752(false);
		if (arg0 == 3) {
			client.anInt3481 -= local11 * 1960371712;
			client.anInt3482 -= local23 * -917312000;
			Class72.anInt241 -= local11 * 2086292992;
			Class441.anInt4886 -= local23 * 183720448;
			if (Class429.anInt4781 * -1453926679 != 4 && Class429.anInt4781 * -1453926679 != 3) {
				Class322.method27274(Class20.method376());
			}
		} else {
			Class26.anInt90 -= local11 * -593819457;
			Class20.anInt70 -= local23 * 1882463673;
			Class545.anInt5289 -= local11 * 175543751;
			Class349.anInt4201 -= local23 * -1334968335;
			Class163.anInt2002 -= local11 * 224620032;
			Class270.anInt3884 -= local23 * -1424292352;
			if (Math.abs(local11) > this.anInt5239 * -1096901053 || Math.abs(local23) > this.anInt5242 * -2134504113) {
				this.aClass671_2.method33003();
			}
		}
		Class380.method28120();
		Class360.method27801();
		client.aClass16_21.method219();
		client.aClass22_46.method406();
		client.aClass21_6.method378();
		Class286.method26525();
	}

	@OriginalMember(owner = "client!rl", name = "ax", descriptor = "(I)V", line = 756)
	void method30479() {
		this.aClass142_Sub1_2 = null;
		this.aClass142_Sub1_1 = null;
		if (this.aClass520_3 != null) {
			this.aClass520_3.method30326();
		}
		if (this.aClass671_2 != null) {
			this.aClass671_2.method32982();
		}
		if (this.aClass585_24 != null) {
			this.aClass585_24.aClass569_2.method31300();
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "eh", descriptor = "()V", line = 756)
	void method30582() {
		this.aClass142_Sub1_2 = null;
		this.aClass142_Sub1_1 = null;
		if (this.aClass520_3 != null) {
			this.aClass520_3.method30326();
		}
		if (this.aClass671_2 != null) {
			this.aClass671_2.method32982();
		}
		if (this.aClass585_24 != null) {
			this.aClass585_24.aClass569_2.method31300();
			this.aClass585_24 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "av", descriptor = "(B)Z", line = 767)
	public boolean method30439() {
		if (!this.aBoolean789) {
			Class481.method29753(false);
		}
		if (this.aLong287 * -8467614189479269767L == -1L) {
			this.aLong287 = Class305.method26796() * 1529257764138147785L;
		}
		this.anInt5243 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30092(this.anIntArray462[local23])) {
				this.anInt5243 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30069(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30051(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = Class443.method28868(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean620);
			} else {
				this.anInt5243 += 968880165;
			}
		}
		if (this.anInt5243 * 1438297005 > 0) {
			if (this.anInt5244 * -1508419771 < this.anInt5243 * 1438297005) {
				this.anInt5244 = this.anInt5243 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_1.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_7.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_5.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_2.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_3.anInt5222 * -1655076145);
			}
		}
		local23 = this.anInt5245 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5245 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5248 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5245 * -330761899 > 0) {
			if (local23 != this.anInt5245 * -330761899) {
				this.anInt5247 = client.anInt3485 * -176246917;
			} else if (this.anInt5247 * 766629811 != 0 && client.anInt3485 - this.anInt5247 * 766629811 == 1000) {
				Class389.method28263(local244.anInt5810 * -1287795829, local239.anInt5810 * -1287795829, this.anInt5245 * -330761899);
				Class591.method31696();
			}
			if (this.anInt5246 * 1069530631 < this.anInt5245 * -330761899) {
				this.anInt5246 = this.anInt5245 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean789 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8) + Class430.aString207 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean789 && Class274.aClass258_1 != null) {
			Class274.aClass258_1.method26032();
		}
		if (!this.aBoolean789) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean789) {
			Class700.method36716(true);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2) {
			for (local564 = 0; local564 < this.anInt5248 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16445()).anInt4204 * -2054577112;
		if (Class694.aClass104_14.method20429()) {
			local564++;
		}
		this.method30536();
		this.method30479();
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local564, local556, Class694.aClass104_14.method20413() > 0);
		this.aClass585_24.method31432(false);
		this.aClass585_24.method31430(client.anInt3536 * -1229702203);
		this.aClass585_24.method31488(this.aHashMap10);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31466(null);
		} else {
			this.aClass585_24.method31466(Class707.aClass106_13);
		}
		this.aClass528_1 = new Class528();
		this.aFloat323 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878();
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
		this.aClass142_Sub1_1.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
		this.aClass142_Sub1_1.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
		this.aClass142_Sub1_1.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
		if (this.aClass526_9.method30381()) {
			this.method30483(this.aClass142_Sub1_1, this.aByteArrayArray19);
		} else {
			this.method30482(this.aClass142_Sub1_1, this.aByteArrayArray19);
		}
		if (this.aBoolean789) {
			this.method30481(50);
		}
		this.aClass671_2.method32975(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4);
		this.aClass671_2.method32987(this);
		if (local556) {
			this.aClass585_24.method31432(true);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878();
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
			this.aClass142_Sub1_2.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
			this.aClass142_Sub1_2.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
			this.aClass142_Sub1_2.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
			if (this.aClass526_9.method30381()) {
				this.method30483(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			} else {
				this.method30482(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0]);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null);
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass526_9.method30381()) {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30485(this.aClass142_Sub1_1, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30484(this.aClass142_Sub1_1, this.aByteArrayArray20);
			if (this.aByteArrayArray17 != null) {
				this.method30486();
			}
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		if (local556) {
			this.aClass585_24.method31432(true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			if (this.aClass526_9.method30381()) {
				this.method30485(this.aClass142_Sub1_2, this.aByteArrayArray18);
			} else {
				this.method30484(this.aClass142_Sub1_2, this.aByteArrayArray18);
			}
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0]);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10879();
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879();
		}
		this.aClass585_24.method31604();
		if (this.aBoolean789) {
			Class305.method26796();
			while (!Class694.aClass104_14.method20514()) {
				this.method30481(1);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean789) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30468(local1170);
			Class392.aClass541_1.method30906(local1170);
			local1165 = true;
			Class305.method26796();
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean611 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30479();
			this.method30478(3);
			this.method30570();
		} else {
			Class274.aClass258_1.method26032();
			this.aClass671_2.method32981();
			Class238.method25800();
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5239 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5242 * -2134504113; local1238++) {
					Class518.method30305(local292, local319, local1238);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31264();
			}
		}
		Class262.method26173();
		Class371.method28004();
		if (Class343.method27518() == Class555.aClass555_3 && client.aClass175_2.method24356() != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2);
			local1296.aClass93_Sub41_Sub2_1.method22395(1057001181);
			client.aClass175_2.method24351(local1296);
		}
		if (!this.aClass526_9.method30381()) {
			local292 = (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5237 * 562190567 + (this.anInt5239 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5242 * -2134504113 >> 4) + this.anInt5249 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30050(this.method30511(local1370, local1379));
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26796() - this.aLong287 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29756(4);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29756(13);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29756(15);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29756(0);
		} else {
			Class481.method29756(18);
			if (client.aClass175_2.method24356() != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2);
				local1466.aClass93_Sub41_Sub2_1.method22395((int) local1417);
				client.aClass175_2.method24351(local1466);
			}
		}
		if (this.aBoolean790) {
			Class314.method26939(Long.toString(Class305.method26796() - this.aLong286 * 1216641514968376055L));
			this.aBoolean790 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "eq", descriptor = "()Z", line = 767)
	public boolean method30583() {
		if (!this.aBoolean789) {
			Class481.method29753(false);
		}
		if (this.aLong287 * -8467614189479269767L == -1L) {
			this.aLong287 = Class305.method26796() * 1529257764138147785L;
		}
		this.anInt5243 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30092(this.anIntArray462[local23])) {
				this.anInt5243 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30069(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30051(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = Class443.method28868(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean620);
			} else {
				this.anInt5243 += 968880165;
			}
		}
		if (this.anInt5243 * 1438297005 > 0) {
			if (this.anInt5244 * -1508419771 < this.anInt5243 * 1438297005) {
				this.anInt5244 = this.anInt5243 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_1.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_7.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_5.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_2.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_3.anInt5222 * -1655076145);
			}
		}
		local23 = this.anInt5245 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5245 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5248 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5245 * -330761899 > 0) {
			if (local23 != this.anInt5245 * -330761899) {
				this.anInt5247 = client.anInt3485 * -176246917;
			} else if (this.anInt5247 * 766629811 != 0 && client.anInt3485 - this.anInt5247 * 766629811 == 1000) {
				Class389.method28263(local244.anInt5810 * -1287795829, local239.anInt5810 * -1287795829, this.anInt5245 * -330761899);
				Class591.method31696();
			}
			if (this.anInt5246 * 1069530631 < this.anInt5245 * -330761899) {
				this.anInt5246 = this.anInt5245 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean789 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8) + Class430.aString207 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean789 && Class274.aClass258_1 != null) {
			Class274.aClass258_1.method26032();
		}
		if (!this.aBoolean789) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean789) {
			Class700.method36716(true);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2) {
			for (local564 = 0; local564 < this.anInt5248 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16445()).anInt4204 * -2054577112;
		if (Class694.aClass104_14.method20429()) {
			local564++;
		}
		this.method30536();
		this.method30479();
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local564, local556, Class694.aClass104_14.method20413() > 0);
		this.aClass585_24.method31432(false);
		this.aClass585_24.method31430(client.anInt3536 * -1229702203);
		this.aClass585_24.method31488(this.aHashMap10);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31466(null);
		} else {
			this.aClass585_24.method31466(Class707.aClass106_13);
		}
		this.aClass528_1 = new Class528();
		this.aFloat323 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878();
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
		this.aClass142_Sub1_1.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
		this.aClass142_Sub1_1.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
		this.aClass142_Sub1_1.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
		if (this.aClass526_9.method30381()) {
			this.method30483(this.aClass142_Sub1_1, this.aByteArrayArray19);
		} else {
			this.method30482(this.aClass142_Sub1_1, this.aByteArrayArray19);
		}
		if (this.aBoolean789) {
			this.method30481(50);
		}
		this.aClass671_2.method32975(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4);
		this.aClass671_2.method32987(this);
		if (local556) {
			this.aClass585_24.method31432(true);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878();
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
			this.aClass142_Sub1_2.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
			this.aClass142_Sub1_2.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
			this.aClass142_Sub1_2.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
			if (this.aClass526_9.method30381()) {
				this.method30483(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			} else {
				this.method30482(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0]);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null);
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass526_9.method30381()) {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30485(this.aClass142_Sub1_1, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30484(this.aClass142_Sub1_1, this.aByteArrayArray20);
			if (this.aByteArrayArray17 != null) {
				this.method30486();
			}
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		if (local556) {
			this.aClass585_24.method31432(true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			if (this.aClass526_9.method30381()) {
				this.method30485(this.aClass142_Sub1_2, this.aByteArrayArray18);
			} else {
				this.method30484(this.aClass142_Sub1_2, this.aByteArrayArray18);
			}
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0]);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10879();
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879();
		}
		this.aClass585_24.method31604();
		if (this.aBoolean789) {
			Class305.method26796();
			while (!Class694.aClass104_14.method20514()) {
				this.method30481(1);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean789) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30468(local1170);
			Class392.aClass541_1.method30906(local1170);
			local1165 = true;
			Class305.method26796();
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean611 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30479();
			this.method30478(3);
			this.method30570();
		} else {
			Class274.aClass258_1.method26032();
			this.aClass671_2.method32981();
			Class238.method25800();
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5239 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5242 * -2134504113; local1238++) {
					Class518.method30305(local292, local319, local1238);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31264();
			}
		}
		Class262.method26173();
		Class371.method28004();
		if (Class343.method27518() == Class555.aClass555_3 && client.aClass175_2.method24356() != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2);
			local1296.aClass93_Sub41_Sub2_1.method22395(1057001181);
			client.aClass175_2.method24351(local1296);
		}
		if (!this.aClass526_9.method30381()) {
			local292 = (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5237 * 562190567 + (this.anInt5239 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5242 * -2134504113 >> 4) + this.anInt5249 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30050(this.method30511(local1370, local1379));
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26796() - this.aLong287 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29756(4);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29756(13);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29756(15);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29756(0);
		} else {
			Class481.method29756(18);
			if (client.aClass175_2.method24356() != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2);
				local1466.aClass93_Sub41_Sub2_1.method22395((int) local1417);
				client.aClass175_2.method24351(local1466);
			}
		}
		if (this.aBoolean790) {
			Class314.method26939(Long.toString(Class305.method26796() - this.aLong286 * 1216641514968376055L));
			this.aBoolean790 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "eg", descriptor = "()Z", line = 767)
	public boolean method30584() {
		if (!this.aBoolean789) {
			Class481.method29753(false);
		}
		if (this.aLong287 * -8467614189479269767L == -1L) {
			this.aLong287 = Class305.method26796() * 1529257764138147785L;
		}
		this.anInt5243 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30092(this.anIntArray462[local23])) {
				this.anInt5243 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30069(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30051(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = Class443.method28868(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean620);
			} else {
				this.anInt5243 += 968880165;
			}
		}
		if (this.anInt5243 * 1438297005 > 0) {
			if (this.anInt5244 * -1508419771 < this.anInt5243 * 1438297005) {
				this.anInt5244 = this.anInt5243 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_1.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_7.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_5.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_2.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_3.anInt5222 * -1655076145);
			}
		}
		local23 = this.anInt5245 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5245 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5248 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5245 * -330761899 > 0) {
			if (local23 != this.anInt5245 * -330761899) {
				this.anInt5247 = client.anInt3485 * -176246917;
			} else if (this.anInt5247 * 766629811 != 0 && client.anInt3485 - this.anInt5247 * 766629811 == 1000) {
				Class389.method28263(local244.anInt5810 * -1287795829, local239.anInt5810 * -1287795829, this.anInt5245 * -330761899);
				Class591.method31696();
			}
			if (this.anInt5246 * 1069530631 < this.anInt5245 * -330761899) {
				this.anInt5246 = this.anInt5245 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean789 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8) + Class430.aString207 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean789 && Class274.aClass258_1 != null) {
			Class274.aClass258_1.method26032();
		}
		if (!this.aBoolean789) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean789) {
			Class700.method36716(true);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2) {
			for (local564 = 0; local564 < this.anInt5248 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16445()).anInt4204 * -2054577112;
		if (Class694.aClass104_14.method20429()) {
			local564++;
		}
		this.method30536();
		this.method30479();
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local564, local556, Class694.aClass104_14.method20413() > 0);
		this.aClass585_24.method31432(false);
		this.aClass585_24.method31430(client.anInt3536 * -1229702203);
		this.aClass585_24.method31488(this.aHashMap10);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31466(null);
		} else {
			this.aClass585_24.method31466(Class707.aClass106_13);
		}
		this.aClass528_1 = new Class528();
		this.aFloat323 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878();
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
		this.aClass142_Sub1_1.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
		this.aClass142_Sub1_1.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
		this.aClass142_Sub1_1.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
		if (this.aClass526_9.method30381()) {
			this.method30483(this.aClass142_Sub1_1, this.aByteArrayArray19);
		} else {
			this.method30482(this.aClass142_Sub1_1, this.aByteArrayArray19);
		}
		if (this.aBoolean789) {
			this.method30481(50);
		}
		this.aClass671_2.method32975(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4);
		this.aClass671_2.method32987(this);
		if (local556) {
			this.aClass585_24.method31432(true);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878();
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
			this.aClass142_Sub1_2.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
			this.aClass142_Sub1_2.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
			this.aClass142_Sub1_2.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
			if (this.aClass526_9.method30381()) {
				this.method30483(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			} else {
				this.method30482(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0]);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null);
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass526_9.method30381()) {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30485(this.aClass142_Sub1_1, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30484(this.aClass142_Sub1_1, this.aByteArrayArray20);
			if (this.aByteArrayArray17 != null) {
				this.method30486();
			}
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		if (local556) {
			this.aClass585_24.method31432(true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			if (this.aClass526_9.method30381()) {
				this.method30485(this.aClass142_Sub1_2, this.aByteArrayArray18);
			} else {
				this.method30484(this.aClass142_Sub1_2, this.aByteArrayArray18);
			}
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0]);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10879();
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879();
		}
		this.aClass585_24.method31604();
		if (this.aBoolean789) {
			Class305.method26796();
			while (!Class694.aClass104_14.method20514()) {
				this.method30481(1);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean789) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30468(local1170);
			Class392.aClass541_1.method30906(local1170);
			local1165 = true;
			Class305.method26796();
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean611 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30479();
			this.method30478(3);
			this.method30570();
		} else {
			Class274.aClass258_1.method26032();
			this.aClass671_2.method32981();
			Class238.method25800();
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5239 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5242 * -2134504113; local1238++) {
					Class518.method30305(local292, local319, local1238);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31264();
			}
		}
		Class262.method26173();
		Class371.method28004();
		if (Class343.method27518() == Class555.aClass555_3 && client.aClass175_2.method24356() != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2);
			local1296.aClass93_Sub41_Sub2_1.method22395(1057001181);
			client.aClass175_2.method24351(local1296);
		}
		if (!this.aClass526_9.method30381()) {
			local292 = (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5237 * 562190567 + (this.anInt5239 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5242 * -2134504113 >> 4) + this.anInt5249 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30050(this.method30511(local1370, local1379));
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26796() - this.aLong287 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29756(4);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29756(13);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29756(15);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29756(0);
		} else {
			Class481.method29756(18);
			if (client.aClass175_2.method24356() != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2);
				local1466.aClass93_Sub41_Sub2_1.method22395((int) local1417);
				client.aClass175_2.method24351(local1466);
			}
		}
		if (this.aBoolean790) {
			Class314.method26939(Long.toString(Class305.method26796() - this.aLong286 * 1216641514968376055L));
			this.aBoolean790 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "ez", descriptor = "()Z", line = 767)
	public boolean method30585() {
		if (!this.aBoolean789) {
			Class481.method29753(false);
		}
		if (this.aLong287 * -8467614189479269767L == -1L) {
			this.aLong287 = Class305.method26796() * 1529257764138147785L;
		}
		this.anInt5243 = 0;
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (!Class166_Sub15.aClass497_59.method30092(this.anIntArray462[local23])) {
				this.anInt5243 += 968880165;
			}
		}
		if (this.aClass584_3 == null) {
			if (this.aClass93_Sub1_Sub20_3 == null || !Class710.aClass497_143.method30069(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = new Class584(0);
			} else if (Class710.aClass497_143.method30051(this.aClass93_Sub1_Sub20_3.aString113)) {
				this.aClass584_3 = Class443.method28868(Class710.aClass497_143, this.aClass93_Sub1_Sub20_3.aString113, client.aBoolean620);
			} else {
				this.anInt5243 += 968880165;
			}
		}
		if (this.anInt5243 * 1438297005 > 0) {
			if (this.anInt5244 * -1508419771 < this.anInt5243 * 1438297005) {
				this.anInt5244 = this.anInt5243 * -917260983;
			}
			this.aClass529_5 = Class529.aClass529_2;
			return false;
		}
		for (local23 = 0; local23 < this.anInt5248 * 412583631; local23++) {
			if (this.aByteArrayArray19[local23] == null) {
				this.aByteArrayArray19[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_1.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray20[local23] == null) {
				this.aByteArrayArray20[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_7.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray21[local23] == null) {
				this.aByteArrayArray21[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_5.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray18[local23] == null) {
				this.aByteArrayArray18[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_2.anInt5222 * -1655076145);
			}
			if (this.aByteArrayArray17 != null && this.aByteArrayArray17[local23] == null) {
				this.aByteArrayArray17[local23] = Class166_Sub15.aClass497_59.method30044(this.anIntArray462[local23], Class522.aClass522_3.anInt5222 * -1655076145);
			}
		}
		local23 = this.anInt5245 * -330761899;
		@Pc(239) Class656 local239 = new Class656(-1);
		@Pc(244) Class656 local244 = new Class656(-1);
		this.anInt5245 = 0;
		@Pc(249) int local249;
		@Pc(292) int local292;
		@Pc(319) int local319;
		for (local249 = 0; local249 < this.anInt5248 * 412583631; local249++) {
			@Pc(260) byte[] local260 = this.aByteArrayArray20[local249];
			@Pc(277) int local277;
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
			local260 = this.aByteArrayArray18[local249];
			if (local260 != null) {
				local277 = (this.anIntArray463[local249] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				local292 = (this.anIntArray463[local249] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (this.aClass526_9.method30381()) {
					local277 = 10;
					local292 = 10;
				}
				local319 = Class334.method27402(this.aClass32_Sub14_9, local260, local277, local292, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local244, local239);
				if (local319 > 0) {
					this.anInt5245 += local319 * 348077053;
				}
			}
		}
		if (this.anInt5245 * -330761899 > 0) {
			if (local23 != this.anInt5245 * -330761899) {
				this.anInt5247 = client.anInt3485 * -176246917;
			} else if (this.anInt5247 * 766629811 != 0 && client.anInt3485 - this.anInt5247 * 766629811 == 1000) {
				Class389.method28263(local244.anInt5810 * -1287795829, local239.anInt5810 * -1287795829, this.anInt5245 * -330761899);
				Class591.method31696();
			}
			if (this.anInt5246 * 1069530631 < this.anInt5245 * -330761899) {
				this.anInt5246 = this.anInt5245 * 2117891779;
			}
			this.aClass529_5 = Class529.aClass529_1;
			return false;
		}
		if (!this.aBoolean789 && this.aClass529_5 != Class529.aClass529_3) {
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8) + Class430.aString207 + "(100%)", true, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		this.aClass529_5 = Class529.aClass529_4;
		if (!this.aBoolean789 && Class274.aClass258_1 != null) {
			Class274.aClass258_1.method26032();
		}
		if (!this.aBoolean789) {
			for (local249 = 0; local249 < 2048; local249++) {
				@Pc(521) Class132_Sub1_Sub1_Sub1_Sub2 local521 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local249];
				if (local521 != null) {
					local521.aClass585_23 = null;
				}
			}
			for (local249 = 0; local249 < client.aClass93_Sub15Array1.length; local249++) {
				@Pc(538) Class93_Sub15 local538 = client.aClass93_Sub15Array1[local249];
				if (local538 != null) {
					((Class132_Sub1) local538.anObject5).aClass585_23 = null;
				}
			}
		}
		if (!this.aBoolean789) {
			Class700.method36716(true);
		}
		@Pc(556) boolean local556 = false;
		@Pc(564) int local564;
		if (Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2) {
			for (local564 = 0; local564 < this.anInt5248 * 412583631; local564++) {
				if (this.aByteArrayArray18[local564] != null || this.aByteArrayArray21[local564] != null) {
					local556 = true;
					break;
				}
			}
		}
		local564 = Class132_Sub1_Sub1_Sub3.method13301(Class51.aClass93_Sub36_1.aClass166_Sub44_1.method16445()).anInt4204 * -2054577112;
		if (Class694.aClass104_14.method20429()) {
			local564++;
		}
		this.method30536();
		this.method30479();
		this.aClass585_24 = new Class585(Class694.aClass104_14, 9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, local564, local556, Class694.aClass104_14.method20413() > 0);
		this.aClass585_24.method31432(false);
		this.aClass585_24.method31430(client.anInt3536 * -1229702203);
		this.aClass585_24.method31488(this.aHashMap10);
		if (client.anInt3536 * -1229702203 == 0) {
			this.aClass585_24.method31466(null);
		} else {
			this.aClass585_24.method31466(Class707.aClass106_13);
		}
		this.aClass528_1 = new Class528();
		this.aFloat323 = -0.05F + (float) (Math.random() / 10.0D);
		this.aClass142_Sub1_1 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 4, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, false, this.aClass520_3, this.aClass671_2);
		this.aClass142_Sub1_1.method10878();
		this.aClass142_Sub1_1.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
		this.aClass142_Sub1_1.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
		this.aClass142_Sub1_1.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
		this.aClass142_Sub1_1.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
		this.aClass142_Sub1_1.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
		if (this.aClass526_9.method30381()) {
			this.method30483(this.aClass142_Sub1_1, this.aByteArrayArray19);
		} else {
			this.method30482(this.aClass142_Sub1_1, this.aByteArrayArray19);
		}
		if (this.aBoolean789) {
			this.method30481(50);
		}
		this.aClass671_2.method32975(this.anInt5239 * -1096901053 >> 4, this.anInt5242 * -2134504113 >> 4);
		this.aClass671_2.method32987(this);
		if (local556) {
			this.aClass585_24.method31432(true);
			this.aClass142_Sub1_2 = new Class142_Sub1(this.aClass585_24, this.aClass32_Sub14_9, 1, this.anInt5239 * -1096901053, this.anInt5242 * -2134504113, true, this.aClass520_3, this.aClass671_2);
			this.aClass142_Sub1_2.method10878();
			this.aClass142_Sub1_2.anInt1281 = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528() * -822224463;
			this.aClass142_Sub1_2.aBoolean237 = Class51.aClass93_Sub36_1.aClass166_Sub20_1.method15775() == 2;
			this.aClass142_Sub1_2.aBoolean235 = Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1;
			this.aClass142_Sub1_2.aBoolean234 = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16529() == 1;
			this.aClass142_Sub1_2.aBoolean231 = Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15654() == 1;
			if (this.aClass526_9.method30381()) {
				this.method30483(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			} else {
				this.method30482(this.aClass142_Sub1_2, this.aByteArrayArray21);
				if (!this.aBoolean789) {
					Class481.method29753(true);
				}
			}
			this.aClass142_Sub1_2.method10885(0, this.aClass142_Sub1_1.anIntArrayArrayArray14[0]);
			this.aClass142_Sub1_2.method10886(Class694.aClass104_14, null);
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10886(Class694.aClass104_14, local556 ? this.aClass142_Sub1_2.anIntArrayArrayArray14 : (int[][][]) null);
		if (this.aClass526_9.method30381()) {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30485(this.aClass142_Sub1_1, this.aByteArrayArray20);
		} else {
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.method30484(this.aClass142_Sub1_1, this.aByteArrayArray20);
			if (this.aByteArrayArray17 != null) {
				this.method30486();
			}
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		this.aClass142_Sub1_1.method10942(Class694.aClass104_14, local556 ? this.aClass585_24.aClass99Array3[0] : null, null);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		this.aClass142_Sub1_1.method10965(Class694.aClass104_14, false);
		if (this.aBoolean789) {
			this.method30481(75);
		}
		if (!this.aBoolean789) {
			Class481.method29753(true);
		}
		if (local556) {
			this.aClass585_24.method31432(true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			if (this.aClass526_9.method30381()) {
				this.method30485(this.aClass142_Sub1_2, this.aByteArrayArray18);
			} else {
				this.method30484(this.aClass142_Sub1_2, this.aByteArrayArray18);
			}
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass142_Sub1_2.method10942(Class694.aClass104_14, null, this.aClass585_24.aClass99Array2[0]);
			this.aClass142_Sub1_2.method10965(Class694.aClass104_14, true);
			if (!this.aBoolean789) {
				Class481.method29753(true);
			}
			this.aClass585_24.method31432(false);
			if (this.aBoolean789) {
				this.method30481(50);
			}
		}
		this.aClass142_Sub1_1.method10879();
		if (this.aClass142_Sub1_2 != null) {
			this.aClass142_Sub1_2.method10879();
		}
		this.aClass585_24.method31604();
		if (this.aBoolean789) {
			Class305.method26796();
			while (!Class694.aClass104_14.method20514()) {
				this.method30481(1);
			}
		}
		@Pc(1165) boolean local1165 = false;
		if (this.aBoolean789) {
			@Pc(1170) Class532 local1170 = client.aClass532_1;
			this.method30468(local1170);
			Class392.aClass541_1.method30906(local1170);
			local1165 = true;
			Class305.method26796();
			@Pc(1186) Object local1186 = client.anObject13;
			synchronized (client.anObject13) {
				client.aBoolean611 = true;
				try {
					client.anObject13.wait();
				} catch (@Pc(1193) InterruptedException local1193) {
				}
			}
			client.aClass532_1 = this;
			local1170.method30479();
			this.method30478(3);
			this.method30570();
		} else {
			Class274.aClass258_1.method26032();
			this.aClass671_2.method32981();
			Class238.method25800();
		}
		@Pc(1238) int local1238;
		for (local292 = 0; local292 < 4; local292++) {
			for (local319 = 0; local319 < this.anInt5239 * -1096901053; local319++) {
				for (local1238 = 0; local1238 < this.anInt5242 * -2134504113; local1238++) {
					Class518.method30305(local292, local319, local1238);
				}
			}
		}
		for (local292 = 0; local292 < client.aClass567Array1.length; local292++) {
			if (client.aClass567Array1[local292] != null) {
				client.aClass567Array1[local292].method31264();
			}
		}
		Class262.method26173();
		Class371.method28004();
		if (Class343.method27518() == Class555.aClass555_3 && client.aClass175_2.method24356() != null && client.anInt3435 * -849002901 == 3) {
			@Pc(1296) Class93_Sub22 local1296 = Class102.method2592(Class446.aClass446_92, client.aClass175_2.aClass24_2);
			local1296.aClass93_Sub41_Sub2_1.method22395(1057001181);
			client.aClass175_2.method24351(local1296);
		}
		if (!this.aClass526_9.method30381()) {
			local292 = (this.anInt5237 * 562190567 - (this.anInt5239 * -1096901053 >> 4)) / 8;
			local319 = (this.anInt5237 * 562190567 + (this.anInt5239 * -1096901053 >> 4)) / 8;
			local1238 = (this.anInt5249 * 1028227575 - (this.anInt5242 * -2134504113 >> 4)) / 8;
			@Pc(1366) int local1366 = ((this.anInt5242 * -2134504113 >> 4) + this.anInt5249 * 1028227575) / 8;
			for (@Pc(1370) int local1370 = local292 - 1; local1370 <= local319 + 1; local1370++) {
				for (@Pc(1379) int local1379 = local1238 - 1; local1379 <= local1366 + 1; local1379++) {
					if (local1370 < local292 || local1370 > local319 || local1379 < local1238 || local1379 > local1366) {
						Class166_Sub15.aClass497_59.method30050(this.method30511(local1370, local1379));
					}
				}
			}
		}
		@Pc(1417) long local1417 = Class305.method26796() - this.aLong287 * -8467614189479269767L;
		if (client.anInt3435 * -849002901 == 10) {
			Class481.method29756(4);
		} else if (client.anInt3435 * -849002901 == 6) {
			Class481.method29756(13);
		} else if (client.anInt3435 * -849002901 == 16) {
			Class481.method29756(15);
		} else if (client.anInt3435 * -849002901 == 8) {
			Class481.method29756(0);
		} else {
			Class481.method29756(18);
			if (client.aClass175_2.method24356() != null) {
				@Pc(1466) Class93_Sub22 local1466 = Class102.method2592(Class446.aClass446_81, client.aClass175_2.aClass24_2);
				local1466.aClass93_Sub41_Sub2_1.method22395((int) local1417);
				client.aClass175_2.method24351(local1466);
			}
		}
		if (this.aBoolean790) {
			Class314.method26939(Long.toString(Class305.method26796() - this.aLong286 * 1216641514968376055L));
			this.aBoolean790 = false;
		}
		if (local1165) {
			@Pc(1497) Object local1497 = client.anObject14;
			synchronized (client.anObject14) {
				client.anObject14.notify();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "ao", descriptor = "(II)V", line = 1032)
	void method30481(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "ef", descriptor = "(I)V", line = 1032)
	void method30586(@OriginalArg(0) int arg0) {
		try {
			Thread.sleep((long) arg0);
		} catch (@Pc(4) InterruptedException local4) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "aj", descriptor = "(Lclient!aih;[[BI)V", line = 1038)
	void method30482(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray463[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray463[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5623 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray463[local4] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(120) int local120 = (this.anIntArray463[local4] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5249 * 1028227575 < 800) {
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10909(local105, local120, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "et", descriptor = "(Lclient!aih;[[B)V", line = 1038)
	void method30554(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray463[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray463[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5623 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray463[local4] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(120) int local120 = (this.anIntArray463[local4] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5249 * 1028227575 < 800) {
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10909(local105, local120, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ea", descriptor = "(Lclient!aih;[[B)V", line = 1038)
	void method30581(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray463[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray463[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5623 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray463[local4] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(120) int local120 = (this.anIntArray463[local4] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5249 * 1028227575 < 800) {
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10909(local105, local120, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ew", descriptor = "(Lclient!aih;[[B)V", line = 1038)
	void method30589(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(2) int local2 = arg1.length;
		@Pc(4) int local4;
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(11) byte[] local11 = arg1[local4];
			if (local11 != null) {
				@Pc(18) Class93_Sub41 local18 = new Class93_Sub41(local11);
				@Pc(25) int local25 = this.anIntArray463[local4] >> 8;
				@Pc(32) int local32 = this.anIntArray463[local4] & 0xFF;
				@Pc(42) int local42 = local25 * 64 - this.aClass611_1.anInt5623 * 270611681;
				@Pc(52) int local52 = local32 * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10912(local18, local42, local52, this.aClass611_1.anInt5623 * 270611681, this.aClass611_1.anInt5624 * -1994307635);
				arg0.method10960(Class694.aClass104_14, local18, local42, local52);
			}
		}
		for (local4 = 0; local4 < local2; local4++) {
			@Pc(105) int local105 = (this.anIntArray463[local4] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
			@Pc(120) int local120 = (this.anIntArray463[local4] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
			@Pc(124) byte[] local124 = arg1[local4];
			if (local124 == null && this.anInt5249 * 1028227575 < 800) {
				if (!this.aBoolean789 && Class274.aClass258_1 != null) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10909(local105, local120, 64, 64);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "en", descriptor = "(Lclient!aih;[[B)V", line = 1064)
	void method30475(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ay", descriptor = "(Lclient!aih;[[BI)V", line = 1064)
	void method30483(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "er", descriptor = "(Lclient!aih;[[B)V", line = 1064)
	void method30590(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(1) int local1;
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(42) int local42;
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									@Pc(108) Class93_Sub41 local108 = new Class93_Sub41(arg1[local86]);
									arg0.method10903(local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									arg0.method10963(Class694.aClass104_14, local108, local1, local15 * 8, local25 * 8, local51, local68, local74, local62);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 == -1) {
						arg0.method10881(local1, local15 * 8, local25 * 8, 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "(Lclient!aih;[[BB)V", line = 1103)
	void method30484(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5248 * 412583631; local1++) {
			@Pc(11) byte[] local11 = arg1[local1];
			if (local11 != null) {
				@Pc(29) int local29 = (this.anIntArray463[local1] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681;
				@Pc(44) int local44 = (this.anIntArray463[local1] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635;
				if (!this.aBoolean789) {
					Class274.aClass258_1.method26032();
				}
				arg0.method10976(Class694.aClass104_14, local11, local29, local44);
				if (this.aBoolean789) {
					this.method30481(10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "az", descriptor = "(Lclient!aih;[[BS)V", line = 1116)
	void method30485(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62);
									break;
								}
							}
						}
					}
					if (this.aBoolean789) {
						this.method30481(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "fg", descriptor = "(Lclient!aih;[[B)V", line = 1116)
	void method30527(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62);
									break;
								}
							}
						}
					}
					if (this.aBoolean789) {
						this.method30481(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "fm", descriptor = "(Lclient!aih;[[B)V", line = 1116)
	void method30534(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62);
									break;
								}
							}
						}
					}
					if (this.aBoolean789) {
						this.method30481(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "eb", descriptor = "(Lclient!aih;[[B)V", line = 1116)
	void method30592(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62);
									break;
								}
							}
						}
					}
					if (this.aBoolean789) {
						this.method30481(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ex", descriptor = "(Lclient!aih;[[B)V", line = 1116)
	void method30593(@OriginalArg(0) Class142_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt1292 * 604655629; local1++) {
			if (!this.aBoolean789) {
				Class274.aClass258_1.method26032();
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt5239 * -1096901053 >> 3; local15++) {
				for (@Pc(25) int local25 = 0; local25 < this.anInt5242 * -2134504113 >> 3; local25++) {
					@Pc(42) int local42 = this.anIntArrayArrayArray16[local1][local15][local25];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0.aBoolean236 || local51 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = local74 / 8 + (local68 / 8 << 8);
							for (@Pc(86) int local86 = 0; local86 < this.anIntArray463.length; local86++) {
								if (local84 == this.anIntArray463[local86] && arg1[local86] != null) {
									arg0.method10956(Class694.aClass104_14, arg1[local86], local1, local15 * 8, local25 * 8, local51, (local68 & 0x7) * 8, (local74 & 0x7) * 8, local62);
									break;
								}
							}
						}
					}
					if (this.aBoolean789) {
						this.method30481(5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "aa", descriptor = "(B)V", line = 1143)
	void method30486() {
		@Pc(3) int local3 = this.aByteArrayArray17.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.aByteArrayArray17[local5] != null) {
				@Pc(16) int local16 = -1;
				for (@Pc(18) int local18 = 0; local18 < client.anInt3508 * -226108971; local18++) {
					if (client.anIntArray308[local18] == this.anIntArray463[local5]) {
						local16 = local18;
						break;
					}
				}
				if (local16 == -1) {
					client.anIntArray308[client.anInt3508 * -226108971] = this.anIntArray463[local5];
					local16 = (client.anInt3508 += 1216911229) * -226108971 - 1;
				}
				@Pc(66) Class93_Sub41 local66 = new Class93_Sub41(this.aByteArrayArray17[local5]);
				@Pc(68) int local68 = 0;
				while (local66.anInt3070 * 212851357 < this.aByteArrayArray17[local5].length && local68 < 511 && client.anInt3540 * 568731113 < 1023) {
					@Pc(94) int local94 = local16 | local68++ << 6;
					@Pc(98) int local98 = local66.method22415();
					@Pc(102) int local102 = local98 >> 14;
					@Pc(108) int local108 = local98 >> 7 & 0x3F;
					@Pc(112) int local112 = local98 & 0x3F;
					@Pc(129) int local129 = local108 + ((this.anIntArray463[local5] >> 8) * 64 - this.aClass611_1.anInt5623 * 270611681);
					@Pc(146) int local146 = (this.anIntArray463[local5] & 0xFF) * 64 - this.aClass611_1.anInt5624 * -1994307635 + local112;
					@Pc(154) Class336 local154 = (Class336) Class162.aClass32_Sub3_2.method18261(local66.method22415());
					@Pc(160) Class93_Sub15 local160 = (Class93_Sub15) client.aClass16_18.method215((long) local94);
					if (local160 == null && (local154.aByte137 & 0x1) > 0 && local129 >= 0 && local129 + local154.anInt4154 * 447008399 < this.anInt5239 * -1096901053 && local146 >= 0 && local154.anInt4154 * 447008399 + local146 < this.anInt5242 * -2134504113) {
						@Pc(199) Class132_Sub1_Sub1_Sub1_Sub1 local199 = new Class132_Sub1_Sub1_Sub1_Sub1(this.aClass585_24);
						local199.anInt2768 = local94 * 171759809;
						@Pc(209) Class93_Sub15 local209 = new Class93_Sub15(local199);
						client.aClass16_18.method221(local209, (long) local94);
						client.aClass93_Sub15Array1[(client.anInt3488 += 436180911) * -1814159537 - 1] = local209;
						client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local94;
						local199.anInt2786 = client.anInt3485 * 632844529;
						local199.method18589(local154);
						local199.method19961(local199.aClass336_1.anInt4154 * 447008399);
						local199.anInt2788 = (local199.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
						local199.method19952(local199.aClass336_1.aClass706_1.method36737().method36920() << 11 & 0x3FFF, true);
						local199.method18592(local102, local129, local146, true, local199.method19997());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "ld", descriptor = "(Ljava/lang/String;Lclient!yf;I)[I", line = 7121)
	static final int[] method30597(@OriginalArg(0) String arg0, @OriginalArg(1) Class681 arg1) {
		@Pc(1) int[] local1 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			@Pc(25) int local25 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
			if (local25 > 0) {
				local1 = new int[local25];
				while (local25-- > 0) {
					local1[local25] = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!rl", name = "xs", descriptor = "(Lclient!yf;B)V", line = 9181)
	static final void method30598(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class173.method23804(local13, local28);
	}

	@OriginalMember(owner = "client!rl", name = "aco", descriptor = "(Lclient!yf;I)V", line = 10042)
	static final void method30601(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4644 * 2138173021;
	}

	@OriginalMember(owner = "client!rl", name = "aik", descriptor = "(Lclient!yf;I)V", line = 11345)
	static final void method30599(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local23 == -1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30267(local13).method22362((char) local23);
		}
	}

	@OriginalMember(owner = "client!rl", name = "bfl", descriptor = "(Lclient!yf;B)V", line = 15088)
	static final void method30600(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
