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

@OriginalClass("client!afc")
public abstract class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!afc", name = "fn", descriptor = "I")
	static final int anInt2906 = 4;

	@OriginalMember(owner = "client!afc", name = "am", descriptor = "I")
	static final int anInt2907 = 128;

	@OriginalMember(owner = "client!afc", name = "au", descriptor = "I")
	static final int anInt2908 = 1;

	@OriginalMember(owner = "client!afc", name = "ar", descriptor = "I")
	static final int anInt2909 = 2;

	@OriginalMember(owner = "client!afc", name = "aq", descriptor = "I")
	static final int anInt2910 = 8;

	@OriginalMember(owner = "client!afc", name = "ax", descriptor = "I")
	static final int anInt2911 = 16;

	@OriginalMember(owner = "client!afc", name = "av", descriptor = "I")
	static final int anInt2912 = 55;

	@OriginalMember(owner = "client!afc", name = "aj", descriptor = "I")
	protected static final int anInt2913 = 100663296;

	@OriginalMember(owner = "client!afc", name = "an", descriptor = "I")
	static final int anInt2914 = 4194304;

	@OriginalMember(owner = "client!afc", name = "ap", descriptor = "I")
	static final int anInt2918 = 4;

	@OriginalMember(owner = "client!afc", name = "fm", descriptor = "I")
	static final int anInt2942 = 1;

	@OriginalMember(owner = "client!afc", name = "fj", descriptor = "I")
	static final int anInt2943 = 2;

	@OriginalMember(owner = "client!afc", name = "fd", descriptor = "I")
	static final int anInt2944 = 3;

	@OriginalMember(owner = "client!afc", name = "ao", descriptor = "I")
	static final int anInt2955 = 7;

	@OriginalMember(owner = "client!afc", name = "at", descriptor = "Ljava/lang/Object;")
	static final Object anObject7 = new Object();

	@OriginalMember(owner = "client!afc", name = "bw", descriptor = "Lclient!pq;")
	static final Class489 aClass489_77 = new Class489();

	@OriginalMember(owner = "client!afc", name = "dj", descriptor = "[Lclient!akf;")
	protected Class93_Sub16[] aClass93_Sub16Array19;

	@OriginalMember(owner = "client!afc", name = "ak", descriptor = "J")
	public long aLong132;

	@OriginalMember(owner = "client!afc", name = "bl", descriptor = "Lclient!lp;")
	Class402 aClass402_4;

	@OriginalMember(owner = "client!afc", name = "bx", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!afc", name = "bd", descriptor = "I")
	public int anInt2917;

	@OriginalMember(owner = "client!afc", name = "gd", descriptor = "Lclient!lo;")
	Class145 aClass145_17;

	@OriginalMember(owner = "client!afc", name = "eg", descriptor = "Lclient!aef;")
	Class100_Sub1 aClass100_Sub1_5;

	@OriginalMember(owner = "client!afc", name = "ea", descriptor = "Lclient!lc;")
	Class128 aClass128_3;

	@OriginalMember(owner = "client!afc", name = "af", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!afc", name = "gh", descriptor = "Z")
	protected boolean aBoolean460;

	@OriginalMember(owner = "client!afc", name = "ha", descriptor = "Lclient!ml;")
	Interface40 anInterface40_4;

	@OriginalMember(owner = "client!afc", name = "cx", descriptor = "F")
	float aFloat200;

	@OriginalMember(owner = "client!afc", name = "cw", descriptor = "F")
	float aFloat201;

	@OriginalMember(owner = "client!afc", name = "ct", descriptor = "F")
	float aFloat202;

	@OriginalMember(owner = "client!afc", name = "cf", descriptor = "F")
	float aFloat203;

	@OriginalMember(owner = "client!afc", name = "el", descriptor = "[Lclient!mq;")
	Interface43[] anInterface43Array3;

	@OriginalMember(owner = "client!afc", name = "gc", descriptor = "I")
	protected int anInt2920;

	@OriginalMember(owner = "client!afc", name = "ab", descriptor = "Z")
	protected boolean aBoolean462;

	@OriginalMember(owner = "client!afc", name = "hg", descriptor = "Lclient!mi;")
	Class419 aClass419_3;

	@OriginalMember(owner = "client!afc", name = "eb", descriptor = "Lclient!jz;")
	Class130 aClass130_3;

	@OriginalMember(owner = "client!afc", name = "gt", descriptor = "Z")
	protected boolean aBoolean469;

	@OriginalMember(owner = "client!afc", name = "bc", descriptor = "I")
	protected int anInt2931;

	@OriginalMember(owner = "client!afc", name = "fo", descriptor = "F")
	protected float aFloat209;

	@OriginalMember(owner = "client!afc", name = "gs", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!afc", name = "eo", descriptor = "I")
	protected int anInt2933;

	@OriginalMember(owner = "client!afc", name = "ey", descriptor = "I")
	protected int anInt2934;

	@OriginalMember(owner = "client!afc", name = "ee", descriptor = "I")
	int anInt2937;

	@OriginalMember(owner = "client!afc", name = "es", descriptor = "I")
	int anInt2938;

	@OriginalMember(owner = "client!afc", name = "fx", descriptor = "Z")
	boolean aBoolean472;

	@OriginalMember(owner = "client!afc", name = "gx", descriptor = "Z")
	protected boolean aBoolean473;

	@OriginalMember(owner = "client!afc", name = "ep", descriptor = "[Lclient!mv;")
	protected Class425[] aClass425Array3;

	@OriginalMember(owner = "client!afc", name = "ev", descriptor = "[Lclient!mk;")
	protected Class421[] aClass421Array5;

	@OriginalMember(owner = "client!afc", name = "ec", descriptor = "[Lclient!mk;")
	protected Class421[] aClass421Array6;

	@OriginalMember(owner = "client!afc", name = "eh", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_23;

	@OriginalMember(owner = "client!afc", name = "eq", descriptor = "Lclient!lz;")
	Interface38 anInterface38_24;

	@OriginalMember(owner = "client!afc", name = "ez", descriptor = "Lclient!aef;")
	Class100_Sub1 aClass100_Sub1_6;

	@OriginalMember(owner = "client!afc", name = "et", descriptor = "Lclient!md;")
	Class414 aClass414_3;

	@OriginalMember(owner = "client!afc", name = "er", descriptor = "Lclient!jj;")
	Class131 aClass131_3;

	@OriginalMember(owner = "client!afc", name = "en", descriptor = "Lclient!jc;")
	Class134 aClass134_3;

	@OriginalMember(owner = "client!afc", name = "gw", descriptor = "Lclient!lo;")
	Class145 aClass145_18;

	@OriginalMember(owner = "client!afc", name = "ex", descriptor = "Lclient!jo;")
	Class126 aClass126_3;

	@OriginalMember(owner = "client!afc", name = "fg", descriptor = "Lclient!aqe;")
	Class128_Sub1_Sub1 aClass128_Sub1_Sub1_5;

	@OriginalMember(owner = "client!afc", name = "fu", descriptor = "Lclient!aqe;")
	Class128_Sub1_Sub1 aClass128_Sub1_Sub1_6;

	@OriginalMember(owner = "client!afc", name = "bk", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!afc", name = "fz", descriptor = "Lclient!ls;")
	Class404 aClass404_3;

	@OriginalMember(owner = "client!afc", name = "gf", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!afc", name = "ek", descriptor = "I")
	protected int anInt2945;

	@OriginalMember(owner = "client!afc", name = "ft", descriptor = "Lclient!afe;")
	Class107_Sub1 aClass107_Sub1_3;

	@OriginalMember(owner = "client!afc", name = "ej", descriptor = "[Lclient!pq;")
	protected Class489[] aClass489Array5;

	@OriginalMember(owner = "client!afc", name = "fc", descriptor = "I")
	int anInt2946;

	@OriginalMember(owner = "client!afc", name = "fw", descriptor = "Lclient!dy;")
	Class237 aClass237_6;

	@OriginalMember(owner = "client!afc", name = "fa", descriptor = "Z")
	protected boolean aBoolean477;

	@OriginalMember(owner = "client!afc", name = "fb", descriptor = "F")
	protected float aFloat216;

	@OriginalMember(owner = "client!afc", name = "gg", descriptor = "Z")
	protected boolean aBoolean479;

	@OriginalMember(owner = "client!afc", name = "fs", descriptor = "Lclient!aqw;")
	Class128_Sub1_Sub2 aClass128_Sub1_Sub2_3;

	@OriginalMember(owner = "client!afc", name = "go", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!afc", name = "hd", descriptor = "Z")
	protected boolean aBoolean481;

	@OriginalMember(owner = "client!afc", name = "gz", descriptor = "Lclient!lo;")
	Class145 aClass145_19;

	@OriginalMember(owner = "client!afc", name = "gn", descriptor = "I")
	public int anInt2954;

	@OriginalMember(owner = "client!afc", name = "gr", descriptor = "Z")
	protected boolean aBoolean483;

	@OriginalMember(owner = "client!afc", name = "gj", descriptor = "Lclient!lr;")
	Interface37 anInterface37_15;

	@OriginalMember(owner = "client!afc", name = "gm", descriptor = "Lclient!lr;")
	Interface37 anInterface37_16;

	@OriginalMember(owner = "client!afc", name = "gv", descriptor = "Lclient!lr;")
	Interface37 anInterface37_17;

	@OriginalMember(owner = "client!afc", name = "gy", descriptor = "Lclient!ld;")
	Class395 aClass395_3;

	@OriginalMember(owner = "client!afc", name = "ge", descriptor = "Z")
	protected boolean aBoolean485;

	@OriginalMember(owner = "client!afc", name = "gb", descriptor = "Lclient!lo;")
	Class145 aClass145_20;

	@OriginalMember(owner = "client!afc", name = "gi", descriptor = "Lclient!lo;")
	Class145 aClass145_21;

	@OriginalMember(owner = "client!afc", name = "hm", descriptor = "Lclient!lo;")
	Class145 aClass145_22;

	@OriginalMember(owner = "client!afc", name = "gk", descriptor = "I")
	int anInt2959;

	@OriginalMember(owner = "client!afc", name = "ad", descriptor = "Lclient!adc;")
	Class78 aClass78_3 = new Class78();

	@OriginalMember(owner = "client!afc", name = "bf", descriptor = "I")
	int anInt2915 = 0;

	@OriginalMember(owner = "client!afc", name = "bh", descriptor = "Lclient!aat;")
	Class22 aClass22_34 = new Class22();

	@OriginalMember(owner = "client!afc", name = "bi", descriptor = "Lclient!ou;")
	Class470 aClass470_37 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bn", descriptor = "Lclient!pq;")
	Class489 aClass489_74 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bt", descriptor = "Lclient!ou;")
	Class470 aClass470_38 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bq", descriptor = "Lclient!ou;")
	Class470 aClass470_34 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bm", descriptor = "Lclient!pq;")
	public Class489 aClass489_75 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bb", descriptor = "Lclient!pq;")
	Class489 aClass489_72 = new Class489();

	@OriginalMember(owner = "client!afc", name = "be", descriptor = "Lclient!pq;")
	Class489 aClass489_87 = new Class489();

	@OriginalMember(owner = "client!afc", name = "by", descriptor = "Lclient!ou;")
	Class470 aClass470_35 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bu", descriptor = "Lclient!pq;")
	Class489 aClass489_76 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bo", descriptor = "Lclient!ou;")
	Class470 aClass470_36 = new Class470();

	@OriginalMember(owner = "client!afc", name = "bz", descriptor = "Lclient!pq;")
	protected Class489 aClass489_78 = new Class489();

	@OriginalMember(owner = "client!afc", name = "bv", descriptor = "Lclient!pq;")
	Class489 aClass489_73 = new Class489();

	@OriginalMember(owner = "client!afc", name = "br", descriptor = "Lclient!ox;")
	Class472 aClass472_59 = new Class472();

	@OriginalMember(owner = "client!afc", name = "bg", descriptor = "[F")
	float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!afc", name = "ba", descriptor = "Z")
	boolean aBoolean459 = false;

	@OriginalMember(owner = "client!afc", name = "bp", descriptor = "Lclient!lw;")
	Class408 aClass408_3 = Class408.aClass408_4;

	@OriginalMember(owner = "client!afc", name = "bj", descriptor = "Z")
	boolean aBoolean470 = false;

	@OriginalMember(owner = "client!afc", name = "bs", descriptor = "Lclient!pq;")
	Class489 aClass489_80 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cl", descriptor = "Lclient!pq;")
	Class489 aClass489_79 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cg", descriptor = "Z")
	boolean aBoolean484 = false;

	@OriginalMember(owner = "client!afc", name = "ce", descriptor = "Lclient!pq;")
	Class489 aClass489_81 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cu", descriptor = "Lclient!pq;")
	Class489 aClass489_86 = new Class489();

	@OriginalMember(owner = "client!afc", name = "ci", descriptor = "Lclient!pq;")
	Class489 aClass489_82 = this.aClass489_86;

	@OriginalMember(owner = "client!afc", name = "cn", descriptor = "Lclient!pq;")
	public Class489 aClass489_83 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cv", descriptor = "Lclient!pq;")
	Class489 aClass489_85 = new Class489();

	@OriginalMember(owner = "client!afc", name = "cp", descriptor = "Lclient!pq;")
	public Class489 aClass489_84 = new Class489();

	@OriginalMember(owner = "client!afc", name = "ca", descriptor = "[[F")
	float[][] aFloatArrayArray22 = new float[6][4];

	@OriginalMember(owner = "client!afc", name = "co", descriptor = "F")
	protected float aFloat204 = 0.0F;

	@OriginalMember(owner = "client!afc", name = "cr", descriptor = "F")
	protected float aFloat205 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "cm", descriptor = "F")
	float aFloat206 = 0.0F;

	@OriginalMember(owner = "client!afc", name = "cq", descriptor = "F")
	float aFloat207 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "ch", descriptor = "F")
	protected float aFloat215 = 50.0F;

	@OriginalMember(owner = "client!afc", name = "cb", descriptor = "F")
	protected float aFloat208 = 3584.0F;

	@OriginalMember(owner = "client!afc", name = "cs", descriptor = "I")
	protected int anInt2940 = 0;

	@OriginalMember(owner = "client!afc", name = "cy", descriptor = "I")
	protected int anInt2930 = 0;

	@OriginalMember(owner = "client!afc", name = "cc", descriptor = "I")
	protected int anInt2921 = 0;

	@OriginalMember(owner = "client!afc", name = "cz", descriptor = "I")
	protected int anInt2958 = 0;

	@OriginalMember(owner = "client!afc", name = "ck", descriptor = "I")
	int anInt2923 = 0;

	@OriginalMember(owner = "client!afc", name = "cj", descriptor = "I")
	int anInt2924 = 0;

	@OriginalMember(owner = "client!afc", name = "cd", descriptor = "I")
	int anInt2941 = 0;

	@OriginalMember(owner = "client!afc", name = "dd", descriptor = "I")
	int anInt2919 = 0;

	@OriginalMember(owner = "client!afc", name = "dr", descriptor = "I")
	protected int anInt2925 = 0;

	@OriginalMember(owner = "client!afc", name = "da", descriptor = "I")
	protected int anInt2926 = 0;

	@OriginalMember(owner = "client!afc", name = "dt", descriptor = "I")
	protected int anInt2927 = 0;

	@OriginalMember(owner = "client!afc", name = "do", descriptor = "I")
	protected int anInt2928 = 0;

	@OriginalMember(owner = "client!afc", name = "dz", descriptor = "I")
	protected int anInt2929 = 0;

	@OriginalMember(owner = "client!afc", name = "dv", descriptor = "I")
	protected int anInt2939 = 0;

	@OriginalMember(owner = "client!afc", name = "dm", descriptor = "Z")
	protected boolean aBoolean463 = true;

	@OriginalMember(owner = "client!afc", name = "dq", descriptor = "Z")
	protected boolean aBoolean464 = false;

	@OriginalMember(owner = "client!afc", name = "dc", descriptor = "Z")
	protected boolean aBoolean465 = true;

	@OriginalMember(owner = "client!afc", name = "di", descriptor = "Z")
	protected boolean aBoolean458 = false;

	@OriginalMember(owner = "client!afc", name = "dk", descriptor = "Z")
	protected boolean aBoolean466 = false;

	@OriginalMember(owner = "client!afc", name = "dn", descriptor = "Z")
	protected boolean aBoolean467 = true;

	@OriginalMember(owner = "client!afc", name = "df", descriptor = "Z")
	protected boolean aBoolean468 = false;

	@OriginalMember(owner = "client!afc", name = "dw", descriptor = "[F")
	public float[] aFloatArray63 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "ds", descriptor = "[F")
	protected float[] aFloatArray61 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "du", descriptor = "[F")
	float[] aFloatArray64 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "dl", descriptor = "[F")
	float[] aFloatArray62 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!afc", name = "dp", descriptor = "I")
	int anInt2932 = 16777215;

	@OriginalMember(owner = "client!afc", name = "dy", descriptor = "F")
	public float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "db", descriptor = "F")
	public float aFloat210 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dh", descriptor = "F")
	public float aFloat217 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dx", descriptor = "F")
	protected float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!afc", name = "dg", descriptor = "F")
	public float aFloat212 = -1.0F;

	@OriginalMember(owner = "client!afc", name = "de", descriptor = "F")
	protected float aFloat213 = -1.0F;

	@OriginalMember(owner = "client!afc", name = "eu", descriptor = "I")
	int anInt2935 = 8;

	@OriginalMember(owner = "client!afc", name = "ed", descriptor = "I")
	int anInt2936 = 3;

	@OriginalMember(owner = "client!afc", name = "ei", descriptor = "I")
	protected int anInt2949 = 0;

	@OriginalMember(owner = "client!afc", name = "ef", descriptor = "Z")
	boolean aBoolean474 = false;

	@OriginalMember(owner = "client!afc", name = "ew", descriptor = "[Lclient!lc;")
	final Class128[] aClass128Array3 = new Class128[16];

	@OriginalMember(owner = "client!afc", name = "fi", descriptor = "[Lclient!lh;")
	final Class137[] aClass137Array3 = new Class137[4];

	@OriginalMember(owner = "client!afc", name = "fv", descriptor = "Z")
	boolean aBoolean476 = false;

	@OriginalMember(owner = "client!afc", name = "fp", descriptor = "Z")
	protected boolean aBoolean478 = true;

	@OriginalMember(owner = "client!afc", name = "fq", descriptor = "I")
	protected int anInt2957 = -1;

	@OriginalMember(owner = "client!afc", name = "ff", descriptor = "I")
	protected int anInt2947 = -1;

	@OriginalMember(owner = "client!afc", name = "fl", descriptor = "I")
	protected int anInt2956 = 0;

	@OriginalMember(owner = "client!afc", name = "fy", descriptor = "I")
	int anInt2922 = 1;

	@OriginalMember(owner = "client!afc", name = "fe", descriptor = "I")
	protected int anInt2948 = -1;

	@OriginalMember(owner = "client!afc", name = "fk", descriptor = "Lclient!me;")
	protected Class415 aClass415_3 = Class415.aClass415_7;

	@OriginalMember(owner = "client!afc", name = "fh", descriptor = "Z")
	protected boolean aBoolean480 = true;

	@OriginalMember(owner = "client!afc", name = "fr", descriptor = "Z")
	protected boolean aBoolean461 = true;

	@OriginalMember(owner = "client!afc", name = "gu", descriptor = "B")
	protected byte aByte76 = 0;

	@OriginalMember(owner = "client!afc", name = "gq", descriptor = "I")
	protected int anInt2950 = 2;

	@OriginalMember(owner = "client!afc", name = "gp", descriptor = "Z")
	boolean aBoolean482 = false;

	@OriginalMember(owner = "client!afc", name = "hk", descriptor = "[Lclient!afo;")
	Class109_Sub3[] aClass109_Sub3Array5;

	@OriginalMember(owner = "client!afc", name = "hu", descriptor = "[Lclient!afo;")
	Class109_Sub3[] aClass109_Sub3Array6;

	@OriginalMember(owner = "client!afc", name = "hb", descriptor = "Lclient!pq;")
	Class489 aClass489_88;

	@OriginalMember(owner = "client!afc", name = "hl", descriptor = "Lclient!ou;")
	Class470 aClass470_39;

	@OriginalMember(owner = "client!afc", name = "ay", descriptor = "Lclient!py;")
	final Class497 aClass497_92;

	@OriginalMember(owner = "client!afc", name = "gl", descriptor = "I")
	public final int anInt2951;

	@OriginalMember(owner = "client!afc", name = "ga", descriptor = "I")
	int anInt2953;

	@OriginalMember(owner = "client!afc", name = "em", descriptor = "Lclient!lu;")
	final Class406 aClass406_3;

	@OriginalMember(owner = "client!afc", name = "az", descriptor = "[I")
	int[] anIntArray251;

	@OriginalMember(owner = "client!afc", name = "aa", descriptor = "Lsun/misc/Unsafe;")
	protected Unsafe anUnsafe4;

	@OriginalMember(owner = "client!afc", name = "rv", descriptor = "(Lclient!le;)V", line = 229)
	public void method20913(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7);
	}

	@OriginalMember(owner = "client!afc", name = "wg", descriptor = "(Lclient!le;)V", line = 229)
	public void method21034(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7);
	}

	@OriginalMember(owner = "client!afc", name = "wb", descriptor = "(Lclient!le;)V", line = 229)
	public void method21058(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1303(arg0, anObject7);
	}

	@OriginalMember(owner = "client!afc", name = "wq", descriptor = "(Lclient!le;)V", line = 233)
	public void method21059(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1304(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "rh", descriptor = "(Lclient!le;)V", line = 233)
	public void method21127(@OriginalArg(0) Interface34 arg0) {
		this.aClass78_3.method1304(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "ra", descriptor = "()V", line = 237)
	void method20884() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method30884();
		}
	}

	@OriginalMember(owner = "client!afc", name = "wm", descriptor = "()V", line = 237)
	void method21084() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method30884();
		}
	}

	@OriginalMember(owner = "client!afc", name = "wc", descriptor = "()V", line = 237)
	void method21212() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method30884();
		}
	}

	@OriginalMember(owner = "client!afc", name = "wf", descriptor = "()V", line = 237)
	void method21257() {
		@Pc(4) ArrayList local4 = this.aClass78_3.method1305();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface34 local14 = (Interface34) local7.next();
			local14.method30884();
		}
	}

	@OriginalMember(owner = "client!afc", name = "xw", descriptor = "()Z", line = 251)
	final boolean method21068() {
		return this.aBoolean462;
	}

	@OriginalMember(owner = "client!afc", name = "rz", descriptor = "()Z", line = 251)
	final boolean method21208() {
		return this.aBoolean462;
	}

	@OriginalMember(owner = "client!afc", name = "re", descriptor = "(I)V", line = 255)
	public void method20889(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2915) {
			this.anInt2915 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2915);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong132 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!afc", name = "xu", descriptor = "(I)Ljava/nio/ByteBuffer;", line = 264)
	ByteBuffer method21026(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afc", name = "rt", descriptor = "(I)Ljava/nio/ByteBuffer;", line = 264)
	ByteBuffer method21080(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!afc", name = "rl", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method20891(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xn", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method21052(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xv", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method21069(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xg", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method21070(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "xa", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method21071(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!afc", name = "rr", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method20893(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30071(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "xp", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method20907(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30071(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "xh", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method21073(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass497_92.method30071(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "rd", descriptor = "([B)Lclient!hj;", line = 282)
	Class314 method20899(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class314(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "xx", descriptor = "([B)Lclient!hj;", line = 282)
	Class314 method20935(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class314(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "rb", descriptor = "()V", line = 297)
	public static void method20896() throws Exception_Sub1 {
		Class376.method28046().method31617("jaclib");
	}

	@OriginalMember(owner = "client!afc", name = "xd", descriptor = "()V", line = 297)
	public static void method21022() throws Exception_Sub1 {
		Class376.method28046().method31617("jaclib");
	}

	@OriginalMember(owner = "client!afc", name = "xj", descriptor = "()V", line = 297)
	public static void method21288() throws Exception_Sub1 {
		Class376.method28046().method31617("jaclib");
	}

	@OriginalMember(owner = "client!afc", name = "<init>", descriptor = "(Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;Lclient!py;II)V", line = 301)
	Class104_Sub2(@OriginalArg(0) Class225 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface48 arg2, @OriginalArg(3) Interface46 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Class497 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		new Stream();
		this.aClass109_Sub3Array5 = new Class109_Sub3[8];
		this.aClass109_Sub3Array6 = new Class109_Sub3[8];
		this.aClass489_88 = new Class489();
		this.aClass470_39 = new Class470();
		try {
			this.aClass497_92 = arg5;
			this.anInt2951 = arg6;
			this.anInt2953 = arg7;
			Class660.method32825(false, true);
			if (this.anInterface24_6 == null) {
				this.aClass406_3 = null;
			} else {
				this.aClass406_3 = new Class406(this, this.anInterface24_6);
			}
			if (this.anInt2953 == 0) {
				this.anIntArray251 = Class685.anIntArray524;
			} else {
				this.anIntArray251 = Class685.anIntArray523;
			}
			try {
				@Pc(449) Field local449 = Unsafe.class.getDeclaredField("theUnsafe");
				local449.setAccessible(true);
				this.anUnsafe4 = (Unsafe) local449.get(null);
			} catch (@Pc(460) Exception local460) {
			}
			this.method20889(4194304);
		} catch (@Pc(465) Throwable local465) {
			local465.printStackTrace();
			this.method20877();
			if (local465 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local465;
			}
			throw new RuntimeException("");
		}
		this.method20494(this.method20520(131072));
	}

	@OriginalMember(owner = "client!afc", name = "ru", descriptor = "()V", line = 332)
	public final void method20897() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20961(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20961(1, 1, false, local68, 0, 0);
		this.method20494(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20898();
		this.anInterface40_4 = this.method20995(true);
		this.method21161();
		this.method20466();
		this.method20449();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20774(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "xo", descriptor = "()V", line = 332)
	public final void method21081() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20961(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20961(1, 1, false, local68, 0, 0);
		this.method20494(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20898();
		this.anInterface40_4 = this.method20995(true);
		this.method21161();
		this.method20466();
		this.method20449();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20774(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "xk", descriptor = "()V", line = 332)
	public final void method21082() {
		this.anInterface43Array3 = new Interface43[this.anInt2954];
		this.aClass489Array5 = new Class489[this.anInt2954];
		this.aClass425Array3 = new Class425[this.anInt2954];
		this.aClass421Array5 = new Class421[this.anInt2954];
		this.aClass421Array6 = new Class421[this.anInt2954];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2954; local26++) {
			this.aClass421Array6[local26] = Class421.aClass421_1;
			this.aClass421Array5[local26] = Class421.aClass421_1;
			this.aClass425Array3[local26] = Class425.aClass425_3;
			this.aClass489Array5[local26] = new Class489();
		}
		this.aClass93_Sub16Array19 = new Class93_Sub16[this.anInt2920 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface38_23 = this.method20961(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface38_24 = this.method20961(1, 1, false, local68, 0, 0);
		this.method20494(new Class93_Sub35_Sub1(262144));
		this.aClass145_21 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }) });
		this.aClass145_22 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass145_20 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1), new Class400(Class399.aClass399_2) });
		this.aClass145_19 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9), new Class400(Class399.aClass399_10), new Class400(Class399.aClass399_1) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass109_Sub3Array5[local205] = new Class109_Sub3(this, 0, 0, false, false);
			this.aClass109_Sub3Array6[local205] = new Class109_Sub3(this, 0, 0, true, true);
		}
		this.method20898();
		this.anInterface40_4 = this.method20995(true);
		this.method21161();
		this.method20466();
		this.method20449();
		this.aClass100_Sub1_5 = new Class100_Sub1(this, this.anInterface38_23);
		this.aClass100_Sub1_6 = new Class100_Sub1(this, this.anInterface38_24);
		this.method20774(3, 0);
	}

	@OriginalMember(owner = "client!afc", name = "xf", descriptor = "()V", line = 368)
	final void method20888() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean462 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean462 = true;
		}
		if (!this.aBoolean462) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23736();
				local112 = this.aClass112_6.method23737();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28522(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28522(this.aClass137Array3[1]);
			this.aClass404_3.method28522(this.aClass137Array3[2]);
			this.method20908();
			this.method20914();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21344();
			this.aClass128_3 = null;
		}
		this.method21033();
	}

	@OriginalMember(owner = "client!afc", name = "sv", descriptor = "()V", line = 368)
	final void method20898() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean462 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean462 = true;
		}
		if (!this.aBoolean462) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23736();
				local112 = this.aClass112_6.method23737();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28522(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28522(this.aClass137Array3[1]);
			this.aClass404_3.method28522(this.aClass137Array3[2]);
			this.method20908();
			this.method20914();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21344();
			this.aClass128_3 = null;
		}
		this.method21033();
	}

	@OriginalMember(owner = "client!afc", name = "xq", descriptor = "()V", line = 368)
	final void method20911() {
		this.aClass402_4 = new Class402(this);
		this.aBoolean462 = false;
		try {
			this.aClass131_3 = new Class131_Sub2(this);
			this.aClass134_3 = new Class134_Sub2(this);
			this.aClass130_3 = new Class130_Sub2(this);
			this.aClass126_3 = new Class126_Sub2(this);
			this.aClass128_Sub1_Sub1_5 = new Class128_Sub1_Sub1(this, this.aClass402_4, false);
			this.aClass128_Sub1_Sub1_6 = new Class128_Sub1_Sub1(this, this.aClass402_4, true);
			this.aClass128_Sub1_Sub2_3 = new Class128_Sub1_Sub2(this, this.aClass402_4);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass131_3 = new Class131_Sub1(this);
			this.aClass134_3 = new Class134_Sub1(this);
			this.aClass130_3 = new Class130_Sub1(this);
			this.aClass126_3 = new Class126_Sub1(this);
			this.aClass128_Sub1_Sub1_5 = null;
			this.aClass128_Sub1_Sub1_6 = null;
			this.aClass128_Sub1_Sub2_3 = null;
			this.aBoolean462 = true;
		}
		if (!this.aBoolean462) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass112_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass112_6.method23736();
				local112 = this.aClass112_6.method23737();
			}
			this.aClass404_3 = new Class404(this, local108, local112);
			this.aClass137Array3[3] = new Class137_Sub2(this);
			this.aClass137Array3[1] = new Class137_Sub1(this);
			this.aClass137Array3[2] = new Class137_Sub3(this);
			if (this.aClass137Array3[3].method11447()) {
				this.aClass404_3.method28522(this.aClass137Array3[3]);
			}
			this.aClass404_3.method28522(this.aClass137Array3[1]);
			this.aClass404_3.method28522(this.aClass137Array3[2]);
			this.method20908();
			this.method20914();
		}
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21344();
			this.aClass128_3 = null;
		}
		this.method21033();
	}

	@OriginalMember(owner = "client!afc", name = "xt", descriptor = "()V", line = 419)
	void method21085() {
		this.method20985(7);
		this.method21296();
	}

	@OriginalMember(owner = "client!afc", name = "sw", descriptor = "()V", line = 419)
	void method21161() {
		this.method20985(7);
		this.method21296();
	}

	@OriginalMember(owner = "client!afc", name = "ye", descriptor = "()V", line = 424)
	final void method21086() {
		this.method20918();
		this.method20949();
		this.method21162();
		this.method21128();
		this.method21236();
		this.method20951();
		this.method20952();
		this.method20944();
		this.method20945();
		this.method20906();
		this.method21051();
		this.method21104();
		this.method20987();
		this.method20986();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20966(local32);
			this.method21185();
			this.method20980();
			this.method20976();
		}
		this.method20977();
		this.method20925();
	}

	@OriginalMember(owner = "client!afc", name = "yo", descriptor = "()V", line = 424)
	final void method21087() {
		this.method20918();
		this.method20949();
		this.method21162();
		this.method21128();
		this.method21236();
		this.method20951();
		this.method20952();
		this.method20944();
		this.method20945();
		this.method20906();
		this.method21051();
		this.method21104();
		this.method20987();
		this.method20986();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20966(local32);
			this.method21185();
			this.method20980();
			this.method20976();
		}
		this.method20977();
		this.method20925();
	}

	@OriginalMember(owner = "client!afc", name = "ss", descriptor = "()V", line = 424)
	final void method21296() {
		this.method20918();
		this.method20949();
		this.method21162();
		this.method21128();
		this.method21236();
		this.method20951();
		this.method20952();
		this.method20944();
		this.method20945();
		this.method20906();
		this.method21051();
		this.method21104();
		this.method20987();
		this.method20986();
		for (@Pc(32) int local32 = this.anInt2954 - 1; local32 >= 0; local32--) {
			this.method20966(local32);
			this.method21185();
			this.method20980();
			this.method20976();
		}
		this.method20977();
		this.method20925();
	}

	@OriginalMember(owner = "client!afc", name = "sx", descriptor = "()V", line = 449)
	void method20901() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28530();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method30884();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method30884();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method30884();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28709();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28335();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method30884();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28672();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "yj", descriptor = "()V", line = 449)
	void method21088() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28530();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method30884();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method30884();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method30884();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28709();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28335();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method30884();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28672();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ys", descriptor = "()V", line = 449)
	void method21089() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28530();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method30884();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method30884();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method30884();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28709();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28335();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method30884();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28672();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "yk", descriptor = "()V", line = 449)
	void method21090() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28530();
		}
		if (this.anInterface37_17 != null) {
			this.anInterface37_17.method30884();
		}
		if (this.anInterface37_16 != null) {
			this.anInterface37_16.method30884();
		}
		if (this.anInterface37_15 != null) {
			this.anInterface37_15.method30884();
		}
		if (this.aClass419_3 != null) {
			this.aClass419_3.method28709();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass109_Sub3Array6[local31] != null) {
				this.aClass109_Sub3Array6[local31].method7050();
			}
		}
		if (this.aClass395_3 != null) {
			this.aClass395_3.method28335();
		}
		if (this.anInterface40_4 != null) {
			this.anInterface40_4.method30884();
		}
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28672();
			this.aClass414_3 = null;
		}
	}

	@OriginalMember(owner = "client!afc", name = "sm", descriptor = "()V", line = 468)
	void method21033() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28531();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20902();
		this.method21053();
		this.method20904();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28334(this);
		if (this.aBoolean475) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "yn", descriptor = "()V", line = 468)
	void method21091() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28531();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20902();
		this.method21053();
		this.method20904();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28334(this);
		if (this.aBoolean475) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "yg", descriptor = "()V", line = 468)
	void method21156() {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28531();
		}
		if (this.aClass137Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass137Array3.length; local10++) {
				if (this.aClass137Array3[local10] != null && this.aClass137Array3[local10].method11482()) {
					this.aClass137Array3[local10].method11450();
				}
			}
		}
		this.aClass395_3 = new Class395(this);
		this.method20902();
		this.method21053();
		this.method20904();
		this.aClass419_3 = new Class419(this, 1024);
		this.aClass395_3.method28334(this);
		if (this.aBoolean475) {
			this.aClass414_3 = new Class414(this, 1024);
		}
	}

	@OriginalMember(owner = "client!afc", name = "sk", descriptor = "()V", line = 482)
	final void method20902() {
		this.anInterface37_17 = this.method21013(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29315(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface37_17.method29333(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "yq", descriptor = "()V", line = 482)
	final void method21092() {
		this.anInterface37_17 = this.method21013(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29315(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface37_17.method29333(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "yh", descriptor = "()V", line = 482)
	final void method21093() {
		this.anInterface37_17 = this.method21013(false);
		@Pc(6) short local6 = 160;
		this.anInterface37_17.method29315(local6, 32);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(1.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putInt(-1);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.anInterface37_17.method29333(0, this.aByteBuffer7.position(), this.aLong132);
		this.aClass145_17 = this.method20993(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10, Class399.aClass399_1, Class399.aClass399_1 }) });
	}

	@OriginalMember(owner = "client!afc", name = "si", descriptor = "()V", line = 531)
	final void method21053() {
		this.anInterface37_16 = this.method21013(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29315(local6, 12);
		this.aClass145_18 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "yb", descriptor = "()V", line = 531)
	final void method21094() {
		this.anInterface37_16 = this.method21013(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29315(local6, 12);
		this.aClass145_18 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "yz", descriptor = "()V", line = 531)
	final void method21095() {
		this.anInterface37_16 = this.method21013(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29315(local6, 12);
		this.aClass145_18 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "yp", descriptor = "()V", line = 531)
	final void method21231() {
		this.anInterface37_16 = this.method21013(true);
		@Pc(6) byte local6 = 24;
		this.anInterface37_16.method29315(local6, 12);
		this.aClass145_18 = this.method20993(new Class400[] { new Class400(Class399.aClass399_9) });
	}

	@OriginalMember(owner = "client!afc", name = "se", descriptor = "()V", line = 538)
	final void method20904() {
		this.anInterface37_15 = this.method21013(false);
		this.anInterface37_15.method29315(3096, 12);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer7.putFloat(local51);
			this.aByteBuffer7.putFloat(local47);
			this.aByteBuffer7.putFloat(0.0F);
		}
		this.anInterface37_15.method29333(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "yw", descriptor = "()V", line = 538)
	final void method21096() {
		this.anInterface37_15 = this.method21013(false);
		this.anInterface37_15.method29315(3096, 12);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		this.aByteBuffer7.putFloat(0.0F);
		for (@Pc(31) int local31 = 0; local31 <= 256; local31++) {
			@Pc(43) double local43 = (double) (local31 * 2) * 3.141592653589793D / 256.0D;
			@Pc(47) float local47 = (float) Math.cos(local43);
			@Pc(51) float local51 = (float) Math.sin(local43);
			this.aByteBuffer7.putFloat(local51);
			this.aByteBuffer7.putFloat(local47);
			this.aByteBuffer7.putFloat(0.0F);
		}
		this.anInterface37_15.method29333(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "sn", descriptor = "(FFFFFF)Z", line = 556)
	boolean method20905(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method20889(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface37_16.method29333(0, this.aByteBuffer7.position(), this.aLong132);
	}

	@OriginalMember(owner = "client!afc", name = "p", descriptor = "()V", line = 568)
	@Override
	void method20668() {
		if (this.aBoolean482) {
			return;
		}
		this.method20901();
		this.aClass406_3.method28567();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445(); local12 != null; local12 = this.aClass22_34.method415()) {
			((Class93_Sub35_Sub1) local12).method18357();
		}
		Class46.method896(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21357();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20884();
		this.method20419(0);
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!afc", name = "er", descriptor = "()V", line = 568)
	@Override
	void method20758() {
		if (this.aBoolean482) {
			return;
		}
		this.method20901();
		this.aClass406_3.method28567();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445(); local12 != null; local12 = this.aClass22_34.method415()) {
			((Class93_Sub35_Sub1) local12).method18357();
		}
		Class46.method896(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21357();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20884();
		this.method20419(0);
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!afc", name = "ea", descriptor = "()V", line = 568)
	@Override
	void method20558() {
		if (this.aBoolean482) {
			return;
		}
		this.method20901();
		this.aClass406_3.method28567();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445(); local12 != null; local12 = this.aClass22_34.method415()) {
			((Class93_Sub35_Sub1) local12).method18357();
		}
		Class46.method896(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21357();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20884();
		this.method20419(0);
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!afc", name = "ew", descriptor = "()V", line = 568)
	@Override
	void method20559() {
		if (this.aBoolean482) {
			return;
		}
		this.method20901();
		this.aClass406_3.method28567();
		for (@Pc(12) Class93 local12 = this.aClass22_34.method445(); local12 != null; local12 = this.aClass22_34.method415()) {
			((Class93_Sub35_Sub1) local12).method18357();
		}
		Class46.method896(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass128Array3.length; local29++) {
			if (this.aClass128Array3[local29] != null) {
				this.aClass128Array3[local29].method21357();
				this.aClass128Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass137Array3.length; local29++) {
			if (this.aClass137Array3[local29] != null) {
				this.aClass137Array3[local29].method11459();
				this.aClass137Array3[local29] = null;
			}
		}
		this.method20884();
		this.method20419(0);
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!afc", name = "r", descriptor = "()Z", line = 594)
	@Override
	public final boolean method20493() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fm", descriptor = "()Z", line = 594)
	@Override
	public final boolean method20802() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fg", descriptor = "()Z", line = 594)
	@Override
	public final boolean method20837() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "v", descriptor = "()Z", line = 598)
	@Override
	public final boolean method20422() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fs", descriptor = "()Z", line = 598)
	@Override
	public final boolean method20797() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fu", descriptor = "()Z", line = 598)
	@Override
	public final boolean method20566() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "o", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20423() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fz", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20568() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "y", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20565() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "fj", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20569() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "fn", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20683() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "fd", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20570() {
		return this.aClass137Array3[3] != null;
	}

	@OriginalMember(owner = "client!afc", name = "fi", descriptor = "()Z", line = 610)
	@Override
	public final boolean method20739() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "q", descriptor = "()Z", line = 610)
	@Override
	public final boolean method20426() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "s", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20424() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "ft", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20644() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "b", descriptor = "()Z", line = 618)
	@Override
	public final boolean method20428() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fw", descriptor = "()Z", line = 618)
	@Override
	public final boolean method20577() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fa", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20578() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "fp", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20694() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "h", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20429() {
		return true;
	}

	@OriginalMember(owner = "client!afc", name = "ff", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20685() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "a", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20539() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "fq", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20580() {
		return false;
	}

	@OriginalMember(owner = "client!afc", name = "fx", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20670() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!afc", name = "fv", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20760() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!afc", name = "x", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20440() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!afc", name = "fc", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20576() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!afc", name = "i", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20712() {
		return null;
	}

	@OriginalMember(owner = "client!afc", name = "fe", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20560() {
		return null;
	}

	@OriginalMember(owner = "client!afc", name = "d", descriptor = "(I)V", line = 641)
	@Override
	public void method20419(@OriginalArg(0) int arg0) {
		if (this.aClass406_3 != null) {
			this.aClass406_3.method28566();
		}
		this.anInt2952 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afc", name = "en", descriptor = "(I)V", line = 641)
	@Override
	public void method20561(@OriginalArg(0) int arg0) {
		if (this.aClass406_3 != null) {
			this.aClass406_3.method28566();
		}
		this.anInt2952 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!afc", name = "yl", descriptor = "()Lclient!lm;", line = 646)
	Class401 method20932() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "yr", descriptor = "()Lclient!lm;", line = 646)
	Class401 method21098() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "yv", descriptor = "()Lclient!lm;", line = 646)
	Class401 method21100() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "ym", descriptor = "()Lclient!lm;", line = 646)
	Class401 method21101() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "yi", descriptor = "()Lclient!lm;", line = 646)
	Class401 method21148() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "sq", descriptor = "()Lclient!lm;", line = 646)
	Class401 method21266() {
		return this.aClass414_3 == null ? Class401.aClass401_3 : this.aClass414_3.method28680();
	}

	@OriginalMember(owner = "client!afc", name = "cm", descriptor = "()V", line = 651)
	@Override
	public void method20501() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28673();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qg", descriptor = "()V", line = 651)
	@Override
	public void method20854() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28673();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qe", descriptor = "()V", line = 651)
	@Override
	public void method20855() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28673();
		}
	}

	@OriginalMember(owner = "client!afc", name = "cq", descriptor = "()V", line = 657)
	@Override
	public void method20502() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28682();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ql", descriptor = "()V", line = 657)
	@Override
	public void method20856() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28682();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qj", descriptor = "()V", line = 657)
	@Override
	public void method20857() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28682();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qr", descriptor = "()V", line = 657)
	@Override
	public void method20858() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28682();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ch", descriptor = "()V", line = 663)
	@Override
	public void method20503() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qy", descriptor = "()V", line = 663)
	@Override
	public void method20412() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qd", descriptor = "()V", line = 663)
	@Override
	public void method20860() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qi", descriptor = "()V", line = 663)
	@Override
	public void method20861() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qc", descriptor = "()V", line = 663)
	@Override
	public void method20859() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "qw", descriptor = "()V", line = 663)
	@Override
	public void method20863() {
		if (this.aClass414_3 != null) {
			this.aClass414_3.method28679();
		}
	}

	@OriginalMember(owner = "client!afc", name = "sh", descriptor = "()V", line = 669)
	void method20917() {
		this.method20910();
	}

	@OriginalMember(owner = "client!afc", name = "ya", descriptor = "()V", line = 669)
	void method21040() {
		this.method20910();
	}

	@OriginalMember(owner = "client!afc", name = "yf", descriptor = "()V", line = 669)
	void method21102() {
		this.method20910();
	}

	@OriginalMember(owner = "client!afc", name = "st", descriptor = "()V", line = 673)
	void method20910() {
		this.method20937();
		this.method20939();
		this.method21012();
		this.method20562();
		this.method20466();
	}

	@OriginalMember(owner = "client!afc", name = "yd", descriptor = "()V", line = 673)
	void method20997() {
		this.method20937();
		this.method20939();
		this.method21012();
		this.method20562();
		this.method20466();
	}

	@OriginalMember(owner = "client!afc", name = "dy", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28523(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28530();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "lt", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28523(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28530();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "mf", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28523(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28530();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "lk", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28523(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28530();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "ld", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass404_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass137Array3.length; local5++) {
			if (this.aClass137Array3[local5] != null && this.aClass137Array3[local5].method11482() && !this.aClass137Array3[local5].method11460()) {
				if (!this.aClass404_3.method28523(arg0, arg1, arg2, arg3)) {
					this.aClass404_3.method28530();
					this.aClass404_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!afc", name = "db", descriptor = "(II)V", line = 694)
	@Override
	public final void method20532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28528(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "mx", descriptor = "(II)V", line = 694)
	@Override
	public final void method20747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28528(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "mh", descriptor = "(II)V", line = 694)
	@Override
	public final void method20746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass404_3 != null) {
			this.aClass404_3.method28528(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!afc", name = "dh", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20533() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean747;
	}

	@OriginalMember(owner = "client!afc", name = "mg", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20748() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean747;
	}

	@OriginalMember(owner = "client!afc", name = "me", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20454() {
		return this.aClass404_3 != null && this.aClass404_3.aBoolean747;
	}

	@OriginalMember(owner = "client!afc", name = "sl", descriptor = "()Z", line = 702)
	boolean method20908() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "yc", descriptor = "()Z", line = 702)
	boolean method20994() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "yy", descriptor = "()Z", line = 702)
	boolean method21105() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "yu", descriptor = "()Z", line = 702)
	boolean method21107() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "yt", descriptor = "()Z", line = 702)
	boolean method21108() {
		if (this.aClass137Array3[1] == null || this.aClass137Array3[1].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[1]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "dx", descriptor = "()Z", line = 711)
	@Override
	public boolean method20451() {
		return this.aClass137Array3[1] != null && this.aClass137Array3[1].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mn", descriptor = "()Z", line = 711)
	@Override
	public boolean method20750() {
		return this.aClass137Array3[1] != null && this.aClass137Array3[1].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "dg", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class137_Sub1.aFloat126 = arg0;
		Class137_Sub1.aFloat124 = arg1;
		Class137_Sub1.aFloat125 = arg2;
		Class137_Sub1.aFloat127 = arg3;
		Class137_Sub1.aFloat128 = arg4;
	}

	@OriginalMember(owner = "client!afc", name = "mv", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20751(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class137_Sub1.aFloat126 = arg0;
		Class137_Sub1.aFloat124 = arg1;
		Class137_Sub1.aFloat125 = arg2;
		Class137_Sub1.aFloat127 = arg3;
		Class137_Sub1.aFloat128 = arg4;
	}

	@OriginalMember(owner = "client!afc", name = "md", descriptor = "([I)Lclient!cj;", line = 723)
	@Override
	public Class102 method20753(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "my", descriptor = "([I)Lclient!cj;", line = 723)
	@Override
	public Class102 method20752(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "mk", descriptor = "([I)Lclient!cj;", line = 723)
	@Override
	public Class102 method20500(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "mq", descriptor = "([I)Lclient!cj;", line = 723)
	@Override
	public Class102 method20755(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "de", descriptor = "([I)Lclient!cj;", line = 723)
	@Override
	public Class102 method20536(@OriginalArg(0) int[] arg0) {
		return new Class102_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "sp", descriptor = "()Z", line = 727)
	boolean method20914() {
		if (this.aClass137Array3[2] == null || this.aClass137Array3[2].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[2]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "dj", descriptor = "()Z", line = 736)
	@Override
	public boolean method20537() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "ms", descriptor = "()Z", line = 736)
	@Override
	public boolean method20756() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mp", descriptor = "()Z", line = 736)
	@Override
	public boolean method20757() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mo", descriptor = "()Z", line = 736)
	@Override
	public boolean method20574() {
		return this.aClass137Array3[2] != null && this.aClass137Array3[2].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "eo", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V", line = 740)
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
		Class137_Sub3.aClass102_Sub2Array1[0] = (Class102_Sub2) arg0;
		Class137_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[1] = (Class102_Sub2) arg2;
		Class137_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[2] = (Class102_Sub2) arg4;
		Class137_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class137_Sub3.anInt1379 = local1;
		Class137_Sub3.aFloat139 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afc", name = "ml", descriptor = "(Lclient!cj;FLclient!cj;FLclient!cj;F)V", line = 740)
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
		Class137_Sub3.aClass102_Sub2Array1[0] = (Class102_Sub2) arg0;
		Class137_Sub3.aFloatArray41[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[1] = (Class102_Sub2) arg2;
		Class137_Sub3.aFloatArray41[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class137_Sub3.aClass102_Sub2Array1[2] = (Class102_Sub2) arg4;
		Class137_Sub3.aFloatArray41[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class137_Sub3.anInt1379 = local1;
		Class137_Sub3.aFloat139 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!afc", name = "mb", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20763() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "ey", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20573() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mi", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20817() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mr", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20761() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mz", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20762() {
		if (this.aClass137Array3[3] == null || this.aClass137Array3[3].method11482()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass404_3.method28522(this.aClass137Array3[3]);
		if (local18) {
			this.aClass406_3.method28567();
		}
		return local18;
	}

	@OriginalMember(owner = "client!afc", name = "mt", descriptor = "()V", line = 781)
	@Override
	public final void method20586() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28529(this.aClass137Array3[3]);
			this.aClass406_3.method28567();
		}
	}

	@OriginalMember(owner = "client!afc", name = "mu", descriptor = "()V", line = 781)
	@Override
	public final void method20430() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28529(this.aClass137Array3[3]);
			this.aClass406_3.method28567();
		}
	}

	@OriginalMember(owner = "client!afc", name = "mc", descriptor = "()V", line = 781)
	@Override
	public final void method20766() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28529(this.aClass137Array3[3]);
			this.aClass406_3.method28567();
		}
	}

	@OriginalMember(owner = "client!afc", name = "eu", descriptor = "()V", line = 781)
	@Override
	public final void method20572() {
		if (this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482()) {
			this.aClass404_3.method28529(this.aClass137Array3[3]);
			this.aClass406_3.method28567();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ed", descriptor = "()Z", line = 788)
	@Override
	public final boolean method20541() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "mj", descriptor = "()Z", line = 788)
	@Override
	public final boolean method20834() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "ma", descriptor = "()Z", line = 788)
	@Override
	public final boolean method20767() {
		return this.aClass137Array3[3] != null && this.aClass137Array3[3].method11482();
	}

	@OriginalMember(owner = "client!afc", name = "es", descriptor = "(FFFFFF)V", line = 792)
	@Override
	final void method20543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "mm", descriptor = "(FFFFFF)V", line = 792)
	@Override
	final void method20770(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "mw", descriptor = "(FFFFFF)V", line = 792)
	@Override
	final void method20768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class137_Sub2.aFloat133 = arg0;
		Class137_Sub2.aFloat132 = arg1;
		Class137_Sub2.aFloat131 = arg2;
		Class137_Sub2.aFloat134 = arg5;
	}

	@OriginalMember(owner = "client!afc", name = "cp", descriptor = "(I)Lclient!akz;", line = 799)
	@Override
	public final Class93_Sub35 method20520(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub1 local4 = new Class93_Sub35_Sub1(arg0);
		this.aClass22_34.method407(local4);
		return local4;
	}

	@OriginalMember(owner = "client!afc", name = "nc", descriptor = "(I)Lclient!akz;", line = 799)
	@Override
	public final Class93_Sub35 method20530(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub35_Sub1 local4 = new Class93_Sub35_Sub1(arg0);
		this.aClass22_34.method407(local4);
		return local4;
	}

	@OriginalMember(owner = "client!afc", name = "jl", descriptor = "(Lclient!akz;)V", line = 805)
	@Override
	public final void method20671(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap6 = ((Class93_Sub35_Sub1) arg0).aNativeHeap3;
	}

	@OriginalMember(owner = "client!afc", name = "ca", descriptor = "(Lclient!akz;)V", line = 805)
	@Override
	public final void method20494(@OriginalArg(0) Class93_Sub35 arg0) {
		this.aNativeHeap6 = ((Class93_Sub35_Sub1) arg0).aNativeHeap3;
	}

	@OriginalMember(owner = "client!afc", name = "su", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method20915(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.n(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "zh", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method21074(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.n(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "za", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method21210(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap6.n(arg0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "sd", descriptor = "(I)Lclient!ml;", line = 813)
	final Interface40 method20916(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29338() < arg0 * 2) {
			this.anInterface40_4.method29351(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "zt", descriptor = "(I)Lclient!ml;", line = 813)
	final Interface40 method20921(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29338() < arg0 * 2) {
			this.anInterface40_4.method29351(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "zn", descriptor = "(I)Lclient!ml;", line = 813)
	final Interface40 method21111(@OriginalArg(0) int arg0) {
		if (this.anInterface40_4.method29338() < arg0 * 2) {
			this.anInterface40_4.method29351(arg0);
		}
		return this.anInterface40_4;
	}

	@OriginalMember(owner = "client!afc", name = "eb", descriptor = "()I", line = 818)
	@Override
	public final int method20808() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "ex", descriptor = "()I", line = 818)
	@Override
	public final int method20843() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "c", descriptor = "()I", line = 818)
	@Override
	public final int method20819() {
		return this.anInt2917 + this.anInt2916 + this.anInt2931;
	}

	@OriginalMember(owner = "client!afc", name = "cw", descriptor = "(IIZZ)Lclient!cm;", line = 822)
	@Override
	public final Class100 method20496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "je", descriptor = "(IIZZ)Lclient!cm;", line = 822)
	@Override
	public final Class100 method20468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "jn", descriptor = "(IIZZ)Lclient!cm;", line = 822)
	@Override
	public final Class100 method20672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class100_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "co", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 827)
	@Override
	public final Class100 method20499(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20498(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20498(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		}
		local21.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "nv", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 827)
	@Override
	public final Class100 method20796(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20498(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20498(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		}
		local21.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "nh", descriptor = "(Lclient!de;Z)Lclient!cm;", line = 827)
	@Override
	public final Class100 method20780(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class100 local21;
		if (arg0.method7206() == 0 || arg0.method7198() == 0) {
			local21 = this.method20498(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method7171(false);
			local21 = this.method20498(local9, 0, arg0.method7206(), arg0.method7206(), arg0.method7198());
		}
		local21.method18162(arg0.method7158(), arg0.method7160(), arg0.method7170(), arg0.method7218());
		return local21;
	}

	@OriginalMember(owner = "client!afc", name = "ct", descriptor = "([IIIIIZ)Lclient!cm;", line = 837)
	@Override
	public final Class100 method20487(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jb", descriptor = "([IIIIIZ)Lclient!cm;", line = 837)
	@Override
	public final Class100 method20527(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class100_Sub1(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "cr", descriptor = "(IIIIZ)Lclient!cm;", line = 841)
	@Override
	public final Class100 method20613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18170(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "jm", descriptor = "(IIIIZ)Lclient!cm;", line = 841)
	@Override
	public final Class100 method20675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18170(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "jw", descriptor = "(IIIIZ)Lclient!cm;", line = 841)
	@Override
	public final Class100 method20446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class100_Sub1 local8 = new Class100_Sub1(this, arg2, arg3, arg4, false);
		local8.method18170(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!afc", name = "cy", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 847)
	@Override
	public final Class106 method20506(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jo", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 847)
	@Override
	public final Class106 method20772(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jz", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 847)
	@Override
	public final Class106 method20509(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jc", descriptor = "(Lclient!aac;Lclient!de;Z)Lclient!eu;", line = 847)
	@Override
	public final Class106 method20687(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) boolean arg2) {
		return new Class106_Sub6(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "jr", descriptor = "(II[I[I)Lclient!ch;", line = 851)
	@Override
	public final Class96 method20524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "cb", descriptor = "(II[I[I)Lclient!ch;", line = 851)
	@Override
	public final Class96 method20504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "ji", descriptor = "(II[I[I)Lclient!ch;", line = 851)
	@Override
	public final Class96 method20679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "js", descriptor = "(II[I[I)Lclient!ch;", line = 851)
	@Override
	public final Class96 method20447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class96_Sub2.method1890(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!afc", name = "jx", descriptor = "(I)V", line = 854)
	@Override
	public final void method20594(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "ck", descriptor = "(I)V", line = 854)
	@Override
	public final void method20831(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jg", descriptor = "(I)V", line = 854)
	@Override
	public final void method20688(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jh", descriptor = "(I)V", line = 854)
	@Override
	public final void method20779(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jp", descriptor = "(I)V", line = 854)
	@Override
	public final void method20674(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "jk", descriptor = "(I)V", line = 854)
	@Override
	public final void method20692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!afc", name = "cj", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 857)
	@Override
	public final Class109 method20510(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "kw", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 857)
	@Override
	public final Class109 method20786(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "kz", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 857)
	@Override
	public final Class109 method20729(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "ke", descriptor = "(Lclient!dq;IIII)Lclient!do;", line = 857)
	@Override
	public final Class109 method20695(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class109_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!afc", name = "kq", descriptor = "(II)I", line = 861)
	@Override
	public final int method20583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afc", name = "cd", descriptor = "(II)I", line = 861)
	@Override
	public final int method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!afc", name = "dd", descriptor = "(II)I", line = 865)
	@Override
	public final int method20512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afc", name = "kg", descriptor = "(II)I", line = 865)
	@Override
	public final int method20869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!afc", name = "ku", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 869)
	@Override
	public final Class99 method20698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "dr", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 869)
	@Override
	public final Class99 method20513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "kf", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 869)
	@Override
	public final Class99 method20700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "ko", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 869)
	@Override
	public final Class99 method20699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "kx", descriptor = "(II[[I[[IIII)Lclient!cb;", line = 869)
	@Override
	public final Class99 method20791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class99_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "ki", descriptor = "()Lclient!pq;", line = 873)
	@Override
	public final Class489 method20632() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "cc", descriptor = "()Lclient!pq;", line = 873)
	@Override
	public final Class489 method20507() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "ks", descriptor = "()Lclient!pq;", line = 873)
	@Override
	public final Class489 method20618() {
		return this.aClass489_88;
	}

	@OriginalMember(owner = "client!afc", name = "cz", descriptor = "()Lclient!ou;", line = 877)
	@Override
	public final Class470 method20508() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "kh", descriptor = "()Lclient!ou;", line = 877)
	@Override
	public final Class470 method20704() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "ka", descriptor = "()Lclient!ou;", line = 877)
	@Override
	public final Class470 method20705() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "kl", descriptor = "()Lclient!ou;", line = 877)
	@Override
	public final Class470 method20706() {
		return this.aClass470_39;
	}

	@OriginalMember(owner = "client!afc", name = "du", descriptor = "(I)Lclient!dz;", line = 881)
	@Override
	public final Class107 method20528(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "lg", descriptor = "(I)Lclient!dz;", line = 881)
	@Override
	public final Class107 method20736(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "lx", descriptor = "(I)Lclient!dz;", line = 881)
	@Override
	public final Class107 method20737(@OriginalArg(0) int arg0) {
		return new Class107_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "dp", descriptor = "(Lclient!dz;)V", line = 885)
	@Override
	public final void method20815(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub1_3 = (Class107_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afc", name = "ln", descriptor = "(Lclient!dz;)V", line = 885)
	@Override
	public final void method20741(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub1_3 = (Class107_Sub1) arg0;
	}

	@OriginalMember(owner = "client!afc", name = "sz", descriptor = "()Lclient!mr;", line = 889)
	public final Interface44 method20922() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18125();
	}

	@OriginalMember(owner = "client!afc", name = "zy", descriptor = "()Lclient!mr;", line = 889)
	public final Interface44 method21112() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18125();
	}

	@OriginalMember(owner = "client!afc", name = "zi", descriptor = "()Lclient!mr;", line = 889)
	public final Interface44 method21113() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18125();
	}

	@OriginalMember(owner = "client!afc", name = "zj", descriptor = "()Lclient!mr;", line = 889)
	public final Interface44 method21114() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18125();
	}

	@OriginalMember(owner = "client!afc", name = "zw", descriptor = "()Lclient!mr;", line = 889)
	public final Interface44 method21115() {
		return this.aClass107_Sub1_3 == null ? null : this.aClass107_Sub1_3.method18125();
	}

	@OriginalMember(owner = "client!afc", name = "bk", descriptor = "()V", line = 893)
	@Override
	public void method20562() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23736();
		this.anInt2919 = this.aClass112_6.method23737();
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "hn", descriptor = "()V", line = 893)
	@Override
	public void method20840() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23736();
		this.anInt2919 = this.aClass112_6.method23737();
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "hi", descriptor = "()V", line = 893)
	@Override
	public void method20633() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23736();
		this.anInt2919 = this.aClass112_6.method23737();
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "hw", descriptor = "()V", line = 893)
	@Override
	public void method20634() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23736();
		this.anInt2919 = this.aClass112_6.method23737();
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "he", descriptor = "()V", line = 893)
	@Override
	public void method20631() {
		this.anInt2923 = 0;
		this.anInt2924 = 0;
		this.anInt2941 = this.aClass112_6.method23736();
		this.anInt2919 = this.aClass112_6.method23737();
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "bh", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "ht", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "hc", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "ho", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2924 = arg1;
		this.anInt2941 = arg2;
		this.anInt2919 = arg3;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "bx", descriptor = "([I)V", line = 909)
	@Override
	public void method20625(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "hv", descriptor = "([I)V", line = 909)
	@Override
	public void method20702(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "hj", descriptor = "([I)V", line = 909)
	@Override
	public void method20639(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "hz", descriptor = "([I)V", line = 909)
	@Override
	public void method20640(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2923;
		arg0[1] = this.anInt2924;
		arg0[2] = this.anInt2941;
		arg0[3] = this.anInt2919;
	}

	@OriginalMember(owner = "client!afc", name = "sf", descriptor = "()V", line = 916)
	final void method20991() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.anInt2925 = this.anInt2923;
			this.anInt2926 = this.anInt2924;
			this.anInt2927 = this.anInt2941;
			this.anInt2928 = this.anInt2919;
			this.aFloat204 = this.aFloat206;
			this.aFloat205 = this.aFloat207;
		} else {
			this.anInt2925 = 0;
			this.anInt2926 = 0;
			this.anInt2927 = this.aClass112_6.method23736();
			this.anInt2928 = this.aClass112_6.method23737();
			this.aFloat204 = 0.0F;
			this.aFloat205 = 1.0F;
		}
		this.method20925();
		this.aFloat201 = (float) this.anInt2941 / 2.0F;
		this.aFloat203 = (float) this.anInt2919 / 2.0F;
		this.aFloat200 = (float) this.anInt2923 + this.aFloat201;
		this.aFloat202 = (float) this.anInt2924 + this.aFloat203;
	}

	@OriginalMember(owner = "client!afc", name = "zq", descriptor = "()V", line = 916)
	final void method21116() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.anInt2925 = this.anInt2923;
			this.anInt2926 = this.anInt2924;
			this.anInt2927 = this.anInt2941;
			this.anInt2928 = this.anInt2919;
			this.aFloat204 = this.aFloat206;
			this.aFloat205 = this.aFloat207;
		} else {
			this.anInt2925 = 0;
			this.anInt2926 = 0;
			this.anInt2927 = this.aClass112_6.method23736();
			this.anInt2928 = this.aClass112_6.method23737();
			this.aFloat204 = 0.0F;
			this.aFloat205 = 1.0F;
		}
		this.method20925();
		this.aFloat201 = (float) this.anInt2941 / 2.0F;
		this.aFloat203 = (float) this.anInt2919 / 2.0F;
		this.aFloat200 = (float) this.anInt2923 + this.aFloat201;
		this.aFloat202 = (float) this.anInt2924 + this.aFloat203;
	}

	@OriginalMember(owner = "client!afc", name = "bd", descriptor = "(FF)V", line = 940)
	@Override
	public void method20638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat206 = arg0;
		this.aFloat207 = arg1;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "ij", descriptor = "(FF)V", line = 940)
	@Override
	public void method20641(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat206 = arg0;
		this.aFloat207 = arg1;
		this.method20991();
	}

	@OriginalMember(owner = "client!afc", name = "iu", descriptor = "([I)V", line = 946)
	@Override
	public final void method20579(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "bq", descriptor = "([I)V", line = 946)
	@Override
	public final void method20470(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "in", descriptor = "([I)V", line = 946)
	@Override
	public final void method20648(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2921;
		arg0[1] = this.anInt2940;
		arg0[2] = this.anInt2958;
		arg0[3] = this.anInt2930;
	}

	@OriginalMember(owner = "client!afc", name = "bc", descriptor = "()V", line = 953)
	@Override
	public final void method20466() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23736();
			this.anInt2930 = this.aClass112_6.method23737();
		}
		if (this.aBoolean481) {
			this.aBoolean481 = false;
			this.method20927();
		}
	}

	@OriginalMember(owner = "client!afc", name = "io", descriptor = "()V", line = 953)
	@Override
	public final void method20658() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23736();
			this.anInt2930 = this.aClass112_6.method23737();
		}
		if (this.aBoolean481) {
			this.aBoolean481 = false;
			this.method20927();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ig", descriptor = "()V", line = 953)
	@Override
	public final void method20874() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23736();
			this.anInt2930 = this.aClass112_6.method23737();
		}
		if (this.aBoolean481) {
			this.aBoolean481 = false;
			this.method20927();
		}
	}

	@OriginalMember(owner = "client!afc", name = "iv", descriptor = "()V", line = 953)
	@Override
	public final void method20645() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23736();
			this.anInt2930 = this.aClass112_6.method23737();
		}
		if (this.aBoolean481) {
			this.aBoolean481 = false;
			this.method20927();
		}
	}

	@OriginalMember(owner = "client!afc", name = "iq", descriptor = "()V", line = 953)
	@Override
	public final void method20643() {
		if (this.aClass112_6 == null) {
			this.anInt2930 = 0;
			this.anInt2958 = 0;
			this.anInt2940 = 0;
			this.anInt2921 = 0;
		} else {
			this.anInt2940 = 0;
			this.anInt2921 = 0;
			this.anInt2958 = this.aClass112_6.method23736();
			this.anInt2930 = this.aClass112_6.method23737();
		}
		if (this.aBoolean481) {
			this.aBoolean481 = false;
			this.method20927();
		}
	}

	@OriginalMember(owner = "client!afc", name = "bi", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ow", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "oq", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "oi", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ot", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ol", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20466();
			return;
		}
		this.anInt2921 = arg0 >= 0 ? arg0 : 0;
		this.anInt2958 = arg2 <= local6 ? arg2 : local6;
		this.anInt2940 = arg1 >= 0 ? arg1 : 0;
		this.anInt2930 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ie", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2921 < local21) {
			this.anInt2921 = local21;
			local43 = true;
		}
		if (this.anInt2958 > local28) {
			this.anInt2958 = local28;
			local43 = true;
		}
		if (this.anInt2940 < local34) {
			this.anInt2940 = local34;
			local43 = true;
		}
		if (this.anInt2930 > local41) {
			this.anInt2930 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "bn", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass112_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass112_6.method23736();
			local10 = this.aClass112_6.method23737();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2921 < local21) {
			this.anInt2921 = local21;
			local43 = true;
		}
		if (this.anInt2958 > local28) {
			this.anInt2958 = local28;
			local43 = true;
		}
		if (this.anInt2940 < local34) {
			this.anInt2940 = local34;
			local43 = true;
		}
		if (this.anInt2930 > local41) {
			this.anInt2930 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "sy", descriptor = "(II)V", line = 1039)
	final void method20924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20925();
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zo", descriptor = "(II)V", line = 1039)
	final void method21117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20925();
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zk", descriptor = "(II)V", line = 1039)
	final void method21118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20925();
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zm", descriptor = "(II)V", line = 1039)
	final void method21119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20925();
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "zd", descriptor = "(II)V", line = 1039)
	final void method21252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2929 = arg0;
		this.anInt2939 = arg1;
		this.method20925();
		if (!this.aBoolean481 && (this.aBoolean474 || this.method21266() == Class401.aClass401_3)) {
			this.aBoolean481 = true;
			this.method20927();
		}
		if (this.aBoolean481) {
			this.method20883();
		}
	}

	@OriginalMember(owner = "client!afc", name = "px", descriptor = "(Z)V", line = 1050)
	@Override
	public void method20697(@OriginalArg(0) boolean arg0) {
		this.aBoolean474 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "bt", descriptor = "(Z)V", line = 1050)
	@Override
	public void method20469(@OriginalArg(0) boolean arg0) {
		this.aBoolean474 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "pn", descriptor = "(Z)V", line = 1050)
	@Override
	public void method20567(@OriginalArg(0) boolean arg0) {
		this.aBoolean474 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "so", descriptor = "()Lclient!pq;", line = 1058)
	final Class489 method20928() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zg", descriptor = "()Lclient!pq;", line = 1058)
	final Class489 method21130() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zx", descriptor = "()Lclient!pq;", line = 1058)
	final Class489 method21131() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_75 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "sc", descriptor = "()Lclient!pq;", line = 1063)
	final Class489 method20963() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zr", descriptor = "()Lclient!pq;", line = 1063)
	final Class489 method21132() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "zf", descriptor = "()Lclient!pq;", line = 1063)
	final Class489 method21216() {
		return this.aClass408_3 == Class408.aClass408_6 ? this.aClass489_72 : aClass489_77;
	}

	@OriginalMember(owner = "client!afc", name = "do", descriptor = "(Lclient!ou;)V", line = 1068)
	@Override
	public final void method20516(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method29842(this.aClass470_38);
		this.aClass489_87.method29837(this.aClass489_75);
		this.aClass489_87.method29864();
		this.aClass470_34.method29364(arg0);
		this.aClass470_34.method29372();
		this.aClass489_72.method29842(this.aClass470_34);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21295();
		}
	}

	@OriginalMember(owner = "client!afc", name = "kv", descriptor = "(Lclient!ou;)V", line = 1068)
	@Override
	public final void method20717(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method29842(this.aClass470_38);
		this.aClass489_87.method29837(this.aClass489_75);
		this.aClass489_87.method29864();
		this.aClass470_34.method29364(arg0);
		this.aClass470_34.method29372();
		this.aClass489_72.method29842(this.aClass470_34);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21295();
		}
	}

	@OriginalMember(owner = "client!afc", name = "kk", descriptor = "(Lclient!ou;)V", line = 1068)
	@Override
	public final void method20716(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method29842(this.aClass470_38);
		this.aClass489_87.method29837(this.aClass489_75);
		this.aClass489_87.method29864();
		this.aClass470_34.method29364(arg0);
		this.aClass470_34.method29372();
		this.aClass489_72.method29842(this.aClass470_34);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21295();
		}
	}

	@OriginalMember(owner = "client!afc", name = "kt", descriptor = "(Lclient!ou;)V", line = 1068)
	@Override
	public final void method20814(@OriginalArg(0) Class470 arg0) {
		this.aClass470_38 = arg0;
		this.aClass489_75.method29842(this.aClass470_38);
		this.aClass489_87.method29837(this.aClass489_75);
		this.aClass489_87.method29864();
		this.aClass470_34.method29364(arg0);
		this.aClass470_34.method29372();
		this.aClass489_72.method29842(this.aClass470_34);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method21295();
		}
	}

	@OriginalMember(owner = "client!afc", name = "dz", descriptor = "()Lclient!ou;", line = 1080)
	@Override
	public Class470 method20517() {
		return this.aClass470_38;
	}

	@OriginalMember(owner = "client!afc", name = "li", descriptor = "()Lclient!ou;", line = 1080)
	@Override
	public Class470 method20719() {
		return this.aClass470_38;
	}

	@OriginalMember(owner = "client!afc", name = "dm", descriptor = "(Lclient!pq;)V", line = 1084)
	@Override
	public final void method20519(@OriginalArg(0) Class489 arg0) {
		this.aClass489_81.method29837(arg0);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "lv", descriptor = "(Lclient!pq;)V", line = 1084)
	@Override
	public final void method20720(@OriginalArg(0) Class489 arg0) {
		this.aClass489_81.method29837(arg0);
		this.method20929();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "sg", descriptor = "()V", line = 1090)
	final void method20929() {
		this.aClass489_85.method29837(this.aClass489_75);
		this.aClass489_85.method29953(this.aClass489_81);
		this.aClass489_85.method29840(this.aFloatArrayArray22[0]);
		this.aClass489_85.method29876(this.aFloatArrayArray22[1]);
		this.aClass489_85.method29858(this.aFloatArrayArray22[2]);
		this.aClass489_85.method29859(this.aFloatArrayArray22[3]);
		this.aClass489_85.method29860(this.aFloatArrayArray22[4]);
		this.aClass489_85.method29861(this.aFloatArrayArray22[5]);
		this.aClass489_84.method29837(this.aClass489_85);
		this.method20934(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "aag", descriptor = "()V", line = 1090)
	final void method21134() {
		this.aClass489_85.method29837(this.aClass489_75);
		this.aClass489_85.method29953(this.aClass489_81);
		this.aClass489_85.method29840(this.aFloatArrayArray22[0]);
		this.aClass489_85.method29876(this.aFloatArrayArray22[1]);
		this.aClass489_85.method29858(this.aFloatArrayArray22[2]);
		this.aClass489_85.method29859(this.aFloatArrayArray22[3]);
		this.aClass489_85.method29860(this.aFloatArrayArray22[4]);
		this.aClass489_85.method29861(this.aFloatArrayArray22[5]);
		this.aClass489_84.method29837(this.aClass489_85);
		this.method20934(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "aak", descriptor = "()V", line = 1090)
	final void method21135() {
		this.aClass489_85.method29837(this.aClass489_75);
		this.aClass489_85.method29953(this.aClass489_81);
		this.aClass489_85.method29840(this.aFloatArrayArray22[0]);
		this.aClass489_85.method29876(this.aFloatArrayArray22[1]);
		this.aClass489_85.method29858(this.aFloatArrayArray22[2]);
		this.aClass489_85.method29859(this.aFloatArrayArray22[3]);
		this.aClass489_85.method29860(this.aFloatArrayArray22[4]);
		this.aClass489_85.method29861(this.aFloatArrayArray22[5]);
		this.aClass489_84.method29837(this.aClass489_85);
		this.method20934(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "aad", descriptor = "()V", line = 1090)
	final void method21136() {
		this.aClass489_85.method29837(this.aClass489_75);
		this.aClass489_85.method29953(this.aClass489_81);
		this.aClass489_85.method29840(this.aFloatArrayArray22[0]);
		this.aClass489_85.method29876(this.aFloatArrayArray22[1]);
		this.aClass489_85.method29858(this.aFloatArrayArray22[2]);
		this.aClass489_85.method29859(this.aFloatArrayArray22[3]);
		this.aClass489_85.method29860(this.aFloatArrayArray22[4]);
		this.aClass489_85.method29861(this.aFloatArrayArray22[5]);
		this.aClass489_84.method29837(this.aClass489_85);
		this.method20934(this.aClass489_84);
	}

	@OriginalMember(owner = "client!afc", name = "lm", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20725() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "la", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20721() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "lp", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20480() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "lc", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20691() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "lf", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20724() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "dq", descriptor = "()Lclient!pq;", line = 1103)
	@Override
	public final Class489 method20654() {
		return this.aClass489_81;
	}

	@OriginalMember(owner = "client!afc", name = "tu", descriptor = "()V", line = 1107)
	final void method21295() {
		this.aBoolean459 = false;
	}

	@OriginalMember(owner = "client!afc", name = "ta", descriptor = "()Lclient!pq;", line = 1111)
	Class489 method20930() {
		return this.aClass489_74;
	}

	@OriginalMember(owner = "client!afc", name = "tr", descriptor = "()Lclient!ou;", line = 1115)
	Class470 method20931() {
		if (this.aClass408_3 != Class408.aClass408_6) {
			return this.aClass470_37;
		}
		if (!this.aBoolean459) {
			this.aClass470_35.method29364(this.aClass470_37);
			this.aClass470_35.method29388(this.aClass470_38);
			this.aClass489_76.method29842(this.aClass470_35);
			this.aBoolean459 = true;
		}
		return this.aClass470_35;
	}

	@OriginalMember(owner = "client!afc", name = "aaa", descriptor = "()Lclient!ou;", line = 1115)
	Class470 method21129() {
		if (this.aClass408_3 != Class408.aClass408_6) {
			return this.aClass470_37;
		}
		if (!this.aBoolean459) {
			this.aClass470_35.method29364(this.aClass470_37);
			this.aClass470_35.method29388(this.aClass470_38);
			this.aClass489_76.method29842(this.aClass470_35);
			this.aBoolean459 = true;
		}
		return this.aClass470_35;
	}

	@OriginalMember(owner = "client!afc", name = "aax", descriptor = "()Lclient!pq;", line = 1130)
	Class489 method21138() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			if (!this.aBoolean459) {
				this.method20931();
			}
			return this.aClass489_76;
		} else {
			return this.aClass489_74;
		}
	}

	@OriginalMember(owner = "client!afc", name = "tc", descriptor = "()Lclient!pq;", line = 1130)
	Class489 method21173() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			if (!this.aBoolean459) {
				this.method20931();
			}
			return this.aClass489_76;
		} else {
			return this.aClass489_74;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aat", descriptor = "()Lclient!pq;", line = 1140)
	final Class489 method21139() {
		return this.aClass489_84;
	}

	@OriginalMember(owner = "client!afc", name = "tj", descriptor = "()Lclient!pq;", line = 1140)
	final Class489 method21157() {
		return this.aClass489_84;
	}

	@OriginalMember(owner = "client!afc", name = "te", descriptor = "()Lclient!pq;", line = 1144)
	final Class489 method20933() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aas", descriptor = "()Lclient!pq;", line = 1144)
	final Class489 method21140() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aaf", descriptor = "()Lclient!pq;", line = 1144)
	final Class489 method21141() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aar", descriptor = "()Lclient!pq;", line = 1144)
	final Class489 method21142() {
		return this.aClass489_83;
	}

	@OriginalMember(owner = "client!afc", name = "aau", descriptor = "()V", line = 1150)
	final void method20955() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "tm", descriptor = "()V", line = 1150)
	final void method21012() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "aaj", descriptor = "()V", line = 1150)
	final void method21035() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "aaq", descriptor = "()V", line = 1150)
	final void method21145() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "aao", descriptor = "()V", line = 1150)
	final void method21146() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "aab", descriptor = "()V", line = 1150)
	final void method21147() {
		if (this.aClass408_3 == Class408.aClass408_4) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_4;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.aClass489_82 = this.aClass489_86;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!afc", name = "ty", descriptor = "()V", line = 1162)
	final void method20909() {
		if (this.aClass408_3 == Class408.aClass408_5) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_5;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.method21014();
		this.aClass489_82 = this.aClass489_80;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afc", name = "aae", descriptor = "()V", line = 1162)
	final void method20999() {
		if (this.aClass408_3 == Class408.aClass408_5) {
			return;
		}
		@Pc(6) Class408 local6 = this.aClass408_3;
		this.aClass408_3 = Class408.aClass408_5;
		if (local6 == Class408.aClass408_6) {
			this.method21295();
		}
		this.method21014();
		this.aClass489_82 = this.aClass489_80;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!afc", name = "tb", descriptor = "()V", line = 1175)
	final void method20937() {
		this.aBoolean470 = false;
		if (this.aClass408_3 == Class408.aClass408_5) {
			this.method21014();
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aal", descriptor = "()V", line = 1175)
	final void method21149() {
		this.aBoolean470 = false;
		if (this.aClass408_3 == Class408.aClass408_5) {
			this.method21014();
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "tn", descriptor = "()V", line = 1183)
	final void method20938() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			return;
		}
		this.aClass408_3 = Class408.aClass408_6;
		this.method21295();
		this.method21044();
		this.aClass489_82 = this.aClass489_81;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afc", name = "aaz", descriptor = "()V", line = 1183)
	final void method21049() {
		if (this.aClass408_3 == Class408.aClass408_6) {
			return;
		}
		this.aClass408_3 = Class408.aClass408_6;
		this.method21295();
		this.method21044();
		this.aClass489_82 = this.aClass489_81;
		this.method20941();
		this.method20991();
		this.anInt2959 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!afc", name = "tw", descriptor = "()V", line = 1195)
	final void method20939() {
		this.aBoolean484 = false;
		this.method21044();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aan", descriptor = "()V", line = 1195)
	final void method21057() {
		this.aBoolean484 = false;
		this.method21044();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aah", descriptor = "()V", line = 1195)
	final void method21150() {
		this.aBoolean484 = false;
		this.method21044();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aaw", descriptor = "()V", line = 1195)
	final void method21151() {
		this.aBoolean484 = false;
		this.method21044();
		if (this.aClass408_3 == Class408.aClass408_6) {
			this.method20941();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aay", descriptor = "()V", line = 1201)
	final void method20900() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "tz", descriptor = "()V", line = 1201)
	final void method21014() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "aam", descriptor = "()V", line = 1201)
	final void method21032() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "aac", descriptor = "()V", line = 1201)
	final void method21153() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "aav", descriptor = "()V", line = 1201)
	final void method21154() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "abo", descriptor = "()V", line = 1201)
	final void method21155() {
		if (this.aBoolean470) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass112_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass112_6.method23736();
			local13 = this.aClass112_6.method23737();
		}
		@Pc(21) Class489 local21 = this.aClass489_80;
		if (local9 == 0 || local13 == 0) {
			local21.method29836();
		} else {
			local21.method29850(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass489_79.method29837(local21);
		this.method20934(this.aClass489_79);
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!afc", name = "abr", descriptor = "()V", line = 1224)
	final void method21037() {
		if (!this.aBoolean484) {
			this.aBoolean484 = true;
		}
	}

	@OriginalMember(owner = "client!afc", name = "tf", descriptor = "()V", line = 1224)
	final void method21044() {
		if (!this.aBoolean484) {
			this.aBoolean484 = true;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abv", descriptor = "()V", line = 1230)
	final void method20936() {
		this.aClass489_83.method29837(this.aClass489_82);
		this.method20934(this.aClass489_83);
		this.aFloat208 = (this.aClass489_83.aFloatArray116[14] - this.aClass489_83.aFloatArray116[15]) / (this.aClass489_83.aFloatArray116[11] - this.aClass489_83.aFloatArray116[10]);
		this.aFloat215 = -this.aClass489_83.aFloatArray116[14] / this.aClass489_83.aFloatArray116[10];
		this.method21016();
	}

	@OriginalMember(owner = "client!afc", name = "th", descriptor = "()V", line = 1230)
	final void method20941() {
		this.aClass489_83.method29837(this.aClass489_82);
		this.method20934(this.aClass489_83);
		this.aFloat208 = (this.aClass489_83.aFloatArray116[14] - this.aClass489_83.aFloatArray116[15]) / (this.aClass489_83.aFloatArray116[11] - this.aClass489_83.aFloatArray116[10]);
		this.aFloat215 = -this.aClass489_83.aFloatArray116[14] / this.aClass489_83.aFloatArray116[10];
		this.method21016();
	}

	@OriginalMember(owner = "client!afc", name = "hp", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20629(@OriginalArg(0) boolean arg0) {
		this.aBoolean463 = arg0;
		this.method20945();
	}

	@OriginalMember(owner = "client!afc", name = "dv", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20518(@OriginalArg(0) boolean arg0) {
		this.aBoolean463 = arg0;
		this.method20945();
	}

	@OriginalMember(owner = "client!afc", name = "hy", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20630(@OriginalArg(0) boolean arg0) {
		this.aBoolean463 = arg0;
		this.method20945();
	}

	@OriginalMember(owner = "client!afc", name = "tt", descriptor = "(Z)V", line = 1243)
	final void method20943(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean458) {
			this.aBoolean458 = arg0;
			this.method20944();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abq", descriptor = "(Z)V", line = 1243)
	final void method21158(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean458) {
			this.aBoolean458 = arg0;
			this.method20944();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abw", descriptor = "(Z)V", line = 1243)
	final void method21159(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean458) {
			this.aBoolean458 = arg0;
			this.method20944();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abf", descriptor = "(Z)V", line = 1251)
	final void method21027(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abb", descriptor = "(Z)V", line = 1251)
	final void method21163(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abc", descriptor = "(Z)V", line = 1251)
	final void method21164(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abi", descriptor = "(Z)V", line = 1251)
	final void method21217(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abh", descriptor = "(Z)V", line = 1251)
	final void method21219(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ts", descriptor = "(Z)V", line = 1251)
	final void method21290(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method20945();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ev", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20824(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "nb", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "na", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "ni", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20554(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "nw", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20781(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		@Pc(89) float local89 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		@Pc(119) float local119 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
		arg3[0] = this.aFloat200 + this.aFloat201 * local59 / local29;
		arg3[1] = this.aFloat202 + this.aFloat203 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!afc", name = "ep", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "nl", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20783(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "nx", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * arg0 + this.aClass489_85.aFloatArray116[6] * arg1 + this.aClass489_85.aFloatArray116[10] * arg2;
		@Pc(59) float local59 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * arg0 + this.aClass489_85.aFloatArray116[7] * arg1 + this.aClass489_85.aFloatArray116[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * arg0 + this.aClass489_85.aFloatArray116[4] * arg1 + this.aClass489_85.aFloatArray116[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * arg0 + this.aClass489_85.aFloatArray116[5] * arg1 + this.aClass489_85.aFloatArray116[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass489_75.aFloatArray116[14] + this.aClass489_75.aFloatArray116[2] * arg0 + this.aClass489_75.aFloatArray116[6] * arg1 + this.aClass489_75.aFloatArray116[10] * arg2;
			arg3[0] = this.aFloat200 + this.aFloat201 * local115 / local59;
			arg3[1] = this.aFloat202 + this.aFloat203 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!afc", name = "cu", descriptor = "(IIIIII)I", line = 1307)
	@Override
	public int method20647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg0 + this.aClass489_85.aFloatArray116[6] * (float) arg1 + this.aClass489_85.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg3 + this.aClass489_85.aFloatArray116[6] * (float) arg4 + this.aClass489_85.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg0 + this.aClass489_85.aFloatArray116[7] * (float) arg1 + this.aClass489_85.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg3 + this.aClass489_85.aFloatArray116[7] * (float) arg4 + this.aClass489_85.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg0 + this.aClass489_85.aFloatArray116[4] * (float) arg1 + this.aClass489_85.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg3 + this.aClass489_85.aFloatArray116[4] * (float) arg4 + this.aClass489_85.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg0 + this.aClass489_85.aFloatArray116[5] * (float) arg1 + this.aClass489_85.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg3 + this.aClass489_85.aFloatArray116[5] * (float) arg4 + this.aClass489_85.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afc", name = "jf", descriptor = "(IIIIII)I", line = 1307)
	@Override
	public int method20832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg0 + this.aClass489_85.aFloatArray116[6] * (float) arg1 + this.aClass489_85.aFloatArray116[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass489_85.aFloatArray116[14] + this.aClass489_85.aFloatArray116[2] * (float) arg3 + this.aClass489_85.aFloatArray116[6] * (float) arg4 + this.aClass489_85.aFloatArray116[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg0 + this.aClass489_85.aFloatArray116[7] * (float) arg1 + this.aClass489_85.aFloatArray116[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass489_85.aFloatArray116[15] + this.aClass489_85.aFloatArray116[3] * (float) arg3 + this.aClass489_85.aFloatArray116[7] * (float) arg4 + this.aClass489_85.aFloatArray116[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg0 + this.aClass489_85.aFloatArray116[4] * (float) arg1 + this.aClass489_85.aFloatArray116[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass489_85.aFloatArray116[12] + this.aClass489_85.aFloatArray116[0] * (float) arg3 + this.aClass489_85.aFloatArray116[4] * (float) arg4 + this.aClass489_85.aFloatArray116[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg0 + this.aClass489_85.aFloatArray116[5] * (float) arg1 + this.aClass489_85.aFloatArray116[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass489_85.aFloatArray116[13] + this.aClass489_85.aFloatArray116[1] * (float) arg3 + this.aClass489_85.aFloatArray116[5] * (float) arg4 + this.aClass489_85.aFloatArray116[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!afc", name = "cn", descriptor = "(IIIILclient!ou;Lclient!oj;)Z", line = 1326)
	@Override
	boolean method20427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method29842(arg4);
		local2.method29953(this.aClass489_85);
		return arg5.method29280(arg0, arg1, arg2, arg3, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "ju", descriptor = "(IIIILclient!ou;Lclient!oj;)Z", line = 1326)
	@Override
	boolean method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class463 arg5) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method29842(arg4);
		local2.method29953(this.aClass489_85);
		return arg5.method29280(arg0, arg1, arg2, arg3, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "cv", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V", line = 1333)
	@Override
	public void method20492(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method29842(arg0);
		local2.method29953(this.aClass489_85);
		arg1.method25880(arg2, this.aClass489_81, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "jy", descriptor = "(Lclient!ou;Lclient!ed;Lclient!oj;)V", line = 1333)
	@Override
	public void method20862(@OriginalArg(0) Class470 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class463 arg2) {
		@Pc(2) Class489 local2 = this.aClass489_78;
		local2.method29842(arg0);
		local2.method29953(this.aClass489_85);
		arg1.method25880(arg2, this.aClass489_81, local2, this.aFloat200, this.aFloat202, this.aFloat201, this.aFloat203);
	}

	@OriginalMember(owner = "client!afc", name = "df", descriptor = "()I", line = 1340)
	@Override
	public final int method20413() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kb", descriptor = "()I", line = 1340)
	@Override
	public final int method20707() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kr", descriptor = "()I", line = 1340)
	@Override
	public final int method20708() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kd", descriptor = "()I", line = 1340)
	@Override
	public final int method20610() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "kc", descriptor = "()I", line = 1340)
	@Override
	public final int method20710() {
		return this.anInt2920 - 2;
	}

	@OriginalMember(owner = "client!afc", name = "abl", descriptor = "(Z)V", line = 1344)
	final void method20926(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean466) {
			this.aBoolean466 = arg0;
			this.method21162();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abz", descriptor = "(Z)V", line = 1344)
	final void method20967(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean466) {
			this.aBoolean466 = arg0;
			this.method21162();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "to", descriptor = "(Z)V", line = 1344)
	final void method21046(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean466) {
			this.aBoolean466 = arg0;
			this.method21162();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "abu", descriptor = "(Z)V", line = 1344)
	final void method21170(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean466) {
			this.aBoolean466 = arg0;
			this.method21162();
			this.anInt2959 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ds", descriptor = "(I[Lclient!akf;)V", line = 1352)
	@Override
	public final void method20790(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array19[local1] = arg1[local1];
		}
		this.anInt2934 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "kp", descriptor = "(I[Lclient!akf;)V", line = 1352)
	@Override
	public final void method20713(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub16[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass93_Sub16Array19[local1] = arg1[local1];
		}
		this.anInt2934 = arg0;
	}

	@OriginalMember(owner = "client!afc", name = "ll", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20726(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20918();
			this.method20951();
		}
	}

	@OriginalMember(owner = "client!afc", name = "dc", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20521(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20918();
			this.method20951();
		}
	}

	@OriginalMember(owner = "client!afc", name = "lb", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20727(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20918();
			this.method20951();
		}
	}

	@OriginalMember(owner = "client!afc", name = "le", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20728(@OriginalArg(0) float arg0) {
		if (this.aFloat211 != arg0) {
			this.aFloat211 = arg0;
			this.method20918();
			this.method20951();
		}
	}

	@OriginalMember(owner = "client!afc", name = "di", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20522(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "lh", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20866(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "lr", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20677(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "lq", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20730(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "ls", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20733(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "lo", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20696(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2932 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat212 != local11 || this.aFloat213 != local15) {
			this.anInt2932 = arg0;
			this.aFloat212 = local11;
			this.aFloat213 = local15;
			if (local7) {
				this.aFloat214 = (float) (this.anInt2932 & 0xFF0000) / 1.671168E7F;
				this.aFloat210 = (float) (this.anInt2932 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt2932 & 0xFF) / 255.0F;
				this.method20918();
			}
			this.method20949();
		}
		if (this.aFloatArray64[0] != arg3 || this.aFloatArray64[1] != arg4 || this.aFloatArray64[2] != arg5) {
			this.aFloatArray64[0] = arg3;
			this.aFloatArray64[1] = arg4;
			this.aFloatArray64[2] = arg5;
			this.aFloatArray62[0] = -arg3;
			this.aFloatArray62[1] = -arg4;
			this.aFloatArray62[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray63[0] = arg3 * local140;
			this.aFloatArray63[1] = arg4 * local140;
			this.aFloatArray63[2] = arg5 * local140;
			this.aFloatArray61[0] = -this.aFloatArray63[0];
			this.aFloatArray61[1] = -this.aFloatArray63[1];
			this.aFloatArray61[2] = -this.aFloatArray63[2];
			this.method21236();
			this.anInt2937 = (int) (arg3 * 256.0F / arg4);
			this.anInt2938 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20951();
	}

	@OriginalMember(owner = "client!afc", name = "dk", descriptor = "(I)V", line = 1402)
	@Override
	public final void method20523(@OriginalArg(0) int arg0) {
		this.anInt2936 = 0;
		while (arg0 > 1) {
			this.anInt2936++;
			arg0 >>= 0x1;
		}
		this.anInt2935 = 0x1 << this.anInt2936;
	}

	@OriginalMember(owner = "client!afc", name = "lu", descriptor = "(I)V", line = 1402)
	@Override
	public final void method20418(@OriginalArg(0) int arg0) {
		this.anInt2936 = 0;
		while (arg0 > 1) {
			this.anInt2936++;
			arg0 >>= 0x1;
		}
		this.anInt2935 = 0x1 << this.anInt2936;
	}

	@OriginalMember(owner = "client!afc", name = "acc", descriptor = "()V", line = 1418)
	final void method21041() {
		if (this.method21208()) {
			this.method20953();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "ul", descriptor = "()V", line = 1418)
	final void method21128() {
		if (this.method21208()) {
			this.method20953();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "acx", descriptor = "()V", line = 1418)
	final void method21186() {
		if (this.method21208()) {
			this.method20953();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "acw", descriptor = "()V", line = 1418)
	final void method21188() {
		if (this.method21208()) {
			this.method20953();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "acv", descriptor = "()V", line = 1418)
	final void method21189() {
		if (this.method21208()) {
			this.method20953();
		}
		this.anInt2933 = this.anInt2934;
	}

	@OriginalMember(owner = "client!afc", name = "ui", descriptor = "(IIZ[I)Lclient!lz;", line = 1429)
	final Interface38 method21133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20961(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acj", descriptor = "(IIZ[I)Lclient!lz;", line = 1429)
	final Interface38 method21195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20961(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "aco", descriptor = "(IIZ[I)Lclient!lz;", line = 1429)
	final Interface38 method21196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20961(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "ace", descriptor = "(IIZ[I)Lclient!lz;", line = 1429)
	final Interface38 method21197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20961(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "ua", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;", line = 1433)
	final Interface38 method20956(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20903(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acy", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;", line = 1433)
	final Interface38 method21021(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20903(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acl", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;", line = 1433)
	final Interface38 method21198(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20903(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acf", descriptor = "(Lclient!ck;IIZ[B)Lclient!lz;", line = 1433)
	final Interface38 method21200(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20903(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "uf", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method20920(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acs", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method21099(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "adp", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method21124(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "acn", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method21201(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "adl", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method21202(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "adc", descriptor = "(Lclient!ck;IIZ[F)Lclient!lz;", line = 1437)
	final Interface38 method21204(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20960(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!afc", name = "uv", descriptor = "()I", line = 1449)
	public final int method20965() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "adj", descriptor = "()I", line = 1449)
	public final int method21015() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "adw", descriptor = "()I", line = 1449)
	public final int method21028() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "adv", descriptor = "()I", line = 1449)
	public final int method21215() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "adm", descriptor = "()I", line = 1449)
	public final int method21268() {
		return this.anInt2949;
	}

	@OriginalMember(owner = "client!afc", name = "uw", descriptor = "(I)V", line = 1453)
	public final void method20966(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20979();
		}
	}

	@OriginalMember(owner = "client!afc", name = "adx", descriptor = "(I)V", line = 1453)
	public final void method21024(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20979();
		}
	}

	@OriginalMember(owner = "client!afc", name = "add", descriptor = "(I)V", line = 1453)
	public final void method21060(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20979();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ady", descriptor = "(I)V", line = 1453)
	public final void method21220(@OriginalArg(0) int arg0) {
		if (this.anInt2949 != arg0) {
			this.anInt2949 = arg0;
			this.method20979();
		}
	}

	@OriginalMember(owner = "client!afc", name = "up", descriptor = "(Lclient!mq;)V", line = 1460)
	public final void method21020(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "adu", descriptor = "(Lclient!mq;)V", line = 1460)
	public final void method21221(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "adt", descriptor = "(Lclient!mq;)V", line = 1460)
	public final void method21222(@OriginalArg(0) Interface43 arg0) {
		if (this.anInterface43Array3[this.anInt2949] == arg0) {
			return;
		}
		this.anInterface43Array3[this.anInt2949] = arg0;
		if (arg0 == null) {
			this.anInterface38_23.method11412();
		} else {
			arg0.method11412();
		}
		this.anInt2959 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!afc", name = "uh", descriptor = "(I)V", line = 1471)
	public final void method20919(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21043(Class421.aClass421_1, Class421.aClass421_1);
				break;
			case 1:
				this.method21043(Class421.aClass421_2, Class421.aClass421_2);
				break;
			case 2:
				this.method21043(Class421.aClass421_5, Class421.aClass421_2);
				break;
			case 3:
				this.method21043(Class421.aClass421_3, Class421.aClass421_1);
				break;
			case 4:
				this.method21043(Class421.aClass421_4, Class421.aClass421_4);
		}
	}

	@OriginalMember(owner = "client!afc", name = "aew", descriptor = "(I)V", line = 1471)
	public final void method21224(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method21043(Class421.aClass421_1, Class421.aClass421_1);
				break;
			case 1:
				this.method21043(Class421.aClass421_2, Class421.aClass421_2);
				break;
			case 2:
				this.method21043(Class421.aClass421_5, Class421.aClass421_2);
				break;
			case 3:
				this.method21043(Class421.aClass421_3, Class421.aClass421_1);
				break;
			case 4:
				this.method21043(Class421.aClass421_4, Class421.aClass421_4);
		}
	}

	@OriginalMember(owner = "client!afc", name = "us", descriptor = "(Lclient!mk;Lclient!mk;)V", line = 1491)
	public final void method21043(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21185();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20980();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aeu", descriptor = "(Lclient!mk;Lclient!mk;)V", line = 1491)
	public final void method21225(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21185();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20980();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "aez", descriptor = "(Lclient!mk;Lclient!mk;)V", line = 1491)
	public final void method21226(@OriginalArg(0) Class421 arg0, @OriginalArg(1) Class421 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass421Array5[this.anInt2949] != arg0) {
			this.aClass421Array5[this.anInt2949] = arg0;
			this.method21185();
			local1 = true;
		}
		if (this.aClass421Array6[this.anInt2949] != arg1) {
			this.aClass421Array6[this.anInt2949] = arg1;
			this.method20980();
			local1 = true;
		}
		if (local1) {
			this.anInt2959 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!afc", name = "ux", descriptor = "(ILclient!mn;)V", line = 1508)
	public final void method20969(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20959(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afc", name = "aeh", descriptor = "(ILclient!mn;)V", line = 1508)
	public final void method21000(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20959(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!afc", name = "uu", descriptor = "(ILclient!mn;)V", line = 1514)
	public final void method20970(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20971(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afc", name = "aet", descriptor = "(ILclient!mn;)V", line = 1514)
	public final void method21228(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1) {
		this.method20971(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!afc", name = "un", descriptor = "(I)V", line = 1520)
	public void method20972(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2945) {
			this.anInt2945 = arg0;
			this.method20977();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aey", descriptor = "()Lclient!pq;", line = 1527)
	final Class489 method20912() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "ue", descriptor = "()Lclient!pq;", line = 1527)
	final Class489 method20973() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "aeb", descriptor = "()Lclient!pq;", line = 1527)
	final Class489 method21018() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "aev", descriptor = "()Lclient!pq;", line = 1527)
	final Class489 method21230() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "aex", descriptor = "()Lclient!pq;", line = 1527)
	final Class489 method21232() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "vq", descriptor = "()Lclient!pq;", line = 1531)
	public final Class489 method20974() {
		return this.aClass489Array5[this.anInt2949];
	}

	@OriginalMember(owner = "client!afc", name = "vx", descriptor = "(Lclient!mv;)V", line = 1535)
	public final void method21103(@OriginalArg(0) Class425 arg0) {
		this.aClass425Array3[this.anInt2949] = arg0;
		this.method21199();
	}

	@OriginalMember(owner = "client!afc", name = "vb", descriptor = "()V", line = 1540)
	final void method20976() {
		if (this.aClass425Array3[this.anInt2949] != Class425.aClass425_3) {
			this.aClass425Array3[this.anInt2949] = Class425.aClass425_3;
			this.aClass489Array5[this.anInt2949].method29836();
			this.method21199();
		}
	}

	@OriginalMember(owner = "client!afc", name = "aec", descriptor = "()V", line = 1540)
	final void method21233() {
		if (this.aClass425Array3[this.anInt2949] != Class425.aClass425_3) {
			this.aClass425Array3[this.anInt2949] = Class425.aClass425_3;
			this.aClass489Array5[this.anInt2949].method29836();
			this.method21199();
		}
	}

	@OriginalMember(owner = "client!afc", name = "vl", descriptor = "()V", line = 1548)
	final void method21199() {
		this.method20978();
	}

	@OriginalMember(owner = "client!afc", name = "aeo", descriptor = "()V", line = 1548)
	final void method21234() {
		this.method20978();
	}

	@OriginalMember(owner = "client!afc", name = "vu", descriptor = "()Lclient!dy;", line = 1558)
	Class237 method20981() {
		return this.aClass237_6;
	}

	@OriginalMember(owner = "client!afc", name = "afy", descriptor = "()Lclient!dy;", line = 1558)
	Class237 method21245() {
		return this.aClass237_6;
	}

	@OriginalMember(owner = "client!afc", name = "ei", descriptor = "(ILclient!dy;)V", line = 1562)
	@Override
	public final void method20544(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!afc", name = "oh", descriptor = "(ILclient!dy;)V", line = 1562)
	@Override
	public final void method20798(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!afc", name = "oo", descriptor = "(ILclient!dy;)V", line = 1562)
	@Override
	public final void method20525(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!afc", name = "nm", descriptor = "(ILclient!dy;)V", line = 1568)
	@Override
	public final void method20609(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean472) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean476) {
			this.aClass128Array3[3].method21346();
			this.aClass128Array3[3].method21347();
		}
	}

	@OriginalMember(owner = "client!afc", name = "el", descriptor = "(ILclient!dy;)V", line = 1568)
	@Override
	public final void method20545(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean472) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean476) {
			this.aClass128Array3[3].method21346();
			this.aClass128Array3[3].method21347();
		}
	}

	@OriginalMember(owner = "client!afc", name = "nd", descriptor = "(ILclient!dy;)V", line = 1568)
	@Override
	public final void method20771(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean472) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean476) {
			this.aClass128Array3[3].method21346();
			this.aClass128Array3[3].method21347();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ne", descriptor = "(ILclient!dy;)V", line = 1568)
	@Override
	public final void method20605(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean472) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean476) {
			this.aClass128Array3[3].method21346();
			this.aClass128Array3[3].method21347();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ny", descriptor = "(ILclient!dy;)V", line = 1568)
	@Override
	public final void method20722(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1) {
		if (!this.aBoolean472) {
			throw new RuntimeException("");
		}
		this.anInt2946 = arg0;
		this.aClass237_6 = arg1;
		if (this.aBoolean476) {
			this.aClass128Array3[3].method21346();
			this.aClass128Array3[3].method21347();
		}
	}

	@OriginalMember(owner = "client!afc", name = "ej", descriptor = "()V", line = 1578)
	@Override
	public final void method20546() {
		this.aBoolean472 = false;
	}

	@OriginalMember(owner = "client!afc", name = "nj", descriptor = "()V", line = 1578)
	@Override
	public final void method20453() {
		this.aBoolean472 = false;
	}

	@OriginalMember(owner = "client!afc", name = "no", descriptor = "()V", line = 1578)
	@Override
	public final void method20776() {
		this.aBoolean472 = false;
	}

	@OriginalMember(owner = "client!afc", name = "vi", descriptor = "(I)V", line = 1582)
	final void method20982(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean461) {
			this.aBoolean461 = local10;
			this.method20986();
		}
		if (local12 != this.aBoolean480) {
			this.aBoolean480 = local12;
			this.method21104();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20987();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "afi", descriptor = "(I)V", line = 1582)
	final void method21083(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean461) {
			this.aBoolean461 = local10;
			this.method20986();
		}
		if (local12 != this.aBoolean480) {
			this.aBoolean480 = local12;
			this.method21104();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20987();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "afk", descriptor = "(I)V", line = 1582)
	final void method21247(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean461) {
			this.aBoolean461 = local10;
			this.method20986();
		}
		if (local12 != this.aBoolean480) {
			this.aBoolean480 = local12;
			this.method21104();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20987();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "afo", descriptor = "(I)V", line = 1582)
	final void method21248(@OriginalArg(0) int arg0) {
		if (this.anInt2922 == arg0) {
			return;
		}
		@Pc(8) Class415 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class415.aClass415_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class415.aClass415_6;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class415.aClass415_5;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class415.aClass415_4;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class415.aClass415_4;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean461) {
			this.aBoolean461 = local10;
			this.method20986();
		}
		if (local12 != this.aBoolean480) {
			this.aBoolean480 = local12;
			this.method21104();
		}
		if (local8 != this.aClass415_3) {
			this.aClass415_3 = local8;
			this.method20987();
		}
		this.anInt2922 = arg0;
		this.anInt2959 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!afc", name = "va", descriptor = "(I)V", line = 1629)
	final void method20983(@OriginalArg(0) int arg0) {
		if (this.anInt2948 != arg0) {
			this.anInt2948 = arg0;
			this.method20987();
		}
	}

	@OriginalMember(owner = "client!afc", name = "vs", descriptor = "(B)V", line = 1636)
	final void method20984(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method20983(0);
			this.method20982(1);
		} else {
			this.method20983(3);
			this.method20982(3);
		}
		this.method20986();
	}

	@OriginalMember(owner = "client!afc", name = "afz", descriptor = "(B)V", line = 1636)
	final void method21137(@OriginalArg(0) byte arg0) {
		if (this.aByte76 == arg0) {
			return;
		}
		this.aByte76 = arg0;
		if (arg0 == 0) {
			this.method20983(0);
			this.method20982(1);
		} else {
			this.method20983(3);
			this.method20982(3);
		}
		this.method20986();
	}

	@OriginalMember(owner = "client!afc", name = "vp", descriptor = "(Z)V", line = 1656)
	final void method20989(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean477) {
			this.aBoolean477 = arg0;
			this.method20906();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "afs", descriptor = "(Z)V", line = 1656)
	final void method21260(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean477) {
			this.aBoolean477 = arg0;
			this.method20906();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "afx", descriptor = "(Z)V", line = 1656)
	final void method21261(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean477) {
			this.aBoolean477 = arg0;
			this.method20906();
			this.anInt2959 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!afc", name = "dn", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2957 == arg0 && this.anInt2947 == arg1 && this.anInt2956 == arg2) {
			return;
		}
		this.anInt2957 = arg0;
		this.anInt2947 = arg1;
		this.anInt2956 = arg2;
		this.method21016();
		this.method20906();
	}

	@OriginalMember(owner = "client!afc", name = "ly", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2957 == arg0 && this.anInt2947 == arg1 && this.anInt2956 == arg2) {
			return;
		}
		this.anInt2957 = arg0;
		this.anInt2947 = arg1;
		this.anInt2956 = arg2;
		this.method21016();
		this.method20906();
	}

	@OriginalMember(owner = "client!afc", name = "vd", descriptor = "()V", line = 1674)
	final void method21016() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21347();
		}
		this.method21051();
	}

	@OriginalMember(owner = "client!afc", name = "aff", descriptor = "()V", line = 1674)
	final void method21262() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21347();
		}
		this.method21051();
	}

	@OriginalMember(owner = "client!afc", name = "afv", descriptor = "()V", line = 1674)
	final void method21263() {
		if (this.aClass128_3 != null) {
			this.aClass128_3.method21347();
		}
		this.method21051();
	}

	@OriginalMember(owner = "client!afc", name = "jq", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20681(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "cs", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20505(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "jv", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20682(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "jj", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20684(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "jt", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20680(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "ja", descriptor = "(ILclient!ch;II)V", line = 1689)
	@Override
	public final void method20595(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20518(false);
		this.aClass100_Sub1_6.method18184(0.0F, 0.0F, (float) this.method20434().method23736(), 0.0F, 0.0F, (float) this.method20434().method23737(), 0, arg1, arg2, arg3);
		this.method20518(true);
	}

	@OriginalMember(owner = "client!afc", name = "bv", descriptor = "(IIIIII)V", line = 1695)
	@Override
	public final void method20653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(false);
		}
		if (this.aBoolean463) {
			this.method20518(false);
			this.aClass100_Sub1_5.method18176(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20518(true);
		} else {
			this.aClass100_Sub1_5.method18176(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "ix", descriptor = "(IIIIII)V", line = 1695)
	@Override
	public final void method20676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(false);
		}
		if (this.aBoolean463) {
			this.method20518(false);
			this.aClass100_Sub1_5.method18176(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20518(true);
		} else {
			this.aClass100_Sub1_5.method18176(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "bz", descriptor = "(IIIIII)V", line = 1706)
	@Override
	public final void method20478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class104_Sub2_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(false);
		}
		this.method20484(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20484(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20484(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20484(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "it", descriptor = "(IIIIII)V", line = 1706)
	@Override
	public final void method20650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class104_Sub2_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(false);
		}
		this.method20484(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20484(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20484(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20484(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean479 && this.anInt2951 != 0) {
			this.method21223(true);
		}
	}

	@OriginalMember(owner = "client!afc", name = "br", descriptor = "(IIFIIFIIFIIII)V", line = 1718)
	@Override
	public final void method20851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afc", name = "np", descriptor = "(IIFIIFIIFIIII)V", line = 1718)
	@Override
	public final void method20777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!afc", name = "iw", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "is", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "il", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "ib", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "bg", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!afc", name = "ip", descriptor = "(IIIII)V", line = 1722)
	@Override
	final void method20656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "id", descriptor = "(IIIII)V", line = 1722)
	@Override
	final void method20657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "ba", descriptor = "(IIIII)V", line = 1722)
	@Override
	final void method20732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "ia", descriptor = "(IIIII)V", line = 1726)
	@Override
	final void method20803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "bp", descriptor = "(IIIII)V", line = 1726)
	@Override
	final void method20438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "if", descriptor = "(IIIII)V", line = 1726)
	@Override
	final void method20547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20484(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!afc", name = "bj", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20488(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "iy", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20488(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "ii", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20488(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "ih", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20488(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "iz", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20488(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!afc", name = "nr", descriptor = "(IIIIIIIII)V", line = 1734)
	@Override
	public void method20617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20909();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21345();
		local50.method21361(arg4);
		this.method20982(arg5);
		local50.method21349();
		this.method21223(false);
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
			if (!this.method20905(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21002();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21223(true);
		local50.method21344();
	}

	@OriginalMember(owner = "client!afc", name = "nu", descriptor = "(IIIIIIIII)V", line = 1734)
	@Override
	public void method20489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20909();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21345();
		local50.method21361(arg4);
		this.method20982(arg5);
		local50.method21349();
		this.method21223(false);
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
			if (!this.method20905(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21002();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21223(true);
		local50.method21344();
	}

	@OriginalMember(owner = "client!afc", name = "cl", descriptor = "(IIIIIIIII)V", line = 1734)
	@Override
	public void method20486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20909();
		@Pc(50) Class128 local50 = this.aClass128Array3[13];
		local50.method21345();
		local50.method21361(arg4);
		this.method20982(arg5);
		local50.method21349();
		this.method21223(false);
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
			if (!this.method20905(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method21002();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method21223(true);
		local50.method21344();
	}

	@OriginalMember(owner = "client!afc", name = "cg", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1798)
	@Override
	public void method20836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "ic", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1798)
	@Override
	public void method20666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "jd", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1798)
	@Override
	public void method20667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!afc", name = "bs", descriptor = "(IIIIIILclient!ch;II)V", line = 1799)
	@Override
	public final void method20482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "im", descriptor = "(IIIIIILclient!ch;II)V", line = 1799)
	@Override
	public final void method20665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "ik", descriptor = "(IIIIIILclient!ch;II)V", line = 1799)
	@Override
	public final void method20689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!afc", name = "nz", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18172((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "ce", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18172((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "nf", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18172((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "ns", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass100_Sub1_5.method18172((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!afc", name = "dt", descriptor = "(Lclient!dm;)V", line = 1821)
	@Override
	public final void method20497(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28349(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "km", descriptor = "(Lclient!dm;)V", line = 1821)
	@Override
	public final void method20714(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28349(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "ky", descriptor = "(Lclient!dm;)V", line = 1821)
	@Override
	public final void method20715(@OriginalArg(0) Class229 arg0) {
		this.aClass395_3.method28349(this, arg0);
	}

	@OriginalMember(owner = "client!afc", name = "wo", descriptor = "()V", line = 1825)
	final void method21002() {
		this.method21048(0, this.anInterface37_16);
		this.method21106(this.aClass145_18);
		this.method21005(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "agf", descriptor = "()V", line = 1825)
	final void method21276() {
		this.method21048(0, this.anInterface37_16);
		this.method21106(this.aClass145_18);
		this.method21005(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "agd", descriptor = "()V", line = 1825)
	final void method21277() {
		this.method21048(0, this.anInterface37_16);
		this.method21106(this.aClass145_18);
		this.method21005(Class424.aClass424_6, 0, 1);
	}

	@OriginalMember(owner = "client!afc", name = "agb", descriptor = "()V", line = 1831)
	public final void method20948() {
		this.method21004(Class424.aClass424_4, 2);
	}

	@OriginalMember(owner = "client!afc", name = "wu", descriptor = "()V", line = 1831)
	public final void method21003() {
		this.method21004(Class424.aClass424_4, 2);
	}

	@OriginalMember(owner = "client!afc", name = "wk", descriptor = "(Lclient!ms;I)V", line = 1835)
	final void method21004(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21048(0, this.anInterface37_17);
		this.method21106(this.aClass145_17);
		this.method21005(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agw", descriptor = "(Lclient!ms;I)V", line = 1835)
	final void method21278(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21048(0, this.anInterface37_17);
		this.method21106(this.aClass145_17);
		this.method21005(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agn", descriptor = "(Lclient!ms;I)V", line = 1835)
	final void method21279(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21048(0, this.anInterface37_17);
		this.method21106(this.aClass145_17);
		this.method21005(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agu", descriptor = "(Lclient!ms;I)V", line = 1835)
	final void method21280(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21048(0, this.anInterface37_17);
		this.method21106(this.aClass145_17);
		this.method21005(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "ags", descriptor = "(Lclient!ms;I)V", line = 1835)
	final void method21281(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1) {
		this.method21048(0, this.anInterface37_17);
		this.method21106(this.aClass145_17);
		this.method21005(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!afc", name = "agc", descriptor = "()V", line = 1845)
	public final void method20957() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20909();
		this.method20989(false);
		this.method21046(false);
		this.method20943(false);
		this.method21290(false);
		this.method20982(1);
		this.method20984((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "wr", descriptor = "()V", line = 1845)
	public final void method21008() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20909();
		this.method20989(false);
		this.method21046(false);
		this.method20943(false);
		this.method21290(false);
		this.method20982(1);
		this.method20984((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "agl", descriptor = "()V", line = 1845)
	public final void method21287() {
		if (this.anInt2959 == 2) {
			return;
		}
		this.method20909();
		this.method20989(false);
		this.method21046(false);
		this.method20943(false);
		this.method21290(false);
		this.method20982(1);
		this.method20984((byte) 0);
		this.anInt2959 = 2;
	}

	@OriginalMember(owner = "client!afc", name = "wl", descriptor = "()V", line = 1858)
	final void method20950() {
		if (this.anInt2959 == 8) {
			return;
		}
		this.method20938();
		this.method20989(true);
		this.method20943(true);
		this.method21290(true);
		this.method20982(1);
		this.method20984((byte) 0);
		this.anInt2959 = 8;
	}

	@OriginalMember(owner = "client!afc", name = "ago", descriptor = "()V", line = 1858)
	final void method21042() {
		if (this.anInt2959 == 8) {
			return;
		}
		this.method20938();
		this.method20989(true);
		this.method20943(true);
		this.method21290(true);
		this.method20982(1);
		this.method20984((byte) 0);
		this.anInt2959 = 8;
	}

	@OriginalMember(owner = "client!afc", name = "wv", descriptor = "(CCCC)I", line = 1872)
	static int method21010(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "ahw", descriptor = "(CCCC)I", line = 1872)
	static int method21120(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "ahj", descriptor = "(CCCC)I", line = 1872)
	static int method21292(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!afc", name = "sr", descriptor = "()F")
	public abstract float method20882();

	@OriginalMember(owner = "client!afc", name = "sb", descriptor = "()V")
	abstract void method20883();

	@OriginalMember(owner = "client!afc", name = "rx", descriptor = "()Z")
	public abstract boolean method20885();

	@OriginalMember(owner = "client!afc", name = "ry", descriptor = "()Z")
	public abstract boolean method20886();

	@OriginalMember(owner = "client!afc", name = "rg", descriptor = "(Z)Z")
	public abstract boolean method20887(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "zc", descriptor = "()V")
	abstract void method20890();

	@OriginalMember(owner = "client!afc", name = "rc", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method20892(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "zp", descriptor = "()V")
	abstract void method20894();

	@OriginalMember(owner = "client!afc", name = "rn", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method20895(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "ug", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method20903(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "vz", descriptor = "()V")
	abstract void method20906();

	@OriginalMember(owner = "client!afc", name = "g", descriptor = "()Ljava/lang/String;")
	public abstract String method20431();

	@OriginalMember(owner = "client!afc", name = "tq", descriptor = "()V")
	abstract void method20918();

	@OriginalMember(owner = "client!afc", name = "zz", descriptor = "()V")
	abstract void method20923();

	@OriginalMember(owner = "client!afc", name = "sa", descriptor = "()V")
	abstract void method20925();

	@OriginalMember(owner = "client!afc", name = "sj", descriptor = "()V")
	abstract void method20927();

	@OriginalMember(owner = "client!afc", name = "ti", descriptor = "(Lclient!pq;)V")
	public abstract void method20934(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "wy", descriptor = "(Z)Z")
	public abstract boolean method20940(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "agq", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method20942(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "tp", descriptor = "()V")
	abstract void method20944();

	@OriginalMember(owner = "client!afc", name = "tv", descriptor = "()V")
	abstract void method20945();

	@OriginalMember(owner = "client!afc", name = "afq", descriptor = "()V")
	abstract void method20946();

	@OriginalMember(owner = "client!afc", name = "ahr", descriptor = "(I)V")
	abstract void method20947(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "tx", descriptor = "()V")
	abstract void method20949();

	@OriginalMember(owner = "client!afc", name = "tl", descriptor = "()V")
	abstract void method20951();

	@OriginalMember(owner = "client!afc", name = "td", descriptor = "()V")
	abstract void method20952();

	@OriginalMember(owner = "client!afc", name = "um", descriptor = "()V")
	abstract void method20953();

	@OriginalMember(owner = "client!afc", name = "uq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method20954(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "uz", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method20958(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "ur", descriptor = "(ILclient!mn;ZZ)V")
	abstract void method20959(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afc", name = "ub", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method20960(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "uj", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method20961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "ut", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method20962(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "abx", descriptor = "()V")
	abstract void method20964();

	@OriginalMember(owner = "client!afc", name = "acg", descriptor = "()V")
	abstract void method20968();

	@OriginalMember(owner = "client!afc", name = "uo", descriptor = "(ILclient!mn;Z)V")
	abstract void method20971(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "aep", descriptor = "()V")
	abstract void method20975();

	@OriginalMember(owner = "client!afc", name = "vr", descriptor = "()V")
	abstract void method20977();

	@OriginalMember(owner = "client!afc", name = "vo", descriptor = "()V")
	abstract void method20978();

	@OriginalMember(owner = "client!afc", name = "vv", descriptor = "()V")
	abstract void method20979();

	@OriginalMember(owner = "client!afc", name = "vt", descriptor = "()V")
	abstract void method20980();

	@OriginalMember(owner = "client!afc", name = "vy", descriptor = "(I)V")
	abstract void method20985(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "ve", descriptor = "()V")
	abstract void method20986();

	@OriginalMember(owner = "client!afc", name = "vm", descriptor = "()V")
	abstract void method20987();

	@OriginalMember(owner = "client!afc", name = "adq", descriptor = "()V")
	public abstract void method20988();

	@OriginalMember(owner = "client!afc", name = "ael", descriptor = "()V")
	abstract void method20990();

	@OriginalMember(owner = "client!afc", name = "afl", descriptor = "()V")
	abstract void method20992();

	@OriginalMember(owner = "client!afc", name = "vf", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method20993(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "vc", descriptor = "(Z)Lclient!ml;")
	abstract Interface40 method20995(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "afn", descriptor = "(Z)V")
	abstract void method20996(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "agp", descriptor = "(Lclient!ms;II)V")
	public abstract void method20998(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "afa", descriptor = "()V")
	abstract void method21001();

	@OriginalMember(owner = "client!afc", name = "wz", descriptor = "(Lclient!ms;II)V")
	public abstract void method21005(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "wj", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	abstract void method21006(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "we", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21007(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "wp", descriptor = "(I)V")
	abstract void method21009(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "xm", descriptor = "(Z)Z")
	public abstract boolean method21011(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "vn", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21013(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "uy", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21017(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "fb", descriptor = "()Ljava/lang/String;")
	public abstract String method20865();

	@OriginalMember(owner = "client!afc", name = "fo", descriptor = "()Ljava/lang/String;")
	public abstract String method20584();

	@OriginalMember(owner = "client!afc", name = "fy", descriptor = "()Ljava/lang/String;")
	public abstract String method20769();

	@OriginalMember(owner = "client!afc", name = "ud", descriptor = "()V")
	public abstract void method21019();

	@OriginalMember(owner = "client!afc", name = "adf", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21023(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "adb", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method21025(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "agv", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21029(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "wa", descriptor = "(Lclient!ml;)V")
	abstract void method21030(@OriginalArg(0) Interface40 arg0);

	@OriginalMember(owner = "client!afc", name = "afw", descriptor = "()V")
	abstract void method21031();

	@OriginalMember(owner = "client!afc", name = "afh", descriptor = "()V")
	abstract void method21036();

	@OriginalMember(owner = "client!afc", name = "xl", descriptor = "(Z)Z")
	public abstract boolean method21038(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "xi", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method21039(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "ahk", descriptor = "(I)V")
	abstract void method21045(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "wt", descriptor = "()Z")
	public abstract boolean method21047();

	@OriginalMember(owner = "client!afc", name = "wn", descriptor = "(ILclient!lr;)V")
	public abstract void method21048(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "xs", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21050(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "vh", descriptor = "()V")
	abstract void method21051();

	@OriginalMember(owner = "client!afc", name = "aef", descriptor = "()V")
	abstract void method21054();

	@OriginalMember(owner = "client!afc", name = "adk", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21055(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "zl", descriptor = "()V")
	abstract void method21056();

	@OriginalMember(owner = "client!afc", name = "wx", descriptor = "()Z")
	public abstract boolean method21061();

	@OriginalMember(owner = "client!afc", name = "wh", descriptor = "()Z")
	public abstract boolean method21062();

	@OriginalMember(owner = "client!afc", name = "wd", descriptor = "()Z")
	public abstract boolean method21063();

	@OriginalMember(owner = "client!afc", name = "ww", descriptor = "()Z")
	public abstract boolean method21064();

	@OriginalMember(owner = "client!afc", name = "wi", descriptor = "(Z)Z")
	public abstract boolean method21065(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "ads", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "xy", descriptor = "(Z)Z")
	public abstract boolean method21067(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!ho;")
	public abstract Class115 method21072(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!afc", name = "acb", descriptor = "()V")
	abstract void method21075();

	@OriginalMember(owner = "client!afc", name = "xr", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21076(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "xc", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21077(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "adr", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	abstract Interface35 method21078(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afc", name = "xe", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21079(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "fl", descriptor = "()Ljava/lang/String;")
	public abstract String method20582();

	@OriginalMember(owner = "client!afc", name = "yx", descriptor = "()F")
	public abstract float method21097();

	@OriginalMember(owner = "client!afc", name = "vg", descriptor = "()V")
	abstract void method21104();

	@OriginalMember(owner = "client!afc", name = "vk", descriptor = "(Lclient!lo;)V")
	public abstract void method21106(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "aba", descriptor = "()V")
	abstract void method21109();

	@OriginalMember(owner = "client!afc", name = "afj", descriptor = "(Z)V")
	abstract void method21110(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "zu", descriptor = "()V")
	abstract void method21121();

	@OriginalMember(owner = "client!afc", name = "ze", descriptor = "()V")
	abstract void method21122();

	@OriginalMember(owner = "client!afc", name = "zv", descriptor = "()V")
	abstract void method21123();

	@OriginalMember(owner = "client!afc", name = "aca", descriptor = "()V")
	abstract void method21125();

	@OriginalMember(owner = "client!afc", name = "uk", descriptor = "(Lclient!ck;IIIZ[B)Lclient!ll;")
	abstract Interface35 method21126(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!afc", name = "aai", descriptor = "(Lclient!pq;)V")
	public abstract void method21143(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "aap", descriptor = "(Lclient!pq;)V")
	public abstract void method21144(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!afc", name = "aeg", descriptor = "()V")
	abstract void method21152();

	@OriginalMember(owner = "client!afc", name = "zs", descriptor = "()V")
	abstract void method21160();

	@OriginalMember(owner = "client!afc", name = "tg", descriptor = "()V")
	abstract void method21162();

	@OriginalMember(owner = "client!afc", name = "abg", descriptor = "()V")
	abstract void method21165();

	@OriginalMember(owner = "client!afc", name = "abn", descriptor = "()V")
	abstract void method21166();

	@OriginalMember(owner = "client!afc", name = "abj", descriptor = "()V")
	abstract void method21167();

	@OriginalMember(owner = "client!afc", name = "ws", descriptor = "()Z")
	public abstract boolean method21168();

	@OriginalMember(owner = "client!afc", name = "aer", descriptor = "(ILclient!mn;Z)V")
	abstract void method21169(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "abp", descriptor = "()V")
	abstract void method21171();

	@OriginalMember(owner = "client!afc", name = "abm", descriptor = "()V")
	abstract void method21172();

	@OriginalMember(owner = "client!afc", name = "abk", descriptor = "()V")
	abstract void method21174();

	@OriginalMember(owner = "client!afc", name = "aby", descriptor = "()V")
	abstract void method21175();

	@OriginalMember(owner = "client!afc", name = "abd", descriptor = "()V")
	abstract void method21176();

	@OriginalMember(owner = "client!afc", name = "abt", descriptor = "()V")
	abstract void method21177();

	@OriginalMember(owner = "client!afc", name = "abs", descriptor = "()V")
	abstract void method21178();

	@OriginalMember(owner = "client!afc", name = "acd", descriptor = "()V")
	abstract void method21179();

	@OriginalMember(owner = "client!afc", name = "ack", descriptor = "()V")
	abstract void method21180();

	@OriginalMember(owner = "client!afc", name = "acm", descriptor = "()V")
	abstract void method21181();

	@OriginalMember(owner = "client!afc", name = "act", descriptor = "()V")
	abstract void method21182();

	@OriginalMember(owner = "client!afc", name = "aci", descriptor = "()V")
	abstract void method21183();

	@OriginalMember(owner = "client!afc", name = "ach", descriptor = "()V")
	abstract void method21184();

	@OriginalMember(owner = "client!afc", name = "vw", descriptor = "()V")
	abstract void method21185();

	@OriginalMember(owner = "client!afc", name = "ahv", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method21187(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "acu", descriptor = "()V")
	abstract void method21190();

	@OriginalMember(owner = "client!afc", name = "acz", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21191(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "acp", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21192(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "acq", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21193(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "xb", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public abstract void method21194(@OriginalArg(0) Class489 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) Class489 arg2);

	@OriginalMember(owner = "client!afc", name = "agm", descriptor = "(Lclient!ml;)V")
	abstract void method21203(@OriginalArg(0) Interface40 arg0);

	@OriginalMember(owner = "client!afc", name = "ada", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method21205(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "adh", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!lz;")
	abstract Interface38 method21206(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "abe", descriptor = "()V")
	abstract void method21207();

	@OriginalMember(owner = "client!afc", name = "adz", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "adn", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21211(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "ado", descriptor = "(IZ[[I)Lclient!mr;")
	abstract Interface44 method21213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!afc", name = "ade", descriptor = "(Lclient!ck;Lclient!dg;II)Lclient!mo;")
	abstract Interface42 method21214(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!afc", name = "uc", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21218(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "vj", descriptor = "(Z)V")
	abstract void method21223(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "aen", descriptor = "(ILclient!mn;ZZ)V")
	abstract void method21227(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!afc", name = "aes", descriptor = "(ILclient!mn;Z)V")
	abstract void method21229(@OriginalArg(0) int arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!afc", name = "aeq", descriptor = "()V")
	abstract void method21235();

	@OriginalMember(owner = "client!afc", name = "tk", descriptor = "()V")
	abstract void method21236();

	@OriginalMember(owner = "client!afc", name = "aei", descriptor = "()V")
	abstract void method21237();

	@OriginalMember(owner = "client!afc", name = "aej", descriptor = "()V")
	abstract void method21238();

	@OriginalMember(owner = "client!afc", name = "aea", descriptor = "()V")
	abstract void method21239();

	@OriginalMember(owner = "client!afc", name = "aed", descriptor = "()V")
	abstract void method21240();

	@OriginalMember(owner = "client!afc", name = "aee", descriptor = "()V")
	abstract void method21241();

	@OriginalMember(owner = "client!afc", name = "aek", descriptor = "()V")
	abstract void method21242();

	@OriginalMember(owner = "client!afc", name = "aem", descriptor = "()V")
	abstract void method21243();

	@OriginalMember(owner = "client!afc", name = "adi", descriptor = "(Lclient!ck;IIZ[BII)Lclient!lz;")
	abstract Interface38 method21244(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "adg", descriptor = "(IIZ[III)Lclient!lz;")
	abstract Interface38 method21246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "afe", descriptor = "()V")
	abstract void method21249();

	@OriginalMember(owner = "client!afc", name = "afm", descriptor = "()V")
	abstract void method21250();

	@OriginalMember(owner = "client!afc", name = "afg", descriptor = "()V")
	abstract void method21251();

	@OriginalMember(owner = "client!afc", name = "afc", descriptor = "()V")
	abstract void method21253();

	@OriginalMember(owner = "client!afc", name = "afb", descriptor = "()V")
	abstract void method21254();

	@OriginalMember(owner = "client!afc", name = "afr", descriptor = "()V")
	abstract void method21255();

	@OriginalMember(owner = "client!afc", name = "zb", descriptor = "()V")
	abstract void method21256();

	@OriginalMember(owner = "client!afc", name = "afd", descriptor = "()V")
	abstract void method21258();

	@OriginalMember(owner = "client!afc", name = "acr", descriptor = "(Lclient!ck;Lclient!dg;)Z")
	abstract boolean method21259(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class226 arg1);

	@OriginalMember(owner = "client!afc", name = "afu", descriptor = "()V")
	abstract void method21264();

	@OriginalMember(owner = "client!afc", name = "aft", descriptor = "()V")
	abstract void method21265();

	@OriginalMember(owner = "client!afc", name = "afp", descriptor = "(Z)Lclient!ml;")
	abstract Interface40 method21267(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "aga", descriptor = "(Z)Lclient!lr;")
	abstract Interface37 method21269(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!afc", name = "agi", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method21270(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "agg", descriptor = "([Lclient!lk;)Lclient!lo;")
	abstract Class145 method21271(@OriginalArg(0) Class400[] arg0);

	@OriginalMember(owner = "client!afc", name = "agx", descriptor = "(Lclient!lo;)V")
	public abstract void method21272(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "agj", descriptor = "(Lclient!lo;)V")
	public abstract void method21273(@OriginalArg(0) Class145 arg0);

	@OriginalMember(owner = "client!afc", name = "age", descriptor = "(ILclient!lr;)V")
	public abstract void method21274(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "agk", descriptor = "(ILclient!lr;)V")
	public abstract void method21275(@OriginalArg(0) int arg0, @OriginalArg(1) Interface37 arg1);

	@OriginalMember(owner = "client!afc", name = "agz", descriptor = "(Lclient!ms;II)V")
	public abstract void method21282(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!afc", name = "agh", descriptor = "(Lclient!ml;Lclient!ms;IIII)V")
	abstract void method21283(@OriginalArg(0) Interface40 arg0, @OriginalArg(1) Class424 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!afc", name = "ahm", descriptor = "(I)V")
	abstract void method21284(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "agr", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21285(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "agt", descriptor = "(Lclient!ms;IIII)V")
	public abstract void method21286(@OriginalArg(0) Class424 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!afc", name = "agy", descriptor = "(I)V")
	abstract void method21289(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "ahc", descriptor = "(I)V")
	abstract void method21291(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!afc", name = "ahl", descriptor = "()V")
	abstract void method21293();

	@OriginalMember(owner = "client!afc", name = "ahf", descriptor = "(Lclient!ck;IIZ[FII)Lclient!lz;")
	abstract Interface38 method21294(@OriginalArg(0) Class206 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!afc", name = "ahq", descriptor = "(I)V")
	abstract void method21297(@OriginalArg(0) int arg0);
}
