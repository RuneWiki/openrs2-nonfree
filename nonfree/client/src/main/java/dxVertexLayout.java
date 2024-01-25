import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class167 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!lj;[Lclient!pfa;)V")
	public dxVertexLayout(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class280[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aMk1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class280 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method7302() > local27; local27++) {
				@Pc(41) Class354 local41 = local25.method7303(local27);
				if (local41 == Static591.aClass354_1) {
					local7.addElement(local11, 2, 0, 0, 0, local21);
				} else if (Static591.aClass354_2 == local41) {
					local7.addElement(local11, 2, 0, 3, 0, local21);
				} else if (Static591.aClass354_3 == local41) {
					local7.addElement(local11, 4, 0, 10, 0, local21);
				} else if (local41 == Static591.aClass354_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local21);
				} else if (local41 == Static591.aClass354_5) {
					local7.addElement(local11, 1, 0, 5, local9++, local21);
				} else if (Static591.aClass354_6 == local41) {
					local7.addElement(local11, 2, 0, 5, local9++, local21);
				} else if (local41 == Static591.aClass354_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local21);
				}
				local21 += local41.anInt10300;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
