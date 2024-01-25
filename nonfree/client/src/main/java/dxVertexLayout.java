import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class270 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!bea;[Lclient!dia;)V")
	public dxVertexLayout(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class63[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aJaa1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class63 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method2424(); local23++) {
				@Pc(33) Class183 local33 = local21.method2423(local23);
				if (Static315.aClass183_1 == local33) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (local33 == Static315.aClass183_2) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (local33 == Static315.aClass183_3) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (local33 == Static315.aClass183_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (local33 == Static315.aClass183_5) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (local33 == Static315.aClass183_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (local33 == Static315.aClass183_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local33.anInt6309;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
