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

@OriginalClass("client!aed")
public abstract class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!aed", name = "ac", descriptor = "I")
	static final int anInt2799 = 128;

	@OriginalMember(owner = "client!aed", name = "av", descriptor = "I")
	static final int anInt2800 = 1;

	@OriginalMember(owner = "client!aed", name = "ah", descriptor = "I")
	static final int anInt2801 = 8;

	@OriginalMember(owner = "client!aed", name = "as", descriptor = "I")
	static final int anInt2802 = 16;

	@OriginalMember(owner = "client!aed", name = "aq", descriptor = "I")
	static final int anInt2803 = 55;

	@OriginalMember(owner = "client!aed", name = "am", descriptor = "I")
	static final int anInt2804 = 7;

	@OriginalMember(owner = "client!aed", name = "ay", descriptor = "I")
	protected static final int anInt2805 = 100663296;

	@OriginalMember(owner = "client!aed", name = "az", descriptor = "I")
	static final int anInt2807 = 4194304;

	@OriginalMember(owner = "client!aed", name = "fm", descriptor = "I")
	static final int anInt2808 = 1;

	@OriginalMember(owner = "client!aed", name = "ae", descriptor = "I")
	static final int anInt2812 = 4;

	@OriginalMember(owner = "client!aed", name = "at", descriptor = "I")
	static final int anInt2818 = 2;

	@OriginalMember(owner = "client!aed", name = "fk", descriptor = "I")
	static final int anInt2835 = 2;

	@OriginalMember(owner = "client!aed", name = "fe", descriptor = "I")
	static final int anInt2836 = 3;

	@OriginalMember(owner = "client!aed", name = "fw", descriptor = "I")
	static final int anInt2837 = 4;

	@OriginalMember(owner = "client!aed", name = "ar", descriptor = "Ljava/lang/Object;")
	static final Object anObject7 = new Object();

	@OriginalMember(owner = "client!aed", name = "bf", descriptor = "Lclient!oi;")
	static final Class442 aClass442_90 = new Class442();

	@OriginalMember(owner = "client!aed", name = "ef", descriptor = "[Lclient!lv;")
	protected Class388[] aClass388Array5;

	@OriginalMember(owner = "client!aed", name = "an", descriptor = "Z")
	protected boolean aBoolean434;

	@OriginalMember(owner = "client!aed", name = "ej", descriptor = "I")
	protected int anInt2806;

	@OriginalMember(owner = "client!aed", name = "bj", descriptor = "Lclient!kf;")
	Class361 aClass361_5;

	@OriginalMember(owner = "client!aed", name = "bv", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!aed", name = "bl", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!aed", name = "bb", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!aed", name = "bd", descriptor = "I")
	protected int anInt2811;

	@OriginalMember(owner = "client!aed", name = "aw", descriptor = "J")
	public long aLong121;

	@OriginalMember(owner = "client!aed", name = "gl", descriptor = "Lclient!kt;")
	Class113 aClass113_17;

	@OriginalMember(owner = "client!aed", name = "el", descriptor = "Lclient!ln;")
	Class381 aClass381_3;

	@OriginalMember(owner = "client!aed", name = "hu", descriptor = "Lclient!lc;")
	Interface38 anInterface38_4;

	@OriginalMember(owner = "client!aed", name = "eb", descriptor = "Lclient!jo;")
	Class109 aClass109_3;

	@OriginalMember(owner = "client!aed", name = "gv", descriptor = "Z")
	protected boolean aBoolean438;

	@OriginalMember(owner = "client!aed", name = "ca", descriptor = "F")
	float aFloat197;

	@OriginalMember(owner = "client!aed", name = "cr", descriptor = "F")
	float aFloat198;

	@OriginalMember(owner = "client!aed", name = "cx", descriptor = "F")
	float aFloat199;

	@OriginalMember(owner = "client!aed", name = "ft", descriptor = "Lclient!kz;")
	Class371 aClass371_3;

	@OriginalMember(owner = "client!aed", name = "gy", descriptor = "Lclient!lb;")
	Class374 aClass374_3;

	@OriginalMember(owner = "client!aed", name = "et", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_23;

	@OriginalMember(owner = "client!aed", name = "dj", descriptor = "[Lclient!ajv;")
	protected Class77_Sub22[] aClass77_Sub22Array18;

	@OriginalMember(owner = "client!aed", name = "eh", descriptor = "I")
	protected int anInt2828;

	@OriginalMember(owner = "client!aed", name = "eq", descriptor = "I")
	int anInt2831;

	@OriginalMember(owner = "client!aed", name = "gh", descriptor = "Lclient!kt;")
	Class113 aClass113_18;

	@OriginalMember(owner = "client!aed", name = "ee", descriptor = "[Lclient!oi;")
	protected Class442[] aClass442Array6;

	@OriginalMember(owner = "client!aed", name = "en", descriptor = "[Lclient!lh;")
	protected Class377[] aClass377Array3;

	@OriginalMember(owner = "client!aed", name = "ex", descriptor = "[Lclient!lv;")
	protected Class388[] aClass388Array6;

	@OriginalMember(owner = "client!aed", name = "ed", descriptor = "[Lclient!ls;")
	Interface42[] anInterface42Array3;

	@OriginalMember(owner = "client!aed", name = "er", descriptor = "I")
	protected int anInt2833;

	@OriginalMember(owner = "client!aed", name = "ew", descriptor = "Lclient!ks;")
	Interface37 anInterface37_24;

	@OriginalMember(owner = "client!aed", name = "eu", descriptor = "Lclient!aee;")
	Class83_Sub2 aClass83_Sub2_5;

	@OriginalMember(owner = "client!aed", name = "gn", descriptor = "Lclient!kp;")
	Interface36 anInterface36_15;

	@OriginalMember(owner = "client!aed", name = "eg", descriptor = "Lclient!kr;")
	Class122 aClass122_3;

	@OriginalMember(owner = "client!aed", name = "ff", descriptor = "Z")
	boolean aBoolean447;

	@OriginalMember(owner = "client!aed", name = "ez", descriptor = "Lclient!jk;")
	Class103 aClass103_3;

	@OriginalMember(owner = "client!aed", name = "ev", descriptor = "Lclient!jd;")
	Class99 aClass99_3;

	@OriginalMember(owner = "client!aed", name = "ek", descriptor = "Lclient!jn;")
	Class106 aClass106_3;

	@OriginalMember(owner = "client!aed", name = "fv", descriptor = "Lclient!api;")
	Class122_Sub1_Sub2 aClass122_Sub1_Sub2_5;

	@OriginalMember(owner = "client!aed", name = "fq", descriptor = "Lclient!api;")
	Class122_Sub1_Sub2 aClass122_Sub1_Sub2_6;

	@OriginalMember(owner = "client!aed", name = "fl", descriptor = "Lclient!aph;")
	Class122_Sub1_Sub1 aClass122_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aed", name = "hr", descriptor = "Lclient!ly;")
	Class390 aClass390_3;

	@OriginalMember(owner = "client!aed", name = "fz", descriptor = "Lclient!aez;")
	Class91_Sub2 aClass91_Sub2_3;

	@OriginalMember(owner = "client!aed", name = "fb", descriptor = "I")
	int anInt2839;

	@OriginalMember(owner = "client!aed", name = "fo", descriptor = "Z")
	protected boolean aBoolean450;

	@OriginalMember(owner = "client!aed", name = "fg", descriptor = "F")
	protected float aFloat205;

	@OriginalMember(owner = "client!aed", name = "fa", descriptor = "F")
	protected float aFloat206;

	@OriginalMember(owner = "client!aed", name = "cz", descriptor = "F")
	float aFloat207;

	@OriginalMember(owner = "client!aed", name = "ge", descriptor = "Z")
	protected boolean aBoolean453;

	@OriginalMember(owner = "client!aed", name = "gt", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!aed", name = "ga", descriptor = "I")
	int anInt2846;

	@OriginalMember(owner = "client!aed", name = "ap", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!aed", name = "gb", descriptor = "I")
	public int anInt2848;

	@OriginalMember(owner = "client!aed", name = "gu", descriptor = "I")
	protected int anInt2849;

	@OriginalMember(owner = "client!aed", name = "gk", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!aed", name = "gp", descriptor = "Z")
	protected boolean aBoolean455;

	@OriginalMember(owner = "client!aed", name = "gq", descriptor = "Z")
	protected boolean aBoolean456;

	@OriginalMember(owner = "client!aed", name = "gf", descriptor = "Z")
	protected boolean aBoolean457;

	@OriginalMember(owner = "client!aed", name = "go", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!aed", name = "gx", descriptor = "Z")
	protected boolean aBoolean459;

	@OriginalMember(owner = "client!aed", name = "ea", descriptor = "Lclient!aee;")
	Class83_Sub2 aClass83_Sub2_6;

	@OriginalMember(owner = "client!aed", name = "gd", descriptor = "Lclient!kp;")
	Interface36 anInterface36_16;

	@OriginalMember(owner = "client!aed", name = "fu", descriptor = "Lclient!db;")
	Class202 aClass202_6;

	@OriginalMember(owner = "client!aed", name = "gg", descriptor = "Lclient!kp;")
	Interface36 anInterface36_17;

	@OriginalMember(owner = "client!aed", name = "gs", descriptor = "Lclient!kt;")
	Class113 aClass113_19;

	@OriginalMember(owner = "client!aed", name = "gm", descriptor = "Lclient!kt;")
	Class113 aClass113_20;

	@OriginalMember(owner = "client!aed", name = "gw", descriptor = "Lclient!kt;")
	Class113 aClass113_21;

	@OriginalMember(owner = "client!aed", name = "es", descriptor = "I")
	int anInt2851;

	@OriginalMember(owner = "client!aed", name = "hl", descriptor = "Lclient!kt;")
	Class113 aClass113_22;

	@OriginalMember(owner = "client!aed", name = "hc", descriptor = "Z")
	protected boolean aBoolean461;

	@OriginalMember(owner = "client!aed", name = "ad", descriptor = "Lclient!acg;")
	Class56 aClass56_3 = new Class56();

	@OriginalMember(owner = "client!aed", name = "bc", descriptor = "I")
	int anInt2838 = 0;

	@OriginalMember(owner = "client!aed", name = "ba", descriptor = "Lclient!zm;")
	Class695 aClass695_33 = new Class695();

	@OriginalMember(owner = "client!aed", name = "by", descriptor = "Lclient!ow;")
	Class455 aClass455_35 = new Class455();

	@OriginalMember(owner = "client!aed", name = "bx", descriptor = "Lclient!oi;")
	Class442 aClass442_86 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bw", descriptor = "Lclient!ow;")
	Class455 aClass455_36 = new Class455();

	@OriginalMember(owner = "client!aed", name = "bi", descriptor = "Lclient!ow;")
	Class455 aClass455_37 = new Class455();

	@OriginalMember(owner = "client!aed", name = "bg", descriptor = "Lclient!oi;")
	public Class442 aClass442_79 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bs", descriptor = "Lclient!oi;")
	Class442 aClass442_78 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bt", descriptor = "Lclient!oi;")
	Class442 aClass442_80 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bz", descriptor = "Lclient!ow;")
	Class455 aClass455_39 = new Class455();

	@OriginalMember(owner = "client!aed", name = "bu", descriptor = "Lclient!oi;")
	Class442 aClass442_94 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bn", descriptor = "Lclient!ow;")
	Class455 aClass455_38 = new Class455();

	@OriginalMember(owner = "client!aed", name = "bp", descriptor = "Lclient!oi;")
	protected Class442 aClass442_87 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bm", descriptor = "Lclient!oi;")
	Class442 aClass442_82 = new Class442();

	@OriginalMember(owner = "client!aed", name = "bo", descriptor = "Lclient!oo;")
	Class447 aClass447_59 = new Class447();

	@OriginalMember(owner = "client!aed", name = "bk", descriptor = "[F")
	float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!aed", name = "br", descriptor = "Z")
	boolean aBoolean437 = false;

	@OriginalMember(owner = "client!aed", name = "bq", descriptor = "Lclient!kb;")
	Class357 aClass357_3 = Class357.aClass357_6;

	@OriginalMember(owner = "client!aed", name = "bh", descriptor = "Z")
	boolean aBoolean446 = false;

	@OriginalMember(owner = "client!aed", name = "be", descriptor = "Lclient!oi;")
	Class442 aClass442_85 = new Class442();

	@OriginalMember(owner = "client!aed", name = "cb", descriptor = "Lclient!oi;")
	Class442 aClass442_92 = new Class442();

	@OriginalMember(owner = "client!aed", name = "cg", descriptor = "Z")
	boolean aBoolean445 = false;

	@OriginalMember(owner = "client!aed", name = "cc", descriptor = "Lclient!oi;")
	Class442 aClass442_89 = new Class442();

	@OriginalMember(owner = "client!aed", name = "cf", descriptor = "Lclient!oi;")
	Class442 aClass442_83 = new Class442();

	@OriginalMember(owner = "client!aed", name = "cl", descriptor = "Lclient!oi;")
	Class442 aClass442_91 = this.aClass442_83;

	@OriginalMember(owner = "client!aed", name = "cp", descriptor = "Lclient!oi;")
	public Class442 aClass442_88 = new Class442();

	@OriginalMember(owner = "client!aed", name = "cw", descriptor = "Lclient!oi;")
	Class442 aClass442_93 = new Class442();

	@OriginalMember(owner = "client!aed", name = "ck", descriptor = "Lclient!oi;")
	public Class442 aClass442_84 = new Class442();

	@OriginalMember(owner = "client!aed", name = "ch", descriptor = "[[F")
	float[][] aFloatArrayArray21 = new float[6][4];

	@OriginalMember(owner = "client!aed", name = "ct", descriptor = "F")
	protected float aFloat193 = 0.0F;

	@OriginalMember(owner = "client!aed", name = "cv", descriptor = "F")
	protected float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "cu", descriptor = "F")
	float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!aed", name = "cm", descriptor = "F")
	float aFloat200 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "ci", descriptor = "F")
	protected float aFloat201 = 50.0F;

	@OriginalMember(owner = "client!aed", name = "co", descriptor = "F")
	protected float aFloat202 = 3584.0F;

	@OriginalMember(owner = "client!aed", name = "cn", descriptor = "I")
	protected int anInt2813 = 0;

	@OriginalMember(owner = "client!aed", name = "cq", descriptor = "I")
	protected int anInt2814 = 0;

	@OriginalMember(owner = "client!aed", name = "cy", descriptor = "I")
	protected int anInt2815 = 0;

	@OriginalMember(owner = "client!aed", name = "cs", descriptor = "I")
	protected int anInt2816 = 0;

	@OriginalMember(owner = "client!aed", name = "cd", descriptor = "I")
	int anInt2817 = 0;

	@OriginalMember(owner = "client!aed", name = "cj", descriptor = "I")
	int anInt2842 = 0;

	@OriginalMember(owner = "client!aed", name = "ce", descriptor = "I")
	int anInt2827 = 0;

	@OriginalMember(owner = "client!aed", name = "do", descriptor = "I")
	int anInt2819 = 0;

	@OriginalMember(owner = "client!aed", name = "dt", descriptor = "I")
	protected int anInt2820 = 0;

	@OriginalMember(owner = "client!aed", name = "dh", descriptor = "I")
	protected int anInt2821 = 0;

	@OriginalMember(owner = "client!aed", name = "dq", descriptor = "I")
	protected int anInt2822 = 0;

	@OriginalMember(owner = "client!aed", name = "dn", descriptor = "I")
	protected int anInt2829 = 0;

	@OriginalMember(owner = "client!aed", name = "dv", descriptor = "I")
	protected int anInt2798 = 0;

	@OriginalMember(owner = "client!aed", name = "da", descriptor = "I")
	protected int anInt2825 = 0;

	@OriginalMember(owner = "client!aed", name = "dy", descriptor = "Z")
	protected boolean aBoolean440 = true;

	@OriginalMember(owner = "client!aed", name = "dm", descriptor = "Z")
	protected boolean aBoolean441 = false;

	@OriginalMember(owner = "client!aed", name = "dz", descriptor = "Z")
	protected boolean aBoolean449 = true;

	@OriginalMember(owner = "client!aed", name = "dw", descriptor = "Z")
	protected boolean aBoolean442 = false;

	@OriginalMember(owner = "client!aed", name = "di", descriptor = "Z")
	protected boolean aBoolean436 = false;

	@OriginalMember(owner = "client!aed", name = "dr", descriptor = "Z")
	protected boolean aBoolean443 = true;

	@OriginalMember(owner = "client!aed", name = "dp", descriptor = "Z")
	protected boolean aBoolean444 = false;

	@OriginalMember(owner = "client!aed", name = "de", descriptor = "[F")
	public float[] aFloatArray71 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!aed", name = "du", descriptor = "[F")
	protected float[] aFloatArray72 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!aed", name = "dk", descriptor = "[F")
	float[] aFloatArray73 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!aed", name = "ds", descriptor = "[F")
	float[] aFloatArray74 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!aed", name = "df", descriptor = "I")
	int anInt2826 = 16777215;

	@OriginalMember(owner = "client!aed", name = "db", descriptor = "F")
	public float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "dx", descriptor = "F")
	public float aFloat209 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "dc", descriptor = "F")
	public float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "dl", descriptor = "F")
	protected float aFloat203 = 1.0F;

	@OriginalMember(owner = "client!aed", name = "dg", descriptor = "F")
	public float aFloat204 = -1.0F;

	@OriginalMember(owner = "client!aed", name = "dd", descriptor = "F")
	protected float aFloat208 = -1.0F;

	@OriginalMember(owner = "client!aed", name = "eo", descriptor = "I")
	int anInt2823 = 8;

	@OriginalMember(owner = "client!aed", name = "ep", descriptor = "I")
	int anInt2830 = 3;

	@OriginalMember(owner = "client!aed", name = "ei", descriptor = "I")
	protected int anInt2832 = 0;

	@OriginalMember(owner = "client!aed", name = "ec", descriptor = "Z")
	boolean aBoolean460 = false;

	@OriginalMember(owner = "client!aed", name = "ey", descriptor = "[Lclient!kr;")
	final Class122[] aClass122Array3 = new Class122[16];

	@OriginalMember(owner = "client!aed", name = "fi", descriptor = "[Lclient!kj;")
	final Class120[] aClass120Array3 = new Class120[4];

	@OriginalMember(owner = "client!aed", name = "fs", descriptor = "Z")
	boolean aBoolean448 = false;

	@OriginalMember(owner = "client!aed", name = "fd", descriptor = "Z")
	protected boolean aBoolean451 = true;

	@OriginalMember(owner = "client!aed", name = "fj", descriptor = "I")
	protected int anInt2840 = -1;

	@OriginalMember(owner = "client!aed", name = "fh", descriptor = "I")
	protected int anInt2841 = -1;

	@OriginalMember(owner = "client!aed", name = "fn", descriptor = "I")
	protected int anInt2824 = 0;

	@OriginalMember(owner = "client!aed", name = "fp", descriptor = "I")
	int anInt2850 = 1;

	@OriginalMember(owner = "client!aed", name = "fy", descriptor = "I")
	protected int anInt2834 = -1;

	@OriginalMember(owner = "client!aed", name = "fx", descriptor = "Lclient!lm;")
	protected Class380 aClass380_3 = Class380.aClass380_7;

	@OriginalMember(owner = "client!aed", name = "fr", descriptor = "Z")
	protected boolean aBoolean452 = true;

	@OriginalMember(owner = "client!aed", name = "fc", descriptor = "Z")
	protected boolean aBoolean435 = true;

	@OriginalMember(owner = "client!aed", name = "gr", descriptor = "B")
	protected byte aByte68 = 0;

	@OriginalMember(owner = "client!aed", name = "gj", descriptor = "I")
	protected int anInt2843 = 2;

	@OriginalMember(owner = "client!aed", name = "gc", descriptor = "Z")
	boolean aBoolean439 = false;

	@OriginalMember(owner = "client!aed", name = "hw", descriptor = "[Lclient!aey;")
	Class84_Sub3[] aClass84_Sub3Array5;

	@OriginalMember(owner = "client!aed", name = "ht", descriptor = "[Lclient!aey;")
	Class84_Sub3[] aClass84_Sub3Array6;

	@OriginalMember(owner = "client!aed", name = "hz", descriptor = "Lclient!oi;")
	Class442 aClass442_81;

	@OriginalMember(owner = "client!aed", name = "hq", descriptor = "Lclient!ow;")
	Class455 aClass455_40;

	@OriginalMember(owner = "client!aed", name = "af", descriptor = "Lclient!pw;")
	final Class478 aClass478_79;

	@OriginalMember(owner = "client!aed", name = "gi", descriptor = "I")
	public final int anInt2844;

	@OriginalMember(owner = "client!aed", name = "gz", descriptor = "I")
	int anInt2847;

	@OriginalMember(owner = "client!aed", name = "em", descriptor = "Lclient!ky;")
	final Class370 aClass370_3;

	@OriginalMember(owner = "client!aed", name = "ab", descriptor = "[I")
	int[] anIntArray261;

	@OriginalMember(owner = "client!aed", name = "aa", descriptor = "Lsun/misc/Unsafe;")
	protected Unsafe anUnsafe4;

	@OriginalMember(owner = "client!aed", name = "rq", descriptor = "(Lclient!ko;)V", line = 229)
	public void method20382(@OriginalArg(0) Interface35 arg0) {
		this.aClass56_3.method833(arg0, anObject7);
	}

	@OriginalMember(owner = "client!aed", name = "wn", descriptor = "(Lclient!ko;)V", line = 229)
	public void method20383(@OriginalArg(0) Interface35 arg0) {
		this.aClass56_3.method833(arg0, anObject7);
	}

	@OriginalMember(owner = "client!aed", name = "ws", descriptor = "(Lclient!ko;)V", line = 229)
	public void method20384(@OriginalArg(0) Interface35 arg0) {
		this.aClass56_3.method833(arg0, anObject7);
	}

	@OriginalMember(owner = "client!aed", name = "rb", descriptor = "(Lclient!ko;)V", line = 233)
	public void method20385(@OriginalArg(0) Interface35 arg0) {
		this.aClass56_3.method841(arg0);
	}

	@OriginalMember(owner = "client!aed", name = "wq", descriptor = "(Lclient!ko;)V", line = 233)
	public void method20386(@OriginalArg(0) Interface35 arg0) {
		this.aClass56_3.method841(arg0);
	}

	@OriginalMember(owner = "client!aed", name = "ru", descriptor = "()V", line = 237)
	void method20387() {
		@Pc(4) ArrayList local4 = this.aClass56_3.method846();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30322();
		}
	}

	@OriginalMember(owner = "client!aed", name = "wa", descriptor = "()V", line = 237)
	void method20388() {
		@Pc(4) ArrayList local4 = this.aClass56_3.method846();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30322();
		}
	}

	@OriginalMember(owner = "client!aed", name = "wl", descriptor = "()V", line = 237)
	void method20389() {
		@Pc(4) ArrayList local4 = this.aClass56_3.method846();
		@Pc(7) Iterator local7 = local4.iterator();
		while (local7.hasNext()) {
			@Pc(14) Interface35 local14 = (Interface35) local7.next();
			local14.method30322();
		}
	}

	@OriginalMember(owner = "client!aed", name = "rz", descriptor = "()Z", line = 251)
	final boolean method20390() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!aed", name = "we", descriptor = "()Z", line = 251)
	final boolean method20391() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!aed", name = "wz", descriptor = "()Z", line = 251)
	final boolean method20392() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!aed", name = "ri", descriptor = "(I)V", line = 255)
	public void method20393(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2838) {
			this.anInt2838 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2838);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong121 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!aed", name = "xi", descriptor = "(I)V", line = 255)
	public void method20394(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2838) {
			this.anInt2838 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2838);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong121 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!aed", name = "xe", descriptor = "(I)V", line = 255)
	public void method20395(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2838) {
			this.anInt2838 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2838);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong121 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!aed", name = "xs", descriptor = "(I)V", line = 255)
	public void method20396(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2838) {
			this.anInt2838 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2838);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong121 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!aed", name = "xb", descriptor = "(I)V", line = 255)
	public void method20397(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt2838) {
			this.anInt2838 = arg0;
			this.aByteBuffer7 = ByteBuffer.allocateDirect(this.anInt2838);
			this.aByteBuffer7.order(ByteOrder.nativeOrder());
			this.aLong121 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer7);
		}
	}

	@OriginalMember(owner = "client!aed", name = "rv", descriptor = "(I)Ljava/nio/ByteBuffer;", line = 264)
	ByteBuffer method20398(@OriginalArg(0) int arg0) {
		@Pc(2) ByteBuffer local2 = ByteBuffer.allocateDirect(arg0);
		local2.order(ByteOrder.nativeOrder());
		return local2;
	}

	@OriginalMember(owner = "client!aed", name = "rt", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method20399(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!aed", name = "xj", descriptor = "(Ljava/nio/ByteBuffer;)J", line = 270)
	long method20400(@OriginalArg(0) ByteBuffer arg0) {
		return DirectBufferHelper.getDirectBufferAddress(arg0);
	}

	@OriginalMember(owner = "client!aed", name = "xo", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method20401(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass478_79.method29778(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "xl", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method20402(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass478_79.method29778(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "rl", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 277)
	byte[] method20403(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		return this.aClass478_79.method29778(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "ra", descriptor = "([B)Lclient!ha;", line = 282)
	Class292 method20404(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class292(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xg", descriptor = "([B)Lclient!ha;", line = 282)
	Class292 method20405(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class292(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xt", descriptor = "([B)Lclient!ha;", line = 282)
	Class292 method20406(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class292(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xp", descriptor = "([B)Lclient!ha;", line = 282)
	Class292 method20407(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class292(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xa", descriptor = "([B)Lclient!ha;", line = 282)
	Class292 method20408(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		try {
			return new Class292(arg0);
		} catch (@Pc(9) Exception local9) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xn", descriptor = "()V", line = 297)
	public static void method20409() throws Exception_Sub4 {
		Class155.method23614().method30921("jaclib");
	}

	@OriginalMember(owner = "client!aed", name = "xw", descriptor = "()V", line = 297)
	public static void method20410() throws Exception_Sub4 {
		Class155.method23614().method30921("jaclib");
	}

	@OriginalMember(owner = "client!aed", name = "rd", descriptor = "()V", line = 297)
	public static void method20411() throws Exception_Sub4 {
		Class155.method23614().method30921("jaclib");
	}

	@OriginalMember(owner = "client!aed", name = "<init>", descriptor = "(Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;II)V", line = 301)
	Class86_Sub1(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface44 arg2, @OriginalArg(3) Interface47 arg3, @OriginalArg(4) Interface45 arg4, @OriginalArg(5) Class478 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		new Stream();
		this.aClass84_Sub3Array5 = new Class84_Sub3[8];
		this.aClass84_Sub3Array6 = new Class84_Sub3[8];
		this.aClass442_81 = new Class442();
		this.aClass455_40 = new Class455();
		try {
			this.aClass478_79 = arg5;
			this.anInt2844 = arg6;
			this.anInt2847 = arg7;
			Class463.method29543(false, true);
			if (this.anInterface24_55 == null) {
				this.aClass370_3 = null;
			} else {
				this.aClass370_3 = new Class370(this, this.anInterface24_55);
			}
			if (this.anInt2847 == 0) {
				this.anIntArray261 = Class656.anIntArray532;
			} else {
				this.anIntArray261 = Class656.anIntArray531;
			}
			try {
				@Pc(449) Field local449 = Unsafe.class.getDeclaredField("theUnsafe");
				local449.setAccessible(true);
				this.anUnsafe4 = (Unsafe) local449.get(null);
			} catch (@Pc(460) Exception local460) {
			}
			this.method20393(4194304);
		} catch (@Pc(465) Throwable local465) {
			local465.printStackTrace();
			this.method19929();
			if (local465 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local465;
			}
			throw new RuntimeException("");
		}
		this.method20300(this.method20100(131072));
	}

	@OriginalMember(owner = "client!aed", name = "rh", descriptor = "()V", line = 332)
	public final void method20412() {
		this.anInterface42Array3 = new Interface42[this.anInt2848];
		this.aClass442Array6 = new Class442[this.anInt2848];
		this.aClass377Array3 = new Class377[this.anInt2848];
		this.aClass388Array6 = new Class388[this.anInt2848];
		this.aClass388Array5 = new Class388[this.anInt2848];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2848; local26++) {
			this.aClass388Array5[local26] = Class388.aClass388_2;
			this.aClass388Array6[local26] = Class388.aClass388_2;
			this.aClass377Array3[local26] = Class377.aClass377_2;
			this.aClass442Array6[local26] = new Class442();
		}
		this.aClass77_Sub22Array18 = new Class77_Sub22[this.anInt2849 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface37_23 = this.method20693(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface37_24 = this.method20693(1, 1, false, local68, 0, 0);
		this.method20300(new Class77_Sub2_Sub1(262144));
		this.aClass113_21 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4 }) });
		this.aClass113_22 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.aClass113_20 = this.method20657(new Class391[] { new Class391(Class366.aClass366_12), new Class391(Class366.aClass366_2), new Class391(Class366.aClass366_4), new Class391(Class366.aClass366_1) });
		this.aClass113_18 = this.method20657(new Class391[] { new Class391(Class366.aClass366_12), new Class391(Class366.aClass366_2), new Class391(Class366.aClass366_4) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass84_Sub3Array5[local205] = new Class84_Sub3(this, 0, 0, false, false);
			this.aClass84_Sub3Array6[local205] = new Class84_Sub3(this, 0, 0, true, true);
		}
		this.method20414();
		this.anInterface38_4 = this.method20772(true);
		this.method20417();
		this.method20299();
		this.method20067();
		this.aClass83_Sub2_5 = new Class83_Sub2(this, this.anInterface37_23);
		this.aClass83_Sub2_6 = new Class83_Sub2(this, this.anInterface37_24);
		this.method20125(3, 0);
	}

	@OriginalMember(owner = "client!aed", name = "xq", descriptor = "()V", line = 332)
	public final void method20413() {
		this.anInterface42Array3 = new Interface42[this.anInt2848];
		this.aClass442Array6 = new Class442[this.anInt2848];
		this.aClass377Array3 = new Class377[this.anInt2848];
		this.aClass388Array6 = new Class388[this.anInt2848];
		this.aClass388Array5 = new Class388[this.anInt2848];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2848; local26++) {
			this.aClass388Array5[local26] = Class388.aClass388_2;
			this.aClass388Array6[local26] = Class388.aClass388_2;
			this.aClass377Array3[local26] = Class377.aClass377_2;
			this.aClass442Array6[local26] = new Class442();
		}
		this.aClass77_Sub22Array18 = new Class77_Sub22[this.anInt2849 - 2];
		@Pc(68) int[] local68 = new int[] { -1 };
		this.anInterface37_23 = this.method20693(1, 1, false, local68, 0, 0);
		local68[0] = -16777216;
		this.anInterface37_24 = this.method20693(1, 1, false, local68, 0, 0);
		this.method20300(new Class77_Sub2_Sub1(262144));
		this.aClass113_21 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4 }) });
		this.aClass113_22 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2 }) });
		this.aClass113_20 = this.method20657(new Class391[] { new Class391(Class366.aClass366_12), new Class391(Class366.aClass366_2), new Class391(Class366.aClass366_4), new Class391(Class366.aClass366_1) });
		this.aClass113_18 = this.method20657(new Class391[] { new Class391(Class366.aClass366_12), new Class391(Class366.aClass366_2), new Class391(Class366.aClass366_4) });
		for (@Pc(205) int local205 = 0; local205 < 8; local205++) {
			this.aClass84_Sub3Array5[local205] = new Class84_Sub3(this, 0, 0, false, false);
			this.aClass84_Sub3Array6[local205] = new Class84_Sub3(this, 0, 0, true, true);
		}
		this.method20414();
		this.anInterface38_4 = this.method20772(true);
		this.method20417();
		this.method20299();
		this.method20067();
		this.aClass83_Sub2_5 = new Class83_Sub2(this, this.anInterface37_23);
		this.aClass83_Sub2_6 = new Class83_Sub2(this, this.anInterface37_24);
		this.method20125(3, 0);
	}

	@OriginalMember(owner = "client!aed", name = "rf", descriptor = "()V", line = 368)
	final void method20414() {
		this.aClass361_5 = new Class361(this);
		this.aBoolean434 = false;
		try {
			this.aClass109_3 = new Class109_Sub1(this);
			this.aClass103_3 = new Class103_Sub1(this);
			this.aClass99_3 = new Class99_Sub1(this);
			this.aClass106_3 = new Class106_Sub2(this);
			this.aClass122_Sub1_Sub2_5 = new Class122_Sub1_Sub2(this, this.aClass361_5, false);
			this.aClass122_Sub1_Sub2_6 = new Class122_Sub1_Sub2(this, this.aClass361_5, true);
			this.aClass122_Sub1_Sub1_3 = new Class122_Sub1_Sub1(this, this.aClass361_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass109_3 = new Class109_Sub2(this);
			this.aClass103_3 = new Class103_Sub2(this);
			this.aClass99_3 = new Class99_Sub2(this);
			this.aClass106_3 = new Class106_Sub1(this);
			this.aClass122_Sub1_Sub2_5 = null;
			this.aClass122_Sub1_Sub2_6 = null;
			this.aClass122_Sub1_Sub1_3 = null;
			this.aBoolean434 = true;
		}
		if (!this.aBoolean434) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass92_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass92_6.method23491();
				local112 = this.aClass92_6.method23493();
			}
			this.aClass371_3 = new Class371(this, local108, local112);
			this.aClass120Array3[3] = new Class120_Sub1(this);
			this.aClass120Array3[1] = new Class120_Sub2(this);
			this.aClass120Array3[2] = new Class120_Sub3(this);
			if (this.aClass120Array3[3].method10798()) {
				this.aClass371_3.method28252(this.aClass120Array3[3]);
			}
			this.aClass371_3.method28252(this.aClass120Array3[1]);
			this.aClass371_3.method28252(this.aClass120Array3[2]);
			this.method20445();
			this.method20447();
		}
		if (this.aClass122_3 != null) {
			this.aClass122_3.method18549();
			this.aClass122_3 = null;
		}
		this.method20425();
	}

	@OriginalMember(owner = "client!aed", name = "xd", descriptor = "()V", line = 368)
	final void method20415() {
		this.aClass361_5 = new Class361(this);
		this.aBoolean434 = false;
		try {
			this.aClass109_3 = new Class109_Sub1(this);
			this.aClass103_3 = new Class103_Sub1(this);
			this.aClass99_3 = new Class99_Sub1(this);
			this.aClass106_3 = new Class106_Sub2(this);
			this.aClass122_Sub1_Sub2_5 = new Class122_Sub1_Sub2(this, this.aClass361_5, false);
			this.aClass122_Sub1_Sub2_6 = new Class122_Sub1_Sub2(this, this.aClass361_5, true);
			this.aClass122_Sub1_Sub1_3 = new Class122_Sub1_Sub1(this, this.aClass361_5);
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			this.aClass109_3 = new Class109_Sub2(this);
			this.aClass103_3 = new Class103_Sub2(this);
			this.aClass99_3 = new Class99_Sub2(this);
			this.aClass106_3 = new Class106_Sub1(this);
			this.aClass122_Sub1_Sub2_5 = null;
			this.aClass122_Sub1_Sub2_6 = null;
			this.aClass122_Sub1_Sub1_3 = null;
			this.aBoolean434 = true;
		}
		if (!this.aBoolean434) {
			@Pc(108) int local108;
			@Pc(112) int local112;
			if (this.aClass92_6 == null) {
				local112 = 0;
				local108 = 0;
			} else {
				local108 = this.aClass92_6.method23491();
				local112 = this.aClass92_6.method23493();
			}
			this.aClass371_3 = new Class371(this, local108, local112);
			this.aClass120Array3[3] = new Class120_Sub1(this);
			this.aClass120Array3[1] = new Class120_Sub2(this);
			this.aClass120Array3[2] = new Class120_Sub3(this);
			if (this.aClass120Array3[3].method10798()) {
				this.aClass371_3.method28252(this.aClass120Array3[3]);
			}
			this.aClass371_3.method28252(this.aClass120Array3[1]);
			this.aClass371_3.method28252(this.aClass120Array3[2]);
			this.method20445();
			this.method20447();
		}
		if (this.aClass122_3 != null) {
			this.aClass122_3.method18549();
			this.aClass122_3 = null;
		}
		this.method20425();
	}

	@OriginalMember(owner = "client!aed", name = "xh", descriptor = "()V", line = 419)
	void method20416() {
		this.method20628(7);
		this.method20419();
	}

	@OriginalMember(owner = "client!aed", name = "rw", descriptor = "()V", line = 419)
	void method20417() {
		this.method20628(7);
		this.method20419();
	}

	@OriginalMember(owner = "client!aed", name = "xc", descriptor = "()V", line = 419)
	void method20418() {
		this.method20628(7);
		this.method20419();
	}

	@OriginalMember(owner = "client!aed", name = "re", descriptor = "()V", line = 424)
	final void method20419() {
		this.method20668();
		this.method20631();
		this.method20629();
		this.method20527();
		this.method20689();
		this.method20698();
		this.method20632();
		this.method20623();
		this.method20624();
		this.method20667();
		this.method20684();
		this.method20652();
		this.method20651();
		this.method20650();
		for (@Pc(32) int local32 = this.anInt2848 - 1; local32 >= 0; local32--) {
			this.method20540(local32);
			this.method20645();
			this.method20646();
			this.method20569();
		}
		this.method20643();
		this.method20617();
	}

	@OriginalMember(owner = "client!aed", name = "xk", descriptor = "()V", line = 424)
	final void method20420() {
		this.method20668();
		this.method20631();
		this.method20629();
		this.method20527();
		this.method20689();
		this.method20698();
		this.method20632();
		this.method20623();
		this.method20624();
		this.method20667();
		this.method20684();
		this.method20652();
		this.method20651();
		this.method20650();
		for (@Pc(32) int local32 = this.anInt2848 - 1; local32 >= 0; local32--) {
			this.method20540(local32);
			this.method20645();
			this.method20646();
			this.method20569();
		}
		this.method20643();
		this.method20617();
	}

	@OriginalMember(owner = "client!aed", name = "sy", descriptor = "()V", line = 449)
	void method20421() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28269();
		}
		if (this.anInterface36_15 != null) {
			this.anInterface36_15.method30322();
		}
		if (this.anInterface36_16 != null) {
			this.anInterface36_16.method30322();
		}
		if (this.anInterface36_17 != null) {
			this.anInterface36_17.method30322();
		}
		if (this.aClass390_3 != null) {
			this.aClass390_3.method28361();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass84_Sub3Array6[local31] != null) {
				this.aClass84_Sub3Array6[local31].method7013();
			}
		}
		if (this.aClass374_3 != null) {
			this.aClass374_3.method28287();
		}
		if (this.anInterface38_4 != null) {
			this.anInterface38_4.method30322();
		}
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28312();
			this.aClass381_3 = null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xy", descriptor = "()V", line = 449)
	void method20422() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28269();
		}
		if (this.anInterface36_15 != null) {
			this.anInterface36_15.method30322();
		}
		if (this.anInterface36_16 != null) {
			this.anInterface36_16.method30322();
		}
		if (this.anInterface36_17 != null) {
			this.anInterface36_17.method30322();
		}
		if (this.aClass390_3 != null) {
			this.aClass390_3.method28361();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass84_Sub3Array6[local31] != null) {
				this.aClass84_Sub3Array6[local31].method7013();
			}
		}
		if (this.aClass374_3 != null) {
			this.aClass374_3.method28287();
		}
		if (this.anInterface38_4 != null) {
			this.anInterface38_4.method30322();
		}
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28312();
			this.aClass381_3 = null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xv", descriptor = "()V", line = 449)
	void method20423() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28269();
		}
		if (this.anInterface36_15 != null) {
			this.anInterface36_15.method30322();
		}
		if (this.anInterface36_16 != null) {
			this.anInterface36_16.method30322();
		}
		if (this.anInterface36_17 != null) {
			this.anInterface36_17.method30322();
		}
		if (this.aClass390_3 != null) {
			this.aClass390_3.method28361();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass84_Sub3Array6[local31] != null) {
				this.aClass84_Sub3Array6[local31].method7013();
			}
		}
		if (this.aClass374_3 != null) {
			this.aClass374_3.method28287();
		}
		if (this.anInterface38_4 != null) {
			this.anInterface38_4.method30322();
		}
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28312();
			this.aClass381_3 = null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "xf", descriptor = "()V", line = 449)
	void method20424() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28269();
		}
		if (this.anInterface36_15 != null) {
			this.anInterface36_15.method30322();
		}
		if (this.anInterface36_16 != null) {
			this.anInterface36_16.method30322();
		}
		if (this.anInterface36_17 != null) {
			this.anInterface36_17.method30322();
		}
		if (this.aClass390_3 != null) {
			this.aClass390_3.method28361();
		}
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			if (this.aClass84_Sub3Array6[local31] != null) {
				this.aClass84_Sub3Array6[local31].method7013();
			}
		}
		if (this.aClass374_3 != null) {
			this.aClass374_3.method28287();
		}
		if (this.anInterface38_4 != null) {
			this.anInterface38_4.method30322();
		}
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28312();
			this.aClass381_3 = null;
		}
	}

	@OriginalMember(owner = "client!aed", name = "si", descriptor = "()V", line = 468)
	void method20425() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28247();
		}
		if (this.aClass120Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120Array3.length; local10++) {
				if (this.aClass120Array3[local10] != null && this.aClass120Array3[local10].method10782()) {
					this.aClass120Array3[local10].method10773();
				}
			}
		}
		this.aClass374_3 = new Class374(this);
		this.method20429();
		this.method20432();
		this.method20433();
		this.aClass390_3 = new Class390(this, 1024);
		this.aClass374_3.method28281(this);
		if (this.aBoolean454) {
			this.aClass381_3 = new Class381(this, 1024);
		}
	}

	@OriginalMember(owner = "client!aed", name = "yu", descriptor = "()V", line = 468)
	void method20426() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28247();
		}
		if (this.aClass120Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120Array3.length; local10++) {
				if (this.aClass120Array3[local10] != null && this.aClass120Array3[local10].method10782()) {
					this.aClass120Array3[local10].method10773();
				}
			}
		}
		this.aClass374_3 = new Class374(this);
		this.method20429();
		this.method20432();
		this.method20433();
		this.aClass390_3 = new Class390(this, 1024);
		this.aClass374_3.method28281(this);
		if (this.aBoolean454) {
			this.aClass381_3 = new Class381(this, 1024);
		}
	}

	@OriginalMember(owner = "client!aed", name = "ys", descriptor = "()V", line = 468)
	void method20427() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28247();
		}
		if (this.aClass120Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120Array3.length; local10++) {
				if (this.aClass120Array3[local10] != null && this.aClass120Array3[local10].method10782()) {
					this.aClass120Array3[local10].method10773();
				}
			}
		}
		this.aClass374_3 = new Class374(this);
		this.method20429();
		this.method20432();
		this.method20433();
		this.aClass390_3 = new Class390(this, 1024);
		this.aClass374_3.method28281(this);
		if (this.aBoolean454) {
			this.aClass381_3 = new Class381(this, 1024);
		}
	}

	@OriginalMember(owner = "client!aed", name = "yv", descriptor = "()V", line = 468)
	void method20428() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28247();
		}
		if (this.aClass120Array3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120Array3.length; local10++) {
				if (this.aClass120Array3[local10] != null && this.aClass120Array3[local10].method10782()) {
					this.aClass120Array3[local10].method10773();
				}
			}
		}
		this.aClass374_3 = new Class374(this);
		this.method20429();
		this.method20432();
		this.method20433();
		this.aClass390_3 = new Class390(this, 1024);
		this.aClass374_3.method28281(this);
		if (this.aBoolean454) {
			this.aClass381_3 = new Class381(this, 1024);
		}
	}

	@OriginalMember(owner = "client!aed", name = "sh", descriptor = "()V", line = 482)
	final void method20429() {
		this.anInterface36_15 = this.method20656(false);
		@Pc(6) short local6 = 160;
		this.anInterface36_15.method28760(local6, 32);
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
		this.anInterface36_15.method28755(0, this.aByteBuffer7.position(), this.aLong121);
		this.aClass113_17 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2, Class366.aClass366_4, Class366.aClass366_4 }) });
	}

	@OriginalMember(owner = "client!aed", name = "yr", descriptor = "()V", line = 482)
	final void method20430() {
		this.anInterface36_15 = this.method20656(false);
		@Pc(6) short local6 = 160;
		this.anInterface36_15.method28760(local6, 32);
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
		this.anInterface36_15.method28755(0, this.aByteBuffer7.position(), this.aLong121);
		this.aClass113_17 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2, Class366.aClass366_4, Class366.aClass366_4 }) });
	}

	@OriginalMember(owner = "client!aed", name = "yf", descriptor = "()V", line = 482)
	final void method20431() {
		this.anInterface36_15 = this.method20656(false);
		@Pc(6) short local6 = 160;
		this.anInterface36_15.method28760(local6, 32);
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
		this.anInterface36_15.method28755(0, this.aByteBuffer7.position(), this.aLong121);
		this.aClass113_17 = this.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2, Class366.aClass366_4, Class366.aClass366_4 }) });
	}

	@OriginalMember(owner = "client!aed", name = "sf", descriptor = "()V", line = 531)
	final void method20432() {
		this.anInterface36_16 = this.method20656(true);
		@Pc(6) byte local6 = 24;
		this.anInterface36_16.method28760(local6, 12);
		this.aClass113_19 = this.method20657(new Class391[] { new Class391(Class366.aClass366_12) });
	}

	@OriginalMember(owner = "client!aed", name = "so", descriptor = "()V", line = 538)
	final void method20433() {
		this.anInterface36_17 = this.method20656(false);
		this.anInterface36_17.method28760(3096, 12);
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
		this.anInterface36_17.method28755(0, this.aByteBuffer7.position(), this.aLong121);
	}

	@OriginalMember(owner = "client!aed", name = "yc", descriptor = "()V", line = 538)
	final void method20434() {
		this.anInterface36_17 = this.method20656(false);
		this.anInterface36_17.method28760(3096, 12);
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
		this.anInterface36_17.method28755(0, this.aByteBuffer7.position(), this.aLong121);
	}

	@OriginalMember(owner = "client!aed", name = "sb", descriptor = "(FFFFFF)Z", line = 556)
	boolean method20435(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method20393(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface36_16.method28755(0, this.aByteBuffer7.position(), this.aLong121);
	}

	@OriginalMember(owner = "client!aed", name = "yw", descriptor = "(FFFFFF)Z", line = 556)
	boolean method20436(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method20393(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface36_16.method28755(0, this.aByteBuffer7.position(), this.aLong121);
	}

	@OriginalMember(owner = "client!aed", name = "yo", descriptor = "(FFFFFF)Z", line = 556)
	boolean method20437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.method20393(24);
		this.aByteBuffer7.clear();
		this.aByteBuffer7.putFloat(arg0);
		this.aByteBuffer7.putFloat(arg1);
		this.aByteBuffer7.putFloat(arg2);
		this.aByteBuffer7.putFloat(arg3);
		this.aByteBuffer7.putFloat(arg4);
		this.aByteBuffer7.putFloat(arg5);
		return this.anInterface36_16.method28755(0, this.aByteBuffer7.position(), this.aLong121);
	}

	@OriginalMember(owner = "client!aed", name = "d", descriptor = "()V", line = 568)
	@Override
	void method20113() {
		if (this.aBoolean439) {
			return;
		}
		this.method20421();
		this.aClass370_3.method28237();
		for (@Pc(12) Class77 local12 = this.aClass695_33.method36395(); local12 != null; local12 = this.aClass695_33.method36406()) {
			((Class77_Sub2_Sub1) local12).method21400();
		}
		Class459.method29505(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass122Array3.length; local29++) {
			if (this.aClass122Array3[local29] != null) {
				this.aClass122Array3[local29].method18545();
				this.aClass122Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass120Array3.length; local29++) {
			if (this.aClass120Array3[local29] != null) {
				this.aClass120Array3[local29].method10785();
				this.aClass120Array3[local29] = null;
			}
		}
		this.method20387();
		this.method20368(0);
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!aed", name = "mn", descriptor = "()V", line = 568)
	@Override
	void method20332() {
		if (this.aBoolean439) {
			return;
		}
		this.method20421();
		this.aClass370_3.method28237();
		for (@Pc(12) Class77 local12 = this.aClass695_33.method36395(); local12 != null; local12 = this.aClass695_33.method36406()) {
			((Class77_Sub2_Sub1) local12).method21400();
		}
		Class459.method29505(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass122Array3.length; local29++) {
			if (this.aClass122Array3[local29] != null) {
				this.aClass122Array3[local29].method18545();
				this.aClass122Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass120Array3.length; local29++) {
			if (this.aClass120Array3[local29] != null) {
				this.aClass120Array3[local29].method10785();
				this.aClass120Array3[local29] = null;
			}
		}
		this.method20387();
		this.method20368(0);
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!aed", name = "ms", descriptor = "()V", line = 568)
	@Override
	void method20333() {
		if (this.aBoolean439) {
			return;
		}
		this.method20421();
		this.aClass370_3.method28237();
		for (@Pc(12) Class77 local12 = this.aClass695_33.method36395(); local12 != null; local12 = this.aClass695_33.method36406()) {
			((Class77_Sub2_Sub1) local12).method21400();
		}
		Class459.method29505(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass122Array3.length; local29++) {
			if (this.aClass122Array3[local29] != null) {
				this.aClass122Array3[local29].method18545();
				this.aClass122Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass120Array3.length; local29++) {
			if (this.aClass120Array3[local29] != null) {
				this.aClass120Array3[local29].method10785();
				this.aClass120Array3[local29] = null;
			}
		}
		this.method20387();
		this.method20368(0);
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!aed", name = "mc", descriptor = "()V", line = 568)
	@Override
	void method20315() {
		if (this.aBoolean439) {
			return;
		}
		this.method20421();
		this.aClass370_3.method28237();
		for (@Pc(12) Class77 local12 = this.aClass695_33.method36395(); local12 != null; local12 = this.aClass695_33.method36406()) {
			((Class77_Sub2_Sub1) local12).method21400();
		}
		Class459.method29505(false, true);
		@Pc(29) int local29;
		for (local29 = 0; local29 < this.aClass122Array3.length; local29++) {
			if (this.aClass122Array3[local29] != null) {
				this.aClass122Array3[local29].method18545();
				this.aClass122Array3[local29] = null;
			}
		}
		for (local29 = 0; local29 < this.aClass120Array3.length; local29++) {
			if (this.aClass120Array3[local29] != null) {
				this.aClass120Array3[local29].method10785();
				this.aClass120Array3[local29] = null;
			}
		}
		this.method20387();
		this.method20368(0);
		this.aBoolean439 = true;
	}

	@OriginalMember(owner = "client!aed", name = "g", descriptor = "()Z", line = 594)
	@Override
	public final boolean method20050() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fq", descriptor = "()Z", line = 594)
	@Override
	public final boolean method20161() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "z", descriptor = "()Z", line = 598)
	@Override
	public final boolean method20051() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "no", descriptor = "()Z", line = 598)
	@Override
	public final boolean method20354() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "j", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20052() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "md", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20336() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "mz", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20260() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "mp", descriptor = "()Z", line = 602)
	@Override
	public final boolean method20334() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "k", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20296() {
		return this.aClass120Array3[3] != null;
	}

	@OriginalMember(owner = "client!aed", name = "fm", descriptor = "()Z", line = 606)
	@Override
	public final boolean method20162() {
		return this.aClass120Array3[3] != null;
	}

	@OriginalMember(owner = "client!aed", name = "u", descriptor = "()Z", line = 610)
	@Override
	public final boolean method20178() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fl", descriptor = "()Z", line = 610)
	@Override
	public final boolean method20342() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "ft", descriptor = "()Z", line = 610)
	@Override
	public final boolean method20164() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fk", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20241() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fe", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20166() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fw", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20167() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "i", descriptor = "()Z", line = 614)
	@Override
	public final boolean method20206() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fb", descriptor = "()Z", line = 618)
	@Override
	public final boolean method20112() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "f", descriptor = "()Z", line = 618)
	@Override
	public final boolean method20056() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "o", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20119() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fu", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20173() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "fo", descriptor = "()Z", line = 622)
	@Override
	public final boolean method20174() {
		return true;
	}

	@OriginalMember(owner = "client!aed", name = "b", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20058() {
		return false;
	}

	@OriginalMember(owner = "client!aed", name = "fd", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20353() {
		return false;
	}

	@OriginalMember(owner = "client!aed", name = "fj", descriptor = "()Z", line = 626)
	@Override
	public final boolean method20175() {
		return false;
	}

	@OriginalMember(owner = "client!aed", name = "e", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20055() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!aed", name = "fi", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20168() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!aed", name = "ff", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20170() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!aed", name = "fs", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20171() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!aed", name = "fz", descriptor = "()Z", line = 630)
	@Override
	public final boolean method20169() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!aed", name = "fg", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20369() {
		return null;
	}

	@OriginalMember(owner = "client!aed", name = "fp", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20179() {
		return null;
	}

	@OriginalMember(owner = "client!aed", name = "fa", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20250() {
		return null;
	}

	@OriginalMember(owner = "client!aed", name = "a", descriptor = "()[I", line = 637)
	@Override
	public final int[] method20060() {
		return null;
	}

	@OriginalMember(owner = "client!aed", name = "s", descriptor = "(I)V", line = 641)
	@Override
	public void method20368(@OriginalArg(0) int arg0) {
		if (this.aClass370_3 != null) {
			this.aClass370_3.method28236();
		}
		this.anInt2845 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aed", name = "eg", descriptor = "(I)V", line = 641)
	@Override
	public void method20108(@OriginalArg(0) int arg0) {
		if (this.aClass370_3 != null) {
			this.aClass370_3.method28236();
		}
		this.anInt2845 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aed", name = "ey", descriptor = "(I)V", line = 641)
	@Override
	public void method20381(@OriginalArg(0) int arg0) {
		if (this.aClass370_3 != null) {
			this.aClass370_3.method28236();
		}
		this.anInt2845 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aed", name = "eb", descriptor = "(I)V", line = 641)
	@Override
	public void method20165(@OriginalArg(0) int arg0) {
		if (this.aClass370_3 != null) {
			this.aClass370_3.method28236();
		}
		this.anInt2845 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aed", name = "ez", descriptor = "(I)V", line = 641)
	@Override
	public void method20158(@OriginalArg(0) int arg0) {
		if (this.aClass370_3 != null) {
			this.aClass370_3.method28236();
		}
		this.anInt2845 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!aed", name = "ss", descriptor = "()Lclient!kx;", line = 646)
	Class369 method20438() {
		return this.aClass381_3 == null ? Class369.aClass369_2 : this.aClass381_3.method28339();
	}

	@OriginalMember(owner = "client!aed", name = "yk", descriptor = "()Lclient!kx;", line = 646)
	Class369 method20439() {
		return this.aClass381_3 == null ? Class369.aClass369_2 : this.aClass381_3.method28339();
	}

	@OriginalMember(owner = "client!aed", name = "yb", descriptor = "()Lclient!kx;", line = 646)
	Class369 method20440() {
		return this.aClass381_3 == null ? Class369.aClass369_2 : this.aClass381_3.method28339();
	}

	@OriginalMember(owner = "client!aed", name = "cu", descriptor = "()V", line = 651)
	@Override
	public void method20012() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28314();
		}
	}

	@OriginalMember(owner = "client!aed", name = "qi", descriptor = "()V", line = 651)
	@Override
	public void method20013() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28314();
		}
	}

	@OriginalMember(owner = "client!aed", name = "cm", descriptor = "()V", line = 657)
	@Override
	public void method20014() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28331();
		}
	}

	@OriginalMember(owner = "client!aed", name = "qb", descriptor = "()V", line = 657)
	@Override
	public void method20015() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28331();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ci", descriptor = "()V", line = 663)
	@Override
	public void method20017() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28333();
		}
	}

	@OriginalMember(owner = "client!aed", name = "qn", descriptor = "()V", line = 663)
	@Override
	public void method20019() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28333();
		}
	}

	@OriginalMember(owner = "client!aed", name = "qo", descriptor = "()V", line = 663)
	@Override
	public void method20016() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28333();
		}
	}

	@OriginalMember(owner = "client!aed", name = "qp", descriptor = "()V", line = 663)
	@Override
	public void method20018() {
		if (this.aClass381_3 != null) {
			this.aClass381_3.method28333();
		}
	}

	@OriginalMember(owner = "client!aed", name = "sv", descriptor = "()V", line = 669)
	void method20441() {
		this.method20443();
	}

	@OriginalMember(owner = "client!aed", name = "ya", descriptor = "()V", line = 669)
	void method20442() {
		this.method20443();
	}

	@OriginalMember(owner = "client!aed", name = "sx", descriptor = "()V", line = 673)
	void method20443() {
		this.method20491();
		this.method20497();
		this.method20487();
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aed", name = "yp", descriptor = "()V", line = 673)
	void method20444() {
		this.method20491();
		this.method20497();
		this.method20487();
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aed", name = "db", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass371_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass120Array3.length; local5++) {
			if (this.aClass120Array3[local5] != null && this.aClass120Array3[local5].method10782() && !this.aClass120Array3[local5].method10797()) {
				if (!this.aClass371_3.method28263(arg0, arg1, arg2, arg3)) {
					this.aClass371_3.method28269();
					this.aClass371_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aed", name = "ku", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass371_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass120Array3.length; local5++) {
			if (this.aClass120Array3[local5] != null && this.aClass120Array3[local5].method10782() && !this.aClass120Array3[local5].method10797()) {
				if (!this.aClass371_3.method28263(arg0, arg1, arg2, arg3)) {
					this.aClass371_3.method28269();
					this.aClass371_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aed", name = "kb", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass371_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass120Array3.length; local5++) {
			if (this.aClass120Array3[local5] != null && this.aClass120Array3[local5].method10782() && !this.aClass120Array3[local5].method10797()) {
				if (!this.aClass371_3.method28263(arg0, arg1, arg2, arg3)) {
					this.aClass371_3.method28269();
					this.aClass371_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aed", name = "ks", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass371_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass120Array3.length; local5++) {
			if (this.aClass120Array3[local5] != null && this.aClass120Array3[local5].method10782() && !this.aClass120Array3[local5].method10797()) {
				if (!this.aClass371_3.method28263(arg0, arg1, arg2, arg3)) {
					this.aClass371_3.method28269();
					this.aClass371_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aed", name = "ki", descriptor = "(IIII)V", line = 681)
	@Override
	public final void method20293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass371_3 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.aClass120Array3.length; local5++) {
			if (this.aClass120Array3[local5] != null && this.aClass120Array3[local5].method10782() && !this.aClass120Array3[local5].method10797()) {
				if (!this.aClass371_3.method28263(arg0, arg1, arg2, arg3)) {
					this.aClass371_3.method28269();
					this.aClass371_3 = null;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aed", name = "dx", descriptor = "(II)V", line = 694)
	@Override
	public final void method20135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28265(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "lb", descriptor = "(II)V", line = 694)
	@Override
	public final void method20295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28265(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "lk", descriptor = "(II)V", line = 694)
	@Override
	public final void method20082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28265(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "lz", descriptor = "(II)V", line = 694)
	@Override
	public final void method20157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28265(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "lo", descriptor = "(II)V", line = 694)
	@Override
	public final void method20374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method28265(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "dc", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20136() {
		return this.aClass371_3 != null && this.aClass371_3.aBoolean727;
	}

	@OriginalMember(owner = "client!aed", name = "lf", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20224() {
		return this.aClass371_3 != null && this.aClass371_3.aBoolean727;
	}

	@OriginalMember(owner = "client!aed", name = "lu", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20298() {
		return this.aClass371_3 != null && this.aClass371_3.aBoolean727;
	}

	@OriginalMember(owner = "client!aed", name = "lw", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20359() {
		return this.aClass371_3 != null && this.aClass371_3.aBoolean727;
	}

	@OriginalMember(owner = "client!aed", name = "lm", descriptor = "()Z", line = 698)
	@Override
	public final boolean method20240() {
		return this.aClass371_3 != null && this.aClass371_3.aBoolean727;
	}

	@OriginalMember(owner = "client!aed", name = "sw", descriptor = "()Z", line = 702)
	boolean method20445() {
		if (this.aClass120Array3[1] == null || this.aClass120Array3[1].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[1]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "yq", descriptor = "()Z", line = 702)
	boolean method20446() {
		if (this.aClass120Array3[1] == null || this.aClass120Array3[1].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[1]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "lp", descriptor = "()Z", line = 711)
	@Override
	public boolean method20301() {
		return this.aClass120Array3[1] != null && this.aClass120Array3[1].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "lh", descriptor = "()Z", line = 711)
	@Override
	public boolean method20302() {
		return this.aClass120Array3[1] != null && this.aClass120Array3[1].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "dl", descriptor = "()Z", line = 711)
	@Override
	public boolean method20213() {
		return this.aClass120Array3[1] != null && this.aClass120Array3[1].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "dg", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20340(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class120_Sub2.aFloat137 = arg0;
		Class120_Sub2.aFloat138 = arg1;
		Class120_Sub2.aFloat136 = arg2;
		Class120_Sub2.aFloat139 = arg3;
		Class120_Sub2.aFloat140 = arg4;
	}

	@OriginalMember(owner = "client!aed", name = "la", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class120_Sub2.aFloat137 = arg0;
		Class120_Sub2.aFloat138 = arg1;
		Class120_Sub2.aFloat136 = arg2;
		Class120_Sub2.aFloat139 = arg3;
		Class120_Sub2.aFloat140 = arg4;
	}

	@OriginalMember(owner = "client!aed", name = "ln", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20304(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class120_Sub2.aFloat137 = arg0;
		Class120_Sub2.aFloat138 = arg1;
		Class120_Sub2.aFloat136 = arg2;
		Class120_Sub2.aFloat139 = arg3;
		Class120_Sub2.aFloat140 = arg4;
	}

	@OriginalMember(owner = "client!aed", name = "ls", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class120_Sub2.aFloat137 = arg0;
		Class120_Sub2.aFloat138 = arg1;
		Class120_Sub2.aFloat136 = arg2;
		Class120_Sub2.aFloat139 = arg3;
		Class120_Sub2.aFloat140 = arg4;
	}

	@OriginalMember(owner = "client!aed", name = "lv", descriptor = "(FFFFF)V", line = 715)
	@Override
	public void method20305(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class120_Sub2.aFloat137 = arg0;
		Class120_Sub2.aFloat138 = arg1;
		Class120_Sub2.aFloat136 = arg2;
		Class120_Sub2.aFloat139 = arg3;
		Class120_Sub2.aFloat140 = arg4;
	}

	@OriginalMember(owner = "client!aed", name = "lx", descriptor = "([I)Lclient!dh;", line = 723)
	@Override
	public Class85 method20308(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "dd", descriptor = "([I)Lclient!dh;", line = 723)
	@Override
	public Class85 method20351(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "lq", descriptor = "([I)Lclient!dh;", line = 723)
	@Override
	public Class85 method20307(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "lg", descriptor = "([I)Lclient!dh;", line = 723)
	@Override
	public Class85 method20196(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "sa", descriptor = "()Z", line = 727)
	boolean method20447() {
		if (this.aClass120Array3[2] == null || this.aClass120Array3[2].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[2]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "yi", descriptor = "()Z", line = 727)
	boolean method20448() {
		if (this.aClass120Array3[2] == null || this.aClass120Array3[2].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[2]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "yj", descriptor = "()Z", line = 727)
	boolean method20449() {
		if (this.aClass120Array3[2] == null || this.aClass120Array3[2].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[2]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "yy", descriptor = "()Z", line = 727)
	boolean method20450() {
		if (this.aClass120Array3[2] == null || this.aClass120Array3[2].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[2]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "qx", descriptor = "()Z", line = 736)
	@Override
	public boolean method20083() {
		return this.aClass120Array3[2] != null && this.aClass120Array3[2].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "qe", descriptor = "()Z", line = 736)
	@Override
	public boolean method20379() {
		return this.aClass120Array3[2] != null && this.aClass120Array3[2].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "dj", descriptor = "()Z", line = 736)
	@Override
	public boolean method20093() {
		return this.aClass120Array3[2] != null && this.aClass120Array3[2].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "eh", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 740)
	@Override
	public void method20139(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5) {
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
		Class120_Sub3.aClass85_Sub1Array1[0] = (Class85_Sub1) arg0;
		Class120_Sub3.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class120_Sub3.aClass85_Sub1Array1[1] = (Class85_Sub1) arg2;
		Class120_Sub3.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class120_Sub3.aClass85_Sub1Array1[2] = (Class85_Sub1) arg4;
		Class120_Sub3.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class120_Sub3.anInt1240 = local1;
		Class120_Sub3.aFloat143 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!aed", name = "lc", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 740)
	@Override
	public void method20309(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5) {
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
		Class120_Sub3.aClass85_Sub1Array1[0] = (Class85_Sub1) arg0;
		Class120_Sub3.aFloatArray52[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class120_Sub3.aClass85_Sub1Array1[1] = (Class85_Sub1) arg2;
		Class120_Sub3.aFloatArray52[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class120_Sub3.aClass85_Sub1Array1[2] = (Class85_Sub1) arg4;
		Class120_Sub3.aFloatArray52[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class120_Sub3.anInt1240 = local1;
		Class120_Sub3.aFloat143 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!aed", name = "ej", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20140() {
		if (this.aClass120Array3[3] == null || this.aClass120Array3[3].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[3]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "np", descriptor = "()Z", line = 772)
	@Override
	public final boolean method20349() {
		if (this.aClass120Array3[3] == null || this.aClass120Array3[3].method10782()) {
			return false;
		}
		@Pc(18) boolean local18 = this.aClass371_3.method28252(this.aClass120Array3[3]);
		if (local18) {
			this.aClass370_3.method28237();
		}
		return local18;
	}

	@OriginalMember(owner = "client!aed", name = "eo", descriptor = "()V", line = 781)
	@Override
	public final void method20141() {
		if (this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782()) {
			this.aClass371_3.method28258(this.aClass120Array3[3]);
			this.aClass370_3.method28237();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ly", descriptor = "()V", line = 781)
	@Override
	public final void method20310() {
		if (this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782()) {
			this.aClass371_3.method28258(this.aClass120Array3[3]);
			this.aClass370_3.method28237();
		}
	}

	@OriginalMember(owner = "client!aed", name = "le", descriptor = "()V", line = 781)
	@Override
	public final void method20364() {
		if (this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782()) {
			this.aClass371_3.method28258(this.aClass120Array3[3]);
			this.aClass370_3.method28237();
		}
	}

	@OriginalMember(owner = "client!aed", name = "lt", descriptor = "()V", line = 781)
	@Override
	public final void method20311() {
		if (this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782()) {
			this.aClass371_3.method28258(this.aClass120Array3[3]);
			this.aClass370_3.method28237();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ll", descriptor = "()V", line = 781)
	@Override
	public final void method20303() {
		if (this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782()) {
			this.aClass371_3.method28258(this.aClass120Array3[3]);
			this.aClass370_3.method28237();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ld", descriptor = "()Z", line = 788)
	@Override
	public final boolean method20312() {
		return this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "ep", descriptor = "()Z", line = 788)
	@Override
	public final boolean method20183() {
		return this.aClass120Array3[3] != null && this.aClass120Array3[3].method10782();
	}

	@OriginalMember(owner = "client!aed", name = "es", descriptor = "(FFFFFF)V", line = 792)
	@Override
	final void method20144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class120_Sub1.aFloat131 = arg0;
		Class120_Sub1.aFloat130 = arg1;
		Class120_Sub1.aFloat132 = arg2;
		Class120_Sub1.aFloat133 = arg5;
	}

	@OriginalMember(owner = "client!aed", name = "lj", descriptor = "(FFFFFF)V", line = 792)
	@Override
	final void method20313(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class120_Sub1.aFloat131 = arg0;
		Class120_Sub1.aFloat130 = arg1;
		Class120_Sub1.aFloat132 = arg2;
		Class120_Sub1.aFloat133 = arg5;
	}

	@OriginalMember(owner = "client!aed", name = "js", descriptor = "(I)Lclient!aja;", line = 799)
	@Override
	public final Class77_Sub2 method20247(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub1 local4 = new Class77_Sub2_Sub1(arg0);
		this.aClass695_33.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aed", name = "jz", descriptor = "(I)Lclient!aja;", line = 799)
	@Override
	public final Class77_Sub2 method20355(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub1 local4 = new Class77_Sub2_Sub1(arg0);
		this.aClass695_33.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aed", name = "ck", descriptor = "(I)Lclient!aja;", line = 799)
	@Override
	public final Class77_Sub2 method20100(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub1 local4 = new Class77_Sub2_Sub1(arg0);
		this.aClass695_33.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aed", name = "ch", descriptor = "(Lclient!aja;)V", line = 805)
	@Override
	public final void method20300(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap4 = ((Class77_Sub2_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!aed", name = "jr", descriptor = "(Lclient!aja;)V", line = 805)
	@Override
	public final void method20248(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap4 = ((Class77_Sub2_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!aed", name = "jv", descriptor = "(Lclient!aja;)V", line = 805)
	@Override
	public final void method20249(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap4 = ((Class77_Sub2_Sub1) arg0).aNativeHeap5;
	}

	@OriginalMember(owner = "client!aed", name = "yn", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method20451(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.c(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "yl", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method20452(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.c(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "sg", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;", line = 809)
	public final NativeHeapBuffer method20453(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.aNativeHeap4.c(arg0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "st", descriptor = "(I)Lclient!lc;", line = 813)
	final Interface38 method20454(@OriginalArg(0) int arg0) {
		if (this.anInterface38_4.method28754() < arg0 * 2) {
			this.anInterface38_4.method28728(arg0);
		}
		return this.anInterface38_4;
	}

	@OriginalMember(owner = "client!aed", name = "yz", descriptor = "(I)Lclient!lc;", line = 813)
	final Interface38 method20455(@OriginalArg(0) int arg0) {
		if (this.anInterface38_4.method28754() < arg0 * 2) {
			this.anInterface38_4.method28728(arg0);
		}
		return this.anInterface38_4;
	}

	@OriginalMember(owner = "client!aed", name = "yx", descriptor = "(I)Lclient!lc;", line = 813)
	final Interface38 method20456(@OriginalArg(0) int arg0) {
		if (this.anInterface38_4.method28754() < arg0 * 2) {
			this.anInterface38_4.method28728(arg0);
		}
		return this.anInterface38_4;
	}

	@OriginalMember(owner = "client!aed", name = "yd", descriptor = "(I)Lclient!lc;", line = 813)
	final Interface38 method20457(@OriginalArg(0) int arg0) {
		if (this.anInterface38_4.method28754() < arg0 * 2) {
			this.anInterface38_4.method28728(arg0);
		}
		return this.anInterface38_4;
	}

	@OriginalMember(owner = "client!aed", name = "ev", descriptor = "()I", line = 818)
	@Override
	public final int method20185() {
		return this.anInt2810 + this.anInt2809 + this.anInt2811;
	}

	@OriginalMember(owner = "client!aed", name = "ek", descriptor = "()I", line = 818)
	@Override
	public final int method20109() {
		return this.anInt2810 + this.anInt2809 + this.anInt2811;
	}

	@OriginalMember(owner = "client!aed", name = "fv", descriptor = "()I", line = 818)
	@Override
	public final int method20373() {
		return this.anInt2810 + this.anInt2809 + this.anInt2811;
	}

	@OriginalMember(owner = "client!aed", name = "r", descriptor = "()I", line = 818)
	@Override
	public final int method20049() {
		return this.anInt2810 + this.anInt2809 + this.anInt2811;
	}

	@OriginalMember(owner = "client!aed", name = "ca", descriptor = "(IIZZ)Lclient!cy;", line = 822)
	@Override
	public final Class83 method20102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aed", name = "jl", descriptor = "(IIZZ)Lclient!cy;", line = 822)
	@Override
	public final Class83 method20350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aed", name = "jo", descriptor = "(IIZZ)Lclient!cy;", line = 822)
	@Override
	public final Class83 method20181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aed", name = "ct", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 827)
	@Override
	public final Class83 method20076(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class83 local21;
		if (arg0.method6682() == 0 || arg0.method6683() == 0) {
			local21 = this.method20010(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method6686(false);
			local21 = this.method20010(local9, 0, arg0.method6682(), arg0.method6682(), arg0.method6683());
		}
		local21.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local21;
	}

	@OriginalMember(owner = "client!aed", name = "nk", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 827)
	@Override
	public final Class83 method20071(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) Class83 local21;
		if (arg0.method6682() == 0 || arg0.method6683() == 0) {
			local21 = this.method20010(new int[] { 0 }, 0, 1, 1, 1);
		} else {
			@Pc(9) int[] local9 = arg0.method6686(false);
			local21 = this.method20010(local9, 0, arg0.method6682(), arg0.method6682(), arg0.method6683());
		}
		local21.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local21;
	}

	@OriginalMember(owner = "client!aed", name = "cr", descriptor = "([IIIIIZ)Lclient!cy;", line = 837)
	@Override
	public final Class83 method20103(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class83_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "jn", descriptor = "([IIIIIZ)Lclient!cy;", line = 837)
	@Override
	public final Class83 method20128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class83_Sub2(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "cv", descriptor = "(IIIIZ)Lclient!cy;", line = 841)
	@Override
	public final Class83 method20105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class83_Sub2 local8 = new Class83_Sub2(this, arg2, arg3, arg4, false);
		local8.method18213(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!aed", name = "jd", descriptor = "(IIIIZ)Lclient!cy;", line = 841)
	@Override
	public final Class83 method20253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class83_Sub2 local8 = new Class83_Sub2(this, arg2, arg3, arg4, false);
		local8.method18213(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!aed", name = "jk", descriptor = "(IIIIZ)Lclient!cy;", line = 841)
	@Override
	public final Class83 method20254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class83_Sub2 local8 = new Class83_Sub2(this, arg2, arg3, arg4, false);
		local8.method18213(0, 0, arg2, arg3, arg0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!aed", name = "jp", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 847)
	@Override
	public final Class94 method20267(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "jx", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 847)
	@Override
	public final Class94 method20256(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "cq", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 847)
	@Override
	public final Class94 method20111(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "jg", descriptor = "(II[I[I)Lclient!cd;", line = 851)
	@Override
	public final Class90 method20246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class90_Sub1.method5112(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aed", name = "co", descriptor = "(II[I[I)Lclient!cd;", line = 851)
	@Override
	public final Class90 method20362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class90_Sub1.method5112(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aed", name = "jh", descriptor = "(I)V", line = 854)
	@Override
	public final void method20257(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aed", name = "cd", descriptor = "(I)V", line = 854)
	@Override
	public final void method20114(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aed", name = "cj", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 857)
	@Override
	public final Class84 method20115(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "jw", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 857)
	@Override
	public final Class84 method20258(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aed", name = "ce", descriptor = "(II)I", line = 861)
	@Override
	public final int method20116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aed", name = "jy", descriptor = "(II)I", line = 861)
	@Override
	public final int method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aed", name = "jb", descriptor = "(II)I", line = 861)
	@Override
	public final int method20259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aed", name = "do", descriptor = "(II)I", line = 865)
	@Override
	public final int method20117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aed", name = "ns", descriptor = "(II)I", line = 865)
	@Override
	public final int method20156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aed", name = "dt", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 869)
	@Override
	public final Class88 method20118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "ja", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 869)
	@Override
	public final Class88 method20273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "nj", descriptor = "()Lclient!oi;", line = 873)
	@Override
	public final Class442 method20341() {
		return this.aClass442_81;
	}

	@OriginalMember(owner = "client!aed", name = "cy", descriptor = "()Lclient!oi;", line = 873)
	@Override
	public final Class442 method20282() {
		return this.aClass442_81;
	}

	@OriginalMember(owner = "client!aed", name = "nb", descriptor = "()Lclient!oi;", line = 873)
	@Override
	public final Class442 method20122() {
		return this.aClass442_81;
	}

	@OriginalMember(owner = "client!aed", name = "cs", descriptor = "()Lclient!ow;", line = 877)
	@Override
	public final Class455 method20370() {
		return this.aClass455_40;
	}

	@OriginalMember(owner = "client!aed", name = "jc", descriptor = "()Lclient!ow;", line = 877)
	@Override
	public final Class455 method20261() {
		return this.aClass455_40;
	}

	@OriginalMember(owner = "client!aed", name = "dk", descriptor = "(I)Lclient!da;", line = 881)
	@Override
	public final Class91 method20251(@OriginalArg(0) int arg0) {
		return new Class91_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "kk", descriptor = "(I)Lclient!da;", line = 881)
	@Override
	public final Class91 method20297(@OriginalArg(0) int arg0) {
		return new Class91_Sub2_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "df", descriptor = "(Lclient!da;)V", line = 885)
	@Override
	public final void method20133(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub2_3 = (Class91_Sub2) arg0;
	}

	@OriginalMember(owner = "client!aed", name = "ke", descriptor = "(Lclient!da;)V", line = 885)
	@Override
	public final void method20289(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub2_3 = (Class91_Sub2) arg0;
	}

	@OriginalMember(owner = "client!aed", name = "sl", descriptor = "()Lclient!le;", line = 889)
	public final Interface40 method20458() {
		return this.aClass91_Sub2_3 == null ? null : this.aClass91_Sub2_3.method18668();
	}

	@OriginalMember(owner = "client!aed", name = "yh", descriptor = "()Lclient!le;", line = 889)
	public final Interface40 method20459() {
		return this.aClass91_Sub2_3 == null ? null : this.aClass91_Sub2_3.method18668();
	}

	@OriginalMember(owner = "client!aed", name = "ym", descriptor = "()Lclient!le;", line = 889)
	public final Interface40 method20460() {
		return this.aClass91_Sub2_3 == null ? null : this.aClass91_Sub2_3.method18668();
	}

	@OriginalMember(owner = "client!aed", name = "bv", descriptor = "()V", line = 893)
	@Override
	public void method20078() {
		this.anInt2817 = 0;
		this.anInt2842 = 0;
		this.anInt2827 = this.aClass92_6.method23491();
		this.anInt2819 = this.aClass92_6.method23493();
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "ht", descriptor = "()V", line = 893)
	@Override
	public void method20209() {
		this.anInt2817 = 0;
		this.anInt2842 = 0;
		this.anInt2827 = this.aClass92_6.method23491();
		this.anInt2819 = this.aClass92_6.method23493();
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "hu", descriptor = "()V", line = 893)
	@Override
	public void method20207() {
		this.anInt2817 = 0;
		this.anInt2842 = 0;
		this.anInt2827 = this.aClass92_6.method23491();
		this.anInt2819 = this.aClass92_6.method23493();
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "hw", descriptor = "()V", line = 893)
	@Override
	public void method20208() {
		this.anInt2817 = 0;
		this.anInt2842 = 0;
		this.anInt2827 = this.aClass92_6.method23491();
		this.anInt2819 = this.aClass92_6.method23493();
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "hz", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2817 = arg0;
		this.anInt2842 = arg1;
		this.anInt2827 = arg2;
		this.anInt2819 = arg3;
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "ba", descriptor = "(IIII)V", line = 901)
	@Override
	public void method20104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2817 = arg0;
		this.anInt2842 = arg1;
		this.anInt2827 = arg2;
		this.anInt2819 = arg3;
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "bl", descriptor = "([I)V", line = 909)
	@Override
	public void method20080(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2817;
		arg0[1] = this.anInt2842;
		arg0[2] = this.anInt2827;
		arg0[3] = this.anInt2819;
	}

	@OriginalMember(owner = "client!aed", name = "nl", descriptor = "([I)V", line = 909)
	@Override
	public void method20343(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2817;
		arg0[1] = this.anInt2842;
		arg0[2] = this.anInt2827;
		arg0[3] = this.anInt2819;
	}

	@OriginalMember(owner = "client!aed", name = "nv", descriptor = "([I)V", line = 909)
	@Override
	public void method20344(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2817;
		arg0[1] = this.anInt2842;
		arg0[2] = this.anInt2827;
		arg0[3] = this.anInt2819;
	}

	@OriginalMember(owner = "client!aed", name = "yt", descriptor = "()V", line = 916)
	final void method20461() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.anInt2820 = this.anInt2817;
			this.anInt2821 = this.anInt2842;
			this.anInt2822 = this.anInt2827;
			this.anInt2829 = this.anInt2819;
			this.aFloat193 = this.aFloat192;
			this.aFloat194 = this.aFloat200;
		} else {
			this.anInt2820 = 0;
			this.anInt2821 = 0;
			this.anInt2822 = this.aClass92_6.method23491();
			this.anInt2829 = this.aClass92_6.method23493();
			this.aFloat193 = 0.0F;
			this.aFloat194 = 1.0F;
		}
		this.method20617();
		this.aFloat197 = (float) this.anInt2827 / 2.0F;
		this.aFloat199 = (float) this.anInt2819 / 2.0F;
		this.aFloat207 = (float) this.anInt2817 + this.aFloat197;
		this.aFloat198 = (float) this.anInt2842 + this.aFloat199;
	}

	@OriginalMember(owner = "client!aed", name = "ye", descriptor = "()V", line = 916)
	final void method20462() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.anInt2820 = this.anInt2817;
			this.anInt2821 = this.anInt2842;
			this.anInt2822 = this.anInt2827;
			this.anInt2829 = this.anInt2819;
			this.aFloat193 = this.aFloat192;
			this.aFloat194 = this.aFloat200;
		} else {
			this.anInt2820 = 0;
			this.anInt2821 = 0;
			this.anInt2822 = this.aClass92_6.method23491();
			this.anInt2829 = this.aClass92_6.method23493();
			this.aFloat193 = 0.0F;
			this.aFloat194 = 1.0F;
		}
		this.method20617();
		this.aFloat197 = (float) this.anInt2827 / 2.0F;
		this.aFloat199 = (float) this.anInt2819 / 2.0F;
		this.aFloat207 = (float) this.anInt2817 + this.aFloat197;
		this.aFloat198 = (float) this.anInt2842 + this.aFloat199;
	}

	@OriginalMember(owner = "client!aed", name = "zk", descriptor = "()V", line = 916)
	final void method20463() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.anInt2820 = this.anInt2817;
			this.anInt2821 = this.anInt2842;
			this.anInt2822 = this.anInt2827;
			this.anInt2829 = this.anInt2819;
			this.aFloat193 = this.aFloat192;
			this.aFloat194 = this.aFloat200;
		} else {
			this.anInt2820 = 0;
			this.anInt2821 = 0;
			this.anInt2822 = this.aClass92_6.method23491();
			this.anInt2829 = this.aClass92_6.method23493();
			this.aFloat193 = 0.0F;
			this.aFloat194 = 1.0F;
		}
		this.method20617();
		this.aFloat197 = (float) this.anInt2827 / 2.0F;
		this.aFloat199 = (float) this.anInt2819 / 2.0F;
		this.aFloat207 = (float) this.anInt2817 + this.aFloat197;
		this.aFloat198 = (float) this.anInt2842 + this.aFloat199;
	}

	@OriginalMember(owner = "client!aed", name = "sj", descriptor = "()V", line = 916)
	final void method20464() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.anInt2820 = this.anInt2817;
			this.anInt2821 = this.anInt2842;
			this.anInt2822 = this.anInt2827;
			this.anInt2829 = this.anInt2819;
			this.aFloat193 = this.aFloat192;
			this.aFloat194 = this.aFloat200;
		} else {
			this.anInt2820 = 0;
			this.anInt2821 = 0;
			this.anInt2822 = this.aClass92_6.method23491();
			this.anInt2829 = this.aClass92_6.method23493();
			this.aFloat193 = 0.0F;
			this.aFloat194 = 1.0F;
		}
		this.method20617();
		this.aFloat197 = (float) this.anInt2827 / 2.0F;
		this.aFloat199 = (float) this.anInt2819 / 2.0F;
		this.aFloat207 = (float) this.anInt2817 + this.aFloat197;
		this.aFloat198 = (float) this.anInt2842 + this.aFloat199;
	}

	@OriginalMember(owner = "client!aed", name = "hq", descriptor = "(FF)V", line = 940)
	@Override
	public void method20211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat192 = arg0;
		this.aFloat200 = arg1;
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "bb", descriptor = "(FF)V", line = 940)
	@Override
	public void method20081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat192 = arg0;
		this.aFloat200 = arg1;
		this.method20464();
	}

	@OriginalMember(owner = "client!aed", name = "if", descriptor = "([I)V", line = 946)
	@Override
	public final void method20234(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "bi", descriptor = "([I)V", line = 946)
	@Override
	public final void method20142(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "hx", descriptor = "([I)V", line = 946)
	@Override
	public final void method20319(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "ho", descriptor = "([I)V", line = 946)
	@Override
	public final void method20222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "ib", descriptor = "([I)V", line = 946)
	@Override
	public final void method20159(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "iq", descriptor = "([I)V", line = 946)
	@Override
	public final void method20101(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "he", descriptor = "([I)V", line = 946)
	@Override
	public final void method20221(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2815;
		arg0[1] = this.anInt2813;
		arg0[2] = this.anInt2816;
		arg0[3] = this.anInt2814;
	}

	@OriginalMember(owner = "client!aed", name = "bd", descriptor = "()V", line = 953)
	@Override
	public final void method20299() {
		if (this.aClass92_6 == null) {
			this.anInt2814 = 0;
			this.anInt2816 = 0;
			this.anInt2813 = 0;
			this.anInt2815 = 0;
		} else {
			this.anInt2813 = 0;
			this.anInt2815 = 0;
			this.anInt2816 = this.aClass92_6.method23491();
			this.anInt2814 = this.aClass92_6.method23493();
		}
		if (this.aBoolean461) {
			this.aBoolean461 = false;
			this.method20619();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hj", descriptor = "()V", line = 953)
	@Override
	public final void method20286() {
		if (this.aClass92_6 == null) {
			this.anInt2814 = 0;
			this.anInt2816 = 0;
			this.anInt2813 = 0;
			this.anInt2815 = 0;
		} else {
			this.anInt2813 = 0;
			this.anInt2815 = 0;
			this.anInt2816 = this.aClass92_6.method23491();
			this.anInt2814 = this.aClass92_6.method23493();
		}
		if (this.aBoolean461) {
			this.aBoolean461 = false;
			this.method20619();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hr", descriptor = "()V", line = 953)
	@Override
	public final void method20212() {
		if (this.aClass92_6 == null) {
			this.anInt2814 = 0;
			this.anInt2816 = 0;
			this.anInt2813 = 0;
			this.anInt2815 = 0;
		} else {
			this.anInt2813 = 0;
			this.anInt2815 = 0;
			this.anInt2816 = this.aClass92_6.method23491();
			this.anInt2814 = this.aClass92_6.method23493();
		}
		if (this.aBoolean461) {
			this.aBoolean461 = false;
			this.method20619();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hh", descriptor = "()V", line = 953)
	@Override
	public final void method20214() {
		if (this.aClass92_6 == null) {
			this.anInt2814 = 0;
			this.anInt2816 = 0;
			this.anInt2813 = 0;
			this.anInt2815 = 0;
		} else {
			this.anInt2813 = 0;
			this.anInt2815 = 0;
			this.anInt2816 = this.aClass92_6.method23491();
			this.anInt2814 = this.aClass92_6.method23493();
		}
		if (this.aBoolean461) {
			this.aBoolean461 = false;
			this.method20619();
		}
	}

	@OriginalMember(owner = "client!aed", name = "by", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20299();
			return;
		}
		this.anInt2815 = arg0 >= 0 ? arg0 : 0;
		this.anInt2816 = arg2 <= local6 ? arg2 : local6;
		this.anInt2813 = arg1 >= 0 ? arg1 : 0;
		this.anInt2814 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hb", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20299();
			return;
		}
		this.anInt2815 = arg0 >= 0 ? arg0 : 0;
		this.anInt2816 = arg2 <= local6 ? arg2 : local6;
		this.anInt2813 = arg1 >= 0 ? arg1 : 0;
		this.anInt2814 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hg", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20299();
			return;
		}
		this.anInt2815 = arg0 >= 0 ? arg0 : 0;
		this.anInt2816 = arg2 <= local6 ? arg2 : local6;
		this.anInt2813 = arg1 >= 0 ? arg1 : 0;
		this.anInt2814 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hv", descriptor = "(IIII)V", line = 974)
	@Override
	public final void method20216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		if (arg0 <= 0 && arg2 >= local6 - 1 && arg1 <= 0 && arg3 >= local10 - 1) {
			this.method20299();
			return;
		}
		this.anInt2815 = arg0 >= 0 ? arg0 : 0;
		this.anInt2816 = arg2 <= local6 ? arg2 : local6;
		this.anInt2813 = arg1 >= 0 ? arg1 : 0;
		this.anInt2814 = arg3 <= local10 ? arg3 : local10;
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "bx", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2815 < local21) {
			this.anInt2815 = local21;
			local43 = true;
		}
		if (this.anInt2816 > local28) {
			this.anInt2816 = local28;
			local43 = true;
		}
		if (this.anInt2813 < local34) {
			this.anInt2813 = local34;
			local43 = true;
		}
		if (this.anInt2814 > local41) {
			this.anInt2814 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hm", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2815 < local21) {
			this.anInt2815 = local21;
			local43 = true;
		}
		if (this.anInt2816 > local28) {
			this.anInt2816 = local28;
			local43 = true;
		}
		if (this.anInt2813 < local34) {
			this.anInt2813 = local34;
			local43 = true;
		}
		if (this.anInt2814 > local41) {
			this.anInt2814 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hk", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2815 < local21) {
			this.anInt2815 = local21;
			local43 = true;
		}
		if (this.anInt2816 > local28) {
			this.anInt2816 = local28;
			local43 = true;
		}
		if (this.anInt2813 < local34) {
			this.anInt2813 = local34;
			local43 = true;
		}
		if (this.anInt2814 > local41) {
			this.anInt2814 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hs", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2815 < local21) {
			this.anInt2815 = local21;
			local43 = true;
		}
		if (this.anInt2816 > local28) {
			this.anInt2816 = local28;
			local43 = true;
		}
		if (this.anInt2813 < local34) {
			this.anInt2813 = local34;
			local43 = true;
		}
		if (this.anInt2814 > local41) {
			this.anInt2814 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "hy", descriptor = "(IIII)V", line = 1000)
	@Override
	public final void method20218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		if (this.aClass92_6 == null) {
			local10 = 0;
			local6 = 0;
		} else {
			local6 = this.aClass92_6.method23491();
			local10 = this.aClass92_6.method23493();
		}
		@Pc(21) int local21 = arg0 >= 0 ? arg0 : 0;
		@Pc(28) int local28 = arg2 <= local6 ? arg2 : local6;
		@Pc(34) int local34 = arg1 >= 0 ? arg1 : 0;
		@Pc(41) int local41 = arg3 <= local10 ? arg3 : local10;
		@Pc(43) boolean local43 = false;
		if (this.anInt2815 < local21) {
			this.anInt2815 = local21;
			local43 = true;
		}
		if (this.anInt2816 > local28) {
			this.anInt2816 = local28;
			local43 = true;
		}
		if (this.anInt2813 < local34) {
			this.anInt2813 = local34;
			local43 = true;
		}
		if (this.anInt2814 > local41) {
			this.anInt2814 = local41;
			local43 = true;
		}
		if (!local43) {
			return;
		}
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "sd", descriptor = "(II)V", line = 1039)
	final void method20465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2798 = arg0;
		this.anInt2825 = arg1;
		this.method20617();
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "zt", descriptor = "(II)V", line = 1039)
	final void method20466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2798 = arg0;
		this.anInt2825 = arg1;
		this.method20617();
		if (!this.aBoolean461 && (this.aBoolean460 || this.method20438() == Class369.aClass369_2)) {
			this.aBoolean461 = true;
			this.method20619();
		}
		if (this.aBoolean461) {
			this.method20618();
		}
	}

	@OriginalMember(owner = "client!aed", name = "pw", descriptor = "(Z)V", line = 1050)
	@Override
	public void method19980(@OriginalArg(0) boolean arg0) {
		this.aBoolean460 = arg0;
	}

	@OriginalMember(owner = "client!aed", name = "bw", descriptor = "(Z)V", line = 1050)
	@Override
	public void method19979(@OriginalArg(0) boolean arg0) {
		this.aBoolean460 = arg0;
	}

	@OriginalMember(owner = "client!aed", name = "se", descriptor = "()Lclient!oi;", line = 1058)
	final Class442 method20467() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_79 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "zc", descriptor = "()Lclient!oi;", line = 1058)
	final Class442 method20468() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_79 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "zj", descriptor = "()Lclient!oi;", line = 1058)
	final Class442 method20469() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_79 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "zb", descriptor = "()Lclient!oi;", line = 1058)
	final Class442 method20470() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_79 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "zu", descriptor = "()Lclient!oi;", line = 1063)
	final Class442 method20471() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_78 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "sz", descriptor = "()Lclient!oi;", line = 1063)
	final Class442 method20472() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_78 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "zy", descriptor = "()Lclient!oi;", line = 1063)
	final Class442 method20473() {
		return this.aClass357_3 == Class357.aClass357_4 ? this.aClass442_78 : aClass442_90;
	}

	@OriginalMember(owner = "client!aed", name = "kg", descriptor = "(Lclient!ow;)V", line = 1068)
	@Override
	public final void method20270(@OriginalArg(0) Class455 arg0) {
		this.aClass455_36 = arg0;
		this.aClass442_79.method28969(this.aClass455_36);
		this.aClass442_80.method28954(this.aClass442_79);
		this.aClass442_80.method29034();
		this.aClass455_37.method29387(arg0);
		this.aClass455_37.method29409();
		this.aClass442_78.method28969(this.aClass455_37);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20475();
		}
	}

	@OriginalMember(owner = "client!aed", name = "kq", descriptor = "(Lclient!ow;)V", line = 1068)
	@Override
	public final void method20271(@OriginalArg(0) Class455 arg0) {
		this.aClass455_36 = arg0;
		this.aClass442_79.method28969(this.aClass455_36);
		this.aClass442_80.method28954(this.aClass442_79);
		this.aClass442_80.method29034();
		this.aClass455_37.method29387(arg0);
		this.aClass455_37.method29409();
		this.aClass442_78.method28969(this.aClass455_37);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20475();
		}
	}

	@OriginalMember(owner = "client!aed", name = "dn", descriptor = "(Lclient!ow;)V", line = 1068)
	@Override
	public final void method20121(@OriginalArg(0) Class455 arg0) {
		this.aClass455_36 = arg0;
		this.aClass442_79.method28969(this.aClass455_36);
		this.aClass442_80.method28954(this.aClass442_79);
		this.aClass442_80.method29034();
		this.aClass455_37.method29387(arg0);
		this.aClass455_37.method29409();
		this.aClass442_78.method28969(this.aClass455_37);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20475();
		}
	}

	@OriginalMember(owner = "client!aed", name = "kc", descriptor = "(Lclient!ow;)V", line = 1068)
	@Override
	public final void method20272(@OriginalArg(0) Class455 arg0) {
		this.aClass455_36 = arg0;
		this.aClass442_79.method28969(this.aClass455_36);
		this.aClass442_80.method28954(this.aClass442_79);
		this.aClass442_80.method29034();
		this.aClass455_37.method29387(arg0);
		this.aClass455_37.method29409();
		this.aClass442_78.method28969(this.aClass455_37);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20475();
		}
	}

	@OriginalMember(owner = "client!aed", name = "dv", descriptor = "()Lclient!ow;", line = 1080)
	@Override
	public Class455 method20294() {
		return this.aClass455_36;
	}

	@OriginalMember(owner = "client!aed", name = "qz", descriptor = "()Lclient!ow;", line = 1080)
	@Override
	public Class455 method20061() {
		return this.aClass455_36;
	}

	@OriginalMember(owner = "client!aed", name = "ql", descriptor = "()Lclient!ow;", line = 1080)
	@Override
	public Class455 method20375() {
		return this.aClass455_36;
	}

	@OriginalMember(owner = "client!aed", name = "dy", descriptor = "(Lclient!oi;)V", line = 1084)
	@Override
	public final void method20123(@OriginalArg(0) Class442 arg0) {
		this.aClass442_89.method28954(arg0);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "kw", descriptor = "(Lclient!oi;)V", line = 1084)
	@Override
	public final void method20163(@OriginalArg(0) Class442 arg0) {
		this.aClass442_89.method28954(arg0);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "km", descriptor = "(Lclient!oi;)V", line = 1084)
	@Override
	public final void method20274(@OriginalArg(0) Class442 arg0) {
		this.aClass442_89.method28954(arg0);
		this.method20474();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "sr", descriptor = "()V", line = 1090)
	final void method20474() {
		this.aClass442_93.method28954(this.aClass442_79);
		this.aClass442_93.method28965(this.aClass442_89);
		this.aClass442_93.method29028(this.aFloatArrayArray21[0]);
		this.aClass442_93.method29033(this.aFloatArrayArray21[1]);
		this.aClass442_93.method29018(this.aFloatArrayArray21[2]);
		this.aClass442_93.method29022(this.aFloatArrayArray21[3]);
		this.aClass442_93.method29023(this.aFloatArrayArray21[4]);
		this.aClass442_93.method29026(this.aFloatArrayArray21[5]);
		this.aClass442_84.method28954(this.aClass442_93);
		this.method20675(this.aClass442_84);
	}

	@OriginalMember(owner = "client!aed", name = "dm", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20124() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "kf", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20276() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "kh", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20278() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "kx", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20279() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "kr", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20277() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "kv", descriptor = "()Lclient!oi;", line = 1103)
	@Override
	public final Class442 method20275() {
		return this.aClass442_89;
	}

	@OriginalMember(owner = "client!aed", name = "sk", descriptor = "()V", line = 1107)
	final void method20475() {
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!aed", name = "su", descriptor = "()Lclient!oi;", line = 1111)
	Class442 method20476() {
		return this.aClass442_86;
	}

	@OriginalMember(owner = "client!aed", name = "zs", descriptor = "()Lclient!oi;", line = 1111)
	Class442 method20477() {
		return this.aClass442_86;
	}

	@OriginalMember(owner = "client!aed", name = "zm", descriptor = "()Lclient!oi;", line = 1111)
	Class442 method20478() {
		return this.aClass442_86;
	}

	@OriginalMember(owner = "client!aed", name = "sc", descriptor = "()Lclient!ow;", line = 1115)
	Class455 method20479() {
		if (this.aClass357_3 != Class357.aClass357_4) {
			return this.aClass455_35;
		}
		if (!this.aBoolean437) {
			this.aClass455_39.method29387(this.aClass455_35);
			this.aClass455_39.method29438(this.aClass455_36);
			this.aClass442_94.method28969(this.aClass455_39);
			this.aBoolean437 = true;
		}
		return this.aClass455_39;
	}

	@OriginalMember(owner = "client!aed", name = "th", descriptor = "()Lclient!oi;", line = 1130)
	Class442 method20480() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			if (!this.aBoolean437) {
				this.method20479();
			}
			return this.aClass442_94;
		} else {
			return this.aClass442_86;
		}
	}

	@OriginalMember(owner = "client!aed", name = "zv", descriptor = "()Lclient!oi;", line = 1130)
	Class442 method20481() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			if (!this.aBoolean437) {
				this.method20479();
			}
			return this.aClass442_94;
		} else {
			return this.aClass442_86;
		}
	}

	@OriginalMember(owner = "client!aed", name = "ti", descriptor = "()Lclient!oi;", line = 1140)
	final Class442 method20482() {
		return this.aClass442_84;
	}

	@OriginalMember(owner = "client!aed", name = "zn", descriptor = "()Lclient!oi;", line = 1140)
	final Class442 method20483() {
		return this.aClass442_84;
	}

	@OriginalMember(owner = "client!aed", name = "tv", descriptor = "()Lclient!oi;", line = 1144)
	final Class442 method20484() {
		return this.aClass442_88;
	}

	@OriginalMember(owner = "client!aed", name = "zg", descriptor = "()Lclient!oi;", line = 1144)
	final Class442 method20485() {
		return this.aClass442_88;
	}

	@OriginalMember(owner = "client!aed", name = "zw", descriptor = "()Lclient!oi;", line = 1144)
	final Class442 method20486() {
		return this.aClass442_88;
	}

	@OriginalMember(owner = "client!aed", name = "tz", descriptor = "()V", line = 1150)
	final void method20487() {
		if (this.aClass357_3 == Class357.aClass357_6) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_3;
		this.aClass357_3 = Class357.aClass357_6;
		if (local6 == Class357.aClass357_4) {
			this.method20475();
		}
		this.aClass442_91 = this.aClass442_83;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!aed", name = "zi", descriptor = "()V", line = 1150)
	final void method20488() {
		if (this.aClass357_3 == Class357.aClass357_6) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_3;
		this.aClass357_3 = Class357.aClass357_6;
		if (local6 == Class357.aClass357_4) {
			this.method20475();
		}
		this.aClass442_91 = this.aClass442_83;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!aed", name = "tj", descriptor = "()V", line = 1162)
	final void method20489() {
		if (this.aClass357_3 == Class357.aClass357_5) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_3;
		this.aClass357_3 = Class357.aClass357_5;
		if (local6 == Class357.aClass357_4) {
			this.method20475();
		}
		this.method20501();
		this.aClass442_91 = this.aClass442_85;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aed", name = "zx", descriptor = "()V", line = 1162)
	final void method20490() {
		if (this.aClass357_3 == Class357.aClass357_5) {
			return;
		}
		@Pc(6) Class357 local6 = this.aClass357_3;
		this.aClass357_3 = Class357.aClass357_5;
		if (local6 == Class357.aClass357_4) {
			this.method20475();
		}
		this.method20501();
		this.aClass442_91 = this.aClass442_85;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aed", name = "td", descriptor = "()V", line = 1175)
	final void method20491() {
		this.aBoolean446 = false;
		if (this.aClass357_3 == Class357.aClass357_5) {
			this.method20501();
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "zf", descriptor = "()V", line = 1175)
	final void method20492() {
		this.aBoolean446 = false;
		if (this.aClass357_3 == Class357.aClass357_5) {
			this.method20501();
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ze", descriptor = "()V", line = 1183)
	final void method20493() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			return;
		}
		this.aClass357_3 = Class357.aClass357_4;
		this.method20475();
		this.method20506();
		this.aClass442_91 = this.aClass442_89;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aed", name = "zz", descriptor = "()V", line = 1183)
	final void method20494() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			return;
		}
		this.aClass357_3 = Class357.aClass357_4;
		this.method20475();
		this.method20506();
		this.aClass442_91 = this.aClass442_89;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aed", name = "tc", descriptor = "()V", line = 1183)
	final void method20495() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			return;
		}
		this.aClass357_3 = Class357.aClass357_4;
		this.method20475();
		this.method20506();
		this.aClass442_91 = this.aClass442_89;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aed", name = "aap", descriptor = "()V", line = 1183)
	final void method20496() {
		if (this.aClass357_3 == Class357.aClass357_4) {
			return;
		}
		this.aClass357_3 = Class357.aClass357_4;
		this.method20475();
		this.method20506();
		this.aClass442_91 = this.aClass442_89;
		this.method20509();
		this.method20464();
		this.anInt2846 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aed", name = "tm", descriptor = "()V", line = 1195)
	final void method20497() {
		this.aBoolean445 = false;
		this.method20506();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "aaf", descriptor = "()V", line = 1195)
	final void method20498() {
		this.aBoolean445 = false;
		this.method20506();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "aaa", descriptor = "()V", line = 1195)
	final void method20499() {
		this.aBoolean445 = false;
		this.method20506();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "aak", descriptor = "()V", line = 1195)
	final void method20500() {
		this.aBoolean445 = false;
		this.method20506();
		if (this.aClass357_3 == Class357.aClass357_4) {
			this.method20509();
		}
	}

	@OriginalMember(owner = "client!aed", name = "tn", descriptor = "()V", line = 1201)
	final void method20501() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass92_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass92_6.method23491();
			local13 = this.aClass92_6.method23493();
		}
		@Pc(21) Class442 local21 = this.aClass442_85;
		if (local9 == 0 || local13 == 0) {
			local21.method28951();
		} else {
			local21.method28995(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass442_92.method28954(local21);
		this.method20675(this.aClass442_92);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!aed", name = "aac", descriptor = "()V", line = 1201)
	final void method20502() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass92_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass92_6.method23491();
			local13 = this.aClass92_6.method23493();
		}
		@Pc(21) Class442 local21 = this.aClass442_85;
		if (local9 == 0 || local13 == 0) {
			local21.method28951();
		} else {
			local21.method28995(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass442_92.method28954(local21);
		this.method20675(this.aClass442_92);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!aed", name = "aat", descriptor = "()V", line = 1201)
	final void method20503() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass92_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass92_6.method23491();
			local13 = this.aClass92_6.method23493();
		}
		@Pc(21) Class442 local21 = this.aClass442_85;
		if (local9 == 0 || local13 == 0) {
			local21.method28951();
		} else {
			local21.method28995(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass442_92.method28954(local21);
		this.method20675(this.aClass442_92);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!aed", name = "aam", descriptor = "()V", line = 1201)
	final void method20504() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass92_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass92_6.method23491();
			local13 = this.aClass92_6.method23493();
		}
		@Pc(21) Class442 local21 = this.aClass442_85;
		if (local9 == 0 || local13 == 0) {
			local21.method28951();
		} else {
			local21.method28995(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass442_92.method28954(local21);
		this.method20675(this.aClass442_92);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!aed", name = "aar", descriptor = "()V", line = 1201)
	final void method20505() {
		if (this.aBoolean446) {
			return;
		}
		@Pc(9) int local9;
		@Pc(13) int local13;
		if (this.aClass92_6 == null) {
			local13 = 0;
			local9 = 0;
		} else {
			local9 = this.aClass92_6.method23491();
			local13 = this.aClass92_6.method23493();
		}
		@Pc(21) Class442 local21 = this.aClass442_85;
		if (local9 == 0 || local13 == 0) {
			local21.method28951();
		} else {
			local21.method28995(0.0F, (float) local9, 0.0F, (float) local13, -1.0F, 1.0F);
		}
		this.aClass442_92.method28954(local21);
		this.method20675(this.aClass442_92);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!aed", name = "tk", descriptor = "()V", line = 1224)
	final void method20506() {
		if (!this.aBoolean445) {
			this.aBoolean445 = true;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aaq", descriptor = "()V", line = 1224)
	final void method20507() {
		if (!this.aBoolean445) {
			this.aBoolean445 = true;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aae", descriptor = "()V", line = 1224)
	final void method20508() {
		if (!this.aBoolean445) {
			this.aBoolean445 = true;
		}
	}

	@OriginalMember(owner = "client!aed", name = "ty", descriptor = "()V", line = 1230)
	final void method20509() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "aaj", descriptor = "()V", line = 1230)
	final void method20510() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "aan", descriptor = "()V", line = 1230)
	final void method20511() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "aas", descriptor = "()V", line = 1230)
	final void method20512() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "aau", descriptor = "()V", line = 1230)
	final void method20513() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "aav", descriptor = "()V", line = 1230)
	final void method20514() {
		this.aClass442_88.method28954(this.aClass442_91);
		this.method20675(this.aClass442_88);
		this.aFloat202 = (this.aClass442_88.aFloatArray109[14] - this.aClass442_88.aFloatArray109[15]) / (this.aClass442_88.aFloatArray109[11] - this.aClass442_88.aFloatArray109[10]);
		this.aFloat201 = -this.aClass442_88.aFloatArray109[14] / this.aClass442_88.aFloatArray109[10];
		this.method20587();
	}

	@OriginalMember(owner = "client!aed", name = "nh", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20048(@OriginalArg(0) boolean arg0) {
		this.aBoolean440 = arg0;
		this.method20624();
	}

	@OriginalMember(owner = "client!aed", name = "da", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20230(@OriginalArg(0) boolean arg0) {
		this.aBoolean440 = arg0;
		this.method20624();
	}

	@OriginalMember(owner = "client!aed", name = "na", descriptor = "(Z)V", line = 1238)
	@Override
	public final void method20346(@OriginalArg(0) boolean arg0) {
		this.aBoolean440 = arg0;
		this.method20624();
	}

	@OriginalMember(owner = "client!aed", name = "te", descriptor = "(Z)V", line = 1243)
	final void method20515(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method20623();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aax", descriptor = "(Z)V", line = 1243)
	final void method20516(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method20623();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aaw", descriptor = "(Z)V", line = 1243)
	final void method20517(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method20623();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aal", descriptor = "(Z)V", line = 1243)
	final void method20518(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method20623();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "to", descriptor = "(Z)V", line = 1251)
	final void method20519(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean441) {
			this.aBoolean441 = arg0;
			this.method20624();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aab", descriptor = "(Z)V", line = 1251)
	final void method20520(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean441) {
			this.aBoolean441 = arg0;
			this.method20624();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aay", descriptor = "(Z)V", line = 1251)
	final void method20521(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean441) {
			this.aBoolean441 = arg0;
			this.method20624();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "mk", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * arg0 + this.aClass442_93.aFloatArray109[7] * arg1 + this.aClass442_93.aFloatArray109[11] * arg2;
		@Pc(59) float local59 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * arg0 + this.aClass442_93.aFloatArray109[4] * arg1 + this.aClass442_93.aFloatArray109[8] * arg2;
		@Pc(89) float local89 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * arg0 + this.aClass442_93.aFloatArray109[5] * arg1 + this.aClass442_93.aFloatArray109[9] * arg2;
		@Pc(119) float local119 = this.aClass442_79.aFloatArray109[14] + this.aClass442_79.aFloatArray109[2] * arg0 + this.aClass442_79.aFloatArray109[6] * arg1 + this.aClass442_79.aFloatArray109[10] * arg2;
		arg3[0] = this.aFloat207 + this.aFloat197 * local59 / local29;
		arg3[1] = this.aFloat198 + this.aFloat199 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aed", name = "ex", descriptor = "(FFF[F)V", line = 1262)
	@Override
	public void method20148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * arg0 + this.aClass442_93.aFloatArray109[7] * arg1 + this.aClass442_93.aFloatArray109[11] * arg2;
		@Pc(59) float local59 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * arg0 + this.aClass442_93.aFloatArray109[4] * arg1 + this.aClass442_93.aFloatArray109[8] * arg2;
		@Pc(89) float local89 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * arg0 + this.aClass442_93.aFloatArray109[5] * arg1 + this.aClass442_93.aFloatArray109[9] * arg2;
		@Pc(119) float local119 = this.aClass442_79.aFloatArray109[14] + this.aClass442_79.aFloatArray109[2] * arg0 + this.aClass442_79.aFloatArray109[6] * arg1 + this.aClass442_79.aFloatArray109[10] * arg2;
		arg3[0] = this.aFloat207 + this.aFloat197 * local59 / local29;
		arg3[1] = this.aFloat198 + this.aFloat199 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aed", name = "en", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20147(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * arg0 + this.aClass442_93.aFloatArray109[6] * arg1 + this.aClass442_93.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * arg0 + this.aClass442_93.aFloatArray109[7] * arg1 + this.aClass442_93.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * arg0 + this.aClass442_93.aFloatArray109[4] * arg1 + this.aClass442_93.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * arg0 + this.aClass442_93.aFloatArray109[5] * arg1 + this.aClass442_93.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_79.aFloatArray109[14] + this.aClass442_79.aFloatArray109[2] * arg0 + this.aClass442_79.aFloatArray109[6] * arg1 + this.aClass442_79.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat207 + this.aFloat197 * local115 / local59;
			arg3[1] = this.aFloat198 + this.aFloat199 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aed", name = "my", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * arg0 + this.aClass442_93.aFloatArray109[6] * arg1 + this.aClass442_93.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * arg0 + this.aClass442_93.aFloatArray109[7] * arg1 + this.aClass442_93.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * arg0 + this.aClass442_93.aFloatArray109[4] * arg1 + this.aClass442_93.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * arg0 + this.aClass442_93.aFloatArray109[5] * arg1 + this.aClass442_93.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_79.aFloatArray109[14] + this.aClass442_79.aFloatArray109[2] * arg0 + this.aClass442_79.aFloatArray109[6] * arg1 + this.aClass442_79.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat207 + this.aFloat197 * local115 / local59;
			arg3[1] = this.aFloat198 + this.aFloat199 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aed", name = "mo", descriptor = "(FFF[F)V", line = 1272)
	@Override
	public void method20143(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * arg0 + this.aClass442_93.aFloatArray109[6] * arg1 + this.aClass442_93.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * arg0 + this.aClass442_93.aFloatArray109[7] * arg1 + this.aClass442_93.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * arg0 + this.aClass442_93.aFloatArray109[4] * arg1 + this.aClass442_93.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * arg0 + this.aClass442_93.aFloatArray109[5] * arg1 + this.aClass442_93.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_79.aFloatArray109[14] + this.aClass442_79.aFloatArray109[2] * arg0 + this.aClass442_79.aFloatArray109[6] * arg1 + this.aClass442_79.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat207 + this.aFloat197 * local115 / local59;
			arg3[1] = this.aFloat198 + this.aFloat199 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aed", name = "cf", descriptor = "(IIIIII)I", line = 1307)
	@Override
	public int method20097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * (float) arg0 + this.aClass442_93.aFloatArray109[6] * (float) arg1 + this.aClass442_93.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * (float) arg3 + this.aClass442_93.aFloatArray109[6] * (float) arg4 + this.aClass442_93.aFloatArray109[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * (float) arg0 + this.aClass442_93.aFloatArray109[7] * (float) arg1 + this.aClass442_93.aFloatArray109[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * (float) arg3 + this.aClass442_93.aFloatArray109[7] * (float) arg4 + this.aClass442_93.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * (float) arg0 + this.aClass442_93.aFloatArray109[4] * (float) arg1 + this.aClass442_93.aFloatArray109[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * (float) arg3 + this.aClass442_93.aFloatArray109[4] * (float) arg4 + this.aClass442_93.aFloatArray109[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * (float) arg0 + this.aClass442_93.aFloatArray109[5] * (float) arg1 + this.aClass442_93.aFloatArray109[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * (float) arg3 + this.aClass442_93.aFloatArray109[5] * (float) arg4 + this.aClass442_93.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aed", name = "io", descriptor = "(IIIIII)I", line = 1307)
	@Override
	public int method20242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * (float) arg0 + this.aClass442_93.aFloatArray109[6] * (float) arg1 + this.aClass442_93.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass442_93.aFloatArray109[14] + this.aClass442_93.aFloatArray109[2] * (float) arg3 + this.aClass442_93.aFloatArray109[6] * (float) arg4 + this.aClass442_93.aFloatArray109[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * (float) arg0 + this.aClass442_93.aFloatArray109[7] * (float) arg1 + this.aClass442_93.aFloatArray109[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass442_93.aFloatArray109[15] + this.aClass442_93.aFloatArray109[3] * (float) arg3 + this.aClass442_93.aFloatArray109[7] * (float) arg4 + this.aClass442_93.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * (float) arg0 + this.aClass442_93.aFloatArray109[4] * (float) arg1 + this.aClass442_93.aFloatArray109[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass442_93.aFloatArray109[12] + this.aClass442_93.aFloatArray109[0] * (float) arg3 + this.aClass442_93.aFloatArray109[4] * (float) arg4 + this.aClass442_93.aFloatArray109[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * (float) arg0 + this.aClass442_93.aFloatArray109[5] * (float) arg1 + this.aClass442_93.aFloatArray109[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass442_93.aFloatArray109[13] + this.aClass442_93.aFloatArray109[1] * (float) arg3 + this.aClass442_93.aFloatArray109[5] * (float) arg4 + this.aClass442_93.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aed", name = "cp", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1326)
	@Override
	boolean method20098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_93);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "il", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1326)
	@Override
	boolean method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_93);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "ih", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1326)
	@Override
	boolean method20243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_93);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "ie", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1326)
	@Override
	boolean method20244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_93);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "iv", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1333)
	@Override
	public void method20245(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg0);
		local2.method28965(this.aClass442_93);
		arg1.method25775(arg2, this.aClass442_89, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "cw", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1333)
	@Override
	public void method20099(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.aClass442_87;
		local2.method28969(arg0);
		local2.method28965(this.aClass442_93);
		arg1.method25775(arg2, this.aClass442_89, local2, this.aFloat207, this.aFloat198, this.aFloat197, this.aFloat199);
	}

	@OriginalMember(owner = "client!aed", name = "dp", descriptor = "()I", line = 1340)
	@Override
	public final int method20129() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "jq", descriptor = "()I", line = 1340)
	@Override
	public final int method20263() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "ju", descriptor = "()I", line = 1340)
	@Override
	public final int method20264() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "jf", descriptor = "()I", line = 1340)
	@Override
	public final int method20266() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "je", descriptor = "()I", line = 1340)
	@Override
	public final int method20265() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "jm", descriptor = "()I", line = 1340)
	@Override
	public final int method20262() {
		return this.anInt2849 - 2;
	}

	@OriginalMember(owner = "client!aed", name = "tu", descriptor = "(Z)V", line = 1344)
	final void method20522(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method20629();
			this.anInt2846 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aag", descriptor = "(Z)V", line = 1344)
	final void method20523(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method20629();
			this.anInt2846 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aaz", descriptor = "(Z)V", line = 1344)
	final void method20524(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method20629();
			this.anInt2846 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aad", descriptor = "(Z)V", line = 1344)
	final void method20525(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean436) {
			this.aBoolean436 = arg0;
			this.method20629();
			this.anInt2846 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aed", name = "jj", descriptor = "(I[Lclient!ajv;)V", line = 1352)
	@Override
	public final void method20367(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array18[local1] = arg1[local1];
		}
		this.anInt2806 = arg0;
	}

	@OriginalMember(owner = "client!aed", name = "jt", descriptor = "(I[Lclient!ajv;)V", line = 1352)
	@Override
	public final void method20268(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array18[local1] = arg1[local1];
		}
		this.anInt2806 = arg0;
	}

	@OriginalMember(owner = "client!aed", name = "du", descriptor = "(I[Lclient!ajv;)V", line = 1352)
	@Override
	public final void method20365(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array18[local1] = arg1[local1];
		}
		this.anInt2806 = arg0;
	}

	@OriginalMember(owner = "client!aed", name = "dz", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20255(@OriginalArg(0) float arg0) {
		if (this.aFloat203 != arg0) {
			this.aFloat203 = arg0;
			this.method20668();
			this.method20698();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ko", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20378(@OriginalArg(0) float arg0) {
		if (this.aFloat203 != arg0) {
			this.aFloat203 = arg0;
			this.method20668();
			this.method20698();
		}
	}

	@OriginalMember(owner = "client!aed", name = "kn", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20280(@OriginalArg(0) float arg0) {
		if (this.aFloat203 != arg0) {
			this.aFloat203 = arg0;
			this.method20668();
			this.method20698();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ka", descriptor = "(F)V", line = 1357)
	@Override
	public final void method20281(@OriginalArg(0) float arg0) {
		if (this.aFloat203 != arg0) {
			this.aFloat203 = arg0;
			this.method20668();
			this.method20698();
		}
	}

	@OriginalMember(owner = "client!aed", name = "nr", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2826 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat204 != local11 || this.aFloat208 != local15) {
			this.anInt2826 = arg0;
			this.aFloat204 = local11;
			this.aFloat208 = local15;
			if (local7) {
				this.aFloat195 = (float) (this.anInt2826 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2826 & 0xFF00) / 65280.0F;
				this.aFloat196 = (float) (this.anInt2826 & 0xFF) / 255.0F;
				this.method20668();
			}
			this.method20631();
		}
		if (this.aFloatArray73[0] != arg3 || this.aFloatArray73[1] != arg4 || this.aFloatArray73[2] != arg5) {
			this.aFloatArray73[0] = arg3;
			this.aFloatArray73[1] = arg4;
			this.aFloatArray73[2] = arg5;
			this.aFloatArray74[0] = -arg3;
			this.aFloatArray74[1] = -arg4;
			this.aFloatArray74[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray71[0] = arg3 * local140;
			this.aFloatArray71[1] = arg4 * local140;
			this.aFloatArray71[2] = arg5 * local140;
			this.aFloatArray72[0] = -this.aFloatArray71[0];
			this.aFloatArray72[1] = -this.aFloatArray71[1];
			this.aFloatArray72[2] = -this.aFloatArray71[2];
			this.method20689();
			this.anInt2831 = (int) (arg3 * 256.0F / arg4);
			this.anInt2851 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20698();
	}

	@OriginalMember(owner = "client!aed", name = "nw", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20131(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2826 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat204 != local11 || this.aFloat208 != local15) {
			this.anInt2826 = arg0;
			this.aFloat204 = local11;
			this.aFloat208 = local15;
			if (local7) {
				this.aFloat195 = (float) (this.anInt2826 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2826 & 0xFF00) / 65280.0F;
				this.aFloat196 = (float) (this.anInt2826 & 0xFF) / 255.0F;
				this.method20668();
			}
			this.method20631();
		}
		if (this.aFloatArray73[0] != arg3 || this.aFloatArray73[1] != arg4 || this.aFloatArray73[2] != arg5) {
			this.aFloatArray73[0] = arg3;
			this.aFloatArray73[1] = arg4;
			this.aFloatArray73[2] = arg5;
			this.aFloatArray74[0] = -arg3;
			this.aFloatArray74[1] = -arg4;
			this.aFloatArray74[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray71[0] = arg3 * local140;
			this.aFloatArray71[1] = arg4 * local140;
			this.aFloatArray71[2] = arg5 * local140;
			this.aFloatArray72[0] = -this.aFloatArray71[0];
			this.aFloatArray72[1] = -this.aFloatArray71[1];
			this.aFloatArray72[2] = -this.aFloatArray71[2];
			this.method20689();
			this.anInt2831 = (int) (arg3 * 256.0F / arg4);
			this.anInt2851 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20698();
	}

	@OriginalMember(owner = "client!aed", name = "dw", descriptor = "(IFFFFF)V", line = 1365)
	@Override
	public final void method20126(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2826 != arg0;
		@Pc(11) float local11 = arg1 * 0.5F;
		@Pc(15) float local15 = arg2 * 0.5F;
		if (local7 || this.aFloat204 != local11 || this.aFloat208 != local15) {
			this.anInt2826 = arg0;
			this.aFloat204 = local11;
			this.aFloat208 = local15;
			if (local7) {
				this.aFloat195 = (float) (this.anInt2826 & 0xFF0000) / 1.671168E7F;
				this.aFloat209 = (float) (this.anInt2826 & 0xFF00) / 65280.0F;
				this.aFloat196 = (float) (this.anInt2826 & 0xFF) / 255.0F;
				this.method20668();
			}
			this.method20631();
		}
		if (this.aFloatArray73[0] != arg3 || this.aFloatArray73[1] != arg4 || this.aFloatArray73[2] != arg5) {
			this.aFloatArray73[0] = arg3;
			this.aFloatArray73[1] = arg4;
			this.aFloatArray73[2] = arg5;
			this.aFloatArray74[0] = -arg3;
			this.aFloatArray74[1] = -arg4;
			this.aFloatArray74[2] = -arg5;
			@Pc(140) float local140 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray71[0] = arg3 * local140;
			this.aFloatArray71[1] = arg4 * local140;
			this.aFloatArray71[2] = arg5 * local140;
			this.aFloatArray72[0] = -this.aFloatArray71[0];
			this.aFloatArray72[1] = -this.aFloatArray71[1];
			this.aFloatArray72[2] = -this.aFloatArray71[2];
			this.method20689();
			this.anInt2831 = (int) (arg3 * 256.0F / arg4);
			this.anInt2851 = (int) (arg5 * 256.0F / arg4);
		}
		this.method20698();
	}

	@OriginalMember(owner = "client!aed", name = "kp", descriptor = "(I)V", line = 1402)
	@Override
	public final void method20283(@OriginalArg(0) int arg0) {
		this.anInt2830 = 0;
		while (arg0 > 1) {
			this.anInt2830++;
			arg0 >>= 0x1;
		}
		this.anInt2823 = 0x1 << this.anInt2830;
	}

	@OriginalMember(owner = "client!aed", name = "kl", descriptor = "(I)V", line = 1402)
	@Override
	public final void method20284(@OriginalArg(0) int arg0) {
		this.anInt2830 = 0;
		while (arg0 > 1) {
			this.anInt2830++;
			arg0 >>= 0x1;
		}
		this.anInt2823 = 0x1 << this.anInt2830;
	}

	@OriginalMember(owner = "client!aed", name = "di", descriptor = "(I)V", line = 1402)
	@Override
	public final void method20127(@OriginalArg(0) int arg0) {
		this.anInt2830 = 0;
		while (arg0 > 1) {
			this.anInt2830++;
			arg0 >>= 0x1;
		}
		this.anInt2823 = 0x1 << this.anInt2830;
	}

	@OriginalMember(owner = "client!aed", name = "abn", descriptor = "()V", line = 1418)
	final void method20526() {
		if (this.method20390()) {
			this.method20647();
		}
		this.anInt2828 = this.anInt2806;
	}

	@OriginalMember(owner = "client!aed", name = "tb", descriptor = "()V", line = 1418)
	final void method20527() {
		if (this.method20390()) {
			this.method20647();
		}
		this.anInt2828 = this.anInt2806;
	}

	@OriginalMember(owner = "client!aed", name = "abr", descriptor = "()V", line = 1418)
	final void method20528() {
		if (this.method20390()) {
			this.method20647();
		}
		this.anInt2828 = this.anInt2806;
	}

	@OriginalMember(owner = "client!aed", name = "abu", descriptor = "()V", line = 1418)
	final void method20529() {
		if (this.method20390()) {
			this.method20647();
		}
		this.anInt2828 = this.anInt2806;
	}

	@OriginalMember(owner = "client!aed", name = "uo", descriptor = "(IIZ[I)Lclient!ks;", line = 1429)
	final Interface37 method20530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20693(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abz", descriptor = "(IIZ[I)Lclient!ks;", line = 1429)
	final Interface37 method20531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20693(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abo", descriptor = "(IIZ[I)Lclient!ks;", line = 1429)
	final Interface37 method20532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		return this.method20693(arg0, arg1, arg2, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "up", descriptor = "(Lclient!dt;IIZ[B)Lclient!ks;", line = 1433)
	final Interface37 method20533(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20635(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abc", descriptor = "(Lclient!dt;IIZ[B)Lclient!ks;", line = 1433)
	final Interface37 method20534(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4) {
		return this.method20635(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abt", descriptor = "(Lclient!dt;IIZ[F)Lclient!ks;", line = 1437)
	final Interface37 method20535(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20636(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "ub", descriptor = "(Lclient!dt;IIZ[F)Lclient!ks;", line = 1437)
	final Interface37 method20536(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20636(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abm", descriptor = "(Lclient!dt;IIZ[F)Lclient!ks;", line = 1437)
	final Interface37 method20537(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20636(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "abe", descriptor = "(Lclient!dt;IIZ[F)Lclient!ks;", line = 1437)
	final Interface37 method20538(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4) {
		return this.method20636(arg0, arg1, arg2, arg3, arg4, 0, 0);
	}

	@OriginalMember(owner = "client!aed", name = "uc", descriptor = "()I", line = 1449)
	public final int method20539() {
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!aed", name = "uv", descriptor = "(I)V", line = 1453)
	public final void method20540(@OriginalArg(0) int arg0) {
		if (this.anInt2832 != arg0) {
			this.anInt2832 = arg0;
			this.method20644();
		}
	}

	@OriginalMember(owner = "client!aed", name = "acc", descriptor = "(I)V", line = 1453)
	public final void method20541(@OriginalArg(0) int arg0) {
		if (this.anInt2832 != arg0) {
			this.anInt2832 = arg0;
			this.method20644();
		}
	}

	@OriginalMember(owner = "client!aed", name = "uz", descriptor = "(Lclient!ls;)V", line = 1460)
	public final void method20542(@OriginalArg(0) Interface42 arg0) {
		if (this.anInterface42Array3[this.anInt2832] == arg0) {
			return;
		}
		this.anInterface42Array3[this.anInt2832] = arg0;
		if (arg0 == null) {
			this.anInterface37_23.method10865();
		} else {
			arg0.method10865();
		}
		this.anInt2846 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aed", name = "acd", descriptor = "(Lclient!ls;)V", line = 1460)
	public final void method20543(@OriginalArg(0) Interface42 arg0) {
		if (this.anInterface42Array3[this.anInt2832] == arg0) {
			return;
		}
		this.anInterface42Array3[this.anInt2832] = arg0;
		if (arg0 == null) {
			this.anInterface37_23.method10865();
		} else {
			arg0.method10865();
		}
		this.anInt2846 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aed", name = "acx", descriptor = "(Lclient!ls;)V", line = 1460)
	public final void method20544(@OriginalArg(0) Interface42 arg0) {
		if (this.anInterface42Array3[this.anInt2832] == arg0) {
			return;
		}
		this.anInterface42Array3[this.anInt2832] = arg0;
		if (arg0 == null) {
			this.anInterface37_23.method10865();
		} else {
			arg0.method10865();
		}
		this.anInt2846 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aed", name = "ui", descriptor = "(I)V", line = 1471)
	public final void method20545(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method20550(Class388.aClass388_2, Class388.aClass388_2);
				break;
			case 1:
				this.method20550(Class388.aClass388_5, Class388.aClass388_5);
				break;
			case 2:
				this.method20550(Class388.aClass388_4, Class388.aClass388_5);
				break;
			case 3:
				this.method20550(Class388.aClass388_3, Class388.aClass388_2);
				break;
			case 4:
				this.method20550(Class388.aClass388_1, Class388.aClass388_1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "acu", descriptor = "(I)V", line = 1471)
	public final void method20546(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method20550(Class388.aClass388_2, Class388.aClass388_2);
				break;
			case 1:
				this.method20550(Class388.aClass388_5, Class388.aClass388_5);
				break;
			case 2:
				this.method20550(Class388.aClass388_4, Class388.aClass388_5);
				break;
			case 3:
				this.method20550(Class388.aClass388_3, Class388.aClass388_2);
				break;
			case 4:
				this.method20550(Class388.aClass388_1, Class388.aClass388_1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "acs", descriptor = "(I)V", line = 1471)
	public final void method20547(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				this.method20550(Class388.aClass388_2, Class388.aClass388_2);
				break;
			case 1:
				this.method20550(Class388.aClass388_5, Class388.aClass388_5);
				break;
			case 2:
				this.method20550(Class388.aClass388_4, Class388.aClass388_5);
				break;
			case 3:
				this.method20550(Class388.aClass388_3, Class388.aClass388_2);
				break;
			case 4:
				this.method20550(Class388.aClass388_1, Class388.aClass388_1);
		}
	}

	@OriginalMember(owner = "client!aed", name = "acz", descriptor = "(Lclient!lv;Lclient!lv;)V", line = 1491)
	public final void method20548(@OriginalArg(0) Class388 arg0, @OriginalArg(1) Class388 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass388Array6[this.anInt2832] != arg0) {
			this.aClass388Array6[this.anInt2832] = arg0;
			this.method20645();
			local1 = true;
		}
		if (this.aClass388Array5[this.anInt2832] != arg1) {
			this.aClass388Array5[this.anInt2832] = arg1;
			this.method20646();
			local1 = true;
		}
		if (local1) {
			this.anInt2846 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aed", name = "acj", descriptor = "(Lclient!lv;Lclient!lv;)V", line = 1491)
	public final void method20549(@OriginalArg(0) Class388 arg0, @OriginalArg(1) Class388 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass388Array6[this.anInt2832] != arg0) {
			this.aClass388Array6[this.anInt2832] = arg0;
			this.method20645();
			local1 = true;
		}
		if (this.aClass388Array5[this.anInt2832] != arg1) {
			this.aClass388Array5[this.anInt2832] = arg1;
			this.method20646();
			local1 = true;
		}
		if (local1) {
			this.anInt2846 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aed", name = "uj", descriptor = "(Lclient!lv;Lclient!lv;)V", line = 1491)
	public final void method20550(@OriginalArg(0) Class388 arg0, @OriginalArg(1) Class388 arg1) {
		@Pc(1) boolean local1 = false;
		if (this.aClass388Array6[this.anInt2832] != arg0) {
			this.aClass388Array6[this.anInt2832] = arg0;
			this.method20645();
			local1 = true;
		}
		if (this.aClass388Array5[this.anInt2832] != arg1) {
			this.aClass388Array5[this.anInt2832] = arg1;
			this.method20646();
			local1 = true;
		}
		if (local1) {
			this.anInt2846 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aed", name = "ut", descriptor = "(ILclient!lp;)V", line = 1508)
	public final void method20551(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20642(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!aed", name = "acn", descriptor = "(ILclient!lp;)V", line = 1508)
	public final void method20552(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20642(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!aed", name = "acr", descriptor = "(ILclient!lp;)V", line = 1508)
	public final void method20553(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20642(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!aed", name = "uw", descriptor = "(ILclient!lp;)V", line = 1514)
	public final void method20554(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20702(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!aed", name = "adg", descriptor = "(ILclient!lp;)V", line = 1514)
	public final void method20555(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20702(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!aed", name = "adn", descriptor = "(ILclient!lp;)V", line = 1514)
	public final void method20556(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1) {
		this.method20702(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!aed", name = "adw", descriptor = "(I)V", line = 1520)
	public void method20557(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2833) {
			this.anInt2833 = arg0;
			this.method20643();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ud", descriptor = "(I)V", line = 1520)
	public void method20558(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2833) {
			this.anInt2833 = arg0;
			this.method20643();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ady", descriptor = "(I)V", line = 1520)
	public void method20559(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2833) {
			this.anInt2833 = arg0;
			this.method20643();
		}
	}

	@OriginalMember(owner = "client!aed", name = "adq", descriptor = "(I)V", line = 1520)
	public void method20560(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2833) {
			this.anInt2833 = arg0;
			this.method20643();
		}
	}

	@OriginalMember(owner = "client!aed", name = "uf", descriptor = "()Lclient!oi;", line = 1527)
	final Class442 method20561() {
		return this.aClass442Array6[this.anInt2832];
	}

	@OriginalMember(owner = "client!aed", name = "adj", descriptor = "()Lclient!oi;", line = 1527)
	final Class442 method20562() {
		return this.aClass442Array6[this.anInt2832];
	}

	@OriginalMember(owner = "client!aed", name = "adx", descriptor = "()Lclient!oi;", line = 1527)
	final Class442 method20563() {
		return this.aClass442Array6[this.anInt2832];
	}

	@OriginalMember(owner = "client!aed", name = "um", descriptor = "()Lclient!oi;", line = 1531)
	public final Class442 method20564() {
		return this.aClass442Array6[this.anInt2832];
	}

	@OriginalMember(owner = "client!aed", name = "adi", descriptor = "()Lclient!oi;", line = 1531)
	public final Class442 method20565() {
		return this.aClass442Array6[this.anInt2832];
	}

	@OriginalMember(owner = "client!aed", name = "ux", descriptor = "(Lclient!lh;)V", line = 1535)
	public final void method20566(@OriginalArg(0) Class377 arg0) {
		this.aClass377Array3[this.anInt2832] = arg0;
		this.method20572();
	}

	@OriginalMember(owner = "client!aed", name = "adf", descriptor = "(Lclient!lh;)V", line = 1535)
	public final void method20567(@OriginalArg(0) Class377 arg0) {
		this.aClass377Array3[this.anInt2832] = arg0;
		this.method20572();
	}

	@OriginalMember(owner = "client!aed", name = "ado", descriptor = "()V", line = 1540)
	final void method20568() {
		if (this.aClass377Array3[this.anInt2832] != Class377.aClass377_2) {
			this.aClass377Array3[this.anInt2832] = Class377.aClass377_2;
			this.aClass442Array6[this.anInt2832].method28951();
			this.method20572();
		}
	}

	@OriginalMember(owner = "client!aed", name = "uh", descriptor = "()V", line = 1540)
	final void method20569() {
		if (this.aClass377Array3[this.anInt2832] != Class377.aClass377_2) {
			this.aClass377Array3[this.anInt2832] = Class377.aClass377_2;
			this.aClass442Array6[this.anInt2832].method28951();
			this.method20572();
		}
	}

	@OriginalMember(owner = "client!aed", name = "adp", descriptor = "()V", line = 1540)
	final void method20570() {
		if (this.aClass377Array3[this.anInt2832] != Class377.aClass377_2) {
			this.aClass377Array3[this.anInt2832] = Class377.aClass377_2;
			this.aClass442Array6[this.anInt2832].method28951();
			this.method20572();
		}
	}

	@OriginalMember(owner = "client!aed", name = "adl", descriptor = "()V", line = 1540)
	final void method20571() {
		if (this.aClass377Array3[this.anInt2832] != Class377.aClass377_2) {
			this.aClass377Array3[this.anInt2832] = Class377.aClass377_2;
			this.aClass442Array6[this.anInt2832].method28951();
			this.method20572();
		}
	}

	@OriginalMember(owner = "client!aed", name = "vc", descriptor = "()V", line = 1548)
	final void method20572() {
		this.method20711();
	}

	@OriginalMember(owner = "client!aed", name = "adz", descriptor = "()V", line = 1548)
	final void method20573() {
		this.method20711();
	}

	@OriginalMember(owner = "client!aed", name = "adu", descriptor = "()V", line = 1548)
	final void method20574() {
		this.method20711();
	}

	@OriginalMember(owner = "client!aed", name = "vm", descriptor = "()Lclient!db;", line = 1558)
	Class202 method20575() {
		return this.aClass202_6;
	}

	@OriginalMember(owner = "client!aed", name = "adb", descriptor = "()Lclient!db;", line = 1558)
	Class202 method20576() {
		return this.aClass202_6;
	}

	@OriginalMember(owner = "client!aed", name = "aes", descriptor = "()Lclient!db;", line = 1558)
	Class202 method20577() {
		return this.aClass202_6;
	}

	@OriginalMember(owner = "client!aed", name = "aea", descriptor = "()Lclient!db;", line = 1558)
	Class202 method20578() {
		return this.aClass202_6;
	}

	@OriginalMember(owner = "client!aed", name = "ei", descriptor = "(ILclient!db;)V", line = 1562)
	@Override
	public final void method20145(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		this.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!aed", name = "li", descriptor = "(ILclient!db;)V", line = 1562)
	@Override
	public final void method20045(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		this.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!aed", name = "lr", descriptor = "(ILclient!db;)V", line = 1562)
	@Override
	public final void method20314(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		this.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!aed", name = "ed", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20146(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "mh", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20316(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "mf", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20225(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "mx", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ma", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "mu", descriptor = "(ILclient!db;)V", line = 1568)
	@Override
	public final void method20335(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt2839 = arg0;
		this.aClass202_6 = arg1;
		if (this.aBoolean448) {
			this.aClass122Array3[3].method18540();
			this.aClass122Array3[3].method18543();
		}
	}

	@OriginalMember(owner = "client!aed", name = "ee", descriptor = "()V", line = 1578)
	@Override
	public final void method20291() {
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!aed", name = "mw", descriptor = "()V", line = 1578)
	@Override
	public final void method20320() {
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!aed", name = "mq", descriptor = "()V", line = 1578)
	@Override
	public final void method20321() {
		this.aBoolean447 = false;
	}

	@OriginalMember(owner = "client!aed", name = "vl", descriptor = "(I)V", line = 1582)
	final void method20579(@OriginalArg(0) int arg0) {
		if (this.anInt2850 == arg0) {
			return;
		}
		@Pc(8) Class380 local8;
		@Pc(12) boolean local12;
		@Pc(10) boolean local10;
		if (arg0 == 1) {
			local8 = Class380.aClass380_7;
			local10 = true;
			local12 = true;
		} else if (arg0 == 2) {
			local8 = Class380.aClass380_4;
			local10 = false;
			local12 = true;
		} else if (arg0 == 128) {
			local8 = Class380.aClass380_6;
			local10 = true;
			local12 = true;
		} else if (arg0 == 3) {
			local8 = Class380.aClass380_5;
			local10 = true;
			local12 = false;
		} else {
			local8 = Class380.aClass380_5;
			local10 = false;
			local12 = false;
		}
		if (local10 != this.aBoolean435) {
			this.aBoolean435 = local10;
			this.method20650();
		}
		if (local12 != this.aBoolean452) {
			this.aBoolean452 = local12;
			this.method20652();
		}
		if (local8 != this.aClass380_3) {
			this.aClass380_3 = local8;
			this.method20651();
		}
		this.anInt2850 = arg0;
		this.anInt2846 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aed", name = "vd", descriptor = "(I)V", line = 1629)
	final void method20580(@OriginalArg(0) int arg0) {
		if (this.anInt2834 != arg0) {
			this.anInt2834 = arg0;
			this.method20651();
		}
	}

	@OriginalMember(owner = "client!aed", name = "aeu", descriptor = "(I)V", line = 1629)
	final void method20581(@OriginalArg(0) int arg0) {
		if (this.anInt2834 != arg0) {
			this.anInt2834 = arg0;
			this.method20651();
		}
	}

	@OriginalMember(owner = "client!aed", name = "aee", descriptor = "(B)V", line = 1636)
	final void method20582(@OriginalArg(0) byte arg0) {
		if (this.aByte68 == arg0) {
			return;
		}
		this.aByte68 = arg0;
		if (arg0 == 0) {
			this.method20580(0);
			this.method20579(1);
		} else {
			this.method20580(3);
			this.method20579(3);
		}
		this.method20650();
	}

	@OriginalMember(owner = "client!aed", name = "vy", descriptor = "(B)V", line = 1636)
	final void method20583(@OriginalArg(0) byte arg0) {
		if (this.aByte68 == arg0) {
			return;
		}
		this.aByte68 = arg0;
		if (arg0 == 0) {
			this.method20580(0);
			this.method20579(1);
		} else {
			this.method20580(3);
			this.method20579(3);
		}
		this.method20650();
	}

	@OriginalMember(owner = "client!aed", name = "vp", descriptor = "(Z)V", line = 1656)
	final void method20584(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean450) {
			this.aBoolean450 = arg0;
			this.method20667();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "aeg", descriptor = "(Z)V", line = 1656)
	final void method20585(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean450) {
			this.aBoolean450 = arg0;
			this.method20667();
			this.anInt2846 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aed", name = "kt", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2840 == arg0 && this.anInt2841 == arg1 && this.anInt2824 == arg2) {
			return;
		}
		this.anInt2840 = arg0;
		this.anInt2841 = arg1;
		this.anInt2824 = arg2;
		this.method20587();
		this.method20667();
	}

	@OriginalMember(owner = "client!aed", name = "kj", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2840 == arg0 && this.anInt2841 == arg1 && this.anInt2824 == arg2) {
			return;
		}
		this.anInt2840 = arg0;
		this.anInt2841 = arg1;
		this.anInt2824 = arg2;
		this.method20587();
		this.method20667();
	}

	@OriginalMember(owner = "client!aed", name = "ky", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2840 == arg0 && this.anInt2841 == arg1 && this.anInt2824 == arg2) {
			return;
		}
		this.anInt2840 = arg0;
		this.anInt2841 = arg1;
		this.anInt2824 = arg2;
		this.method20587();
		this.method20667();
	}

	@OriginalMember(owner = "client!aed", name = "kz", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2840 == arg0 && this.anInt2841 == arg1 && this.anInt2824 == arg2) {
			return;
		}
		this.anInt2840 = arg0;
		this.anInt2841 = arg1;
		this.anInt2824 = arg2;
		this.method20587();
		this.method20667();
	}

	@OriginalMember(owner = "client!aed", name = "dr", descriptor = "(III)V", line = 1664)
	@Override
	public final void method20232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2840 == arg0 && this.anInt2841 == arg1 && this.anInt2824 == arg2) {
			return;
		}
		this.anInt2840 = arg0;
		this.anInt2841 = arg1;
		this.anInt2824 = arg2;
		this.method20587();
		this.method20667();
	}

	@OriginalMember(owner = "client!aed", name = "aek", descriptor = "()V", line = 1674)
	final void method20586() {
		if (this.aClass122_3 != null) {
			this.aClass122_3.method18543();
		}
		this.method20684();
	}

	@OriginalMember(owner = "client!aed", name = "vr", descriptor = "()V", line = 1674)
	final void method20587() {
		if (this.aClass122_3 != null) {
			this.aClass122_3.method18543();
		}
		this.method20684();
	}

	@OriginalMember(owner = "client!aed", name = "nx", descriptor = "(ILclient!cd;II)V", line = 1689)
	@Override
	public final void method20338(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20230(false);
		this.aClass83_Sub2_6.method18183(0.0F, 0.0F, (float) this.method19940().method23491(), 0.0F, 0.0F, (float) this.method19940().method23493(), 0, arg1, arg2, arg3);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aed", name = "ne", descriptor = "(ILclient!cd;II)V", line = 1689)
	@Override
	public final void method20339(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20230(false);
		this.aClass83_Sub2_6.method18183(0.0F, 0.0F, (float) this.method19940().method23491(), 0.0F, 0.0F, (float) this.method19940().method23493(), 0, arg1, arg2, arg3);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aed", name = "cn", descriptor = "(ILclient!cd;II)V", line = 1689)
	@Override
	public final void method20110(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20230(false);
		this.aClass83_Sub2_6.method18183(0.0F, 0.0F, (float) this.method19940().method23491(), 0.0F, 0.0F, (float) this.method19940().method23493(), 0, arg1, arg2, arg3);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aed", name = "bm", descriptor = "(IIIIII)V", line = 1695)
	@Override
	public final void method20088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		if (this.aBoolean440) {
			this.method20230(false);
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20230(true);
		} else {
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "in", descriptor = "(IIIIII)V", line = 1695)
	@Override
	public final void method20231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		if (this.aBoolean440) {
			this.method20230(false);
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20230(true);
		} else {
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "ig", descriptor = "(IIIIII)V", line = 1695)
	@Override
	public final void method20360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		if (this.aBoolean440) {
			this.method20230(false);
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
			this.method20230(true);
		} else {
			this.aClass83_Sub2_5.method18129(arg0, arg1, arg2, arg3, 0, arg4, arg5);
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "it", descriptor = "(IIIIII)V", line = 1706)
	@Override
	public final void method20086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class86_Sub1_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		this.method20092(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20092(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20092(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20092(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "bp", descriptor = "(IIIIII)V", line = 1706)
	@Override
	public final void method20087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class86_Sub1_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		this.method20092(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20092(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20092(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20092(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "iw", descriptor = "(IIIIII)V", line = 1706)
	@Override
	public final void method20229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(0) int local0 = arg2 - 1;
		@Pc(1) int local1 = arg3 - 1;
		@Pc(3) byte local3 = 0;
		if (this instanceof Class86_Sub1_Sub2) {
			local3 = -1;
		}
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(false);
		}
		this.method20092(arg0, arg1 + local3, arg0 + local0, arg1 + local3, arg4, arg5);
		this.method20092(arg0, arg1 + local1 + local3, arg0 + local0, arg1 + local1 + local3, arg4, arg5);
		this.method20092(arg0, arg1, arg0, arg1 + local1, arg4, arg5);
		this.method20092(arg0 + local0, arg1, arg0 + local0, arg1 + local1, arg4, arg5);
		if (this.aBoolean453 && this.anInt2844 != 0) {
			this.method20655(true);
		}
	}

	@OriginalMember(owner = "client!aed", name = "bo", descriptor = "(IIFIIFIIFIIII)V", line = 1718)
	@Override
	public final void method20089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!aed", name = "mm", descriptor = "(IIFIIFIIFIIII)V", line = 1718)
	@Override
	public final void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
	}

	@OriginalMember(owner = "client!aed", name = "bk", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aed", name = "ic", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aed", name = "iy", descriptor = "(IIIII)V", line = 1719)
	@Override
	final void method20233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aed", name = "br", descriptor = "(IIIII)V", line = 1722)
	@Override
	final void method20057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "iu", descriptor = "(IIIII)V", line = 1722)
	@Override
	final void method20345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "bq", descriptor = "(IIIII)V", line = 1726)
	@Override
	final void method20377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "is", descriptor = "(IIIII)V", line = 1726)
	@Override
	final void method20155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aed", name = "bh", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20096(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!aed", name = "ix", descriptor = "(IIIIII)V", line = 1730)
	@Override
	public final void method20236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20096(arg0, arg1, arg2, arg3, arg4, 1, arg5);
	}

	@OriginalMember(owner = "client!aed", name = "cb", descriptor = "(IIIIIIIII)V", line = 1734)
	@Override
	public void method20094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20489();
		@Pc(50) Class122 local50 = this.aClass122Array3[13];
		local50.method18550();
		local50.method18539(arg4);
		this.method20579(arg5);
		local50.method18552();
		this.method20655(false);
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
			if (!this.method20435(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method20589();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method20655(true);
		local50.method18549();
	}

	@OriginalMember(owner = "client!aed", name = "iz", descriptor = "(IIIIIIIII)V", line = 1734)
	@Override
	public void method20237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) float local5 = (float) arg2 - (float) arg0;
		@Pc(11) float local11 = (float) arg3 - (float) arg1;
		if (local5 == 0.0F && local11 == 0.0F) {
			local5 = 1.0F;
		} else {
			@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local5 * local5 + local11 * local11)));
			local5 *= local35;
			local11 *= local35;
		}
		this.method20489();
		@Pc(50) Class122 local50 = this.aClass122Array3[13];
		local50.method18550();
		local50.method18539(arg4);
		this.method20579(arg5);
		local50.method18552();
		this.method20655(false);
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
			if (!this.method20435(local128, local133, 0.0F, local128 + local85, local133 + local87, 0.0F)) {
				return;
			}
			this.method20589();
			local128 += local138 + local85;
			local133 += local143 + local87;
			local85 = local74;
			local87 = local79;
		}
		this.method20655(true);
		local50.method18549();
	}

	@OriginalMember(owner = "client!aed", name = "cg", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1798)
	@Override
	public void method20095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!aed", name = "ij", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1798)
	@Override
	public void method20238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
	}

	@OriginalMember(owner = "client!aed", name = "be", descriptor = "(IIIIIILclient!cd;II)V", line = 1799)
	@Override
	public final void method20160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!aed", name = "ia", descriptor = "(IIIIIILclient!cd;II)V", line = 1799)
	@Override
	public final void method20205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!aed", name = "cc", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass83_Sub2_5.method18165((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!aed", name = "ik", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass83_Sub2_5.method18165((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!aed", name = "ir", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass83_Sub2_5.method18165((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!aed", name = "im", descriptor = "(IIIIIII)V", line = 1802)
	@Override
	public final void method20132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
		this.aClass83_Sub2_5.method18165((float) local60 - local78, (float) local66 - local85, (float) local17 - local78, (float) local23 - local85, (float) local60 + local78, (float) local66 + local85, 0, arg4, arg6);
	}

	@OriginalMember(owner = "client!aed", name = "dq", descriptor = "(Lclient!dm;)V", line = 1821)
	@Override
	public final void method20120(@OriginalArg(0) Class207 arg0) {
		this.aClass374_3.method28291(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "ji", descriptor = "(Lclient!dm;)V", line = 1821)
	@Override
	public final void method20269(@OriginalArg(0) Class207 arg0) {
		this.aClass374_3.method28291(this, arg0);
	}

	@OriginalMember(owner = "client!aed", name = "afl", descriptor = "()V", line = 1825)
	final void method20588() {
		this.method20670(0, this.anInterface36_16);
		this.method20658(this.aClass113_19);
		this.method20661(Class384.aClass384_6, 0, 1);
	}

	@OriginalMember(owner = "client!aed", name = "vq", descriptor = "()V", line = 1825)
	final void method20589() {
		this.method20670(0, this.anInterface36_16);
		this.method20658(this.aClass113_19);
		this.method20661(Class384.aClass384_6, 0, 1);
	}

	@OriginalMember(owner = "client!aed", name = "afo", descriptor = "()V", line = 1825)
	final void method20590() {
		this.method20670(0, this.anInterface36_16);
		this.method20658(this.aClass113_19);
		this.method20661(Class384.aClass384_6, 0, 1);
	}

	@OriginalMember(owner = "client!aed", name = "wf", descriptor = "()V", line = 1831)
	public final void method20591() {
		this.method20596(Class384.aClass384_1, 2);
	}

	@OriginalMember(owner = "client!aed", name = "afj", descriptor = "()V", line = 1831)
	public final void method20592() {
		this.method20596(Class384.aClass384_1, 2);
	}

	@OriginalMember(owner = "client!aed", name = "afb", descriptor = "()V", line = 1831)
	public final void method20593() {
		this.method20596(Class384.aClass384_1, 2);
	}

	@OriginalMember(owner = "client!aed", name = "afq", descriptor = "()V", line = 1831)
	public final void method20594() {
		this.method20596(Class384.aClass384_1, 2);
	}

	@OriginalMember(owner = "client!aed", name = "afi", descriptor = "()V", line = 1831)
	public final void method20595() {
		this.method20596(Class384.aClass384_1, 2);
	}

	@OriginalMember(owner = "client!aed", name = "wj", descriptor = "(Lclient!lq;I)V", line = 1835)
	final void method20596(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1) {
		this.method20670(0, this.anInterface36_15);
		this.method20658(this.aClass113_17);
		this.method20661(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!aed", name = "wo", descriptor = "()V", line = 1845)
	public final void method20597() {
		if (this.anInt2846 == 2) {
			return;
		}
		this.method20489();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 2;
	}

	@OriginalMember(owner = "client!aed", name = "afe", descriptor = "()V", line = 1845)
	public final void method20598() {
		if (this.anInt2846 == 2) {
			return;
		}
		this.method20489();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 2;
	}

	@OriginalMember(owner = "client!aed", name = "afs", descriptor = "()V", line = 1845)
	public final void method20599() {
		if (this.anInt2846 == 2) {
			return;
		}
		this.method20489();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 2;
	}

	@OriginalMember(owner = "client!aed", name = "wi", descriptor = "()V", line = 1858)
	final void method20600() {
		if (this.anInt2846 == 8) {
			return;
		}
		this.method20495();
		this.method20584(true);
		this.method20515(true);
		this.method20519(true);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 8;
	}

	@OriginalMember(owner = "client!aed", name = "afa", descriptor = "()V", line = 1858)
	final void method20601() {
		if (this.anInt2846 == 8) {
			return;
		}
		this.method20495();
		this.method20584(true);
		this.method20515(true);
		this.method20519(true);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 8;
	}

	@OriginalMember(owner = "client!aed", name = "afp", descriptor = "()V", line = 1858)
	final void method20602() {
		if (this.anInt2846 == 8) {
			return;
		}
		this.method20495();
		this.method20584(true);
		this.method20515(true);
		this.method20519(true);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 8;
	}

	@OriginalMember(owner = "client!aed", name = "afh", descriptor = "()V", line = 1858)
	final void method20603() {
		if (this.anInt2846 == 8) {
			return;
		}
		this.method20495();
		this.method20584(true);
		this.method20515(true);
		this.method20519(true);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 8;
	}

	@OriginalMember(owner = "client!aed", name = "afd", descriptor = "()V", line = 1858)
	final void method20604() {
		if (this.anInt2846 == 8) {
			return;
		}
		this.method20495();
		this.method20584(true);
		this.method20515(true);
		this.method20519(true);
		this.method20579(1);
		this.method20583((byte) 0);
		this.anInt2846 = 8;
	}

	@OriginalMember(owner = "client!aed", name = "afg", descriptor = "(CCCC)I", line = 1872)
	static int method20605(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "wc", descriptor = "(CCCC)I", line = 1872)
	static int method20606(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "afn", descriptor = "(CCCC)I", line = 1872)
	static int method20607(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "afk", descriptor = "(CCCC)I", line = 1872)
	static int method20608(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "afc", descriptor = "(CCCC)I", line = 1872)
	static int method20609(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "afz", descriptor = "(CCCC)I", line = 1872)
	static int method20610(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "afw", descriptor = "(CCCC)I", line = 1872)
	static int method20611(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2, @OriginalArg(3) char arg3) {
		return (arg0 & 0xFF) << 0 | (arg1 & 0xFF) << 8 | (arg2 & 0xFF) << 16 | (arg3 & 0xFF) << 24;
	}

	@OriginalMember(owner = "client!aed", name = "rn", descriptor = "(Z)Z")
	public abstract boolean method20612(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "ry", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public abstract Class112 method20613(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!aed", name = "wd", descriptor = "(Z)Z")
	public abstract boolean method20614(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "n", descriptor = "()Ljava/lang/String;")
	public abstract String method20059();

	@OriginalMember(owner = "client!aed", name = "zq", descriptor = "()V")
	abstract void method20615();

	@OriginalMember(owner = "client!aed", name = "ack", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;")
	abstract Interface34 method20616(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!aed", name = "sp", descriptor = "()V")
	abstract void method20617();

	@OriginalMember(owner = "client!aed", name = "sn", descriptor = "()V")
	abstract void method20618();

	@OriginalMember(owner = "client!aed", name = "sm", descriptor = "()V")
	abstract void method20619();

	@OriginalMember(owner = "client!aed", name = "wr", descriptor = "()Z")
	public abstract boolean method20620();

	@OriginalMember(owner = "client!aed", name = "aeo", descriptor = "()V")
	abstract void method20621();

	@OriginalMember(owner = "client!aed", name = "wg", descriptor = "(I)V")
	abstract void method20622(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "tr", descriptor = "()V")
	abstract void method20623();

	@OriginalMember(owner = "client!aed", name = "tg", descriptor = "()V")
	abstract void method20624();

	@OriginalMember(owner = "client!aed", name = "adv", descriptor = "()V")
	abstract void method20625();

	@OriginalMember(owner = "client!aed", name = "aeb", descriptor = "(Z)V")
	abstract void method20626(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "abh", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;")
	abstract Interface37 method20627(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "vj", descriptor = "(I)V")
	abstract void method20628(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "tp", descriptor = "()V")
	abstract void method20629();

	@OriginalMember(owner = "client!aed", name = "rg", descriptor = "()Z")
	public abstract boolean method20630();

	@OriginalMember(owner = "client!aed", name = "ts", descriptor = "()V")
	abstract void method20631();

	@OriginalMember(owner = "client!aed", name = "tw", descriptor = "()V")
	abstract void method20632();

	@OriginalMember(owner = "client!aed", name = "zh", descriptor = "()V")
	abstract void method20633();

	@OriginalMember(owner = "client!aed", name = "ul", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;")
	abstract Interface37 method20634(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "uy", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;")
	abstract Interface37 method20635(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aed", name = "uq", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;")
	abstract Interface37 method20636(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aed", name = "aba", descriptor = "(Lclient!dt;Lclient!dl;)Z")
	abstract boolean method20637(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1);

	@OriginalMember(owner = "client!aed", name = "uu", descriptor = "(IZ[[I)Lclient!le;")
	abstract Interface40 method20638(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!aed", name = "ug", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;")
	abstract Interface43 method20639(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "abp", descriptor = "()V")
	abstract void method20640();

	@OriginalMember(owner = "client!aed", name = "us", descriptor = "()V")
	public abstract void method20641();

	@OriginalMember(owner = "client!aed", name = "ua", descriptor = "(ILclient!lp;ZZ)V")
	abstract void method20642(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!aed", name = "vn", descriptor = "()V")
	abstract void method20643();

	@OriginalMember(owner = "client!aed", name = "vo", descriptor = "()V")
	abstract void method20644();

	@OriginalMember(owner = "client!aed", name = "vb", descriptor = "()V")
	abstract void method20645();

	@OriginalMember(owner = "client!aed", name = "ve", descriptor = "()V")
	abstract void method20646();

	@OriginalMember(owner = "client!aed", name = "tt", descriptor = "()V")
	abstract void method20647();

	@OriginalMember(owner = "client!aed", name = "agn", descriptor = "(ILclient!lp;Z)V")
	abstract void method20648(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!aed", name = "zd", descriptor = "()V")
	abstract void method20649();

	@OriginalMember(owner = "client!aed", name = "vu", descriptor = "()V")
	abstract void method20650();

	@OriginalMember(owner = "client!aed", name = "vt", descriptor = "()V")
	abstract void method20651();

	@OriginalMember(owner = "client!aed", name = "vi", descriptor = "()V")
	abstract void method20652();

	@OriginalMember(owner = "client!aed", name = "aei", descriptor = "()V")
	abstract void method20653();

	@OriginalMember(owner = "client!aed", name = "abv", descriptor = "()V")
	abstract void method20654();

	@OriginalMember(owner = "client!aed", name = "vw", descriptor = "(Z)V")
	abstract void method20655(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "vz", descriptor = "(Z)Lclient!kp;")
	abstract Interface36 method20656(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "vg", descriptor = "([Lclient!lz;)Lclient!kt;")
	abstract Class113 method20657(@OriginalArg(0) Class391[] arg0);

	@OriginalMember(owner = "client!aed", name = "va", descriptor = "(Lclient!kt;)V")
	public abstract void method20658(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!aed", name = "vv", descriptor = "(Lclient!lc;)V")
	abstract void method20659(@OriginalArg(0) Interface38 arg0);

	@OriginalMember(owner = "client!aed", name = "adc", descriptor = "()V")
	abstract void method20660();

	@OriginalMember(owner = "client!aed", name = "wt", descriptor = "(Lclient!lq;II)V")
	public abstract void method20661(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!aed", name = "wy", descriptor = "(Lclient!lc;Lclient!lq;IIII)V")
	abstract void method20662(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "wk", descriptor = "(Lclient!lq;IIII)V")
	public abstract void method20663(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aed", name = "sq", descriptor = "()F")
	public abstract float method20664();

	@OriginalMember(owner = "client!aed", name = "adk", descriptor = "()V")
	abstract void method20665();

	@OriginalMember(owner = "client!aed", name = "fh", descriptor = "()Ljava/lang/String;")
	public abstract String method20176();

	@OriginalMember(owner = "client!aed", name = "fn", descriptor = "()Ljava/lang/String;")
	public abstract String method20177();

	@OriginalMember(owner = "client!aed", name = "abk", descriptor = "()V")
	abstract void method20666();

	@OriginalMember(owner = "client!aed", name = "vs", descriptor = "()V")
	abstract void method20667();

	@OriginalMember(owner = "client!aed", name = "tq", descriptor = "()V")
	abstract void method20668();

	@OriginalMember(owner = "client!aed", name = "acp", descriptor = "(IIZ[III)Lclient!ks;")
	abstract Interface37 method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "vk", descriptor = "(ILclient!kp;)V")
	public abstract void method20670(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1);

	@OriginalMember(owner = "client!aed", name = "acl", descriptor = "(IIZ[III)Lclient!ks;")
	abstract Interface37 method20671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "abj", descriptor = "()V")
	abstract void method20672();

	@OriginalMember(owner = "client!aed", name = "xr", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public abstract Class112 method20673(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!aed", name = "acm", descriptor = "(IZ[[I)Lclient!le;")
	abstract Interface40 method20674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!aed", name = "tf", descriptor = "(Lclient!oi;)V")
	public abstract void method20675(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!aed", name = "tl", descriptor = "(Lclient!dt;Lclient!dl;)Z")
	abstract boolean method20676(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1);

	@OriginalMember(owner = "client!aed", name = "add", descriptor = "()V")
	abstract void method20677();

	@OriginalMember(owner = "client!aed", name = "xx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V")
	public abstract void method20678(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2);

	@OriginalMember(owner = "client!aed", name = "yg", descriptor = "()F")
	public abstract float method20679();

	@OriginalMember(owner = "client!aed", name = "wv", descriptor = "(Z)Z")
	public abstract boolean method20680(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "rp", descriptor = "()Z")
	public abstract boolean method20681();

	@OriginalMember(owner = "client!aed", name = "aej", descriptor = "(Lclient!kt;)V")
	public abstract void method20682(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!aed", name = "acy", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;")
	abstract Interface37 method20683(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aed", name = "vx", descriptor = "()V")
	abstract void method20684();

	@OriginalMember(owner = "client!aed", name = "wp", descriptor = "()Z")
	public abstract boolean method20685();

	@OriginalMember(owner = "client!aed", name = "wh", descriptor = "()Z")
	public abstract boolean method20686();

	@OriginalMember(owner = "client!aed", name = "wb", descriptor = "()Z")
	public abstract boolean method20687();

	@OriginalMember(owner = "client!aed", name = "wu", descriptor = "()Z")
	public abstract boolean method20688();

	@OriginalMember(owner = "client!aed", name = "tx", descriptor = "()V")
	abstract void method20689();

	@OriginalMember(owner = "client!aed", name = "wx", descriptor = "(Z)Z")
	public abstract boolean method20690(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "uk", descriptor = "(Lclient!dt;Lclient!dl;)Z")
	abstract boolean method20691(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1);

	@OriginalMember(owner = "client!aed", name = "xu", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public abstract Class112 method20692(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!aed", name = "un", descriptor = "(IIZ[III)Lclient!ks;")
	abstract Interface37 method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public abstract Class112 method20694(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!aed", name = "ads", descriptor = "()V")
	abstract void method20695();

	@OriginalMember(owner = "client!aed", name = "agj", descriptor = "()V")
	abstract void method20696();

	@OriginalMember(owner = "client!aed", name = "aey", descriptor = "(Z)Lclient!lc;")
	abstract Interface38 method20697(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "ta", descriptor = "()V")
	abstract void method20698();

	@OriginalMember(owner = "client!aed", name = "abs", descriptor = "()V")
	abstract void method20699();

	@OriginalMember(owner = "client!aed", name = "ww", descriptor = "()Z")
	public abstract boolean method20700();

	@OriginalMember(owner = "client!aed", name = "aew", descriptor = "(Lclient!kt;)V")
	public abstract void method20701(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!aed", name = "ue", descriptor = "(ILclient!lp;Z)V")
	abstract void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!aed", name = "aby", descriptor = "(Lclient!dt;Lclient!dl;)Z")
	abstract boolean method20703(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1);

	@OriginalMember(owner = "client!aed", name = "za", descriptor = "()V")
	abstract void method20704();

	@OriginalMember(owner = "client!aed", name = "zr", descriptor = "()V")
	abstract void method20705();

	@OriginalMember(owner = "client!aed", name = "zo", descriptor = "()V")
	abstract void method20706();

	@OriginalMember(owner = "client!aed", name = "zp", descriptor = "()V")
	abstract void method20707();

	@OriginalMember(owner = "client!aed", name = "zl", descriptor = "()V")
	abstract void method20708();

	@OriginalMember(owner = "client!aed", name = "afx", descriptor = "(I)V")
	abstract void method20709(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "acb", descriptor = "(IIZ[III)Lclient!ks;")
	abstract Interface37 method20710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "vh", descriptor = "()V")
	abstract void method20711();

	@OriginalMember(owner = "client!aed", name = "aai", descriptor = "()V")
	abstract void method20712();

	@OriginalMember(owner = "client!aed", name = "aah", descriptor = "()V")
	abstract void method20713();

	@OriginalMember(owner = "client!aed", name = "aao", descriptor = "()V")
	abstract void method20714();

	@OriginalMember(owner = "client!aed", name = "abb", descriptor = "()V")
	abstract void method20715();

	@OriginalMember(owner = "client!aed", name = "abl", descriptor = "()V")
	abstract void method20716();

	@OriginalMember(owner = "client!aed", name = "abi", descriptor = "()V")
	abstract void method20717();

	@OriginalMember(owner = "client!aed", name = "abw", descriptor = "()V")
	abstract void method20718();

	@OriginalMember(owner = "client!aed", name = "abx", descriptor = "()V")
	abstract void method20719();

	@OriginalMember(owner = "client!aed", name = "abg", descriptor = "()V")
	abstract void method20720();

	@OriginalMember(owner = "client!aed", name = "abf", descriptor = "()V")
	abstract void method20721();

	@OriginalMember(owner = "client!aed", name = "abd", descriptor = "()V")
	abstract void method20722();

	@OriginalMember(owner = "client!aed", name = "abq", descriptor = "(Lclient!dt;Lclient!dl;)Z")
	abstract boolean method20723(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1);

	@OriginalMember(owner = "client!aed", name = "agy", descriptor = "(Lclient!lq;IIII)V")
	public abstract void method20724(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aed", name = "xm", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public abstract Class112 method20725(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!aed", name = "acq", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;")
	abstract Interface37 method20726(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "aco", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;")
	abstract Interface37 method20727(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aed", name = "ace", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;")
	abstract Interface37 method20728(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aed", name = "aev", descriptor = "(I)V")
	abstract void method20729(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "adt", descriptor = "()V")
	abstract void method20730();

	@OriginalMember(owner = "client!aed", name = "acg", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;")
	abstract Interface34 method20731(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!aed", name = "acf", descriptor = "(IZ[[I)Lclient!le;")
	abstract Interface40 method20732(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!aed", name = "act", descriptor = "(IZ[[I)Lclient!le;")
	abstract Interface40 method20733(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2);

	@OriginalMember(owner = "client!aed", name = "aca", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;")
	abstract Interface34 method20734(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!aed", name = "acw", descriptor = "()V")
	public abstract void method20735();

	@OriginalMember(owner = "client!aed", name = "rx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V")
	public abstract void method20736(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2);

	@OriginalMember(owner = "client!aed", name = "acv", descriptor = "(ILclient!lp;ZZ)V")
	abstract void method20737(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!aed", name = "aci", descriptor = "(ILclient!lp;ZZ)V")
	abstract void method20738(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!aed", name = "ach", descriptor = "(ILclient!lp;ZZ)V")
	abstract void method20739(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!aed", name = "wm", descriptor = "(Z)Z")
	public abstract boolean method20740(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "adm", descriptor = "()V")
	abstract void method20741();

	@OriginalMember(owner = "client!aed", name = "ada", descriptor = "()V")
	abstract void method20742();

	@OriginalMember(owner = "client!aed", name = "adr", descriptor = "()V")
	abstract void method20743();

	@OriginalMember(owner = "client!aed", name = "adh", descriptor = "()V")
	abstract void method20744();

	@OriginalMember(owner = "client!aed", name = "ade", descriptor = "()V")
	abstract void method20745();

	@OriginalMember(owner = "client!aed", name = "aex", descriptor = "()V")
	abstract void method20746();

	@OriginalMember(owner = "client!aed", name = "ael", descriptor = "()V")
	abstract void method20747();

	@OriginalMember(owner = "client!aed", name = "aep", descriptor = "()V")
	abstract void method20748();

	@OriginalMember(owner = "client!aed", name = "agz", descriptor = "()V")
	abstract void method20749();

	@OriginalMember(owner = "client!aed", name = "aec", descriptor = "()V")
	abstract void method20750();

	@OriginalMember(owner = "client!aed", name = "aer", descriptor = "()V")
	abstract void method20751();

	@OriginalMember(owner = "client!aed", name = "aen", descriptor = "()V")
	abstract void method20752();

	@OriginalMember(owner = "client!aed", name = "aem", descriptor = "(Z)Lclient!kp;")
	abstract Interface36 method20753(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "aez", descriptor = "(Z)Lclient!kp;")
	abstract Interface36 method20754(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "aef", descriptor = "([Lclient!lz;)Lclient!kt;")
	abstract Class113 method20755(@OriginalArg(0) Class391[] arg0);

	@OriginalMember(owner = "client!aed", name = "aeh", descriptor = "([Lclient!lz;)Lclient!kt;")
	abstract Class113 method20756(@OriginalArg(0) Class391[] arg0);

	@OriginalMember(owner = "client!aed", name = "aeq", descriptor = "([Lclient!lz;)Lclient!kt;")
	abstract Class113 method20757(@OriginalArg(0) Class391[] arg0);

	@OriginalMember(owner = "client!aed", name = "aed", descriptor = "(Lclient!kt;)V")
	public abstract void method20758(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!aed", name = "aet", descriptor = "(ILclient!kp;)V")
	public abstract void method20759(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1);

	@OriginalMember(owner = "client!aed", name = "aft", descriptor = "(ILclient!kp;)V")
	public abstract void method20760(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1);

	@OriginalMember(owner = "client!aed", name = "afu", descriptor = "(Lclient!lc;)V")
	abstract void method20761(@OriginalArg(0) Interface38 arg0);

	@OriginalMember(owner = "client!aed", name = "aff", descriptor = "(Lclient!lc;Lclient!lq;IIII)V")
	abstract void method20762(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "afv", descriptor = "(Lclient!lc;Lclient!lq;IIII)V")
	abstract void method20763(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aed", name = "afm", descriptor = "(I)V")
	abstract void method20764(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "afr", descriptor = "(I)V")
	abstract void method20765(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aed", name = "ur", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;")
	abstract Interface34 method20766(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5);

	@OriginalMember(owner = "client!aed", name = "afy", descriptor = "()V")
	abstract void method20767();

	@OriginalMember(owner = "client!aed", name = "agd", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;")
	abstract Interface43 method20768(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "agk", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;")
	abstract Interface43 method20769(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aed", name = "agt", descriptor = "()V")
	abstract void method20770();

	@OriginalMember(owner = "client!aed", name = "agf", descriptor = "()V")
	abstract void method20771();

	@OriginalMember(owner = "client!aed", name = "vf", descriptor = "(Z)Lclient!lc;")
	abstract Interface38 method20772(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aed", name = "agx", descriptor = "(Lclient!lq;II)V")
	public abstract void method20773(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!aed", name = "agq", descriptor = "(Lclient!oi;)V")
	public abstract void method20774(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!aed", name = "agh", descriptor = "(ILclient!lp;Z)V")
	abstract void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2);
}
