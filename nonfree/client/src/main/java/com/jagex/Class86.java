package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dx")
public abstract class Class86 {

	@OriginalMember(owner = "client!dx", name = "c", descriptor = "I")
	public static final int anInt2773 = 1;

	@OriginalMember(owner = "client!dx", name = "v", descriptor = "I")
	public static final int anInt2774 = 2;

	@OriginalMember(owner = "client!dx", name = "b", descriptor = "I")
	static final int anInt2775 = 4;

	@OriginalMember(owner = "client!dx", name = "y", descriptor = "I")
	public static final int anInt2776 = 5;

	@OriginalMember(owner = "client!dx", name = "l", descriptor = "I")
	public static final int anInt2777 = 3;

	@OriginalMember(owner = "client!dx", name = "g", descriptor = "I")
	public static final int anInt2778 = 0;

	@OriginalMember(owner = "client!dx", name = "o", descriptor = "I")
	protected static final int anInt2779 = 32;

	@OriginalMember(owner = "client!dx", name = "z", descriptor = "I")
	public static final int anInt2781 = 1;

	@OriginalMember(owner = "client!dx", name = "u", descriptor = "I")
	protected static final int anInt2782 = 4;

	@OriginalMember(owner = "client!dx", name = "i", descriptor = "I")
	protected static final int anInt2783 = 1;

	@OriginalMember(owner = "client!dx", name = "k", descriptor = "I")
	protected static final int anInt2784 = 2;

	@OriginalMember(owner = "client!dx", name = "f", descriptor = "I")
	protected static final int anInt2785 = 16;

	@OriginalMember(owner = "client!dx", name = "e", descriptor = "I")
	protected static final int anInt2786 = 8;

	@OriginalMember(owner = "client!dx", name = "w", descriptor = "I")
	static final int anInt2787 = 8;

	@OriginalMember(owner = "client!dx", name = "j", descriptor = "I")
	public static final int anInt2789 = 2;

	@OriginalMember(owner = "client!dx", name = "p", descriptor = "I")
	public static final int anInt2796 = 0;

	@OriginalMember(owner = "client!dx", name = "ja", descriptor = "I")
	static int anInt2797;

	@OriginalMember(owner = "client!dx", name = "t", descriptor = "[Z")
	static boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!dx", name = "a", descriptor = "Lclient!dn;")
	protected Class92 aClass92_6;

	@OriginalMember(owner = "client!dx", name = "m", descriptor = "Lclient!aer;")
	protected Class92_Sub2 aClass92_Sub2_6;

	@OriginalMember(owner = "client!dx", name = "ai", descriptor = "I")
	protected int anInt2790;

	@OriginalMember(owner = "client!dx", name = "ag", descriptor = "I")
	protected int anInt2791;

	@OriginalMember(owner = "client!dx", name = "al", descriptor = "I")
	public int anInt2792;

	@OriginalMember(owner = "client!dx", name = "ao", descriptor = "I")
	public int anInt2793;

	@OriginalMember(owner = "client!dx", name = "ak", descriptor = "I")
	protected int anInt2794;

	@OriginalMember(owner = "client!dx", name = "n", descriptor = "I")
	int anInt2788 = -1400030897;

	@OriginalMember(owner = "client!dx", name = "h", descriptor = "Ljava/util/Hashtable;")
	protected Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!dx", name = "aj", descriptor = "[Lclient!aeo;")
	final Class92_Sub1[] aClass92_Sub1Array6 = new Class92_Sub1[4];

	@OriginalMember(owner = "client!dx", name = "au", descriptor = "I")
	protected int anInt2795 = 0;

	@OriginalMember(owner = "client!dx", name = "ax", descriptor = "F")
	public float aFloat191 = 0.0F;

	@OriginalMember(owner = "client!dx", name = "d", descriptor = "Lclient!dp;")
	public final Class209 aClass209_9;

	@OriginalMember(owner = "client!dx", name = "x", descriptor = "Lclient!eo;")
	public final Interface24 anInterface24_55;

	@OriginalMember(owner = "client!dx", name = "s", descriptor = "Lclient!md;")
	public final Interface44 anInterface44_6;

	@OriginalMember(owner = "client!dx", name = "r", descriptor = "Lclient!mp;")
	public final Interface47 anInterface47_6;

	@OriginalMember(owner = "client!dx", name = "q", descriptor = "I")
	public final int anInt2780;

	@OriginalMember(owner = "client!dx", name = "w", descriptor = "(Lclient!uv;I)V", line = 40)
	static void method19916(@OriginalArg(0) Interface67 arg0) {
		while (Class575.aLinkedList8.size() > 10) {
			Class575.aLinkedList8.remove();
		}
		Class575.aLinkedList8.add(arg0);
	}

	@OriginalMember(owner = "client!dx", name = "ng", descriptor = "(ILjava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)Lclient!dx;", line = 53)
	public static Class86 method19917(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface44 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface45 arg6, @OriginalArg(7) Class478 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(8) Dimension local8 = arg1.getSize();
			local1 = local8.width;
			local3 = local8.height;
		}
		return method19919(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3);
	}

