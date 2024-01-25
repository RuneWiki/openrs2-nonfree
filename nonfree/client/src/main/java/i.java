import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class157 implements Interface4 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!hl;")
	public Class156[] aClass156Array2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!sw;")
	public Class348[] aClass348Array2;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!iq;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass156Array2 = arg2.aClass156Array4;
		this.aClass348Array2 = arg2.aClass348Array4;
		@Pc(24) int local24 = arg2.aClass156Array4 == null ? 0 : arg2.aClass156Array4.length;
		@Pc(34) int local34 = arg2.aClass348Array4 == null ? 0 : arg2.aClass348Array4.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass156Array2[local45].anInt4597;
			local43[local36++] = this.aClass156Array2[local45].anInt4586;
			local43[local36++] = this.aClass156Array2[local45].anInt4588;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass348Array2[local79].anInt9766;
		}
		@Pc(105) int local105 = arg2.aClass74Array1 == null ? 0 : arg2.aClass74Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class74 local120 = arg2.aClass74Array1[local114];
			@Pc(125) Class64 local125 = Static421.method6218(local120.anInt2326);
			local110[local112++] = local120.anInt2328;
			local110[local112++] = local125.anInt1651;
			local110[local112++] = local125.anInt1657;
			local110[local112++] = local125.anInt1656;
			local110[local112++] = local125.anInt1654;
			local110[local112++] = local125.anInt1652;
			local110[local112++] = local125.aBoolean131 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class74 local184 = arg2.aClass74Array1[local178];
			local110[local112++] = local184.anInt2330;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt5138, arg2.anInt5129, arg2.anIntArray298, arg2.anIntArray304, arg2.anIntArray302, arg2.anIntArray303, arg2.aShortArray98, arg2.anInt5135, arg2.aShortArray96, arg2.aShortArray95, arg2.aShortArray92, arg2.aByteArray36, arg2.aByteArray40, arg2.aByteArray42, arg2.aByteArray37, arg2.aShortArray100, arg2.aShortArray101, arg2.anIntArray299, arg2.aByte86, arg2.aShortArray97, arg2.anInt5134, arg2.aByteArray41, arg2.aShortArray93, arg2.aShortArray94, arg2.aShortArray99, arg2.anIntArray294, arg2.anIntArray301, arg2.anIntArray295, arg2.aByteArray38, arg2.aByteArray39, arg2.anIntArray297, arg2.anIntArray296, arg2.anIntArray300, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class3_Sub4_Sub13 ba(@OriginalArg(0) Class3_Sub4_Sub13 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5231(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6531().method5(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	public void method5225() {
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class157 method5211(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6531().method15(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method5219() {
		if (this.anOa2.anInt7703 > 1) {
			synchronized (this) {
				super.aBoolean485 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()Z")
	@Override
	public boolean method5224() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lclient!hl;")
	@Override
	public Class156[] method5214() {
		return this.aClass156Array2;
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!iu;IZ)V")
	@Override
	public void method5220(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.J(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lclient!sw;")
	@Override
	public Class348[] method5222() {
		return this.aClass348Array2;
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class313 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5216() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5210(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method5226(@OriginalArg(0) Class181 arg0) {
		this.method4056(Static444.anIntArray415, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass156Array2 != null) {
			for (local10 = 0; local10 < this.aClass156Array2.length; local10++) {
				@Pc(16) Class156 local16 = this.aClass156Array2[local10];
				local16.anInt4584 = Static444.anIntArray415[local5++];
				local16.anInt4592 = Static444.anIntArray415[local5++];
				local16.anInt4595 = Static444.anIntArray415[local5++];
				local16.anInt4596 = Static444.anIntArray415[local5++];
				local16.anInt4599 = Static444.anIntArray415[local5++];
				local16.anInt4598 = Static444.anIntArray415[local5++];
				local16.anInt4590 = Static444.anIntArray415[local5++];
				local16.anInt4594 = Static444.anIntArray415[local5++];
				local16.anInt4587 = Static444.anIntArray415[local5++];
			}
		}
		if (this.aClass348Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass348Array2.length; local10++) {
			@Pc(89) Class348 local89 = this.aClass348Array2[local10];
			@Pc(91) Class348 local91 = local89;
			if (local89.aClass348_2 != null) {
				local91 = local89.aClass348_2;
			}
			if (local89.aClass181_13 == null) {
				local89.aClass181_13 = arg0.method6350();
			} else {
				local89.aClass181_13.method6355(arg0);
			}
			local91.anInt9765 = Static444.anIntArray415[local5++];
			local91.anInt9763 = Static444.anIntArray415[local5++];
			local91.anInt9768 = Static444.anIntArray415[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!iu;)V")
	private void method4056(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class181 arg1) {
		this.anOa2.method6531().method1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!iu;ZII)Z")
	@Override
	public boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6531().method7(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!iu;ZI)Z")
	@Override
	public boolean method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6531().method16(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!iu;Lclient!laa;II)V")
	@Override
	public void method5227(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6531().method13(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static444.anIntArray413[5] = 0;
		this.anOa2.method6531().method13(this, arg0, Static444.anIntArray413, arg2, arg3);
		arg1.anInt5947 = Static444.anIntArray413[0];
		arg1.anInt5948 = Static444.anIntArray413[1];
		arg1.anInt5950 = Static444.anIntArray413[2];
		arg1.anInt5946 = Static444.anIntArray413[3];
		arg1.anInt5949 = Static444.anIntArray413[4];
		arg1.aBoolean477 = Static444.anIntArray413[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method5215() {
		if (this.anOa2.anInt7703 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean485) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean485 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!iu;Lclient!laa;I)V")
	@Override
	public void method5232(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6531().method11(this, arg0, (int[]) null, arg2);
			return;
		}
		Static444.anIntArray413[5] = 0;
		this.anOa2.method6531().method11(this, arg0, Static444.anIntArray413, arg2);
		arg1.anInt5947 = Static444.anIntArray413[0];
		arg1.anInt5948 = Static444.anIntArray413[1];
		arg1.anInt5950 = Static444.anIntArray413[2];
		arg1.anInt5946 = Static444.anIntArray413[3];
		arg1.anInt5949 = Static444.anIntArray413[4];
		arg1.aBoolean477 = Static444.anIntArray413[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static253.method3959(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);
}
