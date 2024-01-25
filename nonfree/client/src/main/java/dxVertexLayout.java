import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class119 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hda;[Lclient!gaa;)V")
	public dxVertexLayout(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class127[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aKs1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class127 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method2653(); local27++) {
				@Pc(41) Class73 local41 = local25.method2658(local27);
				if (Static102.aClass73_1 == local41) {
					local7.addElement(local11, 2, 0, 0, 0, local21);
				} else if (local41 == Static102.aClass73_2) {
					local7.addElement(local11, 2, 0, 3, 0, local21);
				} else if (Static102.aClass73_3 == local41) {
					local7.addElement(local11, 4, 0, 10, 0, local21);
				} else if (Static102.aClass73_4 == local41) {
					local7.addElement(local11, 0, 0, 5, local9++, local21);
				} else if (Static102.aClass73_5 == local41) {
					local7.addElement(local11, 1, 0, 5, local9++, local21);
				} else if (local41 == Static102.aClass73_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local21);
				} else if (Static102.aClass73_7 == local41) {
					local7.addElement(local11, 3, 0, 5, local9++, local21);
				}
				local21 += local41.anInt1768;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
