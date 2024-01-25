import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class129 implements Interface5 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[Lclient!tm;")
	public Class352[] aClass352Array3;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!ih;")
	public Class172[] aClass172Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!dea;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass352Array3 = arg2.aClass352Array1;
		this.aClass172Array3 = arg2.aClass172Array1;
		@Pc(24) int local24 = arg2.aClass352Array1 == null ? 0 : arg2.aClass352Array1.length;
		@Pc(34) int local34 = arg2.aClass172Array1 == null ? 0 : arg2.aClass172Array1.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass352Array3[local45].anInt9767;
			local43[local36++] = this.aClass352Array3[local45].anInt9765;
			local43[local36++] = this.aClass352Array3[local45].anInt9772;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass172Array3[local79].anInt4761;
		}
		@Pc(105) int local105 = arg2.aClass381Array1 == null ? 0 : arg2.aClass381Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class381 local120 = arg2.aClass381Array1[local114];
			@Pc(125) Class109 local125 = Static133.method2022(local120.anInt10711);
			local110[local112++] = local120.anInt10709;
			local110[local112++] = local125.anInt2368;
			local110[local112++] = local125.anInt2370;
			local110[local112++] = local125.anInt2374;
			local110[local112++] = local125.anInt2375;
			local110[local112++] = local125.anInt2373;
			local110[local112++] = local125.aBoolean162 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class381 local184 = arg2.aClass381Array1[local178];
			local110[local112++] = local184.anInt10714;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt1746, arg2.anInt1755, arg2.anIntArray93, arg2.anIntArray102, arg2.anIntArray99, arg2.anIntArray101, arg2.aShortArray28, arg2.anInt1750, arg2.aShortArray25, arg2.aShortArray27, arg2.aShortArray24, arg2.aByteArray28, arg2.aByteArray27, arg2.aByteArray29, arg2.aByteArray30, arg2.aShortArray21, arg2.aShortArray22, arg2.anIntArray100, arg2.aByte25, arg2.aShortArray23, arg2.anInt1757, arg2.aByteArray32, arg2.aShortArray29, arg2.aShortArray30, arg2.aShortArray26, arg2.anIntArray94, arg2.anIntArray103, arg2.anIntArray97, arg2.aByteArray31, arg2.aByteArray33, arg2.anIntArray95, arg2.anIntArray98, arg2.anIntArray96, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method5309() {
		if (this.anOa2.anInt7224 > 1) {
			synchronized (this) {
				super.aBoolean417 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class14_Sub2_Sub5 ba(@OriginalArg(0) Class14_Sub2_Sub5 arg0);

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!rd;ZII)Z")
	@Override
	public boolean method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6390().method4(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rd;Lclient!aba;II)V")
	@Override
	public void method5289(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6390().method6(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static424.anIntArray384[5] = 0;
		this.anOa2.method6390().method6(this, arg0, Static424.anIntArray384, arg2, arg3);
		arg1.anInt28 = Static424.anIntArray384[0];
		arg1.anInt29 = Static424.anIntArray384[1];
		arg1.anInt31 = Static424.anIntArray384[2];
		arg1.anInt32 = Static424.anIntArray384[3];
		arg1.anInt30 = Static424.anIntArray384[4];
		arg1.aBoolean3 = Static424.anIntArray384[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5303(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class129 method5288(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6390().method14(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method5293() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!ih;")
	@Override
	public Class172[] method5310() {
		return this.aClass172Array3;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	@Override
	protected void method5292() {
		if (this.anOa2.anInt7224 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean417) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean417 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rd;IZ)V")
	@Override
	public void method5305(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.A(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()[B")
	@Override
	public byte[] method5295() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!tm;")
	@Override
	public Class352[] method5304() {
		return this.aClass352Array3;
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static567.method8139(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!rd;ZI)Z")
	@Override
	public boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6390().method7(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method5300() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rd;Lclient!aba;I)V")
	@Override
	public void method5307(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6390().method5(this, arg0, (int[]) null, arg2);
			return;
		}
		Static424.anIntArray384[5] = 0;
		this.anOa2.method6390().method5(this, arg0, Static424.anIntArray384, arg2);
		arg1.anInt28 = Static424.anIntArray384[0];
		arg1.anInt29 = Static424.anIntArray384[1];
		arg1.anInt31 = Static424.anIntArray384[2];
		arg1.anInt32 = Static424.anIntArray384[3];
		arg1.anInt30 = Static424.anIntArray384[4];
		arg1.aBoolean3 = Static424.anIntArray384[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5299(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6390().method1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!rd;)V")
	private void method4034(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class263 arg1) {
		this.anOa2.method6390().method2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method5294(@OriginalArg(0) Class263 arg0) {
		this.method4034(Static424.anIntArray381, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass352Array3 != null) {
			for (local10 = 0; local10 < this.aClass352Array3.length; local10++) {
				@Pc(16) Class352 local16 = this.aClass352Array3[local10];
				local16.anInt9774 = Static424.anIntArray381[local5++];
				local16.anInt9769 = Static424.anIntArray381[local5++];
				local16.anInt9776 = Static424.anIntArray381[local5++];
				local16.anInt9780 = Static424.anIntArray381[local5++];
				local16.anInt9778 = Static424.anIntArray381[local5++];
				local16.anInt9775 = Static424.anIntArray381[local5++];
				local16.anInt9766 = Static424.anIntArray381[local5++];
				local16.anInt9768 = Static424.anIntArray381[local5++];
				local16.anInt9777 = Static424.anIntArray381[local5++];
			}
		}
		if (this.aClass172Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass172Array3.length; local10++) {
			@Pc(89) Class172 local89 = this.aClass172Array3[local10];
			@Pc(91) Class172 local91 = local89;
			if (local89.aClass172_2 != null) {
				local91 = local89.aClass172_2;
			}
			if (local89.aClass263_3 == null) {
				local89.aClass263_3 = arg0.method8434();
			} else {
				local89.aClass263_3.method8437(arg0);
			}
			local91.anInt4763 = Static424.anIntArray381[local5++];
			local91.anInt4756 = Static424.anIntArray381[local5++];
			local91.anInt4758 = Static424.anIntArray381[local5++];
		}
	}
}
