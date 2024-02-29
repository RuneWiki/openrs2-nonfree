package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public class Class505 {

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Z")
	static boolean aBoolean774;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!rb;")
	public static final Class505 aClass505_4 = new Class505(false, false);

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!rb;")
	public static final Class505 aClass505_1 = new Class505(true, false);

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!rb;")
	public static final Class505 aClass505_2 = new Class505(false, false);

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!rb;")
	public static final Class505 aClass505_5 = new Class505(true, false);

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!rb;")
	static final Class505 aClass505_3 = new Class505(true, false);

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!rb;")
	static final Class505 aClass505_8 = new Class505(true, true);

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!rb;")
	static final Class505 aClass505_6 = new Class505(true, true);

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!rb;")
	public static final Class505 aClass505_7 = new Class505(false, false);

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Z")
	boolean aBoolean773;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	boolean aBoolean772;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ZZ)V", line = 15)
	Class505(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean773 = arg0;
		this.aBoolean772 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "(I)Z", line = 21)
	boolean method30251() {
		return this.aBoolean773;
	}

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "()Z", line = 21)
	boolean method30252() {
		return this.aBoolean773;
	}

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "()Z", line = 21)
	boolean method30253() {
		return this.aBoolean773;
	}

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "()Z", line = 21)
	boolean method30254() {
		return this.aBoolean773;
	}

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "()Z", line = 25)
	public boolean method30255() {
		return this.aBoolean772;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Z", line = 25)
	public boolean method30256() {
		return this.aBoolean772;
	}

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "()Z", line = 25)
	public boolean method30257() {
		return this.aBoolean772;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Z", line = 122)
	static boolean method30258() {
		return Class589.anInt5459 * 1832109523 == -1 ? Class312.method27303(Class589.aString234, Class589.aString233) : Class647.method32850();
	}

	@OriginalMember(owner = "client!rb", name = "il", descriptor = "(I)V", line = 5566)
	static final void method30259() {
		@Pc(2) Iterator local2 = client.aClass12_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class77_Sub1_Sub5 local9 = (Class77_Sub1_Sub5) local2.next();
			@Pc(12) Class104_Sub1_Sub1_Sub5 local12 = local9.aClass104_Sub1_Sub1_Sub5_1;
			if (client.aClass517_1.method30435() != null && local12.method23984()) {
				client.aClass517_1.method30435().method31148(local12, true);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "lc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6654)
	static final void method30260(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray23 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!rb", name = "mm", descriptor = "(Lclient!yf;S)V", line = 6768)
	static final void method30261(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class133.method13672(local16, local22, arg0);
	}
}
