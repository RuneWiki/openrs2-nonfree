package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class484 {

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator2;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/util/Map;")
	final Map aMap20;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!ass;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_2;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!ass;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_3;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "J")
	final long aLong280;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "Lclient!pl;")
	final Class467 aClass467_3;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	final int anInt5016;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(ILclient!pl;)V", line = 30)
	public Class484(@OriginalArg(0) int arg0, @OriginalArg(1) Class467 arg1) {
		this(-1L, arg0, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(JILclient!pl;)V", line = 33)
	Class484(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class467 arg2) {
		this.aComparator2 = new Class477(this);
		this.aLong280 = arg0 * -3128581684624738445L;
		this.anInt5016 = arg1 * 864869239;
		this.aClass467_3 = arg2;
		if (this.anInt5016 * 1139699271 == -1) {
			this.aMap20 = new HashMap(64);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(64, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = null;
		} else if (this.aClass467_3 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.aMap20 = new HashMap(this.anInt5016 * 1139699271);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(this.anInt5016 * 1139699271, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = new AbstractQueue_Sub1(this.anInt5016 * 1139699271);
		}
	}

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "(I)Z", line = 51)
	boolean method29839() {
		return this.anInt5016 * 1139699271 != -1;
	}

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "()Z", line = 51)
	boolean method29840() {
		return this.anInt5016 * 1139699271 != -1;
	}

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 55)
	public Object method29841(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong280 * 780914785329792443L != -1L) {
				this.method29850();
			}
			@Pc(19) Class475 local19 = (Class475) this.aMap20.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method29847(local19, false);
				return local19.anObject20;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;", line = 55)
	public Object method29842(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong280 * 780914785329792443L != -1L) {
				this.method29850();
			}
			@Pc(19) Class475 local19 = (Class475) this.aMap20.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method29847(local19, false);
				return local19.anObject20;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;", line = 55)
	public Object method29843(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong280 * 780914785329792443L != -1L) {
				this.method29850();
			}
			@Pc(19) Class475 local19 = (Class475) this.aMap20.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method29847(local19, false);
				return local19.anObject20;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", line = 65)
	public Object method29844(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong280 * 780914785329792443L != -1L) {
				this.method29850();
			}
			@Pc(19) Class475 local19 = (Class475) this.aMap20.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject20;
				local19.anObject20 = arg1;
				this.method29847(local19, false);
				return local24;
			}
			@Pc(53) Class475 local53;
			if (this.method29839() && this.aMap20.size() == this.anInt5016 * 1139699271) {
				local53 = (Class475) this.anAbstractQueue_Sub1_3.remove();
				this.aMap20.remove(local53.anObject21);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class475(arg1, arg0);
			this.aMap20.put(arg0, local53);
			this.method29847(local53, true);
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", line = 65)
	public Object method29845(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong280 * 780914785329792443L != -1L) {
				this.method29850();
			}
			@Pc(19) Class475 local19 = (Class475) this.aMap20.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject20;
				local19.anObject20 = arg1;
				this.method29847(local19, false);
				return local24;
			}
			@Pc(53) Class475 local53;
			if (this.method29839() && this.aMap20.size() == this.anInt5016 * 1139699271) {
				local53 = (Class475) this.anAbstractQueue_Sub1_3.remove();
				this.aMap20.remove(local53.anObject21);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class475(arg1, arg0);
			this.aMap20.put(arg0, local53);
			this.method29847(local53, true);
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(Lclient!pt;Z)V", line = 88)
	void method29846(@OriginalArg(0) Class475 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method29839() && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong278 = System.currentTimeMillis() * 4711446986571620569L;
		if (this.method29839()) {
			switch(this.aClass467_3.anInt4982 * 1303515907) {
				case 0:
					arg0.aLong279 += -4683728638372128205L;
					break;
				case 1:
					arg0.aLong279 = arg0.aLong278 * -2502041163440165909L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "(Lclient!pt;ZI)V", line = 88)
	void method29847(@OriginalArg(0) Class475 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method29839() && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong278 = System.currentTimeMillis() * 4711446986571620569L;
		if (this.method29839()) {
			switch(this.aClass467_3.anInt4982 * 1303515907) {
				case 0:
					arg0.aLong279 += -4683728638372128205L;
					break;
				case 1:
					arg0.aLong279 = arg0.aLong278 * -2502041163440165909L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "()V", line = 111)
	void method29848() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "()V", line = 111)
	void method29849() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "(I)V", line = 111)
	void method29850() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "()V", line = 111)
	void method29851() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "()V", line = 111)
	void method29852() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "()V", line = 111)
	void method29853() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "()V", line = 111)
	void method29854() {
		if (this.aLong280 * 780914785329792443L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong280 * 780914785329792443L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class475 local27 = (Class475) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong278 * -4949530321911881879L >= local18) {
				return;
			}
			this.aMap20.remove(local27.anObject21);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method29839()) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 173)
	static void method29855() {
		if (Class590.aClass548_3 == null) {
			return;
		}
		try {
			@Pc(8) short local8;
			if (Class314.anInt4063 * 2039255983 == 0) {
				local8 = 250;
			} else {
				local8 = 2000;
			}
			Class314.anInt4065 += 999247095;
			if (Class314.anInt4065 * -1232128825 > local8) {
				Class143.method16255();
			}
			@Pc(61) int local61;
			if (Class590.aClass548_3 == Class548.aClass548_2) {
				client.aClass82_1.method2012(Class142.method14871(Class8.aClass25_4.method446(), 40000), Class8.aClass25_4.aString5);
				client.aClass82_1.method1999();
				@Pc(42) Class77_Sub20 local42 = Class41.method692();
				local42.aClass77_Sub39_Sub1_2.method22403(Class422.aClass422_8.anInt4805 * -100453045);
				local42.aClass77_Sub39_Sub1_2.method22408(0);
				local61 = local42.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
				local42.aClass77_Sub39_Sub1_2.method22408(881);
				local42.aClass77_Sub39_Sub1_2.method22408(1);
				Class314.anIntArray432 = Class92_Sub2_Sub2.method23289(local42);
				@Pc(81) int local81 = local42.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
				local42.aClass77_Sub39_Sub1_2.method22440(client.aString159);
				local42.aClass77_Sub39_Sub1_2.method22408(client.anInt3378 * 1844562269);
				local42.aClass77_Sub39_Sub1_2.method22417(client.anInt3382 * -1608886643);
				local42.aClass77_Sub39_Sub1_2.method22417(client.anInt3510 * 1306630125);
				local42.aClass77_Sub39_Sub1_2.method22440(Class184.aString139);
				local42.aClass77_Sub39_Sub1_2.method22403(Class128.aClass667_3.method36479());
				local42.aClass77_Sub39_Sub1_2.method22403(client.aClass670_4.anInt5791 * -1082924039);
				Class644.method32825(local42.aClass77_Sub39_Sub1_2);
				@Pc(132) String local132 = client.aString154;
				local42.aClass77_Sub39_Sub1_2.method22403(local132 == null ? 0 : 1);
				if (local132 != null) {
					local42.aClass77_Sub39_Sub1_2.method22440(local132);
				}
				Class96_Sub23.aClass77_Sub28_1.method13738(local42.aClass77_Sub39_Sub1_2);
				local42.aClass77_Sub39_Sub1_2.anInt3089 += -1122347939;
				local42.aClass77_Sub39_Sub1_2.method22567(Class314.anIntArray432, local81, local42.aClass77_Sub39_Sub1_2.anInt3089 * 31645619);
				local42.aClass77_Sub39_Sub1_2.method22462(local42.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local61);
				client.aClass82_1.method2004(local42);
				client.aClass82_1.method2000();
				Class590.aClass548_3 = Class548.aClass548_1;
			}
			if (Class590.aClass548_3 == Class548.aClass548_1) {
				if (client.aClass82_1.method2022() == null) {
					Class143.method16255();
					return;
				}
				if (!client.aClass82_1.method2022().method14347(1)) {
					return;
				}
				client.aClass82_1.method2022().method14339(client.aClass82_1.aClass77_Sub39_Sub1_1.aByteArray53, 0, 1);
				Class314.aClass690_1 = (Class690) Class457.method29479(Class301.method27117(), client.aClass82_1.aClass77_Sub39_Sub1_1.aByteArray53[0] & 0xFF);
				if (Class314.aClass690_1 == Class690.aClass690_7) {
					client.aClass82_1.aClass16_1 = new Class16(Class314.anIntArray432);
					@Pc(245) int[] local245 = new int[4];
					for (local61 = 0; local61 < 4; local61++) {
						local245[local61] = Class314.anIntArray432[local61] + 50;
					}
					client.aClass82_1.aClass16_2 = new Class16(local245);
					new Class16(local245);
					client.aClass82_1.aClass77_Sub39_Sub1_1.method22167(client.aClass82_1.aClass16_2);
					Class668.method33179(18);
					client.aClass82_1.method1999();
					client.aClass82_1.aClass77_Sub39_Sub1_1.anInt3089 = 0;
					client.aClass82_1.aClass418_4 = null;
					client.aClass82_1.aClass418_3 = null;
					client.aClass82_1.aClass418_2 = null;
					client.aClass82_1.anInt323 = 0;
					Class55.aClass124_1.aClass608_1.method32134();
					Class143_Sub20.method15693();
				} else {
					client.aClass82_1.method2014();
				}
				client.aClass82_1.aClass418_1 = null;
				Class590.aClass548_3 = null;
			}
		} catch (@Pc(316) IOException local316) {
			Class143.method16255();
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)I", line = 253)
	public static int method29856() {
		return Class257.method26227() ? Class574.anInt5402 * 1378653945 : 0;
	}

	@OriginalMember(owner = "client!qd", name = "fh", descriptor = "(IIIIZI)V", line = 2237)
	static void method29857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Class706.aBoolean868 && Class184.aFrame1 != null && (arg1 != 3 || Class332.anInt4098 * 1964065355 != arg2 || arg3 != Class268.anInt3833 * -844799891)) {
			Class158.method24312(client.aClass15_2, Class184.aFrame1);
			Class184.aFrame1 = null;
		}
		if (Class706.aBoolean868 && arg1 == 3 && Class184.aFrame1 == null) {
			Class184.aFrame1 = Class409.method28561(client.aClass15_2, arg2, arg3, 0, 0);
			if (Class184.aFrame1 != null) {
				Class332.anInt4098 = arg2 * 938997603;
				Class268.anInt3833 = arg3 * 1608362341;
				Class667.method33150();
			}
		}
		if (arg1 == 3 && (!Class706.aBoolean868 || Class184.aFrame1 == null)) {
			method29857(arg0, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, true);
			return;
		}
		@Pc(72) Container local72 = Class94.method7650();
		@Pc(89) Insets local89;
		if (Class184.aFrame1 != null) {
			Class402.anInt4694 = arg2 * 1199809921;
			client.anInt3365 = arg3 * 226957979;
		} else if (Class460.aFrame2 == null) {
			Class402.anInt4694 = local72.getSize().width * 1199809921;
			client.anInt3365 = local72.getSize().height * 226957979;
		} else {
			local89 = Class460.aFrame2.getInsets();
			@Pc(97) int local97 = local89.left + local89.right;
			Class402.anInt4694 = (Class460.aFrame2.getSize().width - local97) * 1199809921;
			@Pc(109) int local109 = local89.top + local89.bottom;
			client.anInt3365 = (Class460.aFrame2.getSize().height - local109) * 226957979;
		}
		if (Class402.anInt4694 * -166028671 <= 0) {
			Class402.anInt4694 = 1199809921;
		}
		if (client.anInt3365 * 8272787 <= 0) {
			client.anInt3365 = 226957979;
		}
		if (arg1 == 1) {
			Class149_Sub4.anInt2368 = client.anInt3394 * 1860177489;
			client.anInt3366 = (Class402.anInt4694 * -166028671 - client.anInt3394 * -321474631) / 2 * -138655283;
			Class19.anInt108 = client.anInt3464 * -1350390103;
			client.anInt3367 = 0;
		} else {
			Class152.method17450();
		}
		if (client.aClass661_1 != Class661.aClass661_5 && Class149_Sub4.anInt2368 * 1771907305 < 1024 && Class19.anInt108 * -1091172141 < 768) {
		}
		if (arg4) {
			Class576.method31613();
		} else {
			Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			Class284.aClass86_9.method19965(Class470.aCanvas6, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			if (local72 == Class460.aFrame2) {
				local89 = Class460.aFrame2.getInsets();
				Class470.aCanvas6.setLocation(client.anInt3366 * -721302779 + local89.left, local89.top + client.anInt3367 * -350211099);
			} else {
				Class470.aCanvas6.setLocation(client.anInt3366 * -721302779, client.anInt3367 * -350211099);
			}
		}
		if (arg1 >= 2) {
			client.aBoolean615 = true;
		} else {
			client.aBoolean615 = false;
		}
		Class77_Sub28.method13745();
		if (-993629849 * client.anInt3459 != -1) {
			Class290.method27000(true);
		}
		if (Class230.method25826().method2022() != null && (Class35_Sub22.method18346(client.anInt3390 * -1850530127) || Class222.method25761(client.anInt3390 * -1850530127))) {
			Class47.method744(Class230.method25826());
		}
		for (@Pc(272) int local272 = 0; local272 < 108; local272++) {
			client.aBooleanArray17[local272] = true;
		}
		client.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!qd", name = "aiu", descriptor = "(Lclient!yf;S)V", line = 10899)
	static final void method29858(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		if (Class136_Sub1.aClass12_16 == null) {
			return;
		}
		@Pc(35) Class77 local35 = Class136_Sub1.aClass12_16.method173((long) local13);
		if (local35 != null && !local28) {
			local35.method24063();
		} else if (local35 == null && local28) {
			local35 = new Class77();
			Class136_Sub1.aClass12_16.method184(local35, (long) local13);
		}
	}

	@OriginalMember(owner = "client!qd", name = "awv", descriptor = "(Lclient!yf;S)V", line = 13252)
	static final void method29859(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
