package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zf")
public abstract class Class70_Sub1 extends Class70 implements Interface37 {

	@OriginalMember(owner = "client!zf", name = "a", descriptor = "Lclient!nw;")
	protected final Class43 aClass43_72;

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(Lclient!vz;Lclient!nw;Lclient!vk;I)V", line = 21)
	Class70_Sub1(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class530 arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.aClass43_72 = arg1;
	}

	@OriginalMember(owner = "client!zf", name = "l", descriptor = "(B)I", line = 26)
	public int method14714() {
		return this.anInt5589 * -354558277;
	}

	@OriginalMember(owner = "client!zf", name = "z", descriptor = "()I", line = 26)
	public int method14721() {
		return this.anInt5589 * -354558277;
	}

	@OriginalMember(owner = "client!zf", name = "j", descriptor = "()I", line = 26)
	public int method14722() {
		return this.anInt5589 * -354558277;
	}

	@OriginalMember(owner = "client!zf", name = "n", descriptor = "()I", line = 26)
	public int method14723() {
		return this.anInt5589 * -354558277;
	}

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "([Lclient!zf;)Ljava/util/Map;", line = 30)
	public static Map method14724(@OriginalArg(0) Class70_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(10) HashMap local10 = new HashMap();
		@Pc(12) Class70_Sub1[] local12 = arg0;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class70_Sub1 local22 = local12[local14];
			local10.put(local22.aClass43_72, local22);
		}
		return local10;
	}

	@OriginalMember(owner = "client!zf", name = "r", descriptor = "([Lclient!zf;)Ljava/util/Map;", line = 30)
	public static Map method14725(@OriginalArg(0) Class70_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(10) HashMap local10 = new HashMap();
		@Pc(12) Class70_Sub1[] local12 = arg0;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class70_Sub1 local22 = local12[local14];
			local10.put(local22.aClass43_72, local22);
		}
		return local10;
	}

	@OriginalMember(owner = "client!zf", name = "d", descriptor = "([Lclient!zf;)Ljava/util/Map;", line = 30)
	public static Map method14726(@OriginalArg(0) Class70_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(10) HashMap local10 = new HashMap();
		@Pc(12) Class70_Sub1[] local12 = arg0;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class70_Sub1 local22 = local12[local14];
			local10.put(local22.aClass43_72, local22);
		}
		return local10;
	}

	@OriginalMember(owner = "client!zf", name = "q", descriptor = "([Lclient!zf;)Ljava/util/Map;", line = 30)
	public static Map method14727(@OriginalArg(0) Class70_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(10) HashMap local10 = new HashMap();
		@Pc(12) Class70_Sub1[] local12 = arg0;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class70_Sub1 local22 = local12[local14];
			local10.put(local22.aClass43_72, local22);
		}
		return local10;
	}

	@OriginalMember(owner = "client!zf", name = "p", descriptor = "(IB)Ljava/lang/Object;", line = 45)
	@Override
	public Object method14712(@OriginalArg(0) int arg0) {
		@Pc(4) Class11 local4 = this.method14717(arg0);
		return local4 != null && local4.method1201() ? local4.method1202() : null;
	}

	@OriginalMember(owner = "client!zf", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 45)
	@Override
	public Object method14713(@OriginalArg(0) int arg0) {
		@Pc(4) Class11 local4 = this.method14717(arg0);
		return local4 != null && local4.method1201() ? local4.method1202() : null;
	}

	@OriginalMember(owner = "client!zf", name = "x", descriptor = "(Lclient!lq;I)I", line = 51)
	public int method14715(@OriginalArg(0) Class304 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject17 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject17 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject17 instanceof String) {
			local6 = local1 + Class612.method33643((String) arg0.anObject17);
		} else if (arg0.anObject17 instanceof Interface59) {
			local6 = local1 + ((Interface59) arg0.anObject17).method11700();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!zf", name = "m", descriptor = "(Lclient!lq;)I", line = 51)
	public int method14728(@OriginalArg(0) Class304 arg0) {
		@Pc(1) byte local1 = 2;
		@Pc(6) int local6;
		if (arg0.anObject17 instanceof Integer) {
			local6 = local1 + 4;
		} else if (arg0.anObject17 instanceof Long) {
			local6 = local1 + 8;
		} else if (arg0.anObject17 instanceof String) {
			local6 = local1 + Class612.method33643((String) arg0.anObject17);
		} else if (arg0.anObject17 instanceof Interface59) {
			local6 = local1 + ((Interface59) arg0.anObject17).method11700();
		} else {
			throw new IllegalStateException();
		}
		return local6;
	}

	@OriginalMember(owner = "client!zf", name = "v", descriptor = "(Lclient!ahb;Lclient!lq;)V", line = 61)
	public void method14729(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class304 arg1) {
		arg0.method20251(arg1.anInt4428 * 1628864065);
		if (arg1.anObject17 instanceof Integer) {
			arg0.method20254((Integer) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Long) {
			arg0.method20409((Long) arg1.anObject17);
		} else if (arg1.anObject17 instanceof String) {
			arg0.method20261((String) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Interface59) {
			((Interface59) arg1.anObject17).method11692(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!zf", name = "t", descriptor = "(Lclient!ahb;Lclient!lq;)V", line = 61)
	public void method14730(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class304 arg1) {
		arg0.method20251(arg1.anInt4428 * 1628864065);
		if (arg1.anObject17 instanceof Integer) {
			arg0.method20254((Integer) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Long) {
			arg0.method20409((Long) arg1.anObject17);
		} else if (arg1.anObject17 instanceof String) {
			arg0.method20261((String) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Interface59) {
			((Interface59) arg1.anObject17).method11692(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!zf", name = "s", descriptor = "(Lclient!ahb;Lclient!lq;B)V", line = 61)
	public void method14733(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class304 arg1) {
		arg0.method20251(arg1.anInt4428 * 1628864065);
		if (arg1.anObject17 instanceof Integer) {
			arg0.method20254((Integer) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Long) {
			arg0.method20409((Long) arg1.anObject17);
		} else if (arg1.anObject17 instanceof String) {
			arg0.method20261((String) arg1.anObject17);
		} else if (arg1.anObject17 instanceof Interface59) {
			((Interface59) arg1.anObject17).method11692(arg0);
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!zf", name = "u", descriptor = "(Lclient!ahb;I)Lclient!lq;", line = 70)
	public Class304 method14716(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(8) Class11 local8 = this.method14717(local3);
		if (!local8.method1201()) {
			throw new IllegalStateException("");
		}
		@Pc(22) Class304 local22 = new Class304(local3);
		@Pc(28) Class local28 = local8.aClass339_3.method26428().aClass1;
		if (local28 == Integer.class) {
			local22.anObject17 = arg0.method20275();
		} else if (Long.class == local28) {
			local22.anObject17 = arg0.method20371();
		} else if (local28 == String.class) {
			local22.anObject17 = arg0.method20284();
		} else if (Interface59.class.isAssignableFrom(local28)) {
			try {
				@Pc(65) Interface59 local65 = (Interface59) local28.getDeclaredConstructor().newInstance();
				local65.method11698(arg0);
				local22.anObject17 = local65;
			} catch (@Pc(74) InstantiationException local74) {
			} catch (@Pc(76) IllegalAccessException local76) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!zf", name = "w", descriptor = "(Lclient!ahb;)Lclient!lq;", line = 70)
	public Class304 method14731(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(8) Class11 local8 = this.method14717(local3);
		if (!local8.method1201()) {
			throw new IllegalStateException("");
		}
		@Pc(22) Class304 local22 = new Class304(local3);
		@Pc(28) Class local28 = local8.aClass339_3.method26428().aClass1;
		if (local28 == Integer.class) {
			local22.anObject17 = arg0.method20275();
		} else if (Long.class == local28) {
			local22.anObject17 = arg0.method20371();
		} else if (local28 == String.class) {
			local22.anObject17 = arg0.method20284();
		} else if (Interface59.class.isAssignableFrom(local28)) {
			try {
				@Pc(65) Interface59 local65 = (Interface59) local28.getDeclaredConstructor().newInstance();
				local65.method11698(arg0);
				local22.anObject17 = local65;
			} catch (@Pc(74) InstantiationException local74) {
			} catch (@Pc(76) IllegalAccessException local76) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!zf", name = "o", descriptor = "(Lclient!ahb;)Lclient!lq;", line = 70)
	public Class304 method14732(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(8) Class11 local8 = this.method14717(local3);
		if (!local8.method1201()) {
			throw new IllegalStateException("");
		}
		@Pc(22) Class304 local22 = new Class304(local3);
		@Pc(28) Class local28 = local8.aClass339_3.method26428().aClass1;
		if (local28 == Integer.class) {
			local22.anObject17 = arg0.method20275();
		} else if (Long.class == local28) {
			local22.anObject17 = arg0.method20371();
		} else if (local28 == String.class) {
			local22.anObject17 = arg0.method20284();
		} else if (Interface59.class.isAssignableFrom(local28)) {
			try {
				@Pc(65) Interface59 local65 = (Interface59) local28.getDeclaredConstructor().newInstance();
				local65.method11698(arg0);
				local22.anObject17 = local65;
			} catch (@Pc(74) InstantiationException local74) {
			} catch (@Pc(76) IllegalAccessException local76) {
			}
		} else {
			throw new IllegalStateException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!zf", name = "y", descriptor = "(Lclient!ahb;Lclient!nd;I)Lclient!lq;", line = 92)
	public Class304 method14718(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class342 arg1) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(8) Class304 local8 = new Class304(local3);
		@Pc(11) Class local11 = arg1.aClass1;
		if (Integer.class == local11) {
			local8.anObject17 = arg0.method20275();
		} else if (local11 == Long.class) {
			local8.anObject17 = arg0.method20371();
		} else if (String.class == local11) {
			local8.anObject17 = arg0.method20284();
		} else if (Interface59.class.isAssignableFrom(local11)) {
			try {
				@Pc(48) Interface59 local48 = (Interface59) local11.getDeclaredConstructor().newInstance();
				local48.method11698(arg0);
				local8.anObject17 = local48;
			} catch (@Pc(57) InstantiationException local57) {
			} catch (@Pc(59) IllegalAccessException local59) {
			}
		} else {
			throw new IllegalStateException();
		}
		@Pc(69) Class11 local69 = this.method14717(local3);
		return local69.method1201() && local69.aClass339_3.method26428() == arg1 ? local8 : null;
	}

	@OriginalMember(owner = "client!zf", name = "mr", descriptor = "(I)V", line = 11744)
	public static void method14734() {
		if (Class527.method32424() == Class389.aClass389_3) {
			return;
		}
		try {
			@Pc(9) String local9 = Class524.anApplet2.getParameter(Class296.aClass296_21.aString197);
			@Pc(17) int local17 = (int) (Class176.method23413() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local17 + "; version=1; path=/; domain=" + local9;
			Class588.method33289(Class524.anApplet2, "document.cookie=\"" + local30 + "\"");
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!zf", name = "g", descriptor = "(II)Lclient!cy;")
	public abstract Class11 method14717(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "b", descriptor = "(I)Lclient!cy;")
	public abstract Class11 method14719(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "c", descriptor = "(I)Lclient!cy;")
	public abstract Class11 method14720(@OriginalArg(0) int arg0);
}
