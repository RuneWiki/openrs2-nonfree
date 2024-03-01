package com.jagex;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!abv")
public abstract class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!abv", name = "ak", descriptor = "I")
	static final int anInt2479 = 1;

	@OriginalMember(owner = "client!abv", name = "as", descriptor = "I")
	static final int anInt2480 = 7;

	@OriginalMember(owner = "client!abv", name = "aj", descriptor = "I")
	static final int anInt2481 = 55;

	@OriginalMember(owner = "client!abv", name = "eo", descriptor = "I")
	static final int anInt2486 = 1;

	@OriginalMember(owner = "client!abv", name = "af", descriptor = "I")
	static final int anInt2488 = 128;

	@OriginalMember(owner = "client!abv", name = "an", descriptor = "I")
	static final int anInt2504 = 8;

	@OriginalMember(owner = "client!abv", name = "ah", descriptor = "I")
	static final int anInt2514 = 4;

	@OriginalMember(owner = "client!abv", name = "aa", descriptor = "I")
	static final int anInt2515 = 2;

	@OriginalMember(owner = "client!abv", name = "ei", descriptor = "I")
	static final int anInt2517 = 3;

	@OriginalMember(owner = "client!abv", name = "el", descriptor = "I")
	static final int anInt2518 = 4;

	@OriginalMember(owner = "client!abv", name = "ek", descriptor = "I")
	static final int anInt2523 = 2;

	@OriginalMember(owner = "client!abv", name = "ai", descriptor = "I")
	protected static final int anInt2527 = 100663296;

	@OriginalMember(owner = "client!abv", name = "k", descriptor = "Ljava/lang/Object;")
	static final Object anObject4 = new Object();

	@OriginalMember(owner = "client!abv", name = "bf", descriptor = "Lclient!mq;")
	static final Class328 aClass328_89 = new Class328();

	@OriginalMember(owner = "client!abv", name = "ck", descriptor = "F")
	float aFloat183;

	@OriginalMember(owner = "client!abv", name = "et", descriptor = "Lclient!it;")
	Class244 aClass244_3;

	@OriginalMember(owner = "client!abv", name = "ev", descriptor = "Lclient!aku;")
	Class40_Sub1_Sub2 aClass40_Sub1_Sub2_3;

	@OriginalMember(owner = "client!abv", name = "av", descriptor = "Z")
	protected boolean aBoolean422;

	@OriginalMember(owner = "client!abv", name = "ed", descriptor = "Lclient!akg;")
	Class40_Sub1_Sub1 aClass40_Sub1_Sub1_5;

	@OriginalMember(owner = "client!abv", name = "am", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!abv", name = "au", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!abv", name = "ag", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!abv", name = "ft", descriptor = "I")
	int anInt2485;

	@OriginalMember(owner = "client!abv", name = "fo", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!abv", name = "gd", descriptor = "Z")
	protected boolean aBoolean423;

	@OriginalMember(owner = "client!abv", name = "ar", descriptor = "I")
	protected int anInt2490;

	@OriginalMember(owner = "client!abv", name = "bv", descriptor = "F")
	float aFloat186;

	@OriginalMember(owner = "client!abv", name = "bz", descriptor = "F")
	float aFloat187;

	@OriginalMember(owner = "client!abv", name = "di", descriptor = "[Lclient!ja;")
	protected Class251[] aClass251Array5;

	@OriginalMember(owner = "client!abv", name = "gt", descriptor = "Lclient!iy;")
	Class37 aClass37_17;

	@OriginalMember(owner = "client!abv", name = "ea", descriptor = "Lclient!hr;")
	Class31 aClass31_3;

	@OriginalMember(owner = "client!abv", name = "fm", descriptor = "Z")
	protected boolean aBoolean432;

	@OriginalMember(owner = "client!abv", name = "ee", descriptor = "I")
	protected int anInt2507;

	@OriginalMember(owner = "client!abv", name = "dd", descriptor = "[Lclient!afz;")
	protected Class3_Sub15[] aClass3_Sub15Array19;

	@OriginalMember(owner = "client!abv", name = "da", descriptor = "I")
	protected int anInt2508;

	@OriginalMember(owner = "client!abv", name = "dz", descriptor = "I")
	protected int anInt2509;

	@OriginalMember(owner = "client!abv", name = "dj", descriptor = "I")
	int anInt2512;

	@OriginalMember(owner = "client!abv", name = "dx", descriptor = "I")
	int anInt2513;

	@OriginalMember(owner = "client!abv", name = "dw", descriptor = "[Lclient!jl;")
	Interface28[] anInterface28Array3;

	@OriginalMember(owner = "client!abv", name = "du", descriptor = "[Lclient!mq;")
	protected Class328[] aClass328Array6;

	@OriginalMember(owner = "client!abv", name = "eb", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_23;

	@OriginalMember(owner = "client!abv", name = "ef", descriptor = "Lclient!ic;")
	Interface20 anInterface20_24;

	@OriginalMember(owner = "client!abv", name = "ey", descriptor = "Lclient!aan;")
	Class6_Sub2 aClass6_Sub2_5;

	@OriginalMember(owner = "client!abv", name = "er", descriptor = "Lclient!aan;")
	Class6_Sub2 aClass6_Sub2_6;

	@OriginalMember(owner = "client!abv", name = "gz", descriptor = "Lclient!iy;")
	Class37 aClass37_18;

	@OriginalMember(owner = "client!abv", name = "ew", descriptor = "Lclient!ig;")
	Class40 aClass40_3;

	@OriginalMember(owner = "client!abv", name = "ec", descriptor = "Lclient!hn;")
	Class32 aClass32_3;

	@OriginalMember(owner = "client!abv", name = "ez", descriptor = "Lclient!hy;")
	Class36 aClass36_3;

	@OriginalMember(owner = "client!abv", name = "ep", descriptor = "Lclient!hw;")
	Class39 aClass39_3;

	@OriginalMember(owner = "client!abv", name = "eq", descriptor = "Lclient!akg;")
	Class40_Sub1_Sub1 aClass40_Sub1_Sub1_6;

	@OriginalMember(owner = "client!abv", name = "gv", descriptor = "Lclient!if;")
	Interface21 anInterface21_15;

	@OriginalMember(owner = "client!abv", name = "eg", descriptor = "Lclient!abz;")
	Class18_Sub2 aClass18_Sub2_3;

	@OriginalMember(owner = "client!abv", name = "es", descriptor = "Z")
	boolean aBoolean435;

	@OriginalMember(owner = "client!abv", name = "fp", descriptor = "Lclient!dz;")
	Class139 aClass139_6;

	@OriginalMember(owner = "client!abv", name = "dn", descriptor = "[Lclient!ja;")
	protected Class251[] aClass251Array6;

	@OriginalMember(owner = "client!abv", name = "fu", descriptor = "F")
	protected float aFloat198;

	@OriginalMember(owner = "client!abv", name = "fg", descriptor = "F")
	protected float aFloat199;

	@OriginalMember(owner = "client!abv", name = "gp", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!abv", name = "gf", descriptor = "Z")
	protected boolean aBoolean439;

	@OriginalMember(owner = "client!abv", name = "fk", descriptor = "Lclient!jc;")
	Class253 aClass253_3;

	@OriginalMember(owner = "client!abv", name = "gy", descriptor = "Z")
	protected boolean aBoolean441;

	@OriginalMember(owner = "client!abv", name = "fl", descriptor = "I")
	int anInt2524;

	@OriginalMember(owner = "client!abv", name = "fa", descriptor = "I")
	public int anInt2525;

	@OriginalMember(owner = "client!abv", name = "fq", descriptor = "I")
	protected int anInt2526;

	@OriginalMember(owner = "client!abv", name = "fc", descriptor = "Z")
	public boolean aBoolean443;

	@OriginalMember(owner = "client!abv", name = "fi", descriptor = "Z")
	protected boolean aBoolean444;

	@OriginalMember(owner = "client!abv", name = "fr", descriptor = "Z")
	protected boolean aBoolean445;

	@OriginalMember(owner = "client!abv", name = "ab", descriptor = "Lclient!ir;")
	Class243 aClass243_5;

	@OriginalMember(owner = "client!abv", name = "ge", descriptor = "Z")
	protected boolean aBoolean447;

	@OriginalMember(owner = "client!abv", name = "gj", descriptor = "Z")
	protected boolean aBoolean448;

	@OriginalMember(owner = "client!abv", name = "gm", descriptor = "Lclient!if;")
	Interface21 anInterface21_16;

	@OriginalMember(owner = "client!abv", name = "gn", descriptor = "Lclient!if;")
	Interface21 anInterface21_17;

	@OriginalMember(owner = "client!abv", name = "do", descriptor = "[Lclient!jz;")
	protected Class268[] aClass268Array3;

	@OriginalMember(owner = "client!abv", name = "gh", descriptor = "Lclient!iy;")
	Class37 aClass37_19;

	@OriginalMember(owner = "client!abv", name = "gq", descriptor = "Lclient!iy;")
	Class37 aClass37_20;

	@OriginalMember(owner = "client!abv", name = "en", descriptor = "Lclient!jx;")
	Class266 aClass266_3;

	@OriginalMember(owner = "client!abv", name = "ga", descriptor = "Lclient!iy;")
	Class37 aClass37_21;

	@OriginalMember(owner = "client!abv", name = "gr", descriptor = "Lclient!iy;")
	Class37 aClass37_22;

	@OriginalMember(owner = "client!abv", name = "gx", descriptor = "Lclient!jw;")
	Interface30 anInterface30_4;

	@OriginalMember(owner = "client!abv", name = "cm", descriptor = "F")
	float aFloat200;

	@OriginalMember(owner = "client!abv", name = "go", descriptor = "Z")
	protected boolean aBoolean449;

	@OriginalMember(owner = "client!abv", name = "at", descriptor = "Lclient!zd;")
	Class617 aClass617_3 = new Class617();

	@OriginalMember(owner = "client!abv", name = "ao", descriptor = "I")
	final int anInt2482 = 4194304;

	@OriginalMember(owner = "client!abv", name = "ay", descriptor = "Lclient!wk;")
	Class553 aClass553_37 = new Class553();

	@OriginalMember(owner = "client!abv", name = "ae", descriptor = "Lclient!mu;")
	Class332 aClass332_36 = new Class332();

	@OriginalMember(owner = "client!abv", name = "ad", descriptor = "Lclient!mq;")
	Class328 aClass328_87 = new Class328();

	@OriginalMember(owner = "client!abv", name = "aw", descriptor = "Lclient!mu;")
	Class332 aClass332_41 = new Class332();

	@OriginalMember(owner = "client!abv", name = "ac", descriptor = "Lclient!mu;")
	Class332 aClass332_39 = new Class332();

	@OriginalMember(owner = "client!abv", name = "bw", descriptor = "Lclient!mq;")
	public Class328 aClass328_78 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bp", descriptor = "Lclient!mq;")
	Class328 aClass328_92 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bd", descriptor = "Lclient!mq;")
	Class328 aClass328_79 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bs", descriptor = "Lclient!mu;")
	Class332 aClass332_37 = new Class332();

	@OriginalMember(owner = "client!abv", name = "bm", descriptor = "Lclient!mq;")
	Class328 aClass328_80 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bt", descriptor = "Lclient!mu;")
	Class332 aClass332_38 = new Class332();

	@OriginalMember(owner = "client!abv", name = "bk", descriptor = "Lclient!mq;")
	protected Class328 aClass328_86 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bg", descriptor = "Lclient!mq;")
	Class328 aClass328_88 = new Class328();

	@OriginalMember(owner = "client!abv", name = "br", descriptor = "Lclient!mh;")
	Class320 aClass320_59 = new Class320();

	@OriginalMember(owner = "client!abv", name = "bb", descriptor = "[F")
	float[] aFloatArray75 = new float[4];

	@OriginalMember(owner = "client!abv", name = "by", descriptor = "Z")
	boolean aBoolean446 = false;

	@OriginalMember(owner = "client!abv", name = "bl", descriptor = "Lclient!ie;")
	Class234 aClass234_3 = Class234.aClass234_6;

	@OriginalMember(owner = "client!abv", name = "bi", descriptor = "Z")
	boolean aBoolean426 = false;

	@OriginalMember(owner = "client!abv", name = "bu", descriptor = "Lclient!mq;")
	Class328 aClass328_77 = new Class328();

	@OriginalMember(owner = "client!abv", name = "ba", descriptor = "Lclient!mq;")
	Class328 aClass328_90 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bo", descriptor = "Z")
	boolean aBoolean427 = false;

	@OriginalMember(owner = "client!abv", name = "bc", descriptor = "Lclient!mq;")
	Class328 aClass328_91 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bn", descriptor = "Lclient!mq;")
	Class328 aClass328_81 = new Class328();

	@OriginalMember(owner = "client!abv", name = "be", descriptor = "Lclient!mq;")
	Class328 aClass328_82 = this.aClass328_81;

	@OriginalMember(owner = "client!abv", name = "bx", descriptor = "Lclient!mq;")
	public Class328 aClass328_83 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bh", descriptor = "Lclient!mq;")
	Class328 aClass328_84 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bj", descriptor = "Lclient!mq;")
	public Class328 aClass328_85 = new Class328();

	@OriginalMember(owner = "client!abv", name = "bq", descriptor = "[[F")
	float[][] aFloatArrayArray21 = new float[6][4];

	@OriginalMember(owner = "client!abv", name = "cj", descriptor = "F")
	protected float aFloat188 = 0.0F;

	@OriginalMember(owner = "client!abv", name = "cu", descriptor = "F")
	protected float aFloat189 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "cv", descriptor = "F")
	float aFloat190 = 0.0F;

	@OriginalMember(owner = "client!abv", name = "cl", descriptor = "F")
	float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "cq", descriptor = "F")
	protected float aFloat184 = 50.0F;

	@OriginalMember(owner = "client!abv", name = "cg", descriptor = "F")
	protected float aFloat192 = 3584.0F;

	@OriginalMember(owner = "client!abv", name = "cp", descriptor = "I")
	protected int anInt2493 = 0;

	@OriginalMember(owner = "client!abv", name = "cc", descriptor = "I")
	protected int anInt2494 = 0;

	@OriginalMember(owner = "client!abv", name = "cs", descriptor = "I")
	protected int anInt2495 = 0;

	@OriginalMember(owner = "client!abv", name = "ct", descriptor = "I")
	protected int anInt2496 = 0;

	@OriginalMember(owner = "client!abv", name = "cx", descriptor = "I")
	int anInt2489 = 0;

	@OriginalMember(owner = "client!abv", name = "cy", descriptor = "I")
	int anInt2505 = 0;

	@OriginalMember(owner = "client!abv", name = "cb", descriptor = "I")
	int anInt2497 = 0;

	@OriginalMember(owner = "client!abv", name = "cz", descriptor = "I")
	int anInt2498 = 0;

	@OriginalMember(owner = "client!abv", name = "cn", descriptor = "I")
	protected int anInt2499 = 0;

	@OriginalMember(owner = "client!abv", name = "co", descriptor = "I")
	protected int anInt2500 = 0;

	@OriginalMember(owner = "client!abv", name = "cd", descriptor = "I")
	protected int anInt2501 = 0;

	@OriginalMember(owner = "client!abv", name = "ch", descriptor = "I")
	protected int anInt2506 = 0;

	@OriginalMember(owner = "client!abv", name = "ci", descriptor = "I")
	protected int anInt2528 = 0;

	@OriginalMember(owner = "client!abv", name = "ca", descriptor = "I")
	protected int anInt2503 = 0;

	@OriginalMember(owner = "client!abv", name = "cr", descriptor = "Z")
	protected boolean aBoolean434 = true;

	@OriginalMember(owner = "client!abv", name = "ce", descriptor = "Z")
	protected boolean aBoolean429 = false;

	@OriginalMember(owner = "client!abv", name = "cw", descriptor = "Z")
	protected boolean aBoolean428 = false;

	@OriginalMember(owner = "client!abv", name = "cf", descriptor = "Z")
	protected boolean aBoolean430 = false;

	@OriginalMember(owner = "client!abv", name = "dv", descriptor = "Z")
	protected boolean aBoolean431 = true;

	@OriginalMember(owner = "client!abv", name = "df", descriptor = "Z")
	protected boolean aBoolean425 = false;

	@OriginalMember(owner = "client!abv", name = "dh", descriptor = "[F")
	public float[] aFloatArray76 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!abv", name = "db", descriptor = "[F")
	protected float[] aFloatArray77 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!abv", name = "dp", descriptor = "[F")
	float[] aFloatArray78 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!abv", name = "dk", descriptor = "[F")
	float[] aFloatArray79 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!abv", name = "dy", descriptor = "I")
	int anInt2491 = 16777215;

	@OriginalMember(owner = "client!abv", name = "dg", descriptor = "F")
	public float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "dq", descriptor = "F")
	public float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "ds", descriptor = "F")
	public float aFloat185 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "dr", descriptor = "F")
	protected float aFloat197 = 1.0F;

	@OriginalMember(owner = "client!abv", name = "dc", descriptor = "F")
	public float aFloat195 = -1.0F;

	@OriginalMember(owner = "client!abv", name = "dt", descriptor = "F")
	protected float aFloat196 = -1.0F;

	@OriginalMember(owner = "client!abv", name = "de", descriptor = "I")
	int anInt2510 = 8;

	@OriginalMember(owner = "client!abv", name = "dl", descriptor = "I")
	int anInt2511 = 3;

	@OriginalMember(owner = "client!abv", name = "dm", descriptor = "I")
	protected int anInt2516 = 0;

	@OriginalMember(owner = "client!abv", name = "ej", descriptor = "Z")
	boolean aBoolean424 = false;

	@OriginalMember(owner = "client!abv", name = "em", descriptor = "[Lclient!ig;")
	final Class40[] aClass40Array3 = new Class40[16];

	@OriginalMember(owner = "client!abv", name = "eu", descriptor = "[Lclient!is;")
	final Class38[] aClass38Array3 = new Class38[4];

	@OriginalMember(owner = "client!abv", name = "eh", descriptor = "Z")
	boolean aBoolean436 = false;

	@OriginalMember(owner = "client!abv", name = "fn", descriptor = "Z")
	protected boolean aBoolean437 = true;

	@OriginalMember(owner = "client!abv", name = "fs", descriptor = "I")
	protected int anInt2519 = -1;

	@OriginalMember(owner = "client!abv", name = "fx", descriptor = "I")
	protected int anInt2520 = -1;

	@OriginalMember(owner = "client!abv", name = "fh", descriptor = "I")
	protected int anInt2521 = 0;

	@OriginalMember(owner = "client!abv", name = "fb", descriptor = "I")
	int anInt2492 = 1;

	@OriginalMember(owner = "client!abv", name = "fd", descriptor = "I")
	protected int anInt2478 = -1;

	@OriginalMember(owner = "client!abv", name = "fz", descriptor = "Lclient!jm;")
	protected Class258 aClass258_3 = Class258.aClass258_6;

	@OriginalMember(owner = "client!abv", name = "fv", descriptor = "Z")
	protected boolean aBoolean440 = true;

	@OriginalMember(owner = "client!abv", name = "fy", descriptor = "Z")
	protected boolean aBoolean433 = true;

	@OriginalMember(owner = "client!abv", name = "fe", descriptor = "B")
	protected byte aByte78 = 0;

	@OriginalMember(owner = "client!abv", name = "ff", descriptor = "Z")
	boolean aBoolean442 = false;

	@OriginalMember(owner = "client!abv", name = "gk", descriptor = "[Lclient!abw;")
	Class20_Sub2[] aClass20_Sub2Array6;

	@OriginalMember(owner = "client!abv", name = "gs", descriptor = "[Lclient!abw;")
	Class20_Sub2[] aClass20_Sub2Array5;

	@OriginalMember(owner = "client!abv", name = "gc", descriptor = "Lclient!mq;")
	Class328 aClass328_93;

	@OriginalMember(owner = "client!abv", name = "gw", descriptor = "Lclient!mu;")
	Class332 aClass332_40;

	@OriginalMember(owner = "client!abv", name = "aq", descriptor = "Lclient!ny;")
	final Class359 aClass359_29;

	@OriginalMember(owner = "client!abv", name = "fw", descriptor = "I")
	public final int anInt2522;

	@OriginalMember(owner = "client!abv", name = "fj", descriptor = "I")
	int anInt2502;

	@OriginalMember(owner = "client!abv", name = "ex", descriptor = "Lclient!iw;")
	final Class247 aClass247_3;

	@OriginalMember(owner = "client!abv", name = "ax", descriptor = "[I")
	int[] anIntArray250;

	@OriginalMember(owner = "client!abv", name = "ap", descriptor = "Lsun/misc/Unsafe;")
	public Unsafe anUnsafe3;

	@OriginalMember(owner = "client!abv", name = "az", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!abv", name = "al", descriptor = "J")
	public long aLong101;

	@OriginalMember(owner = "client!abv", name = "po", descriptor = "(Lclient!ih;)V", line = 224)
	public void method17583(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33696(arg0, anObject4);
	}

	@OriginalMember(owner = "client!abv", name = "te", descriptor = "(Lclient!ih;)V", line = 224)
	public void method17593(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33696(arg0, anObject4);
	}

	@OriginalMember(owner = "client!abv", name = "uy", descriptor = "(Lclient!ih;)V", line = 224)
	public void method17595(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33696(arg0, anObject4);
	}

	@OriginalMember(owner = "client!abv", name = "uh", descriptor = "(Lclient!ih;)V", line = 224)
	public void method17634(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33696(arg0, anObject4);
	}

	@OriginalMember(owner = "client!abv", name = "tt", descriptor = "(Lclient!ih;)V", line = 224)
	public void method17804(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33696(arg0, anObject4);
	}

	@OriginalMember(owner = "client!abv", name = "pd", descriptor = "(Lclient!ih;)V", line = 228)
	public void method17430(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33703(arg0);
	}

	@OriginalMember(owner = "client!abv", name = "uw", descriptor = "(Lclient!ih;)V", line = 228)
	public void method17473(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33703(arg0);
	}

	@OriginalMember(owner = "client!abv", name = "ub", descriptor = "(Lclient!ih;)V", line = 228)
	public void method17597(@OriginalArg(0) Interface22 arg0) {
		this.aClass617_3.method33703(arg0);
	}

	@OriginalMember(owner = "client!abv", name = "uc", descriptor = "()V", line = 232)
	void method17599() {
		@Pc(4) ArrayList local4 = this.aClass617_3.method33698();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface22 local14 = (Interface22) local7.next();
			local14.method27209();
		}
	}

	@OriginalMember(owner = "client!abv", name = "pc", descriptor = "()V", line = 232)
	void method17718() {
		@Pc(4) ArrayList local4 = this.aClass617_3.method33698();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface22 local14 = (Interface22) local7.next();
			local14.method27209();
		}
	}

	@OriginalMember(owner = "client!abv", name = "pi", descriptor = "()Z", line = 245)
	final boolean method17547() {
		return this.aBoolean422;
	}

	@OriginalMember(owner = "client!abv", name = "ux", descriptor = "()Z", line = 245)
	final boolean method17601() {
		return this.aBoolean422;
	}

	@OriginalMember(owner = "client!abv", name = "ul", descriptor = "()Z", line = 245)
	final boolean method17614() {
		return this.aBoolean422;
	}

	@OriginalMember(owner = "client!abv", name = "pz", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 252)
	byte[] method17436(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass359_29.method26691(arg0, arg1);
	}

	@OriginalMember(owner = "client!abv", name = "pk", descriptor = "([B)Lclient!fi;", line = 257)
	Class173 method17437(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class173(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "uz", descriptor = "([B)Lclient!fi;", line = 257)
	Class173 method17580(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class173(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "uv", descriptor = "([B)Lclient!fi;", line = 257)
	Class173 method17606(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class173(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ue", descriptor = "([B)Lclient!fi;", line = 257)
	Class173 method17607(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class173(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ug", descriptor = "([B)Lclient!fi;", line = 257)
	Class173 method17780(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class173(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "pm", descriptor = "()V", line = 272)
	public static void method17439() throws Exception_Sub6 {
		Class289.method25518().method27797("jaclib");
	}

	@OriginalMember(owner = "client!abv", name = "uk", descriptor = "()V", line = 272)
	public static void method17609() throws Exception_Sub6 {
		Class289.method25518().method27797("jaclib");
	}

	@OriginalMember(owner = "client!abv", name = "ud", descriptor = "()V", line = 272)
	public static void method17610() throws Exception_Sub6 {
		Class289.method25518().method27797("jaclib");
	}

	@OriginalMember(owner = "client!abv", name = "<init>", descriptor = "(Lclient!ds;Lclient!di;Lclient!ny;II)V", line = 276)
	Class21_Sub3(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1);
		new Stream();
		this.aClass20_Sub2Array6 = new Class20_Sub2[8];
		this.aClass20_Sub2Array5 = new Class20_Sub2[8];
		this.aClass328_93 = new Class328();
		this.aClass332_40 = new Class332();
		try {
			this.aClass359_29 = arg2;
			this.anInt2522 = arg3;
			this.anInt2502 = arg4;
			Class5.method743(false, true);
			if (this.anInterface11_6 == null) {
				this.aClass247_3 = null;
			} else {
				this.aClass247_3 = new Class247(this, this.anInterface11_6);
			}
			if (this.anInt2502 == 0) {
				this.anIntArray250 = Class360.anIntArray422;
			} else {
				this.anIntArray250 = Class179.anIntArray372;
			}
			try {
				@Pc(440) Field local440 = Unsafe.class.getDeclaredField("theUnsafe");
				local440.setAccessible(true);
				this.anUnsafe3 = (Unsafe) local440.get(null);
			} catch (@Pc(451) Exception local451) {
			}
			this.aByteBuffer4 = ByteBuffer.allocateDirect(4194304);
			this.aByteBuffer4.order(ByteOrder.nativeOrder());
			this.aLong101 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer4);
		} catch (@Pc(467) Throwable local467) {
			local467.printStackTrace();
			this.method17020();
			if (local467 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local467;
			}
			throw new RuntimeException("");
		}
		this.method17084(this.method17348(131072));
	}

	@OriginalMember(owner = "client!abv", name = "pq", descriptor = "()V", line = 309)
	public final void method17585() {
		this.anInterface28Array3 = new Interface28[this.anInt2525];
		this.aClass328Array6 = new Class328[this.anInt2525];
		this.aClass268Array3 = new Class268[this.anInt2525];
		this.aClass251Array5 = new Class251[this.anInt2525];
		this.aClass251Array6 = new Class251[this.anInt2525];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2525; local26++) {
			this.aClass251Array6[local26] = Class251.aClass251_2;
			this.aClass251Array5[local26] = Class251.aClass251_2;
			this.aClass268Array3[local26] = Class268.aClass268_1;
			this.aClass328Array6[local26] = new Class328();
		}
		this.aClass3_Sub15Array19 = new Class3_Sub15[this.anInt2526 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface20_23 = this.method17507(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface20_24 = this.method17507(1, 1, false, local68, 0, 0);
		this.method17084(new Class3_Sub11_Sub2(262144));
		this.aClass37_21 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7 }) });
		this.aClass37_22 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5 }) });
		this.aClass37_17 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11), new Class252(Class240.aClass240_5), new Class252(Class240.aClass240_7), new Class252(Class240.aClass240_2) });
		this.aClass37_20 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11), new Class252(Class240.aClass240_5), new Class252(Class240.aClass240_7) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass20_Sub2Array6[local205] = new Class20_Sub2(this, 0, 0, false, false);
			this.aClass20_Sub2Array5[local205] = new Class20_Sub2(this, 0, 0, true, true);
		}
		this.method17442();
		this.anInterface30_4 = this.method17648(true);
		this.method17443();
		this.method17056();
		this.method17302();
		this.aClass6_Sub2_5 = new Class6_Sub2(this, this.anInterface20_23);
		this.aClass6_Sub2_6 = new Class6_Sub2(this, this.anInterface20_24);
		this.method17061(3, 0);
	}

	@OriginalMember(owner = "client!abv", name = "pp", descriptor = "()V", line = 345)
	final void method17442() {
		this.aClass243_5 = new Class243(this);
		this.aBoolean422 = false;
		try {
			this.aClass32_3 = new Class32_Sub1(this);
			this.aClass31_3 = new Class31_Sub1(this);
			this.aClass36_3 = new Class36_Sub2(this);
			this.aClass39_3 = new Class39_Sub2(this);
			this.aClass40_Sub1_Sub1_5 = new Class40_Sub1_Sub1(this, this.aClass243_5, false);
			this.aClass40_Sub1_Sub1_6 = new Class40_Sub1_Sub1(this, this.aClass243_5, true);
			this.aClass40_Sub1_Sub2_3 = new Class40_Sub1_Sub2(this, this.aClass243_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass32_3 = new Class32_Sub2(this);
			this.aClass31_3 = new Class31_Sub2(this);
			this.aClass36_3 = new Class36_Sub1(this);
			this.aClass39_3 = new Class39_Sub1(this);
			this.aClass40_Sub1_Sub1_5 = null;
			this.aClass40_Sub1_Sub1_6 = null;
			this.aClass40_Sub1_Sub2_3 = null;
			this.aBoolean422 = true;
		}
		if (!this.aBoolean422 && !this.aBoolean423) {
			@Pc(111) int local111;
			@Pc(115) int local115;
			if (this.aClass19_6 == null) {
				local115 = 0;
				local111 = 0;
			} else {
				local111 = this.aClass19_6.method21390();
				local115 = this.aClass19_6.method21391();
			}
			this.aClass244_3 = new Class244(this, local111, local115);
			this.aClass38Array3[3] = new Class38_Sub1(this);
			this.aClass38Array3[1] = new Class38_Sub3(this);
			this.aClass38Array3[2] = new Class38_Sub2(this);
			this.aClass244_3.method24768(this.aClass38Array3[3]);
			this.aClass244_3.method24768(this.aClass38Array3[1]);
			this.aClass244_3.method24768(this.aClass38Array3[2]);
			this.method17457();
			this.method17809();
		}
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16947();
			this.aClass40_3 = null;
		}
		this.method17446();
	}

	@OriginalMember(owner = "client!abv", name = "un", descriptor = "()V", line = 345)
	final void method17611() {
		this.aClass243_5 = new Class243(this);
		this.aBoolean422 = false;
		try {
			this.aClass32_3 = new Class32_Sub1(this);
			this.aClass31_3 = new Class31_Sub1(this);
			this.aClass36_3 = new Class36_Sub2(this);
			this.aClass39_3 = new Class39_Sub2(this);
			this.aClass40_Sub1_Sub1_5 = new Class40_Sub1_Sub1(this, this.aClass243_5, false);
			this.aClass40_Sub1_Sub1_6 = new Class40_Sub1_Sub1(this, this.aClass243_5, true);
			this.aClass40_Sub1_Sub2_3 = new Class40_Sub1_Sub2(this, this.aClass243_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass32_3 = new Class32_Sub2(this);
			this.aClass31_3 = new Class31_Sub2(this);
			this.aClass36_3 = new Class36_Sub1(this);
			this.aClass39_3 = new Class39_Sub1(this);
			this.aClass40_Sub1_Sub1_5 = null;
			this.aClass40_Sub1_Sub1_6 = null;
			this.aClass40_Sub1_Sub2_3 = null;
			this.aBoolean422 = true;
		}
		if (!this.aBoolean422 && !this.aBoolean423) {
			@Pc(111) int local111;
			@Pc(115) int local115;
			if (this.aClass19_6 == null) {
				local115 = 0;
				local111 = 0;
			} else {
				local111 = this.aClass19_6.method21390();
				local115 = this.aClass19_6.method21391();
			}
			this.aClass244_3 = new Class244(this, local111, local115);
			this.aClass38Array3[3] = new Class38_Sub1(this);
			this.aClass38Array3[1] = new Class38_Sub3(this);
			this.aClass38Array3[2] = new Class38_Sub2(this);
			this.aClass244_3.method24768(this.aClass38Array3[3]);
			this.aClass244_3.method24768(this.aClass38Array3[1]);
			this.aClass244_3.method24768(this.aClass38Array3[2]);
			this.method17457();
			this.method17809();
		}
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16947();
			this.aClass40_3 = null;
		}
		this.method17446();
	}

	@OriginalMember(owner = "client!abv", name = "pb", descriptor = "()V", line = 396)
	void method17443() {
		this.method17532(7);
		this.method17522();
	}

	@OriginalMember(owner = "client!abv", name = "uj", descriptor = "()V", line = 396)
	void method17612() {
		this.method17532(7);
		this.method17522();
	}

	@OriginalMember(owner = "client!abv", name = "uo", descriptor = "()V", line = 396)
	void method17613() {
		this.method17532(7);
		this.method17522();
	}

	@OriginalMember(owner = "client!abv", name = "us", descriptor = "()V", line = 396)
	void method17624() {
		this.method17532(7);
		this.method17522();
	}

	@OriginalMember(owner = "client!abv", name = "pe", descriptor = "()V", line = 401)
	final void method17522() {
		this.method17494();
		this.method17495();
		this.method17493();
		this.method17647();
		this.method17496();
		this.method17497();
		this.method17536();
		this.method17793();
		this.method17490();
		this.method17462();
		this.method17538();
		this.method17535();
		this.method17534();
		this.method17441();
		for (@Pc(32) int local32 = this.anInt2525 - 1; local32 >= 0; local32--) {
			this.method17512(local32);
			this.method17525();
			this.method17526();
			this.method17521();
		}
		this.method17678();
		this.method17570();
	}

	@OriginalMember(owner = "client!abv", name = "uf", descriptor = "()V", line = 401)
	final void method17567() {
		this.method17494();
		this.method17495();
		this.method17493();
		this.method17647();
		this.method17496();
		this.method17497();
		this.method17536();
		this.method17793();
		this.method17490();
		this.method17462();
		this.method17538();
		this.method17535();
		this.method17534();
		this.method17441();
		for (@Pc(32) int local32 = this.anInt2525 - 1; local32 >= 0; local32--) {
			this.method17512(local32);
			this.method17525();
			this.method17526();
			this.method17521();
		}
		this.method17678();
		this.method17570();
	}

	@OriginalMember(owner = "client!abv", name = "up", descriptor = "()V", line = 401)
	final void method17615() {
		this.method17494();
		this.method17495();
		this.method17493();
		this.method17647();
		this.method17496();
		this.method17497();
		this.method17536();
		this.method17793();
		this.method17490();
		this.method17462();
		this.method17538();
		this.method17535();
		this.method17534();
		this.method17441();
		for (@Pc(32) int local32 = this.anInt2525 - 1; local32 >= 0; local32--) {
			this.method17512(local32);
			this.method17525();
			this.method17526();
			this.method17521();
		}
		this.method17678();
		this.method17570();
	}

	@OriginalMember(owner = "client!abv", name = "vg", descriptor = "()V", line = 401)
	final void method17617() {
		this.method17494();
		this.method17495();
		this.method17493();
		this.method17647();
		this.method17496();
		this.method17497();
		this.method17536();
		this.method17793();
		this.method17490();
		this.method17462();
		this.method17538();
		this.method17535();
		this.method17534();
		this.method17441();
		for (@Pc(32) int local32 = this.anInt2525 - 1; local32 >= 0; local32--) {
			this.method17512(local32);
			this.method17525();
			this.method17526();
			this.method17521();
		}
		this.method17678();
		this.method17570();
	}

	@OriginalMember(owner = "client!abv", name = "vf", descriptor = "()V", line = 426)
	void method17618() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24777();
		}
		if (this.anInterface21_17 != null) {
			this.anInterface21_17.method27209();
		}
		if (this.anInterface21_16 != null) {
			this.anInterface21_16.method27209();
		}
		if (this.anInterface21_15 != null) {
			this.anInterface21_15.method27209();
		}
		for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
			if (this.aClass20_Sub2Array5[local25] != null) {
				this.aClass20_Sub2Array5[local25].method5284();
			}
		}
		if (this.aClass253_3 != null) {
			this.aClass253_3.method25214();
		}
		if (this.anInterface30_4 != null) {
			this.anInterface30_4.method27209();
		}
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25248();
		}
	}

	@OriginalMember(owner = "client!abv", name = "vt", descriptor = "()V", line = 426)
	void method17725() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24777();
		}
		if (this.anInterface21_17 != null) {
			this.anInterface21_17.method27209();
		}
		if (this.anInterface21_16 != null) {
			this.anInterface21_16.method27209();
		}
		if (this.anInterface21_15 != null) {
			this.anInterface21_15.method27209();
		}
		for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
			if (this.aClass20_Sub2Array5[local25] != null) {
				this.aClass20_Sub2Array5[local25].method5284();
			}
		}
		if (this.aClass253_3 != null) {
			this.aClass253_3.method25214();
		}
		if (this.anInterface30_4 != null) {
			this.anInterface30_4.method27209();
		}
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25248();
		}
	}

	@OriginalMember(owner = "client!abv", name = "pw", descriptor = "()V", line = 426)
	void method17734() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24777();
		}
		if (this.anInterface21_17 != null) {
			this.anInterface21_17.method27209();
		}
		if (this.anInterface21_16 != null) {
			this.anInterface21_16.method27209();
		}
		if (this.anInterface21_15 != null) {
			this.anInterface21_15.method27209();
		}
		for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
			if (this.aClass20_Sub2Array5[local25] != null) {
				this.aClass20_Sub2Array5[local25].method5284();
			}
		}
		if (this.aClass253_3 != null) {
			this.aClass253_3.method25214();
		}
		if (this.anInterface30_4 != null) {
			this.anInterface30_4.method27209();
		}
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25248();
		}
	}

	@OriginalMember(owner = "client!abv", name = "vs", descriptor = "()V", line = 426)
	void method17779() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24777();
		}
		if (this.anInterface21_17 != null) {
			this.anInterface21_17.method27209();
		}
		if (this.anInterface21_16 != null) {
			this.anInterface21_16.method27209();
		}
		if (this.anInterface21_15 != null) {
			this.anInterface21_15.method27209();
		}
		for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
			if (this.aClass20_Sub2Array5[local25] != null) {
				this.aClass20_Sub2Array5[local25].method5284();
			}
		}
		if (this.aClass253_3 != null) {
			this.aClass253_3.method25214();
		}
		if (this.anInterface30_4 != null) {
			this.anInterface30_4.method27209();
		}
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25248();
		}
	}

	@OriginalMember(owner = "client!abv", name = "py", descriptor = "()V", line = 441)
	void method17446() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "vd", descriptor = "()V", line = 441)
	void method17568() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "vq", descriptor = "()V", line = 441)
	void method17573() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "vp", descriptor = "()V", line = 441)
	void method17579() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "va", descriptor = "()V", line = 441)
	void method17622() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "vh", descriptor = "()V", line = 441)
	void method17623() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "vo", descriptor = "()V", line = 441)
	void method17661() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24767();
		}
		if (this.aClass38Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass38Array3.length; local10++) {
				if (this.aClass38Array3[local10] != null && this.aClass38Array3[local10].method8206()) {
					this.aClass38Array3[local10].method8220();
				}
			}
		}
		this.aClass253_3 = new Class253(this);
		this.method17447();
		this.method17448();
		this.method17451();
		this.aClass253_3.method25212(this);
		if (this.aBoolean443) {
			this.aClass266_3 = new Class266(this, 1024);
		}
	}

	@OriginalMember(owner = "client!abv", name = "pv", descriptor = "()V", line = 454)
	final void method17447() {
		this.anInterface21_17 = this.method17542(false);
		@Pc(6) short local6 = 160;
		this.anInterface21_17.method25687(local6, 32);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.anInterface21_17.method25705(0, this.aByteBuffer4.position(), this.aLong101);
		this.aClass37_18 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7, Class240.aClass240_7 }) });
	}

	@OriginalMember(owner = "client!abv", name = "vw", descriptor = "()V", line = 454)
	final void method17625() {
		this.anInterface21_17 = this.method17542(false);
		@Pc(6) short local6 = 160;
		this.anInterface21_17.method25687(local6, 32);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.anInterface21_17.method25705(0, this.aByteBuffer4.position(), this.aLong101);
		this.aClass37_18 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7, Class240.aClass240_7 }) });
	}

	@OriginalMember(owner = "client!abv", name = "vm", descriptor = "()V", line = 454)
	final void method17626() {
		this.anInterface21_17 = this.method17542(false);
		@Pc(6) short local6 = 160;
		this.anInterface21_17.method25687(local6, 32);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.anInterface21_17.method25705(0, this.aByteBuffer4.position(), this.aLong101);
		this.aClass37_18 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7, Class240.aClass240_7 }) });
	}

	@OriginalMember(owner = "client!abv", name = "vc", descriptor = "()V", line = 454)
	final void method17627() {
		this.anInterface21_17 = this.method17542(false);
		@Pc(6) short local6 = 160;
		this.anInterface21_17.method25687(local6, 32);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.anInterface21_17.method25705(0, this.aByteBuffer4.position(), this.aLong101);
		this.aClass37_18 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7, Class240.aClass240_7 }) });
	}

	@OriginalMember(owner = "client!abv", name = "vk", descriptor = "()V", line = 454)
	final void method17628() {
		this.anInterface21_17 = this.method17542(false);
		@Pc(6) short local6 = 160;
		this.anInterface21_17.method25687(local6, 32);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(1.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putInt(-1);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.anInterface21_17.method25705(0, this.aByteBuffer4.position(), this.aLong101);
		this.aClass37_18 = this.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7, Class240.aClass240_7 }) });
	}

	@OriginalMember(owner = "client!abv", name = "px", descriptor = "()V", line = 503)
	final void method17448() {
		this.anInterface21_16 = this.method17542(true);
		this.anInterface21_16.method25687(24, 12);
		this.aClass37_19 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11) });
	}

	@OriginalMember(owner = "client!abv", name = "vn", descriptor = "()V", line = 503)
	final void method17565() {
		this.anInterface21_16 = this.method17542(true);
		this.anInterface21_16.method25687(24, 12);
		this.aClass37_19 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11) });
	}

	@OriginalMember(owner = "client!abv", name = "vv", descriptor = "()V", line = 503)
	final void method17629() {
		this.anInterface21_16 = this.method17542(true);
		this.anInterface21_16.method25687(24, 12);
		this.aClass37_19 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11) });
	}

	@OriginalMember(owner = "client!abv", name = "vu", descriptor = "()V", line = 503)
	final void method17631() {
		this.anInterface21_16 = this.method17542(true);
		this.anInterface21_16.method25687(24, 12);
		this.aClass37_19 = this.method17590(new Class252[] { new Class252(Class240.aClass240_11) });
	}

	@OriginalMember(owner = "client!abv", name = "pf", descriptor = "()V", line = 509)
	final void method17451() {
		this.anInterface21_15 = this.method17542(false);
		this.anInterface21_15.method25687(3096, 12);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer4.putFloat(local51);
			this.aByteBuffer4.putFloat(local47);
			this.aByteBuffer4.putFloat(0.0F);
		}
		this.anInterface21_15.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "ve", descriptor = "()V", line = 509)
	final void method17632() {
		this.anInterface21_15 = this.method17542(false);
		this.anInterface21_15.method25687(3096, 12);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer4.putFloat(local51);
			this.aByteBuffer4.putFloat(local47);
			this.aByteBuffer4.putFloat(0.0F);
		}
		this.anInterface21_15.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "vi", descriptor = "()V", line = 509)
	final void method17775() {
		this.anInterface21_15 = this.method17542(false);
		this.anInterface21_15.method25687(3096, 12);
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		this.aByteBuffer4.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer4.putFloat(local51);
			this.aByteBuffer4.putFloat(local47);
			this.aByteBuffer4.putFloat(0.0F);
		}
		this.anInterface21_15.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "pa", descriptor = "(FFFFFF)Z", line = 527)
	boolean method17449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(arg0);
		this.aByteBuffer4.putFloat(arg1);
		this.aByteBuffer4.putFloat(arg2);
		this.aByteBuffer4.putFloat(arg3);
		this.aByteBuffer4.putFloat(arg4);
		this.aByteBuffer4.putFloat(arg5);
		return this.anInterface21_16.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "vx", descriptor = "(FFFFFF)Z", line = 527)
	boolean method17511(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(arg0);
		this.aByteBuffer4.putFloat(arg1);
		this.aByteBuffer4.putFloat(arg2);
		this.aByteBuffer4.putFloat(arg3);
		this.aByteBuffer4.putFloat(arg4);
		this.aByteBuffer4.putFloat(arg5);
		return this.anInterface21_16.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "vy", descriptor = "(FFFFFF)Z", line = 527)
	boolean method17578(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(arg0);
		this.aByteBuffer4.putFloat(arg1);
		this.aByteBuffer4.putFloat(arg2);
		this.aByteBuffer4.putFloat(arg3);
		this.aByteBuffer4.putFloat(arg4);
		this.aByteBuffer4.putFloat(arg5);
		return this.anInterface21_16.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "vr", descriptor = "(FFFFFF)Z", line = 527)
	boolean method17635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.aByteBuffer4.clear();
		this.aByteBuffer4.putFloat(arg0);
		this.aByteBuffer4.putFloat(arg1);
		this.aByteBuffer4.putFloat(arg2);
		this.aByteBuffer4.putFloat(arg3);
		this.aByteBuffer4.putFloat(arg4);
		this.aByteBuffer4.putFloat(arg5);
		return this.anInterface21_16.method25705(0, this.aByteBuffer4.position(), this.aLong101);
	}

	@OriginalMember(owner = "client!abv", name = "en", descriptor = "()V", line = 538)
	@Override
	void method17149() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ew", descriptor = "()V", line = 538)
	@Override
	void method17150() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "em", descriptor = "()V", line = 538)
	@Override
	void method17151() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ec", descriptor = "()V", line = 538)
	@Override
	void method17152() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ea", descriptor = "()V", line = 538)
	@Override
	void method17153() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "b", descriptor = "()V", line = 538)
	@Override
	void method17021() {
		if (this.aBoolean442) {
			return;
		}
		this.method17734();
		this.aClass247_3.method24910();
		for (@Pc(12) Class3 local12 = this.aClass553_37.method32768(); local12 != null; local12 = this.aClass553_37.method32709()) {
			((Class3_Sub11_Sub2) local12).method18311();
		}
		Class79.method21589(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass40Array3.length; local29++) {
			if (this.aClass40Array3[local29] != null) {
				this.aClass40Array3[local29].method16951();
				this.aClass40Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass38Array3.length; local29++) {
			if (this.aClass38Array3[local29] != null) {
				this.aClass38Array3[local29].method8207();
				this.aClass38Array3[local29] = null;
			}
		}
		this.method17718();
		this.method17022(0);
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!abv", name = "j", descriptor = "()Z", line = 564)
	@Override
	public final boolean method17231() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "eq", descriptor = "()Z", line = 564)
	@Override
	public final boolean method17353() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "ed", descriptor = "()Z", line = 564)
	@Override
	public final boolean method17156() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "n", descriptor = "()Z", line = 568)
	@Override
	public final boolean method17088() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "ev", descriptor = "()Z", line = 568)
	@Override
	public final boolean method17158() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "et", descriptor = "()Z", line = 568)
	@Override
	public final boolean method17159() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "eo", descriptor = "()Z", line = 572)
	@Override
	public final boolean method17313() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "e", descriptor = "()Z", line = 572)
	@Override
	public final boolean method17218() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "d", descriptor = "()Z", line = 576)
	@Override
	public final boolean method17166() {
		return this.aClass38Array3[3] != null;
	}

	@OriginalMember(owner = "client!abv", name = "ei", descriptor = "()Z", line = 576)
	@Override
	public final boolean method17262() {
		return this.aClass38Array3[3] != null;
	}

	@OriginalMember(owner = "client!abv", name = "ek", descriptor = "()Z", line = 576)
	@Override
	public final boolean method17161() {
		return this.aClass38Array3[3] != null;
	}

	@OriginalMember(owner = "client!abv", name = "q", descriptor = "()Z", line = 580)
	@Override
	public final boolean method17164() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "eu", descriptor = "()Z", line = 580)
	@Override
	public final boolean method17376() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "el", descriptor = "()Z", line = 580)
	@Override
	public final boolean method17163() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "r", descriptor = "()Z", line = 584)
	@Override
	public final boolean method17409() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "eg", descriptor = "()Z", line = 584)
	@Override
	public final boolean method17165() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "ft", descriptor = "()Z", line = 584)
	@Override
	public final boolean method17168() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "es", descriptor = "()Z", line = 584)
	@Override
	public final boolean method17190() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "eh", descriptor = "()Z", line = 584)
	@Override
	public final boolean method17167() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "v", descriptor = "()Z", line = 588)
	@Override
	public final boolean method17032() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "fh", descriptor = "()Z", line = 588)
	@Override
	public final boolean method17174() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "fu", descriptor = "()Z", line = 588)
	@Override
	public final boolean method17175() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "fx", descriptor = "()Z", line = 588)
	@Override
	public final boolean method17081() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "t", descriptor = "()Z", line = 592)
	@Override
	public final boolean method17033() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "fg", descriptor = "()Z", line = 592)
	@Override
	public final boolean method17176() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "fb", descriptor = "()Z", line = 592)
	@Override
	public final boolean method17177() {
		return true;
	}

	@OriginalMember(owner = "client!abv", name = "w", descriptor = "()Z", line = 596)
	@Override
	public final boolean method17256() {
		return false;
	}

	@OriginalMember(owner = "client!abv", name = "fd", descriptor = "()Z", line = 596)
	@Override
	public final boolean method17252() {
		return false;
	}

	@OriginalMember(owner = "client!abv", name = "fp", descriptor = "()Z", line = 600)
	@Override
	public final boolean method17221() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!abv", name = "m", descriptor = "()Z", line = 600)
	@Override
	public final boolean method17031() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!abv", name = "fm", descriptor = "()Z", line = 600)
	@Override
	public final boolean method17339() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!abv", name = "fn", descriptor = "()Z", line = 600)
	@Override
	public final boolean method17091() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!abv", name = "fs", descriptor = "()Z", line = 600)
	@Override
	public final boolean method17134() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!abv", name = "ez", descriptor = "(I)V", line = 607)
	@Override
	public void method17154(@OriginalArg(0) int arg0) {
		if (this.aClass247_3 != null) {
			this.aClass247_3.method24909();
		}
		this.anInt2487 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!abv", name = "ep", descriptor = "(I)V", line = 607)
	@Override
	public void method17155(@OriginalArg(0) int arg0) {
		if (this.aClass247_3 != null) {
			this.aClass247_3.method24909();
		}
		this.anInt2487 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!abv", name = "c", descriptor = "(I)V", line = 607)
	@Override
	public void method17022(@OriginalArg(0) int arg0) {
		if (this.aClass247_3 != null) {
			this.aClass247_3.method24909();
		}
		this.anInt2487 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!abv", name = "ps", descriptor = "()Lclient!ix;", line = 612)
	Class248 method17453() {
		return this.aClass266_3 == null ? Class248.aClass248_2 : this.aClass266_3.method25245();
	}

	@OriginalMember(owner = "client!abv", name = "wb", descriptor = "()Lclient!ix;", line = 612)
	Class248 method17638() {
		return this.aClass266_3 == null ? Class248.aClass248_2 : this.aClass266_3.method25245();
	}

	@OriginalMember(owner = "client!abv", name = "cm", descriptor = "()V", line = 617)
	@Override
	public void method17028() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25237();
		}
	}

	@OriginalMember(owner = "client!abv", name = "or", descriptor = "()V", line = 617)
	@Override
	public void method17193() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25237();
		}
	}

	@OriginalMember(owner = "client!abv", name = "nu", descriptor = "()V", line = 617)
	@Override
	public void method17398() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25237();
		}
	}

	@OriginalMember(owner = "client!abv", name = "oh", descriptor = "()V", line = 623)
	@Override
	public void method17401() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25243();
		}
	}

	@OriginalMember(owner = "client!abv", name = "cj", descriptor = "()V", line = 623)
	@Override
	public void method17092() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25243();
		}
	}

	@OriginalMember(owner = "client!abv", name = "oo", descriptor = "()V", line = 623)
	@Override
	public void method17025() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25243();
		}
	}

	@OriginalMember(owner = "client!abv", name = "cu", descriptor = "()V", line = 629)
	@Override
	public void method17093() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25244();
		}
	}

	@OriginalMember(owner = "client!abv", name = "oa", descriptor = "()V", line = 629)
	@Override
	public void method17403() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25244();
		}
	}

	@OriginalMember(owner = "client!abv", name = "od", descriptor = "()V", line = 629)
	@Override
	public void method17402() {
		if (this.aClass266_3 != null) {
			this.aClass266_3.method25244();
		}
	}

	@OriginalMember(owner = "client!abv", name = "pn", descriptor = "()V", line = 635)
	void method17454() {
		this.method17455();
	}

	@OriginalMember(owner = "client!abv", name = "wz", descriptor = "()V", line = 635)
	void method17639() {
		this.method17455();
	}

	@OriginalMember(owner = "client!abv", name = "pr", descriptor = "()V", line = 639)
	void method17455() {
		this.method17730();
		this.method17592();
		this.method17491();
		this.method17053();
		this.method17056();
	}

	@OriginalMember(owner = "client!abv", name = "dk", descriptor = "(IIII)V", line = 647)
	@Override
	public final void method17121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass38Array3.length; local5++) {
			if (this.aClass38Array3[local5] != null && this.aClass38Array3[local5].method8206() && !this.aClass38Array3[local5].method8208()) {
				this.aClass244_3.method24771(arg0, arg1, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!abv", name = "ju", descriptor = "(IIII)V", line = 647)
	@Override
	public final void method17292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass38Array3.length; local5++) {
			if (this.aClass38Array3[local5] != null && this.aClass38Array3[local5].method8206() && !this.aClass38Array3[local5].method8208()) {
				this.aClass244_3.method24771(arg0, arg1, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!abv", name = "ji", descriptor = "(IIII)V", line = 647)
	@Override
	public final void method17205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass38Array3.length; local5++) {
			if (this.aClass38Array3[local5] != null && this.aClass38Array3[local5].method8206() && !this.aClass38Array3[local5].method8208()) {
				this.aClass244_3.method24771(arg0, arg1, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!abv", name = "jh", descriptor = "(IIII)V", line = 647)
	@Override
	public final void method17293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass38Array3.length; local5++) {
			if (this.aClass38Array3[local5] != null && this.aClass38Array3[local5].method8206() && !this.aClass38Array3[local5].method8208()) {
				this.aClass244_3.method24771(arg0, arg1, arg2, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!abv", name = "dy", descriptor = "()V", line = 657)
	@Override
	public final void method17124() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24774();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jf", descriptor = "()V", line = 657)
	@Override
	public final void method17294() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24774();
		}
	}

	@OriginalMember(owner = "client!abv", name = "kf", descriptor = "()V", line = 657)
	@Override
	public final void method17295() {
		if (this.aClass244_3 != null) {
			this.aClass244_3.method24774();
		}
	}

	@OriginalMember(owner = "client!abv", name = "dg", descriptor = "()Z", line = 661)
	@Override
	public final boolean method17123() {
		return this.aClass244_3 != null && this.aClass244_3.aBoolean683;
	}

	@OriginalMember(owner = "client!abv", name = "kx", descriptor = "()Z", line = 661)
	@Override
	public final boolean method17296() {
		return this.aClass244_3 != null && this.aClass244_3.aBoolean683;
	}

	@OriginalMember(owner = "client!abv", name = "pu", descriptor = "()Z", line = 665)
	boolean method17457() {
		if (this.aClass38Array3[1] == null || this.aClass38Array3[1].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[1]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "we", descriptor = "()Z", line = 665)
	boolean method17640() {
		if (this.aClass38Array3[1] == null || this.aClass38Array3[1].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[1]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "dq", descriptor = "()Z", line = 674)
	@Override
	public boolean method17217() {
		return this.aClass38Array3[1] != null && this.aClass38Array3[1].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "kl", descriptor = "()Z", line = 674)
	@Override
	public boolean method17298() {
		return this.aClass38Array3[1] != null && this.aClass38Array3[1].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "kw", descriptor = "()Z", line = 674)
	@Override
	public boolean method17249() {
		return this.aClass38Array3[1] != null && this.aClass38Array3[1].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "ds", descriptor = "(FFFFF)V", line = 678)
	@Override
	public void method17125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class38_Sub3.aFloat129 = arg0;
		Class38_Sub3.aFloat131 = arg1;
		Class38_Sub3.aFloat132 = arg2;
		Class38_Sub3.aFloat133 = arg3;
		Class38_Sub3.aFloat130 = arg4;
	}

	@OriginalMember(owner = "client!abv", name = "kr", descriptor = "(FFFFF)V", line = 678)
	@Override
	public void method17299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class38_Sub3.aFloat129 = arg0;
		Class38_Sub3.aFloat131 = arg1;
		Class38_Sub3.aFloat132 = arg2;
		Class38_Sub3.aFloat133 = arg3;
		Class38_Sub3.aFloat130 = arg4;
	}

	@OriginalMember(owner = "client!abv", name = "kn", descriptor = "([I)Lclient!cf;", line = 686)
	@Override
	public Class16 method17300(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "kv", descriptor = "([I)Lclient!cf;", line = 686)
	@Override
	public Class16 method17120(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "dr", descriptor = "([I)Lclient!cf;", line = 686)
	@Override
	public Class16 method17126(@OriginalArg(0) int[] arg0) {
		return new Class16_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "wv", descriptor = "()Z", line = 690)
	boolean method17459() {
		if (this.aClass38Array3[2] == null || this.aClass38Array3[2].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[2]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "wx", descriptor = "()Z", line = 690)
	boolean method17641() {
		if (this.aClass38Array3[2] == null || this.aClass38Array3[2].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[2]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "wg", descriptor = "()Z", line = 690)
	boolean method17742() {
		if (this.aClass38Array3[2] == null || this.aClass38Array3[2].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[2]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "qc", descriptor = "()Z", line = 690)
	boolean method17809() {
		if (this.aClass38Array3[2] == null || this.aClass38Array3[2].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[2]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "dc", descriptor = "()Z", line = 699)
	@Override
	public boolean method17366() {
		return this.aClass38Array3[2] != null && this.aClass38Array3[2].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "km", descriptor = "()Z", line = 699)
	@Override
	public boolean method17071() {
		return this.aClass38Array3[2] != null && this.aClass38Array3[2].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "kg", descriptor = "()Z", line = 699)
	@Override
	public boolean method17281() {
		return this.aClass38Array3[2] != null && this.aClass38Array3[2].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "dt", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 703)
	@Override
	public void method17128(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class38_Sub2.aClass16_Sub2Array1[0] = (Class16_Sub2) arg0;
		Class38_Sub2.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[1] = (Class16_Sub2) arg2;
		Class38_Sub2.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[2] = (Class16_Sub2) arg4;
		Class38_Sub2.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class38_Sub2.anInt879 = local1;
		Class38_Sub2.aFloat128 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abv", name = "kh", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 703)
	@Override
	public void method17305(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class38_Sub2.aClass16_Sub2Array1[0] = (Class16_Sub2) arg0;
		Class38_Sub2.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[1] = (Class16_Sub2) arg2;
		Class38_Sub2.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[2] = (Class16_Sub2) arg4;
		Class38_Sub2.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class38_Sub2.anInt879 = local1;
		Class38_Sub2.aFloat128 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abv", name = "ke", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 703)
	@Override
	public void method17034(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class38_Sub2.aClass16_Sub2Array1[0] = (Class16_Sub2) arg0;
		Class38_Sub2.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[1] = (Class16_Sub2) arg2;
		Class38_Sub2.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[2] = (Class16_Sub2) arg4;
		Class38_Sub2.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class38_Sub2.anInt879 = local1;
		Class38_Sub2.aFloat128 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abv", name = "kz", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 703)
	@Override
	public void method17307(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class38_Sub2.aClass16_Sub2Array1[0] = (Class16_Sub2) arg0;
		Class38_Sub2.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[1] = (Class16_Sub2) arg2;
		Class38_Sub2.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[2] = (Class16_Sub2) arg4;
		Class38_Sub2.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class38_Sub2.anInt879 = local1;
		Class38_Sub2.aFloat128 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abv", name = "kk", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 703)
	@Override
	public void method17212(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
		@Pc(1) int local1 = 0;
		Class38_Sub2.aClass16_Sub2Array1[0] = (Class16_Sub2) arg0;
		Class38_Sub2.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[1] = (Class16_Sub2) arg2;
		Class38_Sub2.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class38_Sub2.aClass16_Sub2Array1[2] = (Class16_Sub2) arg4;
		Class38_Sub2.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class38_Sub2.anInt879 = local1;
		Class38_Sub2.aFloat128 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!abv", name = "dd", descriptor = "()Z", line = 718)
	@Override
	public final boolean method17129() {
		if (this.aClass38Array3[3] == null || this.aClass38Array3[3].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[3]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "ki", descriptor = "()Z", line = 718)
	@Override
	public final boolean method17308() {
		if (this.aClass38Array3[3] == null || this.aClass38Array3[3].method8206()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass244_3.method24768(this.aClass38Array3[3]);
		if (local18) {
			this.aClass247_3.method24910();
		}
		return local18;
	}

	@OriginalMember(owner = "client!abv", name = "kt", descriptor = "()V", line = 727)
	@Override
	public final void method17309() {
		if (this.aClass38Array3[3] != null && this.aClass38Array3[3].method8206()) {
			this.aClass244_3.method24769(this.aClass38Array3[3]);
			this.aClass247_3.method24910();
		}
	}

	@OriginalMember(owner = "client!abv", name = "da", descriptor = "()V", line = 727)
	@Override
	public final void method17130() {
		if (this.aClass38Array3[3] != null && this.aClass38Array3[3].method8206()) {
			this.aClass244_3.method24769(this.aClass38Array3[3]);
			this.aClass247_3.method24910();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ko", descriptor = "()Z", line = 734)
	@Override
	public final boolean method17057() {
		return this.aClass38Array3[3] != null && this.aClass38Array3[3].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "dz", descriptor = "()Z", line = 734)
	@Override
	public final boolean method17131() {
		return this.aClass38Array3[3] != null && this.aClass38Array3[3].method8206();
	}

	@OriginalMember(owner = "client!abv", name = "dl", descriptor = "(FFFFFF)V", line = 738)
	@Override
	final void method17219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class38_Sub1.aFloat123 = arg0;
		Class38_Sub1.aFloat125 = arg1;
		Class38_Sub1.aFloat122 = arg2;
		Class38_Sub1.aFloat124 = arg5;
	}

	@OriginalMember(owner = "client!abv", name = "ku", descriptor = "(FFFFFF)V", line = 738)
	@Override
	final void method17344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class38_Sub1.aFloat123 = arg0;
		Class38_Sub1.aFloat125 = arg1;
		Class38_Sub1.aFloat122 = arg2;
		Class38_Sub1.aFloat124 = arg5;
	}

	@OriginalMember(owner = "client!abv", name = "be", descriptor = "(I)Lclient!afu;", line = 745)
	@Override
	public final Class3_Sub11 method17348(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub2 local4 = new Class3_Sub11_Sub2(arg0);
		this.aClass553_37.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abv", name = "lz", descriptor = "(I)Lclient!afu;", line = 745)
	@Override
	public final Class3_Sub11 method17141(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub2 local4 = new Class3_Sub11_Sub2(arg0);
		this.aClass553_37.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abv", name = "lr", descriptor = "(I)Lclient!afu;", line = 745)
	@Override
	public final Class3_Sub11 method17144(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub11_Sub2 local4 = new Class3_Sub11_Sub2(arg0);
		this.aClass553_37.method32702(local4);
		return local4;
	}

	@OriginalMember(owner = "client!abv", name = "hw", descriptor = "(Lclient!afu;)V", line = 751)
	@Override
	public final void method17232(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap4 = ((Class3_Sub11_Sub2) arg0).aNativeHeap6;
	}

	@OriginalMember(owner = "client!abv", name = "hy", descriptor = "(Lclient!afu;)V", line = 751)
	@Override
	public final void method17233(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap4 = ((Class3_Sub11_Sub2) arg0).aNativeHeap6;
	}

	@OriginalMember(owner = "client!abv", name = "bx", descriptor = "(Lclient!afu;)V", line = 751)
	@Override
	public final void method17084(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap4 = ((Class3_Sub11_Sub2) arg0).aNativeHeap6;
	}

	@OriginalMember(owner = "client!abv", name = "hr", descriptor = "(Lclient!afu;)V", line = 751)
	@Override
	public final void method17137(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aNativeHeap4 = ((Class3_Sub11_Sub2) arg0).aNativeHeap6;
	}

	@OriginalMember(owner = "client!abv", name = "qi", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 755)
	public final NativeHeapBuffer method17463(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!abv", name = "wd", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 755)
	public final NativeHeapBuffer method17643(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!abv", name = "qs", descriptor = "(I)Lclient!jw;", line = 759)
	final Interface30 method17464(@OriginalArg(0) int arg0) {
		if (this.anInterface30_4.method25709() < arg0 * 2) {
			this.anInterface30_4.method25720(arg0);
		}
		return this.anInterface30_4;
	}

	@OriginalMember(owner = "client!abv", name = "me", descriptor = "()I", line = 764)
	@Override
	public final int method17351() {
		return this.anInt2483 + this.anInt2484 + this.anInt2490;
	}

	@OriginalMember(owner = "client!abv", name = "z", descriptor = "()I", line = 764)
	@Override
	public final int method17157() {
		return this.anInt2483 + this.anInt2484 + this.anInt2490;
	}

	@OriginalMember(owner = "client!abv", name = "mk", descriptor = "()I", line = 764)
	@Override
	public final int method17350() {
		return this.anInt2483 + this.anInt2484 + this.anInt2490;
	}

	@OriginalMember(owner = "client!abv", name = "mz", descriptor = "()I", line = 764)
	@Override
	public final int method17352() {
		return this.anInt2483 + this.anInt2484 + this.anInt2490;
	}

	@OriginalMember(owner = "client!abv", name = "hq", descriptor = "(IIZZ)Lclient!co;", line = 768)
	@Override
	public final Class6 method17237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "hf", descriptor = "(IIZZ)Lclient!co;", line = 768)
	@Override
	public final Class6 method17235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "hp", descriptor = "(IIZZ)Lclient!co;", line = 768)
	@Override
	public final Class6 method17335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "hv", descriptor = "(IIZZ)Lclient!co;", line = 768)
	@Override
	public final Class6 method17404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "bj", descriptor = "(IIZZ)Lclient!co;", line = 768)
	@Override
	public final Class6 method17086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "hj", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 773)
	@Override
	public final Class6 method17373(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class6 local21;
		if (arg0.method3433() == 0 || arg0.method3440() == 0) {
			local21 = this.method17113(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method3448(false);
			local21 = this.method17113(local9, 0, arg0.method3433(), arg0.method3433(), arg0.method3440());
		}
		local21.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local21;
	}

	@OriginalMember(owner = "client!abv", name = "bz", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 773)
	@Override
	public final Class6 method17089(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class6 local21;
		if (arg0.method3433() == 0 || arg0.method3440() == 0) {
			local21 = this.method17113(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method3448(false);
			local21 = this.method17113(local9, 0, arg0.method3433(), arg0.method3433(), arg0.method3440());
		}
		local21.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local21;
	}

	@OriginalMember(owner = "client!abv", name = "bq", descriptor = "([IIIIIZ)Lclient!co;", line = 783)
	@Override
	public final Class6 method17087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "ht", descriptor = "([IIIIIZ)Lclient!co;", line = 783)
	@Override
	public final Class6 method17280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "he", descriptor = "([IIIIIZ)Lclient!co;", line = 783)
	@Override
	public final Class6 method17240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class6_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "lf", descriptor = "(IIIIZ)Lclient!co;", line = 787)
	@Override
	public final Class6 method17195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class6_Sub2 local8 = new Class6_Sub2(this, arg2, arg3, arg4, false);
		local8.method16795(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!abv", name = "ck", descriptor = "(IIIIZ)Lclient!co;", line = 787)
	@Override
	public final Class6 method17090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class6_Sub2 local8 = new Class6_Sub2(this, arg2, arg3, arg4, false);
		local8.method16795(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!abv", name = "li", descriptor = "(IIIIZ)Lclient!co;", line = 787)
	@Override
	public final Class6 method17399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class6_Sub2 local8 = new Class6_Sub2(this, arg2, arg3, arg4, false);
		local8.method16795(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!abv", name = "lb", descriptor = "(IIIIZ)Lclient!co;", line = 787)
	@Override
	public final Class6 method17340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class6_Sub2 local8 = new Class6_Sub2(this, arg2, arg3, arg4, false);
		local8.method16795(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!abv", name = "cq", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 793)
	@Override
	public final Class14 method17096(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "il", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 793)
	@Override
	public final Class14 method17246(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class14_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "cv", descriptor = "(II[I[I)Lclient!ch;", line = 797)
	@Override
	public final Class5 method17094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class5_Sub1.method277(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "hu", descriptor = "(II[I[I)Lclient!ch;", line = 797)
	@Override
	public final Class5 method17127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class5_Sub1.method277(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abv", name = "cc", descriptor = "(I)V", line = 800)
	@Override
	public final void method17343(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abv", name = "iu", descriptor = "(I)V", line = 800)
	@Override
	public final void method17247(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abv", name = "cs", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 803)
	@Override
	public final Class20 method17100(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "iq", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 803)
	@Override
	public final Class20 method17146(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abv", name = "ct", descriptor = "(II)I", line = 807)
	@Override
	public final int method17117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abv", name = "im", descriptor = "(II)I", line = 807)
	@Override
	public final int method17173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abv", name = "ir", descriptor = "(II)I", line = 807)
	@Override
	public final int method17250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abv", name = "ig", descriptor = "(II)I", line = 807)
	@Override
	public final int method17251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abv", name = "cx", descriptor = "(II)I", line = 811)
	@Override
	public final int method17102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abv", name = "ip", descriptor = "(II)I", line = 811)
	@Override
	public final int method17338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abv", name = "cy", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 815)
	@Override
	public final Class17 method17273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "ix", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 815)
	@Override
	public final Class17 method17253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "cg", descriptor = "()Lclient!mq;", line = 819)
	@Override
	public final Class328 method17333() {
		return this.aClass328_93;
	}

	@OriginalMember(owner = "client!abv", name = "in", descriptor = "()Lclient!mq;", line = 819)
	@Override
	public final Class328 method17254() {
		return this.aClass328_93;
	}

	@OriginalMember(owner = "client!abv", name = "ia", descriptor = "()Lclient!mq;", line = 819)
	@Override
	public final Class328 method17255() {
		return this.aClass328_93;
	}

	@OriginalMember(owner = "client!abv", name = "ih", descriptor = "()Lclient!mq;", line = 819)
	@Override
	public final Class328 method17169() {
		return this.aClass328_93;
	}

	@OriginalMember(owner = "client!abv", name = "if", descriptor = "()Lclient!mq;", line = 819)
	@Override
	public final Class328 method17381() {
		return this.aClass328_93;
	}

	@OriginalMember(owner = "client!abv", name = "it", descriptor = "()Lclient!mu;", line = 823)
	@Override
	public final Class332 method17185() {
		return this.aClass332_40;
	}

	@OriginalMember(owner = "client!abv", name = "ij", descriptor = "()Lclient!mu;", line = 823)
	@Override
	public final Class332 method17258() {
		return this.aClass332_40;
	}

	@OriginalMember(owner = "client!abv", name = "iy", descriptor = "()Lclient!mu;", line = 823)
	@Override
	public final Class332 method17238() {
		return this.aClass332_40;
	}

	@OriginalMember(owner = "client!abv", name = "is", descriptor = "()Lclient!mu;", line = 823)
	@Override
	public final Class332 method17260() {
		return this.aClass332_40;
	}

	@OriginalMember(owner = "client!abv", name = "cp", descriptor = "()Lclient!mu;", line = 823)
	@Override
	public final Class332 method17098() {
		return this.aClass332_40;
	}

	@OriginalMember(owner = "client!abv", name = "jj", descriptor = "(I)Lclient!db;", line = 827)
	@Override
	public final Class18 method17285(@OriginalArg(0) int arg0) {
		return new Class18_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "dh", descriptor = "(I)Lclient!db;", line = 827)
	@Override
	public final Class18 method17248(@OriginalArg(0) int arg0) {
		return new Class18_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "jt", descriptor = "(I)Lclient!db;", line = 827)
	@Override
	public final Class18 method17286(@OriginalArg(0) int arg0) {
		return new Class18_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "jw", descriptor = "(I)Lclient!db;", line = 827)
	@Override
	public final Class18 method17287(@OriginalArg(0) int arg0) {
		return new Class18_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "dp", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17400(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "lt", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17345(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "ln", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17172(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "lo", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17346(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "lw", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17097(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "lq", descriptor = "(Lclient!db;)V", line = 831)
	@Override
	public final void method17347(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub2_3 = (Class18_Sub2) arg0;
	}

	@OriginalMember(owner = "client!abv", name = "wm", descriptor = "()Lclient!jk;", line = 835)
	public final Interface27 method17644() {
		return this.aClass18_Sub2_3 == null ? null : this.aClass18_Sub2_3.method17012();
	}

	@OriginalMember(owner = "client!abv", name = "qj", descriptor = "()Lclient!jk;", line = 835)
	public final Interface27 method17764() {
		return this.aClass18_Sub2_3 == null ? null : this.aClass18_Sub2_3.method17012();
	}

	@OriginalMember(owner = "client!abv", name = "ap", descriptor = "()V", line = 839)
	@Override
	public void method17053() {
		this.anInt2489 = 0;
		this.anInt2505 = 0;
		this.anInt2497 = this.aClass19_6.method21390();
		this.anInt2498 = this.aClass19_6.method21391();
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "gp", descriptor = "()V", line = 839)
	@Override
	public void method17196() {
		this.anInt2489 = 0;
		this.anInt2505 = 0;
		this.anInt2497 = this.aClass19_6.method21390();
		this.anInt2498 = this.aClass19_6.method21391();
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "gj", descriptor = "()V", line = 839)
	@Override
	public void method17390() {
		this.anInt2489 = 0;
		this.anInt2505 = 0;
		this.anInt2497 = this.aClass19_6.method21390();
		this.anInt2498 = this.aClass19_6.method21391();
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "ge", descriptor = "()V", line = 839)
	@Override
	public void method17197() {
		this.anInt2489 = 0;
		this.anInt2505 = 0;
		this.anInt2497 = this.aClass19_6.method21390();
		this.anInt2498 = this.aClass19_6.method21391();
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "ab", descriptor = "(IIII)V", line = 847)
	@Override
	public void method17054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2489 = arg0;
		this.anInt2505 = arg1;
		this.anInt2497 = arg2;
		this.anInt2498 = arg3;
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "gd", descriptor = "(IIII)V", line = 847)
	@Override
	public void method17199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2489 = arg0;
		this.anInt2505 = arg1;
		this.anInt2497 = arg2;
		this.anInt2498 = arg3;
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "wa", descriptor = "()V", line = 855)
	final void method17445() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.anInt2499 = this.anInt2489;
			this.anInt2500 = this.anInt2505;
			this.anInt2501 = this.anInt2497;
			this.anInt2506 = this.anInt2498;
			this.aFloat188 = this.aFloat190;
			this.aFloat189 = this.aFloat191;
		} else {
			this.anInt2499 = 0;
			this.anInt2500 = 0;
			this.anInt2501 = this.aClass19_6.method21390();
			this.anInt2506 = this.aClass19_6.method21391();
			this.aFloat188 = 0.0F;
			this.aFloat189 = 1.0F;
		}
		this.method17570();
		this.aFloat187 = (float) this.anInt2497 / 2.0F;
		this.aFloat200 = (float) this.anInt2498 / 2.0F;
		this.aFloat186 = (float) this.anInt2489 + this.aFloat187;
		this.aFloat183 = (float) this.anInt2505 + this.aFloat200;
	}

	@OriginalMember(owner = "client!abv", name = "qk", descriptor = "()V", line = 855)
	final void method17630() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.anInt2499 = this.anInt2489;
			this.anInt2500 = this.anInt2505;
			this.anInt2501 = this.anInt2497;
			this.anInt2506 = this.anInt2498;
			this.aFloat188 = this.aFloat190;
			this.aFloat189 = this.aFloat191;
		} else {
			this.anInt2499 = 0;
			this.anInt2500 = 0;
			this.anInt2501 = this.aClass19_6.method21390();
			this.anInt2506 = this.aClass19_6.method21391();
			this.aFloat188 = 0.0F;
			this.aFloat189 = 1.0F;
		}
		this.method17570();
		this.aFloat187 = (float) this.anInt2497 / 2.0F;
		this.aFloat200 = (float) this.anInt2498 / 2.0F;
		this.aFloat186 = (float) this.anInt2489 + this.aFloat187;
		this.aFloat183 = (float) this.anInt2505 + this.aFloat200;
	}

	@OriginalMember(owner = "client!abv", name = "ww", descriptor = "()V", line = 855)
	final void method17645() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.anInt2499 = this.anInt2489;
			this.anInt2500 = this.anInt2505;
			this.anInt2501 = this.anInt2497;
			this.anInt2506 = this.anInt2498;
			this.aFloat188 = this.aFloat190;
			this.aFloat189 = this.aFloat191;
		} else {
			this.anInt2499 = 0;
			this.anInt2500 = 0;
			this.anInt2501 = this.aClass19_6.method21390();
			this.anInt2506 = this.aClass19_6.method21391();
			this.aFloat188 = 0.0F;
			this.aFloat189 = 1.0F;
		}
		this.method17570();
		this.aFloat187 = (float) this.anInt2497 / 2.0F;
		this.aFloat200 = (float) this.anInt2498 / 2.0F;
		this.aFloat186 = (float) this.anInt2489 + this.aFloat187;
		this.aFloat183 = (float) this.anInt2505 + this.aFloat200;
	}

	@OriginalMember(owner = "client!abv", name = "gm", descriptor = "(FF)V", line = 879)
	@Override
	public void method17200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat190 = arg0;
		this.aFloat191 = arg1;
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "au", descriptor = "(FF)V", line = 879)
	@Override
	public void method17055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat190 = arg0;
		this.aFloat191 = arg1;
		this.method17630();
	}

	@OriginalMember(owner = "client!abv", name = "ae", descriptor = "([I)V", line = 885)
	@Override
	public final void method17060(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2495;
		arg0[1] = this.anInt2493;
		arg0[2] = this.anInt2496;
		arg0[3] = this.anInt2494;
	}

	@OriginalMember(owner = "client!abv", name = "gr", descriptor = "([I)V", line = 885)
	@Override
	public final void method17208(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2495;
		arg0[1] = this.anInt2493;
		arg0[2] = this.anInt2496;
		arg0[3] = this.anInt2494;
	}

	@OriginalMember(owner = "client!abv", name = "gq", descriptor = "([I)V", line = 885)
	@Override
	public final void method17332(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2495;
		arg0[1] = this.anInt2493;
		arg0[2] = this.anInt2496;
		arg0[3] = this.anInt2494;
	}

	@OriginalMember(owner = "client!abv", name = "gt", descriptor = "([I)V", line = 885)
	@Override
	public final void method17206(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2495;
		arg0[1] = this.anInt2493;
		arg0[2] = this.anInt2496;
		arg0[3] = this.anInt2494;
	}

	@OriginalMember(owner = "client!abv", name = "ga", descriptor = "([I)V", line = 885)
	@Override
	public final void method17207(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2495;
		arg0[1] = this.anInt2493;
		arg0[2] = this.anInt2496;
		arg0[3] = this.anInt2494;
	}

	@OriginalMember(owner = "client!abv", name = "gv", descriptor = "()V", line = 892)
	@Override
	public final void method17202() {
		if (this.aClass19_6 == null) {
			this.anInt2494 = 0;
			this.anInt2496 = 0;
			this.anInt2493 = 0;
			this.anInt2495 = 0;
		} else {
			this.anInt2493 = 0;
			this.anInt2495 = 0;
			this.anInt2496 = this.aClass19_6.method21390();
			this.anInt2494 = this.aClass19_6.method21391();
		}
		if (this.aBoolean449) {
			this.aBoolean449 = false;
			this.method17468();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ay", descriptor = "()V", line = 892)
	@Override
	public final void method17056() {
		if (this.aClass19_6 == null) {
			this.anInt2494 = 0;
			this.anInt2496 = 0;
			this.anInt2493 = 0;
			this.anInt2495 = 0;
		} else {
			this.anInt2493 = 0;
			this.anInt2495 = 0;
			this.anInt2496 = this.aClass19_6.method21390();
			this.anInt2494 = this.aClass19_6.method21391();
		}
		if (this.aBoolean449) {
			this.aBoolean449 = false;
			this.method17468();
		}
	}

	@OriginalMember(owner = "client!abv", name = "gn", descriptor = "()V", line = 892)
	@Override
	public final void method17201() {
		if (this.aClass19_6 == null) {
			this.anInt2494 = 0;
			this.anInt2496 = 0;
			this.anInt2493 = 0;
			this.anInt2495 = 0;
		} else {
			this.anInt2493 = 0;
			this.anInt2495 = 0;
			this.anInt2496 = this.aClass19_6.method21390();
			this.anInt2494 = this.aClass19_6.method21391();
		}
		if (this.aBoolean449) {
			this.aBoolean449 = false;
			this.method17468();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ag", descriptor = "(IIII)V", line = 913)
	@Override
	public final void method17079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass19_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass19_6.method21390();
			local10 = this.aClass19_6.method21391();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method17056();
			return;
		}
		this.anInt2495 = arg0 >= 0 ? arg0 : 0;
		this.anInt2496 = arg2 <= local6 ? arg2 : local6;
		this.anInt2493 = arg1 >= 0 ? arg1 : 0;
		this.anInt2494 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "gh", descriptor = "(IIII)V", line = 913)
	@Override
	public final void method17203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass19_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass19_6.method21390();
			local10 = this.aClass19_6.method21391();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method17056();
			return;
		}
		this.anInt2495 = arg0 >= 0 ? arg0 : 0;
		this.anInt2496 = arg2 <= local6 ? arg2 : local6;
		this.anInt2493 = arg1 >= 0 ? arg1 : 0;
		this.anInt2494 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "am", descriptor = "(IIII)V", line = 939)
	@Override
	public final void method17209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass19_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass19_6.method21390();
			local10 = this.aClass19_6.method21391();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2495 < local21) {
			this.anInt2495 = local21;
			local43 = true;
		}
		if (this.anInt2496 > local28) {
			this.anInt2496 = local28;
			local43 = true;
		}
		if (this.anInt2493 < local34) {
			this.anInt2493 = local34;
			local43 = true;
		}
		if (this.anInt2494 > local41) {
			this.anInt2494 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "gz", descriptor = "(IIII)V", line = 939)
	@Override
	public final void method17085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass19_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass19_6.method21390();
			local10 = this.aClass19_6.method21391();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2495 < local21) {
			this.anInt2495 = local21;
			local43 = true;
		}
		if (this.anInt2496 > local28) {
			this.anInt2496 = local28;
			local43 = true;
		}
		if (this.anInt2493 < local34) {
			this.anInt2493 = local34;
			local43 = true;
		}
		if (this.anInt2494 > local41) {
			this.anInt2494 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qy", descriptor = "(II)V", line = 978)
	final void method17471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2528 = arg0;
		this.anInt2503 = arg1;
		this.method17570();
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ws", descriptor = "(II)V", line = 978)
	final void method17492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2528 = arg0;
		this.anInt2503 = arg1;
		this.method17570();
		if (!this.aBoolean449 && (this.aBoolean424 || this.method17453() == Class248.aClass248_2)) {
			this.aBoolean449 = true;
			this.method17468();
		}
		if (this.aBoolean449) {
			this.method17472();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ar", descriptor = "(Z)V", line = 989)
	@Override
	public void method17059(@OriginalArg(0) boolean arg0) {
		this.aBoolean424 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "oe", descriptor = "(Z)V", line = 989)
	@Override
	public void method17242(@OriginalArg(0) boolean arg0) {
		this.aBoolean424 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "ok", descriptor = "(Z)V", line = 989)
	@Override
	public void method17418(@OriginalArg(0) boolean arg0) {
		this.aBoolean424 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "oq", descriptor = "(Z)V", line = 989)
	@Override
	public void method17419(@OriginalArg(0) boolean arg0) {
		this.aBoolean424 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "om", descriptor = "(Z)V", line = 989)
	@Override
	public void method17269(@OriginalArg(0) boolean arg0) {
		this.aBoolean424 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "qf", descriptor = "()Lclient!mq;", line = 997)
	final Class328 method17466() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_78 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "wc", descriptor = "()Lclient!mq;", line = 997)
	final Class328 method17654() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_78 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "wi", descriptor = "()Lclient!mq;", line = 997)
	final Class328 method17655() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_78 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "qz", descriptor = "()Lclient!mq;", line = 1002)
	final Class328 method17548() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_92 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "wr", descriptor = "()Lclient!mq;", line = 1002)
	final Class328 method17572() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_92 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "wy", descriptor = "()Lclient!mq;", line = 1002)
	final Class328 method17656() {
		return this.aClass234_3 == Class234.aClass234_4 ? this.aClass328_92 : aClass328_89;
	}

	@OriginalMember(owner = "client!abv", name = "ic", descriptor = "(Lclient!mu;)V", line = 1007)
	@Override
	public final void method17268(@OriginalArg(0) Class332 arg0) {
		this.aClass332_41 = arg0;
		this.aClass328_78.method26056(this.aClass332_41);
		this.aClass328_79.method26104(this.aClass328_78);
		this.aClass328_79.method26086();
		this.aClass332_39.method26235(arg0);
		this.aClass332_39.method26248();
		this.aClass328_92.method26056(this.aClass332_39);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17537();
		}
	}

	@OriginalMember(owner = "client!abv", name = "je", descriptor = "(Lclient!mu;)V", line = 1007)
	@Override
	public final void method17075(@OriginalArg(0) Class332 arg0) {
		this.aClass332_41 = arg0;
		this.aClass328_78.method26056(this.aClass332_41);
		this.aClass328_79.method26104(this.aClass328_78);
		this.aClass328_79.method26086();
		this.aClass332_39.method26235(arg0);
		this.aClass332_39.method26248();
		this.aClass328_92.method26056(this.aClass332_39);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17537();
		}
	}

	@OriginalMember(owner = "client!abv", name = "cn", descriptor = "(Lclient!mu;)V", line = 1007)
	@Override
	public final void method17106(@OriginalArg(0) Class332 arg0) {
		this.aClass332_41 = arg0;
		this.aClass328_78.method26056(this.aClass332_41);
		this.aClass328_79.method26104(this.aClass328_78);
		this.aClass328_79.method26086();
		this.aClass332_39.method26235(arg0);
		this.aClass332_39.method26248();
		this.aClass328_92.method26056(this.aClass332_39);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17537();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ie", descriptor = "(Lclient!mu;)V", line = 1007)
	@Override
	public final void method17267(@OriginalArg(0) Class332 arg0) {
		this.aClass332_41 = arg0;
		this.aClass328_78.method26056(this.aClass332_41);
		this.aClass328_79.method26104(this.aClass328_78);
		this.aClass328_79.method26086();
		this.aClass332_39.method26235(arg0);
		this.aClass332_39.method26248();
		this.aClass328_92.method26056(this.aClass332_39);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17537();
		}
	}

	@OriginalMember(owner = "client!abv", name = "co", descriptor = "()Lclient!mu;", line = 1019)
	@Override
	public Class332 method17107() {
		return this.aClass332_41;
	}

	@OriginalMember(owner = "client!abv", name = "jc", descriptor = "()Lclient!mu;", line = 1019)
	@Override
	public Class332 method17271() {
		return this.aClass332_41;
	}

	@OriginalMember(owner = "client!abv", name = "jn", descriptor = "()Lclient!mu;", line = 1019)
	@Override
	public Class332 method17341() {
		return this.aClass332_41;
	}

	@OriginalMember(owner = "client!abv", name = "jp", descriptor = "(Lclient!mq;)V", line = 1023)
	@Override
	public final void method17170(@OriginalArg(0) Class328 arg0) {
		this.aClass328_91.method26104(arg0);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jb", descriptor = "(Lclient!mq;)V", line = 1023)
	@Override
	public final void method17272(@OriginalArg(0) Class328 arg0) {
		this.aClass328_91.method26104(arg0);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jo", descriptor = "(Lclient!mq;)V", line = 1023)
	@Override
	public final void method17274(@OriginalArg(0) Class328 arg0) {
		this.aClass328_91.method26104(arg0);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ch", descriptor = "(Lclient!mq;)V", line = 1023)
	@Override
	public final void method17322(@OriginalArg(0) Class328 arg0) {
		this.aClass328_91.method26104(arg0);
		this.method17476();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qx", descriptor = "()V", line = 1029)
	final void method17476() {
		this.aClass328_84.method26104(this.aClass328_78);
		this.aClass328_84.method26046(this.aClass328_91);
		this.aClass328_84.method26066(this.aFloatArrayArray21[0]);
		this.aClass328_84.method26107(this.aFloatArrayArray21[1]);
		this.aClass328_84.method26063(this.aFloatArrayArray21[2]);
		this.aClass328_84.method26064(this.aFloatArrayArray21[3]);
		this.aClass328_84.method26084(this.aFloatArrayArray21[4]);
		this.aClass328_84.method26065(this.aFloatArrayArray21[5]);
		this.aClass328_85.method26104(this.aClass328_84);
		this.method17483(this.aClass328_85);
	}

	@OriginalMember(owner = "client!abv", name = "wj", descriptor = "()V", line = 1029)
	final void method17657() {
		this.aClass328_84.method26104(this.aClass328_78);
		this.aClass328_84.method26046(this.aClass328_91);
		this.aClass328_84.method26066(this.aFloatArrayArray21[0]);
		this.aClass328_84.method26107(this.aFloatArrayArray21[1]);
		this.aClass328_84.method26063(this.aFloatArrayArray21[2]);
		this.aClass328_84.method26064(this.aFloatArrayArray21[3]);
		this.aClass328_84.method26084(this.aFloatArrayArray21[4]);
		this.aClass328_84.method26065(this.aFloatArrayArray21[5]);
		this.aClass328_85.method26104(this.aClass328_84);
		this.method17483(this.aClass328_85);
	}

	@OriginalMember(owner = "client!abv", name = "jq", descriptor = "()Lclient!mq;", line = 1042)
	@Override
	public final Class328 method17275() {
		return this.aClass328_91;
	}

	@OriginalMember(owner = "client!abv", name = "ci", descriptor = "()Lclient!mq;", line = 1042)
	@Override
	public final Class328 method17110() {
		return this.aClass328_91;
	}

	@OriginalMember(owner = "client!abv", name = "qb", descriptor = "()V", line = 1046)
	final void method17537() {
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!abv", name = "wn", descriptor = "()V", line = 1046)
	final void method17637() {
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!abv", name = "xe", descriptor = "()V", line = 1046)
	final void method17659() {
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!abv", name = "xh", descriptor = "()V", line = 1046)
	final void method17660() {
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!abv", name = "qm", descriptor = "()Lclient!mq;", line = 1050)
	Class328 method17478() {
		return this.aClass328_87;
	}

	@OriginalMember(owner = "client!abv", name = "xp", descriptor = "()Lclient!mq;", line = 1050)
	Class328 method17546() {
		return this.aClass328_87;
	}

	@OriginalMember(owner = "client!abv", name = "qa", descriptor = "()Lclient!mu;", line = 1054)
	Class332 method17479() {
		if (this.aClass234_3 != Class234.aClass234_4) {
			return this.aClass332_36;
		}
		if (!this.aBoolean446) {
			this.aClass332_37.method26235(this.aClass332_36);
			this.aClass332_37.method26193(this.aClass332_41);
			this.aClass328_80.method26056(this.aClass332_37);
			this.aBoolean446 = true;
		}
		return this.aClass332_37;
	}

	@OriginalMember(owner = "client!abv", name = "xn", descriptor = "()Lclient!mu;", line = 1054)
	Class332 method17662() {
		if (this.aClass234_3 != Class234.aClass234_4) {
			return this.aClass332_36;
		}
		if (!this.aBoolean446) {
			this.aClass332_37.method26235(this.aClass332_36);
			this.aClass332_37.method26193(this.aClass332_41);
			this.aClass328_80.method26056(this.aClass332_37);
			this.aBoolean446 = true;
		}
		return this.aClass332_37;
	}

	@OriginalMember(owner = "client!abv", name = "xo", descriptor = "()Lclient!mu;", line = 1054)
	Class332 method17663() {
		if (this.aClass234_3 != Class234.aClass234_4) {
			return this.aClass332_36;
		}
		if (!this.aBoolean446) {
			this.aClass332_37.method26235(this.aClass332_36);
			this.aClass332_37.method26193(this.aClass332_41);
			this.aClass328_80.method26056(this.aClass332_37);
			this.aBoolean446 = true;
		}
		return this.aClass332_37;
	}

	@OriginalMember(owner = "client!abv", name = "xj", descriptor = "()Lclient!mq;", line = 1069)
	Class328 method17470() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			if (!this.aBoolean446) {
				this.method17479();
			}
			return this.aClass328_80;
		} else {
			return this.aClass328_87;
		}
	}

	@OriginalMember(owner = "client!abv", name = "qg", descriptor = "()Lclient!mq;", line = 1069)
	Class328 method17480() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			if (!this.aBoolean446) {
				this.method17479();
			}
			return this.aClass328_80;
		} else {
			return this.aClass328_87;
		}
	}

	@OriginalMember(owner = "client!abv", name = "qr", descriptor = "()Lclient!mq;", line = 1079)
	final Class328 method17481() {
		return this.aClass328_85;
	}

	@OriginalMember(owner = "client!abv", name = "xt", descriptor = "()Lclient!mq;", line = 1079)
	final Class328 method17665() {
		return this.aClass328_85;
	}

	@OriginalMember(owner = "client!abv", name = "xk", descriptor = "()Lclient!mq;", line = 1079)
	final Class328 method17816() {
		return this.aClass328_85;
	}

	@OriginalMember(owner = "client!abv", name = "qt", descriptor = "()Lclient!mq;", line = 1083)
	final Class328 method17482() {
		return this.aClass328_83;
	}

	@OriginalMember(owner = "client!abv", name = "xc", descriptor = "()Lclient!mq;", line = 1083)
	final Class328 method17636() {
		return this.aClass328_83;
	}

	@OriginalMember(owner = "client!abv", name = "xr", descriptor = "()Lclient!mq;", line = 1083)
	final Class328 method17666() {
		return this.aClass328_83;
	}

	@OriginalMember(owner = "client!abv", name = "qd", descriptor = "()V", line = 1089)
	final void method17491() {
		if (this.aClass234_3 == Class234.aClass234_6) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_6;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.aClass328_82 = this.aClass328_81;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF0;
	}

	@OriginalMember(owner = "client!abv", name = "xg", descriptor = "()V", line = 1089)
	final void method17705() {
		if (this.aClass234_3 == Class234.aClass234_6) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_6;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.aClass328_82 = this.aClass328_81;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF0;
	}

	@OriginalMember(owner = "client!abv", name = "xy", descriptor = "()V", line = 1089)
	final void method17766() {
		if (this.aClass234_3 == Class234.aClass234_6) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_6;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.aClass328_82 = this.aClass328_81;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF0;
	}

	@OriginalMember(owner = "client!abv", name = "xs", descriptor = "()V", line = 1101)
	final void method17489() {
		if (this.aClass234_3 == Class234.aClass234_5) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_5;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.method17486();
		this.aClass328_82 = this.aClass328_77;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF7;
	}

	@OriginalMember(owner = "client!abv", name = "qp", descriptor = "()V", line = 1101)
	final void method17549() {
		if (this.aClass234_3 == Class234.aClass234_5) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_5;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.method17486();
		this.aClass328_82 = this.aClass328_77;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF7;
	}

	@OriginalMember(owner = "client!abv", name = "xb", descriptor = "()V", line = 1101)
	final void method17672() {
		if (this.aClass234_3 == Class234.aClass234_5) {
			return;
		}
		@Pc(6) Class234 local6 = this.aClass234_3;
		this.aClass234_3 = Class234.aClass234_5;
		if (local6 == Class234.aClass234_4) {
			this.method17537();
		}
		this.method17486();
		this.aClass328_82 = this.aClass328_77;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF7;
	}

	@OriginalMember(owner = "client!abv", name = "xx", descriptor = "()V", line = 1114)
	final void method17477() {
		this.aBoolean426 = false;
		if (this.aClass234_3 == Class234.aClass234_5) {
			this.method17486();
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qq", descriptor = "()V", line = 1114)
	final void method17730() {
		this.aBoolean426 = false;
		if (this.aClass234_3 == Class234.aClass234_5) {
			this.method17486();
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qv", descriptor = "()V", line = 1122)
	final void method17485() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			return;
		}
		this.aClass234_3 = Class234.aClass234_4;
		this.method17537();
		this.method17560();
		this.aClass328_82 = this.aClass328_91;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abv", name = "xz", descriptor = "()V", line = 1122)
	final void method17674() {
		if (this.aClass234_3 == Class234.aClass234_4) {
			return;
		}
		this.aClass234_3 = Class234.aClass234_4;
		this.method17537();
		this.method17560();
		this.aClass328_82 = this.aClass328_91;
		this.method17811();
		this.method17630();
		this.anInt2524 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!abv", name = "xw", descriptor = "()V", line = 1134)
	final void method17434() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "xq", descriptor = "()V", line = 1134)
	final void method17543() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qo", descriptor = "()V", line = 1134)
	final void method17592() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "xa", descriptor = "()V", line = 1134)
	final void method17675() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "xf", descriptor = "()V", line = 1134)
	final void method17677() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "xd", descriptor = "()V", line = 1134)
	final void method17679() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "xv", descriptor = "()V", line = 1134)
	final void method17680() {
		this.aBoolean427 = false;
		this.method17560();
		if (this.aClass234_3 == Class234.aClass234_4) {
			this.method17811();
		}
	}

	@OriginalMember(owner = "client!abv", name = "qn", descriptor = "()V", line = 1140)
	final void method17486() {
		if (this.aBoolean426) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass19_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass19_6.method21390();
			local13 = this.aClass19_6.method21391();
		}
		@Pc(21) Class328 local21 = this.aClass328_77;
		if (local9 == 0 || local13 == 0) {
			local21.method26042();
		} else {
			local21.method26055(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass328_90.method26104(local21);
		this.method17483(this.aClass328_90);
		this.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!abv", name = "xu", descriptor = "()V", line = 1140)
	final void method17681() {
		if (this.aBoolean426) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass19_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass19_6.method21390();
			local13 = this.aClass19_6.method21391();
		}
		@Pc(21) Class328 local21 = this.aClass328_77;
		if (local9 == 0 || local13 == 0) {
			local21.method26042();
		} else {
			local21.method26055(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass328_90.method26104(local21);
		this.method17483(this.aClass328_90);
		this.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ql", descriptor = "()V", line = 1163)
	final void method17560() {
		if (!this.aBoolean427) {
			this.aBoolean427 = true;
		}
	}

	@OriginalMember(owner = "client!abv", name = "xm", descriptor = "()V", line = 1163)
	final void method17682() {
		if (!this.aBoolean427) {
			this.aBoolean427 = true;
		}
	}

	@OriginalMember(owner = "client!abv", name = "rz", descriptor = "()V", line = 1169)
	final void method17811() {
		this.aClass328_83.method26104(this.aClass328_82);
		this.method17483(this.aClass328_83);
		this.aFloat192 = (this.aClass328_83.aFloatArray106[14] - this.aClass328_83.aFloatArray106[15]) / (this.aClass328_83.aFloatArray106[11] - this.aClass328_83.aFloatArray106[10]);
		this.aFloat184 = -this.aClass328_83.aFloatArray106[14] / this.aClass328_83.aFloatArray106[10];
		this.method17690();
	}

	@OriginalMember(owner = "client!abv", name = "cd", descriptor = "(Z)V", line = 1177)
	@Override
	public final void method17108(@OriginalArg(0) boolean arg0) {
		this.aBoolean434 = arg0;
		this.method17490();
	}

	@OriginalMember(owner = "client!abv", name = "gy", descriptor = "(Z)V", line = 1177)
	@Override
	public final void method17119(@OriginalArg(0) boolean arg0) {
		this.aBoolean434 = arg0;
		this.method17490();
	}

	@OriginalMember(owner = "client!abv", name = "gf", descriptor = "(Z)V", line = 1177)
	@Override
	public final void method17194(@OriginalArg(0) boolean arg0) {
		this.aBoolean434 = arg0;
		this.method17490();
	}

	@OriginalMember(owner = "client!abv", name = "rp", descriptor = "(Z)V", line = 1182)
	final void method17488(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean428) {
			this.aBoolean428 = arg0;
			this.method17793();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ye", descriptor = "(Z)V", line = 1182)
	final void method17683(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean428) {
			this.aBoolean428 = arg0;
			this.method17793();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "yj", descriptor = "(Z)V", line = 1182)
	final void method17684(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean428) {
			this.aBoolean428 = arg0;
			this.method17793();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ym", descriptor = "(Z)V", line = 1190)
	final void method17587(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean429) {
			this.aBoolean429 = arg0;
			this.method17490();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "rj", descriptor = "(Z)V", line = 1190)
	final void method17685(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean429) {
			this.aBoolean429 = arg0;
			this.method17490();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ys", descriptor = "(Z)V", line = 1190)
	final void method17726(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean429) {
			this.aBoolean429 = arg0;
			this.method17490();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "oi", descriptor = "(FFF[F)V", line = 1201)
	@Override
	public void method17236(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat186 + this.aFloat187 * local59 / local29;
		arg3[1] = this.aFloat183 + this.aFloat200 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abv", name = "du", descriptor = "(FFF[F)V", line = 1201)
	@Override
	public void method17138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat186 + this.aFloat187 * local59 / local29;
		arg3[1] = this.aFloat183 + this.aFloat200 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abv", name = "oc", descriptor = "(FFF[F)V", line = 1201)
	@Override
	public void method17408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		@Pc(119) float local119 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
		arg3[0] = this.aFloat186 + this.aFloat187 * local59 / local29;
		arg3[1] = this.aFloat183 + this.aFloat200 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abv", name = "dw", descriptor = "(FFF[F)V", line = 1211)
	@Override
	public void method17030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * arg0 + this.aClass328_84.aFloatArray106[6] * arg1 + this.aClass328_84.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat186 + this.aFloat187 * local115 / local59;
			arg3[1] = this.aFloat183 + this.aFloat200 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ls", descriptor = "(FFF[F)V", line = 1211)
	@Override
	public void method17312(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * arg0 + this.aClass328_84.aFloatArray106[6] * arg1 + this.aClass328_84.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat186 + this.aFloat187 * local115 / local59;
			arg3[1] = this.aFloat183 + this.aFloat200 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abv", name = "lx", descriptor = "(FFF[F)V", line = 1211)
	@Override
	public void method17323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * arg0 + this.aClass328_84.aFloatArray106[6] * arg1 + this.aClass328_84.aFloatArray106[10] * arg2;
		@Pc(59) float local59 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * arg0 + this.aClass328_84.aFloatArray106[7] * arg1 + this.aClass328_84.aFloatArray106[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * arg0 + this.aClass328_84.aFloatArray106[4] * arg1 + this.aClass328_84.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * arg0 + this.aClass328_84.aFloatArray106[5] * arg1 + this.aClass328_84.aFloatArray106[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_78.aFloatArray106[14] + this.aClass328_78.aFloatArray106[2] * arg0 + this.aClass328_78.aFloatArray106[6] * arg1 + this.aClass328_78.aFloatArray106[10] * arg2;
			arg3[0] = this.aFloat186 + this.aFloat187 * local115 / local59;
			arg3[1] = this.aFloat183 + this.aFloat200 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abv", name = "ba", descriptor = "(IIIIII)I", line = 1246)
	@Override
	public int method17145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg0 + this.aClass328_84.aFloatArray106[6] * (float) arg1 + this.aClass328_84.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg3 + this.aClass328_84.aFloatArray106[6] * (float) arg4 + this.aClass328_84.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg0 + this.aClass328_84.aFloatArray106[7] * (float) arg1 + this.aClass328_84.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg3 + this.aClass328_84.aFloatArray106[7] * (float) arg4 + this.aClass328_84.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg0 + this.aClass328_84.aFloatArray106[4] * (float) arg1 + this.aClass328_84.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg3 + this.aClass328_84.aFloatArray106[4] * (float) arg4 + this.aClass328_84.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg0 + this.aClass328_84.aFloatArray106[5] * (float) arg1 + this.aClass328_84.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg3 + this.aClass328_84.aFloatArray106[5] * (float) arg4 + this.aClass328_84.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abv", name = "hb", descriptor = "(IIIIII)I", line = 1246)
	@Override
	public int method17227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg0 + this.aClass328_84.aFloatArray106[6] * (float) arg1 + this.aClass328_84.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg3 + this.aClass328_84.aFloatArray106[6] * (float) arg4 + this.aClass328_84.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg0 + this.aClass328_84.aFloatArray106[7] * (float) arg1 + this.aClass328_84.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg3 + this.aClass328_84.aFloatArray106[7] * (float) arg4 + this.aClass328_84.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg0 + this.aClass328_84.aFloatArray106[4] * (float) arg1 + this.aClass328_84.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg3 + this.aClass328_84.aFloatArray106[4] * (float) arg4 + this.aClass328_84.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg0 + this.aClass328_84.aFloatArray106[5] * (float) arg1 + this.aClass328_84.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg3 + this.aClass328_84.aFloatArray106[5] * (float) arg4 + this.aClass328_84.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abv", name = "hz", descriptor = "(IIIIII)I", line = 1246)
	@Override
	public int method17228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg0 + this.aClass328_84.aFloatArray106[6] * (float) arg1 + this.aClass328_84.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg3 + this.aClass328_84.aFloatArray106[6] * (float) arg4 + this.aClass328_84.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg0 + this.aClass328_84.aFloatArray106[7] * (float) arg1 + this.aClass328_84.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg3 + this.aClass328_84.aFloatArray106[7] * (float) arg4 + this.aClass328_84.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg0 + this.aClass328_84.aFloatArray106[4] * (float) arg1 + this.aClass328_84.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg3 + this.aClass328_84.aFloatArray106[4] * (float) arg4 + this.aClass328_84.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg0 + this.aClass328_84.aFloatArray106[5] * (float) arg1 + this.aClass328_84.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg3 + this.aClass328_84.aFloatArray106[5] * (float) arg4 + this.aClass328_84.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abv", name = "hx", descriptor = "(IIIIII)I", line = 1246)
	@Override
	public int method17229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg0 + this.aClass328_84.aFloatArray106[6] * (float) arg1 + this.aClass328_84.aFloatArray106[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass328_84.aFloatArray106[14] + this.aClass328_84.aFloatArray106[2] * (float) arg3 + this.aClass328_84.aFloatArray106[6] * (float) arg4 + this.aClass328_84.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg0 + this.aClass328_84.aFloatArray106[7] * (float) arg1 + this.aClass328_84.aFloatArray106[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass328_84.aFloatArray106[15] + this.aClass328_84.aFloatArray106[3] * (float) arg3 + this.aClass328_84.aFloatArray106[7] * (float) arg4 + this.aClass328_84.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg0 + this.aClass328_84.aFloatArray106[4] * (float) arg1 + this.aClass328_84.aFloatArray106[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass328_84.aFloatArray106[12] + this.aClass328_84.aFloatArray106[0] * (float) arg3 + this.aClass328_84.aFloatArray106[4] * (float) arg4 + this.aClass328_84.aFloatArray106[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg0 + this.aClass328_84.aFloatArray106[5] * (float) arg1 + this.aClass328_84.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass328_84.aFloatArray106[13] + this.aClass328_84.aFloatArray106[1] * (float) arg3 + this.aClass328_84.aFloatArray106[5] * (float) arg4 + this.aClass328_84.aFloatArray106[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abv", name = "bc", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1265)
	@Override
	boolean method17029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.aClass328_86;
		local2.method26056(arg4);
		local2.method26046(this.aClass328_84);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat186, this.aFloat183, this.aFloat187, this.aFloat200);
	}

	@OriginalMember(owner = "client!abv", name = "hs", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1265)
	@Override
	boolean method17230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.aClass328_86;
		local2.method26056(arg4);
		local2.method26046(this.aClass328_84);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat186, this.aFloat183, this.aFloat187, this.aFloat200);
	}

	@OriginalMember(owner = "client!abv", name = "hn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1272)
	@Override
	public void method17122(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.aClass328_86;
		local2.method26056(arg0);
		local2.method26046(this.aClass328_84);
		arg1.method22929(arg2, this.aClass328_91, local2, this.aFloat186, this.aFloat183, this.aFloat187, this.aFloat200);
	}

	@OriginalMember(owner = "client!abv", name = "bn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1272)
	@Override
	public void method17082(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.aClass328_86;
		local2.method26056(arg0);
		local2.method26046(this.aClass328_84);
		arg1.method22929(arg2, this.aClass328_91, local2, this.aFloat186, this.aFloat183, this.aFloat187, this.aFloat200);
	}

	@OriginalMember(owner = "client!abv", name = "cf", descriptor = "()I", line = 1279)
	@Override
	public final int method17023() {
		return this.anInt2526 - 2;
	}

	@OriginalMember(owner = "client!abv", name = "iw", descriptor = "()I", line = 1279)
	@Override
	public final int method17375() {
		return this.anInt2526 - 2;
	}

	@OriginalMember(owner = "client!abv", name = "ii", descriptor = "()I", line = 1279)
	@Override
	public final int method17378() {
		return this.anInt2526 - 2;
	}

	@OriginalMember(owner = "client!abv", name = "ri", descriptor = "(Z)V", line = 1283)
	final void method17533(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean430) {
			this.aBoolean430 = arg0;
			this.method17493();
			this.anInt2524 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!abv", name = "yl", descriptor = "(Z)V", line = 1283)
	final void method17689(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean430) {
			this.aBoolean430 = arg0;
			this.method17493();
			this.anInt2524 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!abv", name = "df", descriptor = "(I[Lclient!afz;)V", line = 1291)
	@Override
	public final void method17310(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass3_Sub15Array19[local1] = arg1[local1];
		}
		this.anInt2509 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "lg", descriptor = "(I[Lclient!afz;)V", line = 1291)
	@Override
	public final void method17342(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass3_Sub15Array19[local1] = arg1[local1];
		}
		this.anInt2509 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "ca", descriptor = "(F)V", line = 1296)
	@Override
	public final void method17111(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method17494();
			this.method17497();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jy", descriptor = "(F)V", line = 1296)
	@Override
	public final void method17099(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method17494();
			this.method17497();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jg", descriptor = "(F)V", line = 1296)
	@Override
	public final void method17192(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method17494();
			this.method17497();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jm", descriptor = "(F)V", line = 1296)
	@Override
	public final void method17277(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method17494();
			this.method17497();
		}
	}

	@OriginalMember(owner = "client!abv", name = "jz", descriptor = "(F)V", line = 1296)
	@Override
	public final void method17279(@OriginalArg(0) float arg0) {
		if (this.aFloat197 != arg0) {
			this.aFloat197 = arg0;
			this.method17494();
			this.method17497();
		}
	}

	@OriginalMember(owner = "client!abv", name = "cr", descriptor = "(IFFFFF)V", line = 1304)
	@Override
	public final void method17132(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2491 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat195 != local11 || this.aFloat196 != local15) {
			this.anInt2491 = arg0;
			this.aFloat195 = local11;
			this.aFloat196 = local15;
			if (local7) {
				this.aFloat193 = (float) (this.anInt2491 & 0xFF0000) / 1.671168E7F;
				this.aFloat194 = (float) (this.anInt2491 & 0xFF00) / 65280.0F;
				this.aFloat185 = (float) (this.anInt2491 & 0xFF) / 255.0F;
				this.method17494();
			}
			this.method17495();
		}
		if (this.aFloatArray78[0] != arg3 || this.aFloatArray78[1] != arg4 || this.aFloatArray78[2] != arg5) {
			this.aFloatArray78[0] = arg3;
			this.aFloatArray78[1] = arg4;
			this.aFloatArray78[2] = arg5;
			this.aFloatArray79[0] = -arg3;
			this.aFloatArray79[1] = -arg4;
			this.aFloatArray79[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray76[0] = arg3 * local140;
			this.aFloatArray76[1] = arg4 * local140;
			this.aFloatArray76[2] = arg5 * local140;
			this.aFloatArray77[0] = -this.aFloatArray76[0];
			this.aFloatArray77[1] = -this.aFloatArray76[1];
			this.aFloatArray77[2] = -this.aFloatArray76[2];
			this.method17496();
			this.anInt2512 = (int) (arg3 * 256.0F / arg4);
			this.anInt2513 = (int) (arg5 * 256.0F / arg4);
		}
		this.method17497();
	}

	@OriginalMember(owner = "client!abv", name = "jd", descriptor = "(IFFFFF)V", line = 1304)
	@Override
	public final void method17319(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2491 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat195 != local11 || this.aFloat196 != local15) {
			this.anInt2491 = arg0;
			this.aFloat195 = local11;
			this.aFloat196 = local15;
			if (local7) {
				this.aFloat193 = (float) (this.anInt2491 & 0xFF0000) / 1.671168E7F;
				this.aFloat194 = (float) (this.anInt2491 & 0xFF00) / 65280.0F;
				this.aFloat185 = (float) (this.anInt2491 & 0xFF) / 255.0F;
				this.method17494();
			}
			this.method17495();
		}
		if (this.aFloatArray78[0] != arg3 || this.aFloatArray78[1] != arg4 || this.aFloatArray78[2] != arg5) {
			this.aFloatArray78[0] = arg3;
			this.aFloatArray78[1] = arg4;
			this.aFloatArray78[2] = arg5;
			this.aFloatArray79[0] = -arg3;
			this.aFloatArray79[1] = -arg4;
			this.aFloatArray79[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray76[0] = arg3 * local140;
			this.aFloatArray76[1] = arg4 * local140;
			this.aFloatArray76[2] = arg5 * local140;
			this.aFloatArray77[0] = -this.aFloatArray76[0];
			this.aFloatArray77[1] = -this.aFloatArray76[1];
			this.aFloatArray77[2] = -this.aFloatArray76[2];
			this.method17496();
			this.anInt2512 = (int) (arg3 * 256.0F / arg4);
			this.anInt2513 = (int) (arg5 * 256.0F / arg4);
		}
		this.method17497();
	}

	@OriginalMember(owner = "client!abv", name = "ja", descriptor = "(I)V", line = 1341)
	@Override
	public final void method17282(@OriginalArg(0) int arg0) {
		this.anInt2511 = 0;
		while (arg0 > 1) {
			this.anInt2511++;
			arg0 >>= 0x1;
		}
		this.anInt2510 = 0x1 << this.anInt2511;
	}

	@OriginalMember(owner = "client!abv", name = "jx", descriptor = "(I)V", line = 1341)
	@Override
	public final void method17406(@OriginalArg(0) int arg0) {
		this.anInt2511 = 0;
		while (arg0 > 1) {
			this.anInt2511++;
			arg0 >>= 0x1;
		}
		this.anInt2510 = 0x1 << this.anInt2511;
	}

	@OriginalMember(owner = "client!abv", name = "ce", descriptor = "(I)V", line = 1341)
	@Override
	public final void method17412(@OriginalArg(0) int arg0) {
		this.anInt2511 = 0;
		while (arg0 > 1) {
			this.anInt2511++;
			arg0 >>= 0x1;
		}
		this.anInt2510 = 0x1 << this.anInt2511;
	}

	@OriginalMember(owner = "client!abv", name = "rk", descriptor = "()V", line = 1357)
	final void method17647() {
		if (this.method17547()) {
			this.method17499();
		}
		this.anInt2508 = this.anInt2509;
	}

	@OriginalMember(owner = "client!abv", name = "yh", descriptor = "()V", line = 1357)
	final void method17702() {
		if (this.method17547()) {
			this.method17499();
		}
		this.anInt2508 = this.anInt2509;
	}

	@OriginalMember(owner = "client!abv", name = "yx", descriptor = "()V", line = 1357)
	final void method17703() {
		if (this.method17547()) {
			this.method17499();
		}
		this.anInt2508 = this.anInt2509;
	}

	@OriginalMember(owner = "client!abv", name = "rf", descriptor = "(IIZ[I)Lclient!ic;", line = 1368)
	final Interface20 method17501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method17507(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zs", descriptor = "(IIZ[I)Lclient!ic;", line = 1368)
	final Interface20 method17562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method17507(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zr", descriptor = "(IIZ[I)Lclient!ic;", line = 1368)
	final Interface20 method17707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method17507(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zt", descriptor = "(IIZ[I)Lclient!ic;", line = 1368)
	final Interface20 method17708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method17507(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zz", descriptor = "(Lclient!cw;IIZ[B)Lclient!ic;", line = 1372)
	final Interface20 method17429(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method17505(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "rs", descriptor = "(Lclient!cw;IIZ[B)Lclient!ic;", line = 1372)
	final Interface20 method17502(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method17505(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zo", descriptor = "(Lclient!cw;IIZ[B)Lclient!ic;", line = 1372)
	final Interface20 method17541(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method17505(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zd", descriptor = "(Lclient!cw;IIZ[B)Lclient!ic;", line = 1372)
	final Interface20 method17773(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method17505(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "rd", descriptor = "(Lclient!cw;IIZ[F)Lclient!ic;", line = 1376)
	final Interface20 method17440(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method17506(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "zk", descriptor = "(Lclient!cw;IIZ[F)Lclient!ic;", line = 1376)
	final Interface20 method17712(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method17506(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!abv", name = "aab", descriptor = "()I", line = 1388)
	public final int method17539() {
		return this.anInt2516;
	}

	@OriginalMember(owner = "client!abv", name = "zg", descriptor = "()I", line = 1388)
	public final int method17581() {
		return this.anInt2516;
	}

	@OriginalMember(owner = "client!abv", name = "ss", descriptor = "()I", line = 1388)
	public final int method17719() {
		return this.anInt2516;
	}

	@OriginalMember(owner = "client!abv", name = "se", descriptor = "(I)V", line = 1392)
	public final void method17512(@OriginalArg(0) int arg0) {
		if (this.anInt2516 != arg0) {
			this.anInt2516 = arg0;
			this.method17582();
		}
	}

	@OriginalMember(owner = "client!abv", name = "aae", descriptor = "(I)V", line = 1392)
	public final void method17728(@OriginalArg(0) int arg0) {
		if (this.anInt2516 != arg0) {
			this.anInt2516 = arg0;
			this.method17582();
		}
	}

	@OriginalMember(owner = "client!abv", name = "aao", descriptor = "(I)V", line = 1392)
	public final void method17729(@OriginalArg(0) int arg0) {
		if (this.anInt2516 != arg0) {
			this.anInt2516 = arg0;
			this.method17582();
		}
	}

	@OriginalMember(owner = "client!abv", name = "sg", descriptor = "(Lclient!jl;)V", line = 1399)
	public final void method17513(@OriginalArg(0) Interface28 arg0) {
		if (this.anInterface28Array3[this.anInt2516] == arg0) {
			return;
		}
		this.anInterface28Array3[this.anInt2516] = arg0;
		if (arg0 == null) {
			this.anInterface20_23.method9872();
		} else {
			arg0.method9872();
		}
		this.anInt2524 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!abv", name = "aaf", descriptor = "(Lclient!jl;)V", line = 1399)
	public final void method17564(@OriginalArg(0) Interface28 arg0) {
		if (this.anInterface28Array3[this.anInt2516] == arg0) {
			return;
		}
		this.anInterface28Array3[this.anInt2516] = arg0;
		if (arg0 == null) {
			this.anInterface20_23.method9872();
		} else {
			arg0.method9872();
		}
		this.anInt2524 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!abv", name = "aap", descriptor = "(I)V", line = 1410)
	public final void method17696(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method17699(Class251.aClass251_2, Class251.aClass251_2);
				break;
			case 1:
				this.method17699(Class251.aClass251_3, Class251.aClass251_3);
				break;
			case 2:
				this.method17699(Class251.aClass251_5, Class251.aClass251_3);
				break;
			case 3:
				this.method17699(Class251.aClass251_1, Class251.aClass251_2);
				break;
			case 4:
				this.method17699(Class251.aClass251_4, Class251.aClass251_4);
		}
	}

	@OriginalMember(owner = "client!abv", name = "sx", descriptor = "(I)V", line = 1410)
	public final void method17710(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method17699(Class251.aClass251_2, Class251.aClass251_2);
				break;
			case 1:
				this.method17699(Class251.aClass251_3, Class251.aClass251_3);
				break;
			case 2:
				this.method17699(Class251.aClass251_5, Class251.aClass251_3);
				break;
			case 3:
				this.method17699(Class251.aClass251_1, Class251.aClass251_2);
				break;
			case 4:
				this.method17699(Class251.aClass251_4, Class251.aClass251_4);
		}
	}

	@OriginalMember(owner = "client!abv", name = "aar", descriptor = "(I)V", line = 1410)
	public final void method17735(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method17699(Class251.aClass251_2, Class251.aClass251_2);
				break;
			case 1:
				this.method17699(Class251.aClass251_3, Class251.aClass251_3);
				break;
			case 2:
				this.method17699(Class251.aClass251_5, Class251.aClass251_3);
				break;
			case 3:
				this.method17699(Class251.aClass251_1, Class251.aClass251_2);
				break;
			case 4:
				this.method17699(Class251.aClass251_4, Class251.aClass251_4);
		}
	}

	@OriginalMember(owner = "client!abv", name = "aal", descriptor = "(Lclient!ja;Lclient!ja;)V", line = 1430)
	public final void method17673(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass251Array5[this.anInt2516] != arg0) {
			this.aClass251Array5[this.anInt2516] = arg0;
			this.method17525();
			local1 = true;
		}
		if (this.aClass251Array6[this.anInt2516] != arg1) {
			this.aClass251Array6[this.anInt2516] = arg1;
			this.method17526();
			local1 = true;
		}
		if (local1) {
			this.anInt2524 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abv", name = "sz", descriptor = "(Lclient!ja;Lclient!ja;)V", line = 1430)
	public final void method17699(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass251Array5[this.anInt2516] != arg0) {
			this.aClass251Array5[this.anInt2516] = arg0;
			this.method17525();
			local1 = true;
		}
		if (this.aClass251Array6[this.anInt2516] != arg1) {
			this.aClass251Array6[this.anInt2516] = arg1;
			this.method17526();
			local1 = true;
		}
		if (local1) {
			this.anInt2524 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abv", name = "aax", descriptor = "(Lclient!ja;Lclient!ja;)V", line = 1430)
	public final void method17736(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass251Array5[this.anInt2516] != arg0) {
			this.aClass251Array5[this.anInt2516] = arg0;
			this.method17525();
			local1 = true;
		}
		if (this.aClass251Array6[this.anInt2516] != arg1) {
			this.aClass251Array6[this.anInt2516] = arg1;
			this.method17526();
			local1 = true;
		}
		if (local1) {
			this.anInt2524 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abv", name = "aav", descriptor = "(Lclient!ja;Lclient!ja;)V", line = 1430)
	public final void method17737(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass251Array5[this.anInt2516] != arg0) {
			this.aClass251Array5[this.anInt2516] = arg0;
			this.method17525();
			local1 = true;
		}
		if (this.aClass251Array6[this.anInt2516] != arg1) {
			this.aClass251Array6[this.anInt2516] = arg1;
			this.method17526();
			local1 = true;
		}
		if (local1) {
			this.anInt2524 &= 0xFFFFFFF2;
		}
	}

	@OriginalMember(owner = "client!abv", name = "aaq", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17460(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "aai", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17594(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "sf", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17658(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "aag", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17739(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "aau", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17740(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "aaa", descriptor = "(ILclient!jg;)V", line = 1447)
	public final void method17741(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17517(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!abv", name = "sw", descriptor = "(ILclient!jg;)V", line = 1453)
	public final void method17591(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17518(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!abv", name = "aaj", descriptor = "(ILclient!jg;)V", line = 1453)
	public final void method17744(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17518(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!abv", name = "aad", descriptor = "(ILclient!jg;)V", line = 1453)
	public final void method17745(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1) {
		this.method17518(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!abv", name = "sc", descriptor = "(I)V", line = 1459)
	public void method17519(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2507) {
			this.anInt2507 = arg0;
			this.method17678();
		}
	}

	@OriginalMember(owner = "client!abv", name = "sb", descriptor = "()Lclient!mq;", line = 1466)
	final Class328 method17646() {
		return this.aClass328Array6[this.anInt2516];
	}

	@OriginalMember(owner = "client!abv", name = "abs", descriptor = "()Lclient!mq;", line = 1470)
	public final Class328 method17458() {
		return this.aClass328Array6[this.anInt2516];
	}

	@OriginalMember(owner = "client!abv", name = "abo", descriptor = "()Lclient!mq;", line = 1470)
	public final Class328 method17751() {
		return this.aClass328Array6[this.anInt2516];
	}

	@OriginalMember(owner = "client!abv", name = "abh", descriptor = "()Lclient!mq;", line = 1470)
	public final Class328 method17752() {
		return this.aClass328Array6[this.anInt2516];
	}

	@OriginalMember(owner = "client!abv", name = "sp", descriptor = "()Lclient!mq;", line = 1470)
	public final Class328 method17814() {
		return this.aClass328Array6[this.anInt2516];
	}

	@OriginalMember(owner = "client!abv", name = "abj", descriptor = "(Lclient!jz;)V", line = 1474)
	public final void method17461(@OriginalArg(0) Class268 arg0) {
		this.aClass268Array3[this.anInt2516] = arg0;
		this.method17733();
	}

	@OriginalMember(owner = "client!abv", name = "su", descriptor = "(Lclient!jz;)V", line = 1474)
	public final void method17520(@OriginalArg(0) Class268 arg0) {
		this.aClass268Array3[this.anInt2516] = arg0;
		this.method17733();
	}

	@OriginalMember(owner = "client!abv", name = "abe", descriptor = "(Lclient!jz;)V", line = 1474)
	public final void method17754(@OriginalArg(0) Class268 arg0) {
		this.aClass268Array3[this.anInt2516] = arg0;
		this.method17733();
	}

	@OriginalMember(owner = "client!abv", name = "abg", descriptor = "(Lclient!jz;)V", line = 1474)
	public final void method17755(@OriginalArg(0) Class268 arg0) {
		this.aClass268Array3[this.anInt2516] = arg0;
		this.method17733();
	}

	@OriginalMember(owner = "client!abv", name = "sj", descriptor = "()V", line = 1479)
	final void method17521() {
		if (this.aClass268Array3[this.anInt2516] != Class268.aClass268_1) {
			this.aClass268Array3[this.anInt2516] = Class268.aClass268_1;
			this.aClass328Array6[this.anInt2516].method26042();
			this.method17733();
		}
	}

	@OriginalMember(owner = "client!abv", name = "si", descriptor = "()V", line = 1487)
	final void method17733() {
		this.method17523();
	}

	@OriginalMember(owner = "client!abv", name = "sy", descriptor = "()Lclient!dz;", line = 1497)
	Class139 method17671() {
		return this.aClass139_6;
	}

	@OriginalMember(owner = "client!abv", name = "abp", descriptor = "()Lclient!dz;", line = 1497)
	Class139 method17762() {
		return this.aClass139_6;
	}

	@OriginalMember(owner = "client!abv", name = "abc", descriptor = "()Lclient!dz;", line = 1497)
	Class139 method17763() {
		return this.aClass139_6;
	}

	@OriginalMember(owner = "client!abv", name = "dj", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17178(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ks", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17354(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "kb", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17369(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "kd", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17314(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "kj", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17191(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "ky", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17316(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "kq", descriptor = "(ILclient!dz;)V", line = 1501)
	@Override
	public final void method17317(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		this.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!abv", name = "dx", descriptor = "(ILclient!dz;)V", line = 1507)
	@Override
	public final void method17101(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		if (!this.aBoolean435) {
			throw new RuntimeException("");
		}
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		if (this.aBoolean436) {
			this.aClass40Array3[3].method16949();
			this.aClass40Array3[3].method16950();
		}
	}

	@OriginalMember(owner = "client!abv", name = "kc", descriptor = "(ILclient!dz;)V", line = 1507)
	@Override
	public final void method17358(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		if (!this.aBoolean435) {
			throw new RuntimeException("");
		}
		this.anInt2485 = arg0;
		this.aClass139_6 = arg1;
		if (this.aBoolean436) {
			this.aClass40Array3[3].method16949();
			this.aClass40Array3[3].method16950();
		}
	}

	@OriginalMember(owner = "client!abv", name = "ka", descriptor = "()V", line = 1517)
	@Override
	public final void method17336() {
		this.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!abv", name = "kp", descriptor = "()V", line = 1517)
	@Override
	public final void method17320() {
		this.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!abv", name = "dm", descriptor = "()V", line = 1517)
	@Override
	public final void method17368() {
		this.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!abv", name = "abd", descriptor = "(I)V", line = 1521)
	final void method17431(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "sn", descriptor = "(I)V", line = 1521)
	final void method17469(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "abf", descriptor = "(I)V", line = 1521)
	final void method17475(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "abb", descriptor = "(I)V", line = 1521)
	final void method17540(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "abm", descriptor = "(I)V", line = 1521)
	final void method17765(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "abn", descriptor = "(I)V", line = 1521)
	final void method17794(@OriginalArg(0) int arg0) {
		if (this.anInt2492 == arg0) {
			return;
		}
		@Pc(8) Class258 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class258.aClass258_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class258.aClass258_5;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class258.aClass258_4;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class258.aClass258_7;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class258.aClass258_7;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean433) {
			this.aBoolean433 = local10;
			this.method17441();
		}
		if (local12 != this.aBoolean440) {
			this.aBoolean440 = local12;
			this.method17535();
		}
		if (local8 != this.aClass258_3) {
			this.aClass258_3 = local8;
			this.method17534();
		}
		this.anInt2492 = arg0;
		this.anInt2524 &= 0xFFFFFFF3;
	}

	@OriginalMember(owner = "client!abv", name = "aba", descriptor = "(I)V", line = 1568)
	final void method17467(@OriginalArg(0) int arg0) {
		if (this.anInt2478 != arg0) {
			this.anInt2478 = arg0;
			this.method17534();
		}
	}

	@OriginalMember(owner = "client!abv", name = "abr", descriptor = "(I)V", line = 1568)
	final void method17524(@OriginalArg(0) int arg0) {
		if (this.anInt2478 != arg0) {
			this.anInt2478 = arg0;
			this.method17534();
		}
	}

	@OriginalMember(owner = "client!abv", name = "sa", descriptor = "(I)V", line = 1568)
	final void method17530(@OriginalArg(0) int arg0) {
		if (this.anInt2478 != arg0) {
			this.anInt2478 = arg0;
			this.method17534();
		}
	}

	@OriginalMember(owner = "client!abv", name = "aby", descriptor = "(I)V", line = 1568)
	final void method17676(@OriginalArg(0) int arg0) {
		if (this.anInt2478 != arg0) {
			this.anInt2478 = arg0;
			this.method17534();
		}
	}

	@OriginalMember(owner = "client!abv", name = "abu", descriptor = "(I)V", line = 1568)
	final void method17769(@OriginalArg(0) int arg0) {
		if (this.anInt2478 != arg0) {
			this.anInt2478 = arg0;
			this.method17534();
		}
	}

	@OriginalMember(owner = "client!abv", name = "st", descriptor = "(B)V", line = 1575)
	final void method17531(@OriginalArg(0) byte arg0) {
		if (this.aByte78 == arg0) {
			return;
		}
		this.aByte78 = arg0;
		if (arg0 == 0) {
			this.method17530(0);
			this.method17469(1);
		} else {
			this.method17530(3);
			this.method17469(3);
		}
		this.method17441();
	}

	@OriginalMember(owner = "client!abv", name = "ach", descriptor = "(B)V", line = 1575)
	final void method17692(@OriginalArg(0) byte arg0) {
		if (this.aByte78 == arg0) {
			return;
		}
		this.aByte78 = arg0;
		if (arg0 == 0) {
			this.method17530(0);
			this.method17469(1);
		} else {
			this.method17530(3);
			this.method17469(3);
		}
		this.method17441();
	}

	@OriginalMember(owner = "client!abv", name = "acw", descriptor = "(B)V", line = 1575)
	final void method17771(@OriginalArg(0) byte arg0) {
		if (this.aByte78 == arg0) {
			return;
		}
		this.aByte78 = arg0;
		if (arg0 == 0) {
			this.method17530(0);
			this.method17469(1);
		} else {
			this.method17530(3);
			this.method17469(3);
		}
		this.method17441();
	}

	@OriginalMember(owner = "client!abv", name = "acg", descriptor = "(B)V", line = 1575)
	final void method17772(@OriginalArg(0) byte arg0) {
		if (this.aByte78 == arg0) {
			return;
		}
		this.aByte78 = arg0;
		if (arg0 == 0) {
			this.method17530(0);
			this.method17469(1);
		} else {
			this.method17530(3);
			this.method17469(3);
		}
		this.method17441();
	}

	@OriginalMember(owner = "client!abv", name = "acc", descriptor = "(B)V", line = 1575)
	final void method17774(@OriginalArg(0) byte arg0) {
		if (this.aByte78 == arg0) {
			return;
		}
		this.aByte78 = arg0;
		if (arg0 == 0) {
			this.method17530(0);
			this.method17469(1);
		} else {
			this.method17530(3);
			this.method17469(3);
		}
		this.method17441();
	}

	@OriginalMember(owner = "client!abv", name = "ti", descriptor = "(Z)V", line = 1595)
	final void method17620(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean432) {
			this.aBoolean432 = arg0;
			this.method17462();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "acx", descriptor = "(Z)V", line = 1595)
	final void method17782(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean432) {
			this.aBoolean432 = arg0;
			this.method17462();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "acf", descriptor = "(Z)V", line = 1595)
	final void method17783(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean432) {
			this.aBoolean432 = arg0;
			this.method17462();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "acm", descriptor = "(Z)V", line = 1595)
	final void method17784(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean432) {
			this.aBoolean432 = arg0;
			this.method17462();
			this.anInt2524 &= 0xFFFFFFF0;
		}
	}

	@OriginalMember(owner = "client!abv", name = "cw", descriptor = "(III)V", line = 1603)
	@Override
	public final void method17114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2519 == arg0 && this.anInt2520 == arg1 && this.anInt2521 == arg2) {
			return;
		}
		this.anInt2519 = arg0;
		this.anInt2520 = arg1;
		this.anInt2521 = arg2;
		this.method17690();
		this.method17462();
	}

	@OriginalMember(owner = "client!abv", name = "jl", descriptor = "(III)V", line = 1603)
	@Override
	public final void method17234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2519 == arg0 && this.anInt2520 == arg1 && this.anInt2521 == arg2) {
			return;
		}
		this.anInt2519 = arg0;
		this.anInt2520 = arg1;
		this.anInt2521 = arg2;
		this.method17690();
		this.method17462();
	}

	@OriginalMember(owner = "client!abv", name = "jr", descriptor = "(III)V", line = 1603)
	@Override
	public final void method17027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2519 == arg0 && this.anInt2520 == arg1 && this.anInt2521 == arg2) {
			return;
		}
		this.anInt2519 = arg0;
		this.anInt2520 = arg1;
		this.anInt2521 = arg2;
		this.method17690();
		this.method17462();
	}

	@OriginalMember(owner = "client!abv", name = "ta", descriptor = "()V", line = 1613)
	final void method17690() {
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16950();
		}
		this.method17538();
	}

	@OriginalMember(owner = "client!abv", name = "aco", descriptor = "()V", line = 1613)
	final void method17785() {
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16950();
		}
		this.method17538();
	}

	@OriginalMember(owner = "client!abv", name = "acz", descriptor = "()V", line = 1613)
	final void method17786() {
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16950();
		}
		this.method17538();
	}

	@OriginalMember(owner = "client!abv", name = "acu", descriptor = "()V", line = 1613)
	final void method17787() {
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16950();
		}
		this.method17538();
	}

	@OriginalMember(owner = "client!abv", name = "ace", descriptor = "()V", line = 1613)
	final void method17788() {
		if (this.aClass40_3 != null) {
			this.aClass40_3.method16950();
		}
		this.method17538();
	}

	@OriginalMember(owner = "client!abv", name = "hl", descriptor = "(ILclient!ch;II)V", line = 1628)
	@Override
	public final void method17243(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17108(false);
		this.aClass6_Sub2_6.method16801(0.0F, 0.0F, (float) this.method17037().method21390(), 0.0F, 0.0F, (float) this.method17037().method21391(), 0, arg1, arg2, arg3);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abv", name = "ik", descriptor = "(ILclient!ch;II)V", line = 1628)
	@Override
	public final void method17327(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17108(false);
		this.aClass6_Sub2_6.method16801(0.0F, 0.0F, (float) this.method17037().method21390(), 0.0F, 0.0F, (float) this.method17037().method21391(), 0, arg1, arg2, arg3);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abv", name = "id", descriptor = "(ILclient!ch;II)V", line = 1628)
	@Override
	public final void method17245(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17108(false);
		this.aClass6_Sub2_6.method16801(0.0F, 0.0F, (float) this.method17037().method21390(), 0.0F, 0.0F, (float) this.method17037().method21391(), 0, arg1, arg2, arg3);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abv", name = "cl", descriptor = "(ILclient!ch;II)V", line = 1628)
	@Override
	public final void method17095(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method17108(false);
		this.aClass6_Sub2_6.method16801(0.0F, 0.0F, (float) this.method17037().method21390(), 0.0F, 0.0F, (float) this.method17037().method21391(), 0, arg1, arg2, arg3);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abv", name = "bf", descriptor = "(IIIIII)V", line = 1634)
	@Override
	public final void method17050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		if (this.aBoolean434) {
			this.method17108(false);
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method17108(true);
		} else {
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "lh", descriptor = "(IIIIII)V", line = 1634)
	@Override
	public final void method17198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		if (this.aBoolean434) {
			this.method17108(false);
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method17108(true);
		} else {
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "lp", descriptor = "(IIIIII)V", line = 1634)
	@Override
	public final void method17334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		if (this.aBoolean434) {
			this.method17108(false);
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method17108(true);
		} else {
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "lj", descriptor = "(IIIIII)V", line = 1634)
	@Override
	public final void method17115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		if (this.aBoolean434) {
			this.method17108(false);
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method17108(true);
		} else {
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "ly", descriptor = "(IIIIII)V", line = 1634)
	@Override
	public final void method17135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		if (this.aBoolean434) {
			this.method17108(false);
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method17108(true);
		} else {
			this.aClass6_Sub2_5.method16824(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "gk", descriptor = "(IIIIII)V", line = 1645)
	@Override
	public final void method17210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class21_Sub3_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		this.method17024(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method17024(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method17024(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method17024(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "bm", descriptor = "(IIIIII)V", line = 1645)
	@Override
	public final void method17068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class21_Sub3_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		this.method17024(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method17024(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method17024(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method17024(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "gs", descriptor = "(IIIIII)V", line = 1645)
	@Override
	public final void method17211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class21_Sub3_Sub1) {
			local3 = -1;
		}
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(false);
		}
		this.method17024(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method17024(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method17024(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method17024(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean439 && this.anInt2522 != 0) {
			this.method17770(true);
		}
	}

	@OriginalMember(owner = "client!abv", name = "bt", descriptor = "(IIFIIFIIFIIII)V", line = 1657)
	@Override
	public final void method17070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!abv", name = "lu", descriptor = "(IIFIIFIIFIIII)V", line = 1657)
	@Override
	public final void method17321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!abv", name = "gc", descriptor = "(IIIII)V", line = 1658)
	@Override
	final void method17290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!abv", name = "bk", descriptor = "(IIIII)V", line = 1658)
	@Override
	final void method17420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!abv", name = "bg", descriptor = "(IIIII)V", line = 1661)
	@Override
	final void method17072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "gw", descriptor = "(IIIII)V", line = 1661)
	@Override
	final void method17213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "gi", descriptor = "(IIIII)V", line = 1665)
	@Override
	final void method17215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "go", descriptor = "(IIIII)V", line = 1665)
	@Override
	final void method17214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "br", descriptor = "(IIIII)V", line = 1665)
	@Override
	final void method17073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method17024(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abv", name = "bb", descriptor = "(IIIIII)V", line = 1669)
	@Override
	public final void method17024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method17078(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!abv", name = "gb", descriptor = "(IIIIII)V", line = 1669)
	@Override
	public final void method17216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method17078(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!abv", name = "bl", descriptor = "(IIIIIIIII)V", line = 1673)
	@Override
	public void method17076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method17549();
		@Pc(50) Class40 local50 = this.aClass40Array3[13];
		local50.method16963();
		local50.method16948(arg4);
		this.method17469(arg5);
		local50.method16960();
		this.method17770(false);
		@Pc(69) int local69 = arg8 % (arg7 + arg6);
		@Pc(74) float local74 = local5 * (float) arg6;
		@Pc(79) float local79 = local11 * (float) arg6;
		@Pc(81) float local81 = 0.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(85) float local85 = local74;
		@Pc(87) float local87 = local79;
		if (local69 > arg6) {
			local81 = local5 * (float) (arg6 + arg7 - local69);
			local83 = local11 * (float) (arg6 + arg7 - local69);
		} else {
			local85 = local5 * (float) (arg6 - local69);
			local87 = local11 * (float) (arg6 - local69);
		}
		@Pc(128) float local128 = (float) arg0 + local81;
		@Pc(133) float local133 = (float) arg1 + local83;
		@Pc(138) float local138 = local5 * (float) arg7;
		@Pc(143) float local143 = local11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local128 > (float) arg2) {
					break;
				}
				if (local128 + local85 > (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			} else {
				if (local128 < (float) arg2) {
					break;
				}
				if (local128 + local85 < (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3) {
					break;
				}
				if (local133 + local87 > (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3) {
					break;
				}
				if (local133 + local87 < (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			}
			if (!this.method17449(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method17551();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method17770(true);
		local50.method16947();
	}

	@OriginalMember(owner = "client!abv", name = "gl", descriptor = "(IIIIIIIII)V", line = 1673)
	@Override
	public void method17304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method17549();
		@Pc(50) Class40 local50 = this.aClass40Array3[13];
		local50.method16963();
		local50.method16948(arg4);
		this.method17469(arg5);
		local50.method16960();
		this.method17770(false);
		@Pc(69) int local69 = arg8 % (arg7 + arg6);
		@Pc(74) float local74 = local5 * (float) arg6;
		@Pc(79) float local79 = local11 * (float) arg6;
		@Pc(81) float local81 = 0.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(85) float local85 = local74;
		@Pc(87) float local87 = local79;
		if (local69 > arg6) {
			local81 = local5 * (float) (arg6 + arg7 - local69);
			local83 = local11 * (float) (arg6 + arg7 - local69);
		} else {
			local85 = local5 * (float) (arg6 - local69);
			local87 = local11 * (float) (arg6 - local69);
		}
		@Pc(128) float local128 = (float) arg0 + local81;
		@Pc(133) float local133 = (float) arg1 + local83;
		@Pc(138) float local138 = local5 * (float) arg7;
		@Pc(143) float local143 = local11 * (float) arg7;
		while (true) {
			if (arg2 > arg0) {
				if (local128 > (float) arg2) {
					break;
				}
				if (local128 + local85 > (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			} else {
				if (local128 < (float) arg2) {
					break;
				}
				if (local128 + local85 < (float) arg2) {
					local85 = (float) arg2 - local128;
				}
			}
			if (arg3 > arg1) {
				if (local133 > (float) arg3) {
					break;
				}
				if (local133 + local87 > (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			} else {
				if (local133 < (float) arg3) {
					break;
				}
				if (local133 + local87 < (float) arg3) {
					local87 = (float) arg3 - local133;
				}
			}
			if (!this.method17449(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method17551();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method17770(true);
		local50.method16947();
	}

	@OriginalMember(owner = "client!abv", name = "hg", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1737)
	@Override
	public void method17223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!abv", name = "bi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1737)
	@Override
	public void method17077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!abv", name = "hi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1737)
	@Override
	public void method17220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!abv", name = "hk", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1737)
	@Override
	public void method17116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!abv", name = "ha", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1737)
	@Override
	public void method17222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!abv", name = "gu", descriptor = "(IIIIIILclient!ch;II)V", line = 1738)
	@Override
	public final void method17337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!abv", name = "by", descriptor = "(IIIIIILclient!ch;II)V", line = 1738)
	@Override
	public final void method17283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!abv", name = "gg", descriptor = "(IIIIIILclient!ch;II)V", line = 1738)
	@Override
	public final void method17058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!abv", name = "bu", descriptor = "(IIIIIII)V", line = 1741)
	@Override
	public final void method17078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass6_Sub2_5.method16788((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!abv", name = "ho", descriptor = "(IIIIIII)V", line = 1741)
	@Override
	public final void method17226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass6_Sub2_5.method16788((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!abv", name = "hc", descriptor = "(IIIIIII)V", line = 1741)
	@Override
	public final void method17224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass6_Sub2_5.method16788((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!abv", name = "hd", descriptor = "(IIIIIII)V", line = 1741)
	@Override
	public final void method17225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = (int) ((float) arg0 + 1.0F);
		@Pc(11) int local11 = (int) ((float) arg1 + 1.0F);
		@Pc(17) int local17 = (int) ((float) arg2 + 1.0F);
		@Pc(23) int local23 = (int) ((float) arg3 + 1.0F);
		@Pc(28) float local28 = (float) (local17 - local5);
		@Pc(33) float local33 = (float) (local23 - local11);
		@Pc(46) float local46 = 1.0F / (float) Math.sqrt((double) (local28 * local28 + local33 * local33));
		@Pc(50) float local50 = local28 * local46;
		@Pc(54) float local54 = local33 * local46;
		@Pc(60) int local60 = (int) ((float) local5 - local50);
		@Pc(66) int local66 = (int) ((float) local11 - local54);
		@Pc(69) float local69 = -local54;
		@Pc(78) float local78 = local69 * 0.5F * (float) arg5;
		@Pc(85) float local85 = local50 * 0.5F * (float) arg5;
		this.aClass6_Sub2_5.method16788((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!abv", name = "cz", descriptor = "(Lclient!dk;)V", line = 1760)
	@Override
	public final void method17105(@OriginalArg(0) Class128 arg0) {
		this.aClass253_3.method25216(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "io", descriptor = "(Lclient!dk;)V", line = 1760)
	@Override
	public final void method17266(@OriginalArg(0) Class128 arg0) {
		this.aClass253_3.method25216(this, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "tx", descriptor = "()V", line = 1764)
	final void method17551() {
		this.method17544(0, this.anInterface21_16);
		this.method17738(this.aClass37_19);
		this.method17554(Class263.aClass263_2, 0, 1);
	}

	@OriginalMember(owner = "client!abv", name = "adv", descriptor = "()V", line = 1764)
	final void method17800() {
		this.method17544(0, this.anInterface21_16);
		this.method17738(this.aClass37_19);
		this.method17554(Class263.aClass263_2, 0, 1);
	}

	@OriginalMember(owner = "client!abv", name = "adj", descriptor = "()V", line = 1764)
	final void method17801() {
		this.method17544(0, this.anInterface21_16);
		this.method17738(this.aClass37_19);
		this.method17554(Class263.aClass263_2, 0, 1);
	}

	@OriginalMember(owner = "client!abv", name = "tp", descriptor = "()V", line = 1770)
	public final void method17552() {
		this.method17553(Class263.aClass263_3, 2);
	}

	@OriginalMember(owner = "client!abv", name = "adw", descriptor = "()V", line = 1770)
	public final void method17569() {
		this.method17553(Class263.aClass263_3, 2);
	}

	@OriginalMember(owner = "client!abv", name = "ady", descriptor = "()V", line = 1770)
	public final void method17802() {
		this.method17553(Class263.aClass263_3, 2);
	}

	@OriginalMember(owner = "client!abv", name = "tr", descriptor = "(Lclient!jr;I)V", line = 1774)
	final void method17553(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		this.method17544(0, this.anInterface21_17);
		this.method17738(this.aClass37_18);
		this.method17554(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!abv", name = "adc", descriptor = "(Lclient!jr;I)V", line = 1774)
	final void method17803(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		this.method17544(0, this.anInterface21_17);
		this.method17738(this.aClass37_18);
		this.method17554(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!abv", name = "td", descriptor = "()V", line = 1784)
	public final void method17556() {
		if (this.anInt2524 == 2) {
			return;
		}
		this.method17549();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17469(1);
		this.method17531((byte) 0);
		this.anInt2524 = 2;
	}

	@OriginalMember(owner = "client!abv", name = "adx", descriptor = "()V", line = 1784)
	public final void method17807() {
		if (this.anInt2524 == 2) {
			return;
		}
		this.method17549();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17469(1);
		this.method17531((byte) 0);
		this.anInt2524 = 2;
	}

	@OriginalMember(owner = "client!abv", name = "adb", descriptor = "()V", line = 1784)
	public final void method17808() {
		if (this.anInt2524 == 2) {
			return;
		}
		this.method17549();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17469(1);
		this.method17531((byte) 0);
		this.anInt2524 = 2;
	}

	@OriginalMember(owner = "client!abv", name = "tg", descriptor = "()V", line = 1797)
	final void method17557() {
		if (this.anInt2524 == 8) {
			return;
		}
		this.method17485();
		this.method17620(true);
		this.method17488(true);
		this.method17685(true);
		this.method17469(1);
		this.method17531((byte) 0);
		this.anInt2524 = 8;
	}

	@OriginalMember(owner = "client!abv", name = "adp", descriptor = "(CCCC)I", line = 1811)
	static int method17474(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!abv", name = "tq", descriptor = "(CCCC)I", line = 1811)
	static int method17559(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!abv", name = "adh", descriptor = "(CCCC)I", line = 1811)
	static int method17810(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!abv", name = "adu", descriptor = "(CCCC)I", line = 1811)
	static int method17812(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!abv", name = "pj", descriptor = "()Z")
	public abstract boolean method17432();

	@OriginalMember(owner = "client!abv", name = "ph", descriptor = "()Z")
	public abstract boolean method17433();

	@OriginalMember(owner = "client!abv", name = "pl", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17435(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "pg", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V")
	public abstract void method17438(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2);

	@OriginalMember(owner = "client!abv", name = "tm", descriptor = "()V")
	abstract void method17441();

	@OriginalMember(owner = "client!abv", name = "vl", descriptor = "()F")
	public abstract float method17444();

	@OriginalMember(owner = "client!abv", name = "abw", descriptor = "()V")
	abstract void method17450();

	@OriginalMember(owner = "client!abv", name = "zc", descriptor = "(Lclient!cw;Lclient!dj;)Z")
	abstract boolean method17452(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1);

	@OriginalMember(owner = "client!abv", name = "yd", descriptor = "()V")
	abstract void method17456();

	@OriginalMember(owner = "client!abv", name = "ts", descriptor = "()V")
	abstract void method17462();

	@OriginalMember(owner = "client!abv", name = "act", descriptor = "(Z)Lclient!jw;")
	abstract Interface30 method17465(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "qw", descriptor = "()V")
	abstract void method17468();

	@OriginalMember(owner = "client!abv", name = "qe", descriptor = "()V")
	abstract void method17472();

	@OriginalMember(owner = "client!abv", name = "qu", descriptor = "(Lclient!mq;)V")
	public abstract void method17483(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!abv", name = "wk", descriptor = "()V")
	abstract void method17484();

	@OriginalMember(owner = "client!abv", name = "acq", descriptor = "()V")
	abstract void method17487();

	@OriginalMember(owner = "client!abv", name = "rr", descriptor = "()V")
	abstract void method17490();

	@OriginalMember(owner = "client!abv", name = "rw", descriptor = "()V")
	abstract void method17493();

	@OriginalMember(owner = "client!abv", name = "rc", descriptor = "()V")
	abstract void method17494();

	@OriginalMember(owner = "client!abv", name = "ro", descriptor = "()V")
	abstract void method17495();

	@OriginalMember(owner = "client!abv", name = "rq", descriptor = "()V")
	abstract void method17496();

	@OriginalMember(owner = "client!abv", name = "ra", descriptor = "()V")
	abstract void method17497();

	@OriginalMember(owner = "client!abv", name = "abt", descriptor = "()V")
	abstract void method17498();

	@OriginalMember(owner = "client!abv", name = "rb", descriptor = "()V")
	abstract void method17499();

	@OriginalMember(owner = "client!abv", name = "rh", descriptor = "(Lclient!cw;Lclient!dj;)Z")
	abstract boolean method17500(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1);

	@OriginalMember(owner = "client!abv", name = "abk", descriptor = "()V")
	abstract void method17503();

	@OriginalMember(owner = "client!abv", name = "rn", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;")
	abstract Interface20 method17504(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "rl", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;")
	abstract Interface20 method17505(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "rm", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;")
	abstract Interface20 method17506(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "ru", descriptor = "(IIZ[III)Lclient!ic;")
	abstract Interface20 method17507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!abv", name = "rx", descriptor = "(IZ[[I)Lclient!jk;")
	abstract Interface27 method17508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!abv", name = "re", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;")
	abstract Interface23 method17509(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!abv", name = "rv", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;")
	abstract Interface29 method17510(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "sk", descriptor = "()V")
	public abstract void method17514();

	@OriginalMember(owner = "client!abv", name = "yw", descriptor = "()V")
	abstract void method17515();

	@OriginalMember(owner = "client!abv", name = "add", descriptor = "(Lclient!iy;)V")
	public abstract void method17516(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!abv", name = "sd", descriptor = "(ILclient!jg;ZZ)V")
	abstract void method17517(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!abv", name = "sr", descriptor = "(ILclient!jg;Z)V")
	abstract void method17518(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "sl", descriptor = "()V")
	abstract void method17523();

	@OriginalMember(owner = "client!abv", name = "so", descriptor = "()V")
	abstract void method17525();

	@OriginalMember(owner = "client!abv", name = "sh", descriptor = "()V")
	abstract void method17526();

	@OriginalMember(owner = "client!abv", name = "zf", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;")
	abstract Interface23 method17527(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!abv", name = "ya", descriptor = "()V")
	abstract void method17528();

	@OriginalMember(owner = "client!abv", name = "aca", descriptor = "(I)V")
	abstract void method17529(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abv", name = "sv", descriptor = "(I)V")
	abstract void method17532(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abv", name = "tn", descriptor = "()V")
	abstract void method17534();

	@OriginalMember(owner = "client!abv", name = "tc", descriptor = "()V")
	abstract void method17535();

	@OriginalMember(owner = "client!abv", name = "rg", descriptor = "()V")
	abstract void method17536();

	@OriginalMember(owner = "client!abv", name = "tu", descriptor = "()V")
	abstract void method17538();

	@OriginalMember(owner = "client!abv", name = "tk", descriptor = "(Z)Lclient!if;")
	abstract Interface21 method17542(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "tl", descriptor = "(ILclient!if;)V")
	public abstract void method17544(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1);

	@OriginalMember(owner = "client!abv", name = "tb", descriptor = "(Lclient!jw;)V")
	abstract void method17545(@OriginalArg(0) Interface30 arg0);

	@OriginalMember(owner = "client!abv", name = "abi", descriptor = "()V")
	abstract void method17550();

	@OriginalMember(owner = "client!abv", name = "tv", descriptor = "(Lclient!jr;II)V")
	public abstract void method17554(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!abv", name = "tf", descriptor = "(Lclient!jr;IIII)V")
	public abstract void method17555(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!abv", name = "th", descriptor = "(I)V")
	abstract void method17558(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abv", name = "aaw", descriptor = "()V")
	public abstract void method17561();

	@OriginalMember(owner = "client!abv", name = "abx", descriptor = "()V")
	abstract void method17563();

	@OriginalMember(owner = "client!abv", name = "fz", descriptor = "()Ljava/lang/String;")
	public abstract String method17179();

	@OriginalMember(owner = "client!abv", name = "fv", descriptor = "()Ljava/lang/String;")
	public abstract String method17180();

	@OriginalMember(owner = "client!abv", name = "yk", descriptor = "()V")
	abstract void method17566();

	@OriginalMember(owner = "client!abv", name = "qh", descriptor = "()V")
	abstract void method17570();

	@OriginalMember(owner = "client!abv", name = "wp", descriptor = "()V")
	abstract void method17571();

	@OriginalMember(owner = "client!abv", name = "zq", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;")
	abstract Interface20 method17574(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "yn", descriptor = "()V")
	abstract void method17575();

	@OriginalMember(owner = "client!abv", name = "wl", descriptor = "()V")
	abstract void method17576();

	@OriginalMember(owner = "client!abv", name = "pt", descriptor = "()F")
	public abstract float method17577();

	@OriginalMember(owner = "client!abv", name = "fy", descriptor = "()Ljava/lang/String;")
	public abstract String method17181();

	@OriginalMember(owner = "client!abv", name = "sq", descriptor = "()V")
	abstract void method17582();

	@OriginalMember(owner = "client!abv", name = "yr", descriptor = "()V")
	abstract void method17584();

	@OriginalMember(owner = "client!abv", name = "adf", descriptor = "(Lclient!jr;II)V")
	public abstract void method17586(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!abv", name = "vz", descriptor = "()F")
	public abstract float method17588();

	@OriginalMember(owner = "client!abv", name = "vj", descriptor = "()F")
	public abstract float method17589();

	@OriginalMember(owner = "client!abv", name = "o", descriptor = "()Ljava/lang/String;")
	public abstract String method17035();

	@OriginalMember(owner = "client!abv", name = "to", descriptor = "([Lclient!jb;)Lclient!iy;")
	abstract Class37 method17590(@OriginalArg(0) Class252[] arg0);

	@OriginalMember(owner = "client!abv", name = "acn", descriptor = "()V")
	abstract void method17596();

	@OriginalMember(owner = "client!abv", name = "yb", descriptor = "()V")
	abstract void method17598();

	@OriginalMember(owner = "client!abv", name = "uq", descriptor = "()Z")
	public abstract boolean method17600();

	@OriginalMember(owner = "client!abv", name = "ui", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17602(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "ur", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17603(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "uu", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17604(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "ua", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17605(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "um", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V")
	public abstract void method17608(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2);

	@OriginalMember(owner = "client!abv", name = "zu", descriptor = "(IIZ[III)Lclient!ic;")
	abstract Interface20 method17616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!abv", name = "adl", descriptor = "(I)V")
	abstract void method17619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abv", name = "ade", descriptor = "(Lclient!iy;)V")
	public abstract void method17621(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!abv", name = "adi", descriptor = "()Z")
	public abstract boolean method17633();

	@OriginalMember(owner = "client!abv", name = "acb", descriptor = "(Z)Lclient!if;")
	abstract Interface21 method17642(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "tw", descriptor = "(Z)Lclient!jw;")
	abstract Interface30 method17648(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "wo", descriptor = "()V")
	abstract void method17649();

	@OriginalMember(owner = "client!abv", name = "wu", descriptor = "()V")
	abstract void method17650();

	@OriginalMember(owner = "client!abv", name = "wh", descriptor = "()V")
	abstract void method17651();

	@OriginalMember(owner = "client!abv", name = "acl", descriptor = "()V")
	abstract void method17652();

	@OriginalMember(owner = "client!abv", name = "wf", descriptor = "()V")
	abstract void method17653();

	@OriginalMember(owner = "client!abv", name = "adq", descriptor = "()Z")
	public abstract boolean method17664();

	@OriginalMember(owner = "client!abv", name = "zn", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;")
	abstract Interface20 method17667(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "xl", descriptor = "(Lclient!mq;)V")
	public abstract void method17668(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!abv", name = "xi", descriptor = "(Lclient!mq;)V")
	public abstract void method17669(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!abv", name = "wq", descriptor = "()V")
	abstract void method17670();

	@OriginalMember(owner = "client!abv", name = "sm", descriptor = "()V")
	abstract void method17678();

	@OriginalMember(owner = "client!abv", name = "wt", descriptor = "()V")
	abstract void method17686();

	@OriginalMember(owner = "client!abv", name = "yq", descriptor = "()V")
	abstract void method17687();

	@OriginalMember(owner = "client!abv", name = "yy", descriptor = "()V")
	abstract void method17688();

	@OriginalMember(owner = "client!abv", name = "yz", descriptor = "()V")
	abstract void method17691();

	@OriginalMember(owner = "client!abv", name = "yp", descriptor = "()V")
	abstract void method17693();

	@OriginalMember(owner = "client!abv", name = "yo", descriptor = "()V")
	abstract void method17694();

	@OriginalMember(owner = "client!abv", name = "yc", descriptor = "()V")
	abstract void method17695();

	@OriginalMember(owner = "client!abv", name = "yu", descriptor = "()V")
	abstract void method17697();

	@OriginalMember(owner = "client!abv", name = "yt", descriptor = "()V")
	abstract void method17698();

	@OriginalMember(owner = "client!abv", name = "yv", descriptor = "()V")
	abstract void method17700();

	@OriginalMember(owner = "client!abv", name = "yg", descriptor = "()V")
	abstract void method17701();

	@OriginalMember(owner = "client!abv", name = "yi", descriptor = "()V")
	abstract void method17704();

	@OriginalMember(owner = "client!abv", name = "zi", descriptor = "(Lclient!cw;Lclient!dj;)Z")
	abstract boolean method17706(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1);

	@OriginalMember(owner = "client!abv", name = "zp", descriptor = "(IIZ[III)Lclient!ic;")
	abstract Interface20 method17709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!abv", name = "adt", descriptor = "(Lclient!jw;)V")
	abstract void method17711(@OriginalArg(0) Interface30 arg0);

	@OriginalMember(owner = "client!abv", name = "zj", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;")
	abstract Interface20 method17713(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "zm", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;")
	abstract Interface20 method17714(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "zw", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;")
	abstract Interface20 method17715(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "zv", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;")
	abstract Interface20 method17716(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "ze", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;")
	abstract Interface20 method17717(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!abv", name = "zh", descriptor = "(IZ[[I)Lclient!jk;")
	abstract Interface27 method17720(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!abv", name = "zb", descriptor = "(IZ[[I)Lclient!jk;")
	abstract Interface27 method17721(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!abv", name = "zl", descriptor = "(IZ[[I)Lclient!jk;")
	abstract Interface27 method17722(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!abv", name = "zx", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;")
	abstract Interface23 method17723(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!abv", name = "zy", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;")
	abstract Interface29 method17724(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "ads", descriptor = "(Lclient!jw;)V")
	abstract void method17727(@OriginalArg(0) Interface30 arg0);

	@OriginalMember(owner = "client!abv", name = "aat", descriptor = "()V")
	public abstract void method17731();

	@OriginalMember(owner = "client!abv", name = "aaz", descriptor = "()V")
	public abstract void method17732();

	@OriginalMember(owner = "client!abv", name = "tz", descriptor = "(Lclient!iy;)V")
	public abstract void method17738(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!abv", name = "aam", descriptor = "(ILclient!jg;ZZ)V")
	abstract void method17743(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!abv", name = "aas", descriptor = "(ILclient!jg;Z)V")
	abstract void method17746(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "aan", descriptor = "(ILclient!jg;Z)V")
	abstract void method17747(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "aak", descriptor = "(ILclient!jg;Z)V")
	abstract void method17748(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "aah", descriptor = "(ILclient!jg;Z)V")
	abstract void method17749(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "aac", descriptor = "(ILclient!jg;Z)V")
	abstract void method17750(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!abv", name = "adz", descriptor = "()V")
	abstract void method17753();

	@OriginalMember(owner = "client!abv", name = "abq", descriptor = "()V")
	abstract void method17756();

	@OriginalMember(owner = "client!abv", name = "za", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;")
	abstract Interface29 method17757(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!abv", name = "ut", descriptor = "(Ljava/lang/String;)Lclient!fc;")
	public abstract Class24 method17758(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!abv", name = "abz", descriptor = "()V")
	abstract void method17759();

	@OriginalMember(owner = "client!abv", name = "abl", descriptor = "()V")
	abstract void method17760();

	@OriginalMember(owner = "client!abv", name = "abv", descriptor = "()V")
	abstract void method17761();

	@OriginalMember(owner = "client!abv", name = "aay", descriptor = "(ILclient!jg;ZZ)V")
	abstract void method17767(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!abv", name = "rt", descriptor = "(Lclient!cw;Lclient!dj;)Z")
	abstract boolean method17768(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1);

	@OriginalMember(owner = "client!abv", name = "ty", descriptor = "(Z)V")
	abstract void method17770(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "acr", descriptor = "(I)V")
	abstract void method17776(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!abv", name = "acs", descriptor = "()V")
	abstract void method17777();

	@OriginalMember(owner = "client!abv", name = "acy", descriptor = "()V")
	abstract void method17778();

	@OriginalMember(owner = "client!abv", name = "ack", descriptor = "()V")
	abstract void method17781();

	@OriginalMember(owner = "client!abv", name = "aci", descriptor = "()V")
	abstract void method17789();

	@OriginalMember(owner = "client!abv", name = "acj", descriptor = "()V")
	abstract void method17790();

	@OriginalMember(owner = "client!abv", name = "acd", descriptor = "(Z)V")
	abstract void method17791(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "acp", descriptor = "(Z)V")
	abstract void method17792(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!abv", name = "ry", descriptor = "()V")
	abstract void method17793();

	@OriginalMember(owner = "client!abv", name = "acv", descriptor = "([Lclient!jb;)Lclient!iy;")
	abstract Class37 method17795(@OriginalArg(0) Class252[] arg0);

	@OriginalMember(owner = "client!abv", name = "vb", descriptor = "()F")
	public abstract float method17796();

	@OriginalMember(owner = "client!abv", name = "adk", descriptor = "(Lclient!iy;)V")
	public abstract void method17797(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!abv", name = "yf", descriptor = "()V")
	abstract void method17798();

	@OriginalMember(owner = "client!abv", name = "ado", descriptor = "(ILclient!if;)V")
	public abstract void method17799(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1);

	@OriginalMember(owner = "client!abv", name = "adr", descriptor = "(Lclient!jw;Lclient!jr;IIII)V")
	abstract void method17805(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!abv", name = "adg", descriptor = "(Lclient!jr;IIII)V")
	public abstract void method17806(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!abv", name = "adm", descriptor = "()V")
	abstract void method17813();

	@OriginalMember(owner = "client!abv", name = "adn", descriptor = "(Lclient!jw;)V")
	abstract void method17815(@OriginalArg(0) Interface30 arg0);

	@OriginalMember(owner = "client!abv", name = "tj", descriptor = "(Lclient!jw;Lclient!jr;IIII)V")
	abstract void method17817(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
