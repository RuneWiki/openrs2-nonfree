package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afw")
public class Class96_Sub18 extends Class96 {

	@OriginalMember(owner = "client!afw", name = "c", descriptor = "I")
	final int anInt927;

	@OriginalMember(owner = "client!afw", name = "v", descriptor = "I")
	final int anInt926;

	@OriginalMember(owner = "client!afw", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class96_Sub18(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt927 = arg0.method22483() * -1395211243;
		this.anInt926 = arg0.method22500() * 1394269939;
	}

	@OriginalMember(owner = "client!afw", name = "v", descriptor = "(Lclient!akv;I)Lclient!ml;", line = 14)
	public static Class121 method7708(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class121 local3 = Class676.method35969(arg0);
		@Pc(7) int local7 = arg0.method22496();
		return new Class121_Sub1(local3.anInt1202 * 1909682011, local3.aClass410_5, local3.aClass402_5, local3.anInt1203 * -1151439181, local3.anInt1204 * -963484815, local7);
	}

	@OriginalMember(owner = "client!afw", name = "c", descriptor = "(I)V", line = 17)
	@Override
	public void method19911() {
		client.anInt3485 = client.anInt3414 * 1445783593;
		client.anInt3419 = (this.anInt927 * 1350888253 + client.anInt3414) * 1672441741;
		Class143_Sub35.anInt2272 = client.anInt3449 * -114919765;
		Class488.anInt5047 = client.anInt3421 * -1803007125;
		Class394.anInt4600 = client.anInt3460 * -1592469857;
		Class405.anInt4704 = client.anInt3422 * -631650605;
		client.anInt3449 = (this.anInt926 * -1324717509 >>> 24) * 1504160899;
		client.anInt3421 = (-1324717509 * this.anInt926 >>> 16 & 0xFF) * -1213142739;
		client.anInt3460 = (this.anInt926 * -1324717509 >>> 8 & 0xFF) * 1236159619;
		client.anInt3422 = (this.anInt926 * -1324717509 & 0xFF) * 994848893;
	}

	@OriginalMember(owner = "client!afw", name = "y", descriptor = "()V", line = 17)
	@Override
	public void method19912() {
		client.anInt3485 = client.anInt3414 * 1445783593;
		client.anInt3419 = (this.anInt927 * 1350888253 + client.anInt3414) * 1672441741;
		Class143_Sub35.anInt2272 = client.anInt3449 * -114919765;
		Class488.anInt5047 = client.anInt3421 * -1803007125;
		Class394.anInt4600 = client.anInt3460 * -1592469857;
		Class405.anInt4704 = client.anInt3422 * -631650605;
		client.anInt3449 = (this.anInt926 * -1324717509 >>> 24) * 1504160899;
		client.anInt3421 = (-1324717509 * this.anInt926 >>> 16 & 0xFF) * -1213142739;
		client.anInt3460 = (this.anInt926 * -1324717509 >>> 8 & 0xFF) * 1236159619;
		client.anInt3422 = (this.anInt926 * -1324717509 & 0xFF) * 994848893;
	}

	@OriginalMember(owner = "client!afw", name = "w", descriptor = "()V", line = 17)
	@Override
	public void method19913() {
		client.anInt3485 = client.anInt3414 * 1445783593;
		client.anInt3419 = (this.anInt927 * 1350888253 + client.anInt3414) * 1672441741;
		Class143_Sub35.anInt2272 = client.anInt3449 * -114919765;
		Class488.anInt5047 = client.anInt3421 * -1803007125;
		Class394.anInt4600 = client.anInt3460 * -1592469857;
		Class405.anInt4704 = client.anInt3422 * -631650605;
		client.anInt3449 = (this.anInt926 * -1324717509 >>> 24) * 1504160899;
		client.anInt3421 = (-1324717509 * this.anInt926 >>> 16 & 0xFF) * -1213142739;
		client.anInt3460 = (this.anInt926 * -1324717509 >>> 8 & 0xFF) * 1236159619;
		client.anInt3422 = (this.anInt926 * -1324717509 & 0xFF) * 994848893;
	}

	@OriginalMember(owner = "client!afw", name = "s", descriptor = "(Lclient!aks;I)Lclient!aks;", line = 27)
	public static Class77_Sub36 method7709(@OriginalArg(0) Class77_Sub36 arg0) {
		@Pc(2) Class77_Sub36[] local2 = Class77_Sub36.aClass77_Sub36Array1;
		synchronized (Class77_Sub36.aClass77_Sub36Array1) {
			if (Class77_Sub36.anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0);
			} else {
				Class77_Sub36.aClass77_Sub36Array1[(Class77_Sub36.anInt1775 -= 1809361789) * 2450901].method14442(arg0);
				return Class77_Sub36.aClass77_Sub36Array1[Class77_Sub36.anInt1775 * 2450901];
			}
		}
	}
}
