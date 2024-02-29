package com.jagex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ack")
public class Class60 {

	@OriginalMember(owner = "client!ack", name = "ee", descriptor = "Lclient!tt;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!ack", name = "p", descriptor = "Lclient!qj;")
	Class489 aClass489_1;

	@OriginalMember(owner = "client!ack", name = "c", descriptor = "Ljava/util/Map;")
	Map aMap4;

	@OriginalMember(owner = "client!ack", name = "<init>", descriptor = "(Lclient!pw;II)V", line = 16)
	public Class60(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) byte[] local7 = arg0.method29725(arg1, arg2);
		this.method879(new Class77_Sub39(local7));
	}

	@OriginalMember(owner = "client!ack", name = "l", descriptor = "(Lclient!akv;)V", line = 22)
	void method878(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass489_1 = (Class489) Class457.method29479(Class489.method30004(), arg0.method22478());
		@Pc(13) int local13 = arg0.method22555();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass489_1.method30013(arg0);
			@Pc(32) int local32 = arg0.method22555();
			@Pc(36) LinkedList local36 = new LinkedList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.method22555();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!ack", name = "p", descriptor = "(Lclient!akv;I)V", line = 22)
	void method879(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass489_1 = (Class489) Class457.method29479(Class489.method30004(), arg0.method22478());
		@Pc(13) int local13 = arg0.method22555();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass489_1.method30013(arg0);
			@Pc(32) int local32 = arg0.method22555();
			@Pc(36) LinkedList local36 = new LinkedList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.method22555();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!ack", name = "v", descriptor = "(Lclient!akv;)V", line = 22)
	void method880(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass489_1 = (Class489) Class457.method29479(Class489.method30004(), arg0.method22478());
		@Pc(13) int local13 = arg0.method22555();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass489_1.method30013(arg0);
			@Pc(32) int local32 = arg0.method22555();
			@Pc(36) LinkedList local36 = new LinkedList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.method22555();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!ack", name = "c", descriptor = "(Ljava/lang/Object;B)Ljava/util/List;", line = 38)
	public List method881(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "y", descriptor = "(Ljava/lang/Object;)Ljava/util/List;", line = 38)
	public List method882(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "w", descriptor = "(Ljava/lang/Object;)Ljava/util/List;", line = 38)
	public List method883(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "l", descriptor = "(III)Lclient!gm;", line = 282)
	public static Class277 method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class277 local3 = Class155.method23628(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass277Array3 == null || arg1 >= local3.aClass277Array3.length) {
			return null;
		} else {
			return local3.aClass277Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!ack", name = "yw", descriptor = "(Lclient!yf;I)V", line = 8938)
	static final void method885(@OriginalArg(0) Class665 arg0) {
		if (client.aString163 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class133.method13668(client.aString163);
		}
	}
}
