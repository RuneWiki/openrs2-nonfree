package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public class Class306 {

	@OriginalMember(owner = "client!h", name = "n", descriptor = "I")
	static final int anInt3940 = 10;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	static final int anInt3941 = 1;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Ljava/util/LinkedHashMap;")
	LinkedHashMap aLinkedHashMap1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 17)
	Class306() {
		this((Class93_Sub41) null);
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!alw;)V", line = 20)
	Class306(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLinkedHashMap1 = new LinkedHashMap();
		if (arg0 != null && arg0.aByteArray58 != null) {
			@Pc(16) int local16 = arg0.method22413();
			if (local16 > 0 && local16 <= 1) {
				@Pc(26) int local26 = arg0.method22413();
				for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
					@Pc(35) long local35 = arg0.method22423();
					@Pc(39) int local39 = arg0.method22419();
					this.aLinkedHashMap1.put(local35, local39);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(II)Ljava/lang/String;", line = 22)
	public static String method26823(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(Lclient!alw;B)V", line = 37)
	void method26807(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.method22510(1);
		arg0.method22510(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22399((Long) local21.getKey());
			arg0.method22395((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(Lclient!alw;)V", line = 37)
	void method26809(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.method22510(1);
		arg0.method22510(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22399((Long) local21.getKey());
			arg0.method22395((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "(JI)V", line = 49)
	void method26810(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26805();
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "(JI)V", line = 49)
	void method26811(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26805();
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(JII)V", line = 49)
	void method26817(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26805();
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(J)Z", line = 61)
	boolean method26812(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(J)Z", line = 61)
	boolean method26813(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(J)Z", line = 61)
	boolean method26816(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(J)I", line = 65)
	int method26804(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(J)I", line = 65)
	int method26814(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "(J)I", line = 65)
	int method26815(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Lclient!h;", line = 69)
	public static Class306 method26806() {
		@Pc(1) Class38 local1 = null;
		@Pc(65) Class306 local65;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, false);
			@Pc(14) byte[] local14 = new byte[(int) local1.method735()];
			@Pc(30) int local30;
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16 += local30) {
				local30 = local1.method726(local14, local16, local14.length - local16);
				if (local30 == -1) {
					throw new EOFException();
				}
			}
			@Pc(50) Class306 local50 = new Class306(new Class93_Sub41(local14));
			return local50;
		} catch (@Pc(61) Exception local61) {
			local65 = new Class306();
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(84) Exception local84) {
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "(B)V", line = 93)
	void method26805() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, true);
			@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(5000);
			this.method26807(local13);
			local1.method722(local13.aByteArray58, 0, local13.anInt3070 * 212851357);
		} catch (@Pc(37) Exception local37) {
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(55) Exception local55) {
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()V", line = 93)
	void method26808() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, true);
			@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(5000);
			this.method26807(local13);
			local1.method722(local13.aByteArray58, 0, local13.anInt3070 * 212851357);
		} catch (@Pc(37) Exception local37) {
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(55) Exception local55) {
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()V", line = 93)
	void method26818() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, true);
			@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(5000);
			this.method26807(local13);
			local1.method722(local13.aByteArray58, 0, local13.anInt3070 * 212851357);
		} catch (@Pc(37) Exception local37) {
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(55) Exception local55) {
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()V", line = 93)
	void method26819() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("3", client.aClass702_4.aString241, true);
			@Pc(13) Class93_Sub41 local13 = new Class93_Sub41(5000);
			this.method26807(local13);
			local1.method722(local13.aByteArray58, 0, local13.anInt3070 * 212851357);
		} catch (@Pc(37) Exception local37) {
		} finally {
			try {
				if (local1 != null) {
					local1.method732();
				}
			} catch (@Pc(55) Exception local55) {
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "(Lclient!dh;JIIB)V", line = 337)
	public static void method26820(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		if (arg0.method20659() && arg0.method20801() > -1) {
			local9 = arg0.method20801();
			@Pc(11) Class626 local11 = null;
			if (!Class625.aLinkedList6.isEmpty()) {
				local11 = (Class626) Class625.aLinkedList6.getFirst();
			}
			if (local11 != null && local11.anInt5701 * -471012383 == local9) {
				Class625.aLinkedList6.removeFirst();
				arg0.method20502();
				@Pc(64) int local64;
				if (local11.aLinkedList8.isEmpty() && arg0.method20452()) {
					@Pc(55) long local55 = arg0.method20457(Class314.anInt4063 * 1161430833, Class17.anInt60 * -1559495963);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrame(local55, arg0.method20603(), Class625.aBoolean850, arg2, arg3);
					arg0.method20458(local55);
				} else {
					arg0.method20459(Class314.anInt4063 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray427, Class183.anIntArray293);
					Class347.method27610(Class364.anIntArray427, local11.aLinkedList8, local11.anInt5703 * 2135765083, local11.anInt5702 * 430444085, local11.aFloat338);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray427, Class625.aBoolean850, arg2, arg3);
				}
				arg0.method20503();
				if (local64 == 2072) {
					Class625.aLong293 = arg1 * -4106413465911637191L;
				} else if (local64 == 23) {
					Class625.aLong294 = arg1 * 8308705867590167991L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20455();
				Class625.aLinkedList6.clear();
			}
		}
		if (!Class625.aBoolean849) {
			return;
		}
		if (Class364.anIntArray427 == null) {
			Class364.anIntArray427 = new int[Class625.aBoolean850 ? arg3 * arg2 : Class314.anInt4063 * 1161430833 * -1559495963 * Class17.anInt60];
			Class183.anIntArray293 = new int[Class625.aBoolean850 ? arg3 * arg2 : Class314.anInt4063 * 1161430833 * Class17.anInt60 * -1559495963];
		}
		if (arg0.method20659()) {
			arg0.method20462(client.anInt3485, Class314.anInt4063 * 1161430833, Class17.anInt60 * -1559495963);
			Class625.aLinkedList6.add(new Class626(client.anInt3485, Class625.aLinkedList7, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199));
			Class625.aLinkedList7 = new LinkedList();
		} else {
			arg0.method20502();
			arg0.method20459(Class314.anInt4063 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray427, Class183.anIntArray293);
			Class347.method27610(Class364.anIntArray427, Class625.aLinkedList7, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199);
			local9 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray427, Class625.aBoolean850, arg2, arg3);
			arg0.method20503();
			Class625.aLinkedList7.clear();
			if (local9 == 2072) {
				Class625.aLong293 = arg1 * -4106413465911637191L;
			} else if (local9 == 23) {
				Class625.aLong294 = arg1 * 8308705867590167991L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		Class625.aBoolean849 = false;
	}

	@OriginalMember(owner = "client!h", name = "un", descriptor = "(Lclient!yf;I)V", line = 8710)
	static final void method26821(@OriginalArg(0) Class681 arg0) {
		@Pc(14) Class312 local14 = Class659.method32805(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		if (local14.anInt4045 * 307668159 == -1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local14.anInt4046 * -570377411;
		}
	}

	@OriginalMember(owner = "client!h", name = "xx", descriptor = "(Lclient!yf;I)V", line = 9175)
	static final void method26822(@OriginalArg(0) Class681 arg0) {
		@Pc(3) Class611 local3 = new Class611();
		local3.method32027((Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375]);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local3.method32026();
	}
}
