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

@OriginalClass("client!aeq")
public class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!aeq", name = "ad", descriptor = "F")
	static final float aFloat54 = 0.35F;

	@OriginalMember(owner = "client!aeq", name = "ac", descriptor = "I")
	static final int anInt642 = 0;

	@OriginalMember(owner = "client!aeq", name = "av", descriptor = "I")
	static final int anInt643 = 1;

	@OriginalMember(owner = "client!aeq", name = "ae", descriptor = "I")
	static final int anInt644 = 4;

	@OriginalMember(owner = "client!aeq", name = "ah", descriptor = "I")
	static final int anInt645 = 8;

	@OriginalMember(owner = "client!aeq", name = "as", descriptor = "I")
	static final int anInt646 = 16;

	@OriginalMember(owner = "client!aeq", name = "aq", descriptor = "I")
	static final int anInt647 = 32;

	@OriginalMember(owner = "client!aeq", name = "am", descriptor = "I")
	static final int anInt648 = 32993;

	@OriginalMember(owner = "client!aeq", name = "ay", descriptor = "I")
	static final int anInt649 = 5121;

	@OriginalMember(owner = "client!aeq", name = "bn", descriptor = "I")
	static final int anInt650 = 2;

	@OriginalMember(owner = "client!aeq", name = "an", descriptor = "I")
	static final int anInt651 = 5126;

	@OriginalMember(owner = "client!aeq", name = "aa", descriptor = "I")
	static final int anInt652 = 7;

	@OriginalMember(owner = "client!aeq", name = "aw", descriptor = "I")
	static final int anInt653 = -1;

	@OriginalMember(owner = "client!aeq", name = "az", descriptor = "I")
	static final int anInt654 = -2;

	@OriginalMember(owner = "client!aeq", name = "bv", descriptor = "I")
	static final int anInt655 = 260;

	@OriginalMember(owner = "client!aeq", name = "ba", descriptor = "I")
	static final int anInt656 = 34023;

	@OriginalMember(owner = "client!aeq", name = "bl", descriptor = "I")
	static final int anInt657 = 34165;

	@OriginalMember(owner = "client!aeq", name = "bb", descriptor = "I")
	static final int anInt658 = 34479;

	@OriginalMember(owner = "client!aeq", name = "bc", descriptor = "I")
	static final int anInt659 = 7681;

	@OriginalMember(owner = "client!aeq", name = "bx", descriptor = "I")
	static final int anInt660 = 34167;

	@OriginalMember(owner = "client!aeq", name = "bi", descriptor = "I")
	static final int anInt661 = 770;

	@OriginalMember(owner = "client!aeq", name = "bg", descriptor = "I")
	static final int anInt662 = 768;

	@OriginalMember(owner = "client!aeq", name = "bs", descriptor = "I")
	static final int anInt663 = 0;

	@OriginalMember(owner = "client!aeq", name = "bt", descriptor = "I")
	static final int anInt664 = 1;

	@OriginalMember(owner = "client!aeq", name = "bz", descriptor = "I")
	static final int anInt665 = 2;

	@OriginalMember(owner = "client!aeq", name = "bu", descriptor = "I")
	static final int anInt666 = 0;

	@OriginalMember(owner = "client!aeq", name = "bf", descriptor = "I")
	static final int anInt667 = 1;

	@OriginalMember(owner = "client!aeq", name = "by", descriptor = "I")
	static final int anInt668 = 5890;

	@OriginalMember(owner = "client!aeq", name = "bp", descriptor = "I")
	static final int anInt669 = 3;

	@OriginalMember(owner = "client!aeq", name = "bk", descriptor = "I")
	static final int anInt670 = 4;

	@OriginalMember(owner = "client!aeq", name = "br", descriptor = "I")
	static final int anInt671 = 8;

	@OriginalMember(owner = "client!aeq", name = "bq", descriptor = "I")
	static final int anInt672 = 16;

	@OriginalMember(owner = "client!aeq", name = "be", descriptor = "I")
	static final int anInt673 = 7;

	@OriginalMember(owner = "client!aeq", name = "at", descriptor = "I")
	static final int anInt675 = 2;

	@OriginalMember(owner = "client!aeq", name = "ab", descriptor = "I")
	static final int anInt680 = 4;

	@OriginalMember(owner = "client!aeq", name = "bo", descriptor = "I")
	static final int anInt684 = 2;

	@OriginalMember(owner = "client!aeq", name = "ar", descriptor = "I")
	static final int anInt686 = 100663296;

	@OriginalMember(owner = "client!aeq", name = "bh", descriptor = "I")
	static final int anInt696 = 55;

	@OriginalMember(owner = "client!aeq", name = "bw", descriptor = "I")
	static final int anInt698 = 34166;

	@OriginalMember(owner = "client!aeq", name = "ap", descriptor = "I")
	static final int anInt704 = 128;

	@OriginalMember(owner = "client!aeq", name = "bm", descriptor = "I")
	static final int anInt709 = 1;

	@OriginalMember(owner = "client!aeq", name = "bd", descriptor = "I")
	static final int anInt716 = 34168;

	@OriginalMember(owner = "client!aeq", name = "bj", descriptor = "I")
	static final int anInt717 = 8448;

	@OriginalMember(owner = "client!aeq", name = "af", descriptor = "I")
	static final int anInt726 = 5123;

	@OriginalMember(owner = "client!aeq", name = "iw", descriptor = "I")
	static final int anInt727 = 3;

	@OriginalMember(owner = "client!aeq", name = "dv", descriptor = "[I")
	static int[] anIntArray57 = new int[1000];

	@OriginalMember(owner = "client!aeq", name = "ev", descriptor = "I")
	static int anInt674 = 4;

	@OriginalMember(owner = "client!aeq", name = "ho", descriptor = "[F")
	static final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "iq", descriptor = "[F")
	static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "gk", descriptor = "[Lclient!bx;")
	Class78[] aClass78Array1;

	@OriginalMember(owner = "client!aeq", name = "gp", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_2;

	@OriginalMember(owner = "client!aeq", name = "hr", descriptor = "Z")
	boolean aBoolean112;

	@OriginalMember(owner = "client!aeq", name = "he", descriptor = "Lclient!bn;")
	Interface14 anInterface14_3;

	@OriginalMember(owner = "client!aeq", name = "dw", descriptor = "Z")
	boolean aBoolean113;

	@OriginalMember(owner = "client!aeq", name = "fv", descriptor = "Z")
	boolean aBoolean114;

	@OriginalMember(owner = "client!aeq", name = "gv", descriptor = "Z")
	boolean aBoolean116;

	@OriginalMember(owner = "client!aeq", name = "gm", descriptor = "Z")
	boolean aBoolean117;

	@OriginalMember(owner = "client!aeq", name = "fp", descriptor = "F")
	float aFloat56;

	@OriginalMember(owner = "client!aeq", name = "gx", descriptor = "I")
	int anInt678;

	@OriginalMember(owner = "client!aeq", name = "cy", descriptor = "I")
	int anInt679;

	@OriginalMember(owner = "client!aeq", name = "gd", descriptor = "Z")
	boolean aBoolean119;

	@OriginalMember(owner = "client!aeq", name = "dn", descriptor = "J")
	long aLong25;

	@OriginalMember(owner = "client!aeq", name = "da", descriptor = "I")
	int anInt681;

	@OriginalMember(owner = "client!aeq", name = "ga", descriptor = "Lclient!bn;")
	Interface14 anInterface14_4;

	@OriginalMember(owner = "client!aeq", name = "dz", descriptor = "Z")
	boolean aBoolean120;

	@OriginalMember(owner = "client!aeq", name = "di", descriptor = "I")
	int anInt682;

	@OriginalMember(owner = "client!aeq", name = "dr", descriptor = "Z")
	boolean aBoolean121;

	@OriginalMember(owner = "client!aeq", name = "de", descriptor = "Z")
	boolean aBoolean123;

	@OriginalMember(owner = "client!aeq", name = "du", descriptor = "Z")
	boolean aBoolean124;

	@OriginalMember(owner = "client!aeq", name = "fu", descriptor = "I")
	int anInt683;

	@OriginalMember(owner = "client!aeq", name = "gh", descriptor = "Z")
	boolean aBoolean125;

	@OriginalMember(owner = "client!aeq", name = "dj", descriptor = "F")
	float aFloat58;

	@OriginalMember(owner = "client!aeq", name = "ej", descriptor = "F")
	float aFloat59;

	@OriginalMember(owner = "client!aeq", name = "eo", descriptor = "F")
	float aFloat60;

	@OriginalMember(owner = "client!aeq", name = "gf", descriptor = "Ljava/lang/String;")
	String aString23;

	@OriginalMember(owner = "client!aeq", name = "ef", descriptor = "I")
	int anInt687;

	@OriginalMember(owner = "client!aeq", name = "ek", descriptor = "Z")
	boolean aBoolean128;

	@OriginalMember(owner = "client!aeq", name = "ey", descriptor = "I")
	int anInt693;

	@OriginalMember(owner = "client!aeq", name = "eb", descriptor = "I")
	int anInt694;

	@OriginalMember(owner = "client!aeq", name = "ez", descriptor = "I")
	int anInt695;

	@OriginalMember(owner = "client!aeq", name = "dm", descriptor = "I")
	int anInt697;

	@OriginalMember(owner = "client!aeq", name = "ci", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!aeq", name = "fz", descriptor = "F")
	float aFloat68;

	@OriginalMember(owner = "client!aeq", name = "fj", descriptor = "I")
	int anInt701;

	@OriginalMember(owner = "client!aeq", name = "eg", descriptor = "I")
	int anInt702;

	@OriginalMember(owner = "client!aeq", name = "gc", descriptor = "I")
	int anInt703;

	@OriginalMember(owner = "client!aeq", name = "fo", descriptor = "I")
	int anInt705;

	@OriginalMember(owner = "client!aeq", name = "fd", descriptor = "I")
	int anInt706;

	@OriginalMember(owner = "client!aeq", name = "fh", descriptor = "Z")
	boolean aBoolean130;

	@OriginalMember(owner = "client!aeq", name = "hi", descriptor = "Z")
	boolean aBoolean131;

	@OriginalMember(owner = "client!aeq", name = "eh", descriptor = "F")
	float aFloat71;

	@OriginalMember(owner = "client!aeq", name = "gj", descriptor = "I")
	int anInt710;

	@OriginalMember(owner = "client!aeq", name = "gi", descriptor = "Lclient!db;")
	Class202 aClass202_2;

	@OriginalMember(owner = "client!aeq", name = "gt", descriptor = "Lclient!ca;")
	Interface15 anInterface15_2;

	@OriginalMember(owner = "client!aeq", name = "cs", descriptor = "I")
	int anInt712;

	@OriginalMember(owner = "client!aeq", name = "gb", descriptor = "Z")
	boolean aBoolean132;

	@OriginalMember(owner = "client!aeq", name = "gu", descriptor = "I")
	int anInt714;

	@OriginalMember(owner = "client!aeq", name = "dp", descriptor = "B")
	byte aByte5;

	@OriginalMember(owner = "client!aeq", name = "gq", descriptor = "Lclient!aem;")
	Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!aeq", name = "ge", descriptor = "Ljava/lang/String;")
	String aString24;

	@OriginalMember(owner = "client!aeq", name = "fy", descriptor = "F")
	float aFloat72;

	@OriginalMember(owner = "client!aeq", name = "hn", descriptor = "Z")
	boolean aBoolean133;

	@OriginalMember(owner = "client!aeq", name = "gn", descriptor = "I")
	int anInt718;

	@OriginalMember(owner = "client!aeq", name = "gg", descriptor = "I")
	int anInt719;

	@OriginalMember(owner = "client!aeq", name = "gs", descriptor = "I")
	int anInt720;

	@OriginalMember(owner = "client!aeq", name = "ht", descriptor = "Z")
	boolean aBoolean138;

	@OriginalMember(owner = "client!aeq", name = "hq", descriptor = "Z")
	boolean aBoolean140;

	@OriginalMember(owner = "client!aeq", name = "fc", descriptor = "Z")
	boolean aBoolean141;

	@OriginalMember(owner = "client!aeq", name = "ct", descriptor = "I")
	int anInt723;

	@OriginalMember(owner = "client!aeq", name = "hp", descriptor = "Z")
	boolean aBoolean143;

	@OriginalMember(owner = "client!aeq", name = "cq", descriptor = "I")
	int anInt724;

	@OriginalMember(owner = "client!aeq", name = "ha", descriptor = "Z")
	boolean aBoolean144;

	@OriginalMember(owner = "client!aeq", name = "hf", descriptor = "Z")
	boolean aBoolean145;

	@OriginalMember(owner = "client!aeq", name = "hh", descriptor = "Z")
	boolean aBoolean147;

	@OriginalMember(owner = "client!aeq", name = "dy", descriptor = "I")
	int anInt725;

	@OriginalMember(owner = "client!aeq", name = "hs", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aeq", name = "hm", descriptor = "Lclient!bk;")
	Class172 aClass172_9;

	@OriginalMember(owner = "client!aeq", name = "hx", descriptor = "Lclient!bk;")
	Class172 aClass172_10;

	@OriginalMember(owner = "client!aeq", name = "ch", descriptor = "Lclient!cg;")
	Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!aeq", name = "cz", descriptor = "Lclient!oi;")
	Class442 aClass442_29 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "ca", descriptor = "Lclient!oi;")
	Class442 aClass442_24 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "cr", descriptor = "Lclient!ow;")
	Class455 aClass455_8 = new Class455();

	@OriginalMember(owner = "client!aeq", name = "cv", descriptor = "I")
	int anInt699 = 8;

	@OriginalMember(owner = "client!aeq", name = "cu", descriptor = "I")
	int anInt677 = 3;

	@OriginalMember(owner = "client!aeq", name = "cm", descriptor = "Z")
	boolean aBoolean118 = false;

	@OriginalMember(owner = "client!aeq", name = "co", descriptor = "Lclient!zm;")
	Class695 aClass695_6 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "cn", descriptor = "Lsun/misc/Unsafe;")
	Unsafe anUnsafe2 = null;

	@OriginalMember(owner = "client!aeq", name = "cd", descriptor = "Lclient!zm;")
	Class695 aClass695_12 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "cj", descriptor = "Lclient!zm;")
	Class695 aClass695_11 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "ce", descriptor = "Lclient!zm;")
	Class695 aClass695_7 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "do", descriptor = "Lclient!zm;")
	Class695 aClass695_8 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "dt", descriptor = "Lclient!zm;")
	Class695 aClass695_9 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "dh", descriptor = "Lclient!zm;")
	Class695 aClass695_13 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "dq", descriptor = "Lclient!zm;")
	Class695 aClass695_10 = new Class695();

	@OriginalMember(owner = "client!aeq", name = "dk", descriptor = "I")
	int anInt708 = 2;

	@OriginalMember(owner = "client!aeq", name = "ds", descriptor = "Lclient!ow;")
	Class455 aClass455_9 = new Class455();

	@OriginalMember(owner = "client!aeq", name = "df", descriptor = "Lclient!oi;")
	Class442 aClass442_22 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "db", descriptor = "Lclient!oi;")
	Class442 aClass442_25 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "dx", descriptor = "Lclient!oi;")
	Class442 aClass442_26 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "dc", descriptor = "Lclient!oi;")
	Class442 aClass442_27 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "dl", descriptor = "Lclient!oi;")
	Class442 aClass442_28 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "dg", descriptor = "[[F")
	float[][] aFloatArrayArray11 = new float[6][4];

	@OriginalMember(owner = "client!aeq", name = "dd", descriptor = "[F")
	float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "ep", descriptor = "F")
	float aFloat61 = 0.0F;

	@OriginalMember(owner = "client!aeq", name = "eq", descriptor = "F")
	float aFloat62 = 1.0F;

	@OriginalMember(owner = "client!aeq", name = "es", descriptor = "F")
	float aFloat63 = 0.0F;

	@OriginalMember(owner = "client!aeq", name = "ei", descriptor = "F")
	float aFloat64 = -1.0F;

	@OriginalMember(owner = "client!aeq", name = "ed", descriptor = "Lclient!ow;")
	Class455 aClass455_10 = new Class455();

	@OriginalMember(owner = "client!aeq", name = "ee", descriptor = "Lclient!oi;")
	Class442 aClass442_21 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "en", descriptor = "Lclient!oi;")
	Class442 aClass442_23 = new Class442();

	@OriginalMember(owner = "client!aeq", name = "ex", descriptor = "[F")
	float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!aeq", name = "er", descriptor = "Z")
	boolean aBoolean126 = true;

	@OriginalMember(owner = "client!aeq", name = "em", descriptor = "Z")
	boolean aBoolean115 = true;

	@OriginalMember(owner = "client!aeq", name = "et", descriptor = "I")
	int anInt688 = 0;

	@OriginalMember(owner = "client!aeq", name = "ew", descriptor = "I")
	int anInt689 = 0;

	@OriginalMember(owner = "client!aeq", name = "eu", descriptor = "I")
	int anInt722 = 0;

	@OriginalMember(owner = "client!aeq", name = "ea", descriptor = "I")
	int anInt690 = 0;

	@OriginalMember(owner = "client!aeq", name = "ec", descriptor = "I")
	int anInt691 = 0;

	@OriginalMember(owner = "client!aeq", name = "el", descriptor = "I")
	int anInt692 = 0;

	@OriginalMember(owner = "client!aeq", name = "fq", descriptor = "[F")
	float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "fm", descriptor = "[F")
	float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "fl", descriptor = "[F")
	float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "ft", descriptor = "[F")
	float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!aeq", name = "fk", descriptor = "I")
	int anInt700 = -1;

	@OriginalMember(owner = "client!aeq", name = "fe", descriptor = "F")
	float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!aeq", name = "fw", descriptor = "F")
	float aFloat66 = 1.0F;

	@OriginalMember(owner = "client!aeq", name = "fi", descriptor = "F")
	float aFloat67 = 1.0F;

	@OriginalMember(owner = "client!aeq", name = "ff", descriptor = "F")
	float aFloat73 = -1.0F;

	@OriginalMember(owner = "client!aeq", name = "fs", descriptor = "F")
	float aFloat57 = -1.0F;

	@OriginalMember(owner = "client!aeq", name = "fb", descriptor = "[Lclient!ajv;")
	Class77_Sub22[] aClass77_Sub22Array2 = new Class77_Sub22[anInt674];

	@OriginalMember(owner = "client!aeq", name = "fn", descriptor = "I")
	int anInt721 = -1;

	@OriginalMember(owner = "client!aeq", name = "fg", descriptor = "I")
	int anInt715 = -1;

	@OriginalMember(owner = "client!aeq", name = "fa", descriptor = "I")
	int anInt707 = 0;

	@OriginalMember(owner = "client!aeq", name = "fx", descriptor = "F")
	float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!aeq", name = "fr", descriptor = "F")
	float aFloat70 = 0.0F;

	@OriginalMember(owner = "client!aeq", name = "gr", descriptor = "Z")
	boolean aBoolean122 = false;

	@OriginalMember(owner = "client!aeq", name = "gy", descriptor = "I")
	int anInt676 = 8448;

	@OriginalMember(owner = "client!aeq", name = "gz", descriptor = "I")
	int anInt713 = 8448;

	@OriginalMember(owner = "client!aeq", name = "hg", descriptor = "F")
	float aFloat74 = -1.0F;

	@OriginalMember(owner = "client!aeq", name = "hv", descriptor = "F")
	float aFloat55 = -1.0F;

	@OriginalMember(owner = "client!aeq", name = "hk", descriptor = "[Lclient!aeb;")
	Class84_Sub1[] aClass84_Sub1Array1 = new Class84_Sub1[8];

	@OriginalMember(owner = "client!aeq", name = "hy", descriptor = "[Lclient!aeb;")
	Class84_Sub1[] aClass84_Sub1Array2 = new Class84_Sub1[8];

	@OriginalMember(owner = "client!aeq", name = "ib", descriptor = "Lclient!arl;")
	Class77_Sub39_Sub2 aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(8192);

	@OriginalMember(owner = "client!aeq", name = "if", descriptor = "[I")
	int[] anIntArray58 = new int[1];

	@OriginalMember(owner = "client!aeq", name = "id", descriptor = "[I")
	int[] anIntArray59 = new int[1];

	@OriginalMember(owner = "client!aeq", name = "ii", descriptor = "[I")
	int[] anIntArray60 = new int[1];

	@OriginalMember(owner = "client!aeq", name = "ip", descriptor = "[B")
	final byte[] aByteArray14 = new byte[16384];

	@OriginalMember(owner = "client!aeq", name = "it", descriptor = "Lclient!cy;")
	Class83 aClass83_4 = null;

	@OriginalMember(owner = "client!aeq", name = "in", descriptor = "Lclient!cy;")
	Class83 aClass83_5 = null;

	@OriginalMember(owner = "client!aeq", name = "ig", descriptor = "Lclient!aeo;")
	Class92_Sub1 aClass92_Sub1_2 = null;

	@OriginalMember(owner = "client!aeq", name = "ic", descriptor = "[I")
	int[] anIntArray61 = new int[3];

	@OriginalMember(owner = "client!aeq", name = "iy", descriptor = "[J")
	long[] aLongArray8 = new long[3];

	@OriginalMember(owner = "client!aeq", name = "iu", descriptor = "[I")
	int[] anIntArray62 = new int[3];

	@OriginalMember(owner = "client!aeq", name = "is", descriptor = "I")
	int anInt728 = 0;

	@OriginalMember(owner = "client!aeq", name = "ix", descriptor = "I")
	int anInt729 = 0;

	@OriginalMember(owner = "client!aeq", name = "cg", descriptor = "I")
	int anInt711;

	@OriginalMember(owner = "client!aeq", name = "cb", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL1;

	@OriginalMember(owner = "client!aeq", name = "gl", descriptor = "Z")
	boolean aBoolean134;

	@OriginalMember(owner = "client!aeq", name = "gw", descriptor = "Z")
	boolean aBoolean135;

	@OriginalMember(owner = "client!aeq", name = "hl", descriptor = "Z")
	boolean aBoolean136;

	@OriginalMember(owner = "client!aeq", name = "hb", descriptor = "I")
	final int anInt685;

	@OriginalMember(owner = "client!aeq", name = "go", descriptor = "Z")
	boolean aBoolean129;

	@OriginalMember(owner = "client!aeq", name = "hu", descriptor = "Z")
	boolean aBoolean148;

	@OriginalMember(owner = "client!aeq", name = "hz", descriptor = "Z")
	boolean aBoolean139;

	@OriginalMember(owner = "client!aeq", name = "hd", descriptor = "Z")
	boolean aBoolean142;

	@OriginalMember(owner = "client!aeq", name = "hc", descriptor = "Z")
	boolean aBoolean127;

	@OriginalMember(owner = "client!aeq", name = "hw", descriptor = "Z")
	boolean aBoolean137;

	@OriginalMember(owner = "client!aeq", name = "hj", descriptor = "Z")
	boolean aBoolean146;

	@OriginalMember(owner = "client!aeq", name = "cc", descriptor = "Lclient!cw;")
	final Class198 aClass198_1;

	@OriginalMember(owner = "client!aeq", name = "cx", descriptor = "Lclient!cp;")
	Class193 aClass193_1;

	@OriginalMember(owner = "client!aeq", name = "cl", descriptor = "Lclient!cl;")
	Class191 aClass191_1;

	@OriginalMember(owner = "client!aeq", name = "cp", descriptor = "Lclient!aps;")
	Class77_Sub11_Sub2 aClass77_Sub11_Sub2_1;

	@OriginalMember(owner = "client!aeq", name = "cw", descriptor = "Lclient!apy;")
	Class77_Sub11_Sub3 aClass77_Sub11_Sub3_1;

	@OriginalMember(owner = "client!aeq", name = "ck", descriptor = "Lclient!app;")
	Class77_Sub11_Sub1 aClass77_Sub11_Sub1_1;

	@OriginalMember(owner = "client!aeq", name = "cf", descriptor = "Lclient!bz;")
	Class183 aClass183_1;

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;I)V", line = 243)
	Class86_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6) {
		super(arg1, arg2, arg3, arg4, arg5);
		try {
			try {
				@Pc(304) Field local304 = Unsafe.class.getDeclaredField("theUnsafe");
				local304.setAccessible(true);
				this.anUnsafe2 = (Unsafe) local304.get(null);
			} catch (@Pc(315) Exception local315) {
			}
			this.anInt711 = arg6;
			Class155.method23614().method30921("jaclib");
			Class155.method23614().method30921("jaggl");
			this.anOpenGL1 = new OpenGL();
			@Pc(345) long local345 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt711);
			if (local345 == 0L) {
				throw new RuntimeException("");
			}
			this.method6034();
			@Pc(359) int local359 = this.method6036();
			if (local359 != 0) {
				throw new RuntimeException("");
			}
			if (this.aBoolean119 && this.aBoolean134) {
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
						this.aBoolean134 = false;
						this.aBoolean135 = false;
						this.aBoolean136 = false;
					}
				} catch (@Pc(429) NumberFormatException local429) {
					this.aBoolean134 = false;
					this.aBoolean135 = false;
					this.aBoolean136 = false;
				}
			}
			this.anInt685 = this.aBoolean116 ? 33639 : 5121;
			this.aBoolean129 = this.aString23.indexOf("radeon") != -1;
			@Pc(467) boolean local467 = this.aString24.indexOf("intel") != -1;
			@Pc(469) boolean local469 = false;
			@Pc(471) boolean local471 = false;
			@Pc(473) int local473 = 0;
			@Pc(489) int local489;
			if (this.aBoolean129 || local467) {
				@Pc(487) String[] local487 = Class398.method28452(this.aString23.replace('/', ' '), ' ');
				for (local489 = 0; local489 < local487.length; local489++) {
					@Pc(497) String local497 = local487[local489];
					try {
						if (local497.length() > 0) {
							if (local497.charAt(0) == 'x' && local497.length() >= 3 && Class547.method30973(local497.substring(1, 3))) {
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
								if (local497.length() >= 4 && Class547.method30973(local497.substring(0, 4))) {
									local473 = Class679.method36041(local497.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(561) Exception local561) {
					}
				}
			}
			if (this.anInt711 != 0 && local467 && !local469) {
				throw new RuntimeException_Sub4("");
			}
			if (this.aBoolean129 || local467) {
				if (!local467) {
					if (!local471 && !local469) {
						if (local473 >= 7000 && local473 <= 7999) {
							this.aBoolean148 = false;
						}
						if (local473 >= 7000 && local473 <= 9250) {
							this.aBoolean139 = false;
						}
					}
					if (!local469 || local473 < 4000) {
						this.aBoolean142 = false;
					}
					this.aBoolean127 &= this.anOpenGL1.method27714("GL_ARB_half_float_pixel");
					this.aBoolean137 = this.aBoolean148;
				} else if (!local469) {
					this.aBoolean134 = false;
					this.aBoolean135 = false;
					this.aBoolean136 = false;
				}
			}
			this.aBoolean146 = !this.aString24.equals("s3 graphics");
			if (this.aBoolean148) {
				try {
					@Pc(653) int[] local653 = new int[1];
					OpenGL.glGenBuffersARB(1, local653, 0);
				} catch (@Pc(659) Throwable local659) {
					throw new RuntimeException("");
				}
			}
			Class463.method29543(false, true);
			this.aBoolean118 = true;
			this.aClass198_1 = new Class198(this, this.anInterface24_55);
			this.method6037();
			this.aClass193_1 = new Class193(this);
			this.aClass191_1 = new Class191(this);
			if (this.aClass191_1.method24653()) {
				this.aClass77_Sub11_Sub2_1 = new Class77_Sub11_Sub2(this);
				if (!this.aClass77_Sub11_Sub2_1.method20870()) {
					this.aClass77_Sub11_Sub2_1.method21311();
					this.aClass77_Sub11_Sub2_1 = null;
				}
				this.aClass77_Sub11_Sub3_1 = new Class77_Sub11_Sub3(this);
				if (!this.aClass77_Sub11_Sub3_1.method21318()) {
					this.aClass77_Sub11_Sub3_1.method21311();
					this.aClass77_Sub11_Sub3_1 = null;
				}
				this.aClass77_Sub11_Sub1_1 = new Class77_Sub11_Sub1(this);
				if (!this.aClass77_Sub11_Sub1_1.method19897()) {
					this.aClass77_Sub11_Sub1_1.method21311();
					this.aClass77_Sub11_Sub1_1 = null;
				}
			} else {
				this.aClass191_1.method24652();
				this.aClass191_1 = null;
			}
			this.method19951(arg0, new Class92_Sub2_Sub3(this, arg0, local345));
			this.method19959(arg0);
			if (this.aBoolean119) {
				@Pc(773) int local773 = arg0.getLocation().x;
				local489 = arg0.getLocation().y;
				arg0.setLocation(local773 + 1, local489);
				arg0.setLocation(local773, local489);
			}
			this.aClass183_1 = new Class183(this);
			this.method6041();
			this.method20067();
			if (this.aClass191_1 != null) {
				this.method6129();
				this.method6134();
			}
		} catch (@Pc(808) Throwable local808) {
			local808.printStackTrace();
			this.method19929();
			if (local808 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local808;
			} else if (local808 instanceof RuntimeException_Sub4) {
				throw (RuntimeException_Sub4) local808;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "rq", descriptor = "()V", line = 401)
	void method6034() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method27719()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class281.method26679(1000L);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "uv", descriptor = "()V", line = 401)
	void method6035() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL1.method27719()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class281.method26679(1000L);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "rb", descriptor = "()I", line = 409)
	int method6036() {
		@Pc(1) int local1 = 0;
		this.aString24 = OpenGL.glGetString(7936).toLowerCase();
		this.aString23 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString24.indexOf("microsoft") != -1) {
			local1 |= 0x1;
		}
		if (this.aString24.indexOf("brian paul") != -1 || this.aString24.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(40) String local40 = OpenGL.glGetString(7938);
		@Pc(48) String[] local48 = Class398.method28452(local40.replace('.', ' '), ' ');
		if (local48.length >= 2) {
			try {
				@Pc(58) int local58 = Class679.method36041(local48[0]);
				@Pc(64) int local64 = Class679.method36041(local48[1]);
				this.anInt678 = local58 * 10 + local64;
			} catch (@Pc(73) NumberFormatException local73) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt678 < 12) {
			local1 |= 0x2;
		}
		if (!this.anOpenGL1.method27714("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!this.anOpenGL1.method27714("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(111) int[] local111 = new int[1];
		OpenGL.glGetIntegerv(34018, local111, 0);
		this.anInt718 = local111[0];
		OpenGL.glGetIntegerv(34929, local111, 0);
		this.anInt719 = local111[0];
		OpenGL.glGetIntegerv(34930, local111, 0);
		this.anInt720 = local111[0];
		if (this.anInt718 < 2 || this.anInt719 < 2 || this.anInt720 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean116 = Stream.q();
		this.aBoolean148 = this.anOpenGL1.method27714("GL_ARB_vertex_buffer_object");
		this.aBoolean135 = this.anOpenGL1.method27714("GL_ARB_multisample");
		this.aBoolean131 = this.anOpenGL1.method27714("GL_ARB_vertex_program");
		this.aBoolean145 = this.anOpenGL1.method27714("GL_ARB_fragment_program");
		this.aBoolean144 = this.anOpenGL1.method27714("GL_ARB_vertex_shader");
		this.aBoolean133 = this.anOpenGL1.method27714("GL_ARB_fragment_shader");
		this.aBoolean139 = this.anOpenGL1.method27714("GL_EXT_texture3D");
		this.aBoolean127 = this.anOpenGL1.method27714("GL_ARB_texture_rectangle");
		this.aBoolean140 = this.anOpenGL1.method27714("GL_ARB_texture_cube_map");
		this.aBoolean112 = this.anOpenGL1.method27714("GL_ARB_seamless_cube_map");
		this.aBoolean142 = this.anOpenGL1.method27714("GL_ARB_texture_float");
		this.aBoolean143 = this.anOpenGL1.method27714("GL_ARB_texture_non_power_of_two");
		this.aBoolean134 = this.anOpenGL1.method27714("GL_EXT_framebuffer_object");
		this.aBoolean125 = this.anOpenGL1.method27714("GL_EXT_framebuffer_blit");
		this.aBoolean117 = this.anOpenGL1.method27714("GL_EXT_framebuffer_multisample");
		this.aBoolean136 = this.aBoolean125 & this.aBoolean117;
		this.aBoolean147 = this.anOpenGL1.method27714("GL_EXT_blend_func_separate");
		this.aBoolean138 = this.anUnsafe2 != null && (this.anInt678 >= 32 || this.anOpenGL1.method27714("GL_ARB_sync"));
		this.aBoolean119 = Class508.aString221.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray26, 0);
		this.aFloat55 = aFloatArray26[0];
		this.aFloat74 = aFloatArray26[1];
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!aeq", name = "ru", descriptor = "()V", line = 465)
	void method6037() {
		this.aClass78Array1 = new Class78[this.anInt718];
		this.aClass78_Sub2_2 = new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass84_Sub1Array1[local37] = new Class84_Sub1(this);
			this.aClass84_Sub1Array2[local37] = new Class84_Sub1(this);
		}
		if (this.aBoolean134) {
			this.aClass92_Sub1_Sub1_1 = new Class92_Sub1_Sub1(this);
			new Class92_Sub1_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "uz", descriptor = "()V", line = 465)
	void method6038() {
		this.aClass78Array1 = new Class78[this.anInt718];
		this.aClass78_Sub2_2 = new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass84_Sub1Array1[local37] = new Class84_Sub1(this);
			this.aClass84_Sub1Array2[local37] = new Class84_Sub1(this);
		}
		if (this.aBoolean134) {
			this.aClass92_Sub1_Sub1_1 = new Class92_Sub1_Sub1(this);
			new Class92_Sub1_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "us", descriptor = "()V", line = 465)
	void method6039() {
		this.aClass78Array1 = new Class78[this.anInt718];
		this.aClass78_Sub2_2 = new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass84_Sub1Array1[local37] = new Class84_Sub1(this);
			this.aClass84_Sub1Array2[local37] = new Class84_Sub1(this);
		}
		if (this.aBoolean134) {
			this.aClass92_Sub1_Sub1_1 = new Class92_Sub1_Sub1(this);
			new Class92_Sub1_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ui", descriptor = "()V", line = 465)
	void method6040() {
		this.aClass78Array1 = new Class78[this.anInt718];
		this.aClass78_Sub2_2 = new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		new Class78_Sub2(this, 3553, Class212.aClass212_18, Class206.aClass206_23, 1, 1);
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aClass84_Sub1Array1[local37] = new Class84_Sub1(this);
			this.aClass84_Sub1Array2[local37] = new Class84_Sub1(this);
		}
		if (this.aBoolean134) {
			this.aClass92_Sub1_Sub1_1 = new Class92_Sub1_Sub1(this);
			new Class92_Sub1_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "rg", descriptor = "()V", line = 480)
	void method6041() {
		this.method6180(-2);
		for (@Pc(7) int local7 = this.anInt718 - 1; local7 >= 0; local7--) {
			this.method6190(local7);
			this.method6195(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6207(8448, 8448);
		this.method6213(2, 34168, 770);
		this.method6225();
		this.anInt725 = 1;
		this.anInt682 = 0;
		this.aBoolean113 = true;
		if (this.aBoolean147) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt697 = 1;
		this.aByte5 = -1;
		this.method6268((byte) 0);
		this.aBoolean121 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte5);
		if (this.aBoolean135) {
			if (this.anInt711 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean120 = true;
		this.method6229(true);
		this.method6233(true);
		this.method6239(true);
		this.method6241(true);
		this.method20081(0.0F, 1.0F);
		this.method6087();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6287(this.anInt708);
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
		if (this.aBoolean112) {
			OpenGL.glEnable(34895);
		}
		this.anInt721 = -1;
		this.anInt700 = -1;
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "ua", descriptor = "()V", line = 480)
	void method6042() {
		this.method6180(-2);
		for (@Pc(7) int local7 = this.anInt718 - 1; local7 >= 0; local7--) {
			this.method6190(local7);
			this.method6195(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6207(8448, 8448);
		this.method6213(2, 34168, 770);
		this.method6225();
		this.anInt725 = 1;
		this.anInt682 = 0;
		this.aBoolean113 = true;
		if (this.aBoolean147) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt697 = 1;
		this.aByte5 = -1;
		this.method6268((byte) 0);
		this.aBoolean121 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte5);
		if (this.aBoolean135) {
			if (this.anInt711 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean120 = true;
		this.method6229(true);
		this.method6233(true);
		this.method6239(true);
		this.method6241(true);
		this.method20081(0.0F, 1.0F);
		this.method6087();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6287(this.anInt708);
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
		if (this.aBoolean112) {
			OpenGL.glEnable(34895);
		}
		this.anInt721 = -1;
		this.anInt700 = -1;
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "uj", descriptor = "()V", line = 480)
	void method6043() {
		this.method6180(-2);
		for (@Pc(7) int local7 = this.anInt718 - 1; local7 >= 0; local7--) {
			this.method6190(local7);
			this.method6195(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6207(8448, 8448);
		this.method6213(2, 34168, 770);
		this.method6225();
		this.anInt725 = 1;
		this.anInt682 = 0;
		this.aBoolean113 = true;
		if (this.aBoolean147) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt697 = 1;
		this.aByte5 = -1;
		this.method6268((byte) 0);
		this.aBoolean121 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte5);
		if (this.aBoolean135) {
			if (this.anInt711 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean120 = true;
		this.method6229(true);
		this.method6233(true);
		this.method6239(true);
		this.method6241(true);
		this.method20081(0.0F, 1.0F);
		this.method6087();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6287(this.anInt708);
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
		if (this.aBoolean112) {
			OpenGL.glEnable(34895);
		}
		this.anInt721 = -1;
		this.anInt700 = -1;
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "ut", descriptor = "()V", line = 480)
	void method6044() {
		this.method6180(-2);
		for (@Pc(7) int local7 = this.anInt718 - 1; local7 >= 0; local7--) {
			this.method6190(local7);
			this.method6195(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6207(8448, 8448);
		this.method6213(2, 34168, 770);
		this.method6225();
		this.anInt725 = 1;
		this.anInt682 = 0;
		this.aBoolean113 = true;
		if (this.aBoolean147) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		this.anInt697 = 1;
		this.aByte5 = -1;
		this.method6268((byte) 0);
		this.aBoolean121 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) this.aByte5);
		if (this.aBoolean135) {
			if (this.anInt711 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean120 = true;
		this.method6229(true);
		this.method6233(true);
		this.method6239(true);
		this.method6241(true);
		this.method20081(0.0F, 1.0F);
		this.method6087();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		this.method6287(this.anInt708);
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
		if (this.aBoolean112) {
			OpenGL.glEnable(34895);
		}
		this.anInt721 = -1;
		this.anInt700 = -1;
		this.method20078();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "y", descriptor = "()Lclient!do;", line = 543)
	@Override
	public Class208 method20046() {
		@Pc(1) int local1 = -1;
		if (this.aString24.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString24.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString24.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, "OpenGL", this.anInt678, this.aString23, 0L, false);
	}

	@OriginalMember(owner = "client!aeq", name = "ew", descriptor = "()Lclient!do;", line = 543)
	@Override
	public Class208 method20084() {
		@Pc(1) int local1 = -1;
		if (this.aString24.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString24.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString24.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, "OpenGL", this.anInt678, this.aString23, 0L, false);
	}

	@OriginalMember(owner = "client!aeq", name = "eu", descriptor = "()Lclient!do;", line = 543)
	@Override
	public Class208 method20372() {
		@Pc(1) int local1 = -1;
		if (this.aString24.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString24.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString24.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, "OpenGL", this.anInt678, this.aString23, 0L, false);
	}

	@OriginalMember(owner = "client!aeq", name = "t", descriptor = "(II)V", line = 552)
	@Override
	void method20047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		try {
			this.aClass92_Sub2_6.method23348();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ea", descriptor = "(II)V", line = 552)
	@Override
	void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		try {
			this.aClass92_Sub2_6.method23348();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ec", descriptor = "(II)V", line = 552)
	@Override
	void method20153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		try {
			this.aClass92_Sub2_6.method23348();
		} catch (@Pc(5) Exception local5) {
		}
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "q", descriptor = "()V", line = 559)
	@Override
	public void method20331() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aeq", name = "el", descriptor = "()V", line = 559)
	@Override
	public void method20154() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aeq", name = "d", descriptor = "()V", line = 563)
	@Override
	void method20113() {
		for (@Pc(4) Class77 local4 = this.aClass695_6.method36395(); local4 != null; local4 = this.aClass695_6.method36406()) {
			((Class77_Sub2_Sub2) local4).method21793();
		}
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24652();
		}
		if (this.aBoolean118) {
			Class459.method29505(false, true);
			this.aBoolean118 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ms", descriptor = "()V", line = 563)
	@Override
	void method20333() {
		for (@Pc(4) Class77 local4 = this.aClass695_6.method36395(); local4 != null; local4 = this.aClass695_6.method36406()) {
			((Class77_Sub2_Sub2) local4).method21793();
		}
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24652();
		}
		if (this.aBoolean118) {
			Class459.method29505(false, true);
			this.aBoolean118 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mc", descriptor = "()V", line = 563)
	@Override
	void method20315() {
		for (@Pc(4) Class77 local4 = this.aClass695_6.method36395(); local4 != null; local4 = this.aClass695_6.method36406()) {
			((Class77_Sub2_Sub2) local4).method21793();
		}
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24652();
		}
		if (this.aBoolean118) {
			Class459.method29505(false, true);
			this.aBoolean118 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mn", descriptor = "()V", line = 563)
	@Override
	void method20332() {
		for (@Pc(4) Class77 local4 = this.aClass695_6.method36395(); local4 != null; local4 = this.aClass695_6.method36406()) {
			((Class77_Sub2_Sub2) local4).method21793();
		}
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24652();
		}
		if (this.aBoolean118) {
			Class459.method29505(false, true);
			this.aBoolean118 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "g", descriptor = "()Z", line = 574)
	@Override
	public boolean method20050() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fq", descriptor = "()Z", line = 574)
	@Override
	public boolean method20161() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "z", descriptor = "()Z", line = 578)
	@Override
	public boolean method20051() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "no", descriptor = "()Z", line = 578)
	@Override
	public boolean method20354() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "md", descriptor = "()Z", line = 582)
	@Override
	public boolean method20336() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "j", descriptor = "()Z", line = 582)
	@Override
	public boolean method20052() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "mp", descriptor = "()Z", line = 582)
	@Override
	public boolean method20334() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "mz", descriptor = "()Z", line = 582)
	@Override
	public boolean method20260() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "k", descriptor = "()Z", line = 586)
	@Override
	public boolean method20296() {
		return this.aClass77_Sub11_Sub2_1 != null && (this.anInt711 <= 1 || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "fm", descriptor = "()Z", line = 586)
	@Override
	public boolean method20162() {
		return this.aClass77_Sub11_Sub2_1 != null && (this.anInt711 <= 1 || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "u", descriptor = "()Z", line = 590)
	@Override
	public boolean method20178() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fl", descriptor = "()Z", line = 590)
	@Override
	public boolean method20342() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "ft", descriptor = "()Z", line = 590)
	@Override
	public boolean method20164() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "i", descriptor = "()Z", line = 594)
	@Override
	public boolean method20206() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fk", descriptor = "()Z", line = 594)
	@Override
	public boolean method20241() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fw", descriptor = "()Z", line = 594)
	@Override
	public boolean method20167() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fe", descriptor = "()Z", line = 594)
	@Override
	public boolean method20166() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fz", descriptor = "()Z", line = 598)
	@Override
	public boolean method20169() {
		return this.aBoolean135 && (!this.method20183() || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "fi", descriptor = "()Z", line = 598)
	@Override
	public boolean method20168() {
		return this.aBoolean135 && (!this.method20183() || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "e", descriptor = "()Z", line = 598)
	@Override
	public boolean method20055() {
		return this.aBoolean135 && (!this.method20183() || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "fs", descriptor = "()Z", line = 598)
	@Override
	public boolean method20171() {
		return this.aBoolean135 && (!this.method20183() || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "ff", descriptor = "()Z", line = 598)
	@Override
	public boolean method20170() {
		return this.aBoolean135 && (!this.method20183() || this.aBoolean136);
	}

	@OriginalMember(owner = "client!aeq", name = "f", descriptor = "()Z", line = 602)
	@Override
	public boolean method20056() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fb", descriptor = "()Z", line = 602)
	@Override
	public boolean method20112() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "rp", descriptor = "()Z", line = 606)
	boolean method6045() {
		return this.aClass183_1.method24584(3);
	}

	@OriginalMember(owner = "client!aeq", name = "uw", descriptor = "()Z", line = 606)
	boolean method6046() {
		return this.aClass183_1.method24584(3);
	}

	@OriginalMember(owner = "client!aeq", name = "ue", descriptor = "()Z", line = 606)
	boolean method6047() {
		return this.aClass183_1.method24584(3);
	}

	@OriginalMember(owner = "client!aeq", name = "o", descriptor = "()Z", line = 610)
	@Override
	public boolean method20119() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fo", descriptor = "()Z", line = 610)
	@Override
	public boolean method20174() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "fu", descriptor = "()Z", line = 610)
	@Override
	public boolean method20173() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "b", descriptor = "()Z", line = 614)
	@Override
	public boolean method20058() {
		return false;
	}

	@OriginalMember(owner = "client!aeq", name = "fd", descriptor = "()Z", line = 614)
	@Override
	public boolean method20353() {
		return false;
	}

	@OriginalMember(owner = "client!aeq", name = "fj", descriptor = "()Z", line = 614)
	@Override
	public boolean method20175() {
		return false;
	}

	@OriginalMember(owner = "client!aeq", name = "n", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20059() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt711 + local3;
		@Pc(27) String local27 = local15 + this.anInt685 + local3;
		@Pc(39) String local39 = local27 + this.anInt718 + local3;
		@Pc(51) String local51 = local39 + this.anInt719 + local3;
		@Pc(63) String local63 = local51 + this.anInt720 + local3;
		@Pc(75) String local75 = local63 + this.aFloat55 + local3;
		@Pc(87) String local87 = local75 + this.aFloat74 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean116 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean129 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean119 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean148 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean137 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean135 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean131 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean145 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean144 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean133 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean139 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean127 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean140 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean112 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean143 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean134 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean125 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean117 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean142 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean146 ? 1 : 0) + local3;
		return local407 + (this.aBoolean147 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aeq", name = "fh", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20176() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt711 + local3;
		@Pc(27) String local27 = local15 + this.anInt685 + local3;
		@Pc(39) String local39 = local27 + this.anInt718 + local3;
		@Pc(51) String local51 = local39 + this.anInt719 + local3;
		@Pc(63) String local63 = local51 + this.anInt720 + local3;
		@Pc(75) String local75 = local63 + this.aFloat55 + local3;
		@Pc(87) String local87 = local75 + this.aFloat74 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean116 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean129 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean119 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean148 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean137 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean135 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean131 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean145 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean144 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean133 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean139 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean127 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean140 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean112 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean143 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean134 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean125 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean117 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean142 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean146 ? 1 : 0) + local3;
		return local407 + (this.aBoolean147 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aeq", name = "fn", descriptor = "()Ljava/lang/String;", line = 618)
	@Override
	public String method20177() {
		@Pc(1) String local1 = "Caps: 2:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt711 + local3;
		@Pc(27) String local27 = local15 + this.anInt685 + local3;
		@Pc(39) String local39 = local27 + this.anInt718 + local3;
		@Pc(51) String local51 = local39 + this.anInt719 + local3;
		@Pc(63) String local63 = local51 + this.anInt720 + local3;
		@Pc(75) String local75 = local63 + this.aFloat55 + local3;
		@Pc(87) String local87 = local75 + this.aFloat74 + local3;
		@Pc(103) String local103 = local87 + (this.aBoolean116 ? 1 : 0) + local3;
		@Pc(119) String local119 = local103 + (this.aBoolean129 ? 1 : 0) + local3;
		@Pc(135) String local135 = local119 + (this.aBoolean119 ? 1 : 0) + local3;
		@Pc(151) String local151 = local135 + (this.aBoolean148 ? 1 : 0) + local3;
		@Pc(167) String local167 = local151 + (this.aBoolean137 ? 1 : 0) + local3;
		@Pc(183) String local183 = local167 + (this.aBoolean135 ? 1 : 0) + local3;
		@Pc(199) String local199 = local183 + (this.aBoolean131 ? 1 : 0) + local3;
		@Pc(215) String local215 = local199 + (this.aBoolean145 ? 1 : 0) + local3;
		@Pc(231) String local231 = local215 + (this.aBoolean144 ? 1 : 0) + local3;
		@Pc(247) String local247 = local231 + (this.aBoolean133 ? 1 : 0) + local3;
		@Pc(263) String local263 = local247 + (this.aBoolean139 ? 1 : 0) + local3;
		@Pc(279) String local279 = local263 + (this.aBoolean127 ? 1 : 0) + local3;
		@Pc(295) String local295 = local279 + (this.aBoolean140 ? 1 : 0) + local3;
		@Pc(311) String local311 = local295 + (this.aBoolean112 ? 1 : 0) + local3;
		@Pc(327) String local327 = local311 + (this.aBoolean143 ? 1 : 0) + local3;
		@Pc(343) String local343 = local327 + (this.aBoolean134 ? 1 : 0) + local3;
		@Pc(359) String local359 = local343 + (this.aBoolean125 ? 1 : 0) + local3;
		@Pc(375) String local375 = local359 + (this.aBoolean117 ? 1 : 0) + local3;
		@Pc(391) String local391 = local375 + (this.aBoolean142 ? 1 : 0) + local3;
		@Pc(407) String local407 = local391 + (this.aBoolean146 ? 1 : 0) + local3;
		return local407 + (this.aBoolean147 ? 1 : 0);
	}

	@OriginalMember(owner = "client!aeq", name = "a", descriptor = "()[I", line = 652)
	@Override
	public int[] method20060() {
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

	@OriginalMember(owner = "client!aeq", name = "fp", descriptor = "()[I", line = 652)
	@Override
	public int[] method20179() {
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

	@OriginalMember(owner = "client!aeq", name = "fa", descriptor = "()[I", line = 652)
	@Override
	public int[] method20250() {
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

	@OriginalMember(owner = "client!aeq", name = "fg", descriptor = "()[I", line = 652)
	@Override
	public int[] method20369() {
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

	@OriginalMember(owner = "client!aeq", name = "fr", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 662)
	@Override
	Class92_Sub2 method20182(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 662)
	@Override
	Class92_Sub2 method20062(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "fx", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 662)
	@Override
	Class92_Sub2 method20053(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub3(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "rn", descriptor = "()V", line = 666)
	void method6048() {
		this.method6053();
	}

	@OriginalMember(owner = "client!aeq", name = "ud", descriptor = "()V", line = 666)
	void method6049() {
		this.method6053();
	}

	@OriginalMember(owner = "client!aeq", name = "uf", descriptor = "()V", line = 666)
	void method6050() {
		this.method6053();
	}

	@OriginalMember(owner = "client!aeq", name = "um", descriptor = "()V", line = 666)
	void method6051() {
		this.method6053();
	}

	@OriginalMember(owner = "client!aeq", name = "ux", descriptor = "()V", line = 670)
	void method6052() {
		@Pc(3) int local3 = this.aClass92_6.method23491();
		@Pc(7) int local7 = this.aClass92_6.method23493();
		this.aClass442_27.method28995(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20078();
		this.method6087();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "rz", descriptor = "()V", line = 670)
	void method6053() {
		@Pc(3) int local3 = this.aClass92_6.method23491();
		@Pc(7) int local7 = this.aClass92_6.method23493();
		this.aClass442_27.method28995(0.0F, (float) local3, 0.0F, (float) local7, -1.0F, 1.0F);
		this.method20078();
		this.method6087();
		this.method20299();
	}

	@OriginalMember(owner = "client!aeq", name = "ah", descriptor = "(IIII)[I", line = 679)
	@Override
	public int[] method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass92_6.method23493();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt685, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!aeq", name = "fc", descriptor = "(IIII)[I", line = 679)
	@Override
	public int[] method20347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass92_6.method23493();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt685, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!aeq", name = "gr", descriptor = "(IIII)[I", line = 679)
	@Override
	public int[] method20184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return null;
		}
		@Pc(7) int[] local7 = new int[arg2 * arg3];
		@Pc(11) int local11 = this.aClass92_6.method23493();
		for (@Pc(13) int local13 = 0; local13 < arg3; local13++) {
			OpenGL.glReadPixelsi(arg0, local11 - arg1 - local13 - 1, arg2, 1, 32993, this.anInt685, local7, local13 * arg2);
		}
		return local7;
	}

	@OriginalMember(owner = "client!aeq", name = "as", descriptor = "()V", line = 691)
	@Override
	public void method20067() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "gc", descriptor = "()V", line = 691)
	@Override
	public void method20189() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "gi", descriptor = "()V", line = 691)
	@Override
	public void method20186() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "gt", descriptor = "()V", line = 691)
	@Override
	public void method20187() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "ga", descriptor = "()V", line = 691)
	@Override
	public void method20188() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "gj", descriptor = "()V", line = 691)
	@Override
	public void method20223() {
		if (!this.aBoolean146 || this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9 = this.anInt722;
		@Pc(12) int local12 = this.anInt690;
		@Pc(15) int local15 = this.anInt688;
		@Pc(18) int local18 = this.anInt689;
		this.method20299();
		@Pc(23) int local23 = this.anInt702;
		@Pc(26) int local26 = this.anInt693;
		@Pc(29) int local29 = this.anInt694;
		@Pc(32) int local32 = this.anInt695;
		this.method20078();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6087();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6250(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method20151(local9, local15, local12, local18);
		this.method20104(local23, local26, local29, local32);
	}

	@OriginalMember(owner = "client!aeq", name = "aq", descriptor = "()Z", line = 728)
	@Override
	public boolean method20068() {
		return this.aBoolean138;
	}

	@OriginalMember(owner = "client!aeq", name = "gz", descriptor = "()Z", line = 728)
	@Override
	public boolean method20191() {
		return this.aBoolean138;
	}

	@OriginalMember(owner = "client!aeq", name = "am", descriptor = "()Z", line = 732)
	@Override
	public boolean method20069() {
		return !this.aBoolean138 || this.aLongArray8[this.anInt729] == 0L;
	}

	@OriginalMember(owner = "client!aeq", name = "gb", descriptor = "()Z", line = 732)
	@Override
	public boolean method20192() {
		return !this.aBoolean138 || this.aLongArray8[this.anInt729] == 0L;
	}

	@OriginalMember(owner = "client!aeq", name = "ay", descriptor = "()Z", line = 741)
	@Override
	public boolean method20172() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "gu", descriptor = "()Z", line = 741)
	@Override
	public boolean method20193() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "af", descriptor = "()Z", line = 745)
	@Override
	public boolean method20371() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "gp", descriptor = "()Z", line = 745)
	@Override
	public boolean method20195() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "gk", descriptor = "()Z", line = 745)
	@Override
	public boolean method20358() {
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "an", descriptor = "()I", line = 749)
	@Override
	public int method20070() {
		if (!this.aBoolean138) {
			return -1;
		} else if (this.aLongArray8[this.anInt728] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray8[this.anInt728], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray62[this.anInt728];
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "gq", descriptor = "()I", line = 749)
	@Override
	public int method20380() {
		if (!this.aBoolean138) {
			return -1;
		} else if (this.aLongArray8[this.anInt728] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray8[this.anInt728], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray62[this.anInt728];
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ge", descriptor = "()I", line = 749)
	@Override
	public int method20288() {
		if (!this.aBoolean138) {
			return -1;
		} else if (this.aLongArray8[this.anInt728] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray8[this.anInt728], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray62[this.anInt728];
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aa", descriptor = "(III)V", line = 762)
	@Override
	public void method20072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20014();
		if (this.aClass92_Sub1_2 == null) {
			this.method6060(arg1, arg2);
		}
		if (this.aClass83_4 == null) {
			this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
		} else {
			((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
		}
		this.method19968(this.aClass92_Sub1_2);
		this.method20125(1, -16777216);
		this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt729]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2790 * 1104963955, this.anInt2791 * 1827315157, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method19972(this.aClass92_Sub1_2);
		this.aLongArray8[this.anInt729] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray62[this.anInt729] = arg0;
		if (++this.anInt729 >= 3) {
			this.anInt729 = 0;
		}
		this.method20017();
	}

	@OriginalMember(owner = "client!aeq", name = "gf", descriptor = "(III)V", line = 762)
	@Override
	public void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20014();
		if (this.aClass92_Sub1_2 == null) {
			this.method6060(arg1, arg2);
		}
		if (this.aClass83_4 == null) {
			this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
		} else {
			((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
		}
		this.method19968(this.aClass92_Sub1_2);
		this.method20125(1, -16777216);
		this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt729]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2790 * 1104963955, this.anInt2791 * 1827315157, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method19972(this.aClass92_Sub1_2);
		this.aLongArray8[this.anInt729] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray62[this.anInt729] = arg0;
		if (++this.anInt729 >= 3) {
			this.anInt729 = 0;
		}
		this.method20017();
	}

	@OriginalMember(owner = "client!aeq", name = "gv", descriptor = "()V", line = 780)
	@Override
	public void method20199() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "gx", descriptor = "()V", line = 780)
	@Override
	public void method20198() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "go", descriptor = "()V", line = 780)
	@Override
	public void method20054() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "gd", descriptor = "()V", line = 780)
	@Override
	public void method20200() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "gn", descriptor = "()V", line = 780)
	@Override
	public void method20044() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "ab", descriptor = "()V", line = 780)
	@Override
	public void method20366() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray8[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local1]);
				this.aLongArray8[local1] = 0L;
			}
		}
		this.anInt729 = 0;
		this.anInt728 = 0;
	}

	@OriginalMember(owner = "client!aeq", name = "nn", descriptor = "(II)J", line = 791)
	@Override
	public long method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6054(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aeq", name = "ap", descriptor = "(II)J", line = 791)
	@Override
	public long method20138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6054(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!aeq", name = "az", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6054(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "gs", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6054(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "gl", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6054(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "gh", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6054(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "gm", descriptor = "(II[I[I)V", line = 795)
	@Override
	public void method20150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method6054(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "ri", descriptor = "(II[I[I)J", line = 799)
	long method6054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean138) {
			if (this.aClass83_5 == null) {
				this.method6060(arg0, arg1);
			}
			if (this.aClass83_4 == null) {
				this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
			} else {
				((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
			}
			this.method19968(this.aClass92_Sub1_2);
			this.method20125(1, -16777216);
			this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_5.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_2);
			return 0L;
		}
		if (this.aLongArray8[this.anInt728] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray8[this.anInt728]);
			this.aLongArray8[this.anInt728] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt728]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt728 >= 3) {
			this.anInt728 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aeq", name = "vc", descriptor = "(II[I[I)J", line = 799)
	long method6055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean138) {
			if (this.aClass83_5 == null) {
				this.method6060(arg0, arg1);
			}
			if (this.aClass83_4 == null) {
				this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
			} else {
				((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
			}
			this.method19968(this.aClass92_Sub1_2);
			this.method20125(1, -16777216);
			this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_5.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_2);
			return 0L;
		}
		if (this.aLongArray8[this.anInt728] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray8[this.anInt728]);
			this.aLongArray8[this.anInt728] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt728]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt728 >= 3) {
			this.anInt728 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aeq", name = "uh", descriptor = "(II[I[I)J", line = 799)
	long method6056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean138) {
			if (this.aClass83_5 == null) {
				this.method6060(arg0, arg1);
			}
			if (this.aClass83_4 == null) {
				this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
			} else {
				((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
			}
			this.method19968(this.aClass92_Sub1_2);
			this.method20125(1, -16777216);
			this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_5.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_2);
			return 0L;
		}
		if (this.aLongArray8[this.anInt728] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray8[this.anInt728]);
			this.aLongArray8[this.anInt728] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt728]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt728 >= 3) {
			this.anInt728 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aeq", name = "vh", descriptor = "(II[I[I)J", line = 799)
	long method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean138) {
			if (this.aClass83_5 == null) {
				this.method6060(arg0, arg1);
			}
			if (this.aClass83_4 == null) {
				this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
			} else {
				((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
			}
			this.method19968(this.aClass92_Sub1_2);
			this.method20125(1, -16777216);
			this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_5.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_2);
			return 0L;
		}
		if (this.aLongArray8[this.anInt728] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray8[this.anInt728]);
			this.aLongArray8[this.anInt728] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt728]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt728 >= 3) {
			this.anInt728 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aeq", name = "vn", descriptor = "(II[I[I)J", line = 799)
	long method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean138) {
			if (this.aClass83_5 == null) {
				this.method6060(arg0, arg1);
			}
			if (this.aClass83_4 == null) {
				this.aClass83_4 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), true);
			} else {
				((Class83_Sub3) this.aClass83_4).method6666(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0, true);
			}
			this.method19968(this.aClass92_Sub1_2);
			this.method20125(1, -16777216);
			this.aClass83_4.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_5.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_2);
			return 0L;
		}
		if (this.aLongArray8[this.anInt728] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray8[this.anInt728]);
			this.aLongArray8[this.anInt728] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray61[this.anInt728]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			@Pc(37) int local37 = 0;
			for (@Pc(41) int local41 = arg1 - 1; local41 >= 0; local41--) {
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					arg2[local37++] = this.anUnsafe2.getInt(local33 + (long) ((local41 * arg0 + local45) * 4));
				}
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt728 >= 3) {
			this.anInt728 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aeq", name = "aw", descriptor = "(J)V", line = 834)
	@Override
	public void method20074(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "gg", descriptor = "(J)V", line = 834)
	@Override
	public void method20201(@OriginalArg(0) long arg0) {
		if (!OpenGL.glUnmapBufferARB(35051)) {
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "hl", descriptor = "()V", line = 839)
	@Override
	public void method20287() {
		if (!this.aBoolean138) {
			this.aClass92_Sub1_2 = null;
			this.aClass83_5 = null;
			this.aClass83_4 = null;
			return;
		}
		this.aClass83_4 = null;
		if (this.aClass92_Sub1_2 != null) {
			this.aClass92_Sub1_2.method23506();
			this.aClass92_Sub1_2 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray61, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray61[local21] = 0;
			if (this.aLongArray8[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local21]);
				this.aLongArray8[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "gw", descriptor = "()V", line = 839)
	@Override
	public void method20130() {
		if (!this.aBoolean138) {
			this.aClass92_Sub1_2 = null;
			this.aClass83_5 = null;
			this.aClass83_4 = null;
			return;
		}
		this.aClass83_4 = null;
		if (this.aClass92_Sub1_2 != null) {
			this.aClass92_Sub1_2.method23506();
			this.aClass92_Sub1_2 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray61, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray61[local21] = 0;
			if (this.aLongArray8[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local21]);
				this.aLongArray8[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "bj", descriptor = "()V", line = 839)
	@Override
	public void method20077() {
		if (!this.aBoolean138) {
			this.aClass92_Sub1_2 = null;
			this.aClass83_5 = null;
			this.aClass83_4 = null;
			return;
		}
		this.aClass83_4 = null;
		if (this.aClass92_Sub1_2 != null) {
			this.aClass92_Sub1_2.method23506();
			this.aClass92_Sub1_2 = null;
		}
		OpenGL.glDeleteBuffersARB(3, this.anIntArray61, 0);
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			this.anIntArray61[local21] = 0;
			if (this.aLongArray8[local21] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray8[local21]);
				this.aLongArray8[local21] = 0L;
			}
		}
	}

	@OriginalMember(owner = "client!aeq", name = "vo", descriptor = "(II)V", line = 862)
	void method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		if (!this.aBoolean138) {
			this.aClass83_5 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_2 = this.method20063();
			this.aClass92_Sub1_2.method23513(0, this.aClass83_5.method18173());
			return;
		}
		this.aClass83_5 = this.method20102(arg0, arg1, true, true);
		this.aClass92_Sub1_2 = this.method20063();
		this.aClass92_Sub1_2.method23513(0, this.aClass83_5.method18173());
		OpenGL.glGenBuffersARB(3, this.anIntArray61, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray61[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "rv", descriptor = "(II)V", line = 862)
	void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		if (!this.aBoolean138) {
			this.aClass83_5 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_2 = this.method20063();
			this.aClass92_Sub1_2.method23513(0, this.aClass83_5.method18173());
			return;
		}
		this.aClass83_5 = this.method20102(arg0, arg1, true, true);
		this.aClass92_Sub1_2 = this.method20063();
		this.aClass92_Sub1_2.method23513(0, this.aClass83_5.method18173());
		OpenGL.glGenBuffersARB(3, this.anIntArray61, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray61[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "bg", descriptor = "(II)V", line = 883)
	@Override
	public void method20125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6241(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aeq", name = "id", descriptor = "(II)V", line = 883)
	@Override
	public void method20226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6241(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aeq", name = "ii", descriptor = "(II)V", line = 883)
	@Override
	public void method20227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6241(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aeq", name = "ip", descriptor = "(II)V", line = 883)
	@Override
	public void method20228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method6241(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!aeq", name = "bp", descriptor = "(IIIIII)V", line = 897)
	@Override
	public void method20087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "iw", descriptor = "(IIIIII)V", line = 897)
	@Override
	public void method20229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "it", descriptor = "(IIIIII)V", line = 897)
	@Override
	public void method20086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local23);
		OpenGL.glVertex2f(local16, local23);
		OpenGL.glVertex2f(local16, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "bm", descriptor = "(IIIIII)V", line = 915)
	@Override
	public void method20088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "in", descriptor = "(IIIIII)V", line = 915)
	@Override
	public void method20231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ig", descriptor = "(IIIIII)V", line = 915)
	@Override
	public void method20360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method6167();
		this.method6250(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean135) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local4, local9);
		OpenGL.glVertex2f(local4, local19);
		OpenGL.glVertex2f(local14, local19);
		OpenGL.glVertex2f(local14, local9);
		OpenGL.glEnd();
		if (this.aBoolean135) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "bo", descriptor = "(IIFIIFIIFIIII)V", line = 933)
	@Override
	public void method20089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method6167();
		this.method6250(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "mm", descriptor = "(IIFIIFIIFIIII)V", line = 933)
	@Override
	public void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.method6167();
		this.method6250(arg12);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
		OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
		OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
		OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
		OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
		OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "bk", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt722 || arg0 - arg2 > this.anInt690 || arg1 + arg2 < this.anInt688 || arg1 - arg2 > this.anInt689) {
			return;
		}
		this.method6167();
		this.method6250(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat55) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat74) {
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
			local132 = Class462.method29538(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class187.aFloatArray94[local157] * (float) arg2, local59 + Class187.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ic", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt722 || arg0 - arg2 > this.anInt690 || arg1 + arg2 < this.anInt688 || arg1 - arg2 > this.anInt689) {
			return;
		}
		this.method6167();
		this.method6250(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat55) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat74) {
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
			local132 = Class462.method29538(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class187.aFloatArray94[local157] * (float) arg2, local59 + Class187.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "iy", descriptor = "(IIIII)V", line = 946)
	@Override
	void method20233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt722 || arg0 - arg2 > this.anInt690 || arg1 + arg2 < this.anInt688 || arg1 - arg2 > this.anInt689) {
			return;
		}
		this.method6167();
		this.method6250(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(54) float local54 = (float) arg0 + 0.35F;
		@Pc(59) float local59 = (float) arg1 + 0.35F;
		@Pc(63) int local63 = arg2 << 1;
		if ((float) local63 < this.aFloat55) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local54 + 1.0F, local59 + 1.0F);
			OpenGL.glVertex2f(local54 + 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 - 1.0F);
			OpenGL.glVertex2f(local54 - 1.0F, local59 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local63 <= this.aFloat74) {
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
			local132 = Class462.method29538(local132);
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			for (@Pc(157) int local157 = 16384 - local132; local157 > 0; local157 -= local132) {
				OpenGL.glVertex2f(local54 + Class187.aFloatArray94[local157] * (float) arg2, local59 + Class187.aFloatArray93[local157] * (float) arg2);
			}
			OpenGL.glVertex2f(local54 + (float) arg2, local59);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "iu", descriptor = "(IIIII)V", line = 988)
	@Override
	void method20345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6167();
		this.method6250(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "br", descriptor = "(IIIII)V", line = 988)
	@Override
	void method20057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6167();
		this.method6250(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9 + (float) arg2, local14);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "bq", descriptor = "(IIIII)V", line = 1000)
	@Override
	void method20377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6167();
		this.method6250(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "is", descriptor = "(IIIII)V", line = 1000)
	@Override
	void method20155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6167();
		this.method6250(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local9, local14);
		OpenGL.glVertex2f(local9, local14 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeq", name = "bh", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6167();
		this.method6250(arg5);
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

	@OriginalMember(owner = "client!aeq", name = "ix", descriptor = "(IIIIII)V", line = 1012)
	@Override
	public void method20236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6167();
		this.method6250(arg5);
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

	@OriginalMember(owner = "client!aeq", name = "iz", descriptor = "(IIIIIIIII)V", line = 1032)
	@Override
	public void method20237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method6167();
		this.method6250(arg5);
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

	@OriginalMember(owner = "client!aeq", name = "cb", descriptor = "(IIIIIIIII)V", line = 1032)
	@Override
	public void method20094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method6167();
		this.method6250(arg5);
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

	@OriginalMember(owner = "client!aeq", name = "be", descriptor = "(IIIIIILclient!cd;II)V", line = 1089)
	@Override
	public void method20160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg6;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local2.aClass78_Sub2_Sub1_3);
		this.method6250(arg5);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(37) float local37 = local5.aFloat164 / (float) local5.anInt2415;
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
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "ia", descriptor = "(IIIIIILclient!cd;II)V", line = 1089)
	@Override
	public void method20205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg6;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local2.aClass78_Sub2_Sub1_3);
		this.method6250(arg5);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(37) float local37 = local5.aFloat164 / (float) local5.anInt2415;
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
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "cg", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1114)
	@Override
	public void method20095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class90_Sub3 local9 = (Class90_Sub3) arg6;
		@Pc(12) Class78_Sub2_Sub1 local12 = local9.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local9.aClass78_Sub2_Sub1_3);
		this.method6250(arg5);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat163 / (float) local12.anInt2414;
		@Pc(44) float local44 = local12.aFloat164 / (float) local12.anInt2415;
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
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "ij", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1114)
	@Override
	public void method20238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(9) Class90_Sub3 local9 = (Class90_Sub3) arg6;
		@Pc(12) Class78_Sub2_Sub1 local12 = local9.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local9.aClass78_Sub2_Sub1_3);
		this.method6250(arg5);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(37) float local37 = local12.aFloat163 / (float) local12.anInt2414;
		@Pc(44) float local44 = local12.aFloat164 / (float) local12.anInt2415;
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
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "cc", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20092(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "ik", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20092(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "ir", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20092(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "im", descriptor = "(IIIIIII)V", line = 1181)
	@Override
	public void method20132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		OpenGL.glLineWidth((float) arg5);
		this.method20092(arg0, arg1, arg2, arg3, arg4, arg6);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!aeq", name = "ex", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * arg0 + this.aClass442_28.aFloatArray109[7] * arg1 + this.aClass442_28.aFloatArray109[11] * arg2;
		@Pc(59) float local59 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * arg0 + this.aClass442_28.aFloatArray109[4] * arg1 + this.aClass442_28.aFloatArray109[8] * arg2;
		@Pc(89) float local89 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * arg0 + this.aClass442_28.aFloatArray109[5] * arg1 + this.aClass442_28.aFloatArray109[9] * arg2;
		@Pc(119) float local119 = this.aClass442_22.aFloatArray109[14] + this.aClass442_22.aFloatArray109[2] * arg0 + this.aClass442_22.aFloatArray109[6] * arg1 + this.aClass442_22.aFloatArray109[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat71 * local59 / local29;
		arg3[1] = this.aFloat59 + this.aFloat60 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aeq", name = "mk", descriptor = "(FFF[F)V", line = 1187)
	@Override
	public void method20323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * arg0 + this.aClass442_28.aFloatArray109[7] * arg1 + this.aClass442_28.aFloatArray109[11] * arg2;
		@Pc(59) float local59 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * arg0 + this.aClass442_28.aFloatArray109[4] * arg1 + this.aClass442_28.aFloatArray109[8] * arg2;
		@Pc(89) float local89 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * arg0 + this.aClass442_28.aFloatArray109[5] * arg1 + this.aClass442_28.aFloatArray109[9] * arg2;
		@Pc(119) float local119 = this.aClass442_22.aFloatArray109[14] + this.aClass442_22.aFloatArray109[2] * arg0 + this.aClass442_22.aFloatArray109[6] * arg1 + this.aClass442_22.aFloatArray109[10] * arg2;
		arg3[0] = this.aFloat58 + this.aFloat71 * local59 / local29;
		arg3[1] = this.aFloat59 + this.aFloat60 * local89 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aeq", name = "en", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20147(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * arg0 + this.aClass442_28.aFloatArray109[6] * arg1 + this.aClass442_28.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * arg0 + this.aClass442_28.aFloatArray109[7] * arg1 + this.aClass442_28.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * arg0 + this.aClass442_28.aFloatArray109[4] * arg1 + this.aClass442_28.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * arg0 + this.aClass442_28.aFloatArray109[5] * arg1 + this.aClass442_28.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_22.aFloatArray109[14] + this.aClass442_22.aFloatArray109[2] * arg0 + this.aClass442_22.aFloatArray109[6] * arg1 + this.aClass442_22.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat71 * local115 / local59;
			arg3[1] = this.aFloat59 + this.aFloat60 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "my", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * arg0 + this.aClass442_28.aFloatArray109[6] * arg1 + this.aClass442_28.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * arg0 + this.aClass442_28.aFloatArray109[7] * arg1 + this.aClass442_28.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * arg0 + this.aClass442_28.aFloatArray109[4] * arg1 + this.aClass442_28.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * arg0 + this.aClass442_28.aFloatArray109[5] * arg1 + this.aClass442_28.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_22.aFloatArray109[14] + this.aClass442_22.aFloatArray109[2] * arg0 + this.aClass442_22.aFloatArray109[6] * arg1 + this.aClass442_22.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat71 * local115 / local59;
			arg3[1] = this.aFloat59 + this.aFloat60 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mo", descriptor = "(FFF[F)V", line = 1197)
	@Override
	public void method20143(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * arg0 + this.aClass442_28.aFloatArray109[6] * arg1 + this.aClass442_28.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * arg0 + this.aClass442_28.aFloatArray109[7] * arg1 + this.aClass442_28.aFloatArray109[11] * arg2;
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * arg0 + this.aClass442_28.aFloatArray109[4] * arg1 + this.aClass442_28.aFloatArray109[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * arg0 + this.aClass442_28.aFloatArray109[5] * arg1 + this.aClass442_28.aFloatArray109[9] * arg2;
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_22.aFloatArray109[14] + this.aClass442_22.aFloatArray109[2] * arg0 + this.aClass442_22.aFloatArray109[6] * arg1 + this.aClass442_22.aFloatArray109[10] * arg2;
			arg3[0] = this.aFloat58 + this.aFloat71 * local115 / local59;
			arg3[1] = this.aFloat59 + this.aFloat60 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "cf", descriptor = "(IIIIII)I", line = 1232)
	@Override
	public int method20097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * (float) arg0 + this.aClass442_28.aFloatArray109[6] * (float) arg1 + this.aClass442_28.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * (float) arg3 + this.aClass442_28.aFloatArray109[6] * (float) arg4 + this.aClass442_28.aFloatArray109[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * (float) arg0 + this.aClass442_28.aFloatArray109[7] * (float) arg1 + this.aClass442_28.aFloatArray109[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * (float) arg3 + this.aClass442_28.aFloatArray109[7] * (float) arg4 + this.aClass442_28.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * (float) arg0 + this.aClass442_28.aFloatArray109[4] * (float) arg1 + this.aClass442_28.aFloatArray109[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * (float) arg3 + this.aClass442_28.aFloatArray109[4] * (float) arg4 + this.aClass442_28.aFloatArray109[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * (float) arg0 + this.aClass442_28.aFloatArray109[5] * (float) arg1 + this.aClass442_28.aFloatArray109[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * (float) arg3 + this.aClass442_28.aFloatArray109[5] * (float) arg4 + this.aClass442_28.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aeq", name = "io", descriptor = "(IIIIII)I", line = 1232)
	@Override
	public int method20242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * (float) arg0 + this.aClass442_28.aFloatArray109[6] * (float) arg1 + this.aClass442_28.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = this.aClass442_28.aFloatArray109[14] + this.aClass442_28.aFloatArray109[2] * (float) arg3 + this.aClass442_28.aFloatArray109[6] * (float) arg4 + this.aClass442_28.aFloatArray109[10] * (float) arg5;
		@Pc(100) float local100 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * (float) arg0 + this.aClass442_28.aFloatArray109[7] * (float) arg1 + this.aClass442_28.aFloatArray109[11] * (float) arg2;
		@Pc(133) float local133 = this.aClass442_28.aFloatArray109[15] + this.aClass442_28.aFloatArray109[3] * (float) arg3 + this.aClass442_28.aFloatArray109[7] * (float) arg4 + this.aClass442_28.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * (float) arg0 + this.aClass442_28.aFloatArray109[4] * (float) arg1 + this.aClass442_28.aFloatArray109[8] * (float) arg2;
		@Pc(226) float local226 = this.aClass442_28.aFloatArray109[12] + this.aClass442_28.aFloatArray109[0] * (float) arg3 + this.aClass442_28.aFloatArray109[4] * (float) arg4 + this.aClass442_28.aFloatArray109[8] * (float) arg5;
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * (float) arg0 + this.aClass442_28.aFloatArray109[5] * (float) arg1 + this.aClass442_28.aFloatArray109[9] * (float) arg2;
		@Pc(318) float local318 = this.aClass442_28.aFloatArray109[13] + this.aClass442_28.aFloatArray109[1] * (float) arg3 + this.aClass442_28.aFloatArray109[5] * (float) arg4 + this.aClass442_28.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aeq", name = "cp", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1251)
	@Override
	boolean method20098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_28);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "ih", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1251)
	@Override
	boolean method20243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_28);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "ie", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1251)
	@Override
	boolean method20244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_28);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "il", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1251)
	@Override
	boolean method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg4);
		local2.method28965(this.aClass442_28);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "cw", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1258)
	@Override
	public void method20099(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg0);
		local2.method28965(this.aClass442_28);
		arg1.method25775(arg2, this.aClass442_26, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "iv", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1258)
	@Override
	public void method20245(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.aClass442_21;
		local2.method28969(arg0);
		local2.method28965(this.aClass442_28);
		arg1.method25775(arg2, this.aClass442_26, local2, this.aFloat58, this.aFloat59, this.aFloat71, this.aFloat60);
	}

	@OriginalMember(owner = "client!aeq", name = "ck", descriptor = "(I)Lclient!aja;", line = 1265)
	@Override
	public Class77_Sub2 method20100(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub2 local4 = new Class77_Sub2_Sub2(arg0);
		this.aClass695_6.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aeq", name = "jz", descriptor = "(I)Lclient!aja;", line = 1265)
	@Override
	public Class77_Sub2 method20355(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub2 local4 = new Class77_Sub2_Sub2(arg0);
		this.aClass695_6.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aeq", name = "js", descriptor = "(I)Lclient!aja;", line = 1265)
	@Override
	public Class77_Sub2 method20247(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub2_Sub2 local4 = new Class77_Sub2_Sub2(arg0);
		this.aClass695_6.method36383(local4);
		return local4;
	}

	@OriginalMember(owner = "client!aeq", name = "ch", descriptor = "(Lclient!aja;)V", line = 1271)
	@Override
	public void method20300(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap2 = ((Class77_Sub2_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) Class77_Sub39_Sub2 local12 = new Class77_Sub39_Sub2(80);
		if (this.aBoolean116) {
			local12.method22659(-1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(-1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
		} else {
			local12.method22663(-1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(-1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
		}
		this.anInterface14_3 = this.method6141(20, local12.aByteArray53, local12.anInt3089 * 31645619, false);
		this.aClass172_9 = new Class172(this.anInterface14_3, 5126, 3, 0);
		this.aClass172_10 = new Class172(this.anInterface14_3, 5126, 2, 12);
		this.aClass188_1.method24632(this);
	}

	@OriginalMember(owner = "client!aeq", name = "jr", descriptor = "(Lclient!aja;)V", line = 1271)
	@Override
	public void method20248(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap2 = ((Class77_Sub2_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) Class77_Sub39_Sub2 local12 = new Class77_Sub39_Sub2(80);
		if (this.aBoolean116) {
			local12.method22659(-1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(-1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
		} else {
			local12.method22663(-1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(-1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
		}
		this.anInterface14_3 = this.method6141(20, local12.aByteArray53, local12.anInt3089 * 31645619, false);
		this.aClass172_9 = new Class172(this.anInterface14_3, 5126, 3, 0);
		this.aClass172_10 = new Class172(this.anInterface14_3, 5126, 2, 12);
		this.aClass188_1.method24632(this);
	}

	@OriginalMember(owner = "client!aeq", name = "jv", descriptor = "(Lclient!aja;)V", line = 1271)
	@Override
	public void method20249(@OriginalArg(0) Class77_Sub2 arg0) {
		this.aNativeHeap2 = ((Class77_Sub2_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_3 != null) {
			return;
		}
		@Pc(12) Class77_Sub39_Sub2 local12 = new Class77_Sub39_Sub2(80);
		if (this.aBoolean116) {
			local12.method22659(-1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(-1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(1.0F);
			local12.method22659(-1.0F);
			local12.method22659(0.0F);
			local12.method22659(1.0F);
			local12.method22659(0.0F);
		} else {
			local12.method22663(-1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(-1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(1.0F);
			local12.method22663(-1.0F);
			local12.method22663(0.0F);
			local12.method22663(1.0F);
			local12.method22663(0.0F);
		}
		this.anInterface14_3 = this.method6141(20, local12.aByteArray53, local12.anInt3089 * 31645619, false);
		this.aClass172_9 = new Class172(this.anInterface14_3, 5126, 3, 0);
		this.aClass172_10 = new Class172(this.anInterface14_3, 5126, 2, 12);
		this.aClass188_1.method24632(this);
	}

	@OriginalMember(owner = "client!aeq", name = "jo", descriptor = "(IIZZ)Lclient!cy;", line = 1326)
	@Override
	public Class83 method20181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "ca", descriptor = "(IIZZ)Lclient!cy;", line = 1326)
	@Override
	public Class83 method20102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "jl", descriptor = "(IIZZ)Lclient!cy;", line = 1326)
	@Override
	public Class83 method20350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return new Class83_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "nk", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 1330)
	@Override
	public Class83 method20071(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method6686(false);
		@Pc(15) Class83 local15 = this.method20010(local3, 0, arg0.method6682(), arg0.method6682(), arg0.method6683());
		local15.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local15;
	}

	@OriginalMember(owner = "client!aeq", name = "ct", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 1330)
	@Override
	public Class83 method20076(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) int[] local3 = arg0.method6686(false);
		@Pc(15) Class83 local15 = this.method20010(local3, 0, arg0.method6682(), arg0.method6682(), arg0.method6683());
		local15.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local15;
	}

	@OriginalMember(owner = "client!aeq", name = "cr", descriptor = "([IIIIIZ)Lclient!cy;", line = 1337)
	@Override
	public Class83 method20103(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class83_Sub3(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "jn", descriptor = "([IIIIIZ)Lclient!cy;", line = 1337)
	@Override
	public Class83 method20128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class83_Sub3(this, arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "cv", descriptor = "(IIIIZ)Lclient!cy;", line = 1341)
	@Override
	public Class83 method20105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class83_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "jd", descriptor = "(IIIIZ)Lclient!cy;", line = 1341)
	@Override
	public Class83 method20253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class83_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "jk", descriptor = "(IIIIZ)Lclient!cy;", line = 1341)
	@Override
	public Class83 method20254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class83_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "co", descriptor = "(II[I[I)Lclient!cd;", line = 1345)
	@Override
	public Class90 method20362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class90_Sub3.method6744(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "jg", descriptor = "(II[I[I)Lclient!cd;", line = 1345)
	@Override
	public Class90 method20246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Class90_Sub3.method6744(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeq", name = "nx", descriptor = "(ILclient!cd;II)V", line = 1349)
	@Override
	public void method20338(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg1;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local2.aClass78_Sub2_Sub1_3);
		this.method6250(1);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(37) float local37 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt688);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt688);
		OpenGL.glEnd();
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "cn", descriptor = "(ILclient!cd;II)V", line = 1349)
	@Override
	public void method20110(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg1;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local2.aClass78_Sub2_Sub1_3);
		this.method6250(1);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(37) float local37 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt688);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt688);
		OpenGL.glEnd();
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "ne", descriptor = "(ILclient!cd;II)V", line = 1349)
	@Override
	public void method20339(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg1;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.method6171();
		this.method6195(local2.aClass78_Sub2_Sub1_3);
		this.method6250(1);
		this.method6207(7681, 8448);
		this.method6213(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(37) float local37 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt688);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt722 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt722, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt689 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt689);
		OpenGL.glTexCoord2f(local30 * (float) (this.anInt690 - arg2), local37 * (float) (this.anInt688 - arg3));
		OpenGL.glVertex2i(this.anInt690, this.anInt688);
		OpenGL.glEnd();
		this.method6213(0, 5890, 768);
	}

	@OriginalMember(owner = "client!aeq", name = "jp", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1373)
	@Override
	public Class94 method20267(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "jx", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1373)
	@Override
	public Class94 method20256(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "cq", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1373)
	@Override
	public Class94 method20111(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class94_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "cd", descriptor = "(I)V", line = 1376)
	@Override
	public void method20114(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aeq", name = "jh", descriptor = "(I)V", line = 1376)
	@Override
	public void method20257(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aeq", name = "cj", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 1379)
	@Override
	public Class84 method20115(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "jw", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 1379)
	@Override
	public Class84 method20258(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "ce", descriptor = "(II)I", line = 1383)
	@Override
	public int method20116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "jy", descriptor = "(II)I", line = 1383)
	@Override
	public int method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "jb", descriptor = "(II)I", line = 1383)
	@Override
	public int method20259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "do", descriptor = "(II)I", line = 1387)
	@Override
	public int method20117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "ns", descriptor = "(II)I", line = 1387)
	@Override
	public int method20156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "dt", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 1391)
	@Override
	public Class88 method20118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub1(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "ja", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 1391)
	@Override
	public Class88 method20273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub1(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "cy", descriptor = "()Lclient!oi;", line = 1395)
	@Override
	public Class442 method20282() {
		return this.aClass442_29;
	}

	@OriginalMember(owner = "client!aeq", name = "nb", descriptor = "()Lclient!oi;", line = 1395)
	@Override
	public Class442 method20122() {
		return this.aClass442_29;
	}

	@OriginalMember(owner = "client!aeq", name = "nj", descriptor = "()Lclient!oi;", line = 1395)
	@Override
	public Class442 method20341() {
		return this.aClass442_29;
	}

	@OriginalMember(owner = "client!aeq", name = "cs", descriptor = "()Lclient!ow;", line = 1399)
	@Override
	public Class455 method20370() {
		return this.aClass455_8;
	}

	@OriginalMember(owner = "client!aeq", name = "jc", descriptor = "()Lclient!ow;", line = 1399)
	@Override
	public Class455 method20261() {
		return this.aClass455_8;
	}

	@OriginalMember(owner = "client!aeq", name = "dq", descriptor = "(Lclient!dm;)V", line = 1403)
	@Override
	public void method20120(@OriginalArg(0) Class207 arg0) {
		this.aClass188_1.method24635(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "ji", descriptor = "(Lclient!dm;)V", line = 1403)
	@Override
	public void method20269(@OriginalArg(0) Class207 arg0) {
		this.aClass188_1.method24635(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "lr", descriptor = "(ILclient!db;)V", line = 1407)
	@Override
	public void method20314(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "li", descriptor = "(ILclient!db;)V", line = 1407)
	@Override
	public void method20045(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "ei", descriptor = "(ILclient!db;)V", line = 1407)
	@Override
	public void method20145(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "mh", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20316(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ed", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20146(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mu", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20335(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mx", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ma", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "mf", descriptor = "(ILclient!db;)V", line = 1413)
	@Override
	public void method20225(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		if (!this.aBoolean141) {
			throw new RuntimeException("");
		}
		this.anInt710 = arg0;
		this.aClass202_2 = arg1;
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
			this.aClass183_1.aClass76_Sub4_1.method1579();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ee", descriptor = "()V", line = 1423)
	@Override
	public void method20291() {
		this.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!aeq", name = "mw", descriptor = "()V", line = 1423)
	@Override
	public void method20320() {
		this.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!aeq", name = "mq", descriptor = "()V", line = 1423)
	@Override
	public void method20321() {
		this.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!aeq", name = "bv", descriptor = "()V", line = 1427)
	@Override
	public void method20078() {
		this.anInt702 = 0;
		this.anInt693 = 0;
		this.anInt694 = this.aClass92_6.method23491();
		this.anInt695 = this.aClass92_6.method23493();
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "hu", descriptor = "()V", line = 1427)
	@Override
	public void method20207() {
		this.anInt702 = 0;
		this.anInt693 = 0;
		this.anInt694 = this.aClass92_6.method23491();
		this.anInt695 = this.aClass92_6.method23493();
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "ht", descriptor = "()V", line = 1427)
	@Override
	public void method20209() {
		this.anInt702 = 0;
		this.anInt693 = 0;
		this.anInt694 = this.aClass92_6.method23491();
		this.anInt695 = this.aClass92_6.method23493();
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "hw", descriptor = "()V", line = 1427)
	@Override
	public void method20208() {
		this.anInt702 = 0;
		this.anInt693 = 0;
		this.anInt694 = this.aClass92_6.method23491();
		this.anInt695 = this.aClass92_6.method23493();
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "ba", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt702 = arg0;
		this.anInt693 = arg1;
		this.anInt694 = arg2;
		this.anInt695 = arg3;
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "hz", descriptor = "(IIII)V", line = 1435)
	@Override
	public void method20210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt702 = arg0;
		this.anInt693 = arg1;
		this.anInt694 = arg2;
		this.anInt695 = arg3;
		this.method6065();
	}

	@OriginalMember(owner = "client!aeq", name = "bl", descriptor = "([I)V", line = 1443)
	@Override
	public void method20080(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt702;
		arg0[1] = this.anInt693;
		arg0[2] = this.anInt694;
		arg0[3] = this.anInt695;
	}

	@OriginalMember(owner = "client!aeq", name = "nl", descriptor = "([I)V", line = 1443)
	@Override
	public void method20343(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt702;
		arg0[1] = this.anInt693;
		arg0[2] = this.anInt694;
		arg0[3] = this.anInt695;
	}

	@OriginalMember(owner = "client!aeq", name = "nv", descriptor = "([I)V", line = 1443)
	@Override
	public void method20344(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt702;
		arg0[1] = this.anInt693;
		arg0[2] = this.anInt694;
		arg0[3] = this.anInt695;
	}

	@OriginalMember(owner = "client!aeq", name = "bb", descriptor = "(FF)V", line = 1450)
	@Override
	public void method20081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat61 = arg0;
		this.aFloat62 = arg1;
		this.method6068();
	}

	@OriginalMember(owner = "client!aeq", name = "hq", descriptor = "(FF)V", line = 1450)
	@Override
	public void method20211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat61 = arg0;
		this.aFloat62 = arg1;
		this.method6068();
	}

	@OriginalMember(owner = "client!aeq", name = "ho", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "hx", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20319(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "he", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20221(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "ib", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20159(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "bi", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20142(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "if", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20234(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "iq", descriptor = "([I)V", line = 1456)
	@Override
	public final void method20101(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt722;
		arg0[1] = this.anInt688;
		arg0[2] = this.anInt690;
		arg0[3] = this.anInt689;
	}

	@OriginalMember(owner = "client!aeq", name = "bd", descriptor = "()V", line = 1463)
	@Override
	public final void method20299() {
		if (this.aClass92_6 == null) {
			return;
		}
		this.anInt722 = 0;
		this.anInt688 = 0;
		this.anInt690 = this.aClass92_6.method23491();
		this.anInt689 = this.aClass92_6.method23493();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!aeq", name = "hr", descriptor = "()V", line = 1463)
	@Override
	public final void method20212() {
		if (this.aClass92_6 == null) {
			return;
		}
		this.anInt722 = 0;
		this.anInt688 = 0;
		this.anInt690 = this.aClass92_6.method23491();
		this.anInt689 = this.aClass92_6.method23493();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!aeq", name = "hj", descriptor = "()V", line = 1463)
	@Override
	public final void method20286() {
		if (this.aClass92_6 == null) {
			return;
		}
		this.anInt722 = 0;
		this.anInt688 = 0;
		this.anInt690 = this.aClass92_6.method23491();
		this.anInt689 = this.aClass92_6.method23493();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!aeq", name = "hh", descriptor = "()V", line = 1463)
	@Override
	public final void method20214() {
		if (this.aClass92_6 == null) {
			return;
		}
		this.anInt722 = 0;
		this.anInt688 = 0;
		this.anInt690 = this.aClass92_6.method23491();
		this.anInt689 = this.aClass92_6.method23493();
		OpenGL.glDisable(3089);
	}

	@OriginalMember(owner = "client!aeq", name = "hb", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass92_6.method23491()) {
			arg2 = this.aClass92_6.method23491();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass92_6.method23493()) {
			arg3 = this.aClass92_6.method23493();
		}
		this.anInt722 = arg0;
		this.anInt688 = arg1;
		this.anInt690 = arg2;
		this.anInt689 = arg3;
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hg", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass92_6.method23491()) {
			arg2 = this.aClass92_6.method23491();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass92_6.method23493()) {
			arg3 = this.aClass92_6.method23493();
		}
		this.anInt722 = arg0;
		this.anInt688 = arg1;
		this.anInt690 = arg2;
		this.anInt689 = arg3;
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hv", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass92_6.method23491()) {
			arg2 = this.aClass92_6.method23491();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass92_6.method23493()) {
			arg3 = this.aClass92_6.method23493();
		}
		this.anInt722 = arg0;
		this.anInt688 = arg1;
		this.anInt690 = arg2;
		this.anInt689 = arg3;
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "by", descriptor = "(IIII)V", line = 1472)
	@Override
	public final void method20151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass92_6 == null) {
			return;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.aClass92_6.method23491()) {
			arg2 = this.aClass92_6.method23491();
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.aClass92_6.method23493()) {
			arg3 = this.aClass92_6.method23493();
		}
		this.anInt722 = arg0;
		this.anInt688 = arg1;
		this.anInt690 = arg2;
		this.anInt689 = arg3;
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "bx", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt722 < arg0) {
			this.anInt722 = arg0;
		}
		if (this.anInt690 > arg2) {
			this.anInt690 = arg2;
		}
		if (this.anInt688 < arg1) {
			this.anInt688 = arg1;
		}
		if (this.anInt689 > arg3) {
			this.anInt689 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hy", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt722 < arg0) {
			this.anInt722 = arg0;
		}
		if (this.anInt690 > arg2) {
			this.anInt690 = arg2;
		}
		if (this.anInt688 < arg1) {
			this.anInt688 = arg1;
		}
		if (this.anInt689 > arg3) {
			this.anInt689 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hs", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt722 < arg0) {
			this.anInt722 = arg0;
		}
		if (this.anInt690 > arg2) {
			this.anInt690 = arg2;
		}
		if (this.anInt688 < arg1) {
			this.anInt688 = arg1;
		}
		if (this.anInt689 > arg3) {
			this.anInt689 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hm", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt722 < arg0) {
			this.anInt722 = arg0;
		}
		if (this.anInt690 > arg2) {
			this.anInt690 = arg2;
		}
		if (this.anInt688 < arg1) {
			this.anInt688 = arg1;
		}
		if (this.anInt689 > arg3) {
			this.anInt689 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "hk", descriptor = "(IIII)V", line = 1486)
	@Override
	public final void method20217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt722 < arg0) {
			this.anInt722 = arg0;
		}
		if (this.anInt690 > arg2) {
			this.anInt690 = arg2;
		}
		if (this.anInt688 < arg1) {
			this.anInt688 = arg1;
		}
		if (this.anInt689 > arg3) {
			this.anInt689 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "vm", descriptor = "(II)V", line = 1495)
	final void method6061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt691 = arg0;
		this.anInt692 = arg1;
		this.method6065();
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "rt", descriptor = "(II)V", line = 1495)
	final void method6062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt691 = arg0;
		this.anInt692 = arg1;
		this.method6065();
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "vb", descriptor = "(II)V", line = 1495)
	final void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt691 = arg0;
		this.anInt692 = arg1;
		this.method6065();
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "ve", descriptor = "(II)V", line = 1495)
	final void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt691 = arg0;
		this.anInt692 = arg1;
		this.method6065();
		this.method6069();
	}

	@OriginalMember(owner = "client!aeq", name = "ry", descriptor = "()V", line = 1502)
	final void method6065() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt687 == 2) {
			local9 = this.anInt702;
			local12 = this.anInt693;
			local15 = this.anInt694;
			local18 = this.anInt695;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass92_6.method23491();
			local18 = this.aClass92_6.method23493();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt691 + local9, this.anInt692 + this.aClass92_6.method23493() - local12 - local18, local15, local18);
		this.aFloat71 = (float) this.anInt694 / 2.0F;
		this.aFloat60 = (float) this.anInt695 / 2.0F;
		this.aFloat58 = (float) this.anInt702 + this.aFloat71;
		this.aFloat59 = (float) this.anInt693 + this.aFloat60;
	}

	@OriginalMember(owner = "client!aeq", name = "vl", descriptor = "()V", line = 1502)
	final void method6066() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt687 == 2) {
			local9 = this.anInt702;
			local12 = this.anInt693;
			local15 = this.anInt694;
			local18 = this.anInt695;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass92_6.method23491();
			local18 = this.aClass92_6.method23493();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt691 + local9, this.anInt692 + this.aClass92_6.method23493() - local12 - local18, local15, local18);
		this.aFloat71 = (float) this.anInt694 / 2.0F;
		this.aFloat60 = (float) this.anInt695 / 2.0F;
		this.aFloat58 = (float) this.anInt702 + this.aFloat71;
		this.aFloat59 = (float) this.anInt693 + this.aFloat60;
	}

	@OriginalMember(owner = "client!aeq", name = "vd", descriptor = "()V", line = 1502)
	final void method6067() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (this.anInt687 == 2) {
			local9 = this.anInt702;
			local12 = this.anInt693;
			local15 = this.anInt694;
			local18 = this.anInt695;
		} else {
			local9 = 0;
			local12 = 0;
			local15 = this.aClass92_6.method23491();
			local18 = this.aClass92_6.method23493();
		}
		if (local15 < 1) {
			local15 = 1;
		}
		if (local18 < 1) {
			local18 = 1;
		}
		OpenGL.glViewport(this.anInt691 + local9, this.anInt692 + this.aClass92_6.method23493() - local12 - local18, local15, local18);
		this.aFloat71 = (float) this.anInt694 / 2.0F;
		this.aFloat60 = (float) this.anInt695 / 2.0F;
		this.aFloat58 = (float) this.anInt702 + this.aFloat71;
		this.aFloat59 = (float) this.anInt693 + this.aFloat60;
	}

	@OriginalMember(owner = "client!aeq", name = "rl", descriptor = "()V", line = 1530)
	final void method6068() {
		if (this.anInt687 == 2) {
			OpenGL.glDepthRange(this.aFloat61, this.aFloat62);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ra", descriptor = "()V", line = 1535)
	final void method6069() {
		if (this.aClass92_6 == null || this.anInt722 >= this.anInt690 || this.anInt688 >= this.anInt689) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt691 + this.anInt722, this.anInt692 + this.aClass92_6.method23493() - this.anInt689, this.anInt690 - this.anInt722, this.anInt689 - this.anInt688);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "vy", descriptor = "()V", line = 1535)
	final void method6070() {
		if (this.aClass92_6 == null || this.anInt722 >= this.anInt690 || this.anInt688 >= this.anInt689) {
			OpenGL.glScissor(0, 0, 0, 0);
		} else {
			OpenGL.glScissor(this.anInt691 + this.anInt722, this.anInt692 + this.aClass92_6.method23493() - this.anInt689, this.anInt690 - this.anInt722, this.anInt689 - this.anInt688);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "rx", descriptor = "()V", line = 1542)
	final void method6071() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "vi", descriptor = "()V", line = 1542)
	final void method6072() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "vj", descriptor = "()V", line = 1542)
	final void method6073() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "vu", descriptor = "()V", line = 1542)
	final void method6074() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "vt", descriptor = "()V", line = 1542)
	final void method6075() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "rd", descriptor = "(Lclient!oi;)V", line = 1546)
	final void method6076(@OriginalArg(0) Class442 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "vp", descriptor = "(Lclient!oi;)V", line = 1546)
	final void method6077(@OriginalArg(0) Class442 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "vr", descriptor = "(Lclient!oi;)V", line = 1546)
	final void method6078(@OriginalArg(0) Class442 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "rh", descriptor = "(Lclient!oi;)V", line = 1551)
	final void method6079(@OriginalArg(0) Class442 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "vx", descriptor = "(Lclient!oi;)V", line = 1551)
	final void method6080(@OriginalArg(0) Class442 arg0) {
		OpenGL.glLoadMatrixf(arg0.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "rf", descriptor = "()V", line = 1555)
	final void method6081() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "vs", descriptor = "()V", line = 1555)
	final void method6082() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeq", name = "kq", descriptor = "(Lclient!ow;)V", line = 1559)
	@Override
	public final void method20271(@OriginalArg(0) Class455 arg0) {
		this.aClass455_9.method29387(arg0);
		this.aClass442_22.method28969(this.aClass455_9);
		this.aClass455_10.method29387(arg0);
		this.aClass455_10.method29409();
		this.aClass442_25.method28969(this.aClass455_10);
		this.method6101();
		if (this.anInt687 != 1) {
			this.method6083();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "dn", descriptor = "(Lclient!ow;)V", line = 1559)
	@Override
	public final void method20121(@OriginalArg(0) Class455 arg0) {
		this.aClass455_9.method29387(arg0);
		this.aClass442_22.method28969(this.aClass455_9);
		this.aClass455_10.method29387(arg0);
		this.aClass455_10.method29409();
		this.aClass442_25.method28969(this.aClass455_10);
		this.method6101();
		if (this.anInt687 != 1) {
			this.method6083();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "kg", descriptor = "(Lclient!ow;)V", line = 1559)
	@Override
	public final void method20270(@OriginalArg(0) Class455 arg0) {
		this.aClass455_9.method29387(arg0);
		this.aClass442_22.method28969(this.aClass455_9);
		this.aClass455_10.method29387(arg0);
		this.aClass455_10.method29409();
		this.aClass442_25.method28969(this.aClass455_10);
		this.method6101();
		if (this.anInt687 != 1) {
			this.method6083();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "kc", descriptor = "(Lclient!ow;)V", line = 1559)
	@Override
	public final void method20272(@OriginalArg(0) Class455 arg0) {
		this.aClass455_9.method29387(arg0);
		this.aClass442_22.method28969(this.aClass455_9);
		this.aClass455_10.method29387(arg0);
		this.aClass455_10.method29409();
		this.aClass442_25.method28969(this.aClass455_10);
		this.method6101();
		if (this.anInt687 != 1) {
			this.method6083();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ql", descriptor = "()Lclient!ow;", line = 1569)
	@Override
	public Class455 method20375() {
		return new Class455(this.aClass455_9);
	}

	@OriginalMember(owner = "client!aeq", name = "dv", descriptor = "()Lclient!ow;", line = 1569)
	@Override
	public Class455 method20294() {
		return new Class455(this.aClass455_9);
	}

	@OriginalMember(owner = "client!aeq", name = "qz", descriptor = "()Lclient!ow;", line = 1569)
	@Override
	public Class455 method20061() {
		return new Class455(this.aClass455_9);
	}

	@OriginalMember(owner = "client!aeq", name = "rw", descriptor = "()V", line = 1573)
	final void method6083() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass442_22.aFloatArray109, 0);
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
		}
		this.method6118();
		this.method6108();
	}

	@OriginalMember(owner = "client!aeq", name = "vz", descriptor = "()V", line = 1573)
	final void method6084() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass442_22.aFloatArray109, 0);
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
		}
		this.method6118();
		this.method6108();
	}

	@OriginalMember(owner = "client!aeq", name = "vw", descriptor = "()V", line = 1573)
	final void method6085() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass442_22.aFloatArray109, 0);
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
		}
		this.method6118();
		this.method6108();
	}

	@OriginalMember(owner = "client!aeq", name = "vf", descriptor = "()V", line = 1573)
	final void method6086() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass442_22.aFloatArray109, 0);
		if (this.aBoolean122) {
			this.aClass183_1.aClass76_Sub4_1.method1576();
		}
		this.method6118();
		this.method6108();
	}

	@OriginalMember(owner = "client!aeq", name = "dy", descriptor = "(Lclient!oi;)V", line = 1581)
	@Override
	public final void method20123(@OriginalArg(0) Class442 arg0) {
		this.aClass442_26.method28954(arg0);
		this.method6101();
		this.method6098();
	}

	@OriginalMember(owner = "client!aeq", name = "km", descriptor = "(Lclient!oi;)V", line = 1581)
	@Override
	public final void method20274(@OriginalArg(0) Class442 arg0) {
		this.aClass442_26.method28954(arg0);
		this.method6101();
		this.method6098();
	}

	@OriginalMember(owner = "client!aeq", name = "kw", descriptor = "(Lclient!oi;)V", line = 1581)
	@Override
	public final void method20163(@OriginalArg(0) Class442 arg0) {
		this.aClass442_26.method28954(arg0);
		this.method6101();
		this.method6098();
	}

	@OriginalMember(owner = "client!aeq", name = "kv", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20275() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "kr", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20277() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "kh", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20278() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "kx", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20279() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "kf", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20276() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "dm", descriptor = "()Lclient!oi;", line = 1587)
	@Override
	public final Class442 method20124() {
		return new Class442(this.aClass442_26);
	}

	@OriginalMember(owner = "client!aeq", name = "re", descriptor = "()V", line = 1591)
	final void method6087() {
		if (this.anInt687 != 0) {
			this.anInt687 = 0;
			this.method6065();
			this.method6068();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "va", descriptor = "()V", line = 1591)
	final void method6088() {
		if (this.anInt687 != 0) {
			this.anInt687 = 0;
			this.method6065();
			this.method6068();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "vg", descriptor = "()V", line = 1591)
	final void method6089() {
		if (this.anInt687 != 0) {
			this.anInt687 = 0;
			this.method6065();
			this.method6068();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "vk", descriptor = "()V", line = 1591)
	final void method6090() {
		if (this.anInt687 != 0) {
			this.anInt687 = 0;
			this.method6065();
			this.method6068();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sy", descriptor = "()V", line = 1600)
	final void method6091() {
		if (this.anInt687 == 1) {
			return;
		}
		this.anInt687 = 1;
		this.method6098();
		this.method6065();
		this.method6068();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt681 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aeq", name = "vv", descriptor = "()V", line = 1600)
	final void method6092() {
		if (this.anInt687 == 1) {
			return;
		}
		this.anInt687 = 1;
		this.method6098();
		this.method6065();
		this.method6068();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt681 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aeq", name = "vq", descriptor = "()V", line = 1600)
	final void method6093() {
		if (this.anInt687 == 1) {
			return;
		}
		this.anInt687 = 1;
		this.method6098();
		this.method6065();
		this.method6068();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt681 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aeq", name = "wf", descriptor = "()V", line = 1600)
	final void method6094() {
		if (this.anInt687 == 1) {
			return;
		}
		this.anInt687 = 1;
		this.method6098();
		this.method6065();
		this.method6068();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt681 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aeq", name = "wj", descriptor = "()V", line = 1600)
	final void method6095() {
		if (this.anInt687 == 1) {
			return;
		}
		this.anInt687 = 1;
		this.method6098();
		this.method6065();
		this.method6068();
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt681 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!aeq", name = "si", descriptor = "()V", line = 1612)
	final void method6096() {
		if (this.anInt687 == 2) {
			return;
		}
		this.anInt687 = 2;
		this.method6105(this.aClass442_26.aFloatArray109);
		this.method6083();
		this.method6065();
		this.method6068();
		this.anInt681 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aeq", name = "wt", descriptor = "()V", line = 1612)
	final void method6097() {
		if (this.anInt687 == 2) {
			return;
		}
		this.anInt687 = 2;
		this.method6105(this.aClass442_26.aFloatArray109);
		this.method6083();
		this.method6065();
		this.method6068();
		this.anInt681 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aeq", name = "sh", descriptor = "()V", line = 1623)
	final void method6098() {
		this.aFloat64 = this.aClass442_26.method29016();
		this.aFloat63 = this.aClass442_26.method29012();
		this.method6124();
		if (this.anInt687 == 2) {
			this.method6105(this.aClass442_26.aFloatArray109);
		} else if (this.anInt687 == 1) {
			this.method6105(this.aClass442_27.aFloatArray109);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "wy", descriptor = "()V", line = 1623)
	final void method6099() {
		this.aFloat64 = this.aClass442_26.method29016();
		this.aFloat63 = this.aClass442_26.method29012();
		this.method6124();
		if (this.anInt687 == 2) {
			this.method6105(this.aClass442_26.aFloatArray109);
		} else if (this.anInt687 == 1) {
			this.method6105(this.aClass442_27.aFloatArray109);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "wk", descriptor = "()V", line = 1623)
	final void method6100() {
		this.aFloat64 = this.aClass442_26.method29016();
		this.aFloat63 = this.aClass442_26.method29012();
		this.method6124();
		if (this.anInt687 == 2) {
			this.method6105(this.aClass442_26.aFloatArray109);
		} else if (this.anInt687 == 1) {
			this.method6105(this.aClass442_27.aFloatArray109);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sf", descriptor = "()V", line = 1635)
	final void method6101() {
		this.aClass442_28.method28954(this.aClass442_22);
		this.aClass442_28.method28965(this.aClass442_26);
		this.aClass442_28.method29028(this.aFloatArrayArray11[0]);
		this.aClass442_28.method29033(this.aFloatArrayArray11[1]);
		this.aClass442_28.method29018(this.aFloatArrayArray11[2]);
		this.aClass442_28.method29022(this.aFloatArrayArray11[3]);
		this.aClass442_28.method29023(this.aFloatArrayArray11[4]);
		this.aClass442_28.method29026(this.aFloatArrayArray11[5]);
	}

	@OriginalMember(owner = "client!aeq", name = "wg", descriptor = "()V", line = 1635)
	final void method6102() {
		this.aClass442_28.method28954(this.aClass442_22);
		this.aClass442_28.method28965(this.aClass442_26);
		this.aClass442_28.method29028(this.aFloatArrayArray11[0]);
		this.aClass442_28.method29033(this.aFloatArrayArray11[1]);
		this.aClass442_28.method29018(this.aFloatArrayArray11[2]);
		this.aClass442_28.method29022(this.aFloatArrayArray11[3]);
		this.aClass442_28.method29023(this.aFloatArrayArray11[4]);
		this.aClass442_28.method29026(this.aFloatArrayArray11[5]);
	}

	@OriginalMember(owner = "client!aeq", name = "wo", descriptor = "()V", line = 1635)
	final void method6103() {
		this.aClass442_28.method28954(this.aClass442_22);
		this.aClass442_28.method28965(this.aClass442_26);
		this.aClass442_28.method29028(this.aFloatArrayArray11[0]);
		this.aClass442_28.method29033(this.aFloatArrayArray11[1]);
		this.aClass442_28.method29018(this.aFloatArrayArray11[2]);
		this.aClass442_28.method29022(this.aFloatArrayArray11[3]);
		this.aClass442_28.method29023(this.aFloatArrayArray11[4]);
		this.aClass442_28.method29026(this.aFloatArrayArray11[5]);
	}

	@OriginalMember(owner = "client!aeq", name = "wi", descriptor = "()V", line = 1635)
	final void method6104() {
		this.aClass442_28.method28954(this.aClass442_22);
		this.aClass442_28.method28965(this.aClass442_26);
		this.aClass442_28.method29028(this.aFloatArrayArray11[0]);
		this.aClass442_28.method29033(this.aFloatArrayArray11[1]);
		this.aClass442_28.method29018(this.aFloatArrayArray11[2]);
		this.aClass442_28.method29022(this.aFloatArrayArray11[3]);
		this.aClass442_28.method29023(this.aFloatArrayArray11[4]);
		this.aClass442_28.method29026(this.aFloatArrayArray11[5]);
	}

	@OriginalMember(owner = "client!aeq", name = "so", descriptor = "([F)V", line = 1646)
	final void method6105(@OriginalArg(0) float[] arg0) {
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

	@OriginalMember(owner = "client!aeq", name = "da", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20230(@OriginalArg(0) boolean arg0) {
		this.aBoolean126 = arg0;
		this.method6243();
	}

	@OriginalMember(owner = "client!aeq", name = "nh", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20048(@OriginalArg(0) boolean arg0) {
		this.aBoolean126 = arg0;
		this.method6243();
	}

	@OriginalMember(owner = "client!aeq", name = "na", descriptor = "(Z)V", line = 1658)
	@Override
	public void method20346(@OriginalArg(0) boolean arg0) {
		this.aBoolean126 = arg0;
		this.method6243();
	}

	@OriginalMember(owner = "client!aeq", name = "ju", descriptor = "()I", line = 1663)
	@Override
	public int method20264() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "dp", descriptor = "()I", line = 1663)
	@Override
	public int method20129() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "jm", descriptor = "()I", line = 1663)
	@Override
	public int method20262() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "jq", descriptor = "()I", line = 1663)
	@Override
	public int method20263() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "je", descriptor = "()I", line = 1663)
	@Override
	public int method20265() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "jf", descriptor = "()I", line = 1663)
	@Override
	public int method20266() {
		return 4;
	}

	@OriginalMember(owner = "client!aeq", name = "jt", descriptor = "(I[Lclient!ajv;)V", line = 1667)
	@Override
	public void method20268(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array2[local1] = arg1[local1];
		}
		this.anInt705 = arg0;
		if (this.anInt687 != 1) {
			this.method6108();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "du", descriptor = "(I[Lclient!ajv;)V", line = 1667)
	@Override
	public void method20365(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array2[local1] = arg1[local1];
		}
		this.anInt705 = arg0;
		if (this.anInt687 != 1) {
			this.method6108();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "jj", descriptor = "(I[Lclient!ajv;)V", line = 1667)
	@Override
	public void method20367(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aClass77_Sub22Array2[local1] = arg1[local1];
		}
		this.anInt705 = arg0;
		if (this.anInt687 != 1) {
			this.method6108();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "wc", descriptor = "()V", line = 1673)
	void method6106() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt705; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray27[0] = local10.method13544();
			aFloatArray27[1] = local10.method13550();
			aFloatArray27[2] = local10.method13552();
			aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray27, 0);
			@Pc(48) int local48 = local10.method13557();
			@Pc(54) float local54 = local10.method13561() / 255.0F;
			aFloatArray27[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray27[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray27[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray27, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13555() * local10.method13555()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt683) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt683 = this.anInt705;
	}

	@OriginalMember(owner = "client!aeq", name = "ws", descriptor = "()V", line = 1673)
	void method6107() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt705; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray27[0] = local10.method13544();
			aFloatArray27[1] = local10.method13550();
			aFloatArray27[2] = local10.method13552();
			aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray27, 0);
			@Pc(48) int local48 = local10.method13557();
			@Pc(54) float local54 = local10.method13561() / 255.0F;
			aFloatArray27[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray27[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray27[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray27, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13555() * local10.method13555()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt683) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt683 = this.anInt705;
	}

	@OriginalMember(owner = "client!aeq", name = "sb", descriptor = "()V", line = 1673)
	void method6108() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt705; local1++) {
			@Pc(10) Class77_Sub22 local10 = this.aClass77_Sub22Array2[local1];
			@Pc(14) int local14 = local1 + 16386;
			aFloatArray27[0] = local10.method13544();
			aFloatArray27[1] = local10.method13550();
			aFloatArray27[2] = local10.method13552();
			aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local14, 4611, aFloatArray27, 0);
			@Pc(48) int local48 = local10.method13557();
			@Pc(54) float local54 = local10.method13561() / 255.0F;
			aFloatArray27[0] = (float) (local48 >> 16 & 0xFF) * local54;
			aFloatArray27[1] = (float) (local48 >> 8 & 0xFF) * local54;
			aFloatArray27[2] = (float) (local48 & 0xFF) * local54;
			OpenGL.glLightfv(local14, 4609, aFloatArray27, 0);
			OpenGL.glLightf(local14, 4617, 1.0F / (float) (local10.method13555() * local10.method13555()));
			OpenGL.glEnable(local14);
		}
		while (local1 < this.anInt683) {
			OpenGL.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt683 = this.anInt705;
	}

	@OriginalMember(owner = "client!aeq", name = "dz", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20255(@OriginalArg(0) float arg0) {
		if (this.aFloat68 != arg0) {
			this.aFloat68 = arg0;
			this.method6112();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "kn", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20280(@OriginalArg(0) float arg0) {
		if (this.aFloat68 != arg0) {
			this.aFloat68 = arg0;
			this.method6112();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ko", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20378(@OriginalArg(0) float arg0) {
		if (this.aFloat68 != arg0) {
			this.aFloat68 = arg0;
			this.method6112();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ka", descriptor = "(F)V", line = 1698)
	@Override
	public final void method20281(@OriginalArg(0) float arg0) {
		if (this.aFloat68 != arg0) {
			this.aFloat68 = arg0;
			this.method6112();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "dw", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20126(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt700 != arg0;
		if (local7 || this.aFloat73 != arg1 || this.aFloat57 != arg2) {
			this.anInt700 = arg0;
			this.aFloat73 = arg1;
			this.aFloat57 = arg2;
			if (local7) {
				this.aFloat65 = (float) (this.anInt700 & 0xFF0000) / 1.671168E7F;
				this.aFloat66 = (float) (this.anInt700 & 0xFF00) / 65280.0F;
				this.aFloat67 = (float) (this.anInt700 & 0xFF) / 255.0F;
				this.method6112();
			}
			this.method6116();
		}
		if (this.aFloatArray25[0] == arg3 && this.aFloatArray25[1] == arg4 && this.aFloatArray25[2] == arg5) {
			return;
		}
		this.aFloatArray25[0] = arg3;
		this.aFloatArray25[1] = arg4;
		this.aFloatArray25[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray23[0] = arg3 * local132;
		this.aFloatArray23[1] = arg4 * local132;
		this.aFloatArray23[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray23[0];
		this.aFloatArray24[1] = -this.aFloatArray23[1];
		this.aFloatArray24[2] = -this.aFloatArray23[2];
		this.method6118();
		this.anInt706 = (int) (arg3 * 256.0F / arg4);
		this.anInt701 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "nr", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt700 != arg0;
		if (local7 || this.aFloat73 != arg1 || this.aFloat57 != arg2) {
			this.anInt700 = arg0;
			this.aFloat73 = arg1;
			this.aFloat57 = arg2;
			if (local7) {
				this.aFloat65 = (float) (this.anInt700 & 0xFF0000) / 1.671168E7F;
				this.aFloat66 = (float) (this.anInt700 & 0xFF00) / 65280.0F;
				this.aFloat67 = (float) (this.anInt700 & 0xFF) / 255.0F;
				this.method6112();
			}
			this.method6116();
		}
		if (this.aFloatArray25[0] == arg3 && this.aFloatArray25[1] == arg4 && this.aFloatArray25[2] == arg5) {
			return;
		}
		this.aFloatArray25[0] = arg3;
		this.aFloatArray25[1] = arg4;
		this.aFloatArray25[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray23[0] = arg3 * local132;
		this.aFloatArray23[1] = arg4 * local132;
		this.aFloatArray23[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray23[0];
		this.aFloatArray24[1] = -this.aFloatArray23[1];
		this.aFloatArray24[2] = -this.aFloatArray23[2];
		this.method6118();
		this.anInt706 = (int) (arg3 * 256.0F / arg4);
		this.anInt701 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "nw", descriptor = "(IFFFFF)V", line = 1705)
	@Override
	public final void method20131(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt700 != arg0;
		if (local7 || this.aFloat73 != arg1 || this.aFloat57 != arg2) {
			this.anInt700 = arg0;
			this.aFloat73 = arg1;
			this.aFloat57 = arg2;
			if (local7) {
				this.aFloat65 = (float) (this.anInt700 & 0xFF0000) / 1.671168E7F;
				this.aFloat66 = (float) (this.anInt700 & 0xFF00) / 65280.0F;
				this.aFloat67 = (float) (this.anInt700 & 0xFF) / 255.0F;
				this.method6112();
			}
			this.method6116();
		}
		if (this.aFloatArray25[0] == arg3 && this.aFloatArray25[1] == arg4 && this.aFloatArray25[2] == arg5) {
			return;
		}
		this.aFloatArray25[0] = arg3;
		this.aFloatArray25[1] = arg4;
		this.aFloatArray25[2] = arg5;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray23[0] = arg3 * local132;
		this.aFloatArray23[1] = arg4 * local132;
		this.aFloatArray23[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray23[0];
		this.aFloatArray24[1] = -this.aFloatArray23[1];
		this.aFloatArray24[2] = -this.aFloatArray23[2];
		this.method6118();
		this.anInt706 = (int) (arg3 * 256.0F / arg4);
		this.anInt701 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "di", descriptor = "(I)V", line = 1739)
	@Override
	public final void method20127(@OriginalArg(0) int arg0) {
		this.anInt677 = 0;
		while (arg0 > 1) {
			this.anInt677++;
			arg0 >>= 0x1;
		}
		this.anInt699 = 0x1 << this.anInt677;
	}

	@OriginalMember(owner = "client!aeq", name = "kp", descriptor = "(I)V", line = 1739)
	@Override
	public final void method20283(@OriginalArg(0) int arg0) {
		this.anInt677 = 0;
		while (arg0 > 1) {
			this.anInt677++;
			arg0 >>= 0x1;
		}
		this.anInt699 = 0x1 << this.anInt677;
	}

	@OriginalMember(owner = "client!aeq", name = "kl", descriptor = "(I)V", line = 1739)
	@Override
	public final void method20284(@OriginalArg(0) int arg0) {
		this.anInt677 = 0;
		while (arg0 > 1) {
			this.anInt677++;
			arg0 >>= 0x1;
		}
		this.anInt699 = 0x1 << this.anInt677;
	}

	@OriginalMember(owner = "client!aeq", name = "dr", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt721 == arg0 && this.anInt715 == arg1 && this.anInt707 == arg2) {
			return;
		}
		this.anInt721 = arg0;
		this.anInt715 = arg1;
		this.anInt707 = arg2;
		this.method6124();
		this.method6121();
	}

	@OriginalMember(owner = "client!aeq", name = "kj", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt721 == arg0 && this.anInt715 == arg1 && this.anInt707 == arg2) {
			return;
		}
		this.anInt721 = arg0;
		this.anInt715 = arg1;
		this.anInt707 = arg2;
		this.method6124();
		this.method6121();
	}

	@OriginalMember(owner = "client!aeq", name = "kz", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt721 == arg0 && this.anInt715 == arg1 && this.anInt707 == arg2) {
			return;
		}
		this.anInt721 = arg0;
		this.anInt715 = arg1;
		this.anInt707 = arg2;
		this.method6124();
		this.method6121();
	}

	@OriginalMember(owner = "client!aeq", name = "kt", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt721 == arg0 && this.anInt715 == arg1 && this.anInt707 == arg2) {
			return;
		}
		this.anInt721 = arg0;
		this.anInt715 = arg1;
		this.anInt707 = arg2;
		this.method6124();
		this.method6121();
	}

	@OriginalMember(owner = "client!aeq", name = "ky", descriptor = "(III)V", line = 1748)
	@Override
	public final void method20091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt721 == arg0 && this.anInt715 == arg1 && this.anInt707 == arg2) {
			return;
		}
		this.anInt721 = arg0;
		this.anInt715 = arg1;
		this.anInt707 = arg2;
		this.method6124();
		this.method6121();
	}

	@OriginalMember(owner = "client!aeq", name = "sq", descriptor = "(FF)V", line = 1758)
	final void method6109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat69 = arg0;
		this.aFloat70 = arg1;
		this.method6124();
	}

	@OriginalMember(owner = "client!aeq", name = "wn", descriptor = "(FF)V", line = 1758)
	final void method6110(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat69 = arg0;
		this.aFloat70 = arg1;
		this.method6124();
	}

	@OriginalMember(owner = "client!aeq", name = "wq", descriptor = "()V", line = 1764)
	void method6111() {
		aFloatArray26[0] = this.aFloat68 * this.aFloat65;
		aFloatArray26[1] = this.aFloat68 * this.aFloat66;
		aFloatArray26[2] = this.aFloat68 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "ss", descriptor = "()V", line = 1764)
	void method6112() {
		aFloatArray26[0] = this.aFloat68 * this.aFloat65;
		aFloatArray26[1] = this.aFloat68 * this.aFloat66;
		aFloatArray26[2] = this.aFloat68 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wa", descriptor = "()V", line = 1764)
	void method6113() {
		aFloatArray26[0] = this.aFloat68 * this.aFloat65;
		aFloatArray26[1] = this.aFloat68 * this.aFloat66;
		aFloatArray26[2] = this.aFloat68 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wl", descriptor = "()V", line = 1764)
	void method6114() {
		aFloatArray26[0] = this.aFloat68 * this.aFloat65;
		aFloatArray26[1] = this.aFloat68 * this.aFloat66;
		aFloatArray26[2] = this.aFloat68 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wp", descriptor = "()V", line = 1772)
	void method6115() {
		aFloatArray26[0] = this.aFloat73 * this.aFloat65;
		aFloatArray26[1] = this.aFloat73 * this.aFloat66;
		aFloatArray26[2] = this.aFloat73 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray26, 0);
		aFloatArray26[0] = -this.aFloat57 * this.aFloat65;
		aFloatArray26[1] = -this.aFloat57 * this.aFloat66;
		aFloatArray26[2] = -this.aFloat57 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "sv", descriptor = "()V", line = 1772)
	void method6116() {
		aFloatArray26[0] = this.aFloat73 * this.aFloat65;
		aFloatArray26[1] = this.aFloat73 * this.aFloat66;
		aFloatArray26[2] = this.aFloat73 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray26, 0);
		aFloatArray26[0] = -this.aFloat57 * this.aFloat65;
		aFloatArray26[1] = -this.aFloat57 * this.aFloat66;
		aFloatArray26[2] = -this.aFloat57 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wh", descriptor = "()V", line = 1772)
	void method6117() {
		aFloatArray26[0] = this.aFloat73 * this.aFloat65;
		aFloatArray26[1] = this.aFloat73 * this.aFloat66;
		aFloatArray26[2] = this.aFloat73 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray26, 0);
		aFloatArray26[0] = -this.aFloat57 * this.aFloat65;
		aFloatArray26[1] = -this.aFloat57 * this.aFloat66;
		aFloatArray26[2] = -this.aFloat57 * this.aFloat67;
		aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "sx", descriptor = "()V", line = 1785)
	void method6118() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray23, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wb", descriptor = "()V", line = 1785)
	void method6119() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray23, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wu", descriptor = "()V", line = 1785)
	void method6120() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray23, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "sw", descriptor = "()V", line = 1790)
	void method6121() {
		if (this.aBoolean130 && this.anInt715 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ww", descriptor = "()V", line = 1790)
	void method6122() {
		if (this.aBoolean130 && this.anInt715 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "wr", descriptor = "()V", line = 1790)
	void method6123() {
		if (this.aBoolean130 && this.anInt715 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sa", descriptor = "()V", line = 1795)
	void method6124() {
		this.aFloat72 = this.aFloat64 - (float) this.anInt707 - this.aFloat70;
		this.aFloat56 = this.aFloat72 - (float) this.anInt715 * this.aFloat69;
		if (this.aFloat56 < this.aFloat63) {
			this.aFloat56 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat72);
		aFloatArray26[0] = (float) (this.anInt721 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (this.anInt721 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (this.anInt721 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wx", descriptor = "()V", line = 1795)
	void method6125() {
		this.aFloat72 = this.aFloat64 - (float) this.anInt707 - this.aFloat70;
		this.aFloat56 = this.aFloat72 - (float) this.anInt715 * this.aFloat69;
		if (this.aFloat56 < this.aFloat63) {
			this.aFloat56 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat72);
		aFloatArray26[0] = (float) (this.anInt721 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (this.anInt721 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (this.anInt721 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wv", descriptor = "()V", line = 1795)
	void method6126() {
		this.aFloat72 = this.aFloat64 - (float) this.anInt707 - this.aFloat70;
		this.aFloat56 = this.aFloat72 - (float) this.anInt715 * this.aFloat69;
		if (this.aFloat56 < this.aFloat63) {
			this.aFloat56 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat72);
		aFloatArray26[0] = (float) (this.anInt721 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (this.anInt721 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (this.anInt721 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "wm", descriptor = "()V", line = 1795)
	void method6127() {
		this.aFloat72 = this.aFloat64 - (float) this.anInt707 - this.aFloat70;
		this.aFloat56 = this.aFloat72 - (float) this.anInt715 * this.aFloat69;
		if (this.aFloat56 < this.aFloat63) {
			this.aFloat56 = this.aFloat63;
		}
		OpenGL.glFogf(2915, this.aFloat56);
		OpenGL.glFogf(2916, this.aFloat72);
		aFloatArray26[0] = (float) (this.anInt721 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (this.anInt721 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (this.anInt721 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "kk", descriptor = "(I)Lclient!da;", line = 1807)
	@Override
	public Class91 method20297(@OriginalArg(0) int arg0) {
		return this.aBoolean140 ? new Class91_Sub1_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!aeq", name = "dk", descriptor = "(I)Lclient!da;", line = 1807)
	@Override
	public Class91 method20251(@OriginalArg(0) int arg0) {
		return this.aBoolean140 ? new Class91_Sub1_Sub2(this, arg0) : null;
	}

	@OriginalMember(owner = "client!aeq", name = "ds", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 1811)
	@Override
	public Class91 method20220(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean140 && this.aBoolean134) {
			@Pc(11) Class91_Sub1_Sub1 local11 = null;
			@Pc(14) Class91_Sub1 local14 = (Class91_Sub1) arg0;
			@Pc(17) Class91_Sub1 local17 = (Class91_Sub1) arg1;
			@Pc(20) Class78_Sub1 local20 = local14.method18428();
			@Pc(23) Class78_Sub1 local23 = local17.method18428();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt254 > local23.anInt254 ? local20.anInt254 : local23.anInt254;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class91_Sub1_Sub1) {
					@Pc(50) Class91_Sub1_Sub1 local50 = (Class91_Sub1_Sub1) arg3;
					if (local50.method18365() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class91_Sub1_Sub1(this, local38);
				}
				if (local11.method18369(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "kd", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 1811)
	@Override
	public Class91 method20252(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean140 && this.aBoolean134) {
			@Pc(11) Class91_Sub1_Sub1 local11 = null;
			@Pc(14) Class91_Sub1 local14 = (Class91_Sub1) arg0;
			@Pc(17) Class91_Sub1 local17 = (Class91_Sub1) arg1;
			@Pc(20) Class78_Sub1 local20 = local14.method18428();
			@Pc(23) Class78_Sub1 local23 = local17.method18428();
			if (local20 != null && local23 != null) {
				@Pc(38) int local38 = local20.anInt254 > local23.anInt254 ? local20.anInt254 : local23.anInt254;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class91_Sub1_Sub1) {
					@Pc(50) Class91_Sub1_Sub1 local50 = (Class91_Sub1_Sub1) arg3;
					if (local50.method18365() == local38) {
						local11 = local50;
					}
				}
				if (local11 == null) {
					local11 = new Class91_Sub1_Sub1(this, local38);
				}
				if (local11.method18369(local20, local23, arg2)) {
					return local11;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aeq", name = "df", descriptor = "(Lclient!da;)V", line = 1831)
	@Override
	public final void method20133(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub1_1 = (Class91_Sub1) arg0;
	}

	@OriginalMember(owner = "client!aeq", name = "ke", descriptor = "(Lclient!da;)V", line = 1831)
	@Override
	public final void method20289(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub1_1 = (Class91_Sub1) arg0;
	}

	@OriginalMember(owner = "client!aeq", name = "sg", descriptor = "()Lclient!adf;", line = 1835)
	final Class78_Sub1 method6128() {
		return this.aClass91_Sub1_1 == null ? null : this.aClass91_Sub1_1.method18428();
	}

	@OriginalMember(owner = "client!aeq", name = "ki", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24666(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "db", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24666(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ku", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24666(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "kb", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24666(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ks", descriptor = "(IIII)V", line = 1839)
	@Override
	public final void method20292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24666(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "dx", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24669(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "lo", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24669(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "lb", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24669(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "lk", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24669(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "lz", descriptor = "(II)V", line = 1844)
	@Override
	public final void method20157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass191_1 != null) {
			this.aClass191_1.method24669(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "dc", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20136() {
		return this.aClass191_1 == null ? false : this.aClass191_1.method24656();
	}

	@OriginalMember(owner = "client!aeq", name = "lu", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20298() {
		return this.aClass191_1 == null ? false : this.aClass191_1.method24656();
	}

	@OriginalMember(owner = "client!aeq", name = "lf", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20224() {
		return this.aClass191_1 == null ? false : this.aClass191_1.method24656();
	}

	@OriginalMember(owner = "client!aeq", name = "lw", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20359() {
		return this.aClass191_1 == null ? false : this.aClass191_1.method24656();
	}

	@OriginalMember(owner = "client!aeq", name = "lm", descriptor = "()Z", line = 1849)
	@Override
	public final boolean method20240() {
		return this.aClass191_1 == null ? false : this.aClass191_1.method24656();
	}

	@OriginalMember(owner = "client!aeq", name = "st", descriptor = "()Z", line = 1854)
	boolean method6129() {
		if (this.aClass77_Sub11_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub3_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub3_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "wz", descriptor = "()Z", line = 1854)
	boolean method6130() {
		if (this.aClass77_Sub11_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub3_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub3_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "wd", descriptor = "()Z", line = 1854)
	boolean method6131() {
		if (this.aClass77_Sub11_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub3_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub3_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "we", descriptor = "()Z", line = 1854)
	boolean method6132() {
		if (this.aClass77_Sub11_Sub3_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub3_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub3_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "dl", descriptor = "()Z", line = 1865)
	@Override
	public boolean method20213() {
		return this.aClass77_Sub11_Sub3_1 != null && this.aClass77_Sub11_Sub3_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "lp", descriptor = "()Z", line = 1865)
	@Override
	public boolean method20301() {
		return this.aClass77_Sub11_Sub3_1 != null && this.aClass77_Sub11_Sub3_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "lh", descriptor = "()Z", line = 1865)
	@Override
	public boolean method20302() {
		return this.aClass77_Sub11_Sub3_1 != null && this.aClass77_Sub11_Sub3_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "dg", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20340(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class77_Sub11_Sub3.aFloat219 = arg0;
		Class77_Sub11_Sub3.aFloat221 = arg1;
		Class77_Sub11_Sub3.aFloat218 = arg2;
		Class77_Sub11_Sub3.aFloat217 = arg3;
		Class77_Sub11_Sub3.aFloat220 = arg4;
	}

	@OriginalMember(owner = "client!aeq", name = "la", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class77_Sub11_Sub3.aFloat219 = arg0;
		Class77_Sub11_Sub3.aFloat221 = arg1;
		Class77_Sub11_Sub3.aFloat218 = arg2;
		Class77_Sub11_Sub3.aFloat217 = arg3;
		Class77_Sub11_Sub3.aFloat220 = arg4;
	}

	@OriginalMember(owner = "client!aeq", name = "ln", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20304(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class77_Sub11_Sub3.aFloat219 = arg0;
		Class77_Sub11_Sub3.aFloat221 = arg1;
		Class77_Sub11_Sub3.aFloat218 = arg2;
		Class77_Sub11_Sub3.aFloat217 = arg3;
		Class77_Sub11_Sub3.aFloat220 = arg4;
	}

	@OriginalMember(owner = "client!aeq", name = "lv", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20305(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class77_Sub11_Sub3.aFloat219 = arg0;
		Class77_Sub11_Sub3.aFloat221 = arg1;
		Class77_Sub11_Sub3.aFloat218 = arg2;
		Class77_Sub11_Sub3.aFloat217 = arg3;
		Class77_Sub11_Sub3.aFloat220 = arg4;
	}

	@OriginalMember(owner = "client!aeq", name = "ls", descriptor = "(FFFFF)V", line = 1869)
	@Override
	public void method20306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		Class77_Sub11_Sub3.aFloat219 = arg0;
		Class77_Sub11_Sub3.aFloat221 = arg1;
		Class77_Sub11_Sub3.aFloat218 = arg2;
		Class77_Sub11_Sub3.aFloat217 = arg3;
		Class77_Sub11_Sub3.aFloat220 = arg4;
	}

	@OriginalMember(owner = "client!aeq", name = "lx", descriptor = "([I)Lclient!dh;", line = 1877)
	@Override
	public Class85 method20308(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "dd", descriptor = "([I)Lclient!dh;", line = 1877)
	@Override
	public Class85 method20351(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "lq", descriptor = "([I)Lclient!dh;", line = 1877)
	@Override
	public Class85 method20307(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "lg", descriptor = "([I)Lclient!dh;", line = 1877)
	@Override
	public Class85 method20196(@OriginalArg(0) int[] arg0) {
		return new Class85_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!aeq", name = "xb", descriptor = "()Z", line = 1881)
	boolean method6133() {
		if (this.aClass77_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub1_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "sl", descriptor = "()Z", line = 1881)
	boolean method6134() {
		if (this.aClass77_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub1_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "xe", descriptor = "()Z", line = 1881)
	boolean method6135() {
		if (this.aClass77_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub1_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "xs", descriptor = "()Z", line = 1881)
	boolean method6136() {
		if (this.aClass77_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub1_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "xi", descriptor = "()Z", line = 1881)
	boolean method6137() {
		if (this.aClass77_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub1_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "dj", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20093() {
		return this.aClass77_Sub11_Sub1_1 != null && this.aClass77_Sub11_Sub1_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "qx", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20083() {
		return this.aClass77_Sub11_Sub1_1 != null && this.aClass77_Sub11_Sub1_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "qe", descriptor = "()Z", line = 1892)
	@Override
	public boolean method20379() {
		return this.aClass77_Sub11_Sub1_1 != null && this.aClass77_Sub11_Sub1_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "eh", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 1896)
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
		Class77_Sub11_Sub1.aClass85_Sub2Array1[0] = (Class85_Sub2) arg0;
		Class77_Sub11_Sub1.aFloatArray69[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.aClass85_Sub2Array1[1] = (Class85_Sub2) arg2;
		Class77_Sub11_Sub1.aFloatArray69[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.aClass85_Sub2Array1[2] = (Class85_Sub2) arg4;
		Class77_Sub11_Sub1.aFloatArray69[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.anInt2765 = local1;
		Class77_Sub11_Sub1.aFloat190 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!aeq", name = "lc", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 1896)
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
		Class77_Sub11_Sub1.aClass85_Sub2Array1[0] = (Class85_Sub2) arg0;
		Class77_Sub11_Sub1.aFloatArray69[0] = arg1;
		if (arg1 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.aClass85_Sub2Array1[1] = (Class85_Sub2) arg2;
		Class77_Sub11_Sub1.aFloatArray69[1] = arg3;
		if (arg3 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.aClass85_Sub2Array1[2] = (Class85_Sub2) arg4;
		Class77_Sub11_Sub1.aFloatArray69[2] = arg5;
		if (arg5 > 0.0F) {
			local1++;
		}
		Class77_Sub11_Sub1.anInt2765 = local1;
		Class77_Sub11_Sub1.aFloat190 = 1.0F - (arg1 + arg3 + arg5);
	}

	@OriginalMember(owner = "client!aeq", name = "ej", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20140() {
		if (this.aClass77_Sub11_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub2_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub2_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "np", descriptor = "()Z", line = 1928)
	@Override
	public final boolean method20349() {
		if (this.aClass77_Sub11_Sub2_1 == null) {
			return false;
		}
		if (!this.aClass77_Sub11_Sub2_1.method21284()) {
			if (!this.aClass191_1.method24671(this.aClass77_Sub11_Sub2_1)) {
				return false;
			}
			this.aClass198_1.method25489();
		}
		return true;
	}

	@OriginalMember(owner = "client!aeq", name = "lt", descriptor = "()V", line = 1939)
	@Override
	public final void method20311() {
		if (this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284()) {
			this.aClass191_1.method24674(this.aClass77_Sub11_Sub2_1);
			this.aClass198_1.method25489();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "eo", descriptor = "()V", line = 1939)
	@Override
	public final void method20141() {
		if (this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284()) {
			this.aClass191_1.method24674(this.aClass77_Sub11_Sub2_1);
			this.aClass198_1.method25489();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ly", descriptor = "()V", line = 1939)
	@Override
	public final void method20310() {
		if (this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284()) {
			this.aClass191_1.method24674(this.aClass77_Sub11_Sub2_1);
			this.aClass198_1.method25489();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "le", descriptor = "()V", line = 1939)
	@Override
	public final void method20364() {
		if (this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284()) {
			this.aClass191_1.method24674(this.aClass77_Sub11_Sub2_1);
			this.aClass198_1.method25489();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ll", descriptor = "()V", line = 1939)
	@Override
	public final void method20303() {
		if (this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284()) {
			this.aClass191_1.method24674(this.aClass77_Sub11_Sub2_1);
			this.aClass198_1.method25489();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ep", descriptor = "()Z", line = 1946)
	@Override
	public final boolean method20183() {
		return this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "ld", descriptor = "()Z", line = 1946)
	@Override
	public final boolean method20312() {
		return this.aClass77_Sub11_Sub2_1 != null && this.aClass77_Sub11_Sub2_1.method21284();
	}

	@OriginalMember(owner = "client!aeq", name = "es", descriptor = "(FFFFFF)V", line = 1950)
	@Override
	final void method20144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class77_Sub11_Sub2.aFloat212 = arg0;
		Class77_Sub11_Sub2.aFloat211 = arg1;
		Class77_Sub11_Sub2.aFloat210 = arg2;
	}

	@OriginalMember(owner = "client!aeq", name = "lj", descriptor = "(FFFFFF)V", line = 1950)
	@Override
	final void method20313(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		Class77_Sub11_Sub2.aFloat212 = arg0;
		Class77_Sub11_Sub2.aFloat211 = arg1;
		Class77_Sub11_Sub2.aFloat210 = arg2;
	}

	@OriginalMember(owner = "client!aeq", name = "ac", descriptor = "()Lclient!aeo;", line = 1956)
	@Override
	public Class92_Sub1 method20063() {
		return new Class92_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aeq", name = "mt", descriptor = "()Lclient!aeo;", line = 1956)
	@Override
	public Class92_Sub1 method20325() {
		return new Class92_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aeq", name = "mi", descriptor = "()Lclient!aeo;", line = 1956)
	@Override
	public Class92_Sub1 method20326() {
		return new Class92_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!aeq", name = "at", descriptor = "(II)Lclient!de;", line = 1960)
	@Override
	public Interface20 method20064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeq", name = "mr", descriptor = "(II)Lclient!de;", line = 1960)
	@Override
	public Interface20 method20328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeq", name = "mv", descriptor = "(II)Lclient!de;", line = 1960)
	@Override
	public Interface20 method20329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeq", name = "mb", descriptor = "(II)Lclient!de;", line = 1960)
	@Override
	public Interface20 method20356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeq", name = "ae", descriptor = "(III)Lclient!de;", line = 1964)
	@Override
	public Interface20 method20065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "me", descriptor = "(III)Lclient!de;", line = 1964)
	@Override
	public Interface20 method20357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "mg", descriptor = "(III)Lclient!de;", line = 1964)
	@Override
	public Interface20 method20363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class77_Sub1_Sub1(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "mj", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 1968)
	@Override
	public Interface21 method20327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class77_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "av", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 1968)
	@Override
	public Interface21 method20376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class77_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "ml", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 1968)
	@Override
	public Interface21 method20073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class77_Sub1_Sub1(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!aeq", name = "sj", descriptor = "(I[BIZ)Lclient!ca;", line = 1972)
	final Interface15 method6138(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface15) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub2(this, arg0, arg1, arg2, arg3) : new Class74_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!aeq", name = "xj", descriptor = "(I[BIZ)Lclient!ca;", line = 1972)
	final Interface15 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface15) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub2(this, arg0, arg1, arg2, arg3) : new Class74_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!aeq", name = "xr", descriptor = "(I[BIZ)Lclient!bn;", line = 1979)
	final Interface14 method6140(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!aeq", name = "sd", descriptor = "(I[BIZ)Lclient!bn;", line = 1979)
	final Interface14 method6141(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!aeq", name = "xu", descriptor = "(I[BIZ)Lclient!bn;", line = 1979)
	final Interface14 method6142(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!aeq", name = "sp", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bn;", line = 1986)
	final Interface14 method6143(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aeq", name = "xm", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bn;", line = 1986)
	final Interface14 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aeq", name = "xz", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bn;", line = 1986)
	final Interface14 method6145(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aeq", name = "xl", descriptor = "(ILclient!jaclib/memory/Buffer;IZ)Lclient!bn;", line = 1986)
	final Interface14 method6146(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface14) (this.aBoolean148 && (!arg3 || this.aBoolean137) ? new Class81_Sub1(this, arg0, arg1, arg2, arg3) : new Class74_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aeq", name = "xo", descriptor = "(Lclient!bn;)V", line = 1993)
	final void method6147(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34962, arg0.method1787());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sn", descriptor = "(Lclient!bn;)V", line = 1993)
	final void method6148(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34962, arg0.method1787());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xt", descriptor = "(Lclient!bn;)V", line = 1993)
	final void method6149(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34962, arg0.method1787());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xa", descriptor = "(Lclient!bn;)V", line = 1993)
	final void method6150(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34962, arg0.method1787());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xg", descriptor = "(Lclient!bn;)V", line = 1993)
	final void method6151(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34962, arg0.method1787());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sm", descriptor = "(Lclient!ca;)V", line = 2000)
	final void method6152(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_2 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34963, arg0.method1833());
			}
			this.anInterface15_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xp", descriptor = "(Lclient!ca;)V", line = 2000)
	final void method6153(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_2 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34963, arg0.method1833());
			}
			this.anInterface15_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xx", descriptor = "(Lclient!ca;)V", line = 2000)
	final void method6154(@OriginalArg(0) Interface15 arg0) {
		if (this.anInterface15_2 != arg0) {
			if (this.aBoolean148) {
				OpenGL.glBindBufferARB(34963, arg0.method1833());
			}
			this.anInterface15_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "se", descriptor = "(Lclient!bk;Lclient!bk;Lclient!bk;Lclient!bk;)V", line = 2007)
	final void method6155(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) Class172 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6148(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6148(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6148(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6148(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xn", descriptor = "(Lclient!bk;Lclient!bk;Lclient!bk;Lclient!bk;)V", line = 2007)
	final void method6156(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) Class172 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6148(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6148(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6148(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6148(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xw", descriptor = "(Lclient!bk;Lclient!bk;Lclient!bk;Lclient!bk;)V", line = 2007)
	final void method6157(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) Class172 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6148(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6148(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6148(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6148(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "xq", descriptor = "(Lclient!bk;Lclient!bk;Lclient!bk;Lclient!bk;)V", line = 2007)
	final void method6158(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) Class172 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6148(arg0.anInterface14_6);
			OpenGL.glVertexPointer(arg0.aByte106, arg0.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg0.aByte107);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6148(arg1.anInterface14_6);
			OpenGL.glNormalPointer(arg1.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg1.aByte107);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6148(arg2.anInterface14_6);
			OpenGL.glColorPointer(arg2.aByte106, arg2.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg2.aByte107);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6148(arg3.anInterface14_6);
			OpenGL.glTexCoordPointer(arg3.aByte106, arg3.aShort145, this.anInterface14_4.method1783(), this.anInterface14_4.method1784() + (long) arg3.aByte107);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "sz", descriptor = "(III)V", line = 2034)
	final void method6159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "xd", descriptor = "(III)V", line = 2034)
	final void method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "xc", descriptor = "(III)V", line = 2034)
	final void method6161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "xh", descriptor = "(III)V", line = 2034)
	final void method6162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glDrawArrays(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "sr", descriptor = "(Lclient!ca;III)V", line = 2038)
	final void method6163(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6152(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1831() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!aeq", name = "xy", descriptor = "(Lclient!ca;III)V", line = 2038)
	final void method6164(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6152(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1831() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!aeq", name = "xk", descriptor = "(Lclient!ca;III)V", line = 2038)
	final void method6165(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6152(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1831() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!aeq", name = "xv", descriptor = "(Lclient!ca;III)V", line = 2038)
	final void method6166(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method6152(arg0);
		OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method1831() + (long) (arg2 * 2));
	}

	@OriginalMember(owner = "client!aeq", name = "sk", descriptor = "()V", line = 2043)
	final void method6167() {
		if (this.anInt681 == 1) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6268((byte) 0);
		this.anInt681 = 1;
	}

	@OriginalMember(owner = "client!aeq", name = "xf", descriptor = "()V", line = 2043)
	final void method6168() {
		if (this.anInt681 == 1) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6268((byte) 0);
		this.anInt681 = 1;
	}

	@OriginalMember(owner = "client!aeq", name = "yu", descriptor = "()V", line = 2043)
	final void method6169() {
		if (this.anInt681 == 1) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6268((byte) 0);
		this.anInt681 = 1;
	}

	@OriginalMember(owner = "client!aeq", name = "ys", descriptor = "()V", line = 2043)
	final void method6170() {
		if (this.anInt681 == 1) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6195(null);
		this.method6180(-2);
		this.method6198(1);
		this.method6268((byte) 0);
		this.anInt681 = 1;
	}

	@OriginalMember(owner = "client!aeq", name = "su", descriptor = "()V", line = 2058)
	final void method6171() {
		if (this.anInt681 == 2) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6268((byte) 0);
		this.anInt681 = 2;
	}

	@OriginalMember(owner = "client!aeq", name = "yv", descriptor = "()V", line = 2058)
	final void method6172() {
		if (this.anInt681 == 2) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6268((byte) 0);
		this.anInt681 = 2;
	}

	@OriginalMember(owner = "client!aeq", name = "yr", descriptor = "()V", line = 2058)
	final void method6173() {
		if (this.anInt681 == 2) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6268((byte) 0);
		this.anInt681 = 2;
	}

	@OriginalMember(owner = "client!aeq", name = "sc", descriptor = "()V", line = 2071)
	final void method6174() {
		if (this.anInt681 == 4) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 4;
	}

	@OriginalMember(owner = "client!aeq", name = "yf", descriptor = "()V", line = 2071)
	final void method6175() {
		if (this.anInt681 == 4) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 4;
	}

	@OriginalMember(owner = "client!aeq", name = "yc", descriptor = "()V", line = 2071)
	final void method6176() {
		if (this.anInt681 == 4) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 4;
	}

	@OriginalMember(owner = "client!aeq", name = "yo", descriptor = "()V", line = 2071)
	final void method6177() {
		if (this.anInt681 == 4) {
			return;
		}
		this.method6091();
		this.method6229(false);
		this.method6233(false);
		this.method6239(false);
		this.method6241(false);
		this.method6180(-2);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 4;
	}

	@OriginalMember(owner = "client!aeq", name = "th", descriptor = "()V", line = 2085)
	final void method6178() {
		if (this.anInt681 == 8) {
			return;
		}
		this.method6096();
		this.method6229(true);
		this.method6239(true);
		this.method6241(true);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 8;
	}

	@OriginalMember(owner = "client!aeq", name = "yw", descriptor = "()V", line = 2085)
	final void method6179() {
		if (this.anInt681 == 8) {
			return;
		}
		this.method6096();
		this.method6229(true);
		this.method6239(true);
		this.method6241(true);
		this.method6250(1);
		this.method6268((byte) 0);
		this.anInt681 = 8;
	}

	@OriginalMember(owner = "client!aeq", name = "ti", descriptor = "(I)V", line = 2097)
	final void method6180(@OriginalArg(0) int arg0) {
		this.method6183(arg0, true);
	}

	@OriginalMember(owner = "client!aeq", name = "yg", descriptor = "(I)V", line = 2097)
	final void method6181(@OriginalArg(0) int arg0) {
		this.method6183(arg0, true);
	}

	@OriginalMember(owner = "client!aeq", name = "yb", descriptor = "(I)V", line = 2097)
	final void method6182(@OriginalArg(0) int arg0) {
		this.method6183(arg0, true);
	}

	@OriginalMember(owner = "client!aeq", name = "tv", descriptor = "(IZ)V", line = 2101)
	final void method6183(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6187(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!aeq", name = "ya", descriptor = "(IZ)V", line = 2101)
	final void method6184(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6187(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!aeq", name = "yk", descriptor = "(IZ)V", line = 2101)
	final void method6185(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6187(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!aeq", name = "yp", descriptor = "(IZ)V", line = 2101)
	final void method6186(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6187(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!aeq", name = "tf", descriptor = "(IZZ)V", line = 2105)
	final void method6187(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt703 || this.aBoolean122 != this.aBoolean141) {
			@Pc(10) Class78_Sub2 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean141 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method6225();
			} else {
				@Pc(33) Class215 local33 = this.aClass209_9.method25584(arg0);
				if (local33.aBoolean638) {
					local10 = this.aClass198_1.method25476(local33);
					if (local33.aByte113 == 0 && local33.aByte114 == 0) {
						this.method6225();
					} else {
						this.method6221((float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte114 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean141) {
						local14 = local33.aByte119;
						local16 = local33.anInt3728 * 1880963453;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte123;
				} else {
					this.method6225();
				}
				if (local33.aClass597_2 == Class597.aClass597_3) {
					local25 = local33.aByte115;
				}
			}
			this.method6268(local25);
			this.aClass183_1.method24587(local23, local14, local16, arg1, arg2);
			if (!this.aClass183_1.method24590(local10, local12)) {
				this.method6195(local10);
				this.method6198(local12);
			}
			this.aBoolean122 = this.aBoolean141;
			this.anInt703 = arg0;
		}
		this.anInt681 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aeq", name = "yq", descriptor = "(IZZ)V", line = 2105)
	final void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt703 || this.aBoolean122 != this.aBoolean141) {
			@Pc(10) Class78_Sub2 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean141 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method6225();
			} else {
				@Pc(33) Class215 local33 = this.aClass209_9.method25584(arg0);
				if (local33.aBoolean638) {
					local10 = this.aClass198_1.method25476(local33);
					if (local33.aByte113 == 0 && local33.aByte114 == 0) {
						this.method6225();
					} else {
						this.method6221((float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte114 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean141) {
						local14 = local33.aByte119;
						local16 = local33.anInt3728 * 1880963453;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte123;
				} else {
					this.method6225();
				}
				if (local33.aClass597_2 == Class597.aClass597_3) {
					local25 = local33.aByte115;
				}
			}
			this.method6268(local25);
			this.aClass183_1.method24587(local23, local14, local16, arg1, arg2);
			if (!this.aClass183_1.method24590(local10, local12)) {
				this.method6195(local10);
				this.method6198(local12);
			}
			this.aBoolean122 = this.aBoolean141;
			this.anInt703 = arg0;
		}
		this.anInt681 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aeq", name = "yi", descriptor = "(IZZ)V", line = 2105)
	final void method6189(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt703 || this.aBoolean122 != this.aBoolean141) {
			@Pc(10) Class78_Sub2 local10 = null;
			@Pc(12) byte local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean141 ? 3 : 0;
			@Pc(25) byte local25 = 0;
			if (arg0 < 0) {
				this.method6225();
			} else {
				@Pc(33) Class215 local33 = this.aClass209_9.method25584(arg0);
				if (local33.aBoolean638) {
					local10 = this.aClass198_1.method25476(local33);
					if (local33.aByte113 == 0 && local33.aByte114 == 0) {
						this.method6225();
					} else {
						this.method6221((float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte113 / 64.0F % 1.0F, (float) (this.anInt723 % 128000) / 1000.0F * (float) local33.aByte114 / 64.0F % 1.0F, 0.0F);
					}
					if (!this.aBoolean141) {
						local14 = local33.aByte119;
						local16 = local33.anInt3728 * 1880963453;
						local23 = local33.aByte118;
					}
					local12 = local33.aByte123;
				} else {
					this.method6225();
				}
				if (local33.aClass597_2 == Class597.aClass597_3) {
					local25 = local33.aByte115;
				}
			}
			this.method6268(local25);
			this.aClass183_1.method24587(local23, local14, local16, arg1, arg2);
			if (!this.aClass183_1.method24590(local10, local12)) {
				this.method6195(local10);
				this.method6198(local12);
			}
			this.aBoolean122 = this.aBoolean141;
			this.anInt703 = arg0;
		}
		this.anInt681 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aeq", name = "tz", descriptor = "(I)V", line = 2148)
	final void method6190(@OriginalArg(0) int arg0) {
		if (this.anInt714 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt714 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yy", descriptor = "(I)V", line = 2148)
	final void method6191(@OriginalArg(0) int arg0) {
		if (this.anInt714 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt714 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yj", descriptor = "(I)V", line = 2148)
	final void method6192(@OriginalArg(0) int arg0) {
		if (this.anInt714 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt714 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yn", descriptor = "(I)V", line = 2148)
	final void method6193(@OriginalArg(0) int arg0) {
		if (this.anInt714 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt714 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yl", descriptor = "(I)V", line = 2148)
	final void method6194(@OriginalArg(0) int arg0) {
		if (this.anInt714 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt714 = arg0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tj", descriptor = "(Lclient!bx;)V", line = 2155)
	final void method6195(@OriginalArg(0) Class78 arg0) {
		@Pc(5) Class78 local5 = this.aClass78Array1[this.anInt714];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2408);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2408);
				} else if (arg0.anInt2408 != local5.anInt2408) {
					OpenGL.glDisable(local5.anInt2408);
					OpenGL.glEnable(arg0.anInt2408);
				}
				OpenGL.glBindTexture(arg0.anInt2408, arg0.anInt2410);
			}
			this.aClass78Array1[this.anInt714] = arg0;
		}
		this.anInt681 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aeq", name = "yx", descriptor = "(Lclient!bx;)V", line = 2155)
	final void method6196(@OriginalArg(0) Class78 arg0) {
		@Pc(5) Class78 local5 = this.aClass78Array1[this.anInt714];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2408);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2408);
				} else if (arg0.anInt2408 != local5.anInt2408) {
					OpenGL.glDisable(local5.anInt2408);
					OpenGL.glEnable(arg0.anInt2408);
				}
				OpenGL.glBindTexture(arg0.anInt2408, arg0.anInt2410);
			}
			this.aClass78Array1[this.anInt714] = arg0;
		}
		this.anInt681 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aeq", name = "yz", descriptor = "(Lclient!bx;)V", line = 2155)
	final void method6197(@OriginalArg(0) Class78 arg0) {
		@Pc(5) Class78 local5 = this.aClass78Array1[this.anInt714];
		if (local5 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local5.anInt2408);
			} else {
				if (local5 == null) {
					OpenGL.glEnable(arg0.anInt2408);
				} else if (arg0.anInt2408 != local5.anInt2408) {
					OpenGL.glDisable(local5.anInt2408);
					OpenGL.glEnable(arg0.anInt2408);
				}
				OpenGL.glBindTexture(arg0.anInt2408, arg0.anInt2410);
			}
			this.aClass78Array1[this.anInt714] = arg0;
		}
		this.anInt681 &= 0xFFFFFFEE;
	}

	@OriginalMember(owner = "client!aeq", name = "td", descriptor = "(I)V", line = 2174)
	final void method6198(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6207(7681, 7681);
		} else if (arg0 == 0) {
			this.method6207(8448, 8448);
		} else if (arg0 == 2) {
			this.method6207(34165, 7681);
		} else if (arg0 == 3) {
			this.method6207(260, 8448);
		} else if (arg0 == 4) {
			this.method6207(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ym", descriptor = "(I)V", line = 2174)
	final void method6199(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6207(7681, 7681);
		} else if (arg0 == 0) {
			this.method6207(8448, 8448);
		} else if (arg0 == 2) {
			this.method6207(34165, 7681);
		} else if (arg0 == 3) {
			this.method6207(260, 8448);
		} else if (arg0 == 4) {
			this.method6207(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yd", descriptor = "(I)V", line = 2174)
	final void method6200(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6207(7681, 7681);
		} else if (arg0 == 0) {
			this.method6207(8448, 8448);
		} else if (arg0 == 2) {
			this.method6207(34165, 7681);
		} else if (arg0 == 3) {
			this.method6207(260, 8448);
		} else if (arg0 == 4) {
			this.method6207(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yh", descriptor = "(I)V", line = 2174)
	final void method6201(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6207(7681, 7681);
		} else if (arg0 == 0) {
			this.method6207(8448, 8448);
		} else if (arg0 == 2) {
			this.method6207(34165, 7681);
		} else if (arg0 == 3) {
			this.method6207(260, 8448);
		} else if (arg0 == 4) {
			this.method6207(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "yt", descriptor = "(I)V", line = 2174)
	final void method6202(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6207(7681, 7681);
		} else if (arg0 == 0) {
			this.method6207(8448, 8448);
		} else if (arg0 == 2) {
			this.method6207(34165, 7681);
		} else if (arg0 == 3) {
			this.method6207(260, 8448);
		} else if (arg0 == 4) {
			this.method6207(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tc", descriptor = "(I)I", line = 2182)
	final int method6203(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aeq", name = "ye", descriptor = "(I)I", line = 2182)
	final int method6204(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aeq", name = "zk", descriptor = "(I)I", line = 2182)
	final int method6205(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aeq", name = "zt", descriptor = "(II)V", line = 2191)
	final void method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tm", descriptor = "(II)V", line = 2191)
	final void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zq", descriptor = "(II)V", line = 2191)
	final void method6208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zd", descriptor = "(II)V", line = 2191)
	final void method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "za", descriptor = "(II)V", line = 2191)
	final void method6210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zr", descriptor = "(II)V", line = 2191)
	final void method6211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zh", descriptor = "(II)V", line = 2191)
	final void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt676 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt676 = arg0;
			local4 = true;
		}
		if (this.anInt713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt713 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt681 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tn", descriptor = "(III)V", line = 2214)
	final void method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "tk", descriptor = "(III)V", line = 2219)
	final void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "zo", descriptor = "(III)V", line = 2219)
	final void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
	}

	@OriginalMember(owner = "client!aeq", name = "ty", descriptor = "(I)V", line = 2224)
	final void method6216(@OriginalArg(0) int arg0) {
		aFloatArray26[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray26[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "zp", descriptor = "(I)V", line = 2224)
	final void method6217(@OriginalArg(0) int arg0) {
		aFloatArray26[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray26[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "zl", descriptor = "(I)V", line = 2224)
	final void method6218(@OriginalArg(0) int arg0) {
		aFloatArray26[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray26[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "zc", descriptor = "(I)V", line = 2224)
	final void method6219(@OriginalArg(0) int arg0) {
		aFloatArray26[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		aFloatArray26[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		aFloatArray26[2] = (float) (arg0 & 0xFF) / 255.0F;
		aFloatArray26[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "te", descriptor = "(FFFF)V", line = 2232)
	final void method6220(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		aFloatArray26[0] = arg0;
		aFloatArray26[1] = arg1;
		aFloatArray26[2] = arg2;
		aFloatArray26[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!aeq", name = "to", descriptor = "(FFF)V", line = 2240)
	final void method6221(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean132) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "zj", descriptor = "(FFF)V", line = 2240)
	final void method6222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean132) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "zb", descriptor = "(FFF)V", line = 2240)
	final void method6223(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean132) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "zu", descriptor = "(FFF)V", line = 2240)
	final void method6224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean132) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!aeq", name = "tr", descriptor = "()V", line = 2248)
	final void method6225() {
		if (this.aBoolean132) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean132 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zy", descriptor = "()V", line = 2248)
	final void method6226() {
		if (this.aBoolean132) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean132 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zs", descriptor = "()V", line = 2248)
	final void method6227() {
		if (this.aBoolean132) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean132 = false;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zm", descriptor = "(Z)V", line = 2257)
	final void method6228(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean130) {
			this.aBoolean130 = arg0;
			this.method6121();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tg", descriptor = "(Z)V", line = 2257)
	final void method6229(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean130) {
			this.aBoolean130 = arg0;
			this.method6121();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zn", descriptor = "(Z)V", line = 2265)
	final void method6230(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean128) {
			this.aBoolean128 = arg0;
			this.method6236();
			this.anInt681 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zw", descriptor = "(Z)V", line = 2265)
	final void method6231(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean128) {
			this.aBoolean128 = arg0;
			this.method6236();
			this.anInt681 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zv", descriptor = "(Z)V", line = 2265)
	final void method6232(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean128) {
			this.aBoolean128 = arg0;
			this.method6236();
			this.anInt681 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tu", descriptor = "(Z)V", line = 2265)
	final void method6233(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean128) {
			this.aBoolean128 = arg0;
			this.method6236();
			this.anInt681 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tp", descriptor = "(Z)V", line = 2273)
	final void method6234(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean114) {
			this.aBoolean114 = arg0;
			this.method6236();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zg", descriptor = "(Z)V", line = 2273)
	final void method6235(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean114) {
			this.aBoolean114 = arg0;
			this.method6236();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tq", descriptor = "()V", line = 2280)
	void method6236() {
		if (this.aBoolean128 && !this.aBoolean114) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zi", descriptor = "()V", line = 2280)
	void method6237() {
		if (this.aBoolean128 && !this.aBoolean114) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zx", descriptor = "()V", line = 2280)
	void method6238() {
		if (this.aBoolean128 && !this.aBoolean114) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ts", descriptor = "(Z)V", line = 2285)
	final void method6239(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean123) {
			this.aBoolean123 = arg0;
			this.method6246();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "zf", descriptor = "(Z)V", line = 2285)
	final void method6240(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean123) {
			this.aBoolean123 = arg0;
			this.method6246();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tx", descriptor = "(Z)V", line = 2293)
	final void method6241(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean124) {
			this.aBoolean124 = arg0;
			this.method6243();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ze", descriptor = "(Z)V", line = 2293)
	final void method6242(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean124) {
			this.aBoolean124 = arg0;
			this.method6243();
			this.anInt681 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ta", descriptor = "()V", line = 2301)
	final void method6243() {
		OpenGL.glDepthMask(this.aBoolean124 && this.aBoolean126);
	}

	@OriginalMember(owner = "client!aeq", name = "zz", descriptor = "()V", line = 2301)
	final void method6244() {
		OpenGL.glDepthMask(this.aBoolean124 && this.aBoolean126);
	}

	@OriginalMember(owner = "client!aeq", name = "aap", descriptor = "()V", line = 2301)
	final void method6245() {
		OpenGL.glDepthMask(this.aBoolean124 && this.aBoolean126);
	}

	@OriginalMember(owner = "client!aeq", name = "tw", descriptor = "()V", line = 2305)
	final void method6246() {
		if (this.aBoolean123 && this.aBoolean115) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aaf", descriptor = "()V", line = 2305)
	final void method6247() {
		if (this.aBoolean123 && this.aBoolean115) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aaa", descriptor = "(I)V", line = 2310)
	final void method6248(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "aac", descriptor = "(I)V", line = 2310)
	final void method6249(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "tb", descriptor = "(I)V", line = 2310)
	final void method6250(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "aak", descriptor = "(I)V", line = 2310)
	final void method6251(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "aat", descriptor = "(I)V", line = 2310)
	final void method6252(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "aam", descriptor = "(I)V", line = 2310)
	final void method6253(@OriginalArg(0) int arg0) {
		if (this.anInt725 == arg0) {
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
		if (local10 != this.aBoolean120) {
			OpenGL.glColorMask(local10, local10, local10, true);
			this.aBoolean120 = local10;
		}
		if (local12 != this.aBoolean121) {
			this.aBoolean121 = local12;
			this.method6264();
		}
		if (local14 != this.aBoolean113) {
			this.aBoolean113 = local14;
			this.method6254();
		}
		if (local8 != this.anInt697) {
			this.anInt697 = local8;
			this.method6258();
		}
		this.anInt725 = arg0;
		this.anInt681 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!aeq", name = "tt", descriptor = "()V", line = 2367)
	final void method6254() {
		if (this.aBoolean113) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aar", descriptor = "()V", line = 2367)
	final void method6255() {
		if (this.aBoolean113) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aaq", descriptor = "()V", line = 2367)
	final void method6256() {
		if (this.aBoolean113) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aaj", descriptor = "()V", line = 2372)
	final void method6257() {
		if (this.aBoolean147) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt682 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt682 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt682 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt682 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt697 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt697 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt697 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt697 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt697 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt697 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt697 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "tl", descriptor = "()V", line = 2372)
	final void method6258() {
		if (this.aBoolean147) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt682 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt682 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt682 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt682 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt697 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt697 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt697 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt697 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt697 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt697 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt697 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aan", descriptor = "()V", line = 2372)
	final void method6259() {
		if (this.aBoolean147) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt682 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt682 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt682 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt682 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt697 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt697 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt697 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt697 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt697 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt697 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt697 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aae", descriptor = "()V", line = 2372)
	final void method6260() {
		if (this.aBoolean147) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt682 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt682 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt682 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt682 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt697 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt697 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt697 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt697 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt697 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt697 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt697 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aas", descriptor = "()V", line = 2372)
	final void method6261() {
		if (this.aBoolean147) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt682 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt682 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt682 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt682 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.anInt697 == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.anInt697 == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.anInt697 == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.anInt697 == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.anInt697 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.anInt697 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.anInt697 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aav", descriptor = "(I)V", line = 2414)
	final void method6262(@OriginalArg(0) int arg0) {
		if (this.anInt682 != arg0) {
			this.anInt682 = arg0;
			this.method6258();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "uk", descriptor = "(I)V", line = 2414)
	final void method6263(@OriginalArg(0) int arg0) {
		if (this.anInt682 != arg0) {
			this.anInt682 = arg0;
			this.method6258();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "uo", descriptor = "()V", line = 2421)
	final void method6264() {
		if (this.aBoolean121) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte5 & 0xFF) / 255.0F);
		if (this.anInt711 <= 0) {
			return;
		}
		if (this.aByte5 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aax", descriptor = "()V", line = 2421)
	final void method6265() {
		if (this.aBoolean121) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte5 & 0xFF) / 255.0F);
		if (this.anInt711 <= 0) {
			return;
		}
		if (this.aByte5 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aau", descriptor = "()V", line = 2421)
	final void method6266() {
		if (this.aBoolean121) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte5 & 0xFF) / 255.0F);
		if (this.anInt711 <= 0) {
			return;
		}
		if (this.aByte5 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "aaw", descriptor = "()V", line = 2421)
	final void method6267() {
		if (this.aBoolean121) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte5 & 0xFF) / 255.0F);
		if (this.anInt711 <= 0) {
			return;
		}
		if (this.aByte5 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "up", descriptor = "(B)V", line = 2431)
	final void method6268(@OriginalArg(0) byte arg0) {
		if (this.aByte5 == arg0) {
			return;
		}
		this.aByte5 = arg0;
		if (arg0 == 0) {
			this.method6263(2);
			this.method6250(1);
		} else {
			this.method6263(3);
			this.method6250(3);
		}
		this.method6264();
	}

	@OriginalMember(owner = "client!aeq", name = "ev", descriptor = "()I", line = 2446)
	@Override
	public final int method20185() {
		return this.anInt679 + this.anInt724 + this.anInt712;
	}

	@OriginalMember(owner = "client!aeq", name = "ek", descriptor = "()I", line = 2446)
	@Override
	public final int method20109() {
		return this.anInt679 + this.anInt724 + this.anInt712;
	}

	@OriginalMember(owner = "client!aeq", name = "fv", descriptor = "()I", line = 2446)
	@Override
	public final int method20373() {
		return this.anInt679 + this.anInt724 + this.anInt712;
	}

	@OriginalMember(owner = "client!aeq", name = "r", descriptor = "()I", line = 2446)
	@Override
	public final int method20049() {
		return this.anInt679 + this.anInt724 + this.anInt712;
	}

	@OriginalMember(owner = "client!aeq", name = "s", descriptor = "(I)V", line = 2450)
	@Override
	public final synchronized void method20368(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class77_Sub40 local16;
		while (!this.aClass695_11.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_11.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt679 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_7.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_7.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt724 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_8.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_8.method36388();
			anIntArray57[local1++] = local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_9.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_9.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt712 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		@Pc(215) Class77 local215;
		while (!this.aClass695_13.method36416()) {
			local215 = this.aClass695_13.method36388();
			OpenGL.glDeleteProgramARB((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_10.method36416()) {
			local215 = this.aClass695_10.method36388();
			OpenGL.glDeleteShader((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		this.aClass198_1.method25486();
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Class280.method26667();
		}
		this.anInt723 = local5;
	}

	@OriginalMember(owner = "client!aeq", name = "eg", descriptor = "(I)V", line = 2450)
	@Override
	public final synchronized void method20108(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class77_Sub40 local16;
		while (!this.aClass695_11.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_11.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt679 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_7.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_7.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt724 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_8.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_8.method36388();
			anIntArray57[local1++] = local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_9.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_9.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt712 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		@Pc(215) Class77 local215;
		while (!this.aClass695_13.method36416()) {
			local215 = this.aClass695_13.method36388();
			OpenGL.glDeleteProgramARB((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_10.method36416()) {
			local215 = this.aClass695_10.method36388();
			OpenGL.glDeleteShader((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		this.aClass198_1.method25486();
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Class280.method26667();
		}
		this.anInt723 = local5;
	}

	@OriginalMember(owner = "client!aeq", name = "ey", descriptor = "(I)V", line = 2450)
	@Override
	public final synchronized void method20381(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class77_Sub40 local16;
		while (!this.aClass695_11.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_11.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt679 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_7.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_7.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt724 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_8.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_8.method36388();
			anIntArray57[local1++] = local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_9.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_9.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt712 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		@Pc(215) Class77 local215;
		while (!this.aClass695_13.method36416()) {
			local215 = this.aClass695_13.method36388();
			OpenGL.glDeleteProgramARB((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_10.method36416()) {
			local215 = this.aClass695_10.method36388();
			OpenGL.glDeleteShader((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		this.aClass198_1.method25486();
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Class280.method26667();
		}
		this.anInt723 = local5;
	}

	@OriginalMember(owner = "client!aeq", name = "eb", descriptor = "(I)V", line = 2450)
	@Override
	public final synchronized void method20165(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class77_Sub40 local16;
		while (!this.aClass695_11.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_11.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt679 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_7.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_7.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt724 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_8.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_8.method36388();
			anIntArray57[local1++] = local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_9.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_9.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt712 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		@Pc(215) Class77 local215;
		while (!this.aClass695_13.method36416()) {
			local215 = this.aClass695_13.method36388();
			OpenGL.glDeleteProgramARB((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_10.method36416()) {
			local215 = this.aClass695_10.method36388();
			OpenGL.glDeleteShader((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		this.aClass198_1.method25486();
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Class280.method26667();
		}
		this.anInt723 = local5;
	}

	@OriginalMember(owner = "client!aeq", name = "ez", descriptor = "(I)V", line = 2450)
	@Override
	public final synchronized void method20158(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class77_Sub40 local16;
		while (!this.aClass695_11.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_11.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt679 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteBuffersARB(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_7.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_7.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt724 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteTextures(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteTextures(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_8.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_8.method36388();
			anIntArray57[local1++] = local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local1, anIntArray57, 0);
			local1 = 0;
		}
		while (!this.aClass695_9.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_9.method36388();
			anIntArray57[local1++] = (int) (local16.aLong229 * 8258869577519436579L);
			this.anInt712 -= local16.anInt1786 * -705967177;
			if (local1 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local1, anIntArray57, 0);
			@Pc(183) boolean local183 = false;
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		@Pc(215) Class77 local215;
		while (!this.aClass695_13.method36416()) {
			local215 = this.aClass695_13.method36388();
			OpenGL.glDeleteProgramARB((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_10.method36416()) {
			local215 = this.aClass695_10.method36388();
			OpenGL.glDeleteShader((int) (local215.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_12.method36416()) {
			local16 = (Class77_Sub40) this.aClass695_12.method36388();
			OpenGL.glDeleteLists((int) (local16.aLong229 * 8258869577519436579L), local16.anInt1786 * -705967177);
		}
		this.aClass198_1.method25486();
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Class280.method26667();
		}
		this.anInt723 = local5;
	}

	@OriginalMember(owner = "client!aeq", name = "aal", descriptor = "(II)V", line = 2528)
	final synchronized void method6269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_11.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "ub", descriptor = "(II)V", line = 2528)
	final synchronized void method6270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_11.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aay", descriptor = "(II)V", line = 2534)
	final synchronized void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_7.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "ul", descriptor = "(II)V", line = 2534)
	final synchronized void method6272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_7.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aab", descriptor = "(II)V", line = 2534)
	final synchronized void method6273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_7.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aah", descriptor = "(I)V", line = 2540)
	final synchronized void method6274(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_8.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "uy", descriptor = "(I)V", line = 2540)
	final synchronized void method6275(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_8.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aao", descriptor = "(I)V", line = 2540)
	final synchronized void method6276(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_8.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aai", descriptor = "(I)V", line = 2540)
	final synchronized void method6277(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_8.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aag", descriptor = "(II)V", line = 2545)
	final synchronized void method6278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_9.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "uq", descriptor = "(II)V", line = 2545)
	final synchronized void method6279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_9.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "aaz", descriptor = "(II)V", line = 2545)
	final synchronized void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_9.method36383(local4);
	}

	@OriginalMember(owner = "client!aeq", name = "un", descriptor = "(J)V", line = 2551)
	final synchronized void method6281(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_10.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "aad", descriptor = "(J)V", line = 2551)
	final synchronized void method6282(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_10.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "abb", descriptor = "(J)V", line = 2551)
	final synchronized void method6283(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_10.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "uu", descriptor = "(I)V", line = 2557)
	final synchronized void method6284(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_13.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "abj", descriptor = "(I)V", line = 2557)
	final synchronized void method6285(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_13.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "abl", descriptor = "(I)V", line = 2557)
	final synchronized void method6286(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_13.method36383(local3);
	}

	@OriginalMember(owner = "client!aeq", name = "ur", descriptor = "(I)V", line = 2563)
	void method6287(@OriginalArg(0) int arg0) {
		this.anInt708 = arg0;
		if (this.anInt708 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt708 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt708 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "abi", descriptor = "(I)V", line = 2563)
	void method6288(@OriginalArg(0) int arg0) {
		this.anInt708 = arg0;
		if (this.anInt708 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt708 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt708 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!aeq", name = "ug", descriptor = "(Lclient!dt;)I", line = 2579)
	static int method6289(@OriginalArg(0) Class212 arg0) {
		switch(arg0.anInt3678 * -939549997) {
			case 0:
				return 6408;
			case 1:
				return 6410;
			case 2:
			case 5:
			case 7:
			default:
				throw new IllegalStateException();
			case 3:
				return 6402;
			case 4:
				return 6407;
			case 6:
				return 6409;
			case 8:
				return 6406;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "abs", descriptor = "(Lclient!dt;)I", line = 2579)
	static int method6290(@OriginalArg(0) Class212 arg0) {
		switch(arg0.anInt3678 * -939549997) {
			case 0:
				return 6408;
			case 1:
				return 6410;
			case 2:
			case 5:
			case 7:
			default:
				throw new IllegalStateException();
			case 3:
				return 6402;
			case 4:
				return 6407;
			case 6:
				return 6409;
			case 8:
				return 6406;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "abw", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 2598)
	static int method6291(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		if (arg1 == Class206.aClass206_23) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 6408;
				case 1:
					return 6410;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 6407;
				case 6:
					return 6409;
				case 8:
					return 6406;
			}
		} else if (arg1 == Class206.aClass206_22) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 32859;
				case 1:
					return 36219;
				case 2:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33189;
				case 4:
					return 32852;
				case 6:
					return 32834;
				case 8:
					return 32830;
			}
		} else if (arg1 == Class206.aClass206_21) {
			switch(arg0.anInt3678 * -939549997) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class206.aClass206_25) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34842;
				case 1:
					return 34847;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34843;
				case 6:
					return 34846;
				case 8:
					return 34844;
			}
		} else if (arg1 == Class206.aClass206_19) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34836;
				case 1:
					return 34841;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34837;
				case 6:
					return 34840;
				case 8:
					return 34838;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "uc", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 2598)
	static int method6292(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		if (arg1 == Class206.aClass206_23) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 6408;
				case 1:
					return 6410;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 6407;
				case 6:
					return 6409;
				case 8:
					return 6406;
			}
		} else if (arg1 == Class206.aClass206_22) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 32859;
				case 1:
					return 36219;
				case 2:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33189;
				case 4:
					return 32852;
				case 6:
					return 32834;
				case 8:
					return 32830;
			}
		} else if (arg1 == Class206.aClass206_21) {
			switch(arg0.anInt3678 * -939549997) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class206.aClass206_25) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34842;
				case 1:
					return 34847;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34843;
				case 6:
					return 34846;
				case 8:
					return 34844;
			}
		} else if (arg1 == Class206.aClass206_19) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34836;
				case 1:
					return 34841;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34837;
				case 6:
					return 34840;
				case 8:
					return 34838;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "abk", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 2598)
	static int method6293(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		if (arg1 == Class206.aClass206_23) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 6408;
				case 1:
					return 6410;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 6407;
				case 6:
					return 6409;
				case 8:
					return 6406;
			}
		} else if (arg1 == Class206.aClass206_22) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 32859;
				case 1:
					return 36219;
				case 2:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33189;
				case 4:
					return 32852;
				case 6:
					return 32834;
				case 8:
					return 32830;
			}
		} else if (arg1 == Class206.aClass206_21) {
			switch(arg0.anInt3678 * -939549997) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class206.aClass206_25) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34842;
				case 1:
					return 34847;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34843;
				case 6:
					return 34846;
				case 8:
					return 34844;
			}
		} else if (arg1 == Class206.aClass206_19) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34836;
				case 1:
					return 34841;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34837;
				case 6:
					return 34840;
				case 8:
					return 34838;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "et", descriptor = "(Z)V", line = 2675)
	@Override
	public void method20149(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeq", name = "fy", descriptor = "(Z)V", line = 2675)
	@Override
	public void method20180() {
	}
}
