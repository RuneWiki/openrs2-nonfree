package com.jagex;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abt")
public class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!abt", name = "at", descriptor = "F")
	static final float aFloat41 = 0.35F;

	@OriginalMember(owner = "client!abt", name = "ak", descriptor = "I")
	static final int anInt372 = 1;

	@OriginalMember(owner = "client!abt", name = "aa", descriptor = "I")
	static final int anInt373 = 2;

	@OriginalMember(owner = "client!abt", name = "an", descriptor = "I")
	static final int anInt374 = 8;

	@OriginalMember(owner = "client!abt", name = "as", descriptor = "I")
	static final int anInt376 = 32;

	@OriginalMember(owner = "client!abt", name = "aq", descriptor = "I")
	static final int anInt378 = 5121;

	@OriginalMember(owner = "client!abt", name = "k", descriptor = "I")
	static final int anInt380 = 100663296;

	@OriginalMember(owner = "client!abt", name = "az", descriptor = "I")
	static final int anInt381 = 4;

	@OriginalMember(owner = "client!abt", name = "al", descriptor = "I")
	static final int anInt382 = 7;

	@OriginalMember(owner = "client!abt", name = "ao", descriptor = "I")
	static final int anInt383 = 128;

	@OriginalMember(owner = "client!abt", name = "bd", descriptor = "I")
	static final int anInt385 = 768;

	@OriginalMember(owner = "client!abt", name = "au", descriptor = "I")
	static final int anInt386 = 7681;

	@OriginalMember(owner = "client!abt", name = "ay", descriptor = "I")
	static final int anInt387 = 8448;

	@OriginalMember(owner = "client!abt", name = "ag", descriptor = "I")
	static final int anInt388 = 260;

	@OriginalMember(owner = "client!abt", name = "ad", descriptor = "I")
	static final int anInt389 = 34168;

	@OriginalMember(owner = "client!abt", name = "aw", descriptor = "I")
	static final int anInt390 = 5890;

	@OriginalMember(owner = "client!abt", name = "bp", descriptor = "I")
	static final int anInt392 = 770;

	@OriginalMember(owner = "client!abt", name = "ai", descriptor = "I")
	static final int anInt393 = 32993;

	@OriginalMember(owner = "client!abt", name = "bs", descriptor = "I")
	static final int anInt394 = 0;

	@OriginalMember(owner = "client!abt", name = "am", descriptor = "I")
	static final int anInt395 = 34023;

	@OriginalMember(owner = "client!abt", name = "bf", descriptor = "I")
	static final int anInt396 = 2;

	@OriginalMember(owner = "client!abt", name = "bk", descriptor = "I")
	static final int anInt397 = 1;

	@OriginalMember(owner = "client!abt", name = "bg", descriptor = "I")
	static final int anInt398 = 2;

	@OriginalMember(owner = "client!abt", name = "br", descriptor = "I")
	static final int anInt399 = 3;

	@OriginalMember(owner = "client!abt", name = "bb", descriptor = "I")
	static final int anInt400 = 1;

	@OriginalMember(owner = "client!abt", name = "by", descriptor = "I")
	static final int anInt401 = 2;

	@OriginalMember(owner = "client!abt", name = "bi", descriptor = "I")
	static final int anInt402 = 8;

	@OriginalMember(owner = "client!abt", name = "bu", descriptor = "I")
	static final int anInt403 = 55;

	@OriginalMember(owner = "client!abt", name = "bt", descriptor = "I")
	static final int anInt405 = 0;

	@OriginalMember(owner = "client!abt", name = "bm", descriptor = "I")
	static final int anInt411 = 1;

	@OriginalMember(owner = "client!abt", name = "aj", descriptor = "I")
	static final int anInt414 = 16;

	@OriginalMember(owner = "client!abt", name = "bl", descriptor = "I")
	static final int anInt418 = 4;

	@OriginalMember(owner = "client!abt", name = "bw", descriptor = "I")
	static final int anInt419 = 34166;

	@OriginalMember(owner = "client!abt", name = "av", descriptor = "I")
	static final int anInt423 = 5123;

	@OriginalMember(owner = "client!abt", name = "ax", descriptor = "I")
	static final int anInt427 = 5126;

	@OriginalMember(owner = "client!abt", name = "af", descriptor = "I")
	static final int anInt428 = 0;

	@OriginalMember(owner = "client!abt", name = "ac", descriptor = "I")
	static final int anInt430 = 34167;

	@OriginalMember(owner = "client!abt", name = "ab", descriptor = "I")
	static final int anInt440 = -2;

	@OriginalMember(owner = "client!abt", name = "ar", descriptor = "I")
	static final int anInt442 = 34165;

	@OriginalMember(owner = "client!abt", name = "ap", descriptor = "I")
	static final int anInt447 = -1;

	@OriginalMember(owner = "client!abt", name = "ae", descriptor = "I")
	static final int anInt448 = 34479;

	@OriginalMember(owner = "client!abt", name = "ba", descriptor = "I")
	static final int anInt449 = 7;

	@OriginalMember(owner = "client!abt", name = "ah", descriptor = "I")
	static final int anInt450 = 4;

	@OriginalMember(owner = "client!abt", name = "ci", descriptor = "[I")
	static int[] anIntArray49 = new int[1000];

	@OriginalMember(owner = "client!abt", name = "ea", descriptor = "I")
	static int anInt426 = 4;

	@OriginalMember(owner = "client!abt", name = "hn", descriptor = "[F")
	static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!abt", name = "hw", descriptor = "[F")
	static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!abt", name = "fm", descriptor = "I")
	int anInt377;

	@OriginalMember(owner = "client!abt", name = "fp", descriptor = "I")
	int anInt379;

	@OriginalMember(owner = "client!abt", name = "gn", descriptor = "I")
	int anInt384;

	@OriginalMember(owner = "client!abt", name = "dd", descriptor = "F")
	float aFloat42;

	@OriginalMember(owner = "client!abt", name = "ft", descriptor = "I")
	int anInt391;

	@OriginalMember(owner = "client!abt", name = "hx", descriptor = "Lclient!bc;")
	Class88 aClass88_9;

	@OriginalMember(owner = "client!abt", name = "eu", descriptor = "F")
	float aFloat44;

	@OriginalMember(owner = "client!abt", name = "em", descriptor = "I")
	int anInt406;

	@OriginalMember(owner = "client!abt", name = "fw", descriptor = "Lclient!dz;")
	Class139 aClass139_1;

	@OriginalMember(owner = "client!abt", name = "cg", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!abt", name = "cc", descriptor = "I")
	int anInt409;

	@OriginalMember(owner = "client!abt", name = "cs", descriptor = "I")
	int anInt410;

	@OriginalMember(owner = "client!abt", name = "da", descriptor = "F")
	float aFloat45;

	@OriginalMember(owner = "client!abt", name = "ch", descriptor = "J")
	long aLong11;

	@OriginalMember(owner = "client!abt", name = "ca", descriptor = "I")
	int anInt412;

	@OriginalMember(owner = "client!abt", name = "cr", descriptor = "I")
	int anInt413;

	@OriginalMember(owner = "client!abt", name = "cw", descriptor = "Z")
	boolean aBoolean62;

	@OriginalMember(owner = "client!abt", name = "dv", descriptor = "I")
	int anInt416;

	@OriginalMember(owner = "client!abt", name = "gj", descriptor = "Z")
	boolean aBoolean63;

	@OriginalMember(owner = "client!abt", name = "dh", descriptor = "B")
	byte aByte2;

	@OriginalMember(owner = "client!abt", name = "db", descriptor = "Z")
	boolean aBoolean64;

	@OriginalMember(owner = "client!abt", name = "dp", descriptor = "Z")
	boolean aBoolean65;

	@OriginalMember(owner = "client!abt", name = "ec", descriptor = "I")
	int anInt417;

	@OriginalMember(owner = "client!abt", name = "hk", descriptor = "Z")
	boolean aBoolean66;

	@OriginalMember(owner = "client!abt", name = "ep", descriptor = "Z")
	boolean aBoolean67;

	@OriginalMember(owner = "client!abt", name = "ce", descriptor = "I")
	int anInt420;

	@OriginalMember(owner = "client!abt", name = "dz", descriptor = "F")
	float aFloat46;

	@OriginalMember(owner = "client!abt", name = "de", descriptor = "F")
	float aFloat47;

	@OriginalMember(owner = "client!abt", name = "dn", descriptor = "I")
	int anInt421;

	@OriginalMember(owner = "client!abt", name = "fc", descriptor = "[Lclient!bf;")
	Class4[] aClass4Array1;

	@OriginalMember(owner = "client!abt", name = "fb", descriptor = "F")
	float aFloat51;

	@OriginalMember(owner = "client!abt", name = "df", descriptor = "Z")
	boolean aBoolean68;

	@OriginalMember(owner = "client!abt", name = "gi", descriptor = "Z")
	boolean aBoolean69;

	@OriginalMember(owner = "client!abt", name = "ew", descriptor = "I")
	int anInt425;

	@OriginalMember(owner = "client!abt", name = "ez", descriptor = "Z")
	boolean aBoolean70;

	@OriginalMember(owner = "client!abt", name = "hs", descriptor = "Lclient!bu;")
	Interface5 anInterface5_3;

	@OriginalMember(owner = "client!abt", name = "ge", descriptor = "I")
	int anInt429;

	@OriginalMember(owner = "client!abt", name = "gb", descriptor = "Z")
	boolean aBoolean71;

	@OriginalMember(owner = "client!abt", name = "fn", descriptor = "I")
	int anInt431;

	@OriginalMember(owner = "client!abt", name = "fg", descriptor = "F")
	float aFloat56;

	@OriginalMember(owner = "client!abt", name = "gz", descriptor = "Z")
	boolean aBoolean72;

	@OriginalMember(owner = "client!abt", name = "fv", descriptor = "Z")
	boolean aBoolean73;

	@OriginalMember(owner = "client!abt", name = "fo", descriptor = "Lclient!cq;")
	Interface7 anInterface7_2;

	@OriginalMember(owner = "client!abt", name = "fl", descriptor = "Lclient!bu;")
	Interface5 anInterface5_4;

	@OriginalMember(owner = "client!abt", name = "ff", descriptor = "I")
	int anInt437;

	@OriginalMember(owner = "client!abt", name = "fq", descriptor = "I")
	int anInt441;

	@OriginalMember(owner = "client!abt", name = "gy", descriptor = "Ljava/lang/String;")
	String aString18;

	@OriginalMember(owner = "client!abt", name = "fi", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!abt", name = "fr", descriptor = "Lclient!abi;")
	Class18_Sub1 aClass18_Sub1_1;

	@OriginalMember(owner = "client!abt", name = "gf", descriptor = "Ljava/lang/String;")
	String aString19;

	@OriginalMember(owner = "client!abt", name = "cu", descriptor = "I")
	int anInt443;

	@OriginalMember(owner = "client!abt", name = "gd", descriptor = "Z")
	boolean aBoolean76;

	@OriginalMember(owner = "client!abt", name = "gm", descriptor = "I")
	int anInt444;

	@OriginalMember(owner = "client!abt", name = "en", descriptor = "I")
	int anInt445;

	@OriginalMember(owner = "client!abt", name = "gv", descriptor = "I")
	int anInt446;

	@OriginalMember(owner = "client!abt", name = "gq", descriptor = "Z")
	boolean aBoolean78;

	@OriginalMember(owner = "client!abt", name = "gs", descriptor = "Z")
	boolean aBoolean84;

	@OriginalMember(owner = "client!abt", name = "gc", descriptor = "Z")
	boolean aBoolean85;

	@OriginalMember(owner = "client!abt", name = "gl", descriptor = "Z")
	boolean aBoolean87;

	@OriginalMember(owner = "client!abt", name = "gu", descriptor = "Z")
	boolean aBoolean88;

	@OriginalMember(owner = "client!abt", name = "gg", descriptor = "Z")
	boolean aBoolean89;

	@OriginalMember(owner = "client!abt", name = "fs", descriptor = "Z")
	boolean aBoolean91;

	@OriginalMember(owner = "client!abt", name = "ct", descriptor = "I")
	int anInt452;

	@OriginalMember(owner = "client!abt", name = "hb", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_1;

	@OriginalMember(owner = "client!abt", name = "hz", descriptor = "Lclient!bc;")
	Class88 aClass88_10;

	@OriginalMember(owner = "client!abt", name = "fe", descriptor = "I")
	int anInt453;

	@OriginalMember(owner = "client!abt", name = "cf", descriptor = "Z")
	boolean aBoolean92;

	@OriginalMember(owner = "client!abt", name = "fa", descriptor = "Z")
	boolean aBoolean93;

	@OriginalMember(owner = "client!abt", name = "bv", descriptor = "Lclient!bq;")
	Class99 aClass99_1 = new Class99();

	@OriginalMember(owner = "client!abt", name = "bz", descriptor = "Lclient!mq;")
	Class328 aClass328_9 = new Class328();

	@OriginalMember(owner = "client!abt", name = "ck", descriptor = "Lclient!mq;")
	Class328 aClass328_10 = new Class328();

	@OriginalMember(owner = "client!abt", name = "cm", descriptor = "Lclient!mu;")
	Class332 aClass332_5 = new Class332();

	@OriginalMember(owner = "client!abt", name = "cv", descriptor = "I")
	int anInt407 = 8;

	@OriginalMember(owner = "client!abt", name = "cl", descriptor = "I")
	int anInt408 = 3;

	@OriginalMember(owner = "client!abt", name = "cq", descriptor = "Z")
	boolean aBoolean61 = false;

	@OriginalMember(owner = "client!abt", name = "cp", descriptor = "Lclient!wk;")
	Class553 aClass553_11 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cx", descriptor = "Lclient!wk;")
	Class553 aClass553_4 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cy", descriptor = "Lclient!wk;")
	Class553 aClass553_5 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cb", descriptor = "Lclient!wk;")
	Class553 aClass553_6 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cz", descriptor = "Lclient!wk;")
	Class553 aClass553_10 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cn", descriptor = "Lclient!wk;")
	Class553 aClass553_7 = new Class553();

	@OriginalMember(owner = "client!abt", name = "co", descriptor = "Lclient!wk;")
	Class553 aClass553_8 = new Class553();

	@OriginalMember(owner = "client!abt", name = "cd", descriptor = "Lclient!wk;")
	Class553 aClass553_9 = new Class553();

	@OriginalMember(owner = "client!abt", name = "dk", descriptor = "Lclient!mu;")
	Class332 aClass332_6 = new Class332();

	@OriginalMember(owner = "client!abt", name = "dy", descriptor = "Lclient!mq;")
	Class328 aClass328_11 = new Class328();

	@OriginalMember(owner = "client!abt", name = "dg", descriptor = "Lclient!mq;")
	Class328 aClass328_12 = new Class328();

	@OriginalMember(owner = "client!abt", name = "dq", descriptor = "Lclient!mq;")
	Class328 aClass328_15 = new Class328();

	@OriginalMember(owner = "client!abt", name = "ds", descriptor = "Lclient!mq;")
	Class328 aClass328_8 = new Class328();

	@OriginalMember(owner = "client!abt", name = "dr", descriptor = "Lclient!mq;")
	Class328 aClass328_13 = new Class328();

	@OriginalMember(owner = "client!abt", name = "dc", descriptor = "[[F")
	float[][] aFloatArrayArray8 = new float[6][4];

	@OriginalMember(owner = "client!abt", name = "dt", descriptor = "[F")
	float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!abt", name = "dl", descriptor = "F")
	float aFloat48 = 0.0F;

	@OriginalMember(owner = "client!abt", name = "dj", descriptor = "F")
	float aFloat43 = 1.0F;

	@OriginalMember(owner = "client!abt", name = "dx", descriptor = "F")
	float aFloat49 = 0.0F;

	@OriginalMember(owner = "client!abt", name = "dm", descriptor = "F")
	float aFloat55 = -1.0F;

	@OriginalMember(owner = "client!abt", name = "dw", descriptor = "Lclient!mu;")
	Class332 aClass332_4 = new Class332();

	@OriginalMember(owner = "client!abt", name = "du", descriptor = "Lclient!mq;")
	Class328 aClass328_14 = new Class328();

	@OriginalMember(owner = "client!abt", name = "do", descriptor = "Lclient!mq;")
	Class328 aClass328_7 = new Class328();

	@OriginalMember(owner = "client!abt", name = "di", descriptor = "[F")
	float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!abt", name = "ee", descriptor = "Z")
	boolean aBoolean59 = true;

	@OriginalMember(owner = "client!abt", name = "ex", descriptor = "I")
	int anInt422 = 0;

	@OriginalMember(owner = "client!abt", name = "eb", descriptor = "I")
	int anInt375 = 0;

	@OriginalMember(owner = "client!abt", name = "ef", descriptor = "I")
	int anInt415 = 0;

	@OriginalMember(owner = "client!abt", name = "ey", descriptor = "I")
	int anInt424 = 0;

	@OriginalMember(owner = "client!abt", name = "er", descriptor = "I")
	int anInt435 = 0;

	@OriginalMember(owner = "client!abt", name = "ej", descriptor = "I")
	int anInt436 = 0;

	@OriginalMember(owner = "client!abt", name = "ed", descriptor = "[F")
	float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!abt", name = "eq", descriptor = "[F")
	float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!abt", name = "ev", descriptor = "[F")
	float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!abt", name = "et", descriptor = "[F")
	float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!abt", name = "eo", descriptor = "I")
	int anInt371 = -1;

	@OriginalMember(owner = "client!abt", name = "ek", descriptor = "F")
	float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!abt", name = "ei", descriptor = "F")
	float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!abt", name = "el", descriptor = "F")
	float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!abt", name = "eg", descriptor = "F")
	float aFloat54 = -1.0F;

	@OriginalMember(owner = "client!abt", name = "es", descriptor = "F")
	float aFloat61 = -1.0F;

	@OriginalMember(owner = "client!abt", name = "eh", descriptor = "[Lclient!afz;")
	Class3_Sub15[] aClass3_Sub15Array1 = new Class3_Sub15[anInt426];

	@OriginalMember(owner = "client!abt", name = "fx", descriptor = "I")
	int anInt432 = -1;

	@OriginalMember(owner = "client!abt", name = "fh", descriptor = "I")
	int anInt433 = -1;

	@OriginalMember(owner = "client!abt", name = "fu", descriptor = "I")
	int anInt434 = 0;

	@OriginalMember(owner = "client!abt", name = "fd", descriptor = "F")
	float aFloat58 = 1.0F;

	@OriginalMember(owner = "client!abt", name = "fz", descriptor = "F")
	float aFloat57 = 0.0F;

	@OriginalMember(owner = "client!abt", name = "fy", descriptor = "Z")
	boolean aBoolean74 = false;

	@OriginalMember(owner = "client!abt", name = "fk", descriptor = "I")
	int anInt438 = 8448;

	@OriginalMember(owner = "client!abt", name = "fj", descriptor = "I")
	int anInt439 = 8448;

	@OriginalMember(owner = "client!abt", name = "hg", descriptor = "F")
	float aFloat59 = -1.0F;

	@OriginalMember(owner = "client!abt", name = "hc", descriptor = "F")
	float aFloat60 = -1.0F;

	@OriginalMember(owner = "client!abt", name = "hd", descriptor = "[Lclient!abk;")
	Class20_Sub1[] aClass20_Sub1Array1 = new Class20_Sub1[8];

	@OriginalMember(owner = "client!abt", name = "ho", descriptor = "[Lclient!abk;")
	Class20_Sub1[] aClass20_Sub1Array2 = new Class20_Sub1[8];

	@OriginalMember(owner = "client!abt", name = "hy", descriptor = "Lclient!anx;")
	Class3_Sub41_Sub2 aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(8192);

	@OriginalMember(owner = "client!abt", name = "hr", descriptor = "[I")
	int[] anIntArray50 = new int[1];

	@OriginalMember(owner = "client!abt", name = "hf", descriptor = "[I")
	int[] anIntArray51 = new int[1];

	@OriginalMember(owner = "client!abt", name = "hp", descriptor = "[I")
	int[] anIntArray52 = new int[1];

	@OriginalMember(owner = "client!abt", name = "hq", descriptor = "[B")
	final byte[] aByteArray6 = new byte[16384];

	@OriginalMember(owner = "client!abt", name = "bc", descriptor = "I")
	int anInt404;

	@OriginalMember(owner = "client!abt", name = "bo", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL1;

	@OriginalMember(owner = "client!abt", name = "ha", descriptor = "I")
	final int anInt451;

	@OriginalMember(owner = "client!abt", name = "gp", descriptor = "Z")
	boolean aBoolean75;

	@OriginalMember(owner = "client!abt", name = "gh", descriptor = "Z")
	boolean aBoolean77;

	@OriginalMember(owner = "client!abt", name = "gt", descriptor = "Z")
	boolean aBoolean79;

	@OriginalMember(owner = "client!abt", name = "ga", descriptor = "Z")
	boolean aBoolean80;

	@OriginalMember(owner = "client!abt", name = "gr", descriptor = "Z")
	boolean aBoolean81;

	@OriginalMember(owner = "client!abt", name = "gk", descriptor = "Z")
	boolean aBoolean83;

	@OriginalMember(owner = "client!abt", name = "go", descriptor = "Z")
	boolean aBoolean60;

	@OriginalMember(owner = "client!abt", name = "gw", descriptor = "Z")
	boolean aBoolean86;

	@OriginalMember(owner = "client!abt", name = "gx", descriptor = "Z")
	boolean aBoolean82;

	@OriginalMember(owner = "client!abt", name = "hi", descriptor = "Z")
	boolean aBoolean90;

	@OriginalMember(owner = "client!abt", name = "bn", descriptor = "Lclient!cj;")
	final Class112 aClass112_1;

	@OriginalMember(owner = "client!abt", name = "cj", descriptor = "Lclient!cm;")
	Class115 aClass115_1;

	@OriginalMember(owner = "client!abt", name = "bx", descriptor = "Lclient!ck;")
	Class113 aClass113_1;

	@OriginalMember(owner = "client!abt", name = "bh", descriptor = "Lclient!alx;")
	Class3_Sub9_Sub2 aClass3_Sub9_Sub2_1;

	@OriginalMember(owner = "client!abt", name = "bj", descriptor = "Lclient!aly;")
	Class3_Sub9_Sub3 aClass3_Sub9_Sub3_1;

	@OriginalMember(owner = "client!abt", name = "bq", descriptor = "Lclient!alv;")
	Class3_Sub9_Sub1 aClass3_Sub9_Sub1_1;

	@OriginalMember(owner = "client!abt", name = "be", descriptor = "Lclient!by;")
	Class104 aClass104_1;

	@OriginalMember(owner = "client!abt", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;I)V", line = 227)
	Class21_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3) {
		super(arg1, arg2);
		try {
			this.anInt404 = arg3;
			Class289.method25518().method27797("jaclib");
			Class289.method25518().method27797("jaggl");
			this.anOpenGL1 = new OpenGL();
			@Pc(291) long local291 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt404);
			if (local291 == 0L) {
				throw new RuntimeException("");
			}
			this.method4100();
			@Pc(305) int local305 = this.method4122();
			if (local305 != 0) {
				throw new RuntimeException("");
			}
			this.anInt451 = this.aBoolean63 ? 33639 : 5121;
			this.aBoolean75 = this.aString18.indexOf("radeon") != -1;
			@Pc(341) boolean local341 = this.aString19.indexOf("intel") != -1;
			@Pc(343) boolean local343 = false;
			@Pc(345) boolean local345 = false;
			@Pc(347) int local347 = 0;
			if (this.aBoolean75 || local341) {
				@Pc(361) String[] local361 = Class230.method24546(this.aString18.replace('/', ' '), ' ');
				for (@Pc(363) int local363 = 0; local363 < local361.length; local363++) {
					@Pc(371) String local371 = local361[local363];
					try {
						if (local371.length() > 0) {
							if (local371.charAt(0) == 'x' && local371.length() >= 3 && Class469.method28756(local371.substring(1, 3))) {
								local371 = local371.substring(1);
								local345 = true;
							}
							if (local371.equals("hd")) {
								local343 = true;
							} else {
								if (local371.startsWith("hd")) {
									local371 = local371.substring(2);
									local343 = true;
								}
								if (local371.length() >= 4 && Class469.method28756(local371.substring(0, 4))) {
									local347 = Class70.method33883(local371.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(435) Exception local435) {
					}
				}
			}
			if (this.anInt404 != 0 && local341 && !local343) {
				throw new RuntimeException_Sub2("");
			}
			if (this.aBoolean75 || local341) {
				if (!local341) {
					if (!local345 && !local343) {
						if (local347 >= 7000 && local347 <= 7999) {
							this.aBoolean81 = false;
						}
						if (local347 >= 7000 && local347 <= 9250) {
							this.aBoolean83 = false;
						}
					}
					if (!local343 || local347 < 4000) {
						this.aBoolean60 = false;
					}
					this.aBoolean86 &= this.anOpenGL1.method25098("GL_ARB_half_float_pixel");
					this.aBoolean82 = this.aBoolean81;
				} else if (!local343) {
					this.aBoolean77 = false;
					this.aBoolean79 = false;
					this.aBoolean80 = false;
				}
			}
			this.aBoolean90 = !this.aString19.equals("s3 graphics");
			if (this.aBoolean81) {
				try {
					@Pc(527) int[] local527 = new int[1];
					OpenGL.glGenBuffersARB(1, local527, 0);
				} catch (@Pc(533) Throwable local533) {
					throw new RuntimeException("");
				}
			}
			Class5.method743(false, true);
			this.aBoolean61 = true;
			this.aClass112_1 = new Class112(this, this.anInterface11_6);
			this.method4025();
			this.aClass115_1 = new Class115(this);
			this.aClass113_1 = new Class113(this);
			if (!this.aBoolean76 && this.aClass113_1.method22033()) {
				this.aClass3_Sub9_Sub2_1 = new Class3_Sub9_Sub2(this);
				if (!this.aClass3_Sub9_Sub2_1.method18571()) {
					this.aClass3_Sub9_Sub2_1.method18588();
					this.aClass3_Sub9_Sub2_1 = null;
				}
				this.aClass3_Sub9_Sub3_1 = new Class3_Sub9_Sub3(this);
				if (!this.aClass3_Sub9_Sub3_1.method18627()) {
					this.aClass3_Sub9_Sub3_1.method18588();
					this.aClass3_Sub9_Sub3_1 = null;
				}
				this.aClass3_Sub9_Sub1_1 = new Class3_Sub9_Sub1(this);
				if (!this.aClass3_Sub9_Sub1_1.method18493()) {
					this.aClass3_Sub9_Sub1_1.method18588();
					this.aClass3_Sub9_Sub1_1 = null;
				}
			} else {
				this.aClass113_1.method22032();
				this.aClass113_1 = null;
			}
			this.method17040(arg0, new Class19_Sub2_Sub3(this, arg0, local291));
			this.method17042(arg0);
			this.aClass104_1 = new Class104(this);
			this.method4024();
			this.method17302();
			if (this.aClass113_1 != null) {
				this.method4046();
				this.method4059();
			}
		} catch (@Pc(664) Throwable local664) {
			local664.printStackTrace();
			this.method17020();
			if (local664 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local664;
			} else if (local664 instanceof RuntimeException_Sub2) {
				throw (RuntimeException_Sub2) local664;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@OriginalMember(owner = "client!abt", name = "po", descriptor = "()V", line = 348)
	void method4100() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method25099()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class60_Sub11.method13407(1000L);
		}
	}

	@OriginalMember(owner = "client!abt", name = "se", descriptor = "()I", line = 356)
	int method4108() {
		@Pc(1) int local1 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class230.method24546(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class70.method33883(local48[0]);
				@Pc(64) int local64 = Class70.method33883(local48[1]);
				this.anInt429 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt429 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt444 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt384 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt446 = local111[0];
		if (this.anInt444 < 2 || this.anInt384 < 2 || this.anInt446 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean63 = Stream.u();
		this.aBoolean81 = this.anOpenGL1.method25098("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.method25098("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.method25098("GL_ARB_vertex_program");
		this.aBoolean88 = this.anOpenGL1.method25098("GL_ARB_fragment_program");
		this.aBoolean87 = this.anOpenGL1.method25098("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.method25098("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.method25098("GL_EXT_texture3D");
		this.aBoolean86 = this.anOpenGL1.method25098("GL_ARB_texture_rectangle");
		this.aBoolean84 = this.anOpenGL1.method25098("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.method25098("GL_ARB_seamless_cube_map");
		this.aBoolean60 = this.anOpenGL1.method25098("GL_ARB_texture_float");
		this.aBoolean69 = this.anOpenGL1.method25098("GL_ARB_texture_non_power_of_two");
		this.aBoolean77 = this.anOpenGL1.method25098("GL_EXT_framebuffer_object");
		this.aBoolean72 = this.anOpenGL1.method25098("GL_EXT_framebuffer_blit");
		this.aBoolean78 = this.anOpenGL1.method25098("GL_EXT_framebuffer_multisample");
		this.aBoolean80 = this.aBoolean72 & this.aBoolean78;
		this.aBoolean66 = this.anOpenGL1.method25098("GL_EXT_blend_func_separate");
		this.aBoolean76 = Class377.aString211.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray29, 0);
		this.aFloat60 = aFloatArray29[0];
		this.aFloat59 = aFloatArray29[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!abt", name = "pd", descriptor = "()I", line = 356)
	int method4122() {
		@Pc(1) int local1 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class230.method24546(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class70.method33883(local48[0]);
				@Pc(64) int local64 = Class70.method33883(local48[1]);
				this.anInt429 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt429 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt444 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt384 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt446 = local111[0];
		if (this.anInt444 < 2 || this.anInt384 < 2 || this.anInt446 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean63 = Stream.u();
		this.aBoolean81 = this.anOpenGL1.method25098("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.method25098("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.method25098("GL_ARB_vertex_program");
		this.aBoolean88 = this.anOpenGL1.method25098("GL_ARB_fragment_program");
		this.aBoolean87 = this.anOpenGL1.method25098("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.method25098("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.method25098("GL_EXT_texture3D");
		this.aBoolean86 = this.anOpenGL1.method25098("GL_ARB_texture_rectangle");
		this.aBoolean84 = this.anOpenGL1.method25098("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.method25098("GL_ARB_seamless_cube_map");
		this.aBoolean60 = this.anOpenGL1.method25098("GL_ARB_texture_float");
		this.aBoolean69 = this.anOpenGL1.method25098("GL_ARB_texture_non_power_of_two");
		this.aBoolean77 = this.anOpenGL1.method25098("GL_EXT_framebuffer_object");
		this.aBoolean72 = this.anOpenGL1.method25098("GL_EXT_framebuffer_blit");
		this.aBoolean78 = this.anOpenGL1.method25098("GL_EXT_framebuffer_multisample");
		this.aBoolean80 = this.aBoolean72 & this.aBoolean78;
		this.aBoolean66 = this.anOpenGL1.method25098("GL_EXT_blend_func_separate");
		this.aBoolean76 = Class377.aString211.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray29, 0);
		this.aFloat60 = aFloatArray29[0];
		this.aFloat59 = aFloatArray29[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!abt", name = "sk", descriptor = "()I", line = 356)
	int method4125() {
		@Pc(1) int local1 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class230.method24546(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class70.method33883(local48[0]);
				@Pc(64) int local64 = Class70.method33883(local48[1]);
				this.anInt429 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt429 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt444 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt384 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt446 = local111[0];
		if (this.anInt444 < 2 || this.anInt384 < 2 || this.anInt446 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean63 = Stream.u();
		this.aBoolean81 = this.anOpenGL1.method25098("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.method25098("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.method25098("GL_ARB_vertex_program");
		this.aBoolean88 = this.anOpenGL1.method25098("GL_ARB_fragment_program");
		this.aBoolean87 = this.anOpenGL1.method25098("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.method25098("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.method25098("GL_EXT_texture3D");
		this.aBoolean86 = this.anOpenGL1.method25098("GL_ARB_texture_rectangle");
		this.aBoolean84 = this.anOpenGL1.method25098("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.method25098("GL_ARB_seamless_cube_map");
		this.aBoolean60 = this.anOpenGL1.method25098("GL_ARB_texture_float");
		this.aBoolean69 = this.anOpenGL1.method25098("GL_ARB_texture_non_power_of_two");
		this.aBoolean77 = this.anOpenGL1.method25098("GL_EXT_framebuffer_object");
		this.aBoolean72 = this.anOpenGL1.method25098("GL_EXT_framebuffer_blit");
		this.aBoolean78 = this.anOpenGL1.method25098("GL_EXT_framebuffer_multisample");
		this.aBoolean80 = this.aBoolean72 & this.aBoolean78;
		this.aBoolean66 = this.anOpenGL1.method25098("GL_EXT_blend_func_separate");
		this.aBoolean76 = Class377.aString211.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray29, 0);
		this.aFloat60 = aFloatArray29[0];
		this.aFloat59 = aFloatArray29[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!abt", name = "sg", descriptor = "()I", line = 356)
	int method4135() {
		@Pc(1) int local1 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class230.method24546(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class70.method33883(local48[0]);
				@Pc(64) int local64 = Class70.method33883(local48[1]);
				this.anInt429 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt429 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt444 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt384 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt446 = local111[0];
		if (this.anInt444 < 2 || this.anInt384 < 2 || this.anInt446 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean63 = Stream.u();
		this.aBoolean81 = this.anOpenGL1.method25098("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.method25098("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.method25098("GL_ARB_vertex_program");
		this.aBoolean88 = this.anOpenGL1.method25098("GL_ARB_fragment_program");
		this.aBoolean87 = this.anOpenGL1.method25098("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.method25098("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.method25098("GL_EXT_texture3D");
		this.aBoolean86 = this.anOpenGL1.method25098("GL_ARB_texture_rectangle");
		this.aBoolean84 = this.anOpenGL1.method25098("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.method25098("GL_ARB_seamless_cube_map");
		this.aBoolean60 = this.anOpenGL1.method25098("GL_ARB_texture_float");
		this.aBoolean69 = this.anOpenGL1.method25098("GL_ARB_texture_non_power_of_two");
		this.aBoolean77 = this.anOpenGL1.method25098("GL_EXT_framebuffer_object");
		this.aBoolean72 = this.anOpenGL1.method25098("GL_EXT_framebuffer_blit");
		this.aBoolean78 = this.anOpenGL1.method25098("GL_EXT_framebuffer_multisample");
		this.aBoolean80 = this.aBoolean72 & this.aBoolean78;
		this.aBoolean66 = this.anOpenGL1.method25098("GL_EXT_blend_func_separate");
		this.aBoolean76 = Class377.aString211.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray29, 0);
		this.aFloat60 = aFloatArray29[0];
		this.aFloat59 = aFloatArray29[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!abt", name = "sx", descriptor = "()I", line = 356)
	int method4136() {
		@Pc(1) int local1 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class230.method24546(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class70.method33883(local48[0]);
				@Pc(64) int local64 = Class70.method33883(local48[1]);
				this.anInt429 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt429 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method25098("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt444 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt384 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt446 = local111[0];
		if (this.anInt444 < 2 || this.anInt384 < 2 || this.anInt446 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean63 = Stream.u();
		this.aBoolean81 = this.anOpenGL1.method25098("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.method25098("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.method25098("GL_ARB_vertex_program");
		this.aBoolean88 = this.anOpenGL1.method25098("GL_ARB_fragment_program");
		this.aBoolean87 = this.anOpenGL1.method25098("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.method25098("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.method25098("GL_EXT_texture3D");
		this.aBoolean86 = this.anOpenGL1.method25098("GL_ARB_texture_rectangle");
		this.aBoolean84 = this.anOpenGL1.method25098("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.method25098("GL_ARB_seamless_cube_map");
		this.aBoolean60 = this.anOpenGL1.method25098("GL_ARB_texture_float");
		this.aBoolean69 = this.anOpenGL1.method25098("GL_ARB_texture_non_power_of_two");
		this.aBoolean77 = this.anOpenGL1.method25098("GL_EXT_framebuffer_object");
		this.aBoolean72 = this.anOpenGL1.method25098("GL_EXT_framebuffer_blit");
		this.aBoolean78 = this.anOpenGL1.method25098("GL_EXT_framebuffer_multisample");
		this.aBoolean80 = this.aBoolean72 & this.aBoolean78;
		this.aBoolean66 = this.anOpenGL1.method25098("GL_EXT_blend_func_separate");
		this.aBoolean76 = Class377.aString211.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray29, 0);
		this.aFloat60 = aFloatArray29[0];
		this.aFloat59 = aFloatArray29[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!abt", name = "pc", descriptor = "()V", line = 411)
	void method4025() {
		this.aClass4Array1 = new Class4[this.anInt444];
		this.aClass4_Sub1_2 = new Class4_Sub1(this, 3553, Class121.aClass121_17, Class127.aClass127_23, 1, 1);
		new Class4_Sub1(this, 3553, Class121.aClass121_17, Class127.aClass127_23, 1, 1);
		new Class4_Sub1(this, 3553, Class121.aClass121_17, Class127.aClass127_23, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass20_Sub1Array1[local37] = new Class20_Sub1(this);
			this.aClass20_Sub1Array2[local37] = new Class20_Sub1(this);
		}
		if (this.aBoolean77) {
			this.aClass19_Sub1_Sub3_1 = new Class19_Sub1_Sub3(this);
			new Class19_Sub1_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!abt", name = "pj", descriptor = "()V", line = 426)
	void method4024() {
		this.method4070(-2);
		for (@Pc(7) int local7 = this.anInt444 - 1; local7 >= 0; local7--) {
			this.method4073(local7);
			this.method4074(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4114(8448, 8448);
		this.method4077(2, 34168, 770);
		this.method4082();
		this.anInt413 = 1;
		this.anInt416 = 0;
		this.aBoolean92 = true;
		if (this.aBoolean66) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt420 = 1;
		this.aByte2 = 0;
		this.aBoolean68 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte2);
		if (this.aBoolean79) {
			if (this.anInt404 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean62 = true;
		this.method4083(true);
		this.method4084(true);
		this.method4086(true);
		this.method4087(true);
		this.method17055(0.0F, 1.0F);
		this.method4161();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(152) float[] local152 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
			@Pc(161) int local161 = local154 + 16384;
			OpenGL.glLightfv(local161, 4608, local152, 0);
			OpenGL.glLightf(local161, 4615, 0.0F);
			OpenGL.glLightf(local161, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean85) {
			OpenGL.glEnable(34895);
		}
		this.anInt432 = -1;
		this.anInt371 = -1;
		this.method17053();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "sz", descriptor = "()V", line = 426)
	void method4137() {
		this.method4070(-2);
		for (@Pc(7) int local7 = this.anInt444 - 1; local7 >= 0; local7--) {
			this.method4073(local7);
			this.method4074(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4114(8448, 8448);
		this.method4077(2, 34168, 770);
		this.method4082();
		this.anInt413 = 1;
		this.anInt416 = 0;
		this.aBoolean92 = true;
		if (this.aBoolean66) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt420 = 1;
		this.aByte2 = 0;
		this.aBoolean68 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte2);
		if (this.aBoolean79) {
			if (this.anInt404 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean62 = true;
		this.method4083(true);
		this.method4084(true);
		this.method4086(true);
		this.method4087(true);
		this.method17055(0.0F, 1.0F);
		this.method4161();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(152) float[] local152 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
			@Pc(161) int local161 = local154 + 16384;
			OpenGL.glLightfv(local161, 4608, local152, 0);
			OpenGL.glLightf(local161, 4615, 0.0F);
			OpenGL.glLightf(local161, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean85) {
			OpenGL.glEnable(34895);
		}
		this.anInt432 = -1;
		this.anInt371 = -1;
		this.method17053();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "sf", descriptor = "()V", line = 426)
	void method4138() {
		this.method4070(-2);
		for (@Pc(7) int local7 = this.anInt444 - 1; local7 >= 0; local7--) {
			this.method4073(local7);
			this.method4074(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4114(8448, 8448);
		this.method4077(2, 34168, 770);
		this.method4082();
		this.anInt413 = 1;
		this.anInt416 = 0;
		this.aBoolean92 = true;
		if (this.aBoolean66) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt420 = 1;
		this.aByte2 = 0;
		this.aBoolean68 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte2);
		if (this.aBoolean79) {
			if (this.anInt404 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean62 = true;
		this.method4083(true);
		this.method4084(true);
		this.method4086(true);
		this.method4087(true);
		this.method17055(0.0F, 1.0F);
		this.method4161();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(152) float[] local152 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(154) int local154 = 0; local154 < 8; local154++) {
			@Pc(161) int local161 = local154 + 16384;
			OpenGL.glLightfv(local161, 4608, local152, 0);
			OpenGL.glLightf(local161, 4615, 0.0F);
			OpenGL.glLightf(local161, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean85) {
			OpenGL.glEnable(34895);
		}
		this.anInt432 = -1;
		this.anInt371 = -1;
		this.method17053();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "ex", descriptor = "()Lclient!cr;", line = 489)
	@Override
	public Class117 method17143() {
		@Pc(1) int local1 = -1;
		if (this.aString19.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString19.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString19.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class117(local1, "OpenGL", this.anInt429, this.aString18, 0L, false);
	}

	@OriginalMember(owner = "client!abt", name = "h", descriptor = "()Lclient!cr;", line = 489)
	@Override
	public Class117 method17016() {
		@Pc(1) int local1 = -1;
		if (this.aString19.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString19.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString19.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class117(local1, "OpenGL", this.anInt429, this.aString18, 0L, false);
	}

	@OriginalMember(owner = "client!abt", name = "s", descriptor = "(II)V", line = 498)
	@Override
	void method17018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass19_Sub2_6.method21412();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!abt", name = "eb", descriptor = "(II)V", line = 498)
	@Override
	void method17265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		try {
			this.aClass19_Sub2_6.method21412();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!abt", name = "u", descriptor = "()V", line = 505)
	@Override
	public void method17019() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!abt", name = "ey", descriptor = "()V", line = 505)
	@Override
	public void method17026() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!abt", name = "ej", descriptor = "()V", line = 505)
	@Override
	public void method17148() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!abt", name = "ef", descriptor = "()V", line = 505)
	@Override
	public void method17372() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!abt", name = "er", descriptor = "()V", line = 505)
	@Override
	public void method17147() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!abt", name = "b", descriptor = "()V", line = 509)
	@Override
	void method17021() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "en", descriptor = "()V", line = 509)
	@Override
	void method17149() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ew", descriptor = "()V", line = 509)
	@Override
	void method17150() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "em", descriptor = "()V", line = 509)
	@Override
	void method17151() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ea", descriptor = "()V", line = 509)
	@Override
	void method17153() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ec", descriptor = "()V", line = 509)
	@Override
	void method17152() {
		for (@Pc(4) Class3 local4 = this.aClass553_11.method32768(); local4 != null; local4 = this.aClass553_11.method32709()) {
			((Class3_Sub11_Sub1) local4).method18124();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22032();
		}
		if (this.aBoolean61) {
			Class79.method21589(false, true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "j", descriptor = "()Z", line = 520)
	@Override
	public boolean method17231() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ed", descriptor = "()Z", line = 520)
	@Override
	public boolean method17156() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "eq", descriptor = "()Z", line = 520)
	@Override
	public boolean method17353() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ev", descriptor = "()Z", line = 524)
	@Override
	public boolean method17158() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "et", descriptor = "()Z", line = 524)
	@Override
	public boolean method17159() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "n", descriptor = "()Z", line = 524)
	@Override
	public boolean method17088() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "e", descriptor = "()Z", line = 528)
	@Override
	public boolean method17218() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "eo", descriptor = "()Z", line = 528)
	@Override
	public boolean method17313() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "d", descriptor = "()Z", line = 532)
	@Override
	public boolean method17166() {
		return this.aClass3_Sub9_Sub2_1 != null && (this.anInt404 <= 1 || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "ek", descriptor = "()Z", line = 532)
	@Override
	public boolean method17161() {
		return this.aClass3_Sub9_Sub2_1 != null && (this.anInt404 <= 1 || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "ei", descriptor = "()Z", line = 532)
	@Override
	public boolean method17262() {
		return this.aClass3_Sub9_Sub2_1 != null && (this.anInt404 <= 1 || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "q", descriptor = "()Z", line = 536)
	@Override
	public boolean method17164() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "el", descriptor = "()Z", line = 536)
	@Override
	public boolean method17163() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "eu", descriptor = "()Z", line = 536)
	@Override
	public boolean method17376() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "r", descriptor = "()Z", line = 540)
	@Override
	public boolean method17409() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "eg", descriptor = "()Z", line = 540)
	@Override
	public boolean method17165() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "es", descriptor = "()Z", line = 540)
	@Override
	public boolean method17190() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "eh", descriptor = "()Z", line = 540)
	@Override
	public boolean method17167() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ft", descriptor = "()Z", line = 540)
	@Override
	public boolean method17168() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "m", descriptor = "()Z", line = 544)
	@Override
	public boolean method17031() {
		return this.aBoolean79 && (!this.method17131() || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "fp", descriptor = "()Z", line = 544)
	@Override
	public boolean method17221() {
		return this.aBoolean79 && (!this.method17131() || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "fn", descriptor = "()Z", line = 544)
	@Override
	public boolean method17091() {
		return this.aBoolean79 && (!this.method17131() || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "fm", descriptor = "()Z", line = 544)
	@Override
	public boolean method17339() {
		return this.aBoolean79 && (!this.method17131() || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "fs", descriptor = "()Z", line = 544)
	@Override
	public boolean method17134() {
		return this.aBoolean79 && (!this.method17131() || this.aBoolean80);
	}

	@OriginalMember(owner = "client!abt", name = "v", descriptor = "()Z", line = 548)
	@Override
	public boolean method17032() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "fx", descriptor = "()Z", line = 548)
	@Override
	public boolean method17081() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "fh", descriptor = "()Z", line = 548)
	@Override
	public boolean method17174() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "fu", descriptor = "()Z", line = 548)
	@Override
	public boolean method17175() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ph", descriptor = "()Z", line = 552)
	boolean method4026() {
		return this.aClass104_1.method21906(3);
	}

	@OriginalMember(owner = "client!abt", name = "sw", descriptor = "()Z", line = 552)
	boolean method4052() {
		return this.aClass104_1.method21906(3);
	}

	@OriginalMember(owner = "client!abt", name = "sd", descriptor = "()Z", line = 552)
	boolean method4139() {
		return this.aClass104_1.method21906(3);
	}

	@OriginalMember(owner = "client!abt", name = "t", descriptor = "()Z", line = 556)
	@Override
	public boolean method17033() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "fb", descriptor = "()Z", line = 556)
	@Override
	public boolean method17177() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "fg", descriptor = "()Z", line = 556)
	@Override
	public boolean method17176() {
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "w", descriptor = "()Z", line = 560)
	@Override
	public boolean method17256() {
		return false;
	}

	@OriginalMember(owner = "client!abt", name = "fd", descriptor = "()Z", line = 560)
	@Override
	public boolean method17252() {
		return false;
	}

	@OriginalMember(owner = "client!abt", name = "o", descriptor = "()Ljava/lang/String;", line = 564)
	@Override
	public String method17035() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt404 + local3;
		@Pc(27) String local27 = local15 + this.anInt451 + local3;
		@Pc(39) String local39 = local27 + this.anInt444 + local3;
		@Pc(51) String local51 = local39 + this.anInt384 + local3;
		@Pc(63) String local63 = local51 + this.anInt446 + local3;
		@Pc(75) String local75 = local63 + this.aFloat60 + local3;
		@Pc(87) String local87 = local75 + this.aFloat59 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean63 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean76 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean81 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean82 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean79 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean71 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean88 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean86 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean84 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean85 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean69 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean72 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean78 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean60 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean90 ? 1 : 0) + local3;
		return local407 + (this.aBoolean66 ? 1 : 0);
	}

	@OriginalMember(owner = "client!abt", name = "fv", descriptor = "()Ljava/lang/String;", line = 564)
	@Override
	public String method17180() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt404 + local3;
		@Pc(27) String local27 = local15 + this.anInt451 + local3;
		@Pc(39) String local39 = local27 + this.anInt444 + local3;
		@Pc(51) String local51 = local39 + this.anInt384 + local3;
		@Pc(63) String local63 = local51 + this.anInt446 + local3;
		@Pc(75) String local75 = local63 + this.aFloat60 + local3;
		@Pc(87) String local87 = local75 + this.aFloat59 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean63 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean76 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean81 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean82 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean79 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean71 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean88 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean86 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean84 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean85 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean69 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean72 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean78 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean60 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean90 ? 1 : 0) + local3;
		return local407 + (this.aBoolean66 ? 1 : 0);
	}

	@OriginalMember(owner = "client!abt", name = "fy", descriptor = "()Ljava/lang/String;", line = 564)
	@Override
	public String method17181() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt404 + local3;
		@Pc(27) String local27 = local15 + this.anInt451 + local3;
		@Pc(39) String local39 = local27 + this.anInt444 + local3;
		@Pc(51) String local51 = local39 + this.anInt384 + local3;
		@Pc(63) String local63 = local51 + this.anInt446 + local3;
		@Pc(75) String local75 = local63 + this.aFloat60 + local3;
		@Pc(87) String local87 = local75 + this.aFloat59 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean63 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean76 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean81 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean82 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean79 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean71 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean88 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean86 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean84 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean85 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean69 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean72 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean78 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean60 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean90 ? 1 : 0) + local3;
		return local407 + (this.aBoolean66 ? 1 : 0);
	}

	@OriginalMember(owner = "client!abt", name = "fz", descriptor = "()Ljava/lang/String;", line = 564)
	@Override
	public String method17179() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt404 + local3;
		@Pc(27) String local27 = local15 + this.anInt451 + local3;
		@Pc(39) String local39 = local27 + this.anInt444 + local3;
		@Pc(51) String local51 = local39 + this.anInt384 + local3;
		@Pc(63) String local63 = local51 + this.anInt446 + local3;
		@Pc(75) String local75 = local63 + this.aFloat60 + local3;
		@Pc(87) String local87 = local75 + this.aFloat59 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean63 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean76 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean81 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean82 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean79 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean71 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean88 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean86 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean84 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean85 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean69 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean72 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean78 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean60 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean90 ? 1 : 0) + local3;
		return local407 + (this.aBoolean66 ? 1 : 0);
	}

	@OriginalMember(owner = "client!abt", name = "ff", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 598)
	@Override
	Class19_Sub2 method17186(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "ai", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 598)
	@Override
	Class19_Sub2 method17046(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "fk", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 598)
	@Override
	Class19_Sub2 method17187(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "pi", descriptor = "()V", line = 602)
	void method4028() {
		this.method4029();
	}

	@OriginalMember(owner = "client!abt", name = "sr", descriptor = "()V", line = 602)
	void method4033() {
		this.method4029();
	}

	@OriginalMember(owner = "client!abt", name = "pl", descriptor = "()V", line = 606)
	void method4029() {
		@Pc(3) int local3 = this.aClass19_6.method21390();
		@Pc(7) int local7 = this.aClass19_6.method21391();
		this.aClass328_8.method26055(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method17053();
		this.method4161();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "sb", descriptor = "()V", line = 606)
	void method4038() {
		@Pc(3) int local3 = this.aClass19_6.method21390();
		@Pc(7) int local7 = this.aClass19_6.method21391();
		this.aClass328_8.method26055(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method17053();
		this.method4161();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "su", descriptor = "()V", line = 606)
	void method4118() {
		@Pc(3) int local3 = this.aClass19_6.method21390();
		@Pc(7) int local7 = this.aClass19_6.method21391();
		this.aClass328_8.method26055(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method17053();
		this.method4161();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "sc", descriptor = "()V", line = 606)
	void method4140() {
		@Pc(3) int local3 = this.aClass19_6.method21390();
		@Pc(7) int local7 = this.aClass19_6.method21391();
		this.aClass328_8.method26055(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method17053();
		this.method4161();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "sp", descriptor = "()V", line = 606)
	void method4141() {
		@Pc(3) int local3 = this.aClass19_6.method21390();
		@Pc(7) int local7 = this.aClass19_6.method21391();
		this.aClass328_8.method26055(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method17053();
		this.method4161();
		this.method17056();
	}

	@OriginalMember(owner = "client!abt", name = "fj", descriptor = "(IIII)[I", line = 615)
	@Override
	public int[] method17188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass19_6.method21391();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt451, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!abt", name = "al", descriptor = "(IIII)[I", line = 615)
	@Override
	public int[] method17051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass19_6.method21391();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt451, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!abt", name = "ao", descriptor = "()V", line = 627)
	@Override
	public void method17302() {
		if (!this.aBoolean90 || this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt415;
		@Pc(12) int local12 = this.anInt424;
		@Pc(15) int local15 = this.anInt422;
		@Pc(18) int local18 = this.anInt375;
		this.method17056();
		@Pc(23) int local23 = this.anInt445;
		@Pc(26) int local26 = this.anInt425;
		@Pc(29) int local29 = this.anInt406;
		@Pc(32) int local32 = this.anInt417;
		this.method17053();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4161();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4089(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass19_6.method21390(), this.aClass19_6.method21391(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local9, local15, local12, local18);
		this.method17054(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!abt", name = "fa", descriptor = "()V", line = 627)
	@Override
	public void method17189() {
		if (!this.aBoolean90 || this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt415;
		@Pc(12) int local12 = this.anInt424;
		@Pc(15) int local15 = this.anInt422;
		@Pc(18) int local18 = this.anInt375;
		this.method17056();
		@Pc(23) int local23 = this.anInt445;
		@Pc(26) int local26 = this.anInt425;
		@Pc(29) int local29 = this.anInt406;
		@Pc(32) int local32 = this.anInt417;
		this.method17053();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4161();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4089(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass19_6.method21390(), this.aClass19_6.method21391(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local9, local15, local12, local18);
		this.method17054(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!abt", name = "fq", descriptor = "()V", line = 627)
	@Override
	public void method17377() {
		if (!this.aBoolean90 || this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt415;
		@Pc(12) int local12 = this.anInt424;
		@Pc(15) int local15 = this.anInt422;
		@Pc(18) int local18 = this.anInt375;
		this.method17056();
		@Pc(23) int local23 = this.anInt445;
		@Pc(26) int local26 = this.anInt425;
		@Pc(29) int local29 = this.anInt406;
		@Pc(32) int local32 = this.anInt417;
		this.method17053();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4161();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4089(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass19_6.method21390(), this.aClass19_6.method21391(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local9, local15, local12, local18);
		this.method17054(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!abt", name = "fc", descriptor = "()V", line = 627)
	@Override
	public void method17301() {
		if (!this.aBoolean90 || this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt415;
		@Pc(12) int local12 = this.anInt424;
		@Pc(15) int local15 = this.anInt422;
		@Pc(18) int local18 = this.anInt375;
		this.method17056();
		@Pc(23) int local23 = this.anInt445;
		@Pc(26) int local26 = this.anInt425;
		@Pc(29) int local29 = this.anInt406;
		@Pc(32) int local32 = this.anInt417;
		this.method17053();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4161();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4089(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass19_6.method21390(), this.aClass19_6.method21391(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local9, local15, local12, local18);
		this.method17054(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!abt", name = "ad", descriptor = "(II)V", line = 664)
	@Override
	public void method17061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method4087(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!abt", name = "gx", descriptor = "(II)V", line = 664)
	@Override
	public void method17270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method4087(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!abt", name = "bm", descriptor = "(IIIIII)V", line = 678)
	@Override
	public void method17068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "gk", descriptor = "(IIIIII)V", line = 678)
	@Override
	public void method17210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "gs", descriptor = "(IIIIII)V", line = 678)
	@Override
	public void method17211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "bf", descriptor = "(IIIIII)V", line = 696)
	@Override
	public void method17050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "lh", descriptor = "(IIIIII)V", line = 696)
	@Override
	public void method17198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "lp", descriptor = "(IIIIII)V", line = 696)
	@Override
	public void method17334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "lj", descriptor = "(IIIIII)V", line = 696)
	@Override
	public void method17115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "ly", descriptor = "(IIIIII)V", line = 696)
	@Override
	public void method17135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4067();
		this.method4089(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!abt", name = "bt", descriptor = "(IIFIIFIIFIIII)V", line = 714)
	@Override
	public void method17070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method4067();
		this.method4089(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "lu", descriptor = "(IIFIIFIIFIIII)V", line = 714)
	@Override
	public void method17321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method4067();
		this.method4089(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "bk", descriptor = "(IIIII)V", line = 727)
	@Override
	void method17420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt415 || arg0 - arg2 > this.anInt424 || arg1 + arg2 < this.anInt422 || arg1 - arg2 > this.anInt375) {
			return;
		}
		this.method4067();
		this.method4089(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat60) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat59) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class525.method32379(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class105.aFloatArray94[local157] * (float) arg2, local59 + Class105.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!abt", name = "gc", descriptor = "(IIIII)V", line = 727)
	@Override
	void method17290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt415 || arg0 - arg2 > this.anInt424 || arg1 + arg2 < this.anInt422 || arg1 - arg2 > this.anInt375) {
			return;
		}
		this.method4067();
		this.method4089(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat60) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat59) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local63);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local54, local59);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local54, local59);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Class525.method32379(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class105.aFloatArray94[local157] * (float) arg2, local59 + Class105.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!abt", name = "bg", descriptor = "(IIIII)V", line = 769)
	@Override
	void method17072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4067();
		this.method4089(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "gw", descriptor = "(IIIII)V", line = 769)
	@Override
	void method17213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4067();
		this.method4089(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "br", descriptor = "(IIIII)V", line = 781)
	@Override
	void method17073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4067();
		this.method4089(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "gi", descriptor = "(IIIII)V", line = 781)
	@Override
	void method17215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4067();
		this.method4089(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "go", descriptor = "(IIIII)V", line = 781)
	@Override
	void method17214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4067();
		this.method4089(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "bb", descriptor = "(IIIIII)V", line = 793)
	@Override
	public void method17024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4067();
		this.method4089(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "gb", descriptor = "(IIIIII)V", line = 793)
	@Override
	public void method17216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4067();
		this.method4089(arg5);
		@Pc(10) float local10 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) arg3 - (float) arg1;
		if (local10 == 0.0F && local16 == 0.0F) {
			local10 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local10 * local10 + local16 * local16)));
			local10 *= local40;
			local16 *= local40;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local10 + 0.35F, (float) arg3 + local16 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!abt", name = "bl", descriptor = "(IIIIIIIII)V", line = 813)
	@Override
	public void method17076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method4067();
		this.method4089(arg5);
		@Pc(17) float local17 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(65) int local65 = arg8 % (arg7 + arg6);
		@Pc(70) float local70 = local40 * (float) arg6;
		@Pc(75) float local75 = local44 * (float) arg6;
		@Pc(77) float local77 = 0.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(81) float local81 = local70;
		@Pc(83) float local83 = local75;
		if (local65 > arg6) {
			local77 = local40 * (float) (arg6 + arg7 - local65);
			local79 = local44 * (float) (arg6 + arg7 - local65);
		} else {
			local81 = local40 * (float) (arg6 - local65);
			local83 = local44 * (float) (arg6 - local65);
		}
		@Pc(126) float local126 = (float) arg0 + 0.35F + local77;
		@Pc(133) float local133 = (float) arg1 + 0.35F + local79;
		@Pc(138) float local138 = local40 * (float) arg7;
		@Pc(143) float local143 = local44 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local126 > (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 > (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			} else {
				if (local126 < (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 < (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 > (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 < (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local126, local133);
			OpenGL.glVertex2f(local126 + local81, local133 + local83);
			OpenGL.glEnd();
			local126 += local138 + local81;
			local133 += local143 + local83;
			local81 = local70;
			local83 = local75;
		}
	}

	@OriginalMember(owner = "client!abt", name = "gl", descriptor = "(IIIIIIIII)V", line = 813)
	@Override
	public void method17304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method4067();
		this.method4089(arg5);
		@Pc(17) float local17 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(65) int local65 = arg8 % (arg7 + arg6);
		@Pc(70) float local70 = local40 * (float) arg6;
		@Pc(75) float local75 = local44 * (float) arg6;
		@Pc(77) float local77 = 0.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(81) float local81 = local70;
		@Pc(83) float local83 = local75;
		if (local65 > arg6) {
			local77 = local40 * (float) (arg6 + arg7 - local65);
			local79 = local44 * (float) (arg6 + arg7 - local65);
		} else {
			local81 = local40 * (float) (arg6 - local65);
			local83 = local44 * (float) (arg6 - local65);
		}
		@Pc(126) float local126 = (float) arg0 + 0.35F + local77;
		@Pc(133) float local133 = (float) arg1 + 0.35F + local79;
		@Pc(138) float local138 = local40 * (float) arg7;
		@Pc(143) float local143 = local44 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local126 > (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 > (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			} else {
				if (local126 < (float) arg2 + 0.35F) {
					break;
				}
				if (local126 + local81 < (float) arg2) {
					local81 = (float) arg2 - local126;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 > (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3 + 0.35F) {
					break;
				}
				if (local133 + local83 < (float) arg3) {
					local83 = (float) arg3 - local133;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local126, local133);
			OpenGL.glVertex2f(local126 + local81, local133 + local83);
			OpenGL.glEnd();
			local126 += local138 + local81;
			local133 += local143 + local83;
			local81 = local70;
			local83 = local75;
		}
	}

	@OriginalMember(owner = "client!abt", name = "gg", descriptor = "(IIIIIILclient!ch;II)V", line = 870)
	@Override
	public void method17058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg6;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(43) float local43 = (float) arg2 - (float) arg0;
		@Pc(49) float local49 = (float) arg3 - (float) arg1;
		@Pc(62) float local62 = (float) (1.0D / Math.sqrt((double) (local43 * local43 + local49 * local49)));
		@Pc(66) float local66 = local43 * local62;
		@Pc(70) float local70 = local49 * local62;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local30 * (float) (arg0 - arg7), local37 * (float) (arg1 - arg8));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local30 * (float) (arg2 - arg7), local37 * (float) (arg3 - arg8));
		OpenGL.glVertex2f((float) arg2 + local66 + 0.35F, (float) arg3 + local70 + 0.35F);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "gu", descriptor = "(IIIIIILclient!ch;II)V", line = 870)
	@Override
	public void method17337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg6;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(43) float local43 = (float) arg2 - (float) arg0;
		@Pc(49) float local49 = (float) arg3 - (float) arg1;
		@Pc(62) float local62 = (float) (1.0D / Math.sqrt((double) (local43 * local43 + local49 * local49)));
		@Pc(66) float local66 = local43 * local62;
		@Pc(70) float local70 = local49 * local62;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local30 * (float) (arg0 - arg7), local37 * (float) (arg1 - arg8));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local30 * (float) (arg2 - arg7), local37 * (float) (arg3 - arg8));
		OpenGL.glVertex2f((float) arg2 + local66 + 0.35F, (float) arg3 + local70 + 0.35F);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "by", descriptor = "(IIIIIILclient!ch;II)V", line = 870)
	@Override
	public void method17283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg6;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(43) float local43 = (float) arg2 - (float) arg0;
		@Pc(49) float local49 = (float) arg3 - (float) arg1;
		@Pc(62) float local62 = (float) (1.0D / Math.sqrt((double) (local43 * local43 + local49 * local49)));
		@Pc(66) float local66 = local43 * local62;
		@Pc(70) float local70 = local49 * local62;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local30 * (float) (arg0 - arg7), local37 * (float) (arg1 - arg8));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local30 * (float) (arg2 - arg7), local37 * (float) (arg3 - arg8));
		OpenGL.glVertex2f((float) arg2 + local66 + 0.35F, (float) arg3 + local70 + 0.35F);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "bi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 895)
	@Override
	public void method17077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class5_Sub2 local9 = (Class5_Sub2) arg6;
		@Pc(12) Class4_Sub1_Sub1 local12 = local9.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local9.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat152 / (float) local12.anInt2031;
		@Pc(44) float local44 = local12.aFloat151 / (float) local12.anInt2030;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "ha", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 895)
	@Override
	public void method17222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class5_Sub2 local9 = (Class5_Sub2) arg6;
		@Pc(12) Class4_Sub1_Sub1 local12 = local9.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local9.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat152 / (float) local12.anInt2031;
		@Pc(44) float local44 = local12.aFloat151 / (float) local12.anInt2030;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "hg", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 895)
	@Override
	public void method17223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class5_Sub2 local9 = (Class5_Sub2) arg6;
		@Pc(12) Class4_Sub1_Sub1 local12 = local9.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local9.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat152 / (float) local12.anInt2031;
		@Pc(44) float local44 = local12.aFloat151 / (float) local12.anInt2030;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "hi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 895)
	@Override
	public void method17220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class5_Sub2 local9 = (Class5_Sub2) arg6;
		@Pc(12) Class4_Sub1_Sub1 local12 = local9.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local9.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat152 / (float) local12.anInt2031;
		@Pc(44) float local44 = local12.aFloat151 / (float) local12.anInt2030;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "hk", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 895)
	@Override
	public void method17116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class5_Sub2 local9 = (Class5_Sub2) arg6;
		@Pc(12) Class4_Sub1_Sub1 local12 = local9.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local9.aClass4_Sub1_Sub1_1);
		this.method4089(arg5);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat152 / (float) local12.anInt2031;
		@Pc(44) float local44 = local12.aFloat151 / (float) local12.anInt2030;
		@Pc(50) float local50 = (float) arg2 - (float) arg0;
		@Pc(56) float local56 = (float) arg3 - (float) arg1;
		@Pc(69) float local69 = (float) (1.0D / Math.sqrt((double) (local50 * local50 + local56 * local56)));
		@Pc(73) float local73 = local50 * local69;
		@Pc(77) float local77 = local56 * local69;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(98) int local98 = arg11 % (arg10 + arg9);
		@Pc(103) float local103 = local73 * (float) arg9;
		@Pc(108) float local108 = local77 * (float) arg9;
		@Pc(110) float local110 = 0.0F;
		@Pc(112) float local112 = 0.0F;
		@Pc(114) float local114 = local103;
		@Pc(116) float local116 = local108;
		if (local98 > arg9) {
			local110 = local73 * (float) (arg9 + arg10 - local98);
			local112 = local77 * (float) (arg9 + arg10 - local98);
		} else {
			local114 = local73 * (float) (arg9 - local98);
			local116 = local77 * (float) (arg9 - local98);
		}
		@Pc(159) float local159 = (float) arg0 + 0.35F + local110;
		@Pc(166) float local166 = (float) arg1 + 0.35F + local112;
		@Pc(171) float local171 = local73 * (float) arg10;
		@Pc(176) float local176 = local77 * (float) arg10;
		while (true) {
			if (arg2 > arg0) {
				if (local159 > (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 > (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			} else {
				if (local159 < (float) arg2 + 0.35F) {
					break;
				}
				if (local159 + local114 < (float) arg2) {
					local114 = (float) arg2 - local159;
				}
			}
			if (arg3 > arg1) {
				if (local166 > (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 > (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			} else {
				if (local166 < (float) arg3 + 0.35F) {
					break;
				}
				if (local166 + local116 < (float) arg3) {
					local116 = (float) arg3 - local166;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local37 * (local159 - (float) arg7), local44 * (local166 - (float) arg8));
			OpenGL.glVertex2f(local159, local166);
			OpenGL.glTexCoord2f(local37 * (local159 + local114 - (float) arg7), local44 * (local166 + local116 - (float) arg8));
			OpenGL.glVertex2f(local159 + local114, local166 + local116);
			OpenGL.glEnd();
			local159 += local171 + local114;
			local166 += local176 + local116;
			local114 = local103;
			local116 = local108;
		}
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "hd", descriptor = "(IIIIIII)V", line = 962)
	@Override
	public void method17225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method17024(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!abt", name = "hc", descriptor = "(IIIIIII)V", line = 962)
	@Override
	public void method17224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method17024(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!abt", name = "bu", descriptor = "(IIIIIII)V", line = 962)
	@Override
	public void method17078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method17024(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!abt", name = "ho", descriptor = "(IIIIIII)V", line = 962)
	@Override
	public void method17226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method17024(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!abt", name = "du", descriptor = "(FFF[F)V", line = 968)
	@Override
	public void method17138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat42 + this.aFloat45 * local59 / local29;
		arg3[1] = this.aFloat46 + this.aFloat47 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abt", name = "oc", descriptor = "(FFF[F)V", line = 968)
	@Override
	public void method17408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat42 + this.aFloat45 * local59 / local29;
		arg3[1] = this.aFloat46 + this.aFloat47 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abt", name = "oi", descriptor = "(FFF[F)V", line = 968)
	@Override
	public void method17236(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat42 + this.aFloat45 * local59 / local29;
		arg3[1] = this.aFloat46 + this.aFloat47 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abt", name = "dw", descriptor = "(FFF[F)V", line = 978)
	@Override
	public void method17030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * arg0 + this.aClass328_13.aFloatArray106[6] * arg1 + this.aClass328_13.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat42 + this.aFloat45 * local115 / local59;
			arg3[1] = this.aFloat46 + this.aFloat47 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ls", descriptor = "(FFF[F)V", line = 978)
	@Override
	public void method17312(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * arg0 + this.aClass328_13.aFloatArray106[6] * arg1 + this.aClass328_13.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat42 + this.aFloat45 * local115 / local59;
			arg3[1] = this.aFloat46 + this.aFloat47 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abt", name = "lx", descriptor = "(FFF[F)V", line = 978)
	@Override
	public void method17323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * arg0 + this.aClass328_13.aFloatArray106[6] * arg1 + this.aClass328_13.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * arg0 + this.aClass328_13.aFloatArray106[7] * arg1 + this.aClass328_13.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * arg0 + this.aClass328_13.aFloatArray106[4] * arg1 + this.aClass328_13.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * arg0 + this.aClass328_13.aFloatArray106[5] * arg1 + this.aClass328_13.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_11.aFloatArray106[14] + this.aClass328_11.aFloatArray106[2] * arg0 + this.aClass328_11.aFloatArray106[6] * arg1 + this.aClass328_11.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat42 + this.aFloat45 * local115 / local59;
			arg3[1] = this.aFloat46 + this.aFloat47 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abt", name = "hb", descriptor = "(IIIIII)I", line = 1013)
	@Override
	public int method17227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg0 + this.aClass328_13.aFloatArray106[6] * (float) arg1 + this.aClass328_13.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg3 + this.aClass328_13.aFloatArray106[6] * (float) arg4 + this.aClass328_13.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg0 + this.aClass328_13.aFloatArray106[7] * (float) arg1 + this.aClass328_13.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg3 + this.aClass328_13.aFloatArray106[7] * (float) arg4 + this.aClass328_13.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg0 + this.aClass328_13.aFloatArray106[4] * (float) arg1 + this.aClass328_13.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg3 + this.aClass328_13.aFloatArray106[4] * (float) arg4 + this.aClass328_13.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg0 + this.aClass328_13.aFloatArray106[5] * (float) arg1 + this.aClass328_13.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg3 + this.aClass328_13.aFloatArray106[5] * (float) arg4 + this.aClass328_13.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abt", name = "hz", descriptor = "(IIIIII)I", line = 1013)
	@Override
	public int method17228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg0 + this.aClass328_13.aFloatArray106[6] * (float) arg1 + this.aClass328_13.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg3 + this.aClass328_13.aFloatArray106[6] * (float) arg4 + this.aClass328_13.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg0 + this.aClass328_13.aFloatArray106[7] * (float) arg1 + this.aClass328_13.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg3 + this.aClass328_13.aFloatArray106[7] * (float) arg4 + this.aClass328_13.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg0 + this.aClass328_13.aFloatArray106[4] * (float) arg1 + this.aClass328_13.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg3 + this.aClass328_13.aFloatArray106[4] * (float) arg4 + this.aClass328_13.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg0 + this.aClass328_13.aFloatArray106[5] * (float) arg1 + this.aClass328_13.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg3 + this.aClass328_13.aFloatArray106[5] * (float) arg4 + this.aClass328_13.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abt", name = "hx", descriptor = "(IIIIII)I", line = 1013)
	@Override
	public int method17229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg0 + this.aClass328_13.aFloatArray106[6] * (float) arg1 + this.aClass328_13.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg3 + this.aClass328_13.aFloatArray106[6] * (float) arg4 + this.aClass328_13.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg0 + this.aClass328_13.aFloatArray106[7] * (float) arg1 + this.aClass328_13.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg3 + this.aClass328_13.aFloatArray106[7] * (float) arg4 + this.aClass328_13.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg0 + this.aClass328_13.aFloatArray106[4] * (float) arg1 + this.aClass328_13.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg3 + this.aClass328_13.aFloatArray106[4] * (float) arg4 + this.aClass328_13.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg0 + this.aClass328_13.aFloatArray106[5] * (float) arg1 + this.aClass328_13.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg3 + this.aClass328_13.aFloatArray106[5] * (float) arg4 + this.aClass328_13.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abt", name = "ba", descriptor = "(IIIIII)I", line = 1013)
	@Override
	public int method17145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg0 + this.aClass328_13.aFloatArray106[6] * (float) arg1 + this.aClass328_13.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_13.aFloatArray106[14] + this.aClass328_13.aFloatArray106[2] * (float) arg3 + this.aClass328_13.aFloatArray106[6] * (float) arg4 + this.aClass328_13.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg0 + this.aClass328_13.aFloatArray106[7] * (float) arg1 + this.aClass328_13.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_13.aFloatArray106[15] + this.aClass328_13.aFloatArray106[3] * (float) arg3 + this.aClass328_13.aFloatArray106[7] * (float) arg4 + this.aClass328_13.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg0 + this.aClass328_13.aFloatArray106[4] * (float) arg1 + this.aClass328_13.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_13.aFloatArray106[12] + this.aClass328_13.aFloatArray106[0] * (float) arg3 + this.aClass328_13.aFloatArray106[4] * (float) arg4 + this.aClass328_13.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg0 + this.aClass328_13.aFloatArray106[5] * (float) arg1 + this.aClass328_13.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_13.aFloatArray106[13] + this.aClass328_13.aFloatArray106[1] * (float) arg3 + this.aClass328_13.aFloatArray106[5] * (float) arg4 + this.aClass328_13.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abt", name = "bc", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1032)
	@Override
	boolean method17029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.aClass328_14;
		local2.method26056(arg4);
		local2.method26046(this.aClass328_13);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat42, this.aFloat46, this.aFloat45, this.aFloat47);
	}

	@OriginalMember(owner = "client!abt", name = "hs", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1032)
	@Override
	boolean method17230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.aClass328_14;
		local2.method26056(arg4);
		local2.method26046(this.aClass328_13);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat42, this.aFloat46, this.aFloat45, this.aFloat47);
	}

	@OriginalMember(owner = "client!abt", name = "bn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1039)
	@Override
	public void method17082(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.aClass328_14;
		local2.method26056(arg0);
		local2.method26046(this.aClass328_13);
		arg1.method22929(arg2, this.aClass328_15, local2, this.aFloat42, this.aFloat46, this.aFloat45, this.aFloat47);
	}

	@OriginalMember(owner = "client!abt", name = "hn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1039)
	@Override
	public void method17122(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.aClass328_14;
		local2.method26056(arg0);
		local2.method26046(this.aClass328_13);
		arg1.method22929(arg2, this.aClass328_15, local2, this.aFloat42, this.aFloat46, this.aFloat45, this.aFloat47);
	}

	@OriginalMember(owner = "client!abt", name = "be", descriptor = "(I)Lclient!afu;", line = 1046)
	@Override
	public Class3_Sub11 method17348(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub1 local4 = new Class3_Sub11_Sub1(arg0);
		this.aClass553_11.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abt", name = "lz", descriptor = "(I)Lclient!afu;", line = 1046)
	@Override
	public Class3_Sub11 method17141(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub1 local4 = new Class3_Sub11_Sub1(arg0);
		this.aClass553_11.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abt", name = "lr", descriptor = "(I)Lclient!afu;", line = 1046)
	@Override
	public Class3_Sub11 method17144(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub1 local4 = new Class3_Sub11_Sub1(arg0);
		this.aClass553_11.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abt", name = "bx", descriptor = "(Lclient!afu;)V", line = 1052)
	@Override
	public void method17084(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap1 = ((Class3_Sub11_Sub1) arg0).aNativeHeap5;
		if (this.anInterface5_3 != null) {
			return;
		}
		@Pc(12) Class3_Sub41_Sub2 local12 = new Class3_Sub41_Sub2(80);
		if (this.aBoolean63) {
			local12.method20474(-1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(-1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
		} else {
			local12.method20475(-1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(-1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
		}
		this.anInterface5_3 = this.method4027(20, local12.aByteArray51, local12.anInt2803 * 62066237, false);
		this.aClass88_10 = new Class88(this.anInterface5_3, 5126, 3, 0);
		this.aClass88_9 = new Class88(this.anInterface5_3, 5126, 2, 12);
		this.aClass99_1.method21819(this);
	}

	@OriginalMember(owner = "client!abt", name = "hy", descriptor = "(Lclient!afu;)V", line = 1052)
	@Override
	public void method17233(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap1 = ((Class3_Sub11_Sub1) arg0).aNativeHeap5;
		if (this.anInterface5_3 != null) {
			return;
		}
		@Pc(12) Class3_Sub41_Sub2 local12 = new Class3_Sub41_Sub2(80);
		if (this.aBoolean63) {
			local12.method20474(-1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(-1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
		} else {
			local12.method20475(-1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(-1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
		}
		this.anInterface5_3 = this.method4027(20, local12.aByteArray51, local12.anInt2803 * 62066237, false);
		this.aClass88_10 = new Class88(this.anInterface5_3, 5126, 3, 0);
		this.aClass88_9 = new Class88(this.anInterface5_3, 5126, 2, 12);
		this.aClass99_1.method21819(this);
	}

	@OriginalMember(owner = "client!abt", name = "hr", descriptor = "(Lclient!afu;)V", line = 1052)
	@Override
	public void method17137(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap1 = ((Class3_Sub11_Sub1) arg0).aNativeHeap5;
		if (this.anInterface5_3 != null) {
			return;
		}
		@Pc(12) Class3_Sub41_Sub2 local12 = new Class3_Sub41_Sub2(80);
		if (this.aBoolean63) {
			local12.method20474(-1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(-1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
		} else {
			local12.method20475(-1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(-1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
		}
		this.anInterface5_3 = this.method4027(20, local12.aByteArray51, local12.anInt2803 * 62066237, false);
		this.aClass88_10 = new Class88(this.anInterface5_3, 5126, 3, 0);
		this.aClass88_9 = new Class88(this.anInterface5_3, 5126, 2, 12);
		this.aClass99_1.method21819(this);
	}

	@OriginalMember(owner = "client!abt", name = "hw", descriptor = "(Lclient!afu;)V", line = 1052)
	@Override
	public void method17232(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap1 = ((Class3_Sub11_Sub1) arg0).aNativeHeap5;
		if (this.anInterface5_3 != null) {
			return;
		}
		@Pc(12) Class3_Sub41_Sub2 local12 = new Class3_Sub41_Sub2(80);
		if (this.aBoolean63) {
			local12.method20474(-1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(-1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(1.0F);
			local12.method20474(-1.0F);
			local12.method20474(0.0F);
			local12.method20474(1.0F);
			local12.method20474(0.0F);
		} else {
			local12.method20475(-1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(-1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(1.0F);
			local12.method20475(-1.0F);
			local12.method20475(0.0F);
			local12.method20475(1.0F);
			local12.method20475(0.0F);
		}
		this.anInterface5_3 = this.method4027(20, local12.aByteArray51, local12.anInt2803 * 62066237, false);
		this.aClass88_10 = new Class88(this.anInterface5_3, 5126, 3, 0);
		this.aClass88_9 = new Class88(this.anInterface5_3, 5126, 2, 12);
		this.aClass99_1.method21819(this);
	}

	@OriginalMember(owner = "client!abt", name = "hv", descriptor = "(IIZZ)Lclient!co;", line = 1107)
	@Override
	public Class6 method17404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "hp", descriptor = "(IIZZ)Lclient!co;", line = 1107)
	@Override
	public Class6 method17335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "hq", descriptor = "(IIZZ)Lclient!co;", line = 1107)
	@Override
	public Class6 method17237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "bj", descriptor = "(IIZZ)Lclient!co;", line = 1107)
	@Override
	public Class6 method17086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "hf", descriptor = "(IIZZ)Lclient!co;", line = 1107)
	@Override
	public Class6 method17235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "bz", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 1111)
	@Override
	public Class6 method17089(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method3448(false);
		@Pc(15) Class6 local15 = this.method17113(local3, 0, arg0.method3433(), arg0.method3433(), arg0.method3440());
		local15.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local15;
	}

	@OriginalMember(owner = "client!abt", name = "hj", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 1111)
	@Override
	public Class6 method17373(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method3448(false);
		@Pc(15) Class6 local15 = this.method17113(local3, 0, arg0.method3433(), arg0.method3433(), arg0.method3440());
		local15.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local15;
	}

	@OriginalMember(owner = "client!abt", name = "he", descriptor = "([IIIIIZ)Lclient!co;", line = 1118)
	@Override
	public Class6 method17240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub3(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "bq", descriptor = "([IIIIIZ)Lclient!co;", line = 1118)
	@Override
	public Class6 method17087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub3(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "ht", descriptor = "([IIIIIZ)Lclient!co;", line = 1118)
	@Override
	public Class6 method17280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub3(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "li", descriptor = "(IIIIZ)Lclient!co;", line = 1122)
	@Override
	public Class6 method17399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "lb", descriptor = "(IIIIZ)Lclient!co;", line = 1122)
	@Override
	public Class6 method17340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "ck", descriptor = "(IIIIZ)Lclient!co;", line = 1122)
	@Override
	public Class6 method17090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "lf", descriptor = "(IIIIZ)Lclient!co;", line = 1122)
	@Override
	public Class6 method17195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "cv", descriptor = "(II[I[I)Lclient!ch;", line = 1126)
	@Override
	public Class5 method17094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class5_Sub2.method592(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "hu", descriptor = "(II[I[I)Lclient!ch;", line = 1126)
	@Override
	public Class5 method17127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class5_Sub2.method592(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abt", name = "cl", descriptor = "(ILclient!ch;II)V", line = 1130)
	@Override
	public void method17095(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg1;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(1);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt422);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt422);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "hl", descriptor = "(ILclient!ch;II)V", line = 1130)
	@Override
	public void method17243(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg1;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(1);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt422);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt422);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "ik", descriptor = "(ILclient!ch;II)V", line = 1130)
	@Override
	public void method17327(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg1;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(1);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt422);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt422);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "id", descriptor = "(ILclient!ch;II)V", line = 1130)
	@Override
	public void method17245(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg1;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.method4068();
		this.method4074(local2.aClass4_Sub1_Sub1_1);
		this.method4089(1);
		this.method4114(7681, 8448);
		this.method4077(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(37) float local37 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt422);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt415 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt415, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt375 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt375);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt424 - arg2), local37 * (float) (this.anInt422 - arg3));
		OpenGL.glVertex2i(this.anInt424, this.anInt422);
		OpenGL.glEnd();
		this.method4077(0, 5890, 768);
	}

	@OriginalMember(owner = "client!abt", name = "il", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 1154)
	@Override
	public Class14 method17246(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "cq", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 1154)
	@Override
	public Class14 method17096(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "iu", descriptor = "(I)V", line = 1157)
	@Override
	public void method17247(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abt", name = "cc", descriptor = "(I)V", line = 1157)
	@Override
	public void method17343(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abt", name = "cs", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 1160)
	@Override
	public Class20 method17100(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "iq", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 1160)
	@Override
	public Class20 method17146(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "ct", descriptor = "(II)I", line = 1164)
	@Override
	public int method17117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abt", name = "ig", descriptor = "(II)I", line = 1164)
	@Override
	public int method17251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abt", name = "im", descriptor = "(II)I", line = 1164)
	@Override
	public int method17173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abt", name = "ir", descriptor = "(II)I", line = 1164)
	@Override
	public int method17250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abt", name = "ip", descriptor = "(II)I", line = 1168)
	@Override
	public int method17338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abt", name = "cx", descriptor = "(II)I", line = 1168)
	@Override
	public int method17102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abt", name = "cy", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 1172)
	@Override
	public Class17 method17273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub1(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "ix", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 1172)
	@Override
	public Class17 method17253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub1(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "cg", descriptor = "()Lclient!mq;", line = 1176)
	@Override
	public Class328 method17333() {
		return this.aClass328_9;
	}

	@OriginalMember(owner = "client!abt", name = "in", descriptor = "()Lclient!mq;", line = 1176)
	@Override
	public Class328 method17254() {
		return this.aClass328_9;
	}

	@OriginalMember(owner = "client!abt", name = "ia", descriptor = "()Lclient!mq;", line = 1176)
	@Override
	public Class328 method17255() {
		return this.aClass328_9;
	}

	@OriginalMember(owner = "client!abt", name = "ih", descriptor = "()Lclient!mq;", line = 1176)
	@Override
	public Class328 method17169() {
		return this.aClass328_9;
	}

	@OriginalMember(owner = "client!abt", name = "if", descriptor = "()Lclient!mq;", line = 1176)
	@Override
	public Class328 method17381() {
		return this.aClass328_9;
	}

	@OriginalMember(owner = "client!abt", name = "cp", descriptor = "()Lclient!mu;", line = 1180)
	@Override
	public Class332 method17098() {
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!abt", name = "is", descriptor = "()Lclient!mu;", line = 1180)
	@Override
	public Class332 method17260() {
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!abt", name = "iy", descriptor = "()Lclient!mu;", line = 1180)
	@Override
	public Class332 method17238() {
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!abt", name = "it", descriptor = "()Lclient!mu;", line = 1180)
	@Override
	public Class332 method17185() {
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!abt", name = "ij", descriptor = "()Lclient!mu;", line = 1180)
	@Override
	public Class332 method17258() {
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!abt", name = "cz", descriptor = "(Lclient!dk;)V", line = 1184)
	@Override
	public void method17105(@OriginalArg(0) Class128 arg0) {
		this.aClass99_1.method21820(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "io", descriptor = "(Lclient!dk;)V", line = 1184)
	@Override
	public void method17266(@OriginalArg(0) Class128 arg0) {
		this.aClass99_1.method21820(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "kb", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17369(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "kd", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17314(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "kj", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17191(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "ky", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17316(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "kq", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17317(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "ks", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17354(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "dj", descriptor = "(ILclient!dz;)V", line = 1188)
	@Override
	public void method17178(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!abt", name = "dx", descriptor = "(ILclient!dz;)V", line = 1194)
	@Override
	public void method17101(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		if (!this.aBoolean73) {
			throw new RuntimeException("");
		}
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		if (this.aBoolean74) {
			this.aClass104_1.aClass7_Sub2_1.method776();
			this.aClass104_1.aClass7_Sub2_1.method777();
		}
	}

	@OriginalMember(owner = "client!abt", name = "kc", descriptor = "(ILclient!dz;)V", line = 1194)
	@Override
	public void method17358(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		if (!this.aBoolean73) {
			throw new RuntimeException("");
		}
		this.anInt453 = arg0;
		this.aClass139_1 = arg1;
		if (this.aBoolean74) {
			this.aClass104_1.aClass7_Sub2_1.method776();
			this.aClass104_1.aClass7_Sub2_1.method777();
		}
	}

	@OriginalMember(owner = "client!abt", name = "dm", descriptor = "()V", line = 1204)
	@Override
	public void method17368() {
		this.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!abt", name = "kp", descriptor = "()V", line = 1204)
	@Override
	public void method17320() {
		this.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!abt", name = "ka", descriptor = "()V", line = 1204)
	@Override
	public void method17336() {
		this.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!abt", name = "ap", descriptor = "()V", line = 1208)
	@Override
	public void method17053() {
		this.anInt445 = 0;
		this.anInt425 = 0;
		this.anInt406 = this.aClass19_6.method21390();
		this.anInt417 = this.aClass19_6.method21391();
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "ge", descriptor = "()V", line = 1208)
	@Override
	public void method17197() {
		this.anInt445 = 0;
		this.anInt425 = 0;
		this.anInt406 = this.aClass19_6.method21390();
		this.anInt417 = this.aClass19_6.method21391();
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "gj", descriptor = "()V", line = 1208)
	@Override
	public void method17390() {
		this.anInt445 = 0;
		this.anInt425 = 0;
		this.anInt406 = this.aClass19_6.method21390();
		this.anInt417 = this.aClass19_6.method21391();
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "gp", descriptor = "()V", line = 1208)
	@Override
	public void method17196() {
		this.anInt445 = 0;
		this.anInt425 = 0;
		this.anInt406 = this.aClass19_6.method21390();
		this.anInt417 = this.aClass19_6.method21391();
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "ab", descriptor = "(IIII)V", line = 1216)
	@Override
	public void method17054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt445 = arg0;
		this.anInt425 = arg1;
		this.anInt406 = arg2;
		this.anInt417 = arg3;
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "gd", descriptor = "(IIII)V", line = 1216)
	@Override
	public void method17199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt445 = arg0;
		this.anInt425 = arg1;
		this.anInt406 = arg2;
		this.anInt417 = arg3;
		this.method4209();
	}

	@OriginalMember(owner = "client!abt", name = "gm", descriptor = "(FF)V", line = 1224)
	@Override
	public void method17200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat48 = arg0;
		this.aFloat43 = arg1;
		this.method4102();
	}

	@OriginalMember(owner = "client!abt", name = "au", descriptor = "(FF)V", line = 1224)
	@Override
	public void method17055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat48 = arg0;
		this.aFloat43 = arg1;
		this.method4102();
	}

	@OriginalMember(owner = "client!abt", name = "gt", descriptor = "([I)V", line = 1230)
	@Override
	public final void method17206(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt415;
		arg0[1] = this.anInt422;
		arg0[2] = this.anInt424;
		arg0[3] = this.anInt375;
	}

	@OriginalMember(owner = "client!abt", name = "ae", descriptor = "([I)V", line = 1230)
	@Override
	public final void method17060(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt415;
		arg0[1] = this.anInt422;
		arg0[2] = this.anInt424;
		arg0[3] = this.anInt375;
	}

	@OriginalMember(owner = "client!abt", name = "gq", descriptor = "([I)V", line = 1230)
	@Override
	public final void method17332(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt415;
		arg0[1] = this.anInt422;
		arg0[2] = this.anInt424;
		arg0[3] = this.anInt375;
	}

	@OriginalMember(owner = "client!abt", name = "ga", descriptor = "([I)V", line = 1230)
	@Override
	public final void method17207(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt415;
		arg0[1] = this.anInt422;
		arg0[2] = this.anInt424;
		arg0[3] = this.anInt375;
	}

	@OriginalMember(owner = "client!abt", name = "gr", descriptor = "([I)V", line = 1230)
	@Override
	public final void method17208(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt415;
		arg0[1] = this.anInt422;
		arg0[2] = this.anInt424;
		arg0[3] = this.anInt375;
	}

	@OriginalMember(owner = "client!abt", name = "gn", descriptor = "()V", line = 1237)
	@Override
	public final void method17201() {
		if (this.aClass19_6 == null) {
			return;
		}
		this.anInt415 = 0;
		this.anInt422 = 0;
		this.anInt424 = this.aClass19_6.method21390();
		this.anInt375 = this.aClass19_6.method21391();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!abt", name = "gv", descriptor = "()V", line = 1237)
	@Override
	public final void method17202() {
		if (this.aClass19_6 == null) {
			return;
		}
		this.anInt415 = 0;
		this.anInt422 = 0;
		this.anInt424 = this.aClass19_6.method21390();
		this.anInt375 = this.aClass19_6.method21391();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!abt", name = "ay", descriptor = "()V", line = 1237)
	@Override
	public final void method17056() {
		if (this.aClass19_6 == null) {
			return;
		}
		this.anInt415 = 0;
		this.anInt422 = 0;
		this.anInt424 = this.aClass19_6.method21390();
		this.anInt375 = this.aClass19_6.method21391();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!abt", name = "ag", descriptor = "(IIII)V", line = 1246)
	@Override
	public final void method17079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass19_6.method21390()) {
			arg2 = this.aClass19_6.method21390();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass19_6.method21391()) {
			arg3 = this.aClass19_6.method21391();
		}
		this.anInt415 = arg0;
		this.anInt422 = arg1;
		this.anInt424 = arg2;
		this.anInt375 = arg3;
		OpenGL.glEnable(3089);
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "gh", descriptor = "(IIII)V", line = 1246)
	@Override
	public final void method17203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass19_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass19_6.method21390()) {
			arg2 = this.aClass19_6.method21390();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass19_6.method21391()) {
			arg3 = this.aClass19_6.method21391();
		}
		this.anInt415 = arg0;
		this.anInt422 = arg1;
		this.anInt424 = arg2;
		this.anInt375 = arg3;
		OpenGL.glEnable(3089);
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "am", descriptor = "(IIII)V", line = 1260)
	@Override
	public final void method17209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt415 < arg0) {
			this.anInt415 = arg0;
		}
		if (this.anInt424 > arg2) {
			this.anInt424 = arg2;
		}
		if (this.anInt422 < arg1) {
			this.anInt422 = arg1;
		}
		if (this.anInt375 > arg3) {
			this.anInt375 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "gz", descriptor = "(IIII)V", line = 1260)
	@Override
	public final void method17085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt415 < arg0) {
			this.anInt415 = arg0;
		}
		if (this.anInt424 > arg2) {
			this.anInt424 = arg2;
		}
		if (this.anInt422 < arg1) {
			this.anInt422 = arg1;
		}
		if (this.anInt375 > arg3) {
			this.anInt375 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "pz", descriptor = "(II)V", line = 1269)
	final void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt435 = arg0;
		this.anInt436 = arg1;
		this.method4209();
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "si", descriptor = "(II)V", line = 1269)
	final void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt435 = arg0;
		this.anInt436 = arg1;
		this.method4209();
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "sj", descriptor = "(II)V", line = 1269)
	final void method4144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt435 = arg0;
		this.anInt436 = arg1;
		this.method4209();
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "sm", descriptor = "(II)V", line = 1269)
	final void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt435 = arg0;
		this.anInt436 = arg1;
		this.method4209();
		this.method4037();
	}

	@OriginalMember(owner = "client!abt", name = "sq", descriptor = "()V", line = 1276)
	final void method4129() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt421 == 2) {
			local9 = this.anInt445;
			local12 = this.anInt425;
			local15 = this.anInt406;
			local18 = this.anInt417;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass19_6.method21390();
			local18 = this.aClass19_6.method21391();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt435 + local9, this.anInt436 + this.aClass19_6.method21391() - local12 - local18, local15, local18);
		this.aFloat45 = (float) this.anInt406 / 2.0F;
		this.aFloat47 = (float) this.anInt417 / 2.0F;
		this.aFloat42 = (float) this.anInt445 + this.aFloat45;
		this.aFloat46 = (float) this.anInt425 + this.aFloat47;
	}

	@OriginalMember(owner = "client!abt", name = "so", descriptor = "()V", line = 1276)
	final void method4148() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt421 == 2) {
			local9 = this.anInt445;
			local12 = this.anInt425;
			local15 = this.anInt406;
			local18 = this.anInt417;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass19_6.method21390();
			local18 = this.aClass19_6.method21391();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt435 + local9, this.anInt436 + this.aClass19_6.method21391() - local12 - local18, local15, local18);
		this.aFloat45 = (float) this.anInt406 / 2.0F;
		this.aFloat47 = (float) this.anInt417 / 2.0F;
		this.aFloat42 = (float) this.anInt445 + this.aFloat45;
		this.aFloat46 = (float) this.anInt425 + this.aFloat47;
	}

	@OriginalMember(owner = "client!abt", name = "pk", descriptor = "()V", line = 1276)
	final void method4209() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt421 == 2) {
			local9 = this.anInt445;
			local12 = this.anInt425;
			local15 = this.anInt406;
			local18 = this.anInt417;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass19_6.method21390();
			local18 = this.aClass19_6.method21391();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt435 + local9, this.anInt436 + this.aClass19_6.method21391() - local12 - local18, local15, local18);
		this.aFloat45 = (float) this.anInt406 / 2.0F;
		this.aFloat47 = (float) this.anInt417 / 2.0F;
		this.aFloat42 = (float) this.anInt445 + this.aFloat45;
		this.aFloat46 = (float) this.anInt425 + this.aFloat47;
	}

	@OriginalMember(owner = "client!abt", name = "sl", descriptor = "()V", line = 1276)
	final void method4214() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt421 == 2) {
			local9 = this.anInt445;
			local12 = this.anInt425;
			local15 = this.anInt406;
			local18 = this.anInt417;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass19_6.method21390();
			local18 = this.aClass19_6.method21391();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt435 + local9, this.anInt436 + this.aClass19_6.method21391() - local12 - local18, local15, local18);
		this.aFloat45 = (float) this.anInt406 / 2.0F;
		this.aFloat47 = (float) this.anInt417 / 2.0F;
		this.aFloat42 = (float) this.anInt445 + this.aFloat45;
		this.aFloat46 = (float) this.anInt425 + this.aFloat47;
	}

	@OriginalMember(owner = "client!abt", name = "pg", descriptor = "()V", line = 1304)
	final void method4102() {
		if (this.anInt421 == 2) {
			OpenGL.glDepthRange(this.aFloat48, this.aFloat43);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!abt", name = "sy", descriptor = "()V", line = 1304)
	final void method4124() {
		if (this.anInt421 == 2) {
			OpenGL.glDepthRange(this.aFloat48, this.aFloat43);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!abt", name = "sh", descriptor = "()V", line = 1304)
	final void method4151() {
		if (this.anInt421 == 2) {
			OpenGL.glDepthRange(this.aFloat48, this.aFloat43);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!abt", name = "pm", descriptor = "()V", line = 1309)
	final void method4037() {
		if (this.aClass19_6 == null || this.anInt415 >= this.anInt424 || this.anInt422 >= this.anInt375) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt435 + this.anInt415, this.anInt436 + this.aClass19_6.method21391() - this.anInt375, this.anInt424 - this.anInt415, this.anInt375 - this.anInt422);
		}
	}

	@OriginalMember(owner = "client!abt", name = "sn", descriptor = "()V", line = 1309)
	final void method4107() {
		if (this.aClass19_6 == null || this.anInt415 >= this.anInt424 || this.anInt422 >= this.anInt375) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt435 + this.anInt415, this.anInt436 + this.aClass19_6.method21391() - this.anInt375, this.anInt424 - this.anInt415, this.anInt375 - this.anInt422);
		}
	}

	@OriginalMember(owner = "client!abt", name = "sa", descriptor = "()V", line = 1309)
	final void method4150() {
		if (this.aClass19_6 == null || this.anInt415 >= this.anInt424 || this.anInt422 >= this.anInt375) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt435 + this.anInt415, this.anInt436 + this.aClass19_6.method21391() - this.anInt375, this.anInt424 - this.anInt415, this.anInt375 - this.anInt422);
		}
	}

	@OriginalMember(owner = "client!abt", name = "tm", descriptor = "()V", line = 1316)
	final void method4051() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!abt", name = "pq", descriptor = "()V", line = 1316)
	final void method4105() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!abt", name = "sv", descriptor = "()V", line = 1316)
	final void method4131() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!abt", name = "st", descriptor = "()V", line = 1316)
	final void method4220() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!abt", name = "pp", descriptor = "(Lclient!mq;)V", line = 1320)
	final void method4205(@OriginalArg(0) Class328 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray106, 0);
	}

	@OriginalMember(owner = "client!abt", name = "pb", descriptor = "(Lclient!mq;)V", line = 1325)
	final void method4112(@OriginalArg(0) Class328 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray106, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tn", descriptor = "(Lclient!mq;)V", line = 1325)
	final void method4152(@OriginalArg(0) Class328 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray106, 0);
	}

	@OriginalMember(owner = "client!abt", name = "pe", descriptor = "()V", line = 1329)
	final void method4039() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!abt", name = "cn", descriptor = "(Lclient!mu;)V", line = 1333)
	@Override
	public final void method17106(@OriginalArg(0) Class332 arg0) {
		this.aClass332_6.method26235(arg0);
		this.aClass328_11.method26056(this.aClass332_6);
		this.aClass332_4.method26235(arg0);
		this.aClass332_4.method26248();
		this.aClass328_12.method26056(this.aClass332_4);
		this.method4142();
		if (this.anInt421 != 1) {
			this.method4041();
		}
	}

	@OriginalMember(owner = "client!abt", name = "je", descriptor = "(Lclient!mu;)V", line = 1333)
	@Override
	public final void method17075(@OriginalArg(0) Class332 arg0) {
		this.aClass332_6.method26235(arg0);
		this.aClass328_11.method26056(this.aClass332_6);
		this.aClass332_4.method26235(arg0);
		this.aClass332_4.method26248();
		this.aClass328_12.method26056(this.aClass332_4);
		this.method4142();
		if (this.anInt421 != 1) {
			this.method4041();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ie", descriptor = "(Lclient!mu;)V", line = 1333)
	@Override
	public final void method17267(@OriginalArg(0) Class332 arg0) {
		this.aClass332_6.method26235(arg0);
		this.aClass328_11.method26056(this.aClass332_6);
		this.aClass332_4.method26235(arg0);
		this.aClass332_4.method26248();
		this.aClass328_12.method26056(this.aClass332_4);
		this.method4142();
		if (this.anInt421 != 1) {
			this.method4041();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ic", descriptor = "(Lclient!mu;)V", line = 1333)
	@Override
	public final void method17268(@OriginalArg(0) Class332 arg0) {
		this.aClass332_6.method26235(arg0);
		this.aClass328_11.method26056(this.aClass332_6);
		this.aClass332_4.method26235(arg0);
		this.aClass332_4.method26248();
		this.aClass328_12.method26056(this.aClass332_4);
		this.method4142();
		if (this.anInt421 != 1) {
			this.method4041();
		}
	}

	@OriginalMember(owner = "client!abt", name = "co", descriptor = "()Lclient!mu;", line = 1343)
	@Override
	public Class332 method17107() {
		return new Class332(this.aClass332_6);
	}

	@OriginalMember(owner = "client!abt", name = "jn", descriptor = "()Lclient!mu;", line = 1343)
	@Override
	public Class332 method17341() {
		return new Class332(this.aClass332_6);
	}

	@OriginalMember(owner = "client!abt", name = "jc", descriptor = "()Lclient!mu;", line = 1343)
	@Override
	public Class332 method17271() {
		return new Class332(this.aClass332_6);
	}

	@OriginalMember(owner = "client!abt", name = "pw", descriptor = "()V", line = 1347)
	final void method4041() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass328_11.aFloatArray106, 0);
		if (this.aBoolean74) {
			this.aClass104_1.aClass7_Sub2_1.method776();
		}
		this.method4055();
		this.method4050();
	}

	@OriginalMember(owner = "client!abt", name = "tc", descriptor = "()V", line = 1347)
	final void method4153() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass328_11.aFloatArray106, 0);
		if (this.aBoolean74) {
			this.aClass104_1.aClass7_Sub2_1.method776();
		}
		this.method4055();
		this.method4050();
	}

	@OriginalMember(owner = "client!abt", name = "ch", descriptor = "(Lclient!mq;)V", line = 1355)
	@Override
	public final void method17322(@OriginalArg(0) Class328 arg0) {
		this.aClass328_15.method26104(arg0);
		this.method4142();
		this.method4045();
	}

	@OriginalMember(owner = "client!abt", name = "jb", descriptor = "(Lclient!mq;)V", line = 1355)
	@Override
	public final void method17272(@OriginalArg(0) Class328 arg0) {
		this.aClass328_15.method26104(arg0);
		this.method4142();
		this.method4045();
	}

	@OriginalMember(owner = "client!abt", name = "jp", descriptor = "(Lclient!mq;)V", line = 1355)
	@Override
	public final void method17170(@OriginalArg(0) Class328 arg0) {
		this.aClass328_15.method26104(arg0);
		this.method4142();
		this.method4045();
	}

	@OriginalMember(owner = "client!abt", name = "jo", descriptor = "(Lclient!mq;)V", line = 1355)
	@Override
	public final void method17274(@OriginalArg(0) Class328 arg0) {
		this.aClass328_15.method26104(arg0);
		this.method4142();
		this.method4045();
	}

	@OriginalMember(owner = "client!abt", name = "ci", descriptor = "()Lclient!mq;", line = 1361)
	@Override
	public final Class328 method17110() {
		return new Class328(this.aClass328_15);
	}

	@OriginalMember(owner = "client!abt", name = "jq", descriptor = "()Lclient!mq;", line = 1361)
	@Override
	public final Class328 method17275() {
		return new Class328(this.aClass328_15);
	}

	@OriginalMember(owner = "client!abt", name = "py", descriptor = "()V", line = 1365)
	final void method4161() {
		if (this.anInt421 != 0) {
			this.anInt421 = 0;
			this.method4209();
			this.method4102();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ti", descriptor = "()V", line = 1365)
	final void method4215() {
		if (this.anInt421 != 0) {
			this.anInt421 = 0;
			this.method4209();
			this.method4102();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "pv", descriptor = "()V", line = 1374)
	final void method4043() {
		if (this.anInt421 == 1) {
			return;
		}
		this.anInt421 = 1;
		this.method4045();
		this.method4209();
		this.method4102();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt412 &= 0xFFFFFFF7;
	}

	@OriginalMember(owner = "client!abt", name = "ta", descriptor = "()V", line = 1374)
	final void method4155() {
		if (this.anInt421 == 1) {
			return;
		}
		this.anInt421 = 1;
		this.method4045();
		this.method4209();
		this.method4102();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt412 &= 0xFFFFFFF7;
	}

	@OriginalMember(owner = "client!abt", name = "ts", descriptor = "()V", line = 1386)
	final void method4031() {
		if (this.anInt421 == 2) {
			return;
		}
		this.anInt421 = 2;
		this.method4047(this.aClass328_15.aFloatArray106);
		this.method4041();
		this.method4209();
		this.method4102();
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "tu", descriptor = "()V", line = 1386)
	final void method4116() {
		if (this.anInt421 == 2) {
			return;
		}
		this.anInt421 = 2;
		this.method4047(this.aClass328_15.aFloatArray106);
		this.method4041();
		this.method4209();
		this.method4102();
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "px", descriptor = "()V", line = 1386)
	final void method4243() {
		if (this.anInt421 == 2) {
			return;
		}
		this.anInt421 = 2;
		this.method4047(this.aClass328_15.aFloatArray106);
		this.method4041();
		this.method4209();
		this.method4102();
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "pf", descriptor = "()V", line = 1397)
	final void method4045() {
		this.aFloat55 = this.aClass328_15.method26062();
		this.aFloat49 = this.aClass328_15.method26123();
		this.method4235();
		if (this.anInt421 == 2) {
			this.method4047(this.aClass328_15.aFloatArray106);
		} else if (this.anInt421 == 1) {
			this.method4047(this.aClass328_8.aFloatArray106);
		}
	}

	@OriginalMember(owner = "client!abt", name = "ty", descriptor = "()V", line = 1397)
	final void method4126() {
		this.aFloat55 = this.aClass328_15.method26062();
		this.aFloat49 = this.aClass328_15.method26123();
		this.method4235();
		if (this.anInt421 == 2) {
			this.method4047(this.aClass328_15.aFloatArray106);
		} else if (this.anInt421 == 1) {
			this.method4047(this.aClass328_8.aFloatArray106);
		}
	}

	@OriginalMember(owner = "client!abt", name = "pa", descriptor = "()V", line = 1409)
	final void method4142() {
		this.aClass328_13.method26104(this.aClass328_11);
		this.aClass328_13.method26046(this.aClass328_15);
		this.aClass328_13.method26066(this.aFloatArrayArray8[0]);
		this.aClass328_13.method26107(this.aFloatArrayArray8[1]);
		this.aClass328_13.method26063(this.aFloatArrayArray8[2]);
		this.aClass328_13.method26064(this.aFloatArrayArray8[3]);
		this.aClass328_13.method26084(this.aFloatArrayArray8[4]);
		this.aClass328_13.method26065(this.aFloatArrayArray8[5]);
	}

	@OriginalMember(owner = "client!abt", name = "tw", descriptor = "()V", line = 1409)
	final void method4158() {
		this.aClass328_13.method26104(this.aClass328_11);
		this.aClass328_13.method26046(this.aClass328_15);
		this.aClass328_13.method26066(this.aFloatArrayArray8[0]);
		this.aClass328_13.method26107(this.aFloatArrayArray8[1]);
		this.aClass328_13.method26063(this.aFloatArrayArray8[2]);
		this.aClass328_13.method26064(this.aFloatArrayArray8[3]);
		this.aClass328_13.method26084(this.aFloatArrayArray8[4]);
		this.aClass328_13.method26065(this.aFloatArrayArray8[5]);
	}

	@OriginalMember(owner = "client!abt", name = "tk", descriptor = "()V", line = 1409)
	final void method4159() {
		this.aClass328_13.method26104(this.aClass328_11);
		this.aClass328_13.method26046(this.aClass328_15);
		this.aClass328_13.method26066(this.aFloatArrayArray8[0]);
		this.aClass328_13.method26107(this.aFloatArrayArray8[1]);
		this.aClass328_13.method26063(this.aFloatArrayArray8[2]);
		this.aClass328_13.method26064(this.aFloatArrayArray8[3]);
		this.aClass328_13.method26084(this.aFloatArrayArray8[4]);
		this.aClass328_13.method26065(this.aFloatArrayArray8[5]);
	}

	@OriginalMember(owner = "client!abt", name = "pt", descriptor = "([F)V", line = 1420)
	final void method4047(@OriginalArg(0) float[] arg0) {
		@Pc(2) float[] local2 = new float[16];
		System.arraycopy(arg0, 0, local2, 0, 16);
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(local2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!abt", name = "gf", descriptor = "(Z)V", line = 1432)
	@Override
	public void method17194(@OriginalArg(0) boolean arg0) {
		this.aBoolean59 = arg0;
		this.method4088();
	}

	@OriginalMember(owner = "client!abt", name = "gy", descriptor = "(Z)V", line = 1432)
	@Override
	public void method17119(@OriginalArg(0) boolean arg0) {
		this.aBoolean59 = arg0;
		this.method4088();
	}

	@OriginalMember(owner = "client!abt", name = "cd", descriptor = "(Z)V", line = 1432)
	@Override
	public void method17108(@OriginalArg(0) boolean arg0) {
		this.aBoolean59 = arg0;
		this.method4088();
	}

	@OriginalMember(owner = "client!abt", name = "iw", descriptor = "()I", line = 1437)
	@Override
	public int method17375() {
		return 4;
	}

	@OriginalMember(owner = "client!abt", name = "ii", descriptor = "()I", line = 1437)
	@Override
	public int method17378() {
		return 4;
	}

	@OriginalMember(owner = "client!abt", name = "cf", descriptor = "()I", line = 1437)
	@Override
	public int method17023() {
		return 4;
	}

	@OriginalMember(owner = "client!abt", name = "df", descriptor = "(I[Lclient!afz;)V", line = 1441)
	@Override
	public void method17310(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass3_Sub15Array1[local1] = arg1[local1];
		}
		this.anInt379 = arg0;
		if (this.anInt421 != 1) {
			this.method4050();
		}
	}

	@OriginalMember(owner = "client!abt", name = "lg", descriptor = "(I[Lclient!afz;)V", line = 1441)
	@Override
	public void method17342(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass3_Sub15Array1[local1] = arg1[local1];
		}
		this.anInt379 = arg0;
		if (this.anInt421 != 1) {
			this.method4050();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ps", descriptor = "()V", line = 1447)
	void method4050() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt379; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method11280();
			aFloatArray23[1] = local10.method11281();
			aFloatArray23[2] = local10.method11282();
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method11279();
			@Pc(54) float local54 = local10.method11300() / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method11291() * local10.method11291()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt391) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt391 = this.anInt379;
	}

	@OriginalMember(owner = "client!abt", name = "tz", descriptor = "()V", line = 1447)
	void method4109() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt379; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method11280();
			aFloatArray23[1] = local10.method11281();
			aFloatArray23[2] = local10.method11282();
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method11279();
			@Pc(54) float local54 = local10.method11300() / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method11291() * local10.method11291()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt391) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt391 = this.anInt379;
	}

	@OriginalMember(owner = "client!abt", name = "tb", descriptor = "()V", line = 1447)
	void method4113() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt379; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method11280();
			aFloatArray23[1] = local10.method11281();
			aFloatArray23[2] = local10.method11282();
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method11279();
			@Pc(54) float local54 = local10.method11300() / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method11291() * local10.method11291()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt391) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt391 = this.anInt379;
	}

	@OriginalMember(owner = "client!abt", name = "to", descriptor = "()V", line = 1447)
	void method4130() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt379; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method11280();
			aFloatArray23[1] = local10.method11281();
			aFloatArray23[2] = local10.method11282();
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method11279();
			@Pc(54) float local54 = local10.method11300() / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method11291() * local10.method11291()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt391) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt391 = this.anInt379;
	}

	@OriginalMember(owner = "client!abt", name = "tl", descriptor = "()V", line = 1447)
	void method4162() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt379; local1++) {
			@Pc(10) Class3_Sub15 local10 = this.aClass3_Sub15Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray23[0] = local10.method11280();
			aFloatArray23[1] = local10.method11281();
			aFloatArray23[2] = local10.method11282();
			aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray23, 0);
			@Pc(48) int local48 = local10.method11279();
			@Pc(54) float local54 = local10.method11300() / 255.0F;
			aFloatArray23[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray23[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray23[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray23, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method11291() * local10.method11291()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt391) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt391 = this.anInt379;
	}

	@OriginalMember(owner = "client!abt", name = "ca", descriptor = "(F)V", line = 1472)
	@Override
	public final void method17111(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method4054();
		}
	}

	@OriginalMember(owner = "client!abt", name = "jy", descriptor = "(F)V", line = 1472)
	@Override
	public final void method17099(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method4054();
		}
	}

	@OriginalMember(owner = "client!abt", name = "jm", descriptor = "(F)V", line = 1472)
	@Override
	public final void method17277(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method4054();
		}
	}

	@OriginalMember(owner = "client!abt", name = "jg", descriptor = "(F)V", line = 1472)
	@Override
	public final void method17192(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method4054();
		}
	}

	@OriginalMember(owner = "client!abt", name = "jz", descriptor = "(F)V", line = 1472)
	@Override
	public final void method17279(@OriginalArg(0) float arg0) {
		if (this.aFloat44 != arg0) {
			this.aFloat44 = arg0;
			this.method4054();
		}
	}

	@OriginalMember(owner = "client!abt", name = "cr", descriptor = "(IFFFFF)V", line = 1479)
	@Override
	public final void method17132(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt371 != arg0;
		if (local7 || this.aFloat54 != arg1 || this.aFloat61 != arg2) {
			this.anInt371 = arg0;
			this.aFloat54 = arg1;
			this.aFloat61 = arg2;
			if (local7) {
				this.aFloat52 = (float) (this.anInt371 & 0xFF0000) / 1.671168E7F;
				this.aFloat50 = (float) (this.anInt371 & 0xFF00) / 65280.0F;
				this.aFloat53 = (float) (this.anInt371 & 0xFF) / 255.0F;
				this.method4054();
			}
			this.method4030();
		}
		if (this.aFloatArray24[0] == arg3 && this.aFloatArray24[1] == arg4 && this.aFloatArray24[2] == arg5) {
			return;
		}
		this.aFloatArray24[0] = arg3;
		this.aFloatArray24[1] = arg4;
		this.aFloatArray24[2] = arg5;
		this.aFloatArray25[0] = -arg3;
		this.aFloatArray25[1] = -arg4;
		this.aFloatArray25[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray26[0] = arg3 * local132;
		this.aFloatArray26[1] = arg4 * local132;
		this.aFloatArray26[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray26[0];
		this.aFloatArray22[1] = -this.aFloatArray26[1];
		this.aFloatArray22[2] = -this.aFloatArray26[2];
		this.method4055();
		this.anInt377 = (int) (arg3 * 256.0F / arg4);
		this.anInt431 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!abt", name = "jd", descriptor = "(IFFFFF)V", line = 1479)
	@Override
	public final void method17319(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt371 != arg0;
		if (local7 || this.aFloat54 != arg1 || this.aFloat61 != arg2) {
			this.anInt371 = arg0;
			this.aFloat54 = arg1;
			this.aFloat61 = arg2;
			if (local7) {
				this.aFloat52 = (float) (this.anInt371 & 0xFF0000) / 1.671168E7F;
				this.aFloat50 = (float) (this.anInt371 & 0xFF00) / 65280.0F;
				this.aFloat53 = (float) (this.anInt371 & 0xFF) / 255.0F;
				this.method4054();
			}
			this.method4030();
		}
		if (this.aFloatArray24[0] == arg3 && this.aFloatArray24[1] == arg4 && this.aFloatArray24[2] == arg5) {
			return;
		}
		this.aFloatArray24[0] = arg3;
		this.aFloatArray24[1] = arg4;
		this.aFloatArray24[2] = arg5;
		this.aFloatArray25[0] = -arg3;
		this.aFloatArray25[1] = -arg4;
		this.aFloatArray25[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray26[0] = arg3 * local132;
		this.aFloatArray26[1] = arg4 * local132;
		this.aFloatArray26[2] = arg5 * local132;
		this.aFloatArray22[0] = -this.aFloatArray26[0];
		this.aFloatArray22[1] = -this.aFloatArray26[1];
		this.aFloatArray22[2] = -this.aFloatArray26[2];
		this.method4055();
		this.anInt377 = (int) (arg3 * 256.0F / arg4);
		this.anInt431 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!abt", name = "ce", descriptor = "(I)V", line = 1513)
	@Override
	public final void method17412(@OriginalArg(0) int arg0) {
		this.anInt408 = 0;
		while (arg0 > 1) {
			this.anInt408++;
			arg0 >>= 0x1;
		}
		this.anInt407 = 0x1 << this.anInt408;
	}

	@OriginalMember(owner = "client!abt", name = "jx", descriptor = "(I)V", line = 1513)
	@Override
	public final void method17406(@OriginalArg(0) int arg0) {
		this.anInt408 = 0;
		while (arg0 > 1) {
			this.anInt408++;
			arg0 >>= 0x1;
		}
		this.anInt407 = 0x1 << this.anInt408;
	}

	@OriginalMember(owner = "client!abt", name = "ja", descriptor = "(I)V", line = 1513)
	@Override
	public final void method17282(@OriginalArg(0) int arg0) {
		this.anInt408 = 0;
		while (arg0 > 1) {
			this.anInt408++;
			arg0 >>= 0x1;
		}
		this.anInt407 = 0x1 << this.anInt408;
	}

	@OriginalMember(owner = "client!abt", name = "cw", descriptor = "(III)V", line = 1522)
	@Override
	public final void method17114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt432 == arg0 && this.anInt433 == arg1 && this.anInt434 == arg2) {
			return;
		}
		this.anInt432 = arg0;
		this.anInt433 = arg1;
		this.anInt434 = arg2;
		this.method4235();
		this.method4056();
	}

	@OriginalMember(owner = "client!abt", name = "jl", descriptor = "(III)V", line = 1522)
	@Override
	public final void method17234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt432 == arg0 && this.anInt433 == arg1 && this.anInt434 == arg2) {
			return;
		}
		this.anInt432 = arg0;
		this.anInt433 = arg1;
		this.anInt434 = arg2;
		this.method4235();
		this.method4056();
	}

	@OriginalMember(owner = "client!abt", name = "jr", descriptor = "(III)V", line = 1522)
	@Override
	public final void method17027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt432 == arg0 && this.anInt433 == arg1 && this.anInt434 == arg2) {
			return;
		}
		this.anInt432 = arg0;
		this.anInt433 = arg1;
		this.anInt434 = arg2;
		this.method4235();
		this.method4056();
	}

	@OriginalMember(owner = "client!abt", name = "pn", descriptor = "(FF)V", line = 1532)
	final void method4053(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat58 = arg0;
		this.aFloat57 = arg1;
		this.method4235();
	}

	@OriginalMember(owner = "client!abt", name = "tx", descriptor = "(FF)V", line = 1532)
	final void method4163(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat58 = arg0;
		this.aFloat57 = arg1;
		this.method4235();
	}

	@OriginalMember(owner = "client!abt", name = "pr", descriptor = "()V", line = 1538)
	void method4054() {
		aFloatArray29[0] = this.aFloat44 * this.aFloat52;
		aFloatArray29[1] = this.aFloat44 * this.aFloat50;
		aFloatArray29[2] = this.aFloat44 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tp", descriptor = "()V", line = 1538)
	void method4164() {
		aFloatArray29[0] = this.aFloat44 * this.aFloat52;
		aFloatArray29[1] = this.aFloat44 * this.aFloat50;
		aFloatArray29[2] = this.aFloat44 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "pu", descriptor = "()V", line = 1546)
	void method4030() {
		aFloatArray29[0] = this.aFloat54 * this.aFloat52;
		aFloatArray29[1] = this.aFloat54 * this.aFloat50;
		aFloatArray29[2] = this.aFloat54 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray29, 0);
		aFloatArray29[0] = -this.aFloat61 * this.aFloat52;
		aFloatArray29[1] = -this.aFloat61 * this.aFloat50;
		aFloatArray29[2] = -this.aFloat61 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tr", descriptor = "()V", line = 1546)
	void method4147() {
		aFloatArray29[0] = this.aFloat54 * this.aFloat52;
		aFloatArray29[1] = this.aFloat54 * this.aFloat50;
		aFloatArray29[2] = this.aFloat54 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray29, 0);
		aFloatArray29[0] = -this.aFloat61 * this.aFloat52;
		aFloatArray29[1] = -this.aFloat61 * this.aFloat50;
		aFloatArray29[2] = -this.aFloat61 * this.aFloat53;
		aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "qc", descriptor = "()V", line = 1559)
	void method4055() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray26, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tv", descriptor = "()V", line = 1559)
	void method4165() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray26, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tj", descriptor = "()V", line = 1559)
	void method4166() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray26, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!abt", name = "qi", descriptor = "()V", line = 1564)
	void method4056() {
		if (this.aBoolean91 && this.anInt433 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!abt", name = "td", descriptor = "()V", line = 1564)
	void method4096() {
		if (this.aBoolean91 && this.anInt433 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!abt", name = "tf", descriptor = "()V", line = 1564)
	void method4167() {
		if (this.aBoolean91 && this.anInt433 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!abt", name = "tg", descriptor = "()V", line = 1569)
	void method4168() {
		this.aFloat51 = this.aFloat55 - (float) this.anInt434 - this.aFloat57;
		this.aFloat56 = this.aFloat51 - (float) this.anInt433 * this.aFloat58;
		if (this.aFloat56 < this.aFloat49) {
			this.aFloat56 = this.aFloat49;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat51);
		aFloatArray29[0] = (float) (this.anInt432 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (this.anInt432 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (this.anInt432 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "th", descriptor = "()V", line = 1569)
	void method4169() {
		this.aFloat51 = this.aFloat55 - (float) this.anInt434 - this.aFloat57;
		this.aFloat56 = this.aFloat51 - (float) this.anInt433 * this.aFloat58;
		if (this.aFloat56 < this.aFloat49) {
			this.aFloat56 = this.aFloat49;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat51);
		aFloatArray29[0] = (float) (this.anInt432 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (this.anInt432 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (this.anInt432 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "tq", descriptor = "()V", line = 1569)
	void method4170() {
		this.aFloat51 = this.aFloat55 - (float) this.anInt434 - this.aFloat57;
		this.aFloat56 = this.aFloat51 - (float) this.anInt433 * this.aFloat58;
		if (this.aFloat56 < this.aFloat49) {
			this.aFloat56 = this.aFloat49;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat51);
		aFloatArray29[0] = (float) (this.anInt432 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (this.anInt432 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (this.anInt432 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "qs", descriptor = "()V", line = 1569)
	void method4235() {
		this.aFloat51 = this.aFloat55 - (float) this.anInt434 - this.aFloat57;
		this.aFloat56 = this.aFloat51 - (float) this.anInt433 * this.aFloat58;
		if (this.aFloat56 < this.aFloat49) {
			this.aFloat56 = this.aFloat49;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat51);
		aFloatArray29[0] = (float) (this.anInt432 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (this.anInt432 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (this.anInt432 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "jt", descriptor = "(I)Lclient!db;", line = 1581)
	@Override
	public Class18 method17286(@OriginalArg(0) int arg0) {
		return this.aBoolean84 ? new Class18_Sub1_Sub1(this, arg0) : null;
	}

	@OriginalMember(owner = "client!abt", name = "dh", descriptor = "(I)Lclient!db;", line = 1581)
	@Override
	public Class18 method17248(@OriginalArg(0) int arg0) {
		return this.aBoolean84 ? new Class18_Sub1_Sub1(this, arg0) : null;
	}

	@OriginalMember(owner = "client!abt", name = "jj", descriptor = "(I)Lclient!db;", line = 1581)
	@Override
	public Class18 method17285(@OriginalArg(0) int arg0) {
		return this.aBoolean84 ? new Class18_Sub1_Sub1(this, arg0) : null;
	}

	@OriginalMember(owner = "client!abt", name = "jw", descriptor = "(I)Lclient!db;", line = 1581)
	@Override
	public Class18 method17287(@OriginalArg(0) int arg0) {
		return this.aBoolean84 ? new Class18_Sub1_Sub1(this, arg0) : null;
	}

	@OriginalMember(owner = "client!abt", name = "jk", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1585)
	@Override
	public Class18 method17288(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean84 && this.aBoolean77) {
			@Pc(11) Class18_Sub1_Sub2 local11 = null;
			@Pc(14) Class18_Sub1 local14 = (Class18_Sub1) arg0;
			@Pc(17) Class18_Sub1 local17 = (Class18_Sub1) arg1;
			@Pc(20) Class4_Sub2 local20 = local14.method16877();
			@Pc(23) Class4_Sub2 local23 = local17.method16877();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt80 > local23.anInt80 ? local20.anInt80 : local23.anInt80;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class18_Sub1_Sub2) {
					@Pc(50) Class18_Sub1_Sub2 local50 = (Class18_Sub1_Sub2) arg3;
					if (local50.method16880() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class18_Sub1_Sub2(this, local38);
				}
				if (local11.method16881(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!abt", name = "db", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1585)
	@Override
	public Class18 method17074(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean84 && this.aBoolean77) {
			@Pc(11) Class18_Sub1_Sub2 local11 = null;
			@Pc(14) Class18_Sub1 local14 = (Class18_Sub1) arg0;
			@Pc(17) Class18_Sub1 local17 = (Class18_Sub1) arg1;
			@Pc(20) Class4_Sub2 local20 = local14.method16877();
			@Pc(23) Class4_Sub2 local23 = local17.method16877();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt80 > local23.anInt80 ? local20.anInt80 : local23.anInt80;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class18_Sub1_Sub2) {
					@Pc(50) Class18_Sub1_Sub2 local50 = (Class18_Sub1_Sub2) arg3;
					if (local50.method16880() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class18_Sub1_Sub2(this, local38);
				}
				if (local11.method16881(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!abt", name = "jv", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1585)
	@Override
	public Class18 method17289(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean84 && this.aBoolean77) {
			@Pc(11) Class18_Sub1_Sub2 local11 = null;
			@Pc(14) Class18_Sub1 local14 = (Class18_Sub1) arg0;
			@Pc(17) Class18_Sub1 local17 = (Class18_Sub1) arg1;
			@Pc(20) Class4_Sub2 local20 = local14.method16877();
			@Pc(23) Class4_Sub2 local23 = local17.method16877();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt80 > local23.anInt80 ? local20.anInt80 : local23.anInt80;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class18_Sub1_Sub2) {
					@Pc(50) Class18_Sub1_Sub2 local50 = (Class18_Sub1_Sub2) arg3;
					if (local50.method16880() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class18_Sub1_Sub2(this, local38);
				}
				if (local11.method16881(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!abt", name = "js", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1585)
	@Override
	public Class18 method17379(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean84 && this.aBoolean77) {
			@Pc(11) Class18_Sub1_Sub2 local11 = null;
			@Pc(14) Class18_Sub1 local14 = (Class18_Sub1) arg0;
			@Pc(17) Class18_Sub1 local17 = (Class18_Sub1) arg1;
			@Pc(20) Class4_Sub2 local20 = local14.method16877();
			@Pc(23) Class4_Sub2 local23 = local17.method16877();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt80 > local23.anInt80 ? local20.anInt80 : local23.anInt80;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class18_Sub1_Sub2) {
					@Pc(50) Class18_Sub1_Sub2 local50 = (Class18_Sub1_Sub2) arg3;
					if (local50.method16880() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class18_Sub1_Sub2(this, local38);
				}
				if (local11.method16881(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!abt", name = "lw", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17097(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "dp", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17400(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "lt", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17345(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "ln", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17172(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "lo", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17346(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "lq", descriptor = "(Lclient!db;)V", line = 1605)
	@Override
	public final void method17347(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_1 = (Class18_Sub1) arg0;
	}

	@OriginalMember(owner = "client!abt", name = "qj", descriptor = "()Lclient!aae;", line = 1609)
	final Class4_Sub2 method4057() {
		return this.aClass18_Sub1_1 == null ? null : this.aClass18_Sub1_1.method16877();
	}

	@OriginalMember(owner = "client!abt", name = "tt", descriptor = "()Lclient!aae;", line = 1609)
	final Class4_Sub2 method4172() {
		return this.aClass18_Sub1_1 == null ? null : this.aClass18_Sub1_1.method16877();
	}

	@OriginalMember(owner = "client!abt", name = "uy", descriptor = "()Lclient!aae;", line = 1609)
	final Class4_Sub2 method4173() {
		return this.aClass18_Sub1_1 == null ? null : this.aClass18_Sub1_1.method16877();
	}

	@OriginalMember(owner = "client!abt", name = "te", descriptor = "()Lclient!aae;", line = 1609)
	final Class4_Sub2 method4224() {
		return this.aClass18_Sub1_1 == null ? null : this.aClass18_Sub1_1.method16877();
	}

	@OriginalMember(owner = "client!abt", name = "ju", descriptor = "(IIII)V", line = 1613)
	@Override
	public final void method17292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22037(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abt", name = "dk", descriptor = "(IIII)V", line = 1613)
	@Override
	public final void method17121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22037(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abt", name = "ji", descriptor = "(IIII)V", line = 1613)
	@Override
	public final void method17205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22037(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abt", name = "jh", descriptor = "(IIII)V", line = 1613)
	@Override
	public final void method17293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22037(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abt", name = "jf", descriptor = "()V", line = 1618)
	@Override
	public final void method17294() {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22038();
		}
	}

	@OriginalMember(owner = "client!abt", name = "dy", descriptor = "()V", line = 1618)
	@Override
	public final void method17124() {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22038();
		}
	}

	@OriginalMember(owner = "client!abt", name = "kf", descriptor = "()V", line = 1618)
	@Override
	public final void method17295() {
		if (this.aClass113_1 != null) {
			this.aClass113_1.method22038();
		}
	}

	@OriginalMember(owner = "client!abt", name = "dg", descriptor = "()Z", line = 1623)
	@Override
	public final boolean method17123() {
		return this.aClass113_1 == null ? false : this.aClass113_1.method22034();
	}

	@OriginalMember(owner = "client!abt", name = "kx", descriptor = "()Z", line = 1623)
	@Override
	public final boolean method17296() {
		return this.aClass113_1 == null ? false : this.aClass113_1.method22034();
	}

	@OriginalMember(owner = "client!abt", name = "qk", descriptor = "()Z", line = 1628)
	boolean method4046() {
		if (this.aClass3_Sub9_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub3_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub3_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ub", descriptor = "()Z", line = 1628)
	boolean method4121() {
		if (this.aClass3_Sub9_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub3_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub3_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "uh", descriptor = "()Z", line = 1628)
	boolean method4174() {
		if (this.aClass3_Sub9_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub3_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub3_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "dq", descriptor = "()Z", line = 1639)
	@Override
	public boolean method17217() {
		return this.aClass3_Sub9_Sub3_1 != null && this.aClass3_Sub9_Sub3_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "kl", descriptor = "()Z", line = 1639)
	@Override
	public boolean method17298() {
		return this.aClass3_Sub9_Sub3_1 != null && this.aClass3_Sub9_Sub3_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "kw", descriptor = "()Z", line = 1639)
	@Override
	public boolean method17249() {
		return this.aClass3_Sub9_Sub3_1 != null && this.aClass3_Sub9_Sub3_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "ds", descriptor = "(FFFFF)V", line = 1643)
	@Override
	public void method17125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class3_Sub9_Sub3.aFloat209 = arg0;
		Class3_Sub9_Sub3.aFloat205 = arg1;
		Class3_Sub9_Sub3.aFloat206 = arg2;
		Class3_Sub9_Sub3.aFloat207 = arg3;
		Class3_Sub9_Sub3.aFloat208 = arg4;
	}

	@OriginalMember(owner = "client!abt", name = "kr", descriptor = "(FFFFF)V", line = 1643)
	@Override
	public void method17299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class3_Sub9_Sub3.aFloat209 = arg0;
		Class3_Sub9_Sub3.aFloat205 = arg1;
		Class3_Sub9_Sub3.aFloat206 = arg2;
		Class3_Sub9_Sub3.aFloat207 = arg3;
		Class3_Sub9_Sub3.aFloat208 = arg4;
	}

	@OriginalMember(owner = "client!abt", name = "dr", descriptor = "([I)Lclient!cf;", line = 1651)
	@Override
	public Class16 method17126(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "kn", descriptor = "([I)Lclient!cf;", line = 1651)
	@Override
	public Class16 method17300(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "kv", descriptor = "([I)Lclient!cf;", line = 1651)
	@Override
	public Class16 method17120(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abt", name = "qy", descriptor = "()Z", line = 1655)
	boolean method4059() {
		if (this.aClass3_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub1_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "uw", descriptor = "()Z", line = 1655)
	boolean method4160() {
		if (this.aClass3_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub1_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "uc", descriptor = "()Z", line = 1655)
	boolean method4176() {
		if (this.aClass3_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub1_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "dc", descriptor = "()Z", line = 1666)
	@Override
	public boolean method17366() {
		return this.aClass3_Sub9_Sub1_1 != null && this.aClass3_Sub9_Sub1_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "km", descriptor = "()Z", line = 1666)
	@Override
	public boolean method17071() {
		return this.aClass3_Sub9_Sub1_1 != null && this.aClass3_Sub9_Sub1_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "kg", descriptor = "()Z", line = 1666)
	@Override
	public boolean method17281() {
		return this.aClass3_Sub9_Sub1_1 != null && this.aClass3_Sub9_Sub1_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "dt", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1670)
	@Override
	public void method17128(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class3_Sub9_Sub1.aClass16_Sub1Array1[0] = (Class16_Sub1) arg0;
		Class3_Sub9_Sub1.aFloatArray81[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[1] = (Class16_Sub1) arg2;
		Class3_Sub9_Sub1.aFloatArray81[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[2] = (Class16_Sub1) arg4;
		Class3_Sub9_Sub1.aFloatArray81[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.anInt2613 = local1;
		Class3_Sub9_Sub1.aFloat201 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abt", name = "ke", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1670)
	@Override
	public void method17034(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class3_Sub9_Sub1.aClass16_Sub1Array1[0] = (Class16_Sub1) arg0;
		Class3_Sub9_Sub1.aFloatArray81[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[1] = (Class16_Sub1) arg2;
		Class3_Sub9_Sub1.aFloatArray81[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[2] = (Class16_Sub1) arg4;
		Class3_Sub9_Sub1.aFloatArray81[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.anInt2613 = local1;
		Class3_Sub9_Sub1.aFloat201 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abt", name = "kh", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1670)
	@Override
	public void method17305(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class3_Sub9_Sub1.aClass16_Sub1Array1[0] = (Class16_Sub1) arg0;
		Class3_Sub9_Sub1.aFloatArray81[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[1] = (Class16_Sub1) arg2;
		Class3_Sub9_Sub1.aFloatArray81[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[2] = (Class16_Sub1) arg4;
		Class3_Sub9_Sub1.aFloatArray81[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.anInt2613 = local1;
		Class3_Sub9_Sub1.aFloat201 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abt", name = "kk", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1670)
	@Override
	public void method17212(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class3_Sub9_Sub1.aClass16_Sub1Array1[0] = (Class16_Sub1) arg0;
		Class3_Sub9_Sub1.aFloatArray81[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[1] = (Class16_Sub1) arg2;
		Class3_Sub9_Sub1.aFloatArray81[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[2] = (Class16_Sub1) arg4;
		Class3_Sub9_Sub1.aFloatArray81[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.anInt2613 = local1;
		Class3_Sub9_Sub1.aFloat201 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abt", name = "kz", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1670)
	@Override
	public void method17307(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class3_Sub9_Sub1.aClass16_Sub1Array1[0] = (Class16_Sub1) arg0;
		Class3_Sub9_Sub1.aFloatArray81[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[1] = (Class16_Sub1) arg2;
		Class3_Sub9_Sub1.aFloatArray81[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.aClass16_Sub1Array1[2] = (Class16_Sub1) arg4;
		Class3_Sub9_Sub1.aFloatArray81[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class3_Sub9_Sub1.anInt2613 = local1;
		Class3_Sub9_Sub1.aFloat201 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abt", name = "dd", descriptor = "()Z", line = 1685)
	@Override
	public final boolean method17129() {
		if (this.aClass3_Sub9_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub2_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub2_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "ki", descriptor = "()Z", line = 1685)
	@Override
	public final boolean method17308() {
		if (this.aClass3_Sub9_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub9_Sub2_1.method18596()) {
			if (!this.aClass113_1.method22031(this.aClass3_Sub9_Sub2_1)) {
				return false;
			}
			this.aClass112_1.method22021();
		}
		return true;
	}

	@OriginalMember(owner = "client!abt", name = "da", descriptor = "()V", line = 1696)
	@Override
	public final void method17130() {
		if (this.aClass3_Sub9_Sub2_1 != null && this.aClass3_Sub9_Sub2_1.method18596()) {
			this.aClass113_1.method22036(this.aClass3_Sub9_Sub2_1);
			this.aClass112_1.method22021();
		}
	}

	@OriginalMember(owner = "client!abt", name = "kt", descriptor = "()V", line = 1696)
	@Override
	public final void method17309() {
		if (this.aClass3_Sub9_Sub2_1 != null && this.aClass3_Sub9_Sub2_1.method18596()) {
			this.aClass113_1.method22036(this.aClass3_Sub9_Sub2_1);
			this.aClass112_1.method22021();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ko", descriptor = "()Z", line = 1703)
	@Override
	public final boolean method17057() {
		return this.aClass3_Sub9_Sub2_1 != null && this.aClass3_Sub9_Sub2_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "dz", descriptor = "()Z", line = 1703)
	@Override
	public final boolean method17131() {
		return this.aClass3_Sub9_Sub2_1 != null && this.aClass3_Sub9_Sub2_1.method18596();
	}

	@OriginalMember(owner = "client!abt", name = "dl", descriptor = "(FFFFFF)V", line = 1707)
	@Override
	final void method17219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class3_Sub9_Sub2.aFloat202 = arg0;
		Class3_Sub9_Sub2.aFloat204 = arg1;
		Class3_Sub9_Sub2.aFloat203 = arg2;
	}

	@OriginalMember(owner = "client!abt", name = "ku", descriptor = "(FFFFFF)V", line = 1707)
	@Override
	final void method17344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class3_Sub9_Sub2.aFloat202 = arg0;
		Class3_Sub9_Sub2.aFloat204 = arg1;
		Class3_Sub9_Sub2.aFloat203 = arg2;
	}

	@OriginalMember(owner = "client!abt", name = "la", descriptor = "()Lclient!abj;", line = 1713)
	@Override
	public Class19_Sub1 method17324() {
		return new Class19_Sub1_Sub3(this);
	}

	@OriginalMember(owner = "client!abt", name = "aq", descriptor = "()Lclient!abj;", line = 1713)
	@Override
	public Class19_Sub1 method17047() {
		return new Class19_Sub1_Sub3(this);
	}

	@OriginalMember(owner = "client!abt", name = "ax", descriptor = "(II)Lclient!dr;", line = 1717)
	@Override
	public Interface13 method17049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!abt", name = "ma", descriptor = "(II)Lclient!dr;", line = 1717)
	@Override
	public Interface13 method17015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!abt", name = "mv", descriptor = "(II)Lclient!dr;", line = 1717)
	@Override
	public Interface13 method17349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!abt", name = "az", descriptor = "(III)Lclient!dr;", line = 1721)
	@Override
	public Interface13 method17329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "lc", descriptor = "(III)Lclient!dr;", line = 1721)
	@Override
	public Interface13 method17330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "le", descriptor = "(III)Lclient!dr;", line = 1721)
	@Override
	public Interface13 method17306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class3_Sub1_Sub1(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "lm", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "lk", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "av", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "lv", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "ll", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "ld", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 1725)
	@Override
	public Interface10 method17257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!abt", name = "qh", descriptor = "(I[BIZ)Lclient!cq;", line = 1729)
	final Interface7 method4060(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface7) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub1(this, arg0, arg1, arg2, arg3) : new Class9_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "uq", descriptor = "(I[BIZ)Lclient!cq;", line = 1729)
	final Interface7 method4177(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface7) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub1(this, arg0, arg1, arg2, arg3) : new Class9_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "qe", descriptor = "(I[BIZ)Lclient!bu;", line = 1736)
	final Interface5 method4027(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "ux", descriptor = "(I[BIZ)Lclient!bu;", line = 1736)
	final Interface5 method4146(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "ul", descriptor = "(I[BIZ)Lclient!bu;", line = 1736)
	final Interface5 method4178(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "ui", descriptor = "(I[BIZ)Lclient!bu;", line = 1736)
	final Interface5 method4179(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!abt", name = "qw", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bu;", line = 1743)
	final Interface5 method4062(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abt", name = "ur", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bu;", line = 1743)
	final Interface5 method4091(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean81 && (!arg3 || this.aBoolean82) ? new Class8_Sub2(this, arg0, arg1, arg2, arg3) : new Class9_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abt", name = "qf", descriptor = "(Lclient!bu;)V", line = 1750)
	final void method4134(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean81) {
				OpenGL.glBindBufferARB(34962, arg0.method981());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "uu", descriptor = "(Lclient!bu;)V", line = 1750)
	final void method4180(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean81) {
				OpenGL.glBindBufferARB(34962, arg0.method981());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "qz", descriptor = "(Lclient!cq;)V", line = 1757)
	final void method4063(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_2 != arg0) {
			if (this.aBoolean81) {
				OpenGL.glBindBufferARB(34963, arg0.method1129());
			}
			this.anInterface7_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ua", descriptor = "(Lclient!cq;)V", line = 1757)
	final void method4181(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_2 != arg0) {
			if (this.aBoolean81) {
				OpenGL.glBindBufferARB(34963, arg0.method1129());
			}
			this.anInterface7_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "qx", descriptor = "(Lclient!bc;Lclient!bc;Lclient!bc;Lclient!bc;)V", line = 1764)
	final void method4064(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4134(arg0.anInterface5_6);
			OpenGL.glVertexPointer(arg0.aByte107, arg0.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4134(arg1.anInterface5_6);
			OpenGL.glNormalPointer(arg1.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4134(arg2.anInterface5_6);
			OpenGL.glColorPointer(arg2.aByte107, arg2.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4134(arg3.anInterface5_6);
			OpenGL.glTexCoordPointer(arg3.aByte107, arg3.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!abt", name = "ut", descriptor = "(Lclient!bc;Lclient!bc;Lclient!bc;Lclient!bc;)V", line = 1764)
	final void method4075(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4134(arg0.anInterface5_6);
			OpenGL.glVertexPointer(arg0.aByte107, arg0.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4134(arg1.anInterface5_6);
			OpenGL.glNormalPointer(arg1.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4134(arg2.anInterface5_6);
			OpenGL.glColorPointer(arg2.aByte107, arg2.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4134(arg3.anInterface5_6);
			OpenGL.glTexCoordPointer(arg3.aByte107, arg3.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!abt", name = "uz", descriptor = "(Lclient!bc;Lclient!bc;Lclient!bc;Lclient!bc;)V", line = 1764)
	final void method4182(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4134(arg0.anInterface5_6);
			OpenGL.glVertexPointer(arg0.aByte107, arg0.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4134(arg1.anInterface5_6);
			OpenGL.glNormalPointer(arg1.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4134(arg2.anInterface5_6);
			OpenGL.glColorPointer(arg2.aByte107, arg2.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4134(arg3.anInterface5_6);
			OpenGL.glTexCoordPointer(arg3.aByte107, arg3.aShort144, this.anInterface5_4.method975(), this.anInterface5_4.method976() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!abt", name = "uv", descriptor = "(III)V", line = 1791)
	final void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "qb", descriptor = "(III)V", line = 1791)
	final void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "ug", descriptor = "(III)V", line = 1791)
	final void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "ue", descriptor = "(III)V", line = 1791)
	final void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "qm", descriptor = "(Lclient!cq;III)V", line = 1795)
	final void method4066(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4063(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1121() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!abt", name = "um", descriptor = "(Lclient!cq;III)V", line = 1795)
	final void method4185(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4063(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1121() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!abt", name = "un", descriptor = "()V", line = 1800)
	final void method4042() {
		if (this.anInt412 == 1) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4093((byte) 0);
		this.anInt412 = 1;
	}

	@OriginalMember(owner = "client!abt", name = "qa", descriptor = "()V", line = 1800)
	final void method4067() {
		if (this.anInt412 == 1) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4093((byte) 0);
		this.anInt412 = 1;
	}

	@OriginalMember(owner = "client!abt", name = "uk", descriptor = "()V", line = 1800)
	final void method4186() {
		if (this.anInt412 == 1) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4093((byte) 0);
		this.anInt412 = 1;
	}

	@OriginalMember(owner = "client!abt", name = "ud", descriptor = "()V", line = 1800)
	final void method4187() {
		if (this.anInt412 == 1) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4074(null);
		this.method4070(-2);
		this.method4115(1);
		this.method4093((byte) 0);
		this.anInt412 = 1;
	}

	@OriginalMember(owner = "client!abt", name = "qg", descriptor = "()V", line = 1815)
	final void method4068() {
		if (this.anInt412 == 2) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4093((byte) 0);
		this.anInt412 = 2;
	}

	@OriginalMember(owner = "client!abt", name = "uo", descriptor = "()V", line = 1815)
	final void method4190() {
		if (this.anInt412 == 2) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4093((byte) 0);
		this.anInt412 = 2;
	}

	@OriginalMember(owner = "client!abt", name = "uj", descriptor = "()V", line = 1815)
	final void method4227() {
		if (this.anInt412 == 2) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4093((byte) 0);
		this.anInt412 = 2;
	}

	@OriginalMember(owner = "client!abt", name = "qr", descriptor = "()V", line = 1828)
	final void method4069() {
		if (this.anInt412 == 4) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 4;
	}

	@OriginalMember(owner = "client!abt", name = "us", descriptor = "()V", line = 1828)
	final void method4079() {
		if (this.anInt412 == 4) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 4;
	}

	@OriginalMember(owner = "client!abt", name = "up", descriptor = "()V", line = 1828)
	final void method4191() {
		if (this.anInt412 == 4) {
			return;
		}
		this.method4043();
		this.method4083(false);
		this.method4084(false);
		this.method4086(false);
		this.method4087(false);
		this.method4070(-2);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 4;
	}

	@OriginalMember(owner = "client!abt", name = "qt", descriptor = "()V", line = 1842)
	final void method4119() {
		if (this.anInt412 == 8) {
			return;
		}
		this.method4243();
		this.method4083(true);
		this.method4086(true);
		this.method4087(true);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 8;
	}

	@OriginalMember(owner = "client!abt", name = "uf", descriptor = "()V", line = 1842)
	final void method4192() {
		if (this.anInt412 == 8) {
			return;
		}
		this.method4243();
		this.method4083(true);
		this.method4086(true);
		this.method4087(true);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 8;
	}

	@OriginalMember(owner = "client!abt", name = "vg", descriptor = "()V", line = 1842)
	final void method4193() {
		if (this.anInt412 == 8) {
			return;
		}
		this.method4243();
		this.method4083(true);
		this.method4086(true);
		this.method4087(true);
		this.method4089(1);
		this.method4093((byte) 0);
		this.anInt412 = 8;
	}

	@OriginalMember(owner = "client!abt", name = "qu", descriptor = "(I)V", line = 1854)
	final void method4070(@OriginalArg(0) int arg0) {
		this.method4071(arg0, true);
	}

	@OriginalMember(owner = "client!abt", name = "vt", descriptor = "(I)V", line = 1854)
	final void method4194(@OriginalArg(0) int arg0) {
		this.method4071(arg0, true);
	}

	@OriginalMember(owner = "client!abt", name = "qd", descriptor = "(IZ)V", line = 1858)
	final void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4072(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!abt", name = "vf", descriptor = "(IZ)V", line = 1858)
	final void method4090(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4072(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!abt", name = "vs", descriptor = "(IZ)V", line = 1858)
	final void method4196(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4072(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!abt", name = "vq", descriptor = "(IZ)V", line = 1858)
	final void method4197(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4072(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!abt", name = "qp", descriptor = "(IZZ)V", line = 1862)
	final void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt437 || this.aBoolean74 != this.aBoolean73) {
			@Pc(10) Class4_Sub1 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean73 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method4082();
			} else {
				@Pc(33) Class133 local33 = this.aClass134_7.method22906(arg0);
				if (local33.anInt3351 * -1410868471 == -1) {
					this.method4082();
				} else {
					local10 = this.aClass112_1.method22018(local33);
					if (local33.aByte113 == 0 && local33.aByte117 == 0) {
						this.method4082();
					} else {
						this.method4133((float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte117 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean73) {
						local14 = local33.aByte119;
						local16 = local33.anInt3371 * 1742226327;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte114;
				}
				if (local33.aClass458_2 == Class458.aClass458_3) {
					local25 = local33.aByte115;
				}
			}
			this.method4093(local25);
			this.aClass104_1.method21902(local23, local14, local16, arg1, arg2);
			if (!this.aClass104_1.method21900(local10, local12)) {
				this.method4074(local10);
				this.method4115(local12);
			}
			this.aBoolean74 = this.aBoolean73;
			this.anInt437 = arg0;
		}
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "vo", descriptor = "(IZZ)V", line = 1862)
	final void method4198(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt437 || this.aBoolean74 != this.aBoolean73) {
			@Pc(10) Class4_Sub1 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean73 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method4082();
			} else {
				@Pc(33) Class133 local33 = this.aClass134_7.method22906(arg0);
				if (local33.anInt3351 * -1410868471 == -1) {
					this.method4082();
				} else {
					local10 = this.aClass112_1.method22018(local33);
					if (local33.aByte113 == 0 && local33.aByte117 == 0) {
						this.method4082();
					} else {
						this.method4133((float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte117 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean73) {
						local14 = local33.aByte119;
						local16 = local33.anInt3371 * 1742226327;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte114;
				}
				if (local33.aClass458_2 == Class458.aClass458_3) {
					local25 = local33.aByte115;
				}
			}
			this.method4093(local25);
			this.aClass104_1.method21902(local23, local14, local16, arg1, arg2);
			if (!this.aClass104_1.method21900(local10, local12)) {
				this.method4074(local10);
				this.method4115(local12);
			}
			this.aBoolean74 = this.aBoolean73;
			this.anInt437 = arg0;
		}
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "vd", descriptor = "(IZZ)V", line = 1862)
	final void method4199(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt437 || this.aBoolean74 != this.aBoolean73) {
			@Pc(10) Class4_Sub1 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean73 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method4082();
			} else {
				@Pc(33) Class133 local33 = this.aClass134_7.method22906(arg0);
				if (local33.anInt3351 * -1410868471 == -1) {
					this.method4082();
				} else {
					local10 = this.aClass112_1.method22018(local33);
					if (local33.aByte113 == 0 && local33.aByte117 == 0) {
						this.method4082();
					} else {
						this.method4133((float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt443 % 128000) / 1000.0F * (float) local33.aByte117 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean73) {
						local14 = local33.aByte119;
						local16 = local33.anInt3371 * 1742226327;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte114;
				}
				if (local33.aClass458_2 == Class458.aClass458_3) {
					local25 = local33.aByte115;
				}
			}
			this.method4093(local25);
			this.aClass104_1.method21902(local23, local14, local16, arg1, arg2);
			if (!this.aClass104_1.method21900(local10, local12)) {
				this.method4074(local10);
				this.method4115(local12);
			}
			this.aBoolean74 = this.aBoolean73;
			this.anInt437 = arg0;
		}
		this.anInt412 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abt", name = "qq", descriptor = "(I)V", line = 1905)
	final void method4073(@OriginalArg(0) int arg0) {
		if (this.anInt441 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt441 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "va", descriptor = "(I)V", line = 1905)
	final void method4200(@OriginalArg(0) int arg0) {
		if (this.anInt441 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt441 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "vh", descriptor = "(I)V", line = 1905)
	final void method4201(@OriginalArg(0) int arg0) {
		if (this.anInt441 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt441 = arg0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "qv", descriptor = "(Lclient!bf;)V", line = 1912)
	final void method4074(@OriginalArg(0) Class4 arg0) {
		@Pc(5) Class4 local5 = this.aClass4Array1[this.anInt441];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt5560);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt5560);
				} else if (arg0.anInt5560 != local5.anInt5560) {
					OpenGL.glDisable(local5.anInt5560);
					OpenGL.glEnable(arg0.anInt5560);
				}
				OpenGL.glBindTexture(arg0.anInt5560, arg0.anInt5559);
			}
			this.aClass4Array1[this.anInt441] = arg0;
		}
		this.anInt412 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!abt", name = "vw", descriptor = "(Lclient!bf;)V", line = 1912)
	final void method4099(@OriginalArg(0) Class4 arg0) {
		@Pc(5) Class4 local5 = this.aClass4Array1[this.anInt441];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt5560);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt5560);
				} else if (arg0.anInt5560 != local5.anInt5560) {
					OpenGL.glDisable(local5.anInt5560);
					OpenGL.glEnable(arg0.anInt5560);
				}
				OpenGL.glBindTexture(arg0.anInt5560, arg0.anInt5559);
			}
			this.aClass4Array1[this.anInt441] = arg0;
		}
		this.anInt412 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!abt", name = "vp", descriptor = "(Lclient!bf;)V", line = 1912)
	final void method4202(@OriginalArg(0) Class4 arg0) {
		@Pc(5) Class4 local5 = this.aClass4Array1[this.anInt441];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt5560);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt5560);
				} else if (arg0.anInt5560 != local5.anInt5560) {
					OpenGL.glDisable(local5.anInt5560);
					OpenGL.glEnable(arg0.anInt5560);
				}
				OpenGL.glBindTexture(arg0.anInt5560, arg0.anInt5559);
			}
			this.aClass4Array1[this.anInt441] = arg0;
		}
		this.anInt412 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!abt", name = "qo", descriptor = "(I)V", line = 1931)
	final void method4115(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4114(7681, 7681);
		} else if (arg0 == 0) {
			this.method4114(8448, 8448);
		} else if (arg0 == 2) {
			this.method4114(34165, 7681);
		} else if (arg0 == 3) {
			this.method4114(260, 8448);
		} else if (arg0 == 4) {
			this.method4114(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!abt", name = "vc", descriptor = "(I)V", line = 1931)
	final void method4175(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4114(7681, 7681);
		} else if (arg0 == 0) {
			this.method4114(8448, 8448);
		} else if (arg0 == 2) {
			this.method4114(34165, 7681);
		} else if (arg0 == 3) {
			this.method4114(260, 8448);
		} else if (arg0 == 4) {
			this.method4114(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!abt", name = "vm", descriptor = "(I)V", line = 1931)
	final void method4203(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4114(7681, 7681);
		} else if (arg0 == 0) {
			this.method4114(8448, 8448);
		} else if (arg0 == 2) {
			this.method4114(34165, 7681);
		} else if (arg0 == 3) {
			this.method4114(260, 8448);
		} else if (arg0 == 4) {
			this.method4114(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!abt", name = "vk", descriptor = "(I)V", line = 1931)
	final void method4204(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4114(7681, 7681);
		} else if (arg0 == 0) {
			this.method4114(8448, 8448);
		} else if (arg0 == 2) {
			this.method4114(34165, 7681);
		} else if (arg0 == 3) {
			this.method4114(260, 8448);
		} else if (arg0 == 4) {
			this.method4114(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!abt", name = "qn", descriptor = "(I)I", line = 1939)
	final int method4076(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "vv", descriptor = "(I)I", line = 1939)
	final int method4189(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "vn", descriptor = "(I)I", line = 1939)
	final int method4206(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "vu", descriptor = "(I)I", line = 1939)
	final int method4207(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ql", descriptor = "(II)V", line = 1948)
	final void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt441 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt438 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt438 = arg0;
			local4 = true;
		}
		if (this.anInt439 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt439 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt412 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ve", descriptor = "(II)V", line = 1948)
	final void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt441 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt438 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt438 = arg0;
			local4 = true;
		}
		if (this.anInt439 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt439 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt412 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abt", name = "vi", descriptor = "(III)V", line = 1971)
	final void method4061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "rz", descriptor = "(III)V", line = 1971)
	final void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "vy", descriptor = "(III)V", line = 1976)
	final void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "rp", descriptor = "(III)V", line = 1976)
	final void method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "vx", descriptor = "(III)V", line = 1976)
	final void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "vr", descriptor = "(III)V", line = 1976)
	final void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "vj", descriptor = "(III)V", line = 1976)
	final void method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "rj", descriptor = "(I)V", line = 1981)
	final void method4195(@OriginalArg(0) int arg0) {
		aFloatArray29[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray29[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "vb", descriptor = "(I)V", line = 1981)
	final void method4212(@OriginalArg(0) int arg0) {
		aFloatArray29[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray29[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray29[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray29[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "vl", descriptor = "(FFFF)V", line = 1989)
	final void method4022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray29[0] = arg0;
		aFloatArray29[1] = arg1;
		aFloatArray29[2] = arg2;
		aFloatArray29[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "ry", descriptor = "(FFFF)V", line = 1989)
	final void method4080(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray29[0] = arg0;
		aFloatArray29[1] = arg1;
		aFloatArray29[2] = arg2;
		aFloatArray29[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "wb", descriptor = "(FFFF)V", line = 1989)
	final void method4117(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray29[0] = arg0;
		aFloatArray29[1] = arg1;
		aFloatArray29[2] = arg2;
		aFloatArray29[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "vz", descriptor = "(FFFF)V", line = 1989)
	final void method4213(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray29[0] = arg0;
		aFloatArray29[1] = arg1;
		aFloatArray29[2] = arg2;
		aFloatArray29[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!abt", name = "rr", descriptor = "(FFF)V", line = 1997)
	final void method4133(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean93) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!abt", name = "wz", descriptor = "(FFF)V", line = 1997)
	final void method4216(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean93) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!abt", name = "ri", descriptor = "()V", line = 2005)
	final void method4082() {
		if (this.aBoolean93) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean93 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wv", descriptor = "()V", line = 2005)
	final void method4110() {
		if (this.aBoolean93) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean93 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "we", descriptor = "()V", line = 2005)
	final void method4217() {
		if (this.aBoolean93) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean93 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wx", descriptor = "()V", line = 2005)
	final void method4218() {
		if (this.aBoolean93) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean93 = false;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wd", descriptor = "(Z)V", line = 2014)
	final void method4035(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean91) {
			this.aBoolean91 = arg0;
			this.method4056();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "rw", descriptor = "(Z)V", line = 2014)
	final void method4083(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean91) {
			this.aBoolean91 = arg0;
			this.method4056();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wg", descriptor = "(Z)V", line = 2014)
	final void method4219(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean91) {
			this.aBoolean91 = arg0;
			this.method4056();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "rc", descriptor = "(Z)V", line = 2022)
	final void method4084(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean70) {
			this.aBoolean70 = arg0;
			this.method4156();
			this.anInt412 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wm", descriptor = "(Z)V", line = 2022)
	final void method4171(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean70) {
			this.aBoolean70 = arg0;
			this.method4156();
			this.anInt412 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ww", descriptor = "(Z)V", line = 2022)
	final void method4221(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean70) {
			this.aBoolean70 = arg0;
			this.method4156();
			this.anInt412 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ro", descriptor = "(Z)V", line = 2030)
	final void method4085(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean67) {
			this.aBoolean67 = arg0;
			this.method4156();
		}
	}

	@OriginalMember(owner = "client!abt", name = "wa", descriptor = "(Z)V", line = 2030)
	final void method4222(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean67) {
			this.aBoolean67 = arg0;
			this.method4156();
		}
	}

	@OriginalMember(owner = "client!abt", name = "rq", descriptor = "()V", line = 2037)
	void method4156() {
		if (this.aBoolean70 && !this.aBoolean67) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!abt", name = "ra", descriptor = "(Z)V", line = 2042)
	final void method4086(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean64) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean64 = arg0;
		this.anInt412 &= 0xFFFFFFF0;
	}

	@OriginalMember(owner = "client!abt", name = "rg", descriptor = "(Z)V", line = 2051)
	final void method4087(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean65) {
			this.aBoolean65 = arg0;
			this.method4088();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wp", descriptor = "(Z)V", line = 2051)
	final void method4104(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean65) {
			this.aBoolean65 = arg0;
			this.method4088();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "ws", descriptor = "(Z)V", line = 2051)
	final void method4223(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean65) {
			this.aBoolean65 = arg0;
			this.method4088();
			this.anInt412 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abt", name = "wt", descriptor = "()V", line = 2059)
	final void method4065() {
		OpenGL.glDepthMask(this.aBoolean65 && this.aBoolean59);
	}

	@OriginalMember(owner = "client!abt", name = "rk", descriptor = "()V", line = 2059)
	final void method4088() {
		OpenGL.glDepthMask(this.aBoolean65 && this.aBoolean59);
	}

	@OriginalMember(owner = "client!abt", name = "wo", descriptor = "(I)V", line = 2063)
	final void method4058(@OriginalArg(0) int arg0) {
		if (this.anInt413 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean62) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean62 = local10;
		}
		if (local12 != this.aBoolean68) {
			this.aBoolean68 = local12;
			this.method4092();
		}
		if (local14 != this.aBoolean92) {
			this.aBoolean92 = local14;
			this.method4103();
		}
		if (local8 != this.anInt420) {
			this.anInt420 = local8;
			this.method4081();
		}
		this.anInt413 = arg0;
		this.anInt412 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abt", name = "rb", descriptor = "(I)V", line = 2063)
	final void method4089(@OriginalArg(0) int arg0) {
		if (this.anInt413 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean62) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean62 = local10;
		}
		if (local12 != this.aBoolean68) {
			this.aBoolean68 = local12;
			this.method4092();
		}
		if (local14 != this.aBoolean92) {
			this.aBoolean92 = local14;
			this.method4103();
		}
		if (local8 != this.anInt420) {
			this.anInt420 = local8;
			this.method4081();
		}
		this.anInt413 = arg0;
		this.anInt412 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abt", name = "wu", descriptor = "(I)V", line = 2063)
	final void method4225(@OriginalArg(0) int arg0) {
		if (this.anInt413 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) boolean local12;
		@Pc(14) boolean local14;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = true;
			local12 = false;
			local14 = true;
		} else if (arg0 == 128) {
			local8 = 3;
			local10 = true;
			local12 = true;
			local14 = true;
		} else if (arg0 == 3) {
			local8 = 0;
			local10 = true;
			local12 = true;
			local14 = false;
		} else {
			local8 = 0;
			local10 = true;
			local12 = false;
			local14 = false;
		}
		if (local10 != this.aBoolean62) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean62 = local10;
		}
		if (local12 != this.aBoolean68) {
			this.aBoolean68 = local12;
			this.method4092();
		}
		if (local14 != this.aBoolean92) {
			this.aBoolean92 = local14;
			this.method4103();
		}
		if (local8 != this.anInt420) {
			this.anInt420 = local8;
			this.method4081();
		}
		this.anInt413 = arg0;
		this.anInt412 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abt", name = "rt", descriptor = "()V", line = 2120)
	final void method4103() {
		if (this.aBoolean92) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wq", descriptor = "()V", line = 2120)
	final void method4123() {
		if (this.aBoolean92) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wk", descriptor = "()V", line = 2120)
	final void method4226() {
		if (this.aBoolean92) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wh", descriptor = "()V", line = 2120)
	final void method4228() {
		if (this.aBoolean92) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wf", descriptor = "()V", line = 2125)
	final void method4032() {
		if (this.aBoolean66) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt416 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt416 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt416 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt416 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt420 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt420 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt420 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt420 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt420 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt420 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt420 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wl", descriptor = "()V", line = 2125)
	final void method4048() {
		if (this.aBoolean66) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt416 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt416 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt416 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt416 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt420 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt420 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt420 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt420 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt420 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt420 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt420 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "rh", descriptor = "()V", line = 2125)
	final void method4081() {
		if (this.aBoolean66) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt416 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt416 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt416 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt416 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt420 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt420 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt420 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt420 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt420 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt420 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt420 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!abt", name = "rf", descriptor = "(I)V", line = 2167)
	final void method4036(@OriginalArg(0) int arg0) {
		if (this.anInt416 != arg0) {
			this.anInt416 = arg0;
			this.method4081();
		}
	}

	@OriginalMember(owner = "client!abt", name = "wc", descriptor = "(I)V", line = 2167)
	final void method4157(@OriginalArg(0) int arg0) {
		if (this.anInt416 != arg0) {
			this.anInt416 = arg0;
			this.method4081();
		}
	}

	@OriginalMember(owner = "client!abt", name = "wi", descriptor = "(I)V", line = 2167)
	final void method4229(@OriginalArg(0) int arg0) {
		if (this.anInt416 != arg0) {
			this.anInt416 = arg0;
			this.method4081();
		}
	}

	@OriginalMember(owner = "client!abt", name = "wr", descriptor = "(I)V", line = 2167)
	final void method4230(@OriginalArg(0) int arg0) {
		if (this.anInt416 != arg0) {
			this.anInt416 = arg0;
			this.method4081();
		}
	}

	@OriginalMember(owner = "client!abt", name = "rs", descriptor = "()V", line = 2174)
	final void method4092() {
		if (this.aBoolean68) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte2 & 0xFF) / 255.0F);
		if (this.anInt404 <= 0) {
			return;
		}
		if (this.aByte2 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wy", descriptor = "()V", line = 2174)
	final void method4231() {
		if (this.aBoolean68) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte2 & 0xFF) / 255.0F);
		if (this.anInt404 <= 0) {
			return;
		}
		if (this.aByte2 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!abt", name = "wj", descriptor = "()V", line = 2174)
	final void method4232() {
		if (this.aBoolean68) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte2 & 0xFF) / 255.0F);
		if (this.anInt404 <= 0) {
			return;
		}
		if (this.aByte2 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!abt", name = "rd", descriptor = "(B)V", line = 2184)
	final void method4093(@OriginalArg(0) byte arg0) {
		if (this.aByte2 == arg0) {
			return;
		}
		this.aByte2 = arg0;
		if (arg0 == 0) {
			this.method4036(2);
			this.method4089(1);
		} else {
			this.method4036(3);
			this.method4089(3);
		}
		this.method4092();
	}

	@OriginalMember(owner = "client!abt", name = "wn", descriptor = "(B)V", line = 2184)
	final void method4233(@OriginalArg(0) byte arg0) {
		if (this.aByte2 == arg0) {
			return;
		}
		this.aByte2 = arg0;
		if (arg0 == 0) {
			this.method4036(2);
			this.method4089(1);
		} else {
			this.method4036(3);
			this.method4089(3);
		}
		this.method4092();
	}

	@OriginalMember(owner = "client!abt", name = "xe", descriptor = "(B)V", line = 2184)
	final void method4234(@OriginalArg(0) byte arg0) {
		if (this.aByte2 == arg0) {
			return;
		}
		this.aByte2 = arg0;
		if (arg0 == 0) {
			this.method4036(2);
			this.method4089(1);
		} else {
			this.method4036(3);
			this.method4089(3);
		}
		this.method4092();
	}

	@OriginalMember(owner = "client!abt", name = "z", descriptor = "()I", line = 2199)
	@Override
	public final int method17157() {
		return this.anInt410 + this.anInt409 + this.anInt452;
	}

	@OriginalMember(owner = "client!abt", name = "mk", descriptor = "()I", line = 2199)
	@Override
	public final int method17350() {
		return this.anInt410 + this.anInt409 + this.anInt452;
	}

	@OriginalMember(owner = "client!abt", name = "me", descriptor = "()I", line = 2199)
	@Override
	public final int method17351() {
		return this.anInt410 + this.anInt409 + this.anInt452;
	}

	@OriginalMember(owner = "client!abt", name = "mz", descriptor = "()I", line = 2199)
	@Override
	public final int method17352() {
		return this.anInt410 + this.anInt409 + this.anInt452;
	}

	@OriginalMember(owner = "client!abt", name = "ez", descriptor = "(I)V", line = 2203)
	@Override
	public final synchronized void method17154(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class3_Sub21 local16;
		while (!this.aClass553_5.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_5.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt410 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_6.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_6.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt409 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_10.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_10.method32718();
			anIntArray49[local1++] = local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_7.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_7.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt452 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass553_8.method32712()) {
			local215 = this.aClass553_8.method32718();
			OpenGL.glDeleteProgramARB((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_9.method32712()) {
			local215 = this.aClass553_9.method32718();
			OpenGL.glDeleteShader((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		this.aClass112_1.method22016();
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong11 + 60000L) {
			System.gc();
			this.aLong11 = Class176.method23413();
		}
		this.anInt443 = local5;
	}

	@OriginalMember(owner = "client!abt", name = "ep", descriptor = "(I)V", line = 2203)
	@Override
	public final synchronized void method17155(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class3_Sub21 local16;
		while (!this.aClass553_5.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_5.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt410 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_6.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_6.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt409 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_10.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_10.method32718();
			anIntArray49[local1++] = local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_7.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_7.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt452 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass553_8.method32712()) {
			local215 = this.aClass553_8.method32718();
			OpenGL.glDeleteProgramARB((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_9.method32712()) {
			local215 = this.aClass553_9.method32718();
			OpenGL.glDeleteShader((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		this.aClass112_1.method22016();
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong11 + 60000L) {
			System.gc();
			this.aLong11 = Class176.method23413();
		}
		this.anInt443 = local5;
	}

	@OriginalMember(owner = "client!abt", name = "c", descriptor = "(I)V", line = 2203)
	@Override
	public final synchronized void method17022(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class3_Sub21 local16;
		while (!this.aClass553_5.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_5.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt410 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_6.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_6.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt409 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_10.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_10.method32718();
			anIntArray49[local1++] = local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray49, 0);
			local1 = 0;
		}
		while (!this.aClass553_7.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_7.method32718();
			anIntArray49[local1++] = (int) (local16.aLong296 * -1930649055099428229L);
			this.anInt452 -= local16.anInt1285 * 1585682181;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray49, 0);
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass553_8.method32712()) {
			local215 = this.aClass553_8.method32718();
			OpenGL.glDeleteProgramARB((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_9.method32712()) {
			local215 = this.aClass553_9.method32718();
			OpenGL.glDeleteShader((int) (local215.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_4.method32712()) {
			local16 = (Class3_Sub21) this.aClass553_4.method32718();
			OpenGL.glDeleteLists((int) (local16.aLong296 * -1930649055099428229L), local16.anInt1285 * 1585682181);
		}
		this.aClass112_1.method22016();
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong11 + 60000L) {
			System.gc();
			this.aLong11 = Class176.method23413();
		}
		this.anInt443 = local5;
	}

	@OriginalMember(owner = "client!abt", name = "rn", descriptor = "(II)V", line = 2281)
	final synchronized void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_5.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "xh", descriptor = "(II)V", line = 2281)
	final synchronized void method4132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_5.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "rl", descriptor = "(II)V", line = 2287)
	final synchronized void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_6.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "xp", descriptor = "(II)V", line = 2287)
	final synchronized void method4154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_6.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "xn", descriptor = "(II)V", line = 2287)
	final synchronized void method4237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_6.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "rm", descriptor = "(I)V", line = 2293)
	final synchronized void method4120(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg0);
		this.aClass553_10.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "xo", descriptor = "(I)V", line = 2293)
	final synchronized void method4238(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg0);
		this.aClass553_10.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "ru", descriptor = "(II)V", line = 2298)
	final synchronized void method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_7.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "xj", descriptor = "(II)V", line = 2298)
	final synchronized void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_7.method32702(local4);
	}

	@OriginalMember(owner = "client!abt", name = "rx", descriptor = "(J)V", line = 2304)
	final synchronized void method4097(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_9.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xt", descriptor = "(J)V", line = 2304)
	final synchronized void method4111(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_9.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xk", descriptor = "(J)V", line = 2304)
	final synchronized void method4239(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_9.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xr", descriptor = "(J)V", line = 2304)
	final synchronized void method4241(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_9.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "re", descriptor = "(I)V", line = 2310)
	final synchronized void method4098(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_8.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xl", descriptor = "(I)V", line = 2310)
	final synchronized void method4188(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_8.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xc", descriptor = "(I)V", line = 2310)
	final synchronized void method4242(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_8.method32702(local3);
	}

	@OriginalMember(owner = "client!abt", name = "xy", descriptor = "(Lclient!cw;)I", line = 2316)
	static int method4094(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!abt", name = "rv", descriptor = "(Lclient!cw;)I", line = 2316)
	static int method4149(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!abt", name = "xi", descriptor = "(Lclient!cw;)I", line = 2316)
	static int method4244(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!abt", name = "xg", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 2335)
	static int method4040(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		if (arg1 == Class127.aClass127_23) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 6406;
				case 5:
					return 6410;
				case 6:
					return 6407;
				case 7:
					return 6409;
				case 8:
					return 6408;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_21) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33189;
				case 2:
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 32830;
				case 5:
					return 36219;
				case 6:
					return 32852;
				case 7:
					return 32834;
				case 8:
					return 32859;
			}
		} else if (arg1 == Class127.aClass127_22) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_24) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34844;
				case 5:
					return 34847;
				case 6:
					return 34843;
				case 7:
					return 34846;
				case 8:
					return 34842;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_20) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34838;
				case 5:
					return 34841;
				case 6:
					return 34837;
				case 7:
					return 34840;
				case 8:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "xs", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 2335)
	static int method4049(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		if (arg1 == Class127.aClass127_23) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 6406;
				case 5:
					return 6410;
				case 6:
					return 6407;
				case 7:
					return 6409;
				case 8:
					return 6408;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_21) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33189;
				case 2:
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 32830;
				case 5:
					return 36219;
				case 6:
					return 32852;
				case 7:
					return 32834;
				case 8:
					return 32859;
			}
		} else if (arg1 == Class127.aClass127_22) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_24) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34844;
				case 5:
					return 34847;
				case 6:
					return 34843;
				case 7:
					return 34846;
				case 8:
					return 34842;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_20) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34838;
				case 5:
					return 34841;
				case 6:
					return 34837;
				case 7:
					return 34840;
				case 8:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "ss", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 2335)
	static int method4240(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		if (arg1 == Class127.aClass127_23) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 6406;
				case 5:
					return 6410;
				case 6:
					return 6407;
				case 7:
					return 6409;
				case 8:
					return 6408;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_21) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33189;
				case 2:
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 32830;
				case 5:
					return 36219;
				case 6:
					return 32852;
				case 7:
					return 32834;
				case 8:
					return 32859;
			}
		} else if (arg1 == Class127.aClass127_22) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_24) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34844;
				case 5:
					return 34847;
				case 6:
					return 34843;
				case 7:
					return 34846;
				case 8:
					return 34842;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_20) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34838;
				case 5:
					return 34841;
				case 6:
					return 34837;
				case 7:
					return 34840;
				case 8:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abt", name = "fe", descriptor = "(Z)V", line = 2412)
	@Override
	public void method17182() {
	}

	@OriginalMember(owner = "client!abt", name = "ee", descriptor = "(Z)V", line = 2412)
	@Override
	public void method17142(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!abt", name = "fw", descriptor = "(Z)V", line = 2412)
	@Override
	public void method17183() {
	}

	@OriginalMember(owner = "client!abt", name = "fo", descriptor = "(Z)V", line = 2412)
	@Override
	public void method17184() {
	}

	@OriginalMember(owner = "client!abt", name = "fl", descriptor = "(Z)V", line = 2412)
	@Override
	public void method17241() {
	}
}
