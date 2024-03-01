package com.jagex;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!afa")
public class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!afa", name = "ad", descriptor = "F")
	static final float aFloat28 = 0.35F;

	@OriginalMember(owner = "client!afa", name = "am", descriptor = "I")
	static final int anInt495 = 0;

	@OriginalMember(owner = "client!afa", name = "au", descriptor = "I")
	static final int anInt496 = 1;

	@OriginalMember(owner = "client!afa", name = "ar", descriptor = "I")
	static final int anInt497 = 2;

	@OriginalMember(owner = "client!afa", name = "ap", descriptor = "I")
	static final int anInt498 = 4;

	@OriginalMember(owner = "client!afa", name = "aq", descriptor = "I")
	static final int anInt499 = 8;

	@OriginalMember(owner = "client!afa", name = "ax", descriptor = "I")
	static final int anInt500 = 16;

	@OriginalMember(owner = "client!afa", name = "ao", descriptor = "I")
	static final int anInt501 = 32993;

	@OriginalMember(owner = "client!afa", name = "aj", descriptor = "I")
	static final int anInt502 = 5121;

	@OriginalMember(owner = "client!afa", name = "ay", descriptor = "I")
	static final int anInt503 = 5123;

	@OriginalMember(owner = "client!afa", name = "ab", descriptor = "I")
	static final int anInt504 = 5126;

	@OriginalMember(owner = "client!afa", name = "av", descriptor = "I")
	static final int anInt505 = 32;

	@OriginalMember(owner = "client!afa", name = "an", descriptor = "I")
	static final int anInt506 = -2;

	@OriginalMember(owner = "client!afa", name = "bf", descriptor = "I")
	static final int anInt507 = 7681;

	@OriginalMember(owner = "client!afa", name = "bl", descriptor = "I")
	static final int anInt508 = 8448;

	@OriginalMember(owner = "client!afa", name = "bm", descriptor = "I")
	static final int anInt509 = 768;

	@OriginalMember(owner = "client!afa", name = "bh", descriptor = "I")
	static final int anInt510 = 34023;

	@OriginalMember(owner = "client!afa", name = "bx", descriptor = "I")
	static final int anInt511 = 34165;

	@OriginalMember(owner = "client!afa", name = "bc", descriptor = "I")
	static final int anInt512 = 34168;

	@OriginalMember(owner = "client!afa", name = "bn", descriptor = "I")
	static final int anInt513 = 34167;

	@OriginalMember(owner = "client!afa", name = "bq", descriptor = "I")
	static final int anInt514 = 770;

	@OriginalMember(owner = "client!afa", name = "bb", descriptor = "I")
	static final int anInt515 = 0;

	@OriginalMember(owner = "client!afa", name = "bu", descriptor = "I")
	static final int anInt516 = 0;

	@OriginalMember(owner = "client!afa", name = "by", descriptor = "I")
	static final int anInt517 = 2;

	@OriginalMember(owner = "client!afa", name = "bw", descriptor = "I")
	static final int anInt518 = 1;

	@OriginalMember(owner = "client!afa", name = "bo", descriptor = "I")
	static final int anInt519 = 2;

	@OriginalMember(owner = "client!afa", name = "bz", descriptor = "I")
	static final int anInt520 = 3;

	@OriginalMember(owner = "client!afa", name = "ba", descriptor = "I")
	static final int anInt521 = 8;

	@OriginalMember(owner = "client!afa", name = "bp", descriptor = "I")
	static final int anInt522 = 16;

	@OriginalMember(owner = "client!afa", name = "bs", descriptor = "I")
	static final int anInt523 = 7;

	@OriginalMember(owner = "client!afa", name = "az", descriptor = "I")
	static final int anInt524 = 4;

	@OriginalMember(owner = "client!afa", name = "bi", descriptor = "I")
	static final int anInt525 = 5890;

	@OriginalMember(owner = "client!afa", name = "aa", descriptor = "I")
	static final int anInt526 = 7;

	@OriginalMember(owner = "client!afa", name = "at", descriptor = "I")
	static final int anInt528 = 100663296;

	@OriginalMember(owner = "client!afa", name = "af", descriptor = "I")
	static final int anInt541 = 128;

	@OriginalMember(owner = "client!afa", name = "bd", descriptor = "I")
	static final int anInt542 = 34479;

	@OriginalMember(owner = "client!afa", name = "bg", descriptor = "I")
	static final int anInt556 = 4;

	@OriginalMember(owner = "client!afa", name = "bv", descriptor = "I")
	static final int anInt565 = 1;

	@OriginalMember(owner = "client!afa", name = "bk", descriptor = "I")
	static final int anInt570 = 260;

	@OriginalMember(owner = "client!afa", name = "bj", descriptor = "I")
	static final int anInt571 = 55;

	@OriginalMember(owner = "client!afa", name = "br", descriptor = "I")
	static final int anInt575 = 2;

	@OriginalMember(owner = "client!afa", name = "ak", descriptor = "I")
	static final int anInt576 = -1;

	@OriginalMember(owner = "client!afa", name = "bt", descriptor = "I")
	static final int anInt577 = 34166;

	@OriginalMember(owner = "client!afa", name = "be", descriptor = "I")
	static final int anInt578 = 1;

	@OriginalMember(owner = "client!afa", name = "iu", descriptor = "I")
	static final int anInt580 = 3;

	@OriginalMember(owner = "client!afa", name = "dz", descriptor = "[I")
	static int[] anIntArray37 = new int[1000];

	@OriginalMember(owner = "client!afa", name = "eb", descriptor = "I")
	static int anInt558 = 4;

	@OriginalMember(owner = "client!afa", name = "hz", descriptor = "[F")
	static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!afa", name = "ij", descriptor = "[F")
	static final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!afa", name = "ds", descriptor = "Z")
	boolean aBoolean71;

	@OriginalMember(owner = "client!afa", name = "do", descriptor = "J")
	long aLong24;

	@OriginalMember(owner = "client!afa", name = "fe", descriptor = "F")
	float aFloat29;

	@OriginalMember(owner = "client!afa", name = "fy", descriptor = "F")
	float aFloat30;

	@OriginalMember(owner = "client!afa", name = "fr", descriptor = "Z")
	boolean aBoolean72;

	@OriginalMember(owner = "client!afa", name = "dc", descriptor = "Z")
	boolean aBoolean73;

	@OriginalMember(owner = "client!afa", name = "gk", descriptor = "Lclient!bv;")
	Interface14 anInterface14_2;

	@OriginalMember(owner = "client!afa", name = "eo", descriptor = "F")
	float aFloat33;

	@OriginalMember(owner = "client!afa", name = "co", descriptor = "I")
	int anInt530;

	@OriginalMember(owner = "client!afa", name = "ch", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!afa", name = "hc", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_1;

	@OriginalMember(owner = "client!afa", name = "cy", descriptor = "I")
	int anInt533;

	@OriginalMember(owner = "client!afa", name = "cc", descriptor = "I")
	int anInt534;

	@OriginalMember(owner = "client!afa", name = "cz", descriptor = "I")
	int anInt535;

	@OriginalMember(owner = "client!afa", name = "eu", descriptor = "F")
	float aFloat34;

	@OriginalMember(owner = "client!afa", name = "ge", descriptor = "Lclient!afz;")
	Class107_Sub2 aClass107_Sub2_1;

	@OriginalMember(owner = "client!afa", name = "gl", descriptor = "Lclient!dy;")
	Class237 aClass237_1;

	@OriginalMember(owner = "client!afa", name = "dq", descriptor = "I")
	int anInt537;

	@OriginalMember(owner = "client!afa", name = "dk", descriptor = "I")
	int anInt538;

	@OriginalMember(owner = "client!afa", name = "ea", descriptor = "I")
	int anInt539;

	@OriginalMember(owner = "client!afa", name = "fa", descriptor = "I")
	int anInt540;

	@OriginalMember(owner = "client!afa", name = "dw", descriptor = "Z")
	boolean aBoolean76;

	@OriginalMember(owner = "client!afa", name = "gz", descriptor = "Z")
	boolean aBoolean77;

	@OriginalMember(owner = "client!afa", name = "dv", descriptor = "I")
	int anInt543;

	@OriginalMember(owner = "client!afa", name = "fw", descriptor = "I")
	int anInt544;

	@OriginalMember(owner = "client!afa", name = "dj", descriptor = "F")
	float aFloat35;

	@OriginalMember(owner = "client!afa", name = "ey", descriptor = "F")
	float aFloat36;

	@OriginalMember(owner = "client!afa", name = "fp", descriptor = "I")
	int anInt545;

	@OriginalMember(owner = "client!afa", name = "ho", descriptor = "Lclient!bp;")
	Class193 aClass193_5;

	@OriginalMember(owner = "client!afa", name = "di", descriptor = "Z")
	boolean aBoolean78;

	@OriginalMember(owner = "client!afa", name = "ec", descriptor = "I")
	int anInt546;

	@OriginalMember(owner = "client!afa", name = "dm", descriptor = "I")
	int anInt547;

	@OriginalMember(owner = "client!afa", name = "dn", descriptor = "Z")
	boolean aBoolean79;

	@OriginalMember(owner = "client!afa", name = "gj", descriptor = "I")
	int anInt552;

	@OriginalMember(owner = "client!afa", name = "er", descriptor = "I")
	int anInt554;

	@OriginalMember(owner = "client!afa", name = "ew", descriptor = "I")
	int anInt555;

	@OriginalMember(owner = "client!afa", name = "en", descriptor = "I")
	int anInt557;

	@OriginalMember(owner = "client!afa", name = "ex", descriptor = "Z")
	boolean aBoolean80;

	@OriginalMember(owner = "client!afa", name = "fg", descriptor = "Z")
	boolean aBoolean81;

	@OriginalMember(owner = "client!afa", name = "df", descriptor = "B")
	byte aByte2;

	@OriginalMember(owner = "client!afa", name = "ft", descriptor = "F")
	float aFloat42;

	@OriginalMember(owner = "client!afa", name = "hl", descriptor = "Z")
	boolean aBoolean83;

	@OriginalMember(owner = "client!afa", name = "fq", descriptor = "I")
	int anInt561;

	@OriginalMember(owner = "client!afa", name = "ff", descriptor = "Z")
	boolean aBoolean84;

	@OriginalMember(owner = "client!afa", name = "gn", descriptor = "Z")
	boolean aBoolean85;

	@OriginalMember(owner = "client!afa", name = "go", descriptor = "Lclient!cf;")
	Interface16 anInterface16_1;

	@OriginalMember(owner = "client!afa", name = "gp", descriptor = "I")
	int anInt567;

	@OriginalMember(owner = "client!afa", name = "gf", descriptor = "[Lclient!bq;")
	Class88[] aClass88Array1;

	@OriginalMember(owner = "client!afa", name = "gx", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_2;

	@OriginalMember(owner = "client!afa", name = "gr", descriptor = "Ljava/lang/String;")
	String aString22;

	@OriginalMember(owner = "client!afa", name = "gt", descriptor = "I")
	int anInt572;

	@OriginalMember(owner = "client!afa", name = "gm", descriptor = "Z")
	boolean aBoolean89;

	@OriginalMember(owner = "client!afa", name = "gv", descriptor = "I")
	int anInt573;

	@OriginalMember(owner = "client!afa", name = "gw", descriptor = "I")
	int anInt574;

	@OriginalMember(owner = "client!afa", name = "gb", descriptor = "Z")
	boolean aBoolean91;

	@OriginalMember(owner = "client!afa", name = "hu", descriptor = "Z")
	boolean aBoolean96;

	@OriginalMember(owner = "client!afa", name = "hg", descriptor = "Z")
	boolean aBoolean97;

	@OriginalMember(owner = "client!afa", name = "gg", descriptor = "Ljava/lang/String;")
	String aString23;

	@OriginalMember(owner = "client!afa", name = "hq", descriptor = "Z")
	boolean aBoolean99;

	@OriginalMember(owner = "client!afa", name = "hf", descriptor = "Z")
	boolean aBoolean100;

	@OriginalMember(owner = "client!afa", name = "hr", descriptor = "Z")
	boolean aBoolean101;

	@OriginalMember(owner = "client!afa", name = "hs", descriptor = "Z")
	boolean aBoolean102;

	@OriginalMember(owner = "client!afa", name = "hh", descriptor = "Z")
	boolean aBoolean103;

	@OriginalMember(owner = "client!afa", name = "hy", descriptor = "Z")
	boolean aBoolean105;

	@OriginalMember(owner = "client!afa", name = "hj", descriptor = "Lclient!bp;")
	Class193 aClass193_6;

	@OriginalMember(owner = "client!afa", name = "hv", descriptor = "Lclient!bv;")
	Interface14 anInterface14_3;

	@OriginalMember(owner = "client!afa", name = "gh", descriptor = "Z")
	boolean aBoolean106;

	@OriginalMember(owner = "client!afa", name = "gc", descriptor = "I")
	int anInt579;

	@OriginalMember(owner = "client!afa", name = "gq", descriptor = "I")
	int anInt581;

	@OriginalMember(owner = "client!afa", name = "ca", descriptor = "Lclient!cu;")
	Class214 aClass214_1 = new Class214();

	@OriginalMember(owner = "client!afa", name = "cx", descriptor = "Lclient!pq;")
	Class489 aClass489_2 = new Class489();

	@OriginalMember(owner = "client!afa", name = "cw", descriptor = "Lclient!pq;")
	Class489 aClass489_1 = new Class489();

	@OriginalMember(owner = "client!afa", name = "ct", descriptor = "Lclient!ou;")
	Class470 aClass470_1 = new Class470();

	@OriginalMember(owner = "client!afa", name = "cr", descriptor = "I")
	int anInt531 = 8;

	@OriginalMember(owner = "client!afa", name = "cm", descriptor = "I")
	int anInt532 = 3;

	@OriginalMember(owner = "client!afa", name = "cq", descriptor = "Z")
	boolean aBoolean74 = false;

	@OriginalMember(owner = "client!afa", name = "cb", descriptor = "Lclient!aat;")
	Class22 aClass22_12 = new Class22();

	@OriginalMember(owner = "client!afa", name = "cs", descriptor = "Lsun/misc/Unsafe;")
	Unsafe anUnsafe1 = null;

	@OriginalMember(owner = "client!afa", name = "ck", descriptor = "Lclient!aat;")
	Class22 aClass22_11 = new Class22();

	@OriginalMember(owner = "client!afa", name = "cj", descriptor = "Lclient!aat;")
	Class22 aClass22_6 = new Class22();

	@OriginalMember(owner = "client!afa", name = "cd", descriptor = "Lclient!aat;")
	Class22 aClass22_7 = new Class22();

	@OriginalMember(owner = "client!afa", name = "dd", descriptor = "Lclient!aat;")
	Class22 aClass22_8 = new Class22();

	@OriginalMember(owner = "client!afa", name = "dr", descriptor = "Lclient!aat;")
	Class22 aClass22_9 = new Class22();

	@OriginalMember(owner = "client!afa", name = "da", descriptor = "Lclient!aat;")
	Class22 aClass22_5 = new Class22();

	@OriginalMember(owner = "client!afa", name = "dt", descriptor = "Lclient!aat;")
	Class22 aClass22_10 = new Class22();

	@OriginalMember(owner = "client!afa", name = "du", descriptor = "I")
	int anInt559 = 2;

	@OriginalMember(owner = "client!afa", name = "dl", descriptor = "Lclient!ou;")
	Class470 aClass470_2 = new Class470();

	@OriginalMember(owner = "client!afa", name = "dp", descriptor = "Lclient!pq;")
	Class489 aClass489_3 = new Class489();

	@OriginalMember(owner = "client!afa", name = "dy", descriptor = "Lclient!pq;")
	Class489 aClass489_4 = new Class489();

	@OriginalMember(owner = "client!afa", name = "db", descriptor = "Lclient!pq;")
	Class489 aClass489_8 = new Class489();

	@OriginalMember(owner = "client!afa", name = "dh", descriptor = "Lclient!pq;")
	Class489 aClass489_5 = new Class489();

	@OriginalMember(owner = "client!afa", name = "dx", descriptor = "Lclient!pq;")
	Class489 aClass489_9 = new Class489();

	@OriginalMember(owner = "client!afa", name = "dg", descriptor = "[[F")
	float[][] aFloatArrayArray7 = new float[6][4];

	@OriginalMember(owner = "client!afa", name = "de", descriptor = "[F")
	float[] aFloatArray8 = new float[4];

	@OriginalMember(owner = "client!afa", name = "ed", descriptor = "F")
	float aFloat37 = 0.0F;

	@OriginalMember(owner = "client!afa", name = "ee", descriptor = "F")
	float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "es", descriptor = "F")
	float aFloat38 = 0.0F;

	@OriginalMember(owner = "client!afa", name = "ei", descriptor = "F")
	float aFloat39 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "el", descriptor = "Lclient!ou;")
	Class470 aClass470_3 = new Class470();

	@OriginalMember(owner = "client!afa", name = "ej", descriptor = "Lclient!pq;")
	Class489 aClass489_6 = new Class489();

	@OriginalMember(owner = "client!afa", name = "ep", descriptor = "Lclient!pq;")
	Class489 aClass489_7 = new Class489();

	@OriginalMember(owner = "client!afa", name = "ev", descriptor = "[F")
	float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!afa", name = "ek", descriptor = "Z")
	boolean aBoolean88 = true;

	@OriginalMember(owner = "client!afa", name = "em", descriptor = "Z")
	boolean aBoolean82 = true;

	@OriginalMember(owner = "client!afa", name = "eh", descriptor = "I")
	int anInt548 = 0;

	@OriginalMember(owner = "client!afa", name = "eq", descriptor = "I")
	int anInt549 = 0;

	@OriginalMember(owner = "client!afa", name = "eg", descriptor = "I")
	int anInt550 = 0;

	@OriginalMember(owner = "client!afa", name = "ez", descriptor = "I")
	int anInt551 = 0;

	@OriginalMember(owner = "client!afa", name = "ef", descriptor = "I")
	int anInt529 = 0;

	@OriginalMember(owner = "client!afa", name = "et", descriptor = "I")
	int anInt553 = 0;

	@OriginalMember(owner = "client!afa", name = "fm", descriptor = "[F")
	float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!afa", name = "fu", descriptor = "[F")
	float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!afa", name = "fs", descriptor = "[F")
	float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!afa", name = "fz", descriptor = "[F")
	float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!afa", name = "fj", descriptor = "I")
	int anInt560 = -1;

	@OriginalMember(owner = "client!afa", name = "fd", descriptor = "F")
	float aFloat32 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "fn", descriptor = "F")
	float aFloat40 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "fi", descriptor = "F")
	float aFloat41 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "fx", descriptor = "F")
	float aFloat43 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "fv", descriptor = "F")
	float aFloat44 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "fc", descriptor = "[Lclient!akf;")
	Class93_Sub16[] aClass93_Sub16Array1 = new Class93_Sub16[anInt558];

	@OriginalMember(owner = "client!afa", name = "fl", descriptor = "I")
	int anInt562 = -1;

	@OriginalMember(owner = "client!afa", name = "fb", descriptor = "I")
	int anInt563 = -1;

	@OriginalMember(owner = "client!afa", name = "fo", descriptor = "I")
	int anInt564 = 0;

	@OriginalMember(owner = "client!afa", name = "fk", descriptor = "F")
	float aFloat45 = 1.0F;

	@OriginalMember(owner = "client!afa", name = "fh", descriptor = "F")
	float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!afa", name = "gu", descriptor = "Z")
	boolean aBoolean86 = false;

	@OriginalMember(owner = "client!afa", name = "gy", descriptor = "I")
	int anInt568 = 8448;

	@OriginalMember(owner = "client!afa", name = "ga", descriptor = "I")
	int anInt569 = 8448;

	@OriginalMember(owner = "client!afa", name = "hn", descriptor = "F")
	float aFloat47 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "hi", descriptor = "F")
	float aFloat48 = -1.0F;

	@OriginalMember(owner = "client!afa", name = "hw", descriptor = "[Lclient!afk;")
	Class109_Sub2[] aClass109_Sub2Array1 = new Class109_Sub2[8];

	@OriginalMember(owner = "client!afa", name = "ht", descriptor = "[Lclient!afk;")
	Class109_Sub2[] aClass109_Sub2Array2 = new Class109_Sub2[8];

	@OriginalMember(owner = "client!afa", name = "io", descriptor = "Lclient!asb;")
	Class93_Sub41_Sub1 aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1(8192);

	@OriginalMember(owner = "client!afa", name = "iq", descriptor = "[I")
	int[] anIntArray40 = new int[1];

	@OriginalMember(owner = "client!afa", name = "ig", descriptor = "[I")
	int[] anIntArray39 = new int[1];

	@OriginalMember(owner = "client!afa", name = "iv", descriptor = "[I")
	int[] anIntArray41 = new int[1];

	@OriginalMember(owner = "client!afa", name = "ie", descriptor = "[B")
	final byte[] aByteArray17 = new byte[16384];

	@OriginalMember(owner = "client!afa", name = "in", descriptor = "Lclient!cm;")
	Class100 aClass100_3 = null;

	@OriginalMember(owner = "client!afa", name = "ir", descriptor = "Lclient!cm;")
	Class100 aClass100_4 = null;

	@OriginalMember(owner = "client!afa", name = "it", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_1 = null;

	@OriginalMember(owner = "client!afa", name = "ix", descriptor = "[I")
	int[] anIntArray42 = new int[3];

	@OriginalMember(owner = "client!afa", name = "is", descriptor = "[J")
	long[] aLongArray7 = new long[3];

	@OriginalMember(owner = "client!afa", name = "ib", descriptor = "[I")
	int[] anIntArray38 = new int[3];

	@OriginalMember(owner = "client!afa", name = "il", descriptor = "I")
	int anInt536 = 0;

	@OriginalMember(owner = "client!afa", name = "iw", descriptor = "I")
	int anInt582 = 0;

	@OriginalMember(owner = "client!afa", name = "cg", descriptor = "I")
	int anInt566;

	@OriginalMember(owner = "client!afa", name = "cl", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL1;

	@OriginalMember(owner = "client!afa", name = "gd", descriptor = "Z")
	boolean aBoolean90;

	@OriginalMember(owner = "client!afa", name = "gi", descriptor = "Z")
	boolean aBoolean92;

	@OriginalMember(owner = "client!afa", name = "hm", descriptor = "Z")
	boolean aBoolean93;

	@OriginalMember(owner = "client!afa", name = "he", descriptor = "I")
	final int anInt527;

	@OriginalMember(owner = "client!afa", name = "gs", descriptor = "Z")
	boolean aBoolean107;

	@OriginalMember(owner = "client!afa", name = "ha", descriptor = "Z")
	boolean aBoolean94;

	@OriginalMember(owner = "client!afa", name = "hb", descriptor = "Z")
	boolean aBoolean75;

	@OriginalMember(owner = "client!afa", name = "hx", descriptor = "Z")
	boolean aBoolean98;

	@OriginalMember(owner = "client!afa", name = "hd", descriptor = "Z")
	boolean aBoolean87;

	@OriginalMember(owner = "client!afa", name = "hk", descriptor = "Z")
	boolean aBoolean95;

	@OriginalMember(owner = "client!afa", name = "hp", descriptor = "Z")
	boolean aBoolean104;

	@OriginalMember(owner = "client!afa", name = "ce", descriptor = "Lclient!ca;")
	final Class201 aClass201_1;

	@OriginalMember(owner = "client!afa", name = "cf", descriptor = "Lclient!cp;")
	Class209 aClass209_1;

	@OriginalMember(owner = "client!afa", name = "ci", descriptor = "Lclient!cv;")
	Class215 aClass215_1;

	@OriginalMember(owner = "client!afa", name = "cn", descriptor = "Lclient!aqf;")
	Class93_Sub4_Sub1 aClass93_Sub4_Sub1_1;

	@OriginalMember(owner = "client!afa", name = "cv", descriptor = "Lclient!aqo;")
	Class93_Sub4_Sub3 aClass93_Sub4_Sub3_1;

	@OriginalMember(owner = "client!afa", name = "cp", descriptor = "Lclient!aqi;")
	Class93_Sub4_Sub2 aClass93_Sub4_Sub2_1;

	@OriginalMember(owner = "client!afa", name = "cu", descriptor = "Lclient!bw;")
	Class197 aClass197_1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;I)V", line = 243)
	Class104_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) int arg6) {
		super(arg1, arg2, arg3, arg4, arg5);
		try {
			try {
				@Pc(304) Field local304 = Unsafe.class.getDeclaredField("theUnsafe");
				local304.setAccessible(true);
				this.anUnsafe1 = (Unsafe) local304.get(null);
			} catch (@Pc(315) Exception local315) {
			}
			this.anInt566 = arg6;
			Class376.method28046().method31617("jaclib");
			Class376.method28046().method31617("jaggl");
			this.anOpenGL1 = new OpenGL();
			@Pc(345) long local345 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt566);
			if (local345 == 0L) {
				throw new RuntimeException("");
			}
			this.method3754();
			@Pc(359) int local359 = this.method3888();
			if (local359 != 0) {
				throw new RuntimeException("");
			}
			if (this.aBoolean89 && this.aBoolean90) {
				@Pc(375) String local375 = System.getProperty("java.version");
				@Pc(379) int local379 = local375.indexOf(95);
				if (local379 > -1) {
					local375 = local375.substring(0, local379);
				}
				local379 = local375.indexOf(46);
				if (local379 > -1) {
					local379 = local375.indexOf(46, local379 + 1);
					if (local379 > -1) {
						local375 = local375.substring(0, local379);
					}
				}
				try {
					@Pc(415) int local415 = (int) (Float.parseFloat(local375) * 100.0F);
					if (local415 >= 170) {
						this.aBoolean90 = false;
						this.aBoolean92 = false;
						this.aBoolean93 = false;
					}
				} catch (@Pc(429) NumberFormatException local429) {
					this.aBoolean90 = false;
					this.aBoolean92 = false;
					this.aBoolean93 = false;
				}
			}
			this.anInt527 = this.aBoolean106 ? 33639 : 5121;
			this.aBoolean107 = this.aString22.indexOf("radeon") != -1;
			@Pc(467) boolean local467 = this.aString23.indexOf("intel") != -1;
			@Pc(469) boolean local469 = false;
			@Pc(471) boolean local471 = false;
			@Pc(473) int local473 = 0;
			@Pc(489) int local489;
			if (this.aBoolean107 || local467) {
				@Pc(487) String[] local487 = client.method25402(this.aString22.replace('/', ' '), ' ');
				for (local489 = 0; local489 < local487.length; local489++) {
					@Pc(497) String local497 = local487[local489];
					try {
						if (local497.length() > 0) {
							if (local497.charAt(0) == 'x' && local497.length() >= 3 && Class633.method32304(local497.substring(1, 3))) {
								local497 = local497.substring(1);
								local471 = true;
							}
							if (local497.equals("hd")) {
								local469 = true;
							} else {
								if (local497.startsWith("hd")) {
									local497 = local497.substring(2);
									local469 = true;
								}
								if (local497.length() >= 4 && Class633.method32304(local497.substring(0, 4))) {
									local473 = Class616.method32090(local497.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(561) Exception local561) {
					}
				}
			}
			if (this.anInt566 != 0 && local467 && !local469) {
				throw new RuntimeException_Sub2("");
			}
			if (this.aBoolean107 || local467) {
				if (!local467) {
					if (!local471 && !local469) {
						if (local473 >= 7000 && local473 <= 7999) {
							this.aBoolean94 = false;
						}
						if (local473 >= 7000 && local473 <= 9250) {
							this.aBoolean75 = false;
						}
					}
					if (!local469 || local473 < 4000) {
						this.aBoolean98 = false;
					}
					this.aBoolean87 &= this.anOpenGL1.method27723("GL_ARB_half_float_pixel");
					this.aBoolean95 = this.aBoolean94;
				} else if (!local469) {
					this.aBoolean90 = false;
					this.aBoolean92 = false;
					this.aBoolean93 = false;
				}
			}
			this.aBoolean104 = !this.aString23.equals("s3 graphics");
			if (this.aBoolean94) {
				try {
					@Pc(653) int[] local653 = new int[1];
					OpenGL.glGenBuffersARB(1, local653, 0);
				} catch (@Pc(659) Throwable local659) {
					throw new RuntimeException("");
				}
			}
			Class660.method32825(false, true);
			this.aBoolean74 = true;
			this.aClass201_1 = new Class201(this, this.anInterface24_6);
			this.method3755();
			this.aClass209_1 = new Class209(this);
			this.aClass215_1 = new Class215(this);
			if (this.aClass215_1.method25475()) {
				this.aClass93_Sub4_Sub1_1 = new Class93_Sub4_Sub1(this);
				if (!this.aClass93_Sub4_Sub1_1.method19696()) {
					this.aClass93_Sub4_Sub1_1.method20199();
					this.aClass93_Sub4_Sub1_1 = null;
				}
				this.aClass93_Sub4_Sub3_1 = new Class93_Sub4_Sub3(this);
				if (!this.aClass93_Sub4_Sub3_1.method20200()) {
					this.aClass93_Sub4_Sub3_1.method20199();
					this.aClass93_Sub4_Sub3_1 = null;
				}
				this.aClass93_Sub4_Sub2_1 = new Class93_Sub4_Sub2(this);
				if (!this.aClass93_Sub4_Sub2_1.method19814()) {
					this.aClass93_Sub4_Sub2_1.method20199();
					this.aClass93_Sub4_Sub2_1 = null;
				}
			} else {
				this.aClass215_1.method25487();
				this.aClass215_1 = null;
			}
			this.method20437(arg0, new Class112_Sub2_Sub3(this, arg0, local345));
			this.method20439(arg0);
			if (this.aBoolean89) {
				@Pc(773) int local773 = arg0.getLocation().x;
				local489 = arg0.getLocation().y;
				arg0.setLocation(local773 + 1, local489);
				arg0.setLocation(local773, local489);
			}
			this.aClass197_1 = new Class197(this);
			this.method3841();
			this.method20449();
			if (this.aClass215_1 != null) {
				this.method3789();
				this.method3830();
			}
		} catch (@Pc(808) Throwable local808) {
			local808.printStackTrace();
			this.method20877();
			if (local808 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local808;
			} else if (local808 instanceof RuntimeException_Sub2) {
				throw (RuntimeException_Sub2) local808;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "rv", descriptor = "()V", line = 401)
	void method3754() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method27724()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class212.method25439(1000L);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uw", descriptor = "()V", line = 401)
	void method3860() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method27724()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class212.method25439(1000L);
		}
	}

	@OriginalMember(owner = "client!afa", name = "up", descriptor = "()V", line = 401)
	void method3878() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method27724()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class212.method25439(1000L);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ud", descriptor = "()I", line = 409)
	int method3861() {
		@Pc(1) int local1 = 0;
		this.aString23 = OpenGL.glGetString(7936).toLowerCase();
		this.aString22 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString23.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString23.indexOf("brian paul") != -1 || this.aString23.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = client.method25402(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class616.method32090(local48[0]);
				@Pc(64) int local64 = Class616.method32090(local48[1]);
				this.anInt572 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt572 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method27723("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method27723("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt573 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt552 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt574 = local111[0];
		if (this.anInt573 < 2 || this.anInt552 < 2 || this.anInt574 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean106 = Stream.u();
		this.aBoolean94 = this.anOpenGL1.method27723("GL_ARB_vertex_buffer_object");
		this.aBoolean92 = this.anOpenGL1.method27723("GL_ARB_multisample");
		this.aBoolean100 = this.anOpenGL1.method27723("GL_ARB_vertex_program");
		this.aBoolean102 = this.anOpenGL1.method27723("GL_ARB_fragment_program");
		this.aBoolean101 = this.anOpenGL1.method27723("GL_ARB_vertex_shader");
		this.aBoolean103 = this.anOpenGL1.method27723("GL_ARB_fragment_shader");
		this.aBoolean75 = this.anOpenGL1.method27723("GL_EXT_texture3D");
		this.aBoolean87 = this.anOpenGL1.method27723("GL_ARB_texture_rectangle");
		this.aBoolean83 = this.anOpenGL1.method27723("GL_ARB_texture_cube_map");
		this.aBoolean97 = this.anOpenGL1.method27723("GL_ARB_seamless_cube_map");
		this.aBoolean98 = this.anOpenGL1.method27723("GL_ARB_texture_float");
		this.aBoolean99 = this.anOpenGL1.method27723("GL_ARB_texture_non_power_of_two");
		this.aBoolean90 = this.anOpenGL1.method27723("GL_EXT_framebuffer_object");
		this.aBoolean77 = this.anOpenGL1.method27723("GL_EXT_framebuffer_blit");
		this.aBoolean91 = this.anOpenGL1.method27723("GL_EXT_framebuffer_multisample");
		this.aBoolean93 = this.aBoolean77 & this.aBoolean91;
		this.aBoolean105 = this.anOpenGL1.method27723("GL_EXT_blend_func_separate");
		this.aBoolean96 = this.anUnsafe1 != null && (this.anInt572 >= 32 || this.anOpenGL1.method27723("GL_ARB_sync"));
		this.aBoolean89 = Class527.aString222.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray14, 0);
		this.aFloat48 = aFloatArray14[0];
		this.aFloat47 = aFloatArray14[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afa", name = "rh", descriptor = "()I", line = 409)
	int method3888() {
		@Pc(1) int local1 = 0;
		this.aString23 = OpenGL.glGetString(7936).toLowerCase();
		this.aString22 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString23.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString23.indexOf("brian paul") != -1 || this.aString23.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = client.method25402(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class616.method32090(local48[0]);
				@Pc(64) int local64 = Class616.method32090(local48[1]);
				this.anInt572 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt572 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method27723("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method27723("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt573 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt552 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt574 = local111[0];
		if (this.anInt573 < 2 || this.anInt552 < 2 || this.anInt574 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean106 = Stream.u();
		this.aBoolean94 = this.anOpenGL1.method27723("GL_ARB_vertex_buffer_object");
		this.aBoolean92 = this.anOpenGL1.method27723("GL_ARB_multisample");
		this.aBoolean100 = this.anOpenGL1.method27723("GL_ARB_vertex_program");
		this.aBoolean102 = this.anOpenGL1.method27723("GL_ARB_fragment_program");
		this.aBoolean101 = this.anOpenGL1.method27723("GL_ARB_vertex_shader");
		this.aBoolean103 = this.anOpenGL1.method27723("GL_ARB_fragment_shader");
		this.aBoolean75 = this.anOpenGL1.method27723("GL_EXT_texture3D");
		this.aBoolean87 = this.anOpenGL1.method27723("GL_ARB_texture_rectangle");
		this.aBoolean83 = this.anOpenGL1.method27723("GL_ARB_texture_cube_map");
		this.aBoolean97 = this.anOpenGL1.method27723("GL_ARB_seamless_cube_map");
		this.aBoolean98 = this.anOpenGL1.method27723("GL_ARB_texture_float");
		this.aBoolean99 = this.anOpenGL1.method27723("GL_ARB_texture_non_power_of_two");
		this.aBoolean90 = this.anOpenGL1.method27723("GL_EXT_framebuffer_object");
		this.aBoolean77 = this.anOpenGL1.method27723("GL_EXT_framebuffer_blit");
		this.aBoolean91 = this.anOpenGL1.method27723("GL_EXT_framebuffer_multisample");
		this.aBoolean93 = this.aBoolean77 & this.aBoolean91;
		this.aBoolean105 = this.anOpenGL1.method27723("GL_EXT_blend_func_separate");
		this.aBoolean96 = this.anUnsafe1 != null && (this.anInt572 >= 32 || this.anOpenGL1.method27723("GL_ARB_sync"));
		this.aBoolean89 = Class527.aString222.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray14, 0);
		this.aFloat48 = aFloatArray14[0];
		this.aFloat47 = aFloatArray14[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!afa", name = "ra", descriptor = "()V", line = 465)
	void method3755() {
		this.aClass88Array1 = new Class88[this.anInt573];
		this.aClass88_Sub2_2 = new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass109_Sub2Array1[local37] = new Class109_Sub2(this);
			this.aClass109_Sub2Array2[local37] = new Class109_Sub2(this);
		}
		if (this.aBoolean90) {
			this.aClass112_Sub1_Sub2_1 = new Class112_Sub1_Sub2(this);
			new Class112_Sub1_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uh", descriptor = "()V", line = 465)
	void method3862() {
		this.aClass88Array1 = new Class88[this.anInt573];
		this.aClass88_Sub2_2 = new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass109_Sub2Array1[local37] = new Class109_Sub2(this);
			this.aClass109_Sub2Array2[local37] = new Class109_Sub2(this);
		}
		if (this.aBoolean90) {
			this.aClass112_Sub1_Sub2_1 = new Class112_Sub1_Sub2(this);
			new Class112_Sub1_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!afa", name = "us", descriptor = "()V", line = 465)
	void method3863() {
		this.aClass88Array1 = new Class88[this.anInt573];
		this.aClass88_Sub2_2 = new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		new Class88_Sub2(this, 3553, Class206.aClass206_22, Class226.aClass226_22, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass109_Sub2Array1[local37] = new Class109_Sub2(this);
			this.aClass109_Sub2Array2[local37] = new Class109_Sub2(this);
		}
		if (this.aBoolean90) {
			this.aClass112_Sub1_Sub2_1 = new Class112_Sub1_Sub2(this);
			new Class112_Sub1_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!afa", name = "rx", descriptor = "()V", line = 480)
	void method3841() {
		this.method3801(-2);
		for (@Pc(7) int local7 = this.anInt573 - 1; local7 >= 0; local7--) {
			this.method3803(local7);
			this.method3804(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3837(8448, 8448);
		this.method3807(2, 34168, 770);
		this.method3812();
		this.anInt547 = 1;
		this.anInt538 = 0;
		this.aBoolean78 = true;
		if (this.aBoolean105) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt537 = 1;
		this.aByte2 = -1;
		this.method3821((byte) 0);
		this.aBoolean79 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte2);
		if (this.aBoolean92) {
			if (this.anInt566 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean73 = true;
		this.method3765(true);
		this.method3791(true);
		this.method3815(true);
		this.method3816(true);
		this.method20638(0.0F, 1.0F);
		this.method3775();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method3825(this.anInt559);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(155) float[] local155 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(157) int local157 = 0; local157 < 8; local157++) {
			@Pc(164) int local164 = local157 + 16384;
			OpenGL.glLightfv(local164, 4608, local155, 0);
			OpenGL.glLightf(local164, 4615, 0.0F);
			OpenGL.glLightf(local164, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (this.aBoolean97) {
			OpenGL.glEnable(34895);
		}
		this.anInt562 = -1;
		this.anInt560 = -1;
		this.method20562();
		this.method20466();
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "()Lclient!cz;", line = 543)
	@Override
	public Class219 method20571() {
		@Pc(1) int local1 = -1;
		if (this.aString23.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString23.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString23.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class219(local1, "OpenGL", this.anInt572, this.aString22, 0L, false);
	}

	@OriginalMember(owner = "client!afa", name = "eq", descriptor = "()Lclient!cz;", line = 543)
	@Override
	public Class219 method20553() {
		@Pc(1) int local1 = -1;
		if (this.aString23.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString23.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString23.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class219(local1, "OpenGL", this.anInt572, this.aString22, 0L, false);
	}

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "(II)V", line = 552)
	@Override
	void method20415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		try {
			this.aClass112_Sub2_6.method23755();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778();
		}
	}

	@OriginalMember(owner = "client!afa", name = "eg", descriptor = "(II)V", line = 552)
	@Override
	void method20782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		try {
			this.aClass112_Sub2_6.method23755();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ez", descriptor = "(II)V", line = 552)
	@Override
	void method20585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub4 {
		try {
			this.aClass112_Sub2_6.method23755();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6778();
		}
	}

	@OriginalMember(owner = "client!afa", name = "u", descriptor = "()V", line = 559)
	@Override
	public void method20416() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afa", name = "ef", descriptor = "()V", line = 559)
	@Override
	public void method20556() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afa", name = "et", descriptor = "()V", line = 559)
	@Override
	public void method20557() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "()V", line = 563)
	@Override
	void method20668() {
		for (@Pc(4) Class93 local4 = this.aClass22_12.method445(); local4 != null; local4 = this.aClass22_12.method415()) {
			((Class93_Sub35_Sub2) local4).method19708();
		}
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25487();
		}
		if (this.aBoolean74) {
			Class46.method896(false, true);
			this.aBoolean74 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ea", descriptor = "()V", line = 563)
	@Override
	void method20558() {
		for (@Pc(4) Class93 local4 = this.aClass22_12.method445(); local4 != null; local4 = this.aClass22_12.method415()) {
			((Class93_Sub35_Sub2) local4).method19708();
		}
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25487();
		}
		if (this.aBoolean74) {
			Class46.method896(false, true);
			this.aBoolean74 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ew", descriptor = "()V", line = 563)
	@Override
	void method20559() {
		for (@Pc(4) Class93 local4 = this.aClass22_12.method445(); local4 != null; local4 = this.aClass22_12.method415()) {
			((Class93_Sub35_Sub2) local4).method19708();
		}
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25487();
		}
		if (this.aBoolean74) {
			Class46.method896(false, true);
			this.aBoolean74 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "er", descriptor = "()V", line = 563)
	@Override
	void method20758() {
		for (@Pc(4) Class93 local4 = this.aClass22_12.method445(); local4 != null; local4 = this.aClass22_12.method415()) {
			((Class93_Sub35_Sub2) local4).method19708();
		}
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25487();
		}
		if (this.aBoolean74) {
			Class46.method896(false, true);
			this.aBoolean74 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "()Z", line = 574)
	@Override
	public boolean method20493() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fg", descriptor = "()Z", line = 574)
	@Override
	public boolean method20837() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fm", descriptor = "()Z", line = 574)
	@Override
	public boolean method20802() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "v", descriptor = "()Z", line = 578)
	@Override
	public boolean method20422() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fu", descriptor = "()Z", line = 578)
	@Override
	public boolean method20566() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fs", descriptor = "()Z", line = 578)
	@Override
	public boolean method20797() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "()Z", line = 582)
	@Override
	public boolean method20423() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fz", descriptor = "()Z", line = 582)
	@Override
	public boolean method20568() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "y", descriptor = "()Z", line = 586)
	@Override
	public boolean method20565() {
		return this.aClass93_Sub4_Sub1_1 != null && (this.anInt566 <= 1 || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fj", descriptor = "()Z", line = 586)
	@Override
	public boolean method20569() {
		return this.aClass93_Sub4_Sub1_1 != null && (this.anInt566 <= 1 || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fd", descriptor = "()Z", line = 586)
	@Override
	public boolean method20570() {
		return this.aClass93_Sub4_Sub1_1 != null && (this.anInt566 <= 1 || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fn", descriptor = "()Z", line = 586)
	@Override
	public boolean method20683() {
		return this.aClass93_Sub4_Sub1_1 != null && (this.anInt566 <= 1 || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "()Z", line = 590)
	@Override
	public boolean method20426() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fi", descriptor = "()Z", line = 590)
	@Override
	public boolean method20739() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "s", descriptor = "()Z", line = 594)
	@Override
	public boolean method20424() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ft", descriptor = "()Z", line = 594)
	@Override
	public boolean method20644() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "x", descriptor = "()Z", line = 598)
	@Override
	public boolean method20440() {
		return this.aBoolean92 && (!this.method20541() || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fx", descriptor = "()Z", line = 598)
	@Override
	public boolean method20670() {
		return this.aBoolean92 && (!this.method20541() || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fv", descriptor = "()Z", line = 598)
	@Override
	public boolean method20760() {
		return this.aBoolean92 && (!this.method20541() || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "fc", descriptor = "()Z", line = 598)
	@Override
	public boolean method20576() {
		return this.aBoolean92 && (!this.method20541() || this.aBoolean93);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "()Z", line = 602)
	@Override
	public boolean method20428() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fw", descriptor = "()Z", line = 602)
	@Override
	public boolean method20577() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ry", descriptor = "()Z", line = 606)
	boolean method3757() {
		return this.aClass197_1.method24620(3);
	}

	@OriginalMember(owner = "client!afa", name = "ux", descriptor = "()Z", line = 606)
	boolean method3864() {
		return this.aClass197_1.method24620(3);
	}

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "()Z", line = 610)
	@Override
	public boolean method20429() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fa", descriptor = "()Z", line = 610)
	@Override
	public boolean method20578() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "fp", descriptor = "()Z", line = 610)
	@Override
	public boolean method20694() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "()Z", line = 614)
	@Override
	public boolean method20539() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "fq", descriptor = "()Z", line = 614)
	@Override
	public boolean method20580() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "ff", descriptor = "()Z", line = 614)
	@Override
	public boolean method20685() {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20431() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt566 + local3;
		@Pc(27) String local27 = local15 + this.anInt527 + local3;
		@Pc(39) String local39 = local27 + this.anInt573 + local3;
		@Pc(51) String local51 = local39 + this.anInt552 + local3;
		@Pc(63) String local63 = local51 + this.anInt574 + local3;
		@Pc(75) String local75 = local63 + this.aFloat48 + local3;
		@Pc(87) String local87 = local75 + this.aFloat47 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean106 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean107 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean94 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean95 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean92 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean100 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean102 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean101 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean103 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean97 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean99 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean90 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean91 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean98 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean104 ? 1 : 0) + local3;
		return local407 + (this.aBoolean105 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afa", name = "fb", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20865() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt566 + local3;
		@Pc(27) String local27 = local15 + this.anInt527 + local3;
		@Pc(39) String local39 = local27 + this.anInt573 + local3;
		@Pc(51) String local51 = local39 + this.anInt552 + local3;
		@Pc(63) String local63 = local51 + this.anInt574 + local3;
		@Pc(75) String local75 = local63 + this.aFloat48 + local3;
		@Pc(87) String local87 = local75 + this.aFloat47 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean106 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean107 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean94 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean95 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean92 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean100 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean102 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean101 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean103 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean97 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean99 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean90 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean91 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean98 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean104 ? 1 : 0) + local3;
		return local407 + (this.aBoolean105 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afa", name = "fo", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20584() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt566 + local3;
		@Pc(27) String local27 = local15 + this.anInt527 + local3;
		@Pc(39) String local39 = local27 + this.anInt573 + local3;
		@Pc(51) String local51 = local39 + this.anInt552 + local3;
		@Pc(63) String local63 = local51 + this.anInt574 + local3;
		@Pc(75) String local75 = local63 + this.aFloat48 + local3;
		@Pc(87) String local87 = local75 + this.aFloat47 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean106 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean107 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean94 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean95 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean92 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean100 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean102 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean101 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean103 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean97 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean99 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean90 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean91 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean98 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean104 ? 1 : 0) + local3;
		return local407 + (this.aBoolean105 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afa", name = "fl", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20582() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt566 + local3;
		@Pc(27) String local27 = local15 + this.anInt527 + local3;
		@Pc(39) String local39 = local27 + this.anInt573 + local3;
		@Pc(51) String local51 = local39 + this.anInt552 + local3;
		@Pc(63) String local63 = local51 + this.anInt574 + local3;
		@Pc(75) String local75 = local63 + this.aFloat48 + local3;
		@Pc(87) String local87 = local75 + this.aFloat47 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean106 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean107 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean94 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean95 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean92 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean100 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean102 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean101 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean103 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean97 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean99 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean90 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean91 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean98 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean104 ? 1 : 0) + local3;
		return local407 + (this.aBoolean105 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afa", name = "fy", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20769() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt566 + local3;
		@Pc(27) String local27 = local15 + this.anInt527 + local3;
		@Pc(39) String local39 = local27 + this.anInt573 + local3;
		@Pc(51) String local51 = local39 + this.anInt552 + local3;
		@Pc(63) String local63 = local51 + this.anInt574 + local3;
		@Pc(75) String local75 = local63 + this.aFloat48 + local3;
		@Pc(87) String local87 = local75 + this.aFloat47 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean106 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean107 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean89 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean94 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean95 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean92 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean100 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean102 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean101 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean103 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean75 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean87 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean83 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean97 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean99 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean90 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean77 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean91 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean98 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean104 ? 1 : 0) + local3;
		return local407 + (this.aBoolean105 ? 1 : 0);
	}

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "()[I", line = 652)
	@Override
	public int[] method20712() {
		@Pc(2) int[] local2 = new int[1];
		OpenGL.glGetIntegerv(34466, local2, 0);
		@Pc(10) int local10 = local2[0];
		if (local10 == 0) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[local10];
			OpenGL.glGetIntegerv(34467, local17, 0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!afa", name = "fe", descriptor = "()[I", line = 652)
	@Override
	public int[] method20560() {
		@Pc(2) int[] local2 = new int[1];
		OpenGL.glGetIntegerv(34466, local2, 0);
		@Pc(10) int local10 = local2[0];
		if (local10 == 0) {
			return null;
		} else {
			@Pc(17) int[] local17 = new int[local10];
			OpenGL.glGetIntegerv(34467, local17, 0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 662)
	@Override
	Class112_Sub2 method20443(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "gq", descriptor = "(Ljava/awt/Canvas;II)Lclient!afy;", line = 662)
	@Override
	Class112_Sub2 method20591(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class112_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "rg", descriptor = "()V", line = 666)
	void method3910() {
		this.method3784();
	}

	@OriginalMember(owner = "client!afa", name = "rz", descriptor = "()V", line = 670)
	void method3784() {
		@Pc(3) int local3 = this.aClass112_6.method23736();
		@Pc(7) int local7 = this.aClass112_6.method23737();
		this.aClass489_5.method29850(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20562();
		this.method3775();
		this.method20466();
	}

	@OriginalMember(owner = "client!afa", name = "ur", descriptor = "()V", line = 670)
	void method3854() {
		@Pc(3) int local3 = this.aClass112_6.method23736();
		@Pc(7) int local7 = this.aClass112_6.method23737();
		this.aClass489_5.method29850(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20562();
		this.method3775();
		this.method20466();
	}

	@OriginalMember(owner = "client!afa", name = "gl", descriptor = "(IIII)[I", line = 679)
	@Override
	public int[] method20592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass112_6.method23737();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt527, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afa", name = "aq", descriptor = "(IIII)[I", line = 679)
	@Override
	public int[] method20448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass112_6.method23737();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt527, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!afa", name = "ax", descriptor = "()V", line = 691)
	@Override
	public void method20449() {
		if (!this.aBoolean104 || this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt550;
		@Pc(12) int local12 = this.anInt551;
		@Pc(15) int local15 = this.anInt548;
		@Pc(18) int local18 = this.anInt549;
		this.method20466();
		@Pc(23) int local23 = this.anInt539;
		@Pc(26) int local26 = this.anInt555;
		@Pc(29) int local29 = this.anInt554;
		@Pc(32) int local32 = this.anInt557;
		this.method20562();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3775();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3818(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20467(local9, local15, local12, local18);
		this.method20463(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afa", name = "go", descriptor = "()V", line = 691)
	@Override
	public void method20593() {
		if (!this.aBoolean104 || this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt550;
		@Pc(12) int local12 = this.anInt551;
		@Pc(15) int local15 = this.anInt548;
		@Pc(18) int local18 = this.anInt549;
		this.method20466();
		@Pc(23) int local23 = this.anInt539;
		@Pc(26) int local26 = this.anInt555;
		@Pc(29) int local29 = this.anInt554;
		@Pc(32) int local32 = this.anInt557;
		this.method20562();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3775();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3818(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20467(local9, local15, local12, local18);
		this.method20463(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afa", name = "gy", descriptor = "()V", line = 691)
	@Override
	public void method20596() {
		if (!this.aBoolean104 || this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt550;
		@Pc(12) int local12 = this.anInt551;
		@Pc(15) int local15 = this.anInt548;
		@Pc(18) int local18 = this.anInt549;
		this.method20466();
		@Pc(23) int local23 = this.anInt539;
		@Pc(26) int local26 = this.anInt555;
		@Pc(29) int local29 = this.anInt554;
		@Pc(32) int local32 = this.anInt557;
		this.method20562();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3775();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3818(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20467(local9, local15, local12, local18);
		this.method20463(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afa", name = "gp", descriptor = "()V", line = 691)
	@Override
	public void method20581() {
		if (!this.aBoolean104 || this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt550;
		@Pc(12) int local12 = this.anInt551;
		@Pc(15) int local15 = this.anInt548;
		@Pc(18) int local18 = this.anInt549;
		this.method20466();
		@Pc(23) int local23 = this.anInt539;
		@Pc(26) int local26 = this.anInt555;
		@Pc(29) int local29 = this.anInt554;
		@Pc(32) int local32 = this.anInt557;
		this.method20562();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3775();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3818(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20467(local9, local15, local12, local18);
		this.method20463(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afa", name = "gk", descriptor = "()V", line = 691)
	@Override
	public void method20690() {
		if (!this.aBoolean104 || this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt550;
		@Pc(12) int local12 = this.anInt551;
		@Pc(15) int local15 = this.anInt548;
		@Pc(18) int local18 = this.anInt549;
		this.method20466();
		@Pc(23) int local23 = this.anInt539;
		@Pc(26) int local26 = this.anInt555;
		@Pc(29) int local29 = this.anInt554;
		@Pc(32) int local32 = this.anInt557;
		this.method20562();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3775();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3818(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20467(local9, local15, local12, local18);
		this.method20463(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!afa", name = "av", descriptor = "()Z", line = 728)
	@Override
	public boolean method20659() {
		return this.aBoolean96;
	}

	@OriginalMember(owner = "client!afa", name = "gf", descriptor = "()Z", line = 728)
	@Override
	public boolean method20749() {
		return this.aBoolean96;
	}

	@OriginalMember(owner = "client!afa", name = "gc", descriptor = "()Z", line = 728)
	@Override
	public boolean method20787() {
		return this.aBoolean96;
	}

	@OriginalMember(owner = "client!afa", name = "ao", descriptor = "()Z", line = 732)
	@Override
	public boolean method20495() {
		return !this.aBoolean96 || this.aLongArray7[this.anInt582] == 0L;
	}

	@OriginalMember(owner = "client!afa", name = "gx", descriptor = "()Z", line = 732)
	@Override
	public boolean method20601() {
		return !this.aBoolean96 || this.aLongArray7[this.anInt582] == 0L;
	}

	@OriginalMember(owner = "client!afa", name = "ge", descriptor = "()Z", line = 732)
	@Override
	public boolean method20602() {
		return !this.aBoolean96 || this.aLongArray7[this.anInt582] == 0L;
	}

	@OriginalMember(owner = "client!afa", name = "gg", descriptor = "()Z", line = 732)
	@Override
	public boolean method20534() {
		return !this.aBoolean96 || this.aLongArray7[this.anInt582] == 0L;
	}

	@OriginalMember(owner = "client!afa", name = "gr", descriptor = "()Z", line = 732)
	@Override
	public boolean method20604() {
		return !this.aBoolean96 || this.aLongArray7[this.anInt582] == 0L;
	}

	@OriginalMember(owner = "client!afa", name = "gs", descriptor = "()Z", line = 741)
	@Override
	public boolean method20875() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "gt", descriptor = "()Z", line = 741)
	@Override
	public boolean method20606() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "gh", descriptor = "()Z", line = 741)
	@Override
	public boolean method20607() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "aj", descriptor = "()Z", line = 741)
	@Override
	public boolean method20452() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "ay", descriptor = "()Z", line = 745)
	@Override
	public boolean method20603() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "gm", descriptor = "()Z", line = 745)
	@Override
	public boolean method20608() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "gv", descriptor = "()Z", line = 745)
	@Override
	public boolean method20432() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "gj", descriptor = "()I", line = 749)
	@Override
	public int method20775() {
		if (!this.aBoolean96) {
			return -1;
		} else if (this.aLongArray7[this.anInt536] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt536], 0, 0);
			if (local21 == 37149) {
				this.method20455();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray38[this.anInt536];
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "gw", descriptor = "()I", line = 749)
	@Override
	public int method20651() {
		if (!this.aBoolean96) {
			return -1;
		} else if (this.aLongArray7[this.anInt536] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt536], 0, 0);
			if (local21 == 37149) {
				this.method20455();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray38[this.anInt536];
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "ab", descriptor = "()I", line = 749)
	@Override
	public int method20801() {
		if (!this.aBoolean96) {
			return -1;
		} else if (this.aLongArray7[this.anInt536] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray7[this.anInt536], 0, 0);
			if (local21 == 37149) {
				this.method20455();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray38[this.anInt536];
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "gd", descriptor = "(III)V", line = 762)
	@Override
	public void method20612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20502();
		if (this.aClass112_Sub1_1 == null) {
			this.method3762(arg1, arg2);
		}
		if (this.aClass100_3 == null) {
			this.aClass100_3 = this.method20613(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), true);
		} else {
			((Class100_Sub2) this.aClass100_3).method2316(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 0, 0, true);
		}
		this.method20441(this.aClass112_Sub1_1);
		this.method20774(1, -16777216);
		this.aClass100_3.method18203(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray42[this.anInt582]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20442(this.aClass112_Sub1_1);
		this.aLongArray7[this.anInt582] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray38[this.anInt582] = arg0;
		if (++this.anInt582 >= 3) {
			this.anInt582 = 0;
		}
		this.method20503();
	}

	@OriginalMember(owner = "client!afa", name = "gz", descriptor = "(III)V", line = 762)
	@Override
	public void method20686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20502();
		if (this.aClass112_Sub1_1 == null) {
			this.method3762(arg1, arg2);
		}
		if (this.aClass100_3 == null) {
			this.aClass100_3 = this.method20613(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), true);
		} else {
			((Class100_Sub2) this.aClass100_3).method2316(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 0, 0, true);
		}
		this.method20441(this.aClass112_Sub1_1);
		this.method20774(1, -16777216);
		this.aClass100_3.method18203(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray42[this.anInt582]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20442(this.aClass112_Sub1_1);
		this.aLongArray7[this.anInt582] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray38[this.anInt582] = arg0;
		if (++this.anInt582 >= 3) {
			this.anInt582 = 0;
		}
		this.method20503();
	}

	@OriginalMember(owner = "client!afa", name = "aa", descriptor = "(III)V", line = 762)
	@Override
	public void method20462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20502();
		if (this.aClass112_Sub1_1 == null) {
			this.method3762(arg1, arg2);
		}
		if (this.aClass100_3 == null) {
			this.aClass100_3 = this.method20613(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), true);
		} else {
			((Class100_Sub2) this.aClass100_3).method2316(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 0, 0, true);
		}
		this.method20441(this.aClass112_Sub1_1);
		this.method20774(1, -16777216);
		this.aClass100_3.method18203(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
		OpenGL.glBindBufferARB(35051, this.anIntArray42[this.anInt582]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2900 * 106932625, this.anInt2882 * -28194907, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method20442(this.aClass112_Sub1_1);
		this.aLongArray7[this.anInt582] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray38[this.anInt582] = arg0;
		if (++this.anInt582 >= 3) {
			this.anInt582 = 0;
		}
		this.method20503();
	}

	@OriginalMember(owner = "client!afa", name = "az", descriptor = "()V", line = 780)
	@Override
	public void method20455() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt582 = 0;
		this.anInt536 = 0;
	}

	@OriginalMember(owner = "client!afa", name = "gb", descriptor = "()V", line = 780)
	@Override
	public void method20614() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt582 = 0;
		this.anInt536 = 0;
	}

	@OriginalMember(owner = "client!afa", name = "gi", descriptor = "()V", line = 780)
	@Override
	public void method20615() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt582 = 0;
		this.anInt536 = 0;
	}

	@OriginalMember(owner = "client!afa", name = "hm", descriptor = "()V", line = 780)
	@Override
	public void method20616() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray7[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local1]);
				this.aLongArray7[local1] = 0L;
			}
		}
		this.anInt582 = 0;
		this.anInt536 = 0;
	}

	@OriginalMember(owner = "client!afa", name = "af", descriptor = "(II)J", line = 791)
	@Override
	public long method20457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3760(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afa", name = "hu", descriptor = "(II)J", line = 791)
	@Override
	public long method20619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3760(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afa", name = "ha", descriptor = "(II)J", line = 791)
	@Override
	public long method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3760(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afa", name = "hk", descriptor = "(II)J", line = 791)
	@Override
	public long method20483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3760(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!afa", name = "an", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method3760(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "hq", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method3760(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "hx", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method3760(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "re", descriptor = "(II[I[I)J", line = 799)
	long method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean96) {
			if (this.aClass100_4 == null) {
				this.method3762(arg0, arg1);
			}
			if (this.aClass100_3 == null) {
				this.aClass100_3 = this.method20613(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), true);
			} else {
				((Class100_Sub2) this.aClass100_3).method2316(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 0, 0, true);
			}
			this.method20441(this.aClass112_Sub1_1);
			this.method20774(1, -16777216);
			this.aClass100_3.method18203(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
			this.aClass100_4.method18205(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20442(this.aClass112_Sub1_1);
			return 0L;
		}
		if (this.aLongArray7[this.anInt536] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray7[this.anInt536]);
			this.aLongArray7[this.anInt536] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray42[this.anInt536]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe1.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt536 >= 3) {
			this.anInt536 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!afa", name = "uu", descriptor = "(II[I[I)J", line = 799)
	long method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean96) {
			if (this.aClass100_4 == null) {
				this.method3762(arg0, arg1);
			}
			if (this.aClass100_3 == null) {
				this.aClass100_3 = this.method20613(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), true);
			} else {
				((Class100_Sub2) this.aClass100_3).method2316(0, 0, this.aClass112_6.method23736(), this.aClass112_6.method23737(), 0, 0, true);
			}
			this.method20441(this.aClass112_Sub1_1);
			this.method20774(1, -16777216);
			this.aClass100_3.method18203(this.anInt2899 * 1081362515, this.anInt2903 * -779214253, this.anInt2904 * 406942099, this.anInt2898 * -88050601);
			this.aClass100_4.method18205(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method20442(this.aClass112_Sub1_1);
			return 0L;
		}
		if (this.aLongArray7[this.anInt536] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray7[this.anInt536]);
			this.aLongArray7[this.anInt536] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray42[this.anInt536]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe1.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt536 >= 3) {
			this.anInt536 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!afa", name = "ak", descriptor = "(J)V", line = 834)
	@Override
	public void method20458(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afa", name = "hd", descriptor = "(J)V", line = 834)
	@Override
	public void method20622(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afa", name = "hg", descriptor = "(J)V", line = 834)
	@Override
	public void method20621(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afa", name = "hb", descriptor = "(J)V", line = 834)
	@Override
	public void method20620(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!afa", name = "hr", descriptor = "()V", line = 839)
	@Override
	public void method20626() {
		if (!this.aBoolean96) {
			this.aClass112_Sub1_1 = null;
			this.aClass100_4 = null;
			this.aClass100_3 = null;
			return;
		}
		this.aClass100_3 = null;
		if (this.aClass112_Sub1_1 != null) {
			this.aClass112_Sub1_1.method23738();
			this.aClass112_Sub1_1 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray42[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "hs", descriptor = "()V", line = 839)
	@Override
	public void method20627() {
		if (!this.aBoolean96) {
			this.aClass112_Sub1_1 = null;
			this.aClass100_4 = null;
			this.aClass100_3 = null;
			return;
		}
		this.aClass100_3 = null;
		if (this.aClass112_Sub1_1 != null) {
			this.aClass112_Sub1_1.method23738();
			this.aClass112_Sub1_1 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray42[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "bl", descriptor = "()V", line = 839)
	@Override
	public void method20425() {
		if (!this.aBoolean96) {
			this.aClass112_Sub1_1 = null;
			this.aClass100_4 = null;
			this.aClass100_3 = null;
			return;
		}
		this.aClass100_3 = null;
		if (this.aClass112_Sub1_1 != null) {
			this.aClass112_Sub1_1.method23738();
			this.aClass112_Sub1_1 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray42[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "hf", descriptor = "()V", line = 839)
	@Override
	public void method20794() {
		if (!this.aBoolean96) {
			this.aClass112_Sub1_1 = null;
			this.aClass100_4 = null;
			this.aClass100_3 = null;
			return;
		}
		this.aClass100_3 = null;
		if (this.aClass112_Sub1_1 != null) {
			this.aClass112_Sub1_1.method23738();
			this.aClass112_Sub1_1 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray42[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "hh", descriptor = "()V", line = 839)
	@Override
	public void method20461() {
		if (!this.aBoolean96) {
			this.aClass112_Sub1_1 = null;
			this.aClass100_4 = null;
			this.aClass100_3 = null;
			return;
		}
		this.aClass100_3 = null;
		if (this.aClass112_Sub1_1 != null) {
			this.aClass112_Sub1_1.method23738();
			this.aClass112_Sub1_1 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray42[local21] = 0;
			if (this.aLongArray7[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray7[local21]);
				this.aLongArray7[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "rt", descriptor = "(II)V", line = 862)
	void method3762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20425();
		this.method20718(arg0, arg1);
		if (!this.aBoolean96) {
			this.aClass100_4 = this.method20496(arg0, arg1, true, true);
			this.aClass112_Sub1_1 = this.method20444();
			this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
			return;
		}
		this.aClass100_4 = this.method20496(arg0, arg1, true, true);
		this.aClass112_Sub1_1 = this.method20444();
		this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
		OpenGL.glGenBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray42[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "un", descriptor = "(II)V", line = 862)
	void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20425();
		this.method20718(arg0, arg1);
		if (!this.aBoolean96) {
			this.aClass100_4 = this.method20496(arg0, arg1, true, true);
			this.aClass112_Sub1_1 = this.method20444();
			this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
			return;
		}
		this.aClass100_4 = this.method20496(arg0, arg1, true, true);
		this.aClass112_Sub1_1 = this.method20444();
		this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
		OpenGL.glGenBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray42[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uo", descriptor = "(II)V", line = 862)
	void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20425();
		this.method20718(arg0, arg1);
		if (!this.aBoolean96) {
			this.aClass100_4 = this.method20496(arg0, arg1, true, true);
			this.aClass112_Sub1_1 = this.method20444();
			this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
			return;
		}
		this.aClass100_4 = this.method20496(arg0, arg1, true, true);
		this.aClass112_Sub1_1 = this.method20444();
		this.aClass112_Sub1_1.method23434(0, this.aClass100_4.method18167());
		OpenGL.glGenBuffersARB(3, this.anIntArray42, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray42[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "bm", descriptor = "(II)V", line = 883)
	@Override
	public void method20774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method3816(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afa", name = "ir", descriptor = "(II)V", line = 883)
	@Override
	public void method20649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method3816(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!afa", name = "bz", descriptor = "(IIIIII)V", line = 897)
	@Override
	public void method20478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3798();
		this.method3818(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afa", name = "it", descriptor = "(IIIIII)V", line = 897)
	@Override
	public void method20650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3798();
		this.method3818(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ix", descriptor = "(IIIIII)V", line = 915)
	@Override
	public void method20676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3798();
		this.method3818(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afa", name = "bv", descriptor = "(IIIIII)V", line = 915)
	@Override
	public void method20653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3798();
		this.method3818(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!afa", name = "br", descriptor = "(IIFIIFIIFIIII)V", line = 933)
	@Override
	public void method20851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method3798();
		this.method3818(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "np", descriptor = "(IIFIIFIIFIIII)V", line = 933)
	@Override
	public void method20777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method3798();
		this.method3818(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "bg", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt550 || arg0 - arg2 > this.anInt551 || arg1 + arg2 < this.anInt548 || arg1 - arg2 > this.anInt549) {
			return;
		}
		this.method3798();
		this.method3818(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat48) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat47) {
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
			local132 = Class278.method26365(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class207.aFloatArray94[local157] * (float) arg2, local59 + Class207.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afa", name = "iw", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt550 || arg0 - arg2 > this.anInt551 || arg1 + arg2 < this.anInt548 || arg1 - arg2 > this.anInt549) {
			return;
		}
		this.method3798();
		this.method3818(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat48) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat47) {
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
			local132 = Class278.method26365(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class207.aFloatArray94[local157] * (float) arg2, local59 + Class207.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afa", name = "is", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt550 || arg0 - arg2 > this.anInt551 || arg1 + arg2 < this.anInt548 || arg1 - arg2 > this.anInt549) {
			return;
		}
		this.method3798();
		this.method3818(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat48) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat47) {
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
			local132 = Class278.method26365(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class207.aFloatArray94[local157] * (float) arg2, local59 + Class207.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ib", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt550 || arg0 - arg2 > this.anInt551 || arg1 + arg2 < this.anInt548 || arg1 - arg2 > this.anInt549) {
			return;
		}
		this.method3798();
		this.method3818(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat48) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat47) {
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
			local132 = Class278.method26365(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class207.aFloatArray94[local157] * (float) arg2, local59 + Class207.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afa", name = "il", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt550 || arg0 - arg2 > this.anInt551 || arg1 + arg2 < this.anInt548 || arg1 - arg2 > this.anInt549) {
			return;
		}
		this.method3798();
		this.method3818(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat48) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat47) {
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
			local132 = Class278.method26365(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class207.aFloatArray94[local157] * (float) arg2, local59 + Class207.aFloatArray95[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ba", descriptor = "(IIIII)V", line = 988)
	@Override
	void method20732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "id", descriptor = "(IIIII)V", line = 988)
	@Override
	void method20657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "ip", descriptor = "(IIIII)V", line = 988)
	@Override
	void method20656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "bp", descriptor = "(IIIII)V", line = 1000)
	@Override
	void method20438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "if", descriptor = "(IIIII)V", line = 1000)
	@Override
	void method20547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "ia", descriptor = "(IIIII)V", line = 1000)
	@Override
	void method20803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3798();
		this.method3818(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!afa", name = "ih", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "iy", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "iz", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "bj", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "ii", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "cl", descriptor = "(IIIIIIIII)V", line = 1032)
	@Override
	public void method20486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "nu", descriptor = "(IIIIIIIII)V", line = 1032)
	@Override
	public void method20489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "nr", descriptor = "(IIIIIIIII)V", line = 1032)
	@Override
	public void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method3798();
		this.method3818(arg5);
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

	@OriginalMember(owner = "client!afa", name = "ik", descriptor = "(IIIIIILclient!ch;II)V", line = 1089)
	@Override
	public void method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg6;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "im", descriptor = "(IIIIIILclient!ch;II)V", line = 1089)
	@Override
	public void method20665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg6;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "bs", descriptor = "(IIIIIILclient!ch;II)V", line = 1089)
	@Override
	public void method20482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg6;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "cg", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1114)
	@Override
	public void method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class96_Sub1 local9 = (Class96_Sub1) arg6;
		@Pc(12) Class88_Sub2_Sub1 local12 = local9.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local9.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2547;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "jd", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1114)
	@Override
	public void method20667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class96_Sub1 local9 = (Class96_Sub1) arg6;
		@Pc(12) Class88_Sub2_Sub1 local12 = local9.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local9.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2547;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "ic", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1114)
	@Override
	public void method20666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class96_Sub1 local9 = (Class96_Sub1) arg6;
		@Pc(12) Class88_Sub2_Sub1 local12 = local9.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local9.aClass88_Sub2_Sub1_1);
		this.method3818(arg5);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat164 / (float) local12.anInt2547;
		@Pc(44) float local44 = local12.aFloat163 / (float) local12.anInt2548;
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
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "ce", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20484(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afa", name = "nz", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20484(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afa", name = "ns", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20484(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afa", name = "nf", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20484(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!afa", name = "ev", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20824(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat35 + this.aFloat33 * local59 / local29;
		arg3[1] = this.aFloat36 + this.aFloat34 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "na", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat35 + this.aFloat33 * local59 / local29;
		arg3[1] = this.aFloat36 + this.aFloat34 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "ni", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20554(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat35 + this.aFloat33 * local59 / local29;
		arg3[1] = this.aFloat36 + this.aFloat34 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "nb", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat35 + this.aFloat33 * local59 / local29;
		arg3[1] = this.aFloat36 + this.aFloat34 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "nw", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20781(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat35 + this.aFloat33 * local59 / local29;
		arg3[1] = this.aFloat36 + this.aFloat34 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afa", name = "ep", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * arg0 + this.aClass489_9.aFloatArray116[6] * arg1 + this.aClass489_9.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat35 + this.aFloat33 * local115 / local59;
			arg3[1] = this.aFloat36 + this.aFloat34 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "nl", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20783(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * arg0 + this.aClass489_9.aFloatArray116[6] * arg1 + this.aClass489_9.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat35 + this.aFloat33 * local115 / local59;
			arg3[1] = this.aFloat36 + this.aFloat34 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "nx", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * arg0 + this.aClass489_9.aFloatArray116[6] * arg1 + this.aClass489_9.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * arg0 + this.aClass489_9.aFloatArray116[7] * arg1 + this.aClass489_9.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * arg0 + this.aClass489_9.aFloatArray116[4] * arg1 + this.aClass489_9.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * arg0 + this.aClass489_9.aFloatArray116[5] * arg1 + this.aClass489_9.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_3.aFloatArray116[14] + this.aClass489_3.aFloatArray116[2] * arg0 + this.aClass489_3.aFloatArray116[6] * arg1 + this.aClass489_3.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat35 + this.aFloat33 * local115 / local59;
			arg3[1] = this.aFloat36 + this.aFloat34 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afa", name = "cu", descriptor = "(IIIIII)I", line = 1232)
	@Override
	public int method20647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * (float) arg0 + this.aClass489_9.aFloatArray116[6] * (float) arg1 + this.aClass489_9.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * (float) arg3 + this.aClass489_9.aFloatArray116[6] * (float) arg4 + this.aClass489_9.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * (float) arg0 + this.aClass489_9.aFloatArray116[7] * (float) arg1 + this.aClass489_9.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * (float) arg3 + this.aClass489_9.aFloatArray116[7] * (float) arg4 + this.aClass489_9.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * (float) arg0 + this.aClass489_9.aFloatArray116[4] * (float) arg1 + this.aClass489_9.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * (float) arg3 + this.aClass489_9.aFloatArray116[4] * (float) arg4 + this.aClass489_9.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * (float) arg0 + this.aClass489_9.aFloatArray116[5] * (float) arg1 + this.aClass489_9.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * (float) arg3 + this.aClass489_9.aFloatArray116[5] * (float) arg4 + this.aClass489_9.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "jf", descriptor = "(IIIIII)I", line = 1232)
	@Override
	public int method20832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * (float) arg0 + this.aClass489_9.aFloatArray116[6] * (float) arg1 + this.aClass489_9.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_9.aFloatArray116[14] + this.aClass489_9.aFloatArray116[2] * (float) arg3 + this.aClass489_9.aFloatArray116[6] * (float) arg4 + this.aClass489_9.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * (float) arg0 + this.aClass489_9.aFloatArray116[7] * (float) arg1 + this.aClass489_9.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_9.aFloatArray116[15] + this.aClass489_9.aFloatArray116[3] * (float) arg3 + this.aClass489_9.aFloatArray116[7] * (float) arg4 + this.aClass489_9.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * (float) arg0 + this.aClass489_9.aFloatArray116[4] * (float) arg1 + this.aClass489_9.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_9.aFloatArray116[12] + this.aClass489_9.aFloatArray116[0] * (float) arg3 + this.aClass489_9.aFloatArray116[4] * (float) arg4 + this.aClass489_9.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * (float) arg0 + this.aClass489_9.aFloatArray116[5] * (float) arg1 + this.aClass489_9.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_9.aFloatArray116[13] + this.aClass489_9.aFloatArray116[1] * (float) arg3 + this.aClass489_9.aFloatArray116[5] * (float) arg4 + this.aClass489_9.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afa", name = "cn", descriptor = "(IIIILclient!ou;Lclient!oj;)Z", line = 1251)
	@Override
	boolean method20427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_6;
		local2.method29842(arg4);
		local2.method29953(this.aClass489_9);
		return arg5.method29280(arg0, arg1, arg2, arg3, local2, this.aFloat35, this.aFloat36, this.aFloat33, this.aFloat34);
	}

	@OriginalMember(owner = "client!afa", name = "ju", descriptor = "(IIIILclient!ou;Lclient!oj;)Z", line = 1251)
	@Override
	boolean method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_6;
		local2.method29842(arg4);
		local2.method29953(this.aClass489_9);
		return arg5.method29280(arg0, arg1, arg2, arg3, local2, this.aFloat35, this.aFloat36, this.aFloat33, this.aFloat34);
	}

	@OriginalMember(owner = "client!afa", name = "cv", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V", line = 1258)
	@Override
	public void method20492(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_6;
		local2.method29842(arg0);
		local2.method29953(this.aClass489_9);
		arg1.method25880(arg2, this.aClass489_8, local2, this.aFloat35, this.aFloat36, this.aFloat33, this.aFloat34);
	}

	@OriginalMember(owner = "client!afa", name = "jy", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V", line = 1258)
	@Override
	public void method20862(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_6;
		local2.method29842(arg0);
		local2.method29953(this.aClass489_9);
		arg1.method25880(arg2, this.aClass489_8, local2, this.aFloat35, this.aFloat36, this.aFloat33, this.aFloat34);
	}

	@OriginalMember(owner = "client!afa", name = "nc", descriptor = "(I)Lclient!akz;", line = 1265)
	@Override
	public Class93_Sub35 method20530(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub2 local4 = new Class93_Sub35_Sub2(arg0);
		this.aClass22_12.method407(local4);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "cp", descriptor = "(I)Lclient!akz;", line = 1265)
	@Override
	public Class93_Sub35 method20520(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub2 local4 = new Class93_Sub35_Sub2(arg0);
		this.aClass22_12.method407(local4);
		return local4;
	}

	@OriginalMember(owner = "client!afa", name = "ca", descriptor = "(Lclient!akz;)V", line = 1271)
	@Override
	public void method20494(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap1 = ((Class93_Sub35_Sub2) arg0).aNativeHeap5;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) Class93_Sub41_Sub1 local12 = new Class93_Sub41_Sub1(80);
		if (this.aBoolean106) {
			local12.method22322(-1.0F);
			local12.method22322(-1.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(-1.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(-1.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
		} else {
			local12.method22325(-1.0F);
			local12.method22325(-1.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(-1.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(-1.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
		}
		this.anInterface14_3 = this.method3794(20, local12.aByteArray58, local12.anInt3070 * 212851357, false);
		this.aClass193_5 = new Class193(this.anInterface14_3, 5126, 3, 0);
		this.aClass193_6 = new Class193(this.anInterface14_3, 5126, 2, 12);
		this.aClass214_1.method25459(this);
	}

	@OriginalMember(owner = "client!afa", name = "jl", descriptor = "(Lclient!akz;)V", line = 1271)
	@Override
	public void method20671(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap1 = ((Class93_Sub35_Sub2) arg0).aNativeHeap5;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) Class93_Sub41_Sub1 local12 = new Class93_Sub41_Sub1(80);
		if (this.aBoolean106) {
			local12.method22322(-1.0F);
			local12.method22322(-1.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(-1.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(1.0F);
			local12.method22322(-1.0F);
			local12.method22322(0.0F);
			local12.method22322(1.0F);
			local12.method22322(0.0F);
		} else {
			local12.method22325(-1.0F);
			local12.method22325(-1.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(-1.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(1.0F);
			local12.method22325(-1.0F);
			local12.method22325(0.0F);
			local12.method22325(1.0F);
			local12.method22325(0.0F);
		}
		this.anInterface14_3 = this.method3794(20, local12.aByteArray58, local12.anInt3070 * 212851357, false);
		this.aClass193_5 = new Class193(this.anInterface14_3, 5126, 3, 0);
		this.aClass193_6 = new Class193(this.anInterface14_3, 5126, 2, 12);
		this.aClass214_1.method25459(this);
	}

	@OriginalMember(owner = "client!afa", name = "je", descriptor = "(IIZZ)Lclient!cm;", line = 1326)
	@Override
	public Class100 method20468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jn", descriptor = "(IIZZ)Lclient!cm;", line = 1326)
	@Override
	public Class100 method20672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "cw", descriptor = "(IIZZ)Lclient!cm;", line = 1326)
	@Override
	public Class100 method20496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "co", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 1330)
	@Override
	public Class100 method20499(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method7171(false);
		@Pc(15) Class100 local15 = this.method20498(local3, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		local15.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local15;
	}

	@OriginalMember(owner = "client!afa", name = "nv", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 1330)
	@Override
	public Class100 method20796(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method7171(false);
		@Pc(15) Class100 local15 = this.method20498(local3, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		local15.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local15;
	}

	@OriginalMember(owner = "client!afa", name = "nh", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 1330)
	@Override
	public Class100 method20780(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method7171(false);
		@Pc(15) Class100 local15 = this.method20498(local3, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		local15.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local15;
	}

	@OriginalMember(owner = "client!afa", name = "ct", descriptor = "([IIIIIZ)Lclient!cm;", line = 1337)
	@Override
	public Class100 method20487(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jb", descriptor = "([IIIIIZ)Lclient!cm;", line = 1337)
	@Override
	public Class100 method20527(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "cr", descriptor = "(IIIIZ)Lclient!cm;", line = 1341)
	@Override
	public Class100 method20613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class100_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jw", descriptor = "(IIIIZ)Lclient!cm;", line = 1341)
	@Override
	public Class100 method20446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class100_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jm", descriptor = "(IIIIZ)Lclient!cm;", line = 1341)
	@Override
	public Class100 method20675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class100_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "js", descriptor = "(II[I[I)Lclient!ch;", line = 1345)
	@Override
	public Class96 method20447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub1.method1812(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "cb", descriptor = "(II[I[I)Lclient!ch;", line = 1345)
	@Override
	public Class96 method20504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub1.method1812(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jr", descriptor = "(II[I[I)Lclient!ch;", line = 1345)
	@Override
	public Class96 method20524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub1.method1812(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "ji", descriptor = "(II[I[I)Lclient!ch;", line = 1345)
	@Override
	public Class96 method20679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub1.method1812(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afa", name = "jj", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20684(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "cs", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20505(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "jt", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20680(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "jq", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20681(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "jv", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20682(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "ja", descriptor = "(ILclient!ch;II)V", line = 1349)
	@Override
	public void method20595(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg1;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.method3799();
		this.method3804(local2.aClass88_Sub2_Sub1_1);
		this.method3818(1);
		this.method3837(7681, 8448);
		this.method3807(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(37) float local37 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt548);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt550 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt550, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt549 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt549);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt551 - arg2), local37 * (float) (this.anInt548 - arg3));
		OpenGL.glVertex2i(this.anInt551, this.anInt548);
		OpenGL.glEnd();
		this.method3807(0, 5890, 768);
	}

	@OriginalMember(owner = "client!afa", name = "cy", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 1373)
	@Override
	public Class106 method20506(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jz", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 1373)
	@Override
	public Class106 method20509(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jc", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 1373)
	@Override
	public Class106 method20687(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jo", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 1373)
	@Override
	public Class106 method20772(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "jg", descriptor = "(I)V", line = 1376)
	@Override
	public void method20688(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "jx", descriptor = "(I)V", line = 1376)
	@Override
	public void method20594(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "jh", descriptor = "(I)V", line = 1376)
	@Override
	public void method20779(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "jp", descriptor = "(I)V", line = 1376)
	@Override
	public void method20674(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "jk", descriptor = "(I)V", line = 1376)
	@Override
	public void method20692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "ck", descriptor = "(I)V", line = 1376)
	@Override
	public void method20831(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "cj", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 1379)
	@Override
	public Class109 method20510(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "kw", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 1379)
	@Override
	public Class109 method20786(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "kz", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 1379)
	@Override
	public Class109 method20729(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ke", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 1379)
	@Override
	public Class109 method20695(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "cd", descriptor = "(II)I", line = 1383)
	@Override
	public int method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afa", name = "kq", descriptor = "(II)I", line = 1383)
	@Override
	public int method20583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afa", name = "dd", descriptor = "(II)I", line = 1387)
	@Override
	public int method20512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "kg", descriptor = "(II)I", line = 1387)
	@Override
	public int method20869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afa", name = "dr", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 1391)
	@Override
	public Class99 method20513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "ko", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 1391)
	@Override
	public Class99 method20699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "kf", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 1391)
	@Override
	public Class99 method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "kx", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 1391)
	@Override
	public Class99 method20791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "ku", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 1391)
	@Override
	public Class99 method20698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "ki", descriptor = "()Lclient!pq;", line = 1395)
	@Override
	public Class489 method20632() {
		return this.aClass489_2;
	}

	@OriginalMember(owner = "client!afa", name = "cc", descriptor = "()Lclient!pq;", line = 1395)
	@Override
	public Class489 method20507() {
		return this.aClass489_2;
	}

	@OriginalMember(owner = "client!afa", name = "ks", descriptor = "()Lclient!pq;", line = 1395)
	@Override
	public Class489 method20618() {
		return this.aClass489_2;
	}

	@OriginalMember(owner = "client!afa", name = "cz", descriptor = "()Lclient!ou;", line = 1399)
	@Override
	public Class470 method20508() {
		return this.aClass470_1;
	}

	@OriginalMember(owner = "client!afa", name = "kl", descriptor = "()Lclient!ou;", line = 1399)
	@Override
	public Class470 method20706() {
		return this.aClass470_1;
	}

	@OriginalMember(owner = "client!afa", name = "kh", descriptor = "()Lclient!ou;", line = 1399)
	@Override
	public Class470 method20704() {
		return this.aClass470_1;
	}

	@OriginalMember(owner = "client!afa", name = "ka", descriptor = "()Lclient!ou;", line = 1399)
	@Override
	public Class470 method20705() {
		return this.aClass470_1;
	}

	@OriginalMember(owner = "client!afa", name = "dt", descriptor = "(Lclient!dm;)V", line = 1403)
	@Override
	public void method20497(@OriginalArg(0) Class229 arg0) {
		this.aClass214_1.method25460(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "ky", descriptor = "(Lclient!dm;)V", line = 1403)
	@Override
	public void method20715(@OriginalArg(0) Class229 arg0) {
		this.aClass214_1.method25460(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "km", descriptor = "(Lclient!dm;)V", line = 1403)
	@Override
	public void method20714(@OriginalArg(0) Class229 arg0) {
		this.aClass214_1.method25460(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "oo", descriptor = "(ILclient!dy;)V", line = 1407)
	@Override
	public void method20525(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		this.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!afa", name = "oh", descriptor = "(ILclient!dy;)V", line = 1407)
	@Override
	public void method20798(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		this.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!afa", name = "ei", descriptor = "(ILclient!dy;)V", line = 1407)
	@Override
	public void method20544(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		this.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!afa", name = "el", descriptor = "(ILclient!dy;)V", line = 1413)
	@Override
	public void method20545(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean72) {
			throw new RuntimeException("");
		}
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
			this.aClass197_1.aClass97_Sub5_1.method2638();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ny", descriptor = "(ILclient!dy;)V", line = 1413)
	@Override
	public void method20722(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean72) {
			throw new RuntimeException("");
		}
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
			this.aClass197_1.aClass97_Sub5_1.method2638();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ne", descriptor = "(ILclient!dy;)V", line = 1413)
	@Override
	public void method20605(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean72) {
			throw new RuntimeException("");
		}
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
			this.aClass197_1.aClass97_Sub5_1.method2638();
		}
	}

	@OriginalMember(owner = "client!afa", name = "nd", descriptor = "(ILclient!dy;)V", line = 1413)
	@Override
	public void method20771(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean72) {
			throw new RuntimeException("");
		}
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
			this.aClass197_1.aClass97_Sub5_1.method2638();
		}
	}

	@OriginalMember(owner = "client!afa", name = "nm", descriptor = "(ILclient!dy;)V", line = 1413)
	@Override
	public void method20609(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean72) {
			throw new RuntimeException("");
		}
		this.anInt581 = arg0;
		this.aClass237_1 = arg1;
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
			this.aClass197_1.aClass97_Sub5_1.method2638();
		}
	}

	@OriginalMember(owner = "client!afa", name = "no", descriptor = "()V", line = 1423)
	@Override
	public void method20776() {
		this.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!afa", name = "nj", descriptor = "()V", line = 1423)
	@Override
	public void method20453() {
		this.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!afa", name = "ej", descriptor = "()V", line = 1423)
	@Override
	public void method20546() {
		this.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!afa", name = "bk", descriptor = "()V", line = 1427)
	@Override
	public void method20562() {
		this.anInt539 = 0;
		this.anInt555 = 0;
		this.anInt554 = this.aClass112_6.method23736();
		this.anInt557 = this.aClass112_6.method23737();
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "he", descriptor = "()V", line = 1427)
	@Override
	public void method20631() {
		this.anInt539 = 0;
		this.anInt555 = 0;
		this.anInt554 = this.aClass112_6.method23736();
		this.anInt557 = this.aClass112_6.method23737();
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "hi", descriptor = "()V", line = 1427)
	@Override
	public void method20633() {
		this.anInt539 = 0;
		this.anInt555 = 0;
		this.anInt554 = this.aClass112_6.method23736();
		this.anInt557 = this.aClass112_6.method23737();
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "hw", descriptor = "()V", line = 1427)
	@Override
	public void method20634() {
		this.anInt539 = 0;
		this.anInt555 = 0;
		this.anInt554 = this.aClass112_6.method23736();
		this.anInt557 = this.aClass112_6.method23737();
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "hn", descriptor = "()V", line = 1427)
	@Override
	public void method20840() {
		this.anInt539 = 0;
		this.anInt555 = 0;
		this.anInt554 = this.aClass112_6.method23736();
		this.anInt557 = this.aClass112_6.method23737();
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "bh", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt539 = arg0;
		this.anInt555 = arg1;
		this.anInt554 = arg2;
		this.anInt557 = arg3;
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "hc", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt539 = arg0;
		this.anInt555 = arg1;
		this.anInt554 = arg2;
		this.anInt557 = arg3;
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "ht", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt539 = arg0;
		this.anInt555 = arg1;
		this.anInt554 = arg2;
		this.anInt557 = arg3;
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "ho", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt539 = arg0;
		this.anInt555 = arg1;
		this.anInt554 = arg2;
		this.anInt557 = arg3;
		this.method3964();
	}

	@OriginalMember(owner = "client!afa", name = "bx", descriptor = "([I)V", line = 1443)
	@Override
	public void method20625(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt539;
		arg0[1] = this.anInt555;
		arg0[2] = this.anInt554;
		arg0[3] = this.anInt557;
	}

	@OriginalMember(owner = "client!afa", name = "hj", descriptor = "([I)V", line = 1443)
	@Override
	public void method20639(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt539;
		arg0[1] = this.anInt555;
		arg0[2] = this.anInt554;
		arg0[3] = this.anInt557;
	}

	@OriginalMember(owner = "client!afa", name = "hv", descriptor = "([I)V", line = 1443)
	@Override
	public void method20702(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt539;
		arg0[1] = this.anInt555;
		arg0[2] = this.anInt554;
		arg0[3] = this.anInt557;
	}

	@OriginalMember(owner = "client!afa", name = "hz", descriptor = "([I)V", line = 1443)
	@Override
	public void method20640(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt539;
		arg0[1] = this.anInt555;
		arg0[2] = this.anInt554;
		arg0[3] = this.anInt557;
	}

	@OriginalMember(owner = "client!afa", name = "bd", descriptor = "(FF)V", line = 1450)
	@Override
	public void method20638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat37 = arg0;
		this.aFloat31 = arg1;
		this.method3951();
	}

	@OriginalMember(owner = "client!afa", name = "ij", descriptor = "(FF)V", line = 1450)
	@Override
	public void method20641(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat37 = arg0;
		this.aFloat31 = arg1;
		this.method3951();
	}

	@OriginalMember(owner = "client!afa", name = "in", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20648(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt550;
		arg0[1] = this.anInt548;
		arg0[2] = this.anInt551;
		arg0[3] = this.anInt549;
	}

	@OriginalMember(owner = "client!afa", name = "iu", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20579(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt550;
		arg0[1] = this.anInt548;
		arg0[2] = this.anInt551;
		arg0[3] = this.anInt549;
	}

	@OriginalMember(owner = "client!afa", name = "bq", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20470(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt550;
		arg0[1] = this.anInt548;
		arg0[2] = this.anInt551;
		arg0[3] = this.anInt549;
	}

	@OriginalMember(owner = "client!afa", name = "bc", descriptor = "()V", line = 1463)
	@Override
	public final void method20466() {
		if (this.aClass112_6 == null) {
			return;
		}
		this.anInt550 = 0;
		this.anInt548 = 0;
		this.anInt551 = this.aClass112_6.method23736();
		this.anInt549 = this.aClass112_6.method23737();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afa", name = "io", descriptor = "()V", line = 1463)
	@Override
	public final void method20658() {
		if (this.aClass112_6 == null) {
			return;
		}
		this.anInt550 = 0;
		this.anInt548 = 0;
		this.anInt551 = this.aClass112_6.method23736();
		this.anInt549 = this.aClass112_6.method23737();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afa", name = "iq", descriptor = "()V", line = 1463)
	@Override
	public final void method20643() {
		if (this.aClass112_6 == null) {
			return;
		}
		this.anInt550 = 0;
		this.anInt548 = 0;
		this.anInt551 = this.aClass112_6.method23736();
		this.anInt549 = this.aClass112_6.method23737();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afa", name = "iv", descriptor = "()V", line = 1463)
	@Override
	public final void method20645() {
		if (this.aClass112_6 == null) {
			return;
		}
		this.anInt550 = 0;
		this.anInt548 = 0;
		this.anInt551 = this.aClass112_6.method23736();
		this.anInt549 = this.aClass112_6.method23737();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afa", name = "ig", descriptor = "()V", line = 1463)
	@Override
	public final void method20874() {
		if (this.aClass112_6 == null) {
			return;
		}
		this.anInt550 = 0;
		this.anInt548 = 0;
		this.anInt551 = this.aClass112_6.method23736();
		this.anInt549 = this.aClass112_6.method23737();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!afa", name = "bi", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "oq", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "ol", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "oi", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "ot", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "ow", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass112_6.method23736()) {
			arg2 = this.aClass112_6.method23736();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass112_6.method23737()) {
			arg3 = this.aClass112_6.method23737();
		}
		this.anInt550 = arg0;
		this.anInt548 = arg1;
		this.anInt551 = arg2;
		this.anInt549 = arg3;
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "ie", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt550 < arg0) {
			this.anInt550 = arg0;
		}
		if (this.anInt551 > arg2) {
			this.anInt551 = arg2;
		}
		if (this.anInt548 < arg1) {
			this.anInt548 = arg1;
		}
		if (this.anInt549 > arg3) {
			this.anInt549 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "bn", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt550 < arg0) {
			this.anInt550 = arg0;
		}
		if (this.anInt551 > arg2) {
			this.anInt551 = arg2;
		}
		if (this.anInt548 < arg1) {
			this.anInt548 = arg1;
		}
		if (this.anInt549 > arg3) {
			this.anInt549 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "ue", descriptor = "(II)V", line = 1495)
	final void method3871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt529 = arg0;
		this.anInt553 = arg1;
		this.method3964();
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "vq", descriptor = "(II)V", line = 1495)
	final void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt529 = arg0;
		this.anInt553 = arg1;
		this.method3964();
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "vx", descriptor = "(II)V", line = 1495)
	final void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt529 = arg0;
		this.anInt553 = arg1;
		this.method3964();
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "rl", descriptor = "(II)V", line = 1495)
	final void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt529 = arg0;
		this.anInt553 = arg1;
		this.method3964();
		this.method3770();
	}

	@OriginalMember(owner = "client!afa", name = "vb", descriptor = "()V", line = 1502)
	final void method3874() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt546 == 2) {
			local9 = this.anInt539;
			local12 = this.anInt555;
			local15 = this.anInt554;
			local18 = this.anInt557;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass112_6.method23736();
			local18 = this.aClass112_6.method23737();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt529 + local9, this.anInt553 + this.aClass112_6.method23737() - local12 - local18, local15, local18);
		this.aFloat33 = (float) this.anInt554 / 2.0F;
		this.aFloat34 = (float) this.anInt557 / 2.0F;
		this.aFloat35 = (float) this.anInt539 + this.aFloat33;
		this.aFloat36 = (float) this.anInt555 + this.aFloat34;
	}

	@OriginalMember(owner = "client!afa", name = "vl", descriptor = "()V", line = 1502)
	final void method3875() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt546 == 2) {
			local9 = this.anInt539;
			local12 = this.anInt555;
			local15 = this.anInt554;
			local18 = this.anInt557;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass112_6.method23736();
			local18 = this.aClass112_6.method23737();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt529 + local9, this.anInt553 + this.aClass112_6.method23737() - local12 - local18, local15, local18);
		this.aFloat33 = (float) this.anInt554 / 2.0F;
		this.aFloat34 = (float) this.anInt557 / 2.0F;
		this.aFloat35 = (float) this.anInt539 + this.aFloat33;
		this.aFloat36 = (float) this.anInt555 + this.aFloat34;
	}

	@OriginalMember(owner = "client!afa", name = "vr", descriptor = "()V", line = 1502)
	final void method3876() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt546 == 2) {
			local9 = this.anInt539;
			local12 = this.anInt555;
			local15 = this.anInt554;
			local18 = this.anInt557;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass112_6.method23736();
			local18 = this.aClass112_6.method23737();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt529 + local9, this.anInt553 + this.aClass112_6.method23737() - local12 - local18, local15, local18);
		this.aFloat33 = (float) this.anInt554 / 2.0F;
		this.aFloat34 = (float) this.anInt557 / 2.0F;
		this.aFloat35 = (float) this.anInt539 + this.aFloat33;
		this.aFloat36 = (float) this.anInt555 + this.aFloat34;
	}

	@OriginalMember(owner = "client!afa", name = "rc", descriptor = "()V", line = 1502)
	final void method3964() {
		if (this.aClass112_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt546 == 2) {
			local9 = this.anInt539;
			local12 = this.anInt555;
			local15 = this.anInt554;
			local18 = this.anInt557;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass112_6.method23736();
			local18 = this.aClass112_6.method23737();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt529 + local9, this.anInt553 + this.aClass112_6.method23737() - local12 - local18, local15, local18);
		this.aFloat33 = (float) this.anInt554 / 2.0F;
		this.aFloat34 = (float) this.anInt557 / 2.0F;
		this.aFloat35 = (float) this.anInt539 + this.aFloat33;
		this.aFloat36 = (float) this.anInt555 + this.aFloat34;
	}

	@OriginalMember(owner = "client!afa", name = "vw", descriptor = "()V", line = 1530)
	final void method3827() {
		if (this.anInt546 == 2) {
			OpenGL.glDepthRange(this.aFloat37, this.aFloat31);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vv", descriptor = "()V", line = 1530)
	final void method3877() {
		if (this.anInt546 == 2) {
			OpenGL.glDepthRange(this.aFloat37, this.aFloat31);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vo", descriptor = "()V", line = 1530)
	final void method3894() {
		if (this.anInt546 == 2) {
			OpenGL.glDepthRange(this.aFloat37, this.aFloat31);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afa", name = "rr", descriptor = "()V", line = 1530)
	final void method3951() {
		if (this.anInt546 == 2) {
			OpenGL.glDepthRange(this.aFloat37, this.aFloat31);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vu", descriptor = "()V", line = 1535)
	final void method3759() {
		if (this.aClass112_6 == null || this.anInt550 >= this.anInt551 || this.anInt548 >= this.anInt549) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt529 + this.anInt550, this.anInt553 + this.aClass112_6.method23737() - this.anInt549, this.anInt551 - this.anInt550, this.anInt549 - this.anInt548);
		}
	}

	@OriginalMember(owner = "client!afa", name = "rd", descriptor = "()V", line = 1535)
	final void method3770() {
		if (this.aClass112_6 == null || this.anInt550 >= this.anInt551 || this.anInt548 >= this.anInt549) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt529 + this.anInt550, this.anInt553 + this.aClass112_6.method23737() - this.anInt549, this.anInt551 - this.anInt550, this.anInt549 - this.anInt548);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vt", descriptor = "()V", line = 1535)
	final void method3879() {
		if (this.aClass112_6 == null || this.anInt550 >= this.anInt551 || this.anInt548 >= this.anInt549) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt529 + this.anInt550, this.anInt553 + this.aClass112_6.method23737() - this.anInt549, this.anInt551 - this.anInt550, this.anInt549 - this.anInt548);
		}
	}

	@OriginalMember(owner = "client!afa", name = "rn", descriptor = "()V", line = 1542)
	final void method3771() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "vi", descriptor = "()V", line = 1542)
	final void method3880() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "va", descriptor = "()V", line = 1542)
	final void method3881() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "vs", descriptor = "()V", line = 1542)
	final void method3882() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "rb", descriptor = "(Lclient!pq;)V", line = 1546)
	final void method3845(@OriginalArg(0) Class489 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!afa", name = "vy", descriptor = "(Lclient!pq;)V", line = 1546)
	final void method3850(@OriginalArg(0) Class489 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!afa", name = "ve", descriptor = "(Lclient!pq;)V", line = 1551)
	final void method3883(@OriginalArg(0) Class489 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!afa", name = "ru", descriptor = "(Lclient!pq;)V", line = 1551)
	final void method3955(@OriginalArg(0) Class489 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray116, 0);
	}

	@OriginalMember(owner = "client!afa", name = "sv", descriptor = "()V", line = 1555)
	final void method3772() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "vm", descriptor = "()V", line = 1555)
	final void method3884() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!afa", name = "do", descriptor = "(Lclient!ou;)V", line = 1559)
	@Override
	public final void method20516(@OriginalArg(0) Class470 arg0) {
		this.aClass470_2.method29364(arg0);
		this.aClass489_3.method29842(this.aClass470_2);
		this.aClass470_3.method29364(arg0);
		this.aClass470_3.method29372();
		this.aClass489_4.method29842(this.aClass470_3);
		this.method3779();
		if (this.anInt546 != 1) {
			this.method3868();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kk", descriptor = "(Lclient!ou;)V", line = 1559)
	@Override
	public final void method20716(@OriginalArg(0) Class470 arg0) {
		this.aClass470_2.method29364(arg0);
		this.aClass489_3.method29842(this.aClass470_2);
		this.aClass470_3.method29364(arg0);
		this.aClass470_3.method29372();
		this.aClass489_4.method29842(this.aClass470_3);
		this.method3779();
		if (this.anInt546 != 1) {
			this.method3868();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kv", descriptor = "(Lclient!ou;)V", line = 1559)
	@Override
	public final void method20717(@OriginalArg(0) Class470 arg0) {
		this.aClass470_2.method29364(arg0);
		this.aClass489_3.method29842(this.aClass470_2);
		this.aClass470_3.method29364(arg0);
		this.aClass470_3.method29372();
		this.aClass489_4.method29842(this.aClass470_3);
		this.method3779();
		if (this.anInt546 != 1) {
			this.method3868();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kt", descriptor = "(Lclient!ou;)V", line = 1559)
	@Override
	public final void method20814(@OriginalArg(0) Class470 arg0) {
		this.aClass470_2.method29364(arg0);
		this.aClass489_3.method29842(this.aClass470_2);
		this.aClass470_3.method29364(arg0);
		this.aClass470_3.method29372();
		this.aClass489_4.method29842(this.aClass470_3);
		this.method3779();
		if (this.anInt546 != 1) {
			this.method3868();
		}
	}

	@OriginalMember(owner = "client!afa", name = "dz", descriptor = "()Lclient!ou;", line = 1569)
	@Override
	public Class470 method20517() {
		return new Class470(this.aClass470_2);
	}

	@OriginalMember(owner = "client!afa", name = "li", descriptor = "()Lclient!ou;", line = 1569)
	@Override
	public Class470 method20719() {
		return new Class470(this.aClass470_2);
	}

	@OriginalMember(owner = "client!afa", name = "sw", descriptor = "()V", line = 1573)
	final void method3868() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass489_3.aFloatArray116, 0);
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
		}
		this.method3785();
		this.method3769();
	}

	@OriginalMember(owner = "client!afa", name = "vg", descriptor = "()V", line = 1573)
	final void method3885() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass489_3.aFloatArray116, 0);
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
		}
		this.method3785();
		this.method3769();
	}

	@OriginalMember(owner = "client!afa", name = "vp", descriptor = "()V", line = 1573)
	final void method3886() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass489_3.aFloatArray116, 0);
		if (this.aBoolean86) {
			this.aClass197_1.aClass97_Sub5_1.method2637();
		}
		this.method3785();
		this.method3769();
	}

	@OriginalMember(owner = "client!afa", name = "dm", descriptor = "(Lclient!pq;)V", line = 1581)
	@Override
	public final void method20519(@OriginalArg(0) Class489 arg0) {
		this.aClass489_8.method29837(arg0);
		this.method3779();
		this.method3778();
	}

	@OriginalMember(owner = "client!afa", name = "lv", descriptor = "(Lclient!pq;)V", line = 1581)
	@Override
	public final void method20720(@OriginalArg(0) Class489 arg0) {
		this.aClass489_8.method29837(arg0);
		this.method3779();
		this.method3778();
	}

	@OriginalMember(owner = "client!afa", name = "lp", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20480() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "lc", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20691() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "lm", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20725() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "la", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20721() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "dq", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20654() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "lf", descriptor = "()Lclient!pq;", line = 1587)
	@Override
	public final Class489 method20724() {
		return new Class489(this.aClass489_8);
	}

	@OriginalMember(owner = "client!afa", name = "ss", descriptor = "()V", line = 1591)
	final void method3775() {
		if (this.anInt546 != 0) {
			this.anInt546 = 0;
			this.method3964();
			this.method3951();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vh", descriptor = "()V", line = 1591)
	final void method3788() {
		if (this.anInt546 != 0) {
			this.anInt546 = 0;
			this.method3964();
			this.method3951();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "vd", descriptor = "()V", line = 1591)
	final void method3887() {
		if (this.anInt546 != 0) {
			this.anInt546 = 0;
			this.method3964();
			this.method3951();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "sx", descriptor = "()V", line = 1600)
	final void method3776() {
		if (this.anInt546 == 1) {
			return;
		}
		this.anInt546 = 1;
		this.method3778();
		this.method3964();
		this.method3951();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt543 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afa", name = "sm", descriptor = "()V", line = 1612)
	final void method3790() {
		if (this.anInt546 == 2) {
			return;
		}
		this.anInt546 = 2;
		this.method3780(this.aClass489_8.aFloatArray116);
		this.method3868();
		this.method3964();
		this.method3951();
		this.anInt543 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "vj", descriptor = "()V", line = 1612)
	final void method3889() {
		if (this.anInt546 == 2) {
			return;
		}
		this.anInt546 = 2;
		this.method3780(this.aClass489_8.aFloatArray116);
		this.method3868();
		this.method3964();
		this.method3951();
		this.anInt543 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "vz", descriptor = "()V", line = 1612)
	final void method3913() {
		if (this.anInt546 == 2) {
			return;
		}
		this.anInt546 = 2;
		this.method3780(this.aClass489_8.aFloatArray116);
		this.method3868();
		this.method3964();
		this.method3951();
		this.anInt543 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "sk", descriptor = "()V", line = 1623)
	final void method3778() {
		this.aFloat39 = this.aClass489_8.method29865();
		this.aFloat38 = this.aClass489_8.method29887();
		this.method3833();
		if (this.anInt546 == 2) {
			this.method3780(this.aClass489_8.aFloatArray116);
		} else if (this.anInt546 == 1) {
			this.method3780(this.aClass489_5.aFloatArray116);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vn", descriptor = "()V", line = 1623)
	final void method3857() {
		this.aFloat39 = this.aClass489_8.method29865();
		this.aFloat38 = this.aClass489_8.method29887();
		this.method3833();
		if (this.anInt546 == 2) {
			this.method3780(this.aClass489_8.aFloatArray116);
		} else if (this.anInt546 == 1) {
			this.method3780(this.aClass489_5.aFloatArray116);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vc", descriptor = "()V", line = 1623)
	final void method3890() {
		this.aFloat39 = this.aClass489_8.method29865();
		this.aFloat38 = this.aClass489_8.method29887();
		this.method3833();
		if (this.anInt546 == 2) {
			this.method3780(this.aClass489_8.aFloatArray116);
		} else if (this.anInt546 == 1) {
			this.method3780(this.aClass489_5.aFloatArray116);
		}
	}

	@OriginalMember(owner = "client!afa", name = "vf", descriptor = "()V", line = 1623)
	final void method3960() {
		this.aFloat39 = this.aClass489_8.method29865();
		this.aFloat38 = this.aClass489_8.method29887();
		this.method3833();
		if (this.anInt546 == 2) {
			this.method3780(this.aClass489_8.aFloatArray116);
		} else if (this.anInt546 == 1) {
			this.method3780(this.aClass489_5.aFloatArray116);
		}
	}

	@OriginalMember(owner = "client!afa", name = "si", descriptor = "()V", line = 1635)
	final void method3779() {
		this.aClass489_9.method29837(this.aClass489_3);
		this.aClass489_9.method29953(this.aClass489_8);
		this.aClass489_9.method29840(this.aFloatArrayArray7[0]);
		this.aClass489_9.method29876(this.aFloatArrayArray7[1]);
		this.aClass489_9.method29858(this.aFloatArrayArray7[2]);
		this.aClass489_9.method29859(this.aFloatArrayArray7[3]);
		this.aClass489_9.method29860(this.aFloatArrayArray7[4]);
		this.aClass489_9.method29861(this.aFloatArrayArray7[5]);
	}

	@OriginalMember(owner = "client!afa", name = "vk", descriptor = "()V", line = 1635)
	final void method3891() {
		this.aClass489_9.method29837(this.aClass489_3);
		this.aClass489_9.method29953(this.aClass489_8);
		this.aClass489_9.method29840(this.aFloatArrayArray7[0]);
		this.aClass489_9.method29876(this.aFloatArrayArray7[1]);
		this.aClass489_9.method29858(this.aFloatArrayArray7[2]);
		this.aClass489_9.method29859(this.aFloatArrayArray7[3]);
		this.aClass489_9.method29860(this.aFloatArrayArray7[4]);
		this.aClass489_9.method29861(this.aFloatArrayArray7[5]);
	}

	@OriginalMember(owner = "client!afa", name = "wn", descriptor = "()V", line = 1635)
	final void method3892() {
		this.aClass489_9.method29837(this.aClass489_3);
		this.aClass489_9.method29953(this.aClass489_8);
		this.aClass489_9.method29840(this.aFloatArrayArray7[0]);
		this.aClass489_9.method29876(this.aFloatArrayArray7[1]);
		this.aClass489_9.method29858(this.aFloatArrayArray7[2]);
		this.aClass489_9.method29859(this.aFloatArrayArray7[3]);
		this.aClass489_9.method29860(this.aFloatArrayArray7[4]);
		this.aClass489_9.method29861(this.aFloatArrayArray7[5]);
	}

	@OriginalMember(owner = "client!afa", name = "wo", descriptor = "([F)V", line = 1646)
	final void method3756(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!afa", name = "se", descriptor = "([F)V", line = 1646)
	final void method3780(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!afa", name = "wa", descriptor = "([F)V", line = 1646)
	final void method3893(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!afa", name = "hy", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20630(@OriginalArg(0) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method3853();
	}

	@OriginalMember(owner = "client!afa", name = "dv", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20518(@OriginalArg(0) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method3853();
	}

	@OriginalMember(owner = "client!afa", name = "hp", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20629(@OriginalArg(0) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method3853();
	}

	@OriginalMember(owner = "client!afa", name = "df", descriptor = "()I", line = 1663)
	@Override
	public int method20413() {
		return 4;
	}

	@OriginalMember(owner = "client!afa", name = "kr", descriptor = "()I", line = 1663)
	@Override
	public int method20708() {
		return 4;
	}

	@OriginalMember(owner = "client!afa", name = "kc", descriptor = "()I", line = 1663)
	@Override
	public int method20710() {
		return 4;
	}

	@OriginalMember(owner = "client!afa", name = "kb", descriptor = "()I", line = 1663)
	@Override
	public int method20707() {
		return 4;
	}

	@OriginalMember(owner = "client!afa", name = "kd", descriptor = "()I", line = 1663)
	@Override
	public int method20610() {
		return 4;
	}

	@OriginalMember(owner = "client!afa", name = "ds", descriptor = "(I[Lclient!akf;)V", line = 1667)
	@Override
	public void method20790(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array1[local1] = arg1[local1];
		}
		this.anInt540 = arg0;
		if (this.anInt546 != 1) {
			this.method3769();
		}
	}

	@OriginalMember(owner = "client!afa", name = "kp", descriptor = "(I[Lclient!akf;)V", line = 1667)
	@Override
	public void method20713(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array1[local1] = arg1[local1];
		}
		this.anInt540 = arg0;
		if (this.anInt546 != 1) {
			this.method3769();
		}
	}

	@OriginalMember(owner = "client!afa", name = "sn", descriptor = "()V", line = 1673)
	void method3769() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt540; local1++) {
			@Pc(10) Class93_Sub16 local10 = this.aClass93_Sub16Array1[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray10[0] = local10.method13520();
			aFloatArray10[1] = local10.method13521();
			aFloatArray10[2] = local10.method13522();
			aFloatArray10[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray10, 0);
			@Pc(48) int local48 = local10.method13539();
			@Pc(54) float local54 = local10.method13525() / 255.0F;
			aFloatArray10[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray10[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray10[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray10, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13523() * local10.method13523()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt544) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt544 = this.anInt540;
	}

	@OriginalMember(owner = "client!afa", name = "dc", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20521(@OriginalArg(0) float arg0) {
		if (this.aFloat42 != arg0) {
			this.aFloat42 = arg0;
			this.method3783();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ll", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20726(@OriginalArg(0) float arg0) {
		if (this.aFloat42 != arg0) {
			this.aFloat42 = arg0;
			this.method3783();
		}
	}

	@OriginalMember(owner = "client!afa", name = "lb", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20727(@OriginalArg(0) float arg0) {
		if (this.aFloat42 != arg0) {
			this.aFloat42 = arg0;
			this.method3783();
		}
	}

	@OriginalMember(owner = "client!afa", name = "le", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20728(@OriginalArg(0) float arg0) {
		if (this.aFloat42 != arg0) {
			this.aFloat42 = arg0;
			this.method3783();
		}
	}

	@OriginalMember(owner = "client!afa", name = "lh", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20866(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "di", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20522(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "lo", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20696(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "lr", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20677(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "lq", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20730(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "ls", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20733(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt560 != arg0;
		if (local7 || this.aFloat43 != arg1 || this.aFloat44 != arg2) {
			this.anInt560 = arg0;
			this.aFloat43 = arg1;
			this.aFloat44 = arg2;
			if (local7) {
				this.aFloat32 = (float) (this.anInt560 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt560 & 0xFF00) / 65280.0F;
				this.aFloat41 = (float) (this.anInt560 & 0xFF) / 255.0F;
				this.method3783();
			}
			this.method3846();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && this.aFloatArray13[2] == arg5) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray11[0] = -arg3;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray9[0] = arg3 * local132;
		this.aFloatArray9[1] = arg4 * local132;
		this.aFloatArray9[2] = arg5 * local132;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.method3785();
		this.anInt545 = (int) (arg3 * 256.0F / arg4);
		this.anInt561 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!afa", name = "dk", descriptor = "(I)V", line = 1739)
	@Override
	public final void method20523(@OriginalArg(0) int arg0) {
		this.anInt532 = 0;
		while (arg0 > 1) {
			this.anInt532++;
			arg0 >>= 0x1;
		}
		this.anInt531 = 0x1 << this.anInt532;
	}

	@OriginalMember(owner = "client!afa", name = "lu", descriptor = "(I)V", line = 1739)
	@Override
	public final void method20418(@OriginalArg(0) int arg0) {
		this.anInt532 = 0;
		while (arg0 > 1) {
			this.anInt532++;
			arg0 >>= 0x1;
		}
		this.anInt531 = 0x1 << this.anInt532;
	}

	@OriginalMember(owner = "client!afa", name = "dn", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt562 == arg0 && this.anInt563 == arg1 && this.anInt564 == arg2) {
			return;
		}
		this.anInt562 = arg0;
		this.anInt563 = arg1;
		this.anInt564 = arg2;
		this.method3833();
		this.method3855();
	}

	@OriginalMember(owner = "client!afa", name = "ly", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt562 == arg0 && this.anInt563 == arg1 && this.anInt564 == arg2) {
			return;
		}
		this.anInt562 = arg0;
		this.anInt563 = arg1;
		this.anInt564 = arg2;
		this.method3833();
		this.method3855();
	}

	@OriginalMember(owner = "client!afa", name = "wz", descriptor = "(FF)V", line = 1758)
	final void method3768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat46 = arg1;
		this.method3833();
	}

	@OriginalMember(owner = "client!afa", name = "sr", descriptor = "(FF)V", line = 1758)
	final void method3782(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat46 = arg1;
		this.method3833();
	}

	@OriginalMember(owner = "client!afa", name = "wu", descriptor = "(FF)V", line = 1758)
	final void method3895(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat46 = arg1;
		this.method3833();
	}

	@OriginalMember(owner = "client!afa", name = "wk", descriptor = "(FF)V", line = 1758)
	final void method3896(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat46 = arg1;
		this.method3833();
	}

	@OriginalMember(owner = "client!afa", name = "sq", descriptor = "()V", line = 1764)
	void method3783() {
		aFloatArray14[0] = this.aFloat42 * this.aFloat32;
		aFloatArray14[1] = this.aFloat42 * this.aFloat40;
		aFloatArray14[2] = this.aFloat42 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "we", descriptor = "()V", line = 1764)
	void method3840() {
		aFloatArray14[0] = this.aFloat42 * this.aFloat32;
		aFloatArray14[1] = this.aFloat42 * this.aFloat40;
		aFloatArray14[2] = this.aFloat42 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wj", descriptor = "()V", line = 1764)
	void method3898() {
		aFloatArray14[0] = this.aFloat42 * this.aFloat32;
		aFloatArray14[1] = this.aFloat42 * this.aFloat40;
		aFloatArray14[2] = this.aFloat42 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wr", descriptor = "()V", line = 1772)
	void method3781() {
		aFloatArray14[0] = this.aFloat43 * this.aFloat32;
		aFloatArray14[1] = this.aFloat43 * this.aFloat40;
		aFloatArray14[2] = this.aFloat43 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray14, 0);
		aFloatArray14[0] = -this.aFloat44 * this.aFloat32;
		aFloatArray14[1] = -this.aFloat44 * this.aFloat40;
		aFloatArray14[2] = -this.aFloat44 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "sh", descriptor = "()V", line = 1772)
	void method3846() {
		aFloatArray14[0] = this.aFloat43 * this.aFloat32;
		aFloatArray14[1] = this.aFloat43 * this.aFloat40;
		aFloatArray14[2] = this.aFloat43 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray14, 0);
		aFloatArray14[0] = -this.aFloat44 * this.aFloat32;
		aFloatArray14[1] = -this.aFloat44 * this.aFloat40;
		aFloatArray14[2] = -this.aFloat44 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wl", descriptor = "()V", line = 1772)
	void method3899() {
		aFloatArray14[0] = this.aFloat43 * this.aFloat32;
		aFloatArray14[1] = this.aFloat43 * this.aFloat40;
		aFloatArray14[2] = this.aFloat43 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray14, 0);
		aFloatArray14[0] = -this.aFloat44 * this.aFloat32;
		aFloatArray14[1] = -this.aFloat44 * this.aFloat40;
		aFloatArray14[2] = -this.aFloat44 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wp", descriptor = "()V", line = 1772)
	void method3900() {
		aFloatArray14[0] = this.aFloat43 * this.aFloat32;
		aFloatArray14[1] = this.aFloat43 * this.aFloat40;
		aFloatArray14[2] = this.aFloat43 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray14, 0);
		aFloatArray14[0] = -this.aFloat44 * this.aFloat32;
		aFloatArray14[1] = -this.aFloat44 * this.aFloat40;
		aFloatArray14[2] = -this.aFloat44 * this.aFloat41;
		aFloatArray14[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "st", descriptor = "()V", line = 1785)
	void method3785() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray9, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wg", descriptor = "()V", line = 1785)
	void method3852() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray9, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wv", descriptor = "()V", line = 1785)
	void method3901() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray9, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!afa", name = "sl", descriptor = "()V", line = 1790)
	void method3855() {
		if (this.aBoolean84 && this.anInt563 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afa", name = "wb", descriptor = "()V", line = 1790)
	void method3929() {
		if (this.aBoolean84 && this.anInt563 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!afa", name = "sp", descriptor = "()V", line = 1795)
	void method3833() {
		this.aFloat29 = this.aFloat39 - (float) this.anInt564 - this.aFloat46;
		this.aFloat30 = this.aFloat29 - (float) this.anInt563 * this.aFloat45;
		if (this.aFloat30 < this.aFloat38) {
			this.aFloat30 = this.aFloat38;
		}
		OpenGL.glFogf(2915, this.aFloat30);
		OpenGL.glFogf(2916, this.aFloat29);
		aFloatArray14[0] = (float) (this.anInt562 & 0xFF0000) / 1.671168E7F;
		aFloatArray14[1] = (float) (this.anInt562 & 0xFF00) / 65280.0F;
		aFloatArray14[2] = (float) (this.anInt562 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wq", descriptor = "()V", line = 1795)
	void method3902() {
		this.aFloat29 = this.aFloat39 - (float) this.anInt564 - this.aFloat46;
		this.aFloat30 = this.aFloat29 - (float) this.anInt563 * this.aFloat45;
		if (this.aFloat30 < this.aFloat38) {
			this.aFloat30 = this.aFloat38;
		}
		OpenGL.glFogf(2915, this.aFloat30);
		OpenGL.glFogf(2916, this.aFloat29);
		aFloatArray14[0] = (float) (this.anInt562 & 0xFF0000) / 1.671168E7F;
		aFloatArray14[1] = (float) (this.anInt562 & 0xFF00) / 65280.0F;
		aFloatArray14[2] = (float) (this.anInt562 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "wm", descriptor = "()V", line = 1795)
	void method3903() {
		this.aFloat29 = this.aFloat39 - (float) this.anInt564 - this.aFloat46;
		this.aFloat30 = this.aFloat29 - (float) this.anInt563 * this.aFloat45;
		if (this.aFloat30 < this.aFloat38) {
			this.aFloat30 = this.aFloat38;
		}
		OpenGL.glFogf(2915, this.aFloat30);
		OpenGL.glFogf(2916, this.aFloat29);
		aFloatArray14[0] = (float) (this.anInt562 & 0xFF0000) / 1.671168E7F;
		aFloatArray14[1] = (float) (this.anInt562 & 0xFF00) / 65280.0F;
		aFloatArray14[2] = (float) (this.anInt562 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "du", descriptor = "(I)Lclient!dz;", line = 1807)
	@Override
	public Class107 method20528(@OriginalArg(0) int arg0) {
		return this.aBoolean83 ? new Class107_Sub2_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!afa", name = "lx", descriptor = "(I)Lclient!dz;", line = 1807)
	@Override
	public Class107 method20737(@OriginalArg(0) int arg0) {
		return this.aBoolean83 ? new Class107_Sub2_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!afa", name = "lg", descriptor = "(I)Lclient!dz;", line = 1807)
	@Override
	public Class107 method20736(@OriginalArg(0) int arg0) {
		return this.aBoolean83 ? new Class107_Sub2_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!afa", name = "dl", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 1811)
	@Override
	public Class107 method20734(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean83 && this.aBoolean90) {
			@Pc(11) Class107_Sub2_Sub1 local11 = null;
			@Pc(14) Class107_Sub2 local14 = (Class107_Sub2) arg0;
			@Pc(17) Class107_Sub2 local17 = (Class107_Sub2) arg1;
			@Pc(20) Class88_Sub1 local20 = local14.method17840();
			@Pc(23) Class88_Sub1 local23 = local17.method17840();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt290 > local23.anInt290 ? local20.anInt290 : local23.anInt290;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class107_Sub2_Sub1) {
					@Pc(50) Class107_Sub2_Sub1 local50 = (Class107_Sub2_Sub1) arg3;
					if (local50.method17754() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class107_Sub2_Sub1(this, local38);
				}
				if (local11.method17756(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afa", name = "lz", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 1811)
	@Override
	public Class107 method20740(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean83 && this.aBoolean90) {
			@Pc(11) Class107_Sub2_Sub1 local11 = null;
			@Pc(14) Class107_Sub2 local14 = (Class107_Sub2) arg0;
			@Pc(17) Class107_Sub2 local17 = (Class107_Sub2) arg1;
			@Pc(20) Class88_Sub1 local20 = local14.method17840();
			@Pc(23) Class88_Sub1 local23 = local17.method17840();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt290 > local23.anInt290 ? local20.anInt290 : local23.anInt290;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class107_Sub2_Sub1) {
					@Pc(50) Class107_Sub2_Sub1 local50 = (Class107_Sub2_Sub1) arg3;
					if (local50.method17754() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class107_Sub2_Sub1(this, local38);
				}
				if (local11.method17756(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afa", name = "lj", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 1811)
	@Override
	public Class107 method20738(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean83 && this.aBoolean90) {
			@Pc(11) Class107_Sub2_Sub1 local11 = null;
			@Pc(14) Class107_Sub2 local14 = (Class107_Sub2) arg0;
			@Pc(17) Class107_Sub2 local17 = (Class107_Sub2) arg1;
			@Pc(20) Class88_Sub1 local20 = local14.method17840();
			@Pc(23) Class88_Sub1 local23 = local17.method17840();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt290 > local23.anInt290 ? local20.anInt290 : local23.anInt290;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class107_Sub2_Sub1) {
					@Pc(50) Class107_Sub2_Sub1 local50 = (Class107_Sub2_Sub1) arg3;
					if (local50.method17754() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class107_Sub2_Sub1(this, local38);
				}
				if (local11.method17756(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afa", name = "lw", descriptor = "(Lclient!dz;Lclient!dz;FLclient!dz;)Lclient!dz;", line = 1811)
	@Override
	public Class107 method20436(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class107 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean83 && this.aBoolean90) {
			@Pc(11) Class107_Sub2_Sub1 local11 = null;
			@Pc(14) Class107_Sub2 local14 = (Class107_Sub2) arg0;
			@Pc(17) Class107_Sub2 local17 = (Class107_Sub2) arg1;
			@Pc(20) Class88_Sub1 local20 = local14.method17840();
			@Pc(23) Class88_Sub1 local23 = local17.method17840();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt290 > local23.anInt290 ? local20.anInt290 : local23.anInt290;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class107_Sub2_Sub1) {
					@Pc(50) Class107_Sub2_Sub1 local50 = (Class107_Sub2_Sub1) arg3;
					if (local50.method17754() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class107_Sub2_Sub1(this, local38);
				}
				if (local11.method17756(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!afa", name = "ln", descriptor = "(Lclient!dz;)V", line = 1831)
	@Override
	public final void method20741(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub2_1 = (Class107_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "dp", descriptor = "(Lclient!dz;)V", line = 1831)
	@Override
	public final void method20815(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub2_1 = (Class107_Sub2) arg0;
	}

	@OriginalMember(owner = "client!afa", name = "wf", descriptor = "()Lclient!adq;", line = 1835)
	final Class88_Sub1 method3761() {
		return this.aClass107_Sub2_1 == null ? null : this.aClass107_Sub2_1.method17840();
	}

	@OriginalMember(owner = "client!afa", name = "su", descriptor = "()Lclient!adq;", line = 1835)
	final Class88_Sub1 method3787() {
		return this.aClass107_Sub2_1 == null ? null : this.aClass107_Sub2_1.method17840();
	}

	@OriginalMember(owner = "client!afa", name = "wc", descriptor = "()Lclient!adq;", line = 1835)
	final Class88_Sub1 method3904() {
		return this.aClass107_Sub2_1 == null ? null : this.aClass107_Sub2_1.method17840();
	}

	@OriginalMember(owner = "client!afa", name = "ld", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25479(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "dy", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25479(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "lt", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25479(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "lk", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25479(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mf", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25479(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afa", name = "db", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25480(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mh", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25480(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mx", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass215_1 != null) {
			this.aClass215_1.method25480(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "mg", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20748() {
		return this.aClass215_1 == null ? false : this.aClass215_1.method25490();
	}

	@OriginalMember(owner = "client!afa", name = "me", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20454() {
		return this.aClass215_1 == null ? false : this.aClass215_1.method25490();
	}

	@OriginalMember(owner = "client!afa", name = "dh", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20533() {
		return this.aClass215_1 == null ? false : this.aClass215_1.method25490();
	}

	@OriginalMember(owner = "client!afa", name = "sd", descriptor = "()Z", line = 1854)
	boolean method3789() {
		if (this.aClass93_Sub4_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub3_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub3_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "dx", descriptor = "()Z", line = 1865)
	@Override
	public boolean method20451() {
		return this.aClass93_Sub4_Sub3_1 != null && this.aClass93_Sub4_Sub3_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "mn", descriptor = "()Z", line = 1865)
	@Override
	public boolean method20750() {
		return this.aClass93_Sub4_Sub3_1 != null && this.aClass93_Sub4_Sub3_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "dg", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class93_Sub4_Sub3.aFloat193 = arg0;
		Class93_Sub4_Sub3.aFloat196 = arg1;
		Class93_Sub4_Sub3.aFloat194 = arg2;
		Class93_Sub4_Sub3.aFloat192 = arg3;
		Class93_Sub4_Sub3.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "mv", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20751(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class93_Sub4_Sub3.aFloat193 = arg0;
		Class93_Sub4_Sub3.aFloat196 = arg1;
		Class93_Sub4_Sub3.aFloat194 = arg2;
		Class93_Sub4_Sub3.aFloat192 = arg3;
		Class93_Sub4_Sub3.aFloat195 = arg4;
	}

	@OriginalMember(owner = "client!afa", name = "de", descriptor = "([I)Lclient!cj;", line = 1877)
	@Override
	public Class102 method20536(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "my", descriptor = "([I)Lclient!cj;", line = 1877)
	@Override
	public Class102 method20752(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "md", descriptor = "([I)Lclient!cj;", line = 1877)
	@Override
	public Class102 method20753(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "mq", descriptor = "([I)Lclient!cj;", line = 1877)
	@Override
	public Class102 method20755(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "mk", descriptor = "([I)Lclient!cj;", line = 1877)
	@Override
	public Class102 method20500(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "sz", descriptor = "()Z", line = 1881)
	boolean method3830() {
		if (this.aClass93_Sub4_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub2_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub2_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "wt", descriptor = "()Z", line = 1881)
	boolean method3905() {
		if (this.aClass93_Sub4_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub2_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub2_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mp", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20757() {
		return this.aClass93_Sub4_Sub2_1 != null && this.aClass93_Sub4_Sub2_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "dj", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20537() {
		return this.aClass93_Sub4_Sub2_1 != null && this.aClass93_Sub4_Sub2_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "ms", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20756() {
		return this.aClass93_Sub4_Sub2_1 != null && this.aClass93_Sub4_Sub2_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "mo", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20574() {
		return this.aClass93_Sub4_Sub2_1 != null && this.aClass93_Sub4_Sub2_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "ml", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V", line = 1896)
	@Override
	public void method20759(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[0] = (Class102_Sub1) arg0;
		Class93_Sub4_Sub2.aFloatArray56[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[1] = (Class102_Sub1) arg2;
		Class93_Sub4_Sub2.aFloatArray56[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[2] = (Class102_Sub1) arg4;
		Class93_Sub4_Sub2.aFloatArray56[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.anInt2758 = local1;
		Class93_Sub4_Sub2.aFloat191 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "eo", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V", line = 1896)
	@Override
	public void method20538(@OriginalArg(0) Class102 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class102 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 == null && arg5 > 0.0F) {
			arg5 = 0.0F;
		}
		if (arg2 == null && arg3 > 0.0F) {
			arg2 = arg4;
			arg4 = null;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		if (arg0 == null && arg1 > 0.0F) {
			arg0 = arg2;
			arg2 = arg4;
			arg4 = null;
			arg1 = arg3;
			arg3 = arg5;
			arg5 = 0.0F;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[0] = (Class102_Sub1) arg0;
		Class93_Sub4_Sub2.aFloatArray56[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[1] = (Class102_Sub1) arg2;
		Class93_Sub4_Sub2.aFloatArray56[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.aClass102_Sub1Array1[2] = (Class102_Sub1) arg4;
		Class93_Sub4_Sub2.aFloatArray56[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class93_Sub4_Sub2.anInt2758 = local1;
		Class93_Sub4_Sub2.aFloat191 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afa", name = "ey", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20573() {
		if (this.aClass93_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub1_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mi", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20817() {
		if (this.aClass93_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub1_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mb", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20763() {
		if (this.aClass93_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub1_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mr", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20761() {
		if (this.aClass93_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub1_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mz", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20762() {
		if (this.aClass93_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass93_Sub4_Sub1_1.method20172()) {
			if (!this.aClass215_1.method25481(this.aClass93_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass201_1.method24634();
		}
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "mc", descriptor = "()V", line = 1939)
	@Override
	public final void method20766() {
		if (this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172()) {
			this.aClass215_1.method25482(this.aClass93_Sub4_Sub1_1);
			this.aClass201_1.method24634();
		}
	}

	@OriginalMember(owner = "client!afa", name = "mu", descriptor = "()V", line = 1939)
	@Override
	public final void method20430() {
		if (this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172()) {
			this.aClass215_1.method25482(this.aClass93_Sub4_Sub1_1);
			this.aClass201_1.method24634();
		}
	}

	@OriginalMember(owner = "client!afa", name = "mt", descriptor = "()V", line = 1939)
	@Override
	public final void method20586() {
		if (this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172()) {
			this.aClass215_1.method25482(this.aClass93_Sub4_Sub1_1);
			this.aClass201_1.method24634();
		}
	}

	@OriginalMember(owner = "client!afa", name = "eu", descriptor = "()V", line = 1939)
	@Override
	public final void method20572() {
		if (this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172()) {
			this.aClass215_1.method25482(this.aClass93_Sub4_Sub1_1);
			this.aClass201_1.method24634();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ed", descriptor = "()Z", line = 1946)
	@Override
	public final boolean method20541() {
		return this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "ma", descriptor = "()Z", line = 1946)
	@Override
	public final boolean method20767() {
		return this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "mj", descriptor = "()Z", line = 1946)
	@Override
	public final boolean method20834() {
		return this.aClass93_Sub4_Sub1_1 != null && this.aClass93_Sub4_Sub1_1.method20172();
	}

	@OriginalMember(owner = "client!afa", name = "es", descriptor = "(FFFFFF)V", line = 1950)
	@Override
	final void method20543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class93_Sub4_Sub1.aFloat187 = arg0;
		Class93_Sub4_Sub1.aFloat186 = arg1;
		Class93_Sub4_Sub1.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!afa", name = "mw", descriptor = "(FFFFFF)V", line = 1950)
	@Override
	final void method20768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class93_Sub4_Sub1.aFloat187 = arg0;
		Class93_Sub4_Sub1.aFloat186 = arg1;
		Class93_Sub4_Sub1.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!afa", name = "mm", descriptor = "(FFFFFF)V", line = 1950)
	@Override
	final void method20770(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class93_Sub4_Sub1.aFloat187 = arg0;
		Class93_Sub4_Sub1.aFloat186 = arg1;
		Class93_Sub4_Sub1.aFloat188 = arg2;
	}

	@OriginalMember(owner = "client!afa", name = "nt", descriptor = "()Lclient!afq;", line = 1956)
	@Override
	public Class112_Sub1 method20785() {
		return new Class112_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afa", name = "am", descriptor = "()Lclient!afq;", line = 1956)
	@Override
	public Class112_Sub1 method20444() {
		return new Class112_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afa", name = "ng", descriptor = "()Lclient!afq;", line = 1956)
	@Override
	public Class112_Sub1 method20784() {
		return new Class112_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!afa", name = "ar", descriptor = "(II)Lclient!dw;", line = 1960)
	@Override
	public Interface19 method20420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class93_Sub1_Sub3(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "nk", descriptor = "(II)Lclient!dw;", line = 1960)
	@Override
	public Interface19 method20678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class93_Sub1_Sub3(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "ap", descriptor = "(III)Lclient!dw;", line = 1964)
	@Override
	public Interface19 method20655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class93_Sub1_Sub3(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "nq", descriptor = "(III)Lclient!dw;", line = 1964)
	@Override
	public Interface19 method20788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class93_Sub1_Sub3(this, Class206.aClass206_17, Class226.aClass226_26, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "au", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 1968)
	@Override
	public Interface18 method20445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class93_Sub1_Sub3(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "nn", descriptor = "(IILclient!ck;Lclient!dg;I)Lclient!dp;", line = 1968)
	@Override
	public Interface18 method20873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4) {
		return new Class93_Sub1_Sub3(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!afa", name = "sf", descriptor = "(I[BIZ)Lclient!cf;", line = 1972)
	final Interface16 method3793(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface16) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub1(this, arg0, arg1, arg2, arg3) : new Class101_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afa", name = "wx", descriptor = "(I[BIZ)Lclient!cf;", line = 1972)
	final Interface16 method3906(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface16) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub1(this, arg0, arg1, arg2, arg3) : new Class101_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afa", name = "sy", descriptor = "(I[BIZ)Lclient!bv;", line = 1979)
	final Interface14 method3794(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afa", name = "wh", descriptor = "(I[BIZ)Lclient!bv;", line = 1979)
	final Interface14 method3907(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!afa", name = "wd", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bv;", line = 1986)
	final Interface14 method3766(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afa", name = "sa", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bv;", line = 1986)
	final Interface14 method3831(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afa", name = "ww", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bv;", line = 1986)
	final Interface14 method3908(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afa", name = "ws", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bv;", line = 1986)
	final Interface14 method3909(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afa", name = "wi", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bv;", line = 1986)
	final Interface14 method3949(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean94 && (!arg3 || this.aBoolean95) ? new Class98_Sub2(this, arg0, arg1, arg2, arg3) : new Class101_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!afa", name = "sb", descriptor = "(Lclient!bv;)V", line = 1993)
	final void method3869(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_2 != arg0) {
			if (this.aBoolean94) {
				OpenGL.glBindBufferARB(34962, arg0.method2787());
			}
			this.anInterface14_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "sj", descriptor = "(Lclient!cf;)V", line = 2000)
	final void method3796(@OriginalArg(0) Interface16 arg0) {
		if (this.anInterface16_1 != arg0) {
			if (this.aBoolean94) {
				OpenGL.glBindBufferARB(34963, arg0.method2567());
			}
			this.anInterface16_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "wy", descriptor = "(Lclient!cf;)V", line = 2000)
	final void method3911(@OriginalArg(0) Interface16 arg0) {
		if (this.anInterface16_1 != arg0) {
			if (this.aBoolean94) {
				OpenGL.glBindBufferARB(34963, arg0.method2567());
			}
			this.anInterface16_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "so", descriptor = "(Lclient!bp;Lclient!bp;Lclient!bp;Lclient!bp;)V", line = 2007)
	final void method3836(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) Class193 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3869(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3869(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3869(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3869(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xl", descriptor = "(Lclient!bp;Lclient!bp;Lclient!bp;Lclient!bp;)V", line = 2007)
	final void method3851(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) Class193 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3869(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3869(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3869(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3869(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xm", descriptor = "(Lclient!bp;Lclient!bp;Lclient!bp;Lclient!bp;)V", line = 2007)
	final void method3912(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) Class193 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3869(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3869(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3869(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3869(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xy", descriptor = "(Lclient!bp;Lclient!bp;Lclient!bp;Lclient!bp;)V", line = 2007)
	final void method3914(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) Class193 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3869(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3869(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3869(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3869(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort143, this.anInterface14_2.method2788(), this.anInterface14_2.method2781() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!afa", name = "sc", descriptor = "(III)V", line = 2034)
	final void method3828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "xw", descriptor = "(Lclient!cf;III)V", line = 2038)
	final void method3915(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method3796(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2559() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afa", name = "xu", descriptor = "(Lclient!cf;III)V", line = 2038)
	final void method3916(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method3796(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2559() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afa", name = "sg", descriptor = "(Lclient!cf;III)V", line = 2038)
	final void method3948(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method3796(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2559() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!afa", name = "xn", descriptor = "()V", line = 2043)
	final void method3773() {
		if (this.anInt543 == 1) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3821((byte) 0);
		this.anInt543 = 1;
	}

	@OriginalMember(owner = "client!afa", name = "tu", descriptor = "()V", line = 2043)
	final void method3798() {
		if (this.anInt543 == 1) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3821((byte) 0);
		this.anInt543 = 1;
	}

	@OriginalMember(owner = "client!afa", name = "xv", descriptor = "()V", line = 2043)
	final void method3917() {
		if (this.anInt543 == 1) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3804(null);
		this.method3801(-2);
		this.method3805(1);
		this.method3821((byte) 0);
		this.anInt543 = 1;
	}

	@OriginalMember(owner = "client!afa", name = "xg", descriptor = "()V", line = 2058)
	final void method3774() {
		if (this.anInt543 == 2) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3801(-2);
		this.method3821((byte) 0);
		this.anInt543 = 2;
	}

	@OriginalMember(owner = "client!afa", name = "ta", descriptor = "()V", line = 2058)
	final void method3799() {
		if (this.anInt543 == 2) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3801(-2);
		this.method3821((byte) 0);
		this.anInt543 = 2;
	}

	@OriginalMember(owner = "client!afa", name = "tr", descriptor = "()V", line = 2071)
	final void method3758() {
		if (this.anInt543 == 4) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3801(-2);
		this.method3818(1);
		this.method3821((byte) 0);
		this.anInt543 = 4;
	}

	@OriginalMember(owner = "client!afa", name = "xa", descriptor = "()V", line = 2071)
	final void method3919() {
		if (this.anInt543 == 4) {
			return;
		}
		this.method3776();
		this.method3765(false);
		this.method3791(false);
		this.method3815(false);
		this.method3816(false);
		this.method3801(-2);
		this.method3818(1);
		this.method3821((byte) 0);
		this.anInt543 = 4;
	}

	@OriginalMember(owner = "client!afa", name = "tc", descriptor = "()V", line = 2085)
	final void method3800() {
		if (this.anInt543 == 8) {
			return;
		}
		this.method3790();
		this.method3765(true);
		this.method3815(true);
		this.method3816(true);
		this.method3801(-2);
		this.method3818(1);
		this.method3821((byte) 0);
		this.anInt543 = 8;
	}

	@OriginalMember(owner = "client!afa", name = "xi", descriptor = "()V", line = 2085)
	final void method3920() {
		if (this.anInt543 == 8) {
			return;
		}
		this.method3790();
		this.method3765(true);
		this.method3815(true);
		this.method3816(true);
		this.method3801(-2);
		this.method3818(1);
		this.method3821((byte) 0);
		this.anInt543 = 8;
	}

	@OriginalMember(owner = "client!afa", name = "xz", descriptor = "()V", line = 2085)
	final void method3921() {
		if (this.anInt543 == 8) {
			return;
		}
		this.method3790();
		this.method3765(true);
		this.method3815(true);
		this.method3816(true);
		this.method3801(-2);
		this.method3818(1);
		this.method3821((byte) 0);
		this.anInt543 = 8;
	}

	@OriginalMember(owner = "client!afa", name = "tj", descriptor = "(I)V", line = 2098)
	final void method3801(@OriginalArg(0) int arg0) {
		this.method3802(arg0, true);
	}

	@OriginalMember(owner = "client!afa", name = "xh", descriptor = "(I)V", line = 2098)
	final void method3922(@OriginalArg(0) int arg0) {
		this.method3802(arg0, true);
	}

	@OriginalMember(owner = "client!afa", name = "xp", descriptor = "(I)V", line = 2098)
	final void method3923(@OriginalArg(0) int arg0) {
		this.method3802(arg0, true);
	}

	@OriginalMember(owner = "client!afa", name = "te", descriptor = "(IZ)V", line = 2102)
	final void method3802(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3822(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afa", name = "xx", descriptor = "(IZ)V", line = 2102)
	final void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3822(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afa", name = "xs", descriptor = "(IZ)V", line = 2102)
	final void method3924(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3822(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afa", name = "xr", descriptor = "(IZ)V", line = 2102)
	final void method3925(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3822(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!afa", name = "ti", descriptor = "(IZZ)V", line = 2106)
	final void method3822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt567 || this.aBoolean86 != this.aBoolean72) {
			@Pc(10) Class88_Sub2 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean72 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method3812();
			} else {
				@Pc(33) Class235 local33 = this.aClass225_6.method25597(arg0);
				if (local33.aBoolean652) {
					local10 = this.aClass201_1.method24639(local33);
					if (local33.aFloat278 == 0.0F && local33.aFloat279 == 0.0F) {
						this.method3812();
					} else {
						this.method3811((float) (this.anInt530 % 128000) / 1000.0F * local33.aFloat278 % 1.0F, (float) (this.anInt530 % 128000) / 1000.0F * local33.aFloat279 % 1.0F, 0.0F);
					}
					if (!this.aBoolean72) {
						local14 = local33.aByte112;
						local16 = local33.anInt3807 * 1731185285;
						local23 = local33.aByte114;
					}
					local12 = local33.aByte115;
				} else {
					this.method3812();
				}
				if (local33.aClass618_2 == Class618.aClass618_4) {
					local25 = local33.aByte121;
				}
			}
			this.method3821(local25);
			this.aClass197_1.method24621(local23, local14, local16, arg1, arg2);
			if (!this.aClass197_1.method24619(local10, local12)) {
				this.method3804(local10);
				this.method3805(local12);
			}
			this.aBoolean86 = this.aBoolean72;
			this.anInt567 = arg0;
		}
		this.anInt543 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "xc", descriptor = "(IZZ)V", line = 2106)
	final void method3870(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt567 || this.aBoolean86 != this.aBoolean72) {
			@Pc(10) Class88_Sub2 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean72 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method3812();
			} else {
				@Pc(33) Class235 local33 = this.aClass225_6.method25597(arg0);
				if (local33.aBoolean652) {
					local10 = this.aClass201_1.method24639(local33);
					if (local33.aFloat278 == 0.0F && local33.aFloat279 == 0.0F) {
						this.method3812();
					} else {
						this.method3811((float) (this.anInt530 % 128000) / 1000.0F * local33.aFloat278 % 1.0F, (float) (this.anInt530 % 128000) / 1000.0F * local33.aFloat279 % 1.0F, 0.0F);
					}
					if (!this.aBoolean72) {
						local14 = local33.aByte112;
						local16 = local33.anInt3807 * 1731185285;
						local23 = local33.aByte114;
					}
					local12 = local33.aByte115;
				} else {
					this.method3812();
				}
				if (local33.aClass618_2 == Class618.aClass618_4) {
					local25 = local33.aByte121;
				}
			}
			this.method3821(local25);
			this.aClass197_1.method24621(local23, local14, local16, arg1, arg2);
			if (!this.aClass197_1.method24619(local10, local12)) {
				this.method3804(local10);
				this.method3805(local12);
			}
			this.aBoolean86 = this.aBoolean72;
			this.anInt567 = arg0;
		}
		this.anInt543 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afa", name = "tm", descriptor = "(I)V", line = 2149)
	final void method3803(@OriginalArg(0) int arg0) {
		if (this.anInt579 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt579 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "xd", descriptor = "(I)V", line = 2149)
	final void method3848(@OriginalArg(0) int arg0) {
		if (this.anInt579 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt579 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "xj", descriptor = "(I)V", line = 2149)
	final void method3856(@OriginalArg(0) int arg0) {
		if (this.anInt579 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt579 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "xb", descriptor = "(I)V", line = 2149)
	final void method3927(@OriginalArg(0) int arg0) {
		if (this.anInt579 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt579 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "xe", descriptor = "(I)V", line = 2149)
	final void method3928(@OriginalArg(0) int arg0) {
		if (this.anInt579 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt579 = arg0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ty", descriptor = "(Lclient!bq;)V", line = 2156)
	final void method3804(@OriginalArg(0) Class88 arg0) {
		@Pc(5) Class88 local5 = this.aClass88Array1[this.anInt579];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2543);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2543);
				} else if (arg0.anInt2543 != local5.anInt2543) {
					OpenGL.glDisable(local5.anInt2543);
					OpenGL.glEnable(arg0.anInt2543);
				}
				OpenGL.glBindTexture(arg0.anInt2543, arg0.anInt2541);
			}
			this.aClass88Array1[this.anInt579] = arg0;
		}
		this.anInt543 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afa", name = "tb", descriptor = "(I)V", line = 2175)
	final void method3805(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3837(7681, 7681);
		} else if (arg0 == 0) {
			this.method3837(8448, 8448);
		} else if (arg0 == 2) {
			this.method3837(34165, 7681);
		} else if (arg0 == 3) {
			this.method3837(260, 8448);
		} else if (arg0 == 4) {
			this.method3837(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xo", descriptor = "(I)V", line = 2175)
	final void method3930(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3837(7681, 7681);
		} else if (arg0 == 0) {
			this.method3837(8448, 8448);
		} else if (arg0 == 2) {
			this.method3837(34165, 7681);
		} else if (arg0 == 3) {
			this.method3837(260, 8448);
		} else if (arg0 == 4) {
			this.method3837(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afa", name = "xk", descriptor = "(I)V", line = 2175)
	final void method3931(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3837(7681, 7681);
		} else if (arg0 == 0) {
			this.method3837(8448, 8448);
		} else if (arg0 == 2) {
			this.method3837(34165, 7681);
		} else if (arg0 == 3) {
			this.method3837(260, 8448);
		} else if (arg0 == 4) {
			this.method3837(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!afa", name = "tn", descriptor = "(I)I", line = 2183)
	final int method3806(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!afa", name = "xq", descriptor = "(I)I", line = 2183)
	final int method3932(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!afa", name = "xf", descriptor = "(I)I", line = 2183)
	final int method3933(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!afa", name = "tw", descriptor = "(II)V", line = 2192)
	final void method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt579 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt568 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt568 = arg0;
			local4 = true;
		}
		if (this.anInt569 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt569 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt543 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "xt", descriptor = "(II)V", line = 2192)
	final void method3934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt579 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt568 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt568 = arg0;
			local4 = true;
		}
		if (this.anInt569 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt569 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt543 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ye", descriptor = "(II)V", line = 2192)
	final void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt579 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt568 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt568 = arg0;
			local4 = true;
		}
		if (this.anInt569 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt569 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt543 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yo", descriptor = "(II)V", line = 2192)
	final void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt579 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt568 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt568 = arg0;
			local4 = true;
		}
		if (this.anInt569 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt569 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt543 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afa", name = "tz", descriptor = "(III)V", line = 2215)
	final void method3807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "yj", descriptor = "(III)V", line = 2215)
	final void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "ys", descriptor = "(III)V", line = 2215)
	final void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "yk", descriptor = "(III)V", line = 2215)
	final void method3939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "yn", descriptor = "(III)V", line = 2215)
	final void method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "tf", descriptor = "(III)V", line = 2220)
	final void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "yq", descriptor = "(III)V", line = 2220)
	final void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "yg", descriptor = "(III)V", line = 2220)
	final void method3941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "th", descriptor = "(I)V", line = 2225)
	final void method3792(@OriginalArg(0) int arg0) {
		aFloatArray14[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray14[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray14[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray14[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "yh", descriptor = "(I)V", line = 2225)
	final void method3859(@OriginalArg(0) int arg0) {
		aFloatArray14[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray14[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray14[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray14[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "tt", descriptor = "(FFFF)V", line = 2233)
	final void method3810(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray14[0] = arg0;
		aFloatArray14[1] = arg1;
		aFloatArray14[2] = arg2;
		aFloatArray14[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "yb", descriptor = "(FFFF)V", line = 2233)
	final void method3943(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray14[0] = arg0;
		aFloatArray14[1] = arg1;
		aFloatArray14[2] = arg2;
		aFloatArray14[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "yp", descriptor = "(FFFF)V", line = 2233)
	final void method3944(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray14[0] = arg0;
		aFloatArray14[1] = arg1;
		aFloatArray14[2] = arg2;
		aFloatArray14[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!afa", name = "ts", descriptor = "(FFF)V", line = 2241)
	final void method3811(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean85) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!afa", name = "yz", descriptor = "(FFF)V", line = 2241)
	final void method3945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean85) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!afa", name = "yw", descriptor = "(FFF)V", line = 2241)
	final void method3946(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean85) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!afa", name = "tp", descriptor = "()V", line = 2249)
	final void method3812() {
		if (this.aBoolean85) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean85 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yr", descriptor = "()V", line = 2249)
	final void method3813() {
		if (this.aBoolean85) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean85 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yx", descriptor = "()V", line = 2249)
	final void method3947() {
		if (this.aBoolean85) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean85 = false;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yl", descriptor = "(Z)V", line = 2258)
	final void method3764(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean84) {
			this.aBoolean84 = arg0;
			this.method3855();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "tv", descriptor = "(Z)V", line = 2258)
	final void method3765(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean84) {
			this.aBoolean84 = arg0;
			this.method3855();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yi", descriptor = "(Z)V", line = 2258)
	final void method3832(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean84) {
			this.aBoolean84 = arg0;
			this.method3855();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yv", descriptor = "(Z)V", line = 2266)
	final void method3767(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean80) {
			this.aBoolean80 = arg0;
			this.method3858();
			this.anInt543 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afa", name = "to", descriptor = "(Z)V", line = 2266)
	final void method3791(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean80) {
			this.aBoolean80 = arg0;
			this.method3858();
			this.anInt543 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afa", name = "ym", descriptor = "(Z)V", line = 2266)
	final void method3950(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean80) {
			this.aBoolean80 = arg0;
			this.method3858();
			this.anInt543 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yf", descriptor = "(Z)V", line = 2274)
	final void method3777(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean81) {
			this.aBoolean81 = arg0;
			this.method3858();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ya", descriptor = "(Z)V", line = 2274)
	final void method3795(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean81) {
			this.aBoolean81 = arg0;
			this.method3858();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tg", descriptor = "(Z)V", line = 2274)
	final void method3867(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean81) {
			this.aBoolean81 = arg0;
			this.method3858();
		}
	}

	@OriginalMember(owner = "client!afa", name = "tq", descriptor = "()V", line = 2281)
	void method3858() {
		if (this.aBoolean80 && !this.aBoolean81) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!afa", name = "yd", descriptor = "()V", line = 2281)
	void method3953() {
		if (this.aBoolean80 && !this.aBoolean81) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!afa", name = "tx", descriptor = "(Z)V", line = 2286)
	final void method3815(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean76) {
			this.aBoolean76 = arg0;
			this.method3817();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yy", descriptor = "(Z)V", line = 2286)
	final void method3954(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean76) {
			this.aBoolean76 = arg0;
			this.method3817();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "yc", descriptor = "(Z)V", line = 2294)
	final void method3753(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean71) {
			this.aBoolean71 = arg0;
			this.method3853();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "tk", descriptor = "(Z)V", line = 2294)
	final void method3816(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean71) {
			this.aBoolean71 = arg0;
			this.method3853();
			this.anInt543 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "tl", descriptor = "()V", line = 2302)
	final void method3853() {
		OpenGL.glDepthMask(this.aBoolean71 && this.aBoolean88);
	}

	@OriginalMember(owner = "client!afa", name = "td", descriptor = "()V", line = 2306)
	final void method3817() {
		if (this.aBoolean76 && this.aBoolean82) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afa", name = "yu", descriptor = "()V", line = 2306)
	final void method3956() {
		if (this.aBoolean76 && this.aBoolean82) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afa", name = "yt", descriptor = "()V", line = 2306)
	final void method3957() {
		if (this.aBoolean76 && this.aBoolean82) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zh", descriptor = "()V", line = 2306)
	final void method3958() {
		if (this.aBoolean76 && this.aBoolean82) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zn", descriptor = "(I)V", line = 2311)
	final void method3814(@OriginalArg(0) int arg0) {
		if (this.anInt547 == arg0) {
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
		if (local10 != this.aBoolean73) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean73 = local10;
		}
		if (local12 != this.aBoolean79) {
			this.aBoolean79 = local12;
			this.method3866();
		}
		if (local14 != this.aBoolean78) {
			this.aBoolean78 = local14;
			this.method3819();
		}
		if (local8 != this.anInt537) {
			this.anInt537 = local8;
			this.method3820();
		}
		this.anInt547 = arg0;
		this.anInt543 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "ul", descriptor = "(I)V", line = 2311)
	final void method3818(@OriginalArg(0) int arg0) {
		if (this.anInt547 == arg0) {
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
		if (local10 != this.aBoolean73) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean73 = local10;
		}
		if (local12 != this.aBoolean79) {
			this.aBoolean79 = local12;
			this.method3866();
		}
		if (local14 != this.aBoolean78) {
			this.aBoolean78 = local14;
			this.method3819();
		}
		if (local8 != this.anInt537) {
			this.anInt537 = local8;
			this.method3820();
		}
		this.anInt547 = arg0;
		this.anInt543 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "zt", descriptor = "(I)V", line = 2311)
	final void method3844(@OriginalArg(0) int arg0) {
		if (this.anInt547 == arg0) {
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
		if (local10 != this.aBoolean73) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean73 = local10;
		}
		if (local12 != this.aBoolean79) {
			this.aBoolean79 = local12;
			this.method3866();
		}
		if (local14 != this.aBoolean78) {
			this.aBoolean78 = local14;
			this.method3819();
		}
		if (local8 != this.anInt537) {
			this.anInt537 = local8;
			this.method3820();
		}
		this.anInt547 = arg0;
		this.anInt543 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "za", descriptor = "(I)V", line = 2311)
	final void method3959(@OriginalArg(0) int arg0) {
		if (this.anInt547 == arg0) {
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
		if (local10 != this.aBoolean73) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean73 = local10;
		}
		if (local12 != this.aBoolean79) {
			this.aBoolean79 = local12;
			this.method3866();
		}
		if (local14 != this.aBoolean78) {
			this.aBoolean78 = local14;
			this.method3819();
		}
		if (local8 != this.anInt537) {
			this.anInt537 = local8;
			this.method3820();
		}
		this.anInt547 = arg0;
		this.anInt543 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afa", name = "zw", descriptor = "()V", line = 2368)
	final void method3809() {
		if (this.aBoolean78) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "um", descriptor = "()V", line = 2368)
	final void method3819() {
		if (this.aBoolean78) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zy", descriptor = "()V", line = 2368)
	final void method3961() {
		if (this.aBoolean78) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zi", descriptor = "()V", line = 2368)
	final void method3962() {
		if (this.aBoolean78) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zj", descriptor = "()V", line = 2368)
	final void method3963() {
		if (this.aBoolean78) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uq", descriptor = "()V", line = 2373)
	final void method3820() {
		if (this.aBoolean105) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt538 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt538 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt538 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt538 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt537 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt537 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt537 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt537 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt537 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt537 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt537 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zq", descriptor = "()V", line = 2373)
	final void method3847() {
		if (this.aBoolean105) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt538 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt538 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt538 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt538 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt537 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt537 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt537 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt537 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt537 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt537 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt537 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zo", descriptor = "()V", line = 2373)
	final void method3965() {
		if (this.aBoolean105) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt538 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt538 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt538 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt538 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt537 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt537 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt537 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt537 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt537 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt537 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt537 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zk", descriptor = "()V", line = 2373)
	final void method3966() {
		if (this.aBoolean105) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt538 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt538 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt538 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt538 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt537 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt537 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt537 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt537 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt537 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt537 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt537 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uc", descriptor = "(I)V", line = 2415)
	final void method3786(@OriginalArg(0) int arg0) {
		if (this.anInt538 != arg0) {
			this.anInt538 = arg0;
			this.method3820();
		}
	}

	@OriginalMember(owner = "client!afa", name = "ui", descriptor = "()V", line = 2422)
	final void method3866() {
		if (this.aBoolean79) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte2 & 0xFF) / 255.0F);
		if (this.anInt566 <= 0) {
			return;
		}
		if (this.aByte2 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zm", descriptor = "()V", line = 2422)
	final void method3967() {
		if (this.aBoolean79) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte2 & 0xFF) / 255.0F);
		if (this.anInt566 <= 0) {
			return;
		}
		if (this.aByte2 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!afa", name = "ua", descriptor = "(B)V", line = 2432)
	final void method3821(@OriginalArg(0) byte arg0) {
		if (this.aByte2 == arg0) {
			return;
		}
		this.aByte2 = arg0;
		if (arg0 == 0) {
			this.method3786(2);
			this.method3818(1);
		} else {
			this.method3786(3);
			this.method3818(3);
		}
		this.method3866();
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "()I", line = 2447)
	@Override
	public final int method20819() {
		return this.anInt534 + this.anInt533 + this.anInt535;
	}

	@OriginalMember(owner = "client!afa", name = "eb", descriptor = "()I", line = 2447)
	@Override
	public final int method20808() {
		return this.anInt534 + this.anInt533 + this.anInt535;
	}

	@OriginalMember(owner = "client!afa", name = "ex", descriptor = "()I", line = 2447)
	@Override
	public final int method20843() {
		return this.anInt534 + this.anInt533 + this.anInt535;
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V", line = 2451)
	@Override
	public final synchronized void method20419(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class93_Sub14 local16;
		while (!this.aClass22_6.method418()) {
			local16 = (Class93_Sub14) this.aClass22_6.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt534 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_7.method418()) {
			local16 = (Class93_Sub14) this.aClass22_7.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt533 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_8.method418()) {
			local16 = (Class93_Sub14) this.aClass22_8.method408();
			anIntArray37[local1++] = local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_9.method418()) {
			local16 = (Class93_Sub14) this.aClass22_9.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt535 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray37, 0);
		}
		while (!this.aClass22_11.method418()) {
			local16 = (Class93_Sub14) this.aClass22_11.method408();
			OpenGL.glDeleteLists((int) (local16.aLong232 * -3750704643647536275L), local16.anInt1526 * 1279598251);
		}
		@Pc(215) Class93 local215;
		while (!this.aClass22_5.method418()) {
			local215 = this.aClass22_5.method408();
			OpenGL.glDeleteProgramARB((int) (local215.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_10.method418()) {
			local215 = this.aClass22_10.method408();
			OpenGL.glDeleteShader((int) (local215.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_11.method418()) {
			local16 = (Class93_Sub14) this.aClass22_11.method408();
			OpenGL.glDeleteLists((int) (local16.aLong232 * -3750704643647536275L), local16.anInt1526 * 1279598251);
		}
		this.aClass201_1.method24637();
		if (this.method20819() > 100663296 && Class305.method26796() > this.aLong24 + 60000L) {
			System.gc();
			this.aLong24 = Class305.method26796();
		}
		this.anInt530 = local5;
	}

	@OriginalMember(owner = "client!afa", name = "en", descriptor = "(I)V", line = 2451)
	@Override
	public final synchronized void method20561(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class93_Sub14 local16;
		while (!this.aClass22_6.method418()) {
			local16 = (Class93_Sub14) this.aClass22_6.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt534 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_7.method418()) {
			local16 = (Class93_Sub14) this.aClass22_7.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt533 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_8.method418()) {
			local16 = (Class93_Sub14) this.aClass22_8.method408();
			anIntArray37[local1++] = local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray37, 0);
			local1 = 0;
		}
		while (!this.aClass22_9.method418()) {
			local16 = (Class93_Sub14) this.aClass22_9.method408();
			anIntArray37[local1++] = (int) (local16.aLong232 * -3750704643647536275L);
			this.anInt535 -= local16.anInt1526 * 1279598251;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray37, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray37, 0);
		}
		while (!this.aClass22_11.method418()) {
			local16 = (Class93_Sub14) this.aClass22_11.method408();
			OpenGL.glDeleteLists((int) (local16.aLong232 * -3750704643647536275L), local16.anInt1526 * 1279598251);
		}
		@Pc(215) Class93 local215;
		while (!this.aClass22_5.method418()) {
			local215 = this.aClass22_5.method408();
			OpenGL.glDeleteProgramARB((int) (local215.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_10.method418()) {
			local215 = this.aClass22_10.method408();
			OpenGL.glDeleteShader((int) (local215.aLong232 * -3750704643647536275L));
		}
		while (!this.aClass22_11.method418()) {
			local16 = (Class93_Sub14) this.aClass22_11.method408();
			OpenGL.glDeleteLists((int) (local16.aLong232 * -3750704643647536275L), local16.anInt1526 * 1279598251);
		}
		this.aClass201_1.method24637();
		if (this.method20819() > 100663296 && Class305.method26796() > this.aLong24 + 60000L) {
			System.gc();
			this.aLong24 = Class305.method26796();
		}
		this.anInt530 = local5;
	}

	@OriginalMember(owner = "client!afa", name = "uf", descriptor = "(II)V", line = 2529)
	final synchronized void method3897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_6.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zd", descriptor = "(II)V", line = 2529)
	final synchronized void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_6.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zu", descriptor = "(II)V", line = 2529)
	final synchronized void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_6.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "uz", descriptor = "(II)V", line = 2535)
	final synchronized void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_7.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "ze", descriptor = "(II)V", line = 2535)
	final synchronized void method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_7.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zv", descriptor = "(II)V", line = 2535)
	final synchronized void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_7.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "ug", descriptor = "(I)V", line = 2541)
	final synchronized void method3829(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg0);
		this.aClass22_8.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zc", descriptor = "(I)V", line = 2541)
	final synchronized void method3972(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg0);
		this.aClass22_8.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "ub", descriptor = "(II)V", line = 2546)
	final synchronized void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_9.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zp", descriptor = "(II)V", line = 2546)
	final synchronized void method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_9.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zz", descriptor = "(II)V", line = 2546)
	final synchronized void method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub14 local4 = new Class93_Sub14(arg1);
		local4.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_9.method407(local4);
	}

	@OriginalMember(owner = "client!afa", name = "zl", descriptor = "(J)V", line = 2552)
	final synchronized void method3797(@OriginalArg(0) long arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = arg0 * -284080703297520027L;
		this.aClass22_10.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "uj", descriptor = "(J)V", line = 2552)
	final synchronized void method3843(@OriginalArg(0) long arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = arg0 * -284080703297520027L;
		this.aClass22_10.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "zs", descriptor = "(J)V", line = 2552)
	final synchronized void method3974(@OriginalArg(0) long arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = arg0 * -284080703297520027L;
		this.aClass22_10.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "ut", descriptor = "(I)V", line = 2558)
	final synchronized void method3824(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_5.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "zg", descriptor = "(I)V", line = 2558)
	final synchronized void method3942(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_5.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "zb", descriptor = "(I)V", line = 2558)
	final synchronized void method3975(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = new Class93();
		local3.aLong232 = (long) arg0 * -284080703297520027L;
		this.aClass22_5.method407(local3);
	}

	@OriginalMember(owner = "client!afa", name = "aag", descriptor = "(I)V", line = 2564)
	void method3763(@OriginalArg(0) int arg0) {
		this.anInt559 = arg0;
		if (this.anInt559 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt559 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt559 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afa", name = "uk", descriptor = "(I)V", line = 2564)
	void method3825(@OriginalArg(0) int arg0) {
		this.anInt559 = arg0;
		if (this.anInt559 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt559 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt559 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zx", descriptor = "(I)V", line = 2564)
	void method3976(@OriginalArg(0) int arg0) {
		this.anInt559 = arg0;
		if (this.anInt559 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt559 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt559 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zr", descriptor = "(I)V", line = 2564)
	void method3977(@OriginalArg(0) int arg0) {
		this.anInt559 = arg0;
		if (this.anInt559 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt559 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt559 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afa", name = "zf", descriptor = "(I)V", line = 2564)
	void method3978(@OriginalArg(0) int arg0) {
		this.anInt559 = arg0;
		if (this.anInt559 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt559 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt559 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!afa", name = "aak", descriptor = "(Lclient!ck;)I", line = 2580)
	static int method3835(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
			case 0:
				return 6402;
			case 1:
			case 5:
			default:
				throw new IllegalStateException();
			case 2:
				return 6407;
			case 3:
				return 6410;
			case 4:
				return 6408;
			case 6:
				return 6406;
			case 7:
				return 6409;
		}
	}

	@OriginalMember(owner = "client!afa", name = "uy", descriptor = "(Lclient!ck;)I", line = 2580)
	static int method3926(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3388 * 811184495) {
			case 0:
				return 6402;
			case 1:
			case 5:
			default:
				throw new IllegalStateException();
			case 2:
				return 6407;
			case 3:
				return 6410;
			case 4:
				return 6408;
			case 6:
				return 6406;
			case 7:
				return 6409;
		}
	}

	@OriginalMember(owner = "client!afa", name = "uv", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 2599)
	static int method3826(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1 == Class226.aClass226_22) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 6407;
				case 3:
					return 6410;
				case 4:
					return 6408;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6406;
				case 7:
					return 6409;
			}
		} else if (arg1 == Class226.aClass226_23) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33189;
				case 1:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 2:
					return 32852;
				case 3:
					return 36219;
				case 4:
					return 32859;
				case 6:
					return 32830;
				case 7:
					return 32834;
			}
		} else if (arg1 == Class226.aClass226_26) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_24) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34843;
				case 3:
					return 34847;
				case 4:
					return 34842;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34844;
				case 7:
					return 34846;
			}
		} else if (arg1 == Class226.aClass226_19) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34837;
				case 3:
					return 34841;
				case 4:
					return 34836;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34838;
				case 7:
					return 34840;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aad", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 2599)
	static int method3979(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1 == Class226.aClass226_22) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 6407;
				case 3:
					return 6410;
				case 4:
					return 6408;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6406;
				case 7:
					return 6409;
			}
		} else if (arg1 == Class226.aClass226_23) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33189;
				case 1:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 2:
					return 32852;
				case 3:
					return 36219;
				case 4:
					return 32859;
				case 6:
					return 32830;
				case 7:
					return 32834;
			}
		} else if (arg1 == Class226.aClass226_26) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_24) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34843;
				case 3:
					return 34847;
				case 4:
					return 34842;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34844;
				case 7:
					return 34846;
			}
		} else if (arg1 == Class226.aClass226_19) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34837;
				case 3:
					return 34841;
				case 4:
					return 34836;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34838;
				case 7:
					return 34840;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afa", name = "aaa", descriptor = "(Lclient!ck;Lclient!dg;)I", line = 2599)
	static int method3980(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1) {
		if (arg1 == Class226.aClass226_22) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 6407;
				case 3:
					return 6410;
				case 4:
					return 6408;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 6406;
				case 7:
					return 6409;
			}
		} else if (arg1 == Class226.aClass226_23) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33189;
				case 1:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 2:
					return 32852;
				case 3:
					return 36219;
				case 4:
					return 32859;
				case 6:
					return 32830;
				case 7:
					return 32834;
			}
		} else if (arg1 == Class226.aClass226_26) {
			switch(arg0.anInt3388 * 811184495) {
				case 0:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class226.aClass226_24) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34843;
				case 3:
					return 34847;
				case 4:
					return 34842;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34844;
				case 7:
					return 34846;
			}
		} else if (arg1 == Class226.aClass226_19) {
			switch(arg0.anInt3388 * 811184495) {
				case 2:
					return 34837;
				case 3:
					return 34841;
				case 4:
					return 34836;
				case 5:
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34838;
				case 7:
					return 34840;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!afa", name = "eh", descriptor = "(Z)V", line = 2676)
	@Override
	public void method20552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!afa", name = "fk", descriptor = "(Z)V", line = 2676)
	@Override
	public void method20587() {
	}

	@OriginalMember(owner = "client!afa", name = "fh", descriptor = "(Z)V", line = 2676)
	@Override
	public void method20588() {
	}

	@OriginalMember(owner = "client!afa", name = "fr", descriptor = "(Z)V", line = 2676)
	@Override
	public void method20589() {
	}

	@OriginalMember(owner = "client!afa", name = "gu", descriptor = "(Z)V", line = 2676)
	@Override
	public void method20590() {
	}
}