	@OriginalMember(owner = "client!dx", name = "ni", descriptor = "(ILjava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)Lclient!dx;", line = 53)
	public static Class86 method19918(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface44 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface45 arg6, @OriginalArg(7) Class478 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(8) Dimension local8 = arg1.getSize();
			local1 = local8.width;
			local3 = local8.height;
		}
		return method19919(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3);
	}

	@OriginalMember(owner = "client!dx", name = "c", descriptor = "(ILjava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;IIII)Lclient!dx;", line = 64)
	static synchronized Class86 method19919(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface44 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface45 arg6, @OriginalArg(7) Class478 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg0 == 0) {
			return Class487.method29984(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10);
		} else if (arg0 == 1) {
			return Class194.method25441(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class506.method30262(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class433.method28868(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dx", name = "nc", descriptor = "(ILjava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;III)Lclient!dx;", line = 64)
	static synchronized Class86 method19920(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface44 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface45 arg6, @OriginalArg(7) Class478 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg0 == 0) {
			return Class487.method29984(arg1, arg2, arg3, arg4, arg5, arg6, arg9, arg10);
		} else if (arg0 == 1) {
			return Class194.method25441(arg1, arg2, arg3, arg4, arg5, arg6, arg8);
		} else if (arg0 == 5) {
			return Class506.method30262(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else if (arg0 == 3) {
			return Class433.method28868(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dx", name = "nm", descriptor = "(I)Z", line = 80)
	public static boolean method19921(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dx", name = "nd", descriptor = "(I)Z", line = 80)
	public static boolean method19922(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dx", name = "nu", descriptor = "(I)Z", line = 80)
	public static boolean method19923(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dx", name = "l", descriptor = "([[B[[B[I[B[IIIB)I", line = 82)
	static int method19924(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = arg4[arg5] + local3;
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(39) int local39 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < local39) {
			local39 = arg3[arg6] & 0xFF;
		}
		@Pc(56) byte[] local56 = arg1[arg5];
		@Pc(60) byte[] local60 = arg0[arg6];
		@Pc(64) int local64 = local21 - local3;
		@Pc(68) int local68 = local21 - local13;
		for (@Pc(70) int local70 = local21; local70 < local28; local70++) {
			@Pc(83) int local83 = local56[local64++] + local60[local68++];
			if (local83 < local39) {
				local39 = local83;
			}
		}
		return -local39;
	}

	@OriginalMember(owner = "client!dx", name = "<init>", descriptor = "(Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;)V", line = 83)
	Class86(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface44 arg2, @OriginalArg(3) Interface47 arg3, @OriginalArg(4) Interface45 arg4) {
		this.aClass209_9 = arg0;
		this.anInterface24_55 = arg1;
		this.anInterface44_6 = arg2;
		this.anInterface47_6 = arg3;
		@Pc(33) int local33 = -1;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			if (!aBooleanArray15[local35]) {
				aBooleanArray15[local35] = true;
				local33 = local35;
				break;
			}
		}
		if (local33 == -1) {
			throw new IllegalStateException("");
		}
		this.anInt2780 = local33 * 1144571267;
	}

	@OriginalMember(owner = "client!dx", name = "nz", descriptor = "()V", line = 101)
	public final void method19925() throws Exception_Sub7 {
		this.method20047(0, 0);
	}

	@OriginalMember(owner = "client!dx", name = "w", descriptor = "(I)V", line = 101)
	public final void method19926() throws Exception_Sub7 {
		this.method20047(0, 0);
	}

	@OriginalMember(owner = "client!dx", name = "nq", descriptor = "()V", line = 101)
	public final void method19927() throws Exception_Sub7 {
		this.method20047(0, 0);
	}

	@OriginalMember(owner = "client!dx", name = "nf", descriptor = "()V", line = 101)
	public final void method19928() throws Exception_Sub7 {
		this.method20047(0, 0);
	}

	@OriginalMember(owner = "client!dx", name = "x", descriptor = "(I)V", line = 108)
	public void method19929() {
		aBooleanArray15[this.anInt2780 * 2098753835] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class92_Sub2 local23 = (Class92_Sub2) this.aHashtable6.get(local17);
			local23.method23506();
		}
		this.method20113();
	}

	@OriginalMember(owner = "client!dx", name = "ny", descriptor = "()V", line = 108)
	public void method19930() {
		aBooleanArray15[this.anInt2780 * 2098753835] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class92_Sub2 local23 = (Class92_Sub2) this.aHashtable6.get(local17);
			local23.method23506();
		}
		this.method20113();
	}

	@OriginalMember(owner = "client!dx", name = "nt", descriptor = "()V", line = 108)
	public void method19931() {
		aBooleanArray15[this.anInt2780 * 2098753835] = false;
		@Pc(10) Enumeration local10 = this.aHashtable6.keys();
		while (local10.hasMoreElements()) {
			@Pc(17) Canvas local17 = (Canvas) local10.nextElement();
			@Pc(23) Class92_Sub2 local23 = (Class92_Sub2) this.aHashtable6.get(local17);
			local23.method23506();
		}
		this.method20113();
	}

	@OriginalMember(owner = "client!dx", name = "finalize", descriptor = "()V", line = 123)
	@Override
	void finalize() {
		this.method19929();
	}

	@OriginalMember(owner = "client!dx", name = "hc", descriptor = "()V", line = 123)
	void method19932() {
		this.method19929();
	}

	@OriginalMember(owner = "client!dx", name = "hd", descriptor = "()V", line = 123)
	void method19933() {
		this.method19929();
	}

	@OriginalMember(owner = "client!dx", name = "hp", descriptor = "()V", line = 123)
	void method19934() {
		this.method19929();
	}

	@OriginalMember(owner = "client!dx", name = "oa", descriptor = "(Ljava/awt/Canvas;)V", line = 141)
	public static void method19935(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!dx", name = "oc", descriptor = "(Ljava/awt/Canvas;)V", line = 141)
	public static void method19936(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!dx", name = "ov", descriptor = "(Ljava/awt/Canvas;)V", line = 141)
	public static void method19937(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!dx", name = "h", descriptor = "([I)V", line = 149)
	public void method19938(@OriginalArg(0) int[] arg0) {
		if (this.aClass92_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass92_Sub2_6.method23491();
			arg0[1] = this.aClass92_Sub2_6.method23493();
		}
	}

	@OriginalMember(owner = "client!dx", name = "gy", descriptor = "([I)V", line = 149)
	public void method19939(@OriginalArg(0) int[] arg0) {
		if (this.aClass92_Sub2_6 == null) {
			arg0[1] = 0;
			arg0[0] = 0;
		} else {
			arg0[0] = this.aClass92_Sub2_6.method23491();
			arg0[1] = this.aClass92_Sub2_6.method23493();
		}
	}

	@OriginalMember(owner = "client!dx", name = "aj", descriptor = "(I)Lclient!dn;", line = 161)
	public final Class92 method19940() {
		return this.aClass92_6;
	}

	@OriginalMember(owner = "client!dx", name = "oe", descriptor = "()Lclient!dn;", line = 161)
	public final Class92 method19941() {
		return this.aClass92_6;
	}

	@OriginalMember(owner = "client!dx", name = "ok", descriptor = "()Lclient!dn;", line = 161)
	public final Class92 method19942() {
		return this.aClass92_6;
	}

	@OriginalMember(owner = "client!dx", name = "ai", descriptor = "(I)Lclient!aer;", line = 165)
	public final Class92_Sub2 method19943() {
		return this.aClass92_Sub2_6;
	}

	@OriginalMember(owner = "client!dx", name = "ob", descriptor = "()Lclient!aer;", line = 165)
	public final Class92_Sub2 method19944() {
		return this.aClass92_Sub2_6;
	}

	@OriginalMember(owner = "client!dx", name = "or", descriptor = "()Lclient!aer;", line = 165)
	public final Class92_Sub2 method19945() {
		return this.aClass92_Sub2_6;
	}

	@OriginalMember(owner = "client!dx", name = "oh", descriptor = "()Lclient!aer;", line = 165)
	public final Class92_Sub2 method19946() {
		return this.aClass92_Sub2_6;
	}

	@OriginalMember(owner = "client!dx", name = "od", descriptor = "()Lclient!aer;", line = 165)
	public final Class92_Sub2 method19947() {
		return this.aClass92_Sub2_6;
	}

	@OriginalMember(owner = "client!dx", name = "ag", descriptor = "(Ljava/awt/Canvas;IIS)V", line = 169)
	public final void method19948(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class487.method29986(arg0);
			this.method19951(arg0, this.method20062(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!dx", name = "ow", descriptor = "(Ljava/awt/Canvas;II)V", line = 169)
	public final void method19949(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class487.method29986(arg0);
			this.method19951(arg0, this.method20062(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!dx", name = "ou", descriptor = "(Ljava/awt/Canvas;II)V", line = 169)
	public final void method19950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aHashtable6.containsKey(arg0)) {
			Class487.method29986(arg0);
			this.method19951(arg0, this.method20062(arg0, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!dx", name = "al", descriptor = "(Ljava/awt/Canvas;Lclient!aer;B)V", line = 176)
	final void method19951(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class92_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dx", name = "ol", descriptor = "(Ljava/awt/Canvas;Lclient!aer;)V", line = 176)
	final void method19952(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class92_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dx", name = "os", descriptor = "(Ljava/awt/Canvas;Lclient!aer;)V", line = 176)
	final void method19953(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class92_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dx", name = "ot", descriptor = "(Ljava/awt/Canvas;Lclient!aer;)V", line = 176)
	final void method19954(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class92_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dx", name = "oo", descriptor = "(Ljava/awt/Canvas;Lclient!aer;)V", line = 176)
	final void method19955(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class92_Sub2 arg1) {
		if (arg1 == null) {
			throw new RuntimeException("");
		}
		this.aHashtable6.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!dx", name = "oi", descriptor = "(Ljava/awt/Canvas;)V", line = 181)
	public final void method19956(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class92_Sub2 local10 = (Class92_Sub2) this.aHashtable6.get(arg0);
			local10.method23506();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dx", name = "ao", descriptor = "(Ljava/awt/Canvas;I)V", line = 181)
	public final void method19957(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class92_Sub2 local10 = (Class92_Sub2) this.aHashtable6.get(arg0);
			local10.method23506();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dx", name = "om", descriptor = "(Ljava/awt/Canvas;)V", line = 181)
	public final void method19958(@OriginalArg(0) Canvas arg0) {
		if (this.aHashtable6.containsKey(arg0)) {
			@Pc(10) Class92_Sub2 local10 = (Class92_Sub2) this.aHashtable6.get(arg0);
			local10.method23506();
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dx", name = "ak", descriptor = "(Ljava/awt/Canvas;I)V", line = 190)
	public final void method19959(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "oj", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method19960(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "op", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method19961(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "on", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method19962(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "of", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method19963(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "ox", descriptor = "(Ljava/awt/Canvas;)V", line = 190)
	public final void method19964(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException();
		} else if (this.anInt2788 * 19776081 <= 0 && this.aClass92_Sub2_6 == this.aClass92_6) {
			if (this.aClass92_6 != null) {
				this.aClass92_6.method23496();
			}
			if (this.anInt2788 * 19776081 < 0) {
				this.aClass92_6 = local5;
			}
			this.aClass92_Sub2_6 = local5;
			local5.method23508();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dx", name = "au", descriptor = "(Ljava/awt/Canvas;III)V", line = 200)
	public final void method19965(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23350(arg1, arg2);
	}

	@OriginalMember(owner = "client!dx", name = "oz", descriptor = "(Ljava/awt/Canvas;II)V", line = 200)
	public final void method19966(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23350(arg1, arg2);
	}

	@OriginalMember(owner = "client!dx", name = "oy", descriptor = "(Ljava/awt/Canvas;II)V", line = 200)
	public final void method19967(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class92_Sub2 local5 = (Class92_Sub2) this.aHashtable6.get(arg0);
		if (local5 == null) {
			throw new RuntimeException("");
		}
		local5.method23350(arg1, arg2);
	}

	@OriginalMember(owner = "client!dx", name = "ax", descriptor = "(Lclient!aeo;I)V", line = 206)
	public final void method19968(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23496();
		} else {
			this.aClass92_Sub2_6.method23496();
		}
		this.aClass92_6 = this.aClass92_Sub1Array6[(this.anInt2788 += 1400030897) * 19776081] = arg0;
		arg0.method23508();
	}

	@OriginalMember(owner = "client!dx", name = "og", descriptor = "(Lclient!aeo;)V", line = 206)
	public final void method19969(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23496();
		} else {
			this.aClass92_Sub2_6.method23496();
		}
		this.aClass92_6 = this.aClass92_Sub1Array6[(this.anInt2788 += 1400030897) * 19776081] = arg0;
		arg0.method23508();
	}

	@OriginalMember(owner = "client!dx", name = "oq", descriptor = "(Lclient!aeo;)V", line = 206)
	public final void method19970(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23496();
		} else {
			this.aClass92_Sub2_6.method23496();
		}
		this.aClass92_6 = this.aClass92_Sub1Array6[(this.anInt2788 += 1400030897) * 19776081] = arg0;
		arg0.method23508();
	}

	@OriginalMember(owner = "client!dx", name = "pg", descriptor = "(Lclient!aeo;)V", line = 206)
	public final void method19971(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23496();
		} else {
			this.aClass92_Sub2_6.method23496();
		}
		this.aClass92_6 = this.aClass92_Sub1Array6[(this.anInt2788 += 1400030897) * 19776081] = arg0;
		arg0.method23508();
	}

	@OriginalMember(owner = "client!dx", name = "ar", descriptor = "(Lclient!aeo;I)V", line = 216)
	public final void method19972(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 < 0 || arg0 != this.aClass92_Sub1Array6[this.anInt2788 * 19776081]) {
			throw new RuntimeException();
		}
		this.aClass92_Sub1Array6[(this.anInt2788 -= 1400030897) * 19776081 + 1] = null;
		arg0.method23496();
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_6 = this.aClass92_Sub1Array6[this.anInt2788 * 19776081];
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23508();
		} else {
			this.aClass92_6 = this.aClass92_Sub2_6;
			this.aClass92_Sub2_6.method23508();
		}
	}

	@OriginalMember(owner = "client!dx", name = "pr", descriptor = "(Lclient!aeo;)V", line = 216)
	public final void method19973(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 < 0 || arg0 != this.aClass92_Sub1Array6[this.anInt2788 * 19776081]) {
			throw new RuntimeException();
		}
		this.aClass92_Sub1Array6[(this.anInt2788 -= 1400030897) * 19776081 + 1] = null;
		arg0.method23496();
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_6 = this.aClass92_Sub1Array6[this.anInt2788 * 19776081];
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23508();
		} else {
			this.aClass92_6 = this.aClass92_Sub2_6;
			this.aClass92_Sub2_6.method23508();
		}
	}

	@OriginalMember(owner = "client!dx", name = "pj", descriptor = "(Lclient!aeo;)V", line = 216)
	public final void method19974(@OriginalArg(0) Class92_Sub1 arg0) {
		if (this.anInt2788 * 19776081 < 0 || arg0 != this.aClass92_Sub1Array6[this.anInt2788 * 19776081]) {
			throw new RuntimeException();
		}
		this.aClass92_Sub1Array6[(this.anInt2788 -= 1400030897) * 19776081 + 1] = null;
		arg0.method23496();
		if (this.anInt2788 * 19776081 >= 0) {
			this.aClass92_6 = this.aClass92_Sub1Array6[this.anInt2788 * 19776081];
			this.aClass92_Sub1Array6[this.anInt2788 * 19776081].method23508();
		} else {
			this.aClass92_6 = this.aClass92_Sub2_6;
			this.aClass92_Sub2_6.method23508();
		}
	}

	@OriginalMember(owner = "client!dx", name = "py", descriptor = "(II)V", line = 248)
	void method19975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2790 = arg0 * 1544217531;
		this.anInt2791 = arg1 * -364792963;
		@Pc(19) float local19 = (float) this.aClass92_6.method23491() / (float) this.aClass92_6.method23493();
		@Pc(31) float local31 = (float) (this.anInt2790 * 1104963955) / (float) (this.anInt2791 * 1827315157);
		if (local19 < local31) {
			this.anInt2794 = (int) (local19 * (float) (this.anInt2791 * 1827315157)) * 419429821;
			this.anInt2795 = this.anInt2791 * 125683701;
		} else {
			this.anInt2794 = this.anInt2790 * 1165852903;
			this.anInt2795 = (int) ((float) (this.anInt2790 * 1104963955) / local19) * 1383068065;
		}
		this.aFloat191 = (float) (this.anInt2794 * 1769547157) / (float) this.aClass92_6.method23491();
		this.anInt2792 = (this.anInt2790 * 1104963955 - this.anInt2794 * 1769547157) / 2 * 2123342803;
		this.anInt2793 = (this.anInt2791 * 1827315157 - this.anInt2795 * -740019615) / 2 * -150741303;
	}

	@OriginalMember(owner = "client!dx", name = "bc", descriptor = "(III)V", line = 248)
	void method19976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2790 = arg0 * 1544217531;
		this.anInt2791 = arg1 * -364792963;
		@Pc(19) float local19 = (float) this.aClass92_6.method23491() / (float) this.aClass92_6.method23493();
		@Pc(31) float local31 = (float) (this.anInt2790 * 1104963955) / (float) (this.anInt2791 * 1827315157);
		if (local19 < local31) {
			this.anInt2794 = (int) (local19 * (float) (this.anInt2791 * 1827315157)) * 419429821;
			this.anInt2795 = this.anInt2791 * 125683701;
		} else {
			this.anInt2794 = this.anInt2790 * 1165852903;
			this.anInt2795 = (int) ((float) (this.anInt2790 * 1104963955) / local19) * 1383068065;
		}
		this.aFloat191 = (float) (this.anInt2794 * 1769547157) / (float) this.aClass92_6.method23491();
		this.anInt2792 = (this.anInt2790 * 1104963955 - this.anInt2794 * 1769547157) / 2 * 2123342803;
		this.anInt2793 = (this.anInt2791 * 1827315157 - this.anInt2795 * -740019615) / 2 * -150741303;
	}

	@OriginalMember(owner = "client!dx", name = "pm", descriptor = "(II)V", line = 248)
	void method19977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2790 = arg0 * 1544217531;
		this.anInt2791 = arg1 * -364792963;
		@Pc(19) float local19 = (float) this.aClass92_6.method23491() / (float) this.aClass92_6.method23493();
		@Pc(31) float local31 = (float) (this.anInt2790 * 1104963955) / (float) (this.anInt2791 * 1827315157);
		if (local19 < local31) {
			this.anInt2794 = (int) (local19 * (float) (this.anInt2791 * 1827315157)) * 419429821;
			this.anInt2795 = this.anInt2791 * 125683701;
		} else {
			this.anInt2794 = this.anInt2790 * 1165852903;
			this.anInt2795 = (int) ((float) (this.anInt2790 * 1104963955) / local19) * 1383068065;
		}
		this.aFloat191 = (float) (this.anInt2794 * 1769547157) / (float) this.aClass92_6.method23491();
		this.anInt2792 = (this.anInt2790 * 1104963955 - this.anInt2794 * 1769547157) / 2 * 2123342803;
		this.anInt2793 = (this.anInt2791 * 1827315157 - this.anInt2795 * -740019615) / 2 * -150741303;
	}

	@OriginalMember(owner = "client!dx", name = "pb", descriptor = "(II)V", line = 248)
	void method19978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2790 = arg0 * 1544217531;
		this.anInt2791 = arg1 * -364792963;
		@Pc(19) float local19 = (float) this.aClass92_6.method23491() / (float) this.aClass92_6.method23493();
		@Pc(31) float local31 = (float) (this.anInt2790 * 1104963955) / (float) (this.anInt2791 * 1827315157);
		if (local19 < local31) {
			this.anInt2794 = (int) (local19 * (float) (this.anInt2791 * 1827315157)) * 419429821;
			this.anInt2795 = this.anInt2791 * 125683701;
		} else {
			this.anInt2794 = this.anInt2790 * 1165852903;
			this.anInt2795 = (int) ((float) (this.anInt2790 * 1104963955) / local19) * 1383068065;
		}
		this.aFloat191 = (float) (this.anInt2794 * 1769547157) / (float) this.aClass92_6.method23491();
		this.anInt2792 = (this.anInt2790 * 1104963955 - this.anInt2794 * 1769547157) / 2 * 2123342803;
		this.anInt2793 = (this.anInt2791 * 1827315157 - this.anInt2795 * -740019615) / 2 * -150741303;
	}

	@OriginalMember(owner = "client!dx", name = "bw", descriptor = "(Z)V", line = 273)
	public void method19979(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dx", name = "pw", descriptor = "(Z)V", line = 273)
	public void method19980(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dx", name = "pc", descriptor = "(IIIII)V", line = 278)
	public final void method19981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20087(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bs", descriptor = "(IIIIII)V", line = 278)
	public final void method19982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20087(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pn", descriptor = "(IIIII)V", line = 278)
	public final void method19983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20087(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pu", descriptor = "(IIIII)V", line = 278)
	public final void method19984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20087(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "px", descriptor = "(IIIII)V", line = 278)
	public final void method19985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20087(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bt", descriptor = "(IIIIII)V", line = 282)
	public final void method19986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20088(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pa", descriptor = "(IIIII)V", line = 282)
	public final void method19987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20088(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "po", descriptor = "(IIIII)V", line = 282)
	public final void method19988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20088(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pq", descriptor = "(IIIII)V", line = 282)
	public final void method19989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20088(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "ps", descriptor = "(IIII)V", line = 286)
	public final void method19990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20090(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bz", descriptor = "(IIIIB)V", line = 286)
	public final void method19991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20090(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pe", descriptor = "(IIII)V", line = 286)
	public final void method19992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20090(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "ph", descriptor = "(IIII)V", line = 286)
	public final void method19993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20090(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bu", descriptor = "(IIIII)V", line = 290)
	public final void method19994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20057(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pk", descriptor = "(IIII)V", line = 290)
	public final void method19995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20057(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pp", descriptor = "(IIII)V", line = 290)
	public final void method19996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20057(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pd", descriptor = "(IIII)V", line = 290)
	public final void method19997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20057(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bf", descriptor = "(IIIII)V", line = 294)
	public final void method19998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20377(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pf", descriptor = "(IIII)V", line = 294)
	public final void method19999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20377(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pz", descriptor = "(IIII)V", line = 294)
	public final void method20000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20377(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pi", descriptor = "(IIII)V", line = 294)
	public final void method20001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method20377(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pl", descriptor = "(IIIII)V", line = 298)
	public final void method20002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pv", descriptor = "(IIIII)V", line = 298)
	public final void method20003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "bn", descriptor = "(IIIIII)V", line = 298)
	public final void method20004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "pt", descriptor = "(IIIII)V", line = 298)
	public final void method20005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method20092(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!dx", name = "cl", descriptor = "(IILclient!ow;Lclient!oh;I)Z", line = 315)
	public boolean method20006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) Class441 arg3) {
		return this.method20098(arg0, arg1, 0, 0, arg2, arg3);
	}

	@OriginalMember(owner = "client!dx", name = "cz", descriptor = "(IIZB)Lclient!cy;", line = 324)
	public Class83 method20007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20102(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!dx", name = "qd", descriptor = "(IIZ)Lclient!cy;", line = 324)
	public Class83 method20008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.method20102(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "client!dx", name = "qv", descriptor = "([IIIII)Lclient!cy;", line = 331)
	public Class83 method20009(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20103(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!dx", name = "cx", descriptor = "([IIIIIB)Lclient!cy;", line = 331)
	public Class83 method20010(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20103(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!dx", name = "qu", descriptor = "([IIIII)Lclient!cy;", line = 331)
	public Class83 method20011(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method20103(arg0, arg1, arg2, arg3, arg4, true);
	}

	@OriginalMember(owner = "client!dx", name = "cu", descriptor = "()V", line = 336)
	public void method20012() {
	}

	@OriginalMember(owner = "client!dx", name = "qi", descriptor = "()V", line = 336)
	public void method20013() {
	}

	@OriginalMember(owner = "client!dx", name = "cm", descriptor = "()V", line = 337)
	public void method20014() {
	}

	@OriginalMember(owner = "client!dx", name = "qb", descriptor = "()V", line = 337)
	public void method20015() {
	}

	@OriginalMember(owner = "client!dx", name = "qo", descriptor = "()V", line = 338)
	public void method20016() {
	}

	@OriginalMember(owner = "client!dx", name = "ci", descriptor = "()V", line = 338)
	public void method20017() {
	}

	@OriginalMember(owner = "client!dx", name = "qp", descriptor = "()V", line = 338)
	public void method20018() {
	}

	@OriginalMember(owner = "client!dx", name = "qn", descriptor = "()V", line = 338)
	public void method20019() {
	}

	@OriginalMember(owner = "client!dx", name = "qk", descriptor = "()Z", line = 351)
	public boolean method20020() {
		return true;
	}

	@OriginalMember(owner = "client!dx", name = "dh", descriptor = "(I)Z", line = 351)
	public boolean method20021() {
		return true;
	}

	@OriginalMember(owner = "client!dx", name = "qj", descriptor = "()Z", line = 351)
	public boolean method20022() {
		return true;
	}

	@OriginalMember(owner = "client!dx", name = "qc", descriptor = "()Z", line = 351)
	public boolean method20023() {
		return true;
	}

	@OriginalMember(owner = "client!dx", name = "qy", descriptor = "()Z", line = 351)
	public boolean method20024() {
		return true;
	}

	@OriginalMember(owner = "client!dx", name = "qw", descriptor = "(IIIIIF)Lclient!ajv;", line = 367)
	public Class77_Sub22 method20025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class77_Sub22(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dx", name = "de", descriptor = "(IIIIIF)Lclient!ajv;", line = 367)
	public Class77_Sub22 method20026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class77_Sub22(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dx", name = "qs", descriptor = "(IIIIIF)Lclient!ajv;", line = 367)
	public Class77_Sub22 method20027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class77_Sub22(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dx", name = "qf", descriptor = "(IIIIIF)Lclient!ajv;", line = 367)
	public Class77_Sub22 method20028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class77_Sub22(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dx", name = "qg", descriptor = "(FFF)V", line = 387)
	public void method20029(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20144(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dx", name = "qt", descriptor = "(FFF)V", line = 387)
	public void method20030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20144(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dx", name = "eq", descriptor = "(FFFI)V", line = 387)
	public void method20031(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method20144(arg0, arg1, arg2, 0.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!dx", name = "ef", descriptor = "(IIII[IIIB)[I", line = 398)
	public int[] method20032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + local11 * arg6;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[arg2 * local11 + local25] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local11 * arg2 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dx", name = "qr", descriptor = "(IIII[III)[I", line = 398)
	public int[] method20033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + local11 * arg6;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[arg2 * local11 + local25] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local11 * arg2 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dx", name = "qh", descriptor = "(IIII[III)[I", line = 398)
	public int[] method20034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int[] local4 = new int[arg3 * arg2];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (@Pc(11) int local11 = 0; local11 < arg3; local11++) {
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (local11 >= arg1) {
				local23 = arg2 * (arg1 - 1);
				for (local25 = 0; local25 < arg2; local25++) {
					local4[local25 + arg2 * local11] = local4[local25 + local23];
				}
			} else {
				local23 = arg5 + local11 * arg6;
				for (local25 = 0; local25 < arg0; local25++) {
					local4[arg2 * local11 + local25] = arg4[local25 + local23];
				}
				local25 = arg4[local23 + (arg0 - 1)];
				for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
					local4[local11 * arg2 + local52] = local25;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dx", name = "er", descriptor = "(IIII[FIIII)[F", line = 416)
	public float[] method20035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[arg7 * local28 + local14 * arg2 * arg7 + local33] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + (arg0 - 1) * arg7 + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + arg2 * local14 * arg7 + arg7 * local33] = local65[local93];
					}
				}
			} else {
				local26 = arg2 * (arg1 - 1) * arg7;
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg2 * local14 * arg7 + local28 * arg7] = local6[local33 + local26 + local28 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "qm", descriptor = "(IIII[FIII)[F", line = 416)
	public float[] method20036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[arg7 * local28 + local14 * arg2 * arg7 + local33] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + (arg0 - 1) * arg7 + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + arg2 * local14 * arg7 + arg7 * local33] = local65[local93];
					}
				}
			} else {
				local26 = arg2 * (arg1 - 1) * arg7;
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg2 * local14 * arg7 + local28 * arg7] = local6[local33 + local26 + local28 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "qa", descriptor = "(IIII[FIII)[F", line = 416)
	public float[] method20037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[arg7 * local28 + local14 * arg2 * arg7 + local33] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + (arg0 - 1) * arg7 + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + arg2 * local14 * arg7 + arg7 * local33] = local65[local93];
					}
				}
			} else {
				local26 = arg2 * (arg1 - 1) * arg7;
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg2 * local14 * arg7 + local28 * arg7] = local6[local33 + local26 + local28 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "qq", descriptor = "(IIII[FIII)[F", line = 416)
	public float[] method20038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float[] local6 = new float[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26;
			@Pc(28) int local28;
			@Pc(33) int local33;
			if (local14 < arg1) {
				local26 = arg6 * local14 + arg5;
				for (local28 = 0; local28 < arg0; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[arg7 * local28 + local14 * arg2 * arg7 + local33] = arg4[local26 + arg7 * local28 + local33];
					}
				}
				@Pc(65) float[] local65 = new float[arg7];
				for (local33 = 0; local33 < arg7; local33++) {
					local65[local33] = arg4[local26 + (arg0 - 1) * arg7 + local33];
				}
				for (local33 = arg0; local33 < arg2; local33++) {
					for (@Pc(93) int local93 = 0; local93 < arg7; local93++) {
						local6[local93 + arg2 * local14 * arg7 + arg7 * local33] = local65[local93];
					}
				}
			} else {
				local26 = arg2 * (arg1 - 1) * arg7;
				for (local28 = 0; local28 < arg2; local28++) {
					for (local33 = 0; local33 < arg7; local33++) {
						local6[local33 + arg2 * local14 * arg7 + local28 * arg7] = local6[local33 + local26 + local28 * arg7];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "em", descriptor = "(IIII[BIIIB)[B", line = 435)
	public byte[] method20039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[arg7 * local29 + arg7 * arg2 * local15 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg7 * arg2 * local15 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local34 + local29 * arg7 + local27];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "rc", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[arg7 * local29 + arg7 * arg2 * local15 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg7 * arg2 * local15 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local34 + local29 * arg7 + local27];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "rj", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[arg7 * local29 + arg7 * arg2 * local15 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg7 * arg2 * local15 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local34 + local29 * arg7 + local27];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "rm", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[arg7 * local29 + arg7 * arg2 * local15 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg7 * arg2 * local15 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local34 + local29 * arg7 + local27];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "rk", descriptor = "(IIII[BIII)[B", line = 435)
	public byte[] method20043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) byte[] local6 = new byte[arg3 * arg2 * arg7];
		if (arg6 == 0) {
			arg6 = arg7 * arg0;
		}
		for (@Pc(15) int local15 = 0; local15 < arg3; local15++) {
			@Pc(27) int local27;
			@Pc(29) int local29;
			@Pc(34) int local34;
			if (local15 < arg1) {
				local27 = local15 * arg6 + arg5;
				for (local29 = 0; local29 < arg0; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[arg7 * local29 + arg7 * arg2 * local15 + local34] = arg4[local34 + local29 * arg7 + local27];
					}
				}
				@Pc(66) byte[] local66 = new byte[arg7];
				for (local34 = 0; local34 < arg7; local34++) {
					local66[local34] = arg4[local27 + arg7 * (arg0 - 1) + local34];
				}
				for (local34 = arg0; local34 < arg2; local34++) {
					for (@Pc(94) int local94 = 0; local94 < arg7; local94++) {
						local6[local34 * arg7 + arg7 * arg2 * local15 + local94] = local66[local94];
					}
				}
			} else {
				local27 = arg2 * (arg1 - 1) * arg7;
				for (local29 = 0; local29 < arg2; local29++) {
					for (local34 = 0; local34 < arg7; local34++) {
						local6[local34 + arg7 * local15 * arg2 + local29 * arg7] = local6[local34 + local29 * arg7 + local27];
					}
				}
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!dx", name = "gn", descriptor = "()V")
	public abstract void method20044();

	@OriginalMember(owner = "client!dx", name = "li", descriptor = "(ILclient!db;)V")
	public abstract void method20045(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "y", descriptor = "()Lclient!do;")
	public abstract Class208 method20046();

	@OriginalMember(owner = "client!dx", name = "t", descriptor = "(II)V")
	abstract void method20047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7;

	@OriginalMember(owner = "client!dx", name = "nh", descriptor = "(Z)V")
	public abstract void method20048(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dx", name = "r", descriptor = "()I")
	public abstract int method20049();

	@OriginalMember(owner = "client!dx", name = "g", descriptor = "()Z")
	public abstract boolean method20050();

	@OriginalMember(owner = "client!dx", name = "z", descriptor = "()Z")
	public abstract boolean method20051();

	@OriginalMember(owner = "client!dx", name = "j", descriptor = "()Z")
	public abstract boolean method20052();

	@OriginalMember(owner = "client!dx", name = "fx", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;")
	abstract Class92_Sub2 method20053(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "go", descriptor = "()V")
	public abstract void method20054();

	@OriginalMember(owner = "client!dx", name = "e", descriptor = "()Z")
	public abstract boolean method20055();

	@OriginalMember(owner = "client!dx", name = "f", descriptor = "()Z")
	public abstract boolean method20056();

	@OriginalMember(owner = "client!dx", name = "br", descriptor = "(IIIII)V")
	abstract void method20057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "b", descriptor = "()Z")
	public abstract boolean method20058();

	@OriginalMember(owner = "client!dx", name = "n", descriptor = "()Ljava/lang/String;")
	public abstract String method20059();

	@OriginalMember(owner = "client!dx", name = "a", descriptor = "()[I")
	public abstract int[] method20060();

	@OriginalMember(owner = "client!dx", name = "qz", descriptor = "()Lclient!ow;")
	public abstract Class455 method20061();

	@OriginalMember(owner = "client!dx", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;")
	abstract Class92_Sub2 method20062(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "ac", descriptor = "()Lclient!aeo;")
	public abstract Class92_Sub1 method20063();

	@OriginalMember(owner = "client!dx", name = "at", descriptor = "(II)Lclient!de;")
	public abstract Interface20 method20064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ae", descriptor = "(III)Lclient!de;")
	public abstract Interface20 method20065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "ah", descriptor = "(IIII)[I")
	public abstract int[] method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "as", descriptor = "()V")
	public abstract void method20067();

	@OriginalMember(owner = "client!dx", name = "aq", descriptor = "()Z")
	public abstract boolean method20068();

	@OriginalMember(owner = "client!dx", name = "am", descriptor = "()Z")
	public abstract boolean method20069();

	@OriginalMember(owner = "client!dx", name = "an", descriptor = "()I")
	public abstract int method20070();

	@OriginalMember(owner = "client!dx", name = "nk", descriptor = "(Lclient!dg;Z)Lclient!cy;")
	public abstract Class83 method20071(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dx", name = "aa", descriptor = "(III)V")
	public abstract void method20072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "ml", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;")
	public abstract Interface21 method20073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "aw", descriptor = "(J)V")
	public abstract void method20074(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dx", name = "az", descriptor = "(II[I[I)V")
	public abstract void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "ct", descriptor = "(Lclient!dg;Z)Lclient!cy;")
	public abstract Class83 method20076(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dx", name = "bj", descriptor = "()V")
	public abstract void method20077();

	@OriginalMember(owner = "client!dx", name = "bv", descriptor = "()V")
	public abstract void method20078();

	@OriginalMember(owner = "client!dx", name = "bx", descriptor = "(IIII)V")
	public abstract void method20079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "bl", descriptor = "([I)V")
	public abstract void method20080(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "bb", descriptor = "(FF)V")
	public abstract void method20081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!dx", name = "lk", descriptor = "(II)V")
	public abstract void method20082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "qx", descriptor = "()Z")
	public abstract boolean method20083();

	@OriginalMember(owner = "client!dx", name = "ew", descriptor = "()Lclient!do;")
	public abstract Class208 method20084();

	@OriginalMember(owner = "client!dx", name = "hm", descriptor = "(IIII)V")
	public abstract void method20085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "it", descriptor = "(IIIIII)V")
	public abstract void method20086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "bp", descriptor = "(IIIIII)V")
	public abstract void method20087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "bm", descriptor = "(IIIIII)V")
	public abstract void method20088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "bo", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method20089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!dx", name = "bk", descriptor = "(IIIII)V")
	abstract void method20090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "ky", descriptor = "(III)V")
	public abstract void method20091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "bh", descriptor = "(IIIIII)V")
	public abstract void method20092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "dj", descriptor = "()Z")
	public abstract boolean method20093();

	@OriginalMember(owner = "client!dx", name = "cb", descriptor = "(IIIIIIIII)V")
	public abstract void method20094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dx", name = "cg", descriptor = "(IIIIIILclient!cd;IIIII)V")
	public abstract void method20095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!dx", name = "cc", descriptor = "(IIIIIII)V")
	public abstract void method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "cf", descriptor = "(IIIIII)I")
	public abstract int method20097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "cp", descriptor = "(IIIILclient!ow;Lclient!oh;)Z")
	abstract boolean method20098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5);

	@OriginalMember(owner = "client!dx", name = "cw", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V")
	public abstract void method20099(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2);

	@OriginalMember(owner = "client!dx", name = "ck", descriptor = "(I)Lclient!aja;")
	public abstract Class77_Sub2 method20100(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "iq", descriptor = "([I)V")
	public abstract void method20101(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "ca", descriptor = "(IIZZ)Lclient!cy;")
	public abstract Class83 method20102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dx", name = "cr", descriptor = "([IIIIIZ)Lclient!cy;")
	public abstract Class83 method20103(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!dx", name = "ba", descriptor = "(IIII)V")
	public abstract void method20104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "cv", descriptor = "(IIIIZ)Lclient!cy;")
	public abstract Class83 method20105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dx", name = "kb", descriptor = "(IIII)V")
	public abstract void method20106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "la", descriptor = "(FFFFF)V")
	public abstract void method20107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dx", name = "eg", descriptor = "(I)V")
	public abstract void method20108(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "ek", descriptor = "()I")
	public abstract int method20109();

	@OriginalMember(owner = "client!dx", name = "cn", descriptor = "(ILclient!cd;II)V")
	public abstract void method20110(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "cq", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;")
	public abstract Class94 method20111(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dx", name = "fb", descriptor = "()Z")
	public abstract boolean method20112();

	@OriginalMember(owner = "client!dx", name = "d", descriptor = "()V")
	abstract void method20113();

	@OriginalMember(owner = "client!dx", name = "cd", descriptor = "(I)V")
	public abstract void method20114(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "cj", descriptor = "(Lclient!dz;IIII)Lclient!dv;")
	public abstract Class84 method20115(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "ce", descriptor = "(II)I")
	public abstract int method20116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "do", descriptor = "(II)I")
	public abstract int method20117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "dt", descriptor = "(II[[I[[IIII)Lclient!cj;")
	public abstract Class88 method20118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "o", descriptor = "()Z")
	public abstract boolean method20119();

	@OriginalMember(owner = "client!dx", name = "dq", descriptor = "(Lclient!dm;)V")
	public abstract void method20120(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!dx", name = "dn", descriptor = "(Lclient!ow;)V")
	public abstract void method20121(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dx", name = "nb", descriptor = "()Lclient!oi;")
	public abstract Class442 method20122();

	@OriginalMember(owner = "client!dx", name = "dy", descriptor = "(Lclient!oi;)V")
	public abstract void method20123(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!dx", name = "dm", descriptor = "()Lclient!oi;")
	public abstract Class442 method20124();

	@OriginalMember(owner = "client!dx", name = "bg", descriptor = "(II)V")
	public abstract void method20125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "dw", descriptor = "(IFFFFF)V")
	public abstract void method20126(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "di", descriptor = "(I)V")
	public abstract void method20127(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "jn", descriptor = "([IIIIIZ)Lclient!cy;")
	public abstract Class83 method20128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!dx", name = "dp", descriptor = "()I")
	public abstract int method20129();

	@OriginalMember(owner = "client!dx", name = "gw", descriptor = "()V")
	public abstract void method20130();

	@OriginalMember(owner = "client!dx", name = "nw", descriptor = "(IFFFFF)V")
	public abstract void method20131(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "im", descriptor = "(IIIIIII)V")
	public abstract void method20132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "df", descriptor = "(Lclient!da;)V")
	public abstract void method20133(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!dx", name = "db", descriptor = "(IIII)V")
	public abstract void method20134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "dx", descriptor = "(II)V")
	public abstract void method20135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "dc", descriptor = "()Z")
	public abstract boolean method20136();

	@OriginalMember(owner = "client!dx", name = "kz", descriptor = "(III)V")
	public abstract void method20137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "ap", descriptor = "(II)J")
	public abstract long method20138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "eh", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V")
	public abstract void method20139(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "ej", descriptor = "()Z")
	public abstract boolean method20140();

	@OriginalMember(owner = "client!dx", name = "eo", descriptor = "()V")
	public abstract void method20141();

	@OriginalMember(owner = "client!dx", name = "bi", descriptor = "([I)V")
	public abstract void method20142(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "mo", descriptor = "(FFF[F)V")
	public abstract void method20143(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dx", name = "es", descriptor = "(FFFFFF)V")
	abstract void method20144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "ei", descriptor = "(ILclient!db;)V")
	public abstract void method20145(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "ed", descriptor = "(ILclient!db;)V")
	public abstract void method20146(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "en", descriptor = "(FFF[F)V")
	public abstract void method20147(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dx", name = "ex", descriptor = "(FFF[F)V")
	public abstract void method20148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dx", name = "et", descriptor = "(Z)V")
	public abstract void method20149(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dx", name = "gm", descriptor = "(II[I[I)V")
	public abstract void method20150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "by", descriptor = "(IIII)V")
	public abstract void method20151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ea", descriptor = "(II)V")
	abstract void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7;

	@OriginalMember(owner = "client!dx", name = "ec", descriptor = "(II)V")
	abstract void method20153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7;

	@OriginalMember(owner = "client!dx", name = "el", descriptor = "()V")
	public abstract void method20154();

	@OriginalMember(owner = "client!dx", name = "is", descriptor = "(IIIII)V")
	abstract void method20155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "ns", descriptor = "(II)I")
	public abstract int method20156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "lz", descriptor = "(II)V")
	public abstract void method20157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ez", descriptor = "(I)V")
	public abstract void method20158(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "ib", descriptor = "([I)V")
	public abstract void method20159(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "be", descriptor = "(IIIIIILclient!cd;II)V")
	public abstract void method20160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dx", name = "fq", descriptor = "()Z")
	public abstract boolean method20161();

	@OriginalMember(owner = "client!dx", name = "fm", descriptor = "()Z")
	public abstract boolean method20162();

	@OriginalMember(owner = "client!dx", name = "kw", descriptor = "(Lclient!oi;)V")
	public abstract void method20163(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!dx", name = "ft", descriptor = "()Z")
	public abstract boolean method20164();

	@OriginalMember(owner = "client!dx", name = "eb", descriptor = "(I)V")
	public abstract void method20165(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "fe", descriptor = "()Z")
	public abstract boolean method20166();

	@OriginalMember(owner = "client!dx", name = "fw", descriptor = "()Z")
	public abstract boolean method20167();

	@OriginalMember(owner = "client!dx", name = "fi", descriptor = "()Z")
	public abstract boolean method20168();

	@OriginalMember(owner = "client!dx", name = "fz", descriptor = "()Z")
	public abstract boolean method20169();

	@OriginalMember(owner = "client!dx", name = "ff", descriptor = "()Z")
	public abstract boolean method20170();

	@OriginalMember(owner = "client!dx", name = "fs", descriptor = "()Z")
	public abstract boolean method20171();

	@OriginalMember(owner = "client!dx", name = "ay", descriptor = "()Z")
	public abstract boolean method20172();

	@OriginalMember(owner = "client!dx", name = "fu", descriptor = "()Z")
	public abstract boolean method20173();

	@OriginalMember(owner = "client!dx", name = "fo", descriptor = "()Z")
	public abstract boolean method20174();

	@OriginalMember(owner = "client!dx", name = "fj", descriptor = "()Z")
	public abstract boolean method20175();

	@OriginalMember(owner = "client!dx", name = "fh", descriptor = "()Ljava/lang/String;")
	public abstract String method20176();

	@OriginalMember(owner = "client!dx", name = "fn", descriptor = "()Ljava/lang/String;")
	public abstract String method20177();

	@OriginalMember(owner = "client!dx", name = "u", descriptor = "()Z")
	public abstract boolean method20178();

	@OriginalMember(owner = "client!dx", name = "fp", descriptor = "()[I")
	public abstract int[] method20179();

	@OriginalMember(owner = "client!dx", name = "fy", descriptor = "(Z)V")
	public abstract void method20180();

	@OriginalMember(owner = "client!dx", name = "jo", descriptor = "(IIZZ)Lclient!cy;")
	public abstract Class83 method20181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dx", name = "fr", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;")
	abstract Class92_Sub2 method20182(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "ep", descriptor = "()Z")
	public abstract boolean method20183();

	@OriginalMember(owner = "client!dx", name = "gr", descriptor = "(IIII)[I")
	public abstract int[] method20184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ev", descriptor = "()I")
	public abstract int method20185();

	@OriginalMember(owner = "client!dx", name = "gi", descriptor = "()V")
	public abstract void method20186();

	@OriginalMember(owner = "client!dx", name = "gt", descriptor = "()V")
	public abstract void method20187();

	@OriginalMember(owner = "client!dx", name = "ga", descriptor = "()V")
	public abstract void method20188();

	@OriginalMember(owner = "client!dx", name = "gc", descriptor = "()V")
	public abstract void method20189();

	@OriginalMember(owner = "client!dx", name = "hg", descriptor = "(IIII)V")
	public abstract void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "gz", descriptor = "()Z")
	public abstract boolean method20191();

	@OriginalMember(owner = "client!dx", name = "gb", descriptor = "()Z")
	public abstract boolean method20192();

	@OriginalMember(owner = "client!dx", name = "gu", descriptor = "()Z")
	public abstract boolean method20193();

	@OriginalMember(owner = "client!dx", name = "il", descriptor = "(IIIILclient!ow;Lclient!oh;)Z")
	abstract boolean method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5);

	@OriginalMember(owner = "client!dx", name = "gp", descriptor = "()Z")
	public abstract boolean method20195();

	@OriginalMember(owner = "client!dx", name = "lg", descriptor = "([I)Lclient!dh;")
	public abstract Class85 method20196(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "gf", descriptor = "(III)V")
	public abstract void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "gx", descriptor = "()V")
	public abstract void method20198();

	@OriginalMember(owner = "client!dx", name = "gv", descriptor = "()V")
	public abstract void method20199();

	@OriginalMember(owner = "client!dx", name = "gd", descriptor = "()V")
	public abstract void method20200();

	@OriginalMember(owner = "client!dx", name = "gg", descriptor = "(J)V")
	public abstract void method20201(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dx", name = "gs", descriptor = "(II[I[I)V")
	public abstract void method20202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "gl", descriptor = "(II[I[I)V")
	public abstract void method20203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "gh", descriptor = "(II[I[I)V")
	public abstract void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "ia", descriptor = "(IIIIIILclient!cd;II)V")
	public abstract void method20205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dx", name = "i", descriptor = "()Z")
	public abstract boolean method20206();

	@OriginalMember(owner = "client!dx", name = "hu", descriptor = "()V")
	public abstract void method20207();

	@OriginalMember(owner = "client!dx", name = "hw", descriptor = "()V")
	public abstract void method20208();

	@OriginalMember(owner = "client!dx", name = "ht", descriptor = "()V")
	public abstract void method20209();

	@OriginalMember(owner = "client!dx", name = "hz", descriptor = "(IIII)V")
	public abstract void method20210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "hq", descriptor = "(FF)V")
	public abstract void method20211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!dx", name = "hr", descriptor = "()V")
	public abstract void method20212();

	@OriginalMember(owner = "client!dx", name = "dl", descriptor = "()Z")
	public abstract boolean method20213();

	@OriginalMember(owner = "client!dx", name = "hh", descriptor = "()V")
	public abstract void method20214();

	@OriginalMember(owner = "client!dx", name = "hb", descriptor = "(IIII)V")
	public abstract void method20215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "hv", descriptor = "(IIII)V")
	public abstract void method20216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "hk", descriptor = "(IIII)V")
	public abstract void method20217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "hy", descriptor = "(IIII)V")
	public abstract void method20218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "hs", descriptor = "(IIII)V")
	public abstract void method20219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ds", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;")
	public abstract Class91 method20220(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3);

	@OriginalMember(owner = "client!dx", name = "he", descriptor = "([I)V")
	public abstract void method20221(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "ho", descriptor = "([I)V")
	public abstract void method20222(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "gj", descriptor = "()V")
	public abstract void method20223();

	@OriginalMember(owner = "client!dx", name = "lf", descriptor = "()Z")
	public abstract boolean method20224();

	@OriginalMember(owner = "client!dx", name = "mf", descriptor = "(ILclient!db;)V")
	public abstract void method20225(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "id", descriptor = "(II)V")
	public abstract void method20226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ii", descriptor = "(II)V")
	public abstract void method20227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ip", descriptor = "(II)V")
	public abstract void method20228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "iw", descriptor = "(IIIIII)V")
	public abstract void method20229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "da", descriptor = "(Z)V")
	public abstract void method20230(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dx", name = "in", descriptor = "(IIIIII)V")
	public abstract void method20231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "dr", descriptor = "(III)V")
	public abstract void method20232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "iy", descriptor = "(IIIII)V")
	abstract void method20233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "if", descriptor = "([I)V")
	public abstract void method20234(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "jy", descriptor = "(II)I")
	public abstract int method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ix", descriptor = "(IIIIII)V")
	public abstract void method20236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "iz", descriptor = "(IIIIIIIII)V")
	public abstract void method20237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!dx", name = "ij", descriptor = "(IIIIIILclient!cd;IIIII)V")
	public abstract void method20238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!dx", name = "ik", descriptor = "(IIIIIII)V")
	public abstract void method20239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "lm", descriptor = "()Z")
	public abstract boolean method20240();

	@OriginalMember(owner = "client!dx", name = "fk", descriptor = "()Z")
	public abstract boolean method20241();

	@OriginalMember(owner = "client!dx", name = "io", descriptor = "(IIIIII)I")
	public abstract int method20242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "ih", descriptor = "(IIIILclient!ow;Lclient!oh;)Z")
	abstract boolean method20243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5);

	@OriginalMember(owner = "client!dx", name = "ie", descriptor = "(IIIILclient!ow;Lclient!oh;)Z")
	abstract boolean method20244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5);

	@OriginalMember(owner = "client!dx", name = "iv", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V")
	public abstract void method20245(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2);

	@OriginalMember(owner = "client!dx", name = "jg", descriptor = "(II[I[I)Lclient!cd;")
	public abstract Class90 method20246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "js", descriptor = "(I)Lclient!aja;")
	public abstract Class77_Sub2 method20247(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "jr", descriptor = "(Lclient!aja;)V")
	public abstract void method20248(@OriginalArg(0) Class77_Sub2 arg0);

	@OriginalMember(owner = "client!dx", name = "jv", descriptor = "(Lclient!aja;)V")
	public abstract void method20249(@OriginalArg(0) Class77_Sub2 arg0);

	@OriginalMember(owner = "client!dx", name = "fa", descriptor = "()[I")
	public abstract int[] method20250();

	@OriginalMember(owner = "client!dx", name = "dk", descriptor = "(I)Lclient!da;")
	public abstract Class91 method20251(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "kd", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;")
	public abstract Class91 method20252(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3);

	@OriginalMember(owner = "client!dx", name = "jd", descriptor = "(IIIIZ)Lclient!cy;")
	public abstract Class83 method20253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dx", name = "jk", descriptor = "(IIIIZ)Lclient!cy;")
	public abstract Class83 method20254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dx", name = "dz", descriptor = "(F)V")
	public abstract void method20255(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dx", name = "jx", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;")
	public abstract Class94 method20256(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dx", name = "jh", descriptor = "(I)V")
	public abstract void method20257(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "jw", descriptor = "(Lclient!dz;IIII)Lclient!dv;")
	public abstract Class84 method20258(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "jb", descriptor = "(II)I")
	public abstract int method20259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "mz", descriptor = "()Z")
	public abstract boolean method20260();

	@OriginalMember(owner = "client!dx", name = "jc", descriptor = "()Lclient!ow;")
	public abstract Class455 method20261();

	@OriginalMember(owner = "client!dx", name = "jm", descriptor = "()I")
	public abstract int method20262();

	@OriginalMember(owner = "client!dx", name = "jq", descriptor = "()I")
	public abstract int method20263();

	@OriginalMember(owner = "client!dx", name = "ju", descriptor = "()I")
	public abstract int method20264();

	@OriginalMember(owner = "client!dx", name = "je", descriptor = "()I")
	public abstract int method20265();

	@OriginalMember(owner = "client!dx", name = "jf", descriptor = "()I")
	public abstract int method20266();

	@OriginalMember(owner = "client!dx", name = "jp", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;")
	public abstract Class94 method20267(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dx", name = "jt", descriptor = "(I[Lclient!ajv;)V")
	public abstract void method20268(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1);

	@OriginalMember(owner = "client!dx", name = "ji", descriptor = "(Lclient!dm;)V")
	public abstract void method20269(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!dx", name = "kg", descriptor = "(Lclient!ow;)V")
	public abstract void method20270(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dx", name = "kq", descriptor = "(Lclient!ow;)V")
	public abstract void method20271(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dx", name = "kc", descriptor = "(Lclient!ow;)V")
	public abstract void method20272(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dx", name = "ja", descriptor = "(II[[I[[IIII)Lclient!cj;")
	public abstract Class88 method20273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "km", descriptor = "(Lclient!oi;)V")
	public abstract void method20274(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!dx", name = "kv", descriptor = "()Lclient!oi;")
	public abstract Class442 method20275();

	@OriginalMember(owner = "client!dx", name = "kf", descriptor = "()Lclient!oi;")
	public abstract Class442 method20276();

	@OriginalMember(owner = "client!dx", name = "kr", descriptor = "()Lclient!oi;")
	public abstract Class442 method20277();

	@OriginalMember(owner = "client!dx", name = "kh", descriptor = "()Lclient!oi;")
	public abstract Class442 method20278();

	@OriginalMember(owner = "client!dx", name = "kx", descriptor = "()Lclient!oi;")
	public abstract Class442 method20279();

	@OriginalMember(owner = "client!dx", name = "kn", descriptor = "(F)V")
	public abstract void method20280(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dx", name = "ka", descriptor = "(F)V")
	public abstract void method20281(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dx", name = "cy", descriptor = "()Lclient!oi;")
	public abstract Class442 method20282();

	@OriginalMember(owner = "client!dx", name = "kp", descriptor = "(I)V")
	public abstract void method20283(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "kl", descriptor = "(I)V")
	public abstract void method20284(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "kt", descriptor = "(III)V")
	public abstract void method20285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "hj", descriptor = "()V")
	public abstract void method20286();

	@OriginalMember(owner = "client!dx", name = "hl", descriptor = "()V")
	public abstract void method20287();

	@OriginalMember(owner = "client!dx", name = "ge", descriptor = "()I")
	public abstract int method20288();

	@OriginalMember(owner = "client!dx", name = "ke", descriptor = "(Lclient!da;)V")
	public abstract void method20289(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!dx", name = "ku", descriptor = "(IIII)V")
	public abstract void method20290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ee", descriptor = "()V")
	public abstract void method20291();

	@OriginalMember(owner = "client!dx", name = "ks", descriptor = "(IIII)V")
	public abstract void method20292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ki", descriptor = "(IIII)V")
	public abstract void method20293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "dv", descriptor = "()Lclient!ow;")
	public abstract Class455 method20294();

	@OriginalMember(owner = "client!dx", name = "lb", descriptor = "(II)V")
	public abstract void method20295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "k", descriptor = "()Z")
	public abstract boolean method20296();

	@OriginalMember(owner = "client!dx", name = "kk", descriptor = "(I)Lclient!da;")
	public abstract Class91 method20297(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "lu", descriptor = "()Z")
	public abstract boolean method20298();

	@OriginalMember(owner = "client!dx", name = "bd", descriptor = "()V")
	public abstract void method20299();

	@OriginalMember(owner = "client!dx", name = "ch", descriptor = "(Lclient!aja;)V")
	public abstract void method20300(@OriginalArg(0) Class77_Sub2 arg0);

	@OriginalMember(owner = "client!dx", name = "lp", descriptor = "()Z")
	public abstract boolean method20301();

	@OriginalMember(owner = "client!dx", name = "lh", descriptor = "()Z")
	public abstract boolean method20302();

	@OriginalMember(owner = "client!dx", name = "ll", descriptor = "()V")
	public abstract void method20303();

	@OriginalMember(owner = "client!dx", name = "ln", descriptor = "(FFFFF)V")
	public abstract void method20304(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dx", name = "lv", descriptor = "(FFFFF)V")
	public abstract void method20305(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dx", name = "ls", descriptor = "(FFFFF)V")
	public abstract void method20306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dx", name = "lq", descriptor = "([I)Lclient!dh;")
	public abstract Class85 method20307(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "lx", descriptor = "([I)Lclient!dh;")
	public abstract Class85 method20308(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "lc", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V")
	public abstract void method20309(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "ly", descriptor = "()V")
	public abstract void method20310();

	@OriginalMember(owner = "client!dx", name = "lt", descriptor = "()V")
	public abstract void method20311();

	@OriginalMember(owner = "client!dx", name = "ld", descriptor = "()Z")
	public abstract boolean method20312();

	@OriginalMember(owner = "client!dx", name = "lj", descriptor = "(FFFFFF)V")
	abstract void method20313(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "lr", descriptor = "(ILclient!db;)V")
	public abstract void method20314(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "mc", descriptor = "()V")
	abstract void method20315();

	@OriginalMember(owner = "client!dx", name = "mh", descriptor = "(ILclient!db;)V")
	public abstract void method20316(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "mx", descriptor = "(ILclient!db;)V")
	public abstract void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "ma", descriptor = "(ILclient!db;)V")
	public abstract void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "hx", descriptor = "([I)V")
	public abstract void method20319(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "mw", descriptor = "()V")
	public abstract void method20320();

	@OriginalMember(owner = "client!dx", name = "mq", descriptor = "()V")
	public abstract void method20321();

	@OriginalMember(owner = "client!dx", name = "mm", descriptor = "(IIFIIFIIFIIII)V")
	public abstract void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12);

	@OriginalMember(owner = "client!dx", name = "mk", descriptor = "(FFF[F)V")
	public abstract void method20323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dx", name = "my", descriptor = "(FFF[F)V")
	public abstract void method20324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3);

	@OriginalMember(owner = "client!dx", name = "mt", descriptor = "()Lclient!aeo;")
	public abstract Class92_Sub1 method20325();

	@OriginalMember(owner = "client!dx", name = "mi", descriptor = "()Lclient!aeo;")
	public abstract Class92_Sub1 method20326();

	@OriginalMember(owner = "client!dx", name = "mj", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;")
	public abstract Interface21 method20327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "mr", descriptor = "(II)Lclient!de;")
	public abstract Interface20 method20328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "mv", descriptor = "(II)Lclient!de;")
	public abstract Interface20 method20329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "nr", descriptor = "(IFFFFF)V")
	public abstract void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!dx", name = "q", descriptor = "()V")
	public abstract void method20331();

	@OriginalMember(owner = "client!dx", name = "mn", descriptor = "()V")
	abstract void method20332();

	@OriginalMember(owner = "client!dx", name = "ms", descriptor = "()V")
	abstract void method20333();

	@OriginalMember(owner = "client!dx", name = "mp", descriptor = "()Z")
	public abstract boolean method20334();

	@OriginalMember(owner = "client!dx", name = "mu", descriptor = "(ILclient!db;)V")
	public abstract void method20335(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1);

	@OriginalMember(owner = "client!dx", name = "md", descriptor = "()Z")
	public abstract boolean method20336();

	@OriginalMember(owner = "client!dx", name = "nn", descriptor = "(II)J")
	public abstract long method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "nx", descriptor = "(ILclient!cd;II)V")
	public abstract void method20338(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ne", descriptor = "(ILclient!cd;II)V")
	public abstract void method20339(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "dg", descriptor = "(FFFFF)V")
	public abstract void method20340(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!dx", name = "nj", descriptor = "()Lclient!oi;")
	public abstract Class442 method20341();

	@OriginalMember(owner = "client!dx", name = "fl", descriptor = "()Z")
	public abstract boolean method20342();

	@OriginalMember(owner = "client!dx", name = "nl", descriptor = "([I)V")
	public abstract void method20343(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "nv", descriptor = "([I)V")
	public abstract void method20344(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "iu", descriptor = "(IIIII)V")
	abstract void method20345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "na", descriptor = "(Z)V")
	public abstract void method20346(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dx", name = "fc", descriptor = "(IIII)[I")
	public abstract int[] method20347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dx", name = "ir", descriptor = "(IIIIIII)V")
	public abstract void method20348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dx", name = "np", descriptor = "()Z")
	public abstract boolean method20349();

	@OriginalMember(owner = "client!dx", name = "jl", descriptor = "(IIZZ)Lclient!cy;")
	public abstract Class83 method20350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dx", name = "dd", descriptor = "([I)Lclient!dh;")
	public abstract Class85 method20351(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!dx", name = "kj", descriptor = "(III)V")
	public abstract void method20352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "fd", descriptor = "()Z")
	public abstract boolean method20353();

	@OriginalMember(owner = "client!dx", name = "no", descriptor = "()Z")
	public abstract boolean method20354();

	@OriginalMember(owner = "client!dx", name = "jz", descriptor = "(I)Lclient!aja;")
	public abstract Class77_Sub2 method20355(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "mb", descriptor = "(II)Lclient!de;")
	public abstract Interface20 method20356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "me", descriptor = "(III)Lclient!de;")
	public abstract Interface20 method20357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "gk", descriptor = "()Z")
	public abstract boolean method20358();

	@OriginalMember(owner = "client!dx", name = "lw", descriptor = "()Z")
	public abstract boolean method20359();

	@OriginalMember(owner = "client!dx", name = "ig", descriptor = "(IIIIII)V")
	public abstract void method20360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dx", name = "ic", descriptor = "(IIIII)V")
	abstract void method20361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "co", descriptor = "(II[I[I)Lclient!cd;")
	public abstract Class90 method20362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!dx", name = "mg", descriptor = "(III)Lclient!de;")
	public abstract Interface20 method20363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dx", name = "le", descriptor = "()V")
	public abstract void method20364();

	@OriginalMember(owner = "client!dx", name = "du", descriptor = "(I[Lclient!ajv;)V")
	public abstract void method20365(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1);

	@OriginalMember(owner = "client!dx", name = "ab", descriptor = "()V")
	public abstract void method20366();

	@OriginalMember(owner = "client!dx", name = "jj", descriptor = "(I[Lclient!ajv;)V")
	public abstract void method20367(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1);

	@OriginalMember(owner = "client!dx", name = "s", descriptor = "(I)V")
	public abstract void method20368(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dx", name = "fg", descriptor = "()[I")
	public abstract int[] method20369();

	@OriginalMember(owner = "client!dx", name = "cs", descriptor = "()Lclient!ow;")
	public abstract Class455 method20370();

	@OriginalMember(owner = "client!dx", name = "af", descriptor = "()Z")
	public abstract boolean method20371();

	@OriginalMember(owner = "client!dx", name = "eu", descriptor = "()Lclient!do;")
	public abstract Class208 method20372();

	@OriginalMember(owner = "client!dx", name = "fv", descriptor = "()I")
	public abstract int method20373();

	@OriginalMember(owner = "client!dx", name = "lo", descriptor = "(II)V")
	public abstract void method20374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dx", name = "ql", descriptor = "()Lclient!ow;")
	public abstract Class455 method20375();

	@OriginalMember(owner = "client!dx", name = "av", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;")
	public abstract Interface21 method20376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "bq", descriptor = "(IIIII)V")
	abstract void method20377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dx", name = "ko", descriptor = "(F)V")
	public abstract void method20378(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dx", name = "qe", descriptor = "()Z")
	public abstract boolean method20379();

	@OriginalMember(owner = "client!dx", name = "gq", descriptor = "()I")
	public abstract int method20380();

	@OriginalMember(owner = "client!dx", name = "ey", descriptor = "(I)V")
	public abstract void method20381(@OriginalArg(0) int arg0);
}
