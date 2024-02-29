package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public class Class240 {

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	static final int anInt3782 = 1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	static final int anInt3783 = 10;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "S")
	static short aShort166;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Ljava/util/LinkedHashMap;")
	LinkedHashMap aLinkedHashMap1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 17)
	Class240() {
		this((Class77_Sub39) null);
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!akv;)V", line = 20)
	Class240(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLinkedHashMap1 = new LinkedHashMap();
		if (arg0 != null && arg0.aByteArray53 != null) {
			@Pc(17) int local17 = arg0.method22478();
			if (local17 > 0 && local17 <= 1) {
				@Pc(27) int local27 = arg0.method22478();
				for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
					@Pc(36) long local36 = arg0.method22510();
					@Pc(40) int local40 = arg0.method22500();
					this.aLinkedHashMap1.put(local36, local40);
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "p", descriptor = "(Lclient!akv;I)V", line = 37)
	void method25929(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(1);
		arg0.method22403(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22428((Long) local21.getKey());
			arg0.method22417((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!f", name = "t", descriptor = "(Lclient!akv;)V", line = 37)
	void method25930(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22403(1);
		arg0.method22403(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22428((Long) local21.getKey());
			arg0.method22417((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(JIB)V", line = 49)
	void method25931(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method25944();
	}

	@OriginalMember(owner = "client!f", name = "q", descriptor = "(JI)V", line = 49)
	void method25932(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method25944();
	}

	@OriginalMember(owner = "client!f", name = "x", descriptor = "(JI)V", line = 49)
	void method25933(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method25944();
	}

	@OriginalMember(owner = "client!f", name = "t", descriptor = "(II)I", line = 55)
	static final int method25934(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(J)Z", line = 61)
	boolean method25935(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!f", name = "v", descriptor = "(J)Z", line = 61)
	boolean method25936(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(J)I", line = 65)
	int method25937(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!f", name = "s", descriptor = "(J)I", line = 65)
	int method25938(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!f", name = "r", descriptor = "(J)I", line = 65)
	int method25939(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(J)I", line = 65)
	int method25940(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "()Lclient!f;", line = 69)
	public static Class240 method25941() {
		@Pc(1) Class28 local1 = null;
		@Pc(65) Class240 local65;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method478()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method486(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class240 local50 = new Class240(new Class77_Sub39(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class240();
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!f", name = "z", descriptor = "()Lclient!f;", line = 69)
	public static Class240 method25942() {
		@Pc(1) Class28 local1 = null;
		@Pc(65) Class240 local65;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method478()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method486(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class240 local50 = new Class240(new Class77_Sub39(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class240();
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "()Lclient!f;", line = 69)
	public static Class240 method25943() {
		@Pc(1) Class28 local1 = null;
		@Pc(65) Class240 local65;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method478()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method486(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class240 local50 = new Class240(new Class77_Sub39(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class240();
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!f", name = "w", descriptor = "(I)V", line = 93)
	void method25944() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, true);
			@Pc(13) Class77_Sub39 local13 = new Class77_Sub39(5000);
			this.method25929(local13);
			local1.method475(local13.aByteArray53, 0, local13.anInt3089 * 31645619);
		} catch (@Pc(36) Exception local36) {
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(52) Exception local52) {
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()V", line = 93)
	void method25945() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("3", client.aClass670_4.aString245, true);
			@Pc(13) Class77_Sub39 local13 = new Class77_Sub39(5000);
			this.method25929(local13);
			local1.method475(local13.aByteArray53, 0, local13.anInt3089 * 31645619);
		} catch (@Pc(36) Exception local36) {
		} finally {
			try {
				if (local1 != null) {
					local1.method476();
				}
			} catch (@Pc(52) Exception local52) {
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "(IIIZB)I", line = 210)
	public static int method25946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 != 0 && (arg0 < 50 || arg0 > 100)) {
			arg0 = 0;
		}
		if (arg1 != 0 && (arg1 < 50 || arg1 > 100)) {
			arg1 = 0;
		}
		@Pc(23) boolean local23 = Class508.aString221.startsWith("mac");
		@Pc(37) int[] local37 = Class529.aTwitchTV1.GetRecommendedSettings(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, arg0, 2000, arg2, Class574.aFloat314, local23);
		if (local37[0] != 0) {
			return local37[0];
		}
		@Pc(50) int local50 = local37[1];
		@Pc(54) int local54 = local37[2];
		@Pc(58) int local58 = local37[3];
		@Pc(60) int local60 = local58;
		Class574.aLong289 = 0L;
		Class428.aLong271 = (long) (1000.0F / (float) arg2) * -562919201211844877L;
		Class398.anInt4682 = local50 * 415163569;
		Class508.anInt5091 = local54 * -1557462787;
		if (arg1 != 0) {
			local58 = local58 * arg1 / 100;
		}
		Class51.method764("Stream - Input: " + Class149_Sub4.anInt2368 * 1771907305 + "x" + Class19.anInt108 * -1091172141 + " (" + local60 + "kbps)" + " => " + "Output: " + local50 + "x" + local54 + " [" + (arg0 == 0 ? "auto" : arg0 + "%") + "] (" + local58 + "kbps [" + (arg1 == 0 ? "auto" : arg1 + "%") + "])");
		return Class529.aTwitchTV1.StartStreaming(local50, local54, arg2, local58, arg1 != 0, Class574.aFloat314, Class574.anInt5388 * 1223369625, arg3);
	}

	@OriginalMember(owner = "client!f", name = "qq", descriptor = "(Lclient!yf;I)V", line = 7607)
	static final void method25947(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		if (local11.aString179 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local11.aString179;
		}
	}

	@OriginalMember(owner = "client!f", name = "abz", descriptor = "(Lclient!yf;B)V", line = 9445)
	static final void method25948(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(31) int local31 = client.aClass497ArrayArray1[local23][local13].method30169();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local31 == 5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!f", name = "aev", descriptor = "(Lclient!yf;I)V", line = 9883)
	static final void method25949(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319(local13);
		if (local23 < 1 || local23 > 5 || local29.aStringArray5[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local29.aStringArray5[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!f", name = "ael", descriptor = "(Lclient!yf;I)V", line = 9897)
	static final void method25950(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt101 * 1113844363 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!f", name = "ahq", descriptor = "(Lclient!yf;I)V", line = 10754)
	static final void method25951(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class261.method26362();
		if (local15 != null) {
			@Pc(35) boolean local35 = local15.method21866(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class674.anIntArray538);
			if (local35) {
				Class85.method4906(Class674.anIntArray538[1], Class674.anIntArray538[2]);
			}
		}
	}
}
